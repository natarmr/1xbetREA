package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class f4t0 implements g4t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8931a;
    public final int b;
    public final l4t0 c;

    public f4t0(int i, int i2, l4t0 l4t0Var) {
        this.f8931a = i;
        this.b = i2;
        this.c = l4t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4t0)) {
            return false;
        }
        f4t0 f4t0Var = (f4t0) obj;
        return this.f8931a == f4t0Var.f8931a && this.b == f4t0Var.b && this.c.equals(f4t0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f8931a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("WithScore(teamOneScore=", this.f8931a, ", teamTwoScore=", ", winner=", this.b);
        sbT.append(this.c);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
