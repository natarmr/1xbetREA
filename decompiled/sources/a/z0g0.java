package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z0g0 implements a1g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzm f43564a;
    public final uzm b;
    public final mpm c;
    public final jwm d;
    public final jwm e;
    public final jwm f;

    public z0g0(uzm uzmVar, uzm uzmVar2, mpm mpmVar, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        this.f43564a = uzmVar;
        this.b = uzmVar2;
        this.c = mpmVar;
        this.d = jwmVar;
        this.e = jwmVar2;
        this.f = jwmVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0g0)) {
            return false;
        }
        z0g0 z0g0Var = (z0g0) obj;
        return this.f43564a.equals(z0g0Var.f43564a) && this.b.equals(z0g0Var.b) && this.c.equals(z0g0Var.c) && this.d.equals(z0g0Var.d) && this.e.equals(z0g0Var.e) && Intrinsics.d(this.f, z0g0Var.f);
    }

    public final int hashCode() {
        int iD = b1j.d(this.e, b1j.d(this.d, ohs0.e(this.c, (this.b.hashCode() + (this.f43564a.hashCode() * 31)) * 31, 31), 31), 31);
        jwm jwmVar = this.f;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponentModel=");
        sb.append(this.f43564a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", infoLabelOne=");
        sb.append(this.d);
        sb.append(", infoLabelTwo=");
        return b1j.l(sb, this.e, ", infoLabelThree=", this.f, Separators.RPAREN);
    }
}
