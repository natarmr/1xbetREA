package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qzm implements tzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wzm f29585a;
    public final wzm b;
    public final String c;
    public final jwm d;
    public final jwm e;
    public final jwm f;
    public final boolean g;

    public qzm(wzm wzmVar, wzm wzmVar2, String str, jwm jwmVar, jwm jwmVar2, jwm jwmVar3, boolean z) {
        uso0 uso0Var = uso0.f36223a;
        str.getClass();
        this.f29585a = wzmVar;
        this.b = wzmVar2;
        this.c = str;
        this.d = jwmVar;
        this.e = jwmVar2;
        this.f = jwmVar3;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzm)) {
            return false;
        }
        qzm qzmVar = (qzm) obj;
        if (!this.f29585a.equals(qzmVar.f29585a) || !this.b.equals(qzmVar.b) || !Intrinsics.d(this.c, qzmVar.c) || !this.d.equals(qzmVar.d) || !this.e.equals(qzmVar.e) || !Intrinsics.d(this.f, qzmVar.f)) {
            return false;
        }
        uso0 uso0Var = uso0.f36223a;
        return this.g == qzmVar.g;
    }

    public final int hashCode() {
        int iD = b1j.d(this.e, b1j.d(this.d, ua80.b((this.b.hashCode() + (this.f29585a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
        jwm jwmVar = this.f;
        return Boolean.hashCode(this.g) + ((uso0.f36223a.hashCode() + ((iD + (jwmVar == null ? 0 : jwmVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        uso0 uso0Var = uso0.f36223a;
        StringBuilder sb = new StringBuilder("V2(firstOpponentModel=");
        sb.append(this.f29585a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", scoreTitle=");
        sb.append(this.c);
        sb.append(", infoLabelOne=");
        sb.append(this.d);
        sb.append(", infoLabelTwo=");
        b1j.A(sb, this.e, ", infoLabelThree=", this.f, ", tagWinVisibilityState=");
        sb.append(uso0Var);
        sb.append(", supportRtl=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
