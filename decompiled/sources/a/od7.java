package a;

import android.gov.nist.core.Separators;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class od7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f25063a;
    public final BigDecimal b;
    public final BigDecimal c;
    public final boolean d;
    public final String e;

    public od7(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, boolean z, String str) {
        bigDecimal2.getClass();
        this.f25063a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
        this.d = z;
        this.e = str;
    }

    public static od7 a(od7 od7Var, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            bigDecimal = od7Var.f25063a;
        }
        BigDecimal bigDecimal4 = bigDecimal;
        if ((i & 2) != 0) {
            bigDecimal2 = od7Var.b;
        }
        BigDecimal bigDecimal5 = bigDecimal2;
        if ((i & 4) != 0) {
            bigDecimal3 = od7Var.c;
        }
        BigDecimal bigDecimal6 = bigDecimal3;
        if ((i & 8) != 0) {
            z = od7Var.d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str = od7Var.e;
        }
        String str2 = str;
        od7Var.getClass();
        bigDecimal5.getClass();
        str2.getClass();
        return new od7(bigDecimal4, bigDecimal5, bigDecimal6, z2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od7)) {
            return false;
        }
        od7 od7Var = (od7) obj;
        return this.f25063a.equals(od7Var.f25063a) && Intrinsics.d(this.b, od7Var.b) && this.c.equals(od7Var.c) && this.d == od7Var.d && this.e.equals(od7Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(axq.a(axq.a(this.f25063a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetInputUiModel(currentValue=");
        sb.append(this.f25063a);
        sb.append(", minValue=");
        sb.append(this.b);
        sb.append(", maxValue=");
        sb.append(this.c);
        sb.append(", isLoading=");
        sb.append(this.d);
        sb.append(", currencySymbol=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
