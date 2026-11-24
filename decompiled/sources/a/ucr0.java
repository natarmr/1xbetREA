package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ucr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f35444a;
    public final LinkedHashMap b;
    public final float c;
    public final float d;
    public final boolean e;
    public final ow3 f;

    public ucr0(float f, LinkedHashMap linkedHashMap, float f2, float f3, boolean z, ow3 ow3Var) {
        this.f35444a = f;
        this.b = linkedHashMap;
        this.c = f2;
        this.d = f3;
        this.e = z;
        this.f = ow3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucr0)) {
            return false;
        }
        ucr0 ucr0Var = (ucr0) obj;
        return ycl.b(this.f35444a, ucr0Var.f35444a) && this.b.equals(ucr0Var.b) && ycl.b(this.c, ucr0Var.c) && ycl.b(this.d, ucr0Var.d) && this.e == ucr0Var.e && this.f.equals(ucr0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(defpackage.c.a(defpackage.c.a((this.b.hashCode() + (Float.hashCode(this.f35444a) * 31)) * 31, this.c, 31), this.d, 31), 31, this.e);
    }

    public final String toString() {
        String strC = ycl.c(this.f35444a);
        String strC2 = ycl.c(this.c);
        String strC3 = ycl.c(this.d);
        StringBuilder sb = new StringBuilder("TopPlayersTableMetrics(infoColumnWidth=");
        sb.append(strC);
        sb.append(", statColumnWidths=");
        sb.append(this.b);
        sb.append(", statCellHorizontalPadding=");
        f140.v(sb, strC2, ", minStatCellWidth=", strC3, ", isStatScrollNeeded=");
        sb.append(this.e);
        sb.append(", statHorizontalArrangement=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
