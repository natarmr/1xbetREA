package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gfm implements hfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11213a;
    public final long b;
    public final a4x c;

    public gfm(long j, long j2, a4x a4xVar) {
        zcl zclVar = qmk.f28987a;
        this.f11213a = j;
        this.b = j2;
        this.c = a4xVar;
    }

    @Override // a.ifm
    public final long a() {
        return this.b;
    }

    @Override // a.ifm
    public final float b() {
        return 6.0f;
    }

    @Override // a.ifm
    public final a4x c() {
        return this.c;
    }

    @Override // a.ifm
    public final long e() {
        return this.f11213a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfm)) {
            return false;
        }
        gfm gfmVar = (gfm) obj;
        return this.f11213a == gfmVar.f11213a && this.b == gfmVar.b && this.c.equals(gfmVar.c) && ycl.b(6.0f, 6.0f);
    }

    public final int hashCode() {
        return Float.hashCode(6.0f) + cs0.b(this.c, rw2.b(Long.hashCode(this.f11213a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        String strC = ycl.c(6.0f);
        StringBuilder sbQ = kng0.q(this.f11213a, "MarketV3(betGameId=", ", marketGroupId=");
        sbQ.append(this.b);
        sbQ.append(", marketList=");
        sbQ.append(this.c);
        return rw2.o(sbQ, ", marketsBottomPadding=", strC, Separators.RPAREN);
    }
}
