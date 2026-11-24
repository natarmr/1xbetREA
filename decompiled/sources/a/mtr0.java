package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mtr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22383a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public mtr0(String str, String str2, boolean z, boolean z2) {
        this.f22383a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public static mtr0 a(mtr0 mtr0Var, String str, String str2, boolean z, int i) {
        if ((i & 1) != 0) {
            str = mtr0Var.f22383a;
        }
        if ((i & 2) != 0) {
            str2 = mtr0Var.b;
        }
        boolean z2 = mtr0Var.c;
        if ((i & 8) != 0) {
            z = mtr0Var.d;
        }
        mtr0Var.getClass();
        str.getClass();
        return new mtr0(str, str2, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtr0)) {
            return false;
        }
        mtr0 mtr0Var = (mtr0) obj;
        return this.f22383a.equals(mtr0Var.f22383a) && this.b.equals(mtr0Var.b) && this.c == mtr0Var.c && this.d == mtr0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f22383a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", isClearOutcomesButtonEnabled=", Separators.RPAREN, b1j.n("TotoNavigationBarState(preTitle=", this.f22383a, ", title=", this.b, ", isTypeDataAvailable="), this.c, this.d);
    }
}
