package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xgt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f40855a;
    public final int b;
    public final ArrayList c;
    public final ArrayList d;
    public final List e;
    public final double f;
    public final int g;

    public xgt(double d, int i, ArrayList arrayList, ArrayList arrayList2, List list, double d2, int i2) {
        list.getClass();
        this.f40855a = d;
        this.b = i;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = list;
        this.f = d2;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgt)) {
            return false;
        }
        xgt xgtVar = (xgt) obj;
        return Double.compare(this.f40855a, xgtVar.f40855a) == 0 && this.b == xgtVar.b && this.c.equals(xgtVar.c) && this.d.equals(xgtVar.d) && Intrinsics.d(this.e, xgtVar.e) && Double.compare(this.f, xgtVar.f) == 0 && this.g == xgtVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + brm0.d(this.f, dw9.a(twn.g(this.d, twn.g(this.c, twn.a(this.b, Double.hashCode(this.f40855a) * 31, 31), 31), 31), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GenerateCouponAssembleModel(betSize=");
        sb.append(this.f40855a);
        sb.append(", couponTypes=");
        sb.append(this.b);
        sb.append(", eventTypes=");
        sb.append(this.c);
        sb.append(", sports=");
        sb.append(this.d);
        sb.append(", teamsList=");
        sb.append(this.e);
        sb.append(", payout=");
        rz4.w(sb, this.f, ", timeFilter=", this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
