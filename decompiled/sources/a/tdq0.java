package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tdq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33782a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public tdq0(int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.f33782a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdq0)) {
            return false;
        }
        tdq0 tdq0Var = (tdq0) obj;
        return this.f33782a == tdq0Var.f33782a && this.b == tdq0Var.b && this.c == tdq0Var.c && this.d == tdq0Var.d && this.e == tdq0Var.e && this.f == tdq0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(brm0.e(twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f33782a) * 31, 31), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("TieBreakModel(scoreOne=", this.f33782a, ", scoreTwo=", ", server=", this.b);
        brm0.w(this.c, ", isLostServer=", ", isSetPoint=", sbT, this.d);
        return ohs0.p(", isMatchPoint=", Separators.RPAREN, sbT, this.e, this.f);
    }
}
