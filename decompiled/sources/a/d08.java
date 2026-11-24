package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class d08 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5257a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public d08(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f5257a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public static d08 a(d08 d08Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = d08Var.f5257a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = d08Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = d08Var.c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = d08Var.d;
        }
        boolean z8 = z4;
        boolean z9 = (i & 16) != 0 ? d08Var.e : true;
        d08Var.getClass();
        return new d08(z5, z6, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d08)) {
            return false;
        }
        d08 d08Var = (d08) obj;
        return this.f5257a == d08Var.f5257a && this.b == d08Var.b && this.c == d08Var.c && this.d == d08Var.d && this.e == d08Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f5257a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("BigPigPoseState(isThrowPose=", ", isWaiting=", ", isSad=", this.f5257a, this.b);
        ua80.u(", isTurnChanging=", ", isGameFinished=", sbQ, this.c, this.d);
        return rw2.p(sbQ, this.e, Separators.RPAREN);
    }

    public /* synthetic */ d08() {
        this(false, false, false, false, false);
    }
}
