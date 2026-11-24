package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class imp implements smp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15037a;
    public final long b;
    public final long c;
    public final wgl0 d;

    public imp(long j, long j2, long j3, wgl0 wgl0Var) {
        this.f15037a = j;
        this.b = j2;
        this.c = j3;
        this.d = wgl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imp)) {
            return false;
        }
        imp impVar = (imp) obj;
        return this.f15037a == impVar.f15037a && this.b == impVar.b && this.c == impVar.c && this.d.equals(impVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b(rw2.b(Long.hashCode(this.f15037a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f15037a, "OnMarketClicked(gameId=", ", betGameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", groupId=", this.c, ", marketClickType=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
