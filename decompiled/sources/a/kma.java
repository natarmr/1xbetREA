package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kma implements lma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wzm f18529a;
    public final wzm b;
    public final String c;
    public final jwm d;
    public final jwm e;
    public final jwm f;

    public kma(wzm wzmVar, wzm wzmVar2, String str, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        str.getClass();
        this.f18529a = wzmVar;
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
        if (!(obj instanceof kma)) {
            return false;
        }
        kma kmaVar = (kma) obj;
        return this.f18529a.equals(kmaVar.f18529a) && this.b.equals(kmaVar.b) && Intrinsics.d(this.c, kmaVar.c) && this.d.equals(kmaVar.d) && this.e.equals(kmaVar.e) && Intrinsics.d(this.f, kmaVar.f);
    }

    public final int hashCode() {
        int iD = b1j.d(this.e, b1j.d(this.d, ua80.b((this.b.hashCode() + (this.f18529a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
        jwm jwmVar = this.f;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoPairs(firstOpponentModel=");
        sb.append(this.f18529a);
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
