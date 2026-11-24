package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class td4 implements me4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33747a;
    public final boolean b;

    public td4(int i, boolean z) {
        this.f33747a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td4)) {
            return false;
        }
        td4 td4Var = (td4) obj;
        return this.f33747a == td4Var.f33747a && this.b == td4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f33747a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f33747a, "OnAuthPickerPhoneCodeManuallyChose(countryId=", ", countryAllowed=", Separators.RPAREN, this.b);
    }
}
