package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sz implements yz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33046a;

    public sz(int i) {
        this.f33046a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sz) && this.f33046a == ((sz) obj).f33046a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33046a);
    }

    public final String toString() {
        return ua80.e(this.f33046a, "ShowCountryPhonePrefixPickerDialog(selectedCountryId=", Separators.RPAREN);
    }
}
