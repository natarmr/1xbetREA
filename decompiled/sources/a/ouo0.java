package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ouo0 implements suo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f25886a;
    public final String b;
    public final int c;

    public ouo0(double d, int i, String str) {
        this.f25886a = d;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouo0)) {
            return false;
        }
        ouo0 ouo0Var = (ouo0) obj;
        return Double.compare(this.f25886a, ouo0Var.f25886a) == 0 && this.b.equals(ouo0Var.b) && this.c == ouo0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(Double.hashCode(this.f25886a) * 31, 31, this.b);
    }

    public final String toString() {
        return vqd.p(vqd.s("Bonus(amount=", this.f25886a, ", currency=", this.b), ", wager=", this.c, Separators.RPAREN);
    }
}
