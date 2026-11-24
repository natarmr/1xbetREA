package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ozm implements tzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzm f26107a;
    public final uzm b;
    public final mpm c;
    public final jwm d;
    public final jwm e;
    public final jwm f;
    public final boolean g;

    public ozm(uzm uzmVar, uzm uzmVar2, mpm mpmVar, jwm jwmVar, jwm jwmVar2, jwm jwmVar3, boolean z) {
        uso0 uso0Var = uso0.f36223a;
        this.f26107a = uzmVar;
        this.b = uzmVar2;
        this.c = mpmVar;
        this.d = jwmVar;
        this.e = jwmVar2;
        this.f = jwmVar3;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozm)) {
            return false;
        }
        ozm ozmVar = (ozm) obj;
        if (!this.f26107a.equals(ozmVar.f26107a) || !this.b.equals(ozmVar.b) || !this.c.equals(ozmVar.c) || !this.d.equals(ozmVar.d) || !this.e.equals(ozmVar.e) || !Intrinsics.d(this.f, ozmVar.f) || this.g != ozmVar.g) {
            return false;
        }
        uso0 uso0Var = uso0.f36223a;
        return true;
    }

    public final int hashCode() {
        int iD = b1j.d(this.e, b1j.d(this.d, ohs0.e(this.c, (this.b.hashCode() + (this.f26107a.hashCode() * 31)) * 31, 31), 31), 31);
        jwm jwmVar = this.f;
        return uso0.f36223a.hashCode() + brm0.e((iD + (jwmVar == null ? 0 : jwmVar.hashCode())) * 31, 31, this.g);
    }

    public final String toString() {
        uso0 uso0Var = uso0.f36223a;
        StringBuilder sb = new StringBuilder("Default(firstOpponentModel=");
        sb.append(this.f26107a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", scoreModel=");
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
