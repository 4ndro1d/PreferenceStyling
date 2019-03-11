package android.preferences.styling

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class PreferencesFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.placeholder)
        addPreferencesFromResource(R.xml.app_prefs)
        addPreferencesFromResource(R.xml.placeholder)
    }
}