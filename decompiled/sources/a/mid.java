package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mid implements uid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21840a;
    public final long b;
    public final long c;
    public final xgl0 d;

    public mid(long j, long j2, long j3, xgl0 xgl0Var) {
        this.f21840a = j;
        this.b = j2;
        this.c = j3;
        this.d = xgl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mid)) {
            return false;
        }
        mid midVar = (mid) obj;
        return this.f21840a == midVar.f21840a && this.b == midVar.b && this.c == midVar.c && this.d.equals(midVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b(rw2.b(Long.hashCode(this.f21840a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f21840a, "OnBetBtnLongClick(gameId=", ", betGameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", betGroupId=", this.c, ", coefParams=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
