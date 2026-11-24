package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ruo0 implements suo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f31136a;
    public final String b;

    public ruo0(String str, double d) {
        this.f31136a = d;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ruo0)) {
            return false;
        }
        ruo0 ruo0Var = (ruo0) obj;
        return Double.compare(this.f31136a, ruo0Var.f31136a) == 0 && this.b.equals(ruo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.f31136a) * 31);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("RealMoney(amount=", this.f31136a, ", currency=", this.b);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
