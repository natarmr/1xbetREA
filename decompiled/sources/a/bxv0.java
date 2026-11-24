package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bxv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cxv0 f3395a;
    public final jtv0 b;
    public final lsv0 c;
    public final long d;
    public final boolean e;
    public final stv0 f;

    public bxv0(cxv0 cxv0Var, jtv0 jtv0Var, lsv0 lsv0Var, long j, boolean z, stv0 stv0Var) {
        this.f3395a = cxv0Var;
        this.b = jtv0Var;
        this.c = lsv0Var;
        this.d = j;
        this.e = z;
        this.f = stv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxv0)) {
            return false;
        }
        bxv0 bxv0Var = (bxv0) obj;
        if (!this.f3395a.equals(bxv0Var.f3395a) || !this.b.equals(bxv0Var.b) || !this.c.equals(bxv0Var.c)) {
            return false;
        }
        long j = bxv0Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && this.e == bxv0Var.e && this.f == bxv0Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f3395a.hashCode() * 31)) * 31)) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.f.hashCode() + brm0.e(rw2.b(iHashCode, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "XBottomSheetStyle(sheet=" + this.f3395a + ", dragHandle=" + this.b + ", backdrop=" + this.c + ", scrimColor=" + y3d.i(this.d) + ", isHorizontalSwipeEnabled=" + this.e + ", dragMode=" + this.f + Separators.RPAREN;
    }
}
