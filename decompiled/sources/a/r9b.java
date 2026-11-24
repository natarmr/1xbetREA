package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r9b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30071a;
    public final int b;
    public final int c;
    public final int d;
    public final double e;
    public final double f;

    public r9b(long j, int i, int i2, int i3, double d, double d2) {
        this.f30071a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = d;
        this.f = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9b)) {
            return false;
        }
        r9b r9bVar = (r9b) obj;
        return this.f30071a == r9bVar.f30071a && this.b == r9bVar.b && this.c == r9bVar.c && this.d == r9bVar.d && Double.compare(this.e, r9bVar.e) == 0 && Double.compare(this.f, r9bVar.f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f) + brm0.d(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, Long.hashCode(this.f30071a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f30071a, "CellInfoModel(bonusIdCell=", ", idCell=");
        rw2.s(this.c, this.d, ", informationCell=", ", cellType=", sbQ);
        ohs0.A(sbQ, this.e, ", winCoef=", ", currentWinSumm=");
        return axq.l(sbQ, this.f, Separators.RPAREN);
    }
}
