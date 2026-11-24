package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class voa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37757a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public voa0(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f37757a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voa0)) {
            return false;
        }
        voa0 voa0Var = (voa0) obj;
        return this.f37757a.equals(voa0Var.f37757a) && this.b == voa0Var.b && this.c == voa0Var.c && this.d == voa0Var.d && this.e == voa0Var.e && this.f == voa0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(brm0.e(brm0.e(brm0.e(this.f37757a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("PointUiModel(score=", this.f37757a, ", isBreakPoint=", this.b, ", isSetPoint=");
        ua80.u(", isMatchPoint=", ", isDarts140=", sbU, this.c, this.d);
        return ohs0.p(", isDarts180=", Separators.RPAREN, sbU, this.e, this.f);
    }
}
