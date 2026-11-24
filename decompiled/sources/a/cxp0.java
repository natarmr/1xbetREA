package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cxp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ixp0 f5133a;
    public final long b;

    public cxp0(ixp0 ixp0Var, long j) {
        this.f5133a = ixp0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxp0)) {
            return false;
        }
        cxp0 cxp0Var = (cxp0) obj;
        if (!this.f5133a.equals(cxp0Var.f5133a)) {
            return false;
        }
        long j = cxp0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f5133a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return "Item(row=" + this.f5133a + ", backgroundColor=" + y3d.i(this.b) + Separators.RPAREN;
    }
}
