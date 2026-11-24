package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jem implements nem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16381a;
    public final qil0 b;
    public final bhl0 c;

    public jem(long j, qil0 qil0Var, bhl0 bhl0Var) {
        this.f16381a = j;
        this.b = qil0Var;
        this.c = bhl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jem)) {
            return false;
        }
        jem jemVar = (jem) obj;
        return this.f16381a == jemVar.f16381a && this.b.equals(jemVar.b) && this.c.equals(jemVar.c);
    }

    public final int hashCode() {
        return this.c.f2614a.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f16381a) * 31)) * 31);
    }

    public final String toString() {
        return "AllMarkets(gameId=" + this.f16381a + ", style=" + this.b + ", content=" + this.c + Separators.RPAREN;
    }
}
