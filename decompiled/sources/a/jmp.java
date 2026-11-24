package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jmp implements smp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16776a;
    public final long b;
    public final long c;
    public final xgl0 d;

    public jmp(long j, long j2, long j3, xgl0 xgl0Var) {
        this.f16776a = j;
        this.b = j2;
        this.c = j3;
        this.d = xgl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmp)) {
            return false;
        }
        jmp jmpVar = (jmp) obj;
        return this.f16776a == jmpVar.f16776a && this.b == jmpVar.b && this.c == jmpVar.c && this.d.equals(jmpVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b(rw2.b(Long.hashCode(this.f16776a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f16776a, "OnMarketLongClicked(gameId=", ", betGameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", groupId=", this.c, ", coefParams=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
