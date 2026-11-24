package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tdm implements bem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33775a;
    public final long b;
    public final long c;
    public final wgl0 d;

    public tdm(long j, long j2, long j3, wgl0 wgl0Var) {
        this.f33775a = j;
        this.b = j2;
        this.c = j3;
        this.d = wgl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdm)) {
            return false;
        }
        tdm tdmVar = (tdm) obj;
        return this.f33775a == tdmVar.f33775a && this.b == tdmVar.b && this.c == tdmVar.c && this.d.equals(tdmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b(rw2.b(Long.hashCode(this.f33775a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f33775a, "OnMarketClicked(gameId=", ", betGameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", groupId=", this.c, ", marketClickType=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
