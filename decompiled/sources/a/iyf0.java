package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iyf0 implements kyf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15587a;

    public iyf0(int i) {
        this.f15587a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iyf0) && this.f15587a == ((iyf0) obj).f15587a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15587a);
    }

    public final String toString() {
        return ua80.e(this.f15587a, "ShowCountryPhonePrefixPickerDialog(selectedCountryId=", Separators.RPAREN);
    }
}
