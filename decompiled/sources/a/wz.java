package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wz implements yz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39998a;

    public wz(int i) {
        this.f39998a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wz) && this.f39998a == ((wz) obj).f39998a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39998a);
    }

    public final String toString() {
        return ua80.e(this.f39998a, "ShowRegistrationChoiceItemDialog(selectedCountryId=", Separators.RPAREN);
    }
}
