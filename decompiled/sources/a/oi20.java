package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class oi20 implements ri20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f25291a;
    public final double b;
    public final l0d c;
    public final int d;

    public oi20(double d, double d2, l0d l0dVar, int i) {
        this.f25291a = d;
        this.b = d2;
        this.c = l0dVar;
        this.d = i;
    }

    @Override // a.ri20
    public final double a() {
        return this.f25291a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi20)) {
            return false;
        }
        oi20 oi20Var = (oi20) obj;
        return Double.compare(this.f25291a, oi20Var.f25291a) == 0 && Double.compare(this.b, oi20Var.b) == 0 && this.c == oi20Var.c && this.d == oi20Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + brm0.d(this.b, Double.hashCode(this.f25291a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f25291a, "Data(coefficient=", ", newCoefficient=");
        sbP.append(this.b);
        sbP.append(", changeType=");
        sbP.append(this.c);
        return vqd.p(sbP, ", enCoefViewId=", this.d, Separators.RPAREN);
    }
}
