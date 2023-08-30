package jp.wings.nikkeibp.omikuji

import java.util.*

class GumikujiBox() {
    val number : Int // くじ番号
    get() {
        val rnd = Random()
        return rnd.nextInt(20)
    }
}