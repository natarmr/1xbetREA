package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class szm implements tzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yzm f33076a;
    public final yzm b;
    public final a2m c;
    public final String d;
    public final jwm e;
    public final jwm f;
    public final boolean g;

    public szm(yzm yzmVar, yzm yzmVar2, a2m a2mVar, String str, jwm jwmVar, jwm jwmVar2, boolean z) {
        uso0 uso0Var = uso0.f36223a;
        str.getClass();
        this.f33076a = yzmVar;
        this.b = yzmVar2;
        this.c = a2mVar;
        this.d = str;
        this.e = jwmVar;
        this.f = jwmVar2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szm)) {
            return false;
        }
        szm szmVar = (szm) obj;
        if (!this.f33076a.equals(szmVar.f33076a) || !this.b.equals(szmVar.b) || !this.c.equals(szmVar.c) || !Intrinsics.d(this.d, szmVar.d) || !this.e.equals(szmVar.e) || !Intrinsics.d(this.f, szmVar.f) || this.g != szmVar.g) {
            return false;
        }
        uso0 uso0Var = uso0.f36223a;
        return true;
    }

    public final int hashCode() {
        int iD = b1j.d(this.e, ua80.b(rz4.a(this.c, (this.b.hashCode() + (this.f33076a.hashCode() * 31)) * 31, 31), 31, this.d), 31);
        jwm jwmVar = this.f;
        return uso0.f36223a.hashCode() + brm0.e((iD + (jwmVar == null ? 0 : jwmVar.hashCode())) * 31, 31, this.g);
    }

    public final String toString() {
        uso0 uso0Var = uso0.f36223a;
        StringBuilder sb = new StringBuilder("V4(firstOpponentModel=");
        sb.append(this.f33076a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", customScoreModel=");
        sb.append(this.c);
        sb.append(", topInfoLabel=");
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
