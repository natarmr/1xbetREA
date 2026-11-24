package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class j4m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15891a;
    public final int b;
    public final ArrayList c;
    public final ArrayList d;
    public final float e;
    public final float f;
    public final int g;

    public j4m(int i, int i2, ArrayList arrayList, ArrayList arrayList2, float f, float f2, int i3) {
        this.f15891a = i;
        this.b = i2;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = f;
        this.f = f2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4m)) {
            return false;
        }
        j4m j4mVar = (j4m) obj;
        return this.f15891a == j4mVar.f15891a && this.b == j4mVar.b && this.c.equals(j4mVar.c) && this.d.equals(j4mVar.d) && ycl.b(this.e, j4mVar.e) && ycl.b(this.f, j4mVar.f) && this.g == j4mVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + defpackage.c.a(defpackage.c.a(twn.g(this.d, twn.g(this.c, twn.a(this.b, Integer.hashCode(this.f15891a) * 31, 31), 31), 31), this.e, 31), this.f, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.e);
        String strC2 = ycl.c(this.f);
        StringBuilder sbT = dw9.t("DsCyberGameChartConfig(zeroValue=", this.f15891a, ", halfRange=", ", xLabels=", this.b);
        sbT.append(this.c);
        sbT.append(", yRows=");
        sbT.append(this.d);
        sbT.append(", chartStep=");
        f140.v(sbT, strC, ", chartWidth=", strC2, ", timeIntervalSeconds=");
        return rz4.j(this.g, Separators.RPAREN, sbT);
    }
}
