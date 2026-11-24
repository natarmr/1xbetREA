package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v2v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e900 f36706a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public v2v0(e900 e900Var, long j, long j2, long j3, long j4) {
        this.f36706a = e900Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2v0)) {
            return false;
        }
        v2v0 v2v0Var = (v2v0) obj;
        if (!this.f36706a.equals(v2v0Var.f36706a)) {
            return false;
        }
        long j = v2v0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && h2t0.a(this.c, v2v0Var.c) && h2t0.a(this.d, v2v0Var.d) && h2t0.a(this.e, v2v0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f36706a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.e) + rw2.b(rw2.b(rw2.b(iHashCode, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        String strI2 = y3d.i(this.c);
        String strI3 = y3d.i(this.d);
        String strI4 = y3d.i(this.e);
        StringBuilder sb = new StringBuilder("WebGamesGameCollectionPictureColors(gradient=");
        sb.append(this.f36706a);
        sb.append(", placeholderBackgroundColor=");
        sb.append(strI);
        sb.append(", placeholderIconTintColor=");
        f140.v(sb, strI2, ", label=", strI3, ", labelRectangle=");
        return axq.n(sb, strI4, Separators.RPAREN);
    }
}
