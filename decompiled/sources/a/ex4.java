package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ex4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f8559a;
    public final boolean b;
    public final boolean c;

    public ex4(double d, boolean z, boolean z2) {
        this.f8559a = d;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex4)) {
            return false;
        }
        ex4 ex4Var = (ex4) obj;
        return Double.compare(this.f8559a, ex4Var.f8559a) == 0 && this.b == ex4Var.b && this.c == ex4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Double.hashCode(this.f8559a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoBetParamsModel(autoBetCoef=");
        sb.append(this.f8559a);
        sb.append(", dropOnScoreChange=");
        sb.append(this.b);
        return f140.n(sb, ", fromLineToLive=", this.c, Separators.RPAREN);
    }
}
