package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pla implements tla {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzm f27173a;
    public final uzm b;
    public final mpm c;
    public final jwm d;
    public final jwm e;
    public final jwm f;

    public pla(uzm uzmVar, uzm uzmVar2, mpm mpmVar, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        this.f27173a = uzmVar;
        this.b = uzmVar2;
        this.c = mpmVar;
        this.d = jwmVar;
        this.e = jwmVar2;
        this.f = jwmVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pla)) {
            return false;
        }
        pla plaVar = (pla) obj;
        return this.f27173a.equals(plaVar.f27173a) && this.b.equals(plaVar.b) && this.c.equals(plaVar.c) && this.d.equals(plaVar.d) && this.e.equals(plaVar.e) && Intrinsics.d(this.f, plaVar.f);
    }

    public final int hashCode() {
        int iD = b1j.d(this.e, b1j.d(this.d, ohs0.e(this.c, (this.b.hashCode() + (this.f27173a.hashCode() * 31)) * 31, 31), 31), 31);
        jwm jwmVar = this.f;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiTeams(firstOpponentModel=");
        sb.append(this.f27173a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", infoLabelOne=");
        sb.append(this.d);
        sb.append(", infoLabelTwo=");
        return b1j.l(sb, this.e, ", infoLabelThree=", this.f, Separators.RPAREN);
    }
}
