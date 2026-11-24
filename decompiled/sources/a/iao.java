package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iao implements kao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14447a;
    public final long b;
    public final double c;
    public final long d;
    public final uoy e;
    public final long f;
    public final chl0 g;

    public iao(int i, long j, double d, long j2, uoy uoyVar, long j3, chl0 chl0Var) {
        this.f14447a = i;
        this.b = j;
        this.c = d;
        this.d = j2;
        this.e = uoyVar;
        this.f = j3;
        this.g = chl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iao)) {
            return false;
        }
        iao iaoVar = (iao) obj;
        return this.f14447a == iaoVar.f14447a && this.b == iaoVar.b && Double.compare(this.c, iaoVar.c) == 0 && this.d == iaoVar.d && this.e == iaoVar.e && this.f == iaoVar.f && this.g.equals(iaoVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + rw2.b(twn.d(this.e, rw2.b(brm0.d(this.c, rw2.b(Integer.hashCode(this.f14447a) * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f14447a, this.b, "Common(id=", ", marketTypeId=");
        ohs0.A(sbQ, this.c, ", param=", ", marketGroupId=");
        sbQ.append(this.d);
        sbQ.append(", kind=");
        sbQ.append(this.e);
        kng0.A(sbQ, ", gameId=", this.f, ", sportMarketDsModel=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
