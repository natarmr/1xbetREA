package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class k1g0 implements m1g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17521a;
    public final jwm b;
    public final jwm c;

    public k1g0(String str, jwm jwmVar, jwm jwmVar2) {
        this.f17521a = str;
        this.b = jwmVar;
        this.c = jwmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1g0)) {
            return false;
        }
        k1g0 k1g0Var = (k1g0) obj;
        return this.f17521a.equals(k1g0Var.f17521a) && this.b.equals(k1g0Var.b) && this.c.equals(k1g0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b1j.d(this.b, this.f17521a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "OneOpponent(opponentName=" + this.f17521a + ", oneLabelInfo=" + this.b + ", twoLabelInfo=" + this.c + Separators.RPAREN;
    }
}
