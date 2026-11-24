package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class h6x {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6x) || !ycl.b(2.0f, 2.0f) || !ycl.b(4.0f, 4.0f)) {
            return false;
        }
        j6x j6xVar = j6x.f16011a;
        return true;
    }

    public final int hashCode() {
        return j6x.f16011a.hashCode() + twn.a(R.drawable.cyber_market_categories_indicator, defpackage.c.a(Float.hashCode(2.0f) * 31, 4.0f, 31), 31);
    }

    public final String toString() {
        String strC = ycl.c(2.0f);
        String strC2 = ycl.c(4.0f);
        j6x j6xVar = j6x.f16011a;
        StringBuilder sbN = b1j.n("Underline(height=", strC, ", horizontalPadding=", strC2, ", resId=");
        sbN.append(R.drawable.cyber_market_categories_indicator);
        sbN.append(", alignment=");
        sbN.append(j6xVar);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
