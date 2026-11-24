package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sla implements tla {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1n f32389a;
    public final w1n b;
    public final t1n c;
    public final jwm d;
    public final jwm e;
    public final jwm f;

    public sla(w1n w1nVar, w1n w1nVar2, t1n t1nVar, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        this.f32389a = w1nVar;
        this.b = w1nVar2;
        this.c = t1nVar;
        this.d = jwmVar;
        this.e = jwmVar2;
        this.f = jwmVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sla)) {
            return false;
        }
        sla slaVar = (sla) obj;
        return this.f32389a.equals(slaVar.f32389a) && this.b.equals(slaVar.b) && this.c.equals(slaVar.c) && this.d.equals(slaVar.d) && this.e.equals(slaVar.e) && Intrinsics.d(this.f, slaVar.f);
    }

    public final int hashCode() {
        int iD = b1j.d(this.e, b1j.d(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f32389a.hashCode() * 31)) * 31)) * 31, 31), 31);
        jwm jwmVar = this.f;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoPairs(teamOne=");
        sb.append(this.f32389a);
        sb.append(", teamTwo=");
        sb.append(this.b);
        sb.append(", score=");
        sb.append(this.c);
        sb.append(", infoOne=");
        sb.append(this.d);
        sb.append(", infoTwo=");
        return b1j.l(sb, this.e, ", infoThree=", this.f, Separators.RPAREN);
    }
}
