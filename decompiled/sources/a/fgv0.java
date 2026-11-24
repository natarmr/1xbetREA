package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fgv0 implements ggv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9513a;
    public final imm b;
    public final mdm c;

    public fgv0(long j, imm immVar, mdm mdmVar) {
        this.f9513a = j;
        this.b = immVar;
        this.c = mdmVar;
    }

    @Override // a.ggv0
    public final imm a() {
        return this.b;
    }

    @Override // a.ggv0
    public final long c() {
        return this.f9513a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgv0)) {
            return false;
        }
        fgv0 fgv0Var = (fgv0) obj;
        long j = fgv0Var.f9513a;
        int i = y3d.h;
        return h2t0.a(this.f9513a, j) && this.b.equals(fgv0Var.b) && this.c.equals(fgv0Var.c);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.c.hashCode() + h97.a(this.b, Long.hashCode(this.f9513a) * 31, 31);
    }

    public final String toString() {
        String strI = y3d.i(this.f9513a);
        StringBuilder sb = new StringBuilder("Error(backgroundColor=");
        sb.append(strI);
        sb.append(", toolbarUiModel=");
        sb.append(this.b);
        sb.append(", errorConfig=");
        return cs0.m(sb, this.c, Separators.RPAREN);
    }
}
