package a;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class atz implements tsb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static atz f1454a;

    public static b860 a(long j) {
        if (j == 0) {
            return b860.c;
        }
        if (j == 1) {
            return b860.d;
        }
        if (j == 2) {
            return b860.e;
        }
        return j == 3 ? b860.b : b860.f;
    }

    @Override // a.tsb0
    public CharSequence e(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return listPreference.f45395a.getString(R.string.not_set);
        }
        return null;
    }
}
