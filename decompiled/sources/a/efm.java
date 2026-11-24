package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class efm implements hfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7725a;
    public final long b;
    public final a4x c;

    public efm(long j, long j2, a4x a4xVar) {
        zcl zclVar = qmk.f28987a;
        this.f7725a = j;
        this.b = j2;
        this.c = a4xVar;
    }

    @Override // a.ifm
    public final long a() {
        return this.b;
    }

    @Override // a.ifm
    public final float b() {
        return 2.0f;
    }

    @Override // a.ifm
    public final a4x c() {
        return this.c;
    }

    @Override // a.ifm
    public final long e() {
        return this.f7725a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efm)) {
            return false;
        }
        efm efmVar = (efm) obj;
        return this.f7725a == efmVar.f7725a && this.b == efmVar.b && this.c.equals(efmVar.c) && ycl.b(2.0f, 2.0f);
    }

    public final int hashCode() {
        return Float.hashCode(2.0f) + cs0.b(this.c, rw2.b(Long.hashCode(this.f7725a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        String strC = ycl.c(2.0f);
        StringBuilder sbQ = kng0.q(this.f7725a, "MarketV1(betGameId=", ", marketGroupId=");
        sbQ.append(this.b);
        sbQ.append(", marketList=");
        sbQ.append(this.c);
        return rw2.o(sbQ, ", marketsBottomPadding=", strC, Separators.RPAREN);
    }
}
