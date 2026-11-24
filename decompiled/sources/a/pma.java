package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pma implements rma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vzm f27221a;
    public final vzm b;
    public final jwm c;
    public final jwm d;
    public final jwm e;

    public pma(vzm vzmVar, vzm vzmVar2, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        uso0 uso0Var = uso0.f36223a;
        this.f27221a = vzmVar;
        this.b = vzmVar2;
        this.c = jwmVar;
        this.d = jwmVar2;
        this.e = jwmVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pma)) {
            return false;
        }
        pma pmaVar = (pma) obj;
        if (!this.f27221a.equals(pmaVar.f27221a) || !this.b.equals(pmaVar.b) || !this.c.equals(pmaVar.c) || !this.d.equals(pmaVar.d) || !Intrinsics.d(this.e, pmaVar.e)) {
            return false;
        }
        uso0 uso0Var = uso0.f36223a;
        return true;
    }

    public final int hashCode() {
        int iD = b1j.d(this.d, b1j.d(this.c, (this.b.hashCode() + (this.f27221a.hashCode() * 31)) * 31, 31), 31);
        jwm jwmVar = this.e;
        return uso0.f36223a.hashCode() + ((iD + (jwmVar == null ? 0 : jwmVar.hashCode())) * 31);
    }

    public final String toString() {
        uso0 uso0Var = uso0.f36223a;
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponentModel=");
        sb.append(this.f27221a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", infoLabelOne=");
        b1j.A(sb, this.c, ", infoLabelTwo=", this.d, ", infoLabelThree=");
        sb.append(this.e);
        sb.append(", tagWinVisibilityState=");
        sb.append(uso0Var);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
