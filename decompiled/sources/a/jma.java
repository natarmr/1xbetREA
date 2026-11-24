package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jma implements lma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wzm f16754a;
    public final wzm b;
    public final String c;
    public final jwm d;
    public final jwm e;
    public final jwm f;

    public jma(wzm wzmVar, wzm wzmVar2, String str, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        uso0 uso0Var = uso0.f36223a;
        str.getClass();
        this.f16754a = wzmVar;
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
        if (!(obj instanceof jma)) {
            return false;
        }
        jma jmaVar = (jma) obj;
        if (!this.f16754a.equals(jmaVar.f16754a) || !this.b.equals(jmaVar.b) || !Intrinsics.d(this.c, jmaVar.c) || !this.d.equals(jmaVar.d) || !this.e.equals(jmaVar.e) || !Intrinsics.d(this.f, jmaVar.f)) {
            return false;
        }
        uso0 uso0Var = uso0.f36223a;
        return true;
    }

    public final int hashCode() {
        int iD = b1j.d(this.e, b1j.d(this.d, ua80.b((this.b.hashCode() + (this.f16754a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
        jwm jwmVar = this.f;
        return uso0.f36223a.hashCode() + ((iD + (jwmVar == null ? 0 : jwmVar.hashCode())) * 31);
    }

    public final String toString() {
        uso0 uso0Var = uso0.f36223a;
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponentModel=");
        sb.append(this.f16754a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", scoreTitle=");
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
