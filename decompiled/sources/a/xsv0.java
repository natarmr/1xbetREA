package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xsv0 implements atv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41437a;
    public final int b;
    public final boolean c;
    public final int d;

    public xsv0(int i, int i2, int i3, boolean z) {
        this.f41437a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsv0)) {
            return false;
        }
        xsv0 xsv0Var = (xsv0) obj;
        return this.f41437a == xsv0Var.f41437a && this.b == xsv0Var.b && this.c == xsv0Var.c && this.d == xsv0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + brm0.e(twn.a(this.b, Integer.hashCode(this.f41437a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("ContentHeight(middleHeightPx=", this.f41437a, ", itemCount=", ", isEstimated=", this.b);
        sbT.append(this.c);
        sbT.append(", trailingEmptyPx=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
