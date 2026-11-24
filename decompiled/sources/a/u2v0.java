package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class u2v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e900 f34965a;
    public final long b;
    public final long c;
    public final long d;

    public u2v0(e900 e900Var, long j, long j2, long j3) {
        this.f34965a = e900Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2v0)) {
            return false;
        }
        u2v0 u2v0Var = (u2v0) obj;
        if (!this.f34965a.equals(u2v0Var.f34965a)) {
            return false;
        }
        long j = u2v0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && h2t0.a(this.c, u2v0Var.c) && h2t0.a(this.d, u2v0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f34965a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + rw2.b(rw2.b(iHashCode, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        String strI2 = y3d.i(this.c);
        String strI3 = y3d.i(this.d);
        StringBuilder sb = new StringBuilder("WebGamesGameCollectionActionColors(container=");
        sb.append(this.f34965a);
        sb.append(", iconTint=");
        sb.append(strI);
        sb.append(", label=");
        return ua80.m(sb, strI2, ", labelRectangle=", strI3, Separators.RPAREN);
    }
}
