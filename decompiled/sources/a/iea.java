package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14622a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public iea(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.f14622a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iea)) {
            return false;
        }
        iea ieaVar = (iea) obj;
        return this.f14622a == ieaVar.f14622a && this.b == ieaVar.b && this.c == ieaVar.c && this.d == ieaVar.d && this.e == ieaVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e(twn.a(this.b, Integer.hashCode(this.f14622a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("CardCricketGameCardsInfoUiModel(batsmanCard=", this.f14622a, ", bowlerCard=", ", batsmanCardVisibility=", this.b);
        ua80.u(", bowlerCardVisibility=", ", gameIsFinish=", sbT, this.c, this.d);
        return rw2.p(sbT, this.e, Separators.RPAREN);
    }
}
