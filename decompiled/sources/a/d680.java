package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class d680 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f5540a;
    public final String b;

    public d680(String str, double d) {
        this.f5540a = d;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d680)) {
            return false;
        }
        d680 d680Var = (d680) obj;
        return Double.compare(this.f5540a, d680Var.f5540a) == 0 && this.b.equals(d680Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.f5540a) * 31);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("OptiCoefModel(optiCoefValue=", this.f5540a, ", optiCoefView=", this.b);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
