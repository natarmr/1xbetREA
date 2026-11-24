package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class l780 implements p780 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19546a;
    public final boolean b;

    public l780(int i, boolean z) {
        this.f19546a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l780)) {
            return false;
        }
        l780 l780Var = (l780) obj;
        return this.f19546a == l780Var.f19546a && this.b == l780Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f19546a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f19546a, "OnPickerPhoneCodeManuallyChose(countryId=", ", isCountryAllowed=", Separators.RPAREN, this.b);
    }
}
