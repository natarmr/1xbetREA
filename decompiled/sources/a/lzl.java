package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lzl implements mzl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20911a;
    public final long b;
    public final long c;
    public final xgl0 d;

    public lzl(long j, long j2, long j3, xgl0 xgl0Var) {
        this.f20911a = j;
        this.b = j2;
        this.c = j3;
        this.d = xgl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzl)) {
            return false;
        }
        lzl lzlVar = (lzl) obj;
        return this.f20911a == lzlVar.f20911a && this.b == lzlVar.b && this.c == lzlVar.c && this.d.equals(lzlVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b(rw2.b(Long.hashCode(this.f20911a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f20911a, "OnMarketLongClicked(gameId=", ", betGameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", groupId=", this.c, ", coefParams=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
