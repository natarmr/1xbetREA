package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rzm implements tzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xzm f31368a;
    public final xzm b;
    public final a2m c;
    public final jwm d;
    public final jwm e;
    public final jwm f;
    public final boolean g;

    public rzm(xzm xzmVar, xzm xzmVar2, a2m a2mVar, jwm jwmVar, jwm jwmVar2, jwm jwmVar3, boolean z) {
        uso0 uso0Var = uso0.f36223a;
        this.f31368a = xzmVar;
        this.b = xzmVar2;
        this.c = a2mVar;
        this.d = jwmVar;
        this.e = jwmVar2;
        this.f = jwmVar3;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzm)) {
            return false;
        }
        rzm rzmVar = (rzm) obj;
        if (!this.f31368a.equals(rzmVar.f31368a) || !this.b.equals(rzmVar.b) || !this.c.equals(rzmVar.c) || !this.d.equals(rzmVar.d) || !this.e.equals(rzmVar.e) || !Intrinsics.d(this.f, rzmVar.f) || this.g != rzmVar.g) {
            return false;
        }
        uso0 uso0Var = uso0.f36223a;
        return true;
    }

    public final int hashCode() {
        int iD = b1j.d(this.e, b1j.d(this.d, rz4.a(this.c, (this.b.hashCode() + (this.f31368a.hashCode() * 31)) * 31, 31), 31), 31);
        jwm jwmVar = this.f;
        return uso0.f36223a.hashCode() + brm0.e((iD + (jwmVar == null ? 0 : jwmVar.hashCode())) * 31, 31, this.g);
    }

    public final String toString() {
        uso0 uso0Var = uso0.f36223a;
        StringBuilder sb = new StringBuilder("V3(firstOpponentModel=");
        sb.append(this.f31368a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", customScoreModel=");
        sb.append(this.c);
        sb.append(", infoLabelOne=");
        sb.append(this.d);
        sb.append(", infoLabelTwo=");
        b1j.A(sb, this.e, ", infoLabelThree=", this.f, ", supportRtl=");
        sb.append(this.g);
        sb.append(", tagWinVisibilityState=");
        sb.append(uso0Var);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
