package jp.wings.nikkeibp.omikuji

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import jp.wings.nikkeibp.omikuji.databinding.OmikujiBinding

class OmikujiActivity : AppCompatActivity() {

    val omikujiBox = OmikujiBox()

    lateinit var binding: OmikujiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = OmikujiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        omikujiBox.omikujiView = binding.imageView

/*
        // くじ番号の取得
        val rnd = Random()
        val number = rnd.nextInt(20)
        // おみくじ棚の準備
        val gumikujiShelf = Array<String>(20) {"吉"}
        gumikujiShelf[0] = "大吉"
        gumikujiShelf[19] = "凶"

        // おみくじ棚から取得
        val str = gumikujiShelf[number]

        binding.hellowView.text = str
*/
    }

    fun onButtonClick(v:View){
        omikujiBox.shake()
    /*
        val translate = TranslateAnimation(0f, 0f, 0f, -200f)
        translate.repeatMode = Animation.REVERSE
        translate.repeatCount = 5
        translate.duration = 100

        val rotate = RotateAnimation(0f, -36f,
                        binding.imageView.width/2f, binding.imageView.height/2f)
        rotate.duration = 200

        val set = AnimationSet(true)
        set.addAnimation(rotate)
        set.addAnimation(translate)

        binding.imageView.startAnimation(set)
*/
    //    binding.imageView.setImageResource(R.drawable.result1)
    }
}