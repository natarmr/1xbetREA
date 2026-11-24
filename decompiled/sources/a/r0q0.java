package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r0q0 implements v0q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0q0 f29643a;
    public final int b;
    public final long c;

    public r0q0(q0q0 q0q0Var, int i, long j) {
        this.f29643a = q0q0Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0q0)) {
            return false;
        }
        r0q0 r0q0Var = (r0q0) obj;
        if (!this.f29643a.equals(r0q0Var.f29643a) || this.b != r0q0Var.b) {
            return false;
        }
        long j = r0q0Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, this.f29643a.hashCode() * 31, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + iA;
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        StringBuilder sb = new StringBuilder("Content(tennisWinLossUiModel=");
        sb.append(this.f29643a);
        sb.append(", filterIconResId=");
        sb.append(this.b);
        sb.append(", filterIconColor=");
        return axq.n(sb, strI, Separators.RPAREN);
    }
}
