package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l1g0 implements m1g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vzm f19251a;
    public final vzm b;
    public final jwm c;
    public final jwm d;
    public final jwm e;

    public l1g0(vzm vzmVar, vzm vzmVar2, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        this.f19251a = vzmVar;
        this.b = vzmVar2;
        this.c = jwmVar;
        this.d = jwmVar2;
        this.e = jwmVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1g0)) {
            return false;
        }
        l1g0 l1g0Var = (l1g0) obj;
        return this.f19251a.equals(l1g0Var.f19251a) && this.b.equals(l1g0Var.b) && this.c.equals(l1g0Var.c) && this.d.equals(l1g0Var.d) && Intrinsics.d(this.e, l1g0Var.e);
    }

    public final int hashCode() {
        int iD = b1j.d(this.d, b1j.d(this.c, (this.b.hashCode() + (this.f19251a.hashCode() * 31)) * 31, 31), 31);
        jwm jwmVar = this.e;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponentModel=");
        sb.append(this.f19251a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", infoLabelOne=");
        b1j.A(sb, this.c, ", infoLabelTwo=", this.d, ", infoLabelThree=");
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
