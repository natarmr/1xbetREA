package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class z3g0 implements b4g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43716a;
    public final boolean b;
    public final x4g0 c;

    public z3g0(boolean z, boolean z2, x4g0 x4g0Var) {
        this.f43716a = z;
        this.b = z2;
        this.c = x4g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3g0)) {
            return false;
        }
        z3g0 z3g0Var = (z3g0) obj;
        return this.f43716a == z3g0Var.f43716a && this.b == z3g0Var.b && this.c.equals(z3g0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Boolean.hashCode(this.f43716a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("SearchResult(refresh=", ", supportRtl=", ", resultState=", this.f43716a, this.b);
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
