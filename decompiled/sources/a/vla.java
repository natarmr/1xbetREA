package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vla implements zla {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1n f37612a;
    public final w1n b;
    public final v1n c;
    public final jwm d;
    public final jwm e;
    public final jwm f;

    public vla(w1n w1nVar, w1n w1nVar2, v1n v1nVar, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        this.f37612a = w1nVar;
        this.b = w1nVar2;
        this.c = v1nVar;
        this.d = jwmVar;
        this.e = jwmVar2;
        this.f = jwmVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vla)) {
            return false;
        }
        vla vlaVar = (vla) obj;
        return this.f37612a.equals(vlaVar.f37612a) && this.b.equals(vlaVar.b) && this.c.equals(vlaVar.c) && this.d.equals(vlaVar.d) && this.e.equals(vlaVar.e) && Intrinsics.d(this.f, vlaVar.f);
    }

    public final int hashCode() {
        int iD = b1j.d(this.e, b1j.d(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f37612a.hashCode() * 31)) * 31)) * 31, 31), 31);
        jwm jwmVar = this.f;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiTeams(teamOne=");
        sb.append(this.f37612a);
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
