package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dve0 implements hwe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6740a;
    public final boolean b;

    public dve0(int i, boolean z) {
        this.f6740a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dve0)) {
            return false;
        }
        dve0 dve0Var = (dve0) obj;
        return this.f6740a == dve0Var.f6740a && this.b == dve0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f6740a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f6740a, "OnAuthPickerPhoneCodeManuallyClick(countryId=", ", countryAllowed=", Separators.RPAREN, this.b);
    }
}
