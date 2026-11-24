package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rla implements tla {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzm f30686a;
    public final uzm b;
    public final mpm c;
    public final jwm d;
    public final jwm e;
    public final jwm f;

    public rla(uzm uzmVar, uzm uzmVar2, mpm mpmVar, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        uso0 uso0Var = uso0.f36223a;
        this.f30686a = uzmVar;
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
        if (!(obj instanceof rla)) {
            return false;
        }
        rla rlaVar = (rla) obj;
        if (!this.f30686a.equals(rlaVar.f30686a) || !this.b.equals(rlaVar.b) || !this.c.equals(rlaVar.c) || !this.d.equals(rlaVar.d) || !this.e.equals(rlaVar.e) || !Intrinsics.d(this.f, rlaVar.f)) {
            return false;
        }
        uso0 uso0Var = uso0.f36223a;
        return true;
    }

    public final int hashCode() {
        int iD = b1j.d(this.e, b1j.d(this.d, ohs0.e(this.c, (this.b.hashCode() + (this.f30686a.hashCode() * 31)) * 31, 31), 31), 31);
        jwm jwmVar = this.f;
        return uso0.f36223a.hashCode() + ((iD + (jwmVar == null ? 0 : jwmVar.hashCode())) * 31);
    }

    public final String toString() {
        uso0 uso0Var = uso0.f36223a;
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponentModel=");
        sb.append(this.f30686a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", infoLabelOne=");
        sb.append(this.d);
        sb.append(", infoLabelTwo=");
        b1j.A(sb, this.e, ", infoLabelThree=", this.f, ", tagWinVisibilityState=");
        sb.append(uso0Var);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
