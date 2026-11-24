package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class uh4 implements ni4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35658a;
    public final boolean b;

    public uh4(int i, boolean z) {
        this.f35658a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh4)) {
            return false;
        }
        uh4 uh4Var = (uh4) obj;
        return this.f35658a == uh4Var.f35658a && this.b == uh4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f35658a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f35658a, "OnAuthPickerPhoneCodeManuallyChose(countryId=", ", countryAllowed=", Separators.RPAREN, this.b);
    }
}
