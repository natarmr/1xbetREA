package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xil0 implements bjl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40951a;
    public final n4n b;
    public final djl0 c;
    public final ynm d;

    public xil0(long j, n4n n4nVar, djl0 djl0Var, ynm ynmVar) {
        this.f40951a = j;
        this.b = n4nVar;
        this.c = djl0Var;
        this.d = ynmVar;
    }

    @Override // a.bjl0
    public final long a() {
        return this.f40951a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xil0)) {
            return false;
        }
        xil0 xil0Var = (xil0) obj;
        return this.f40951a == xil0Var.f40951a && this.b.equals(xil0Var.b) && this.c.equals(xil0Var.c) && this.d.equals(xil0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f40951a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardLargeTeamLogo(gameId=" + this.f40951a + ", topBlock=" + this.b + ", middleBlock=" + this.c + ", bottomBlock=" + this.d + Separators.RPAREN;
    }
}
