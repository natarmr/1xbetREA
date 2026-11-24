package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i1g0 implements j1g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wzm f13997a;
    public final wzm b;
    public final String c;
    public final jwm d;
    public final jwm e;
    public final jwm f;

    public i1g0(wzm wzmVar, wzm wzmVar2, String str, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        str.getClass();
        this.f13997a = wzmVar;
        this.b = wzmVar2;
        this.c = str;
        this.d = jwmVar;
        this.e = jwmVar2;
        this.f = jwmVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1g0)) {
            return false;
        }
        i1g0 i1g0Var = (i1g0) obj;
        return this.f13997a.equals(i1g0Var.f13997a) && this.b.equals(i1g0Var.b) && Intrinsics.d(this.c, i1g0Var.c) && this.d.equals(i1g0Var.d) && this.e.equals(i1g0Var.e) && Intrinsics.d(this.f, i1g0Var.f);
    }

    public final int hashCode() {
        int iD = b1j.d(this.e, b1j.d(this.d, ua80.b((this.b.hashCode() + (this.f13997a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
        jwm jwmVar = this.f;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponentModel=");
        sb.append(this.f13997a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", scoreTitle=");
        sb.append(this.c);
        sb.append(", infoLabelOne=");
        sb.append(this.d);
        sb.append(", infoLabelTwo=");
        return b1j.l(sb, this.e, ", infoLabelThree=", this.f, Separators.RPAREN);
    }
}
