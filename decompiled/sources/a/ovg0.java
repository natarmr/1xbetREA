package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ovg0 implements rvg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f25924a;
    public final String b;
    public final double c;
    public final double d;
    public final boolean e;

    public ovg0(double d, String str, double d2, double d3, boolean z) {
        this.f25924a = d;
        this.b = str;
        this.c = d2;
        this.d = d3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovg0)) {
            return false;
        }
        ovg0 ovg0Var = (ovg0) obj;
        return Double.compare(this.f25924a, ovg0Var.f25924a) == 0 && this.b.equals(ovg0Var.b) && Double.compare(this.c, ovg0Var.c) == 0 && Double.compare(this.d, ovg0Var.d) == 0 && this.e == ovg0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.d(this.d, brm0.d(this.c, ua80.b(Double.hashCode(this.f25924a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("ShowSaleDialog(downGradeSum=", this.f25924a, ", currency=", this.b);
        ohs0.A(sbS, this.c, ", saleSum=", ", autoSaleSum=");
        rz4.x(sbS, this.d, ", isAutoSale=", this.e);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
