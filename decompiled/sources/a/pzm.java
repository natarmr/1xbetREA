package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pzm implements tzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vzm f27853a;
    public final vzm b;
    public final jwm c;
    public final jwm d;
    public final jwm e;
    public final boolean f;

    public pzm(vzm vzmVar, vzm vzmVar2, jwm jwmVar, jwm jwmVar2, jwm jwmVar3, boolean z) {
        uso0 uso0Var = uso0.f36223a;
        this.f27853a = vzmVar;
        this.b = vzmVar2;
        this.c = jwmVar;
        this.d = jwmVar2;
        this.e = jwmVar3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzm)) {
            return false;
        }
        pzm pzmVar = (pzm) obj;
        if (!this.f27853a.equals(pzmVar.f27853a) || !this.b.equals(pzmVar.b) || !this.c.equals(pzmVar.c) || !this.d.equals(pzmVar.d) || !Intrinsics.d(this.e, pzmVar.e)) {
            return false;
        }
        uso0 uso0Var = uso0.f36223a;
        return this.f == pzmVar.f;
    }

    public final int hashCode() {
        int iD = b1j.d(this.d, b1j.d(this.c, (this.b.hashCode() + (this.f27853a.hashCode() * 31)) * 31, 31), 31);
        jwm jwmVar = this.e;
        return Boolean.hashCode(this.f) + ((uso0.f36223a.hashCode() + ((iD + (jwmVar == null ? 0 : jwmVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        uso0 uso0Var = uso0.f36223a;
        StringBuilder sb = new StringBuilder("V1(firstOpponentModel=");
        sb.append(this.f27853a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", infoLabelOne=");
        b1j.A(sb, this.c, ", infoLabelTwo=", this.d, ", infoLabelThree=");
        sb.append(this.e);
        sb.append(", tagWinVisibilityState=");
        sb.append(uso0Var);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.f, Separators.RPAREN);
    }
}
