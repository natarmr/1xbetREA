package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yh7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f42624a;
    public final long b;
    public final double c;
    public final String d;
    public final double e;

    public yh7(double d, long j, double d2, String str, double d3) {
        this.f42624a = d;
        this.b = j;
        this.c = d2;
        this.d = str;
        this.e = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh7)) {
            return false;
        }
        yh7 yh7Var = (yh7) obj;
        return Double.compare(this.f42624a, yh7Var.f42624a) == 0 && this.b == yh7Var.b && Double.compare(this.c, yh7Var.c) == 0 && this.d.equals(yh7Var.d) && Double.compare(this.e, yh7Var.e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + ua80.b(brm0.d(this.c, rw2.b(Double.hashCode(this.f42624a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f42624a, "BetResultModel(balance=", ", id=");
        sbP.append(this.b);
        ohs0.A(sbP, this.c, ", coef=", ", cfValue=");
        hne.A(sbP, this.d, ", betSum=", this.e);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
