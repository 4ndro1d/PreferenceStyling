package android.preferences.styling

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.preference.PreferenceFragmentCompat

class PreferencesFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.placeholder)
        addPreferencesFromResource(R.xml.app_prefs)
        addPreferencesFromResource(R.xml.placeholder)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        super.onCreateView(inflater, container, savedInstanceState)?.apply {
            setBackgroundColor(resources.getColor(R.color.preferences_background))
        }
}