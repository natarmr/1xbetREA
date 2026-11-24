package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lid implements uid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20098a;
    public final long b;
    public final long c;
    public final wgl0 d;

    public lid(long j, long j2, long j3, wgl0 wgl0Var) {
        this.f20098a = j;
        this.b = j2;
        this.c = j3;
        this.d = wgl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lid)) {
            return false;
        }
        lid lidVar = (lid) obj;
        return this.f20098a == lidVar.f20098a && this.b == lidVar.b && this.c == lidVar.c && this.d.equals(lidVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b(rw2.b(Long.hashCode(this.f20098a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f20098a, "OnBetBtnClick(gameId=", ", betGameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", betGroupId=", this.c, ", marketClickType=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
