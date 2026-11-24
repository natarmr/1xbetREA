package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class y0g0 implements a1g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41803a;
    public final jwm b;
    public final jwm c;

    public y0g0(String str, jwm jwmVar, jwm jwmVar2) {
        this.f41803a = str;
        this.b = jwmVar;
        this.c = jwmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0g0)) {
            return false;
        }
        y0g0 y0g0Var = (y0g0) obj;
        return this.f41803a.equals(y0g0Var.f41803a) && this.b.equals(y0g0Var.b) && this.c.equals(y0g0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b1j.d(this.b, this.f41803a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "OneOpponent(opponentName=" + this.f41803a + ", oneLabelInfo=" + this.b + ", twoLabelInfo=" + this.c + Separators.RPAREN;
    }
}
