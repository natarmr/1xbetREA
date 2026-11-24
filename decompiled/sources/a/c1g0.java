package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c1g0 implements d1g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yzm f3569a;
    public final yzm b;
    public final a2m c;
    public final String d;
    public final jwm e;
    public final jwm f;

    public c1g0(yzm yzmVar, yzm yzmVar2, a2m a2mVar, String str, jwm jwmVar, jwm jwmVar2) {
        str.getClass();
        this.f3569a = yzmVar;
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
        if (!(obj instanceof c1g0)) {
            return false;
        }
        c1g0 c1g0Var = (c1g0) obj;
        return this.f3569a.equals(c1g0Var.f3569a) && this.b.equals(c1g0Var.b) && this.c.equals(c1g0Var.c) && Intrinsics.d(this.d, c1g0Var.d) && this.e.equals(c1g0Var.e) && Intrinsics.d(this.f, c1g0Var.f);
    }

    public final int hashCode() {
        int iD = b1j.d(this.e, ua80.b(rz4.a(this.c, (this.b.hashCode() + (this.f3569a.hashCode() * 31)) * 31, 31), 31, this.d), 31);
        jwm jwmVar = this.f;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponentModel=");
        sb.append(this.f3569a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", customScoreModel=");
        sb.append(this.c);
        sb.append(", infoLabelOne=");
        sb.append(this.d);
        sb.append(", infoLabelTwo=");
        return b1j.l(sb, this.e, ", infoLabelThree=", this.f, Separators.RPAREN);
    }
}
