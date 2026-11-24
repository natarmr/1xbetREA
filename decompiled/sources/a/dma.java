package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dma implements fma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xzm f6313a;
    public final xzm b;
    public final a2m c;
    public final jwm d;
    public final jwm e;

    public dma(xzm xzmVar, xzm xzmVar2, a2m a2mVar, jwm jwmVar, jwm jwmVar2) {
        uso0 uso0Var = uso0.f36223a;
        this.f6313a = xzmVar;
        this.b = xzmVar2;
        this.c = a2mVar;
        this.d = jwmVar;
        this.e = jwmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dma)) {
            return false;
        }
        dma dmaVar = (dma) obj;
        if (!this.f6313a.equals(dmaVar.f6313a) || !this.b.equals(dmaVar.b) || !this.c.equals(dmaVar.c) || !this.d.equals(dmaVar.d) || !Intrinsics.d(this.e, dmaVar.e)) {
            return false;
        }
        uso0 uso0Var = uso0.f36223a;
        return true;
    }

    public final int hashCode() {
        int iD = b1j.d(this.d, rz4.a(this.c, (this.b.hashCode() + (this.f6313a.hashCode() * 31)) * 31, 31), 31);
        jwm jwmVar = this.e;
        return uso0.f36223a.hashCode() + ((iD + (jwmVar == null ? 0 : jwmVar.hashCode())) * 31);
    }

    public final String toString() {
        return "TwoOpponents(firstOpponentModel=" + this.f6313a + ", secondOpponentModel=" + this.b + ", customScoreModel=" + this.c + ", infoLabelTwo=" + this.d + ", infoLabelThree=" + this.e + ", tagWinVisibilityState=" + uso0.f36223a + Separators.RPAREN;
    }
}
