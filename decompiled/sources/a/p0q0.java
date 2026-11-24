package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p0q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26166a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final rgv0 e;

    public p0q0(boolean z, boolean z2, boolean z3, boolean z4, rgv0 rgv0Var) {
        rgv0Var.getClass();
        this.f26166a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = rgv0Var;
    }

    public static p0q0 a(p0q0 p0q0Var, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            z2 = p0q0Var.b;
        }
        boolean z3 = z2;
        boolean z4 = (i & 4) != 0 ? p0q0Var.c : true;
        boolean z5 = p0q0Var.d;
        rgv0 rgv0Var = p0q0Var.e;
        p0q0Var.getClass();
        rgv0Var.getClass();
        return new p0q0(z, z3, z4, z5, rgv0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0q0)) {
            return false;
        }
        p0q0 p0q0Var = (p0q0) obj;
        return this.f26166a == p0q0Var.f26166a && this.b == p0q0Var.b && this.c == p0q0Var.c && this.d == p0q0Var.d && Intrinsics.d(this.e, p0q0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f26166a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("TennisWinLossState(isLoading=", ", isError=", ", isEmpty=", this.f26166a, this.b);
        ua80.u(", isFilterActive=", ", winLossModel=", sbQ, this.c, this.d);
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
