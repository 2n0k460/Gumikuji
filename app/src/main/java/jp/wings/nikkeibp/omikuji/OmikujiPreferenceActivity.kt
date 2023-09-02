package jp.wings.nikkeibp.omikuji

import androidx.appcompat.app.AppCompatActivity

class OmikujiPreferenceActivity: AppCompatActivity() {
    override fun onContentChanged() {
        super.onContentChanged()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(android.R.id.content, OmikujiPrefenceFragment())
        fragmentTransaction.commit()
    }
}