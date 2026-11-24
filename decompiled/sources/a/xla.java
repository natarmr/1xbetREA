package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xla implements zla {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yzm f41062a;
    public final yzm b;
    public final a2m c;
    public final String d;
    public final jwm e;
    public final jwm f;

    public xla(yzm yzmVar, yzm yzmVar2, a2m a2mVar, String str, jwm jwmVar, jwm jwmVar2) {
        uso0 uso0Var = uso0.f36223a;
        str.getClass();
        this.f41062a = yzmVar;
        this.b = yzmVar2;
        this.c = a2mVar;
        this.d = str;
        this.e = jwmVar;
        this.f = jwmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xla)) {
            return false;
        }
        xla xlaVar = (xla) obj;
        if (!this.f41062a.equals(xlaVar.f41062a) || !this.b.equals(xlaVar.b) || !this.c.equals(xlaVar.c) || !Intrinsics.d(this.d, xlaVar.d) || !this.e.equals(xlaVar.e) || !Intrinsics.d(this.f, xlaVar.f)) {
            return false;
        }
        uso0 uso0Var = uso0.f36223a;
        return true;
    }

    public final int hashCode() {
        int iD = b1j.d(this.e, ua80.b(rz4.a(this.c, (this.b.hashCode() + (this.f41062a.hashCode() * 31)) * 31, 31), 31, this.d), 31);
        jwm jwmVar = this.f;
        return uso0.f36223a.hashCode() + ((iD + (jwmVar == null ? 0 : jwmVar.hashCode())) * 31);
    }

    public final String toString() {
        uso0 uso0Var = uso0.f36223a;
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponentModel=");
        sb.append(this.f41062a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", customScoreModel=");
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
