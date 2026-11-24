package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f1g0 implements g1g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xzm f8763a;
    public final xzm b;
    public final a2m c;
    public final jwm d;
    public final jwm e;
    public final jwm f;

    public f1g0(xzm xzmVar, xzm xzmVar2, a2m a2mVar, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        this.f8763a = xzmVar;
        this.b = xzmVar2;
        this.c = a2mVar;
        this.d = jwmVar;
        this.e = jwmVar2;
        this.f = jwmVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1g0)) {
            return false;
        }
        f1g0 f1g0Var = (f1g0) obj;
        return this.f8763a.equals(f1g0Var.f8763a) && this.b.equals(f1g0Var.b) && this.c.equals(f1g0Var.c) && this.d.equals(f1g0Var.d) && this.e.equals(f1g0Var.e) && Intrinsics.d(this.f, f1g0Var.f);
    }

    public final int hashCode() {
        int iD = b1j.d(this.e, b1j.d(this.d, rz4.a(this.c, (this.b.hashCode() + (this.f8763a.hashCode() * 31)) * 31, 31), 31), 31);
        jwm jwmVar = this.f;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponentModel=");
        sb.append(this.f8763a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", customScoreModel=");
        sb.append(this.c);
        sb.append(", infoLabelOne=");
        sb.append(this.d);
        sb.append(", infoLabelTwo=");
        return b1j.l(sb, this.e, ", infoLabelThree=", this.f, Separators.RPAREN);
    }
}
