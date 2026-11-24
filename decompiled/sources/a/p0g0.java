package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class p0g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f26149a;
    public final String b;

    public p0g0(String str, double d) {
        this.f26149a = d;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0g0)) {
            return false;
        }
        p0g0 p0g0Var = (p0g0) obj;
        return Double.compare(this.f26149a, p0g0Var.f26149a) == 0 && this.b.equals(p0g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.f26149a) * 31);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("ResultCoefModel(coefValue=", this.f26149a, ", coefView=", this.b);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
