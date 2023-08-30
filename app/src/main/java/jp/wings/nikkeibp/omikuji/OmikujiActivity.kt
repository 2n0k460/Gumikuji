package jp.wings.nikkeibp.omikuji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.wings.nikkeibp.omikuji.databinding.MainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = MainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // 文字を表示する
        var str = "大吉"
        val rnd = Random()
        val number = rnd.nextInt(3)
        if (number == 0) {
            str = "吉"
        }
        else if (number == 1) {
            str = "凶"
        }
        binding.hellowView.text = str
    }
}