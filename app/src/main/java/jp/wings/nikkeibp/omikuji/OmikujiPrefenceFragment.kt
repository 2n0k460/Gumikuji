package jp.wings.nikkeibp.omikuji

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class OmikujiPrefenceFragment: PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.preference)
    }
}