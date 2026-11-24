package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hma implements lma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wzm f13296a;
    public final wzm b;
    public final String c;
    public final jwm d;
    public final jwm e;
    public final jwm f;

    public hma(wzm wzmVar, wzm wzmVar2, String str, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        str.getClass();
        this.f13296a = wzmVar;
        this.b = wzmVar2;
        this.c = str;
        this.d = jwmVar;
        this.e = jwmVar2;
        this.f = jwmVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hma)) {
            return false;
        }
        hma hmaVar = (hma) obj;
        return this.f13296a.equals(hmaVar.f13296a) && this.b.equals(hmaVar.b) && Intrinsics.d(this.c, hmaVar.c) && this.d.equals(hmaVar.d) && this.e.equals(hmaVar.e) && Intrinsics.d(this.f, hmaVar.f);
    }

    public final int hashCode() {
        int iD = b1j.d(this.e, b1j.d(this.d, ua80.b((this.b.hashCode() + (this.f13296a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
        jwm jwmVar = this.f;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiTeams(firstOpponentModel=");
        sb.append(this.f13296a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", scoreTitle=");
        sb.append(this.c);
        sb.append(", infoLabelOne=");
        sb.append(this.d);
        sb.append(", infoLabelTwo=");
        return b1j.l(sb, this.e, ", infoLabelThree=", this.f, Separators.RPAREN);
    }
}
