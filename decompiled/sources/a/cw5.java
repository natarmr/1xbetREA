package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cw5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5065a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final lel e;
    public final long f;

    public cw5(boolean z, boolean z2, boolean z3, boolean z4, lel lelVar, long j) {
        this.f5065a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lelVar;
        this.f = j;
    }

    public static cw5 a(cw5 cw5Var, boolean z, boolean z2, boolean z3, lel lelVar, long j, int i) {
        if ((i & 1) != 0) {
            z = cw5Var.f5065a;
        }
        boolean z4 = z;
        boolean z5 = (i & 2) != 0 ? cw5Var.b : false;
        if ((i & 4) != 0) {
            z2 = cw5Var.c;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = cw5Var.d;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            lelVar = cw5Var.e;
        }
        lel lelVar2 = lelVar;
        if ((i & 32) != 0) {
            j = cw5Var.f;
        }
        cw5Var.getClass();
        return new cw5(z4, z5, z6, z7, lelVar2, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw5)) {
            return false;
        }
        cw5 cw5Var = (cw5) obj;
        if (this.f5065a != cw5Var.f5065a || this.b != cw5Var.b || this.c != cw5Var.c || this.d != cw5Var.d || !this.e.equals(cw5Var.e)) {
            return false;
        }
        long j = cw5Var.f;
        int i = y3d.h;
        return h2t0.a(this.f, j);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f5065a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f) + iHashCode;
    }

    public final String toString() {
        String strI = y3d.i(this.f);
        StringBuilder sbQ = f140.q("ScreenParameters(applyImePadding=", ", applyNavigationBarsPadding=", ", dragHandleVisible=", this.f5065a, this.b);
        ua80.u(", overlayBackground=", ", dragHandleStyle=", sbQ, this.c, this.d);
        sbQ.append(this.e);
        sbQ.append(", backgroundColor=");
        sbQ.append(strI);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
