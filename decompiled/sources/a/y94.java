package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class y94 implements pa4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42226a;
    public final boolean b;

    public y94(int i, boolean z) {
        this.f42226a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y94)) {
            return false;
        }
        y94 y94Var = (y94) obj;
        return this.f42226a == y94Var.f42226a && this.b == y94Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f42226a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f42226a, "OnAuthPickerPhoneCodeManuallyChose(countryId=", ", countryAllowed=", Separators.RPAREN, this.b);
    }
}
