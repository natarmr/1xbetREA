package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class moa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22126a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public moa0(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f22126a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof moa0)) {
            return false;
        }
        moa0 moa0Var = (moa0) obj;
        return this.f22126a.equals(moa0Var.f22126a) && this.b.equals(moa0Var.b) && this.c == moa0Var.c && this.d == moa0Var.d && this.e == moa0Var.e && this.f == moa0Var.f && this.g == moa0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(this.f22126a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PointModel(scoreOne=", this.f22126a, ", scoreTwo=", this.b, ", isBreakPoint=");
        ua80.u(", isSetPoint=", ", isMatchPoint=", sbN, this.c, this.d);
        ua80.u(", isDarts140=", ", isDarts180=", sbN, this.e, this.f);
        return rw2.p(sbN, this.g, Separators.RPAREN);
    }
}
