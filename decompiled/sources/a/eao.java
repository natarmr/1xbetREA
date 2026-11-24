package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class eao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7476a;
    public final long b;
    public final double c;
    public final boolean d;
    public final long e;
    public final uoy f;
    public final chl0 g;
    public final long h;
    public final qil0 i;

    public eao(int i, long j, double d, boolean z, long j2, uoy uoyVar, chl0 chl0Var, long j3, qil0 qil0Var) {
        this.f7476a = i;
        this.b = j;
        this.c = d;
        this.d = z;
        this.e = j2;
        this.f = uoyVar;
        this.g = chl0Var;
        this.h = j3;
        this.i = qil0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eao)) {
            return false;
        }
        eao eaoVar = (eao) obj;
        return this.f7476a == eaoVar.f7476a && this.b == eaoVar.b && Double.compare(this.c, eaoVar.c) == 0 && this.d == eaoVar.d && this.e == eaoVar.e && this.f == eaoVar.f && this.g.equals(eaoVar.g) && this.h == eaoVar.h && this.i.equals(eaoVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + rw2.b((this.g.hashCode() + twn.d(this.f, rw2.b(brm0.e(brm0.d(this.c, rw2.b(Integer.hashCode(this.f7476a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f7476a, this.b, "EventBetAccuracyUiModel(id=", ", marketTypeId=");
        ohs0.A(sbQ, this.c, ", param=", ", marketPinned=");
        rw2.v(this.e, ", marketGroupId=", sbQ, this.d);
        sbQ.append(", kind=");
        sbQ.append(this.f);
        sbQ.append(", sportMarketDsModel=");
        sbQ.append(this.g);
        kng0.A(sbQ, ", gameId=", this.h, ", style=");
        sbQ.append(this.i);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
