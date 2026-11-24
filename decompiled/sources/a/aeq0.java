package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class aeq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lgq0 f742a;
    public final double b;
    public final int c;
    public final int d;

    public aeq0(lgq0 lgq0Var, double d, int i, int i2) {
        this.f742a = lgq0Var;
        this.b = d;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeq0)) {
            return false;
        }
        aeq0 aeq0Var = (aeq0) obj;
        return this.f742a == aeq0Var.f742a && Double.compare(this.b, aeq0Var.b) == 0 && this.c == aeq0Var.c && this.d == aeq0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, brm0.d(this.b, this.f742a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TileMatchingCoeffInfoModel(type=");
        sb.append(this.f742a);
        sb.append(", coeffInfo=");
        sb.append(this.b);
        rw2.s(this.c, this.d, ", progressCount=", ", maxProgressCount=", sb);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
