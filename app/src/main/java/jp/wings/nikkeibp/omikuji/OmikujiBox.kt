package jp.wings.nikkeibp.omikuji

import android.hardware.SensorEvent
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.RotateAnimation
import android.view.animation.TranslateAnimation
import android.widget.ImageView
import java.util.*

class OmikujiBox: Animation.AnimationListener {

    var beforeTime = 0L
    var beforeValue = 0F

    lateinit var omikujiView: ImageView
    var finish = false // 箱から出たか？
    val number : Int // くじ番号
    get() {
        val rnd = Random()
        return rnd.nextInt(20)
    }

    fun chkShake(event: SensorEvent?): Boolean{

        var nowtime = System.currentTimeMillis()
        var difftime: Long = nowtime - beforeTime
        var nowvalue: Float = (event?.values?.get(0) ?: 0F) + (event?.values?.get(1) ?: 0F)

        if (1500 < difftime) {

            // 前回の値との差からのスピードを計算
            val speed = Math.abs(nowvalue - beforeValue) / difftime * 10000
            beforeTime = nowtime
            beforeValue = nowvalue

            // 50を超えるスピードでシェイクしたとみなす
            if(50 < speed) {
                return true
            }
        }
        return false
    }

    fun shake () {
        val translate = TranslateAnimation(0f, 0f, 0f, -200f)
        translate.repeatMode = Animation.REVERSE
        translate.repeatCount = 5
        translate.duration = 100

        val rotate = RotateAnimation(0f, -36f,
            omikujiView.width/2f, omikujiView.height/2f)
        rotate.duration = 200

        val set = AnimationSet(true)
        set.addAnimation(rotate)
        set.addAnimation(translate)

        set.setAnimationListener(this)

        omikujiView.startAnimation(set)
    }

    override fun onAnimationStart(p0: Animation?) {
    }

    override fun onAnimationEnd(p0: Animation?) {
        omikujiView.setImageResource(R.drawable.omikuji2)
        finish = true
    }

    override fun onAnimationRepeat(p0: Animation?) {
    }
}