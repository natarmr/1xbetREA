package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n8m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23097a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final ene f;

    public n8m(long j, long j2, long j3, long j4, long j5, ene eneVar) {
        this.f23097a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = eneVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8m)) {
            return false;
        }
        n8m n8mVar = (n8m) obj;
        long j = n8mVar.f23097a;
        int i = y3d.h;
        return h2t0.a(this.f23097a, j) && h2t0.a(this.b, n8mVar.b) && h2t0.a(this.c, n8mVar.c) && h2t0.a(this.d, n8mVar.d) && h2t0.a(this.e, n8mVar.e) && this.f.equals(n8mVar.f);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.f.hashCode() + rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f23097a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        String strI = y3d.i(this.f23097a);
        String strI2 = y3d.i(this.b);
        String strI3 = y3d.i(this.c);
        String strI4 = y3d.i(this.d);
        String strI5 = y3d.i(this.e);
        StringBuilder sbN = b1j.n("DsCyberLeaderBoardCellParams(backgroundColor=", strI, ", borderColor=", strI2, ", positionLabelColor=");
        f140.v(sbN, strI3, ", participantLabelColor=", strI4, ", valueLabelColor=");
        sbN.append(strI5);
        sbN.append(", cellCornerSize=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
