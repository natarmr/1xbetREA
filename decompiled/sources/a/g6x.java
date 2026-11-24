package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class g6x {
    public g6x() {
        i6x i6xVar = i6x.f14263a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6x) || !ycl.b(3.0f, 3.0f) || !ycl.b(4.0f, 4.0f)) {
            return false;
        }
        i6x i6xVar = i6x.f14263a;
        return true;
    }

    public final int hashCode() {
        return i6x.f14263a.hashCode() + twn.a(R.drawable.market_categories_indicator, defpackage.c.a(Float.hashCode(3.0f) * 31, 4.0f, 31), 31);
    }

    public final String toString() {
        String strC = ycl.c(3.0f);
        String strC2 = ycl.c(4.0f);
        i6x i6xVar = i6x.f14263a;
        StringBuilder sbN = b1j.n("Underline(height=", strC, ", horizontalPadding=", strC2, ", resId=");
        sbN.append(R.drawable.market_categories_indicator);
        sbN.append(", alignment=");
        sbN.append(i6xVar);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
