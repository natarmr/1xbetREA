package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class e1g0 implements g1g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7034a;
    public final jwm b;
    public final jwm c;

    public e1g0(String str, jwm jwmVar, jwm jwmVar2) {
        this.f7034a = str;
        this.b = jwmVar;
        this.c = jwmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1g0)) {
            return false;
        }
        e1g0 e1g0Var = (e1g0) obj;
        return this.f7034a.equals(e1g0Var.f7034a) && this.b.equals(e1g0Var.b) && this.c.equals(e1g0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b1j.d(this.b, this.f7034a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "OneOpponent(opponentName=" + this.f7034a + ", twoLabelInfo=" + this.b + ", threeLabelInfo=" + this.c + Separators.RPAREN;
    }
}
