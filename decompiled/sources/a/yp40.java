package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class yp40 {
    public static final up40 Companion = new up40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f43014a;
    public final int b;
    public final String c;

    public /* synthetic */ yp40(double d, int i, int i2, String str) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, qp40.f29098a.getDescriptor());
            throw null;
        }
        this.f43014a = d;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp40)) {
            return false;
        }
        yp40 yp40Var = (yp40) obj;
        return Double.compare(this.f43014a, yp40Var.f43014a) == 0 && this.b == yp40Var.b && Intrinsics.d(this.c, yp40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Double.hashCode(this.f43014a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyLimitsValue(limitValue=");
        sb.append(this.f43014a);
        sb.append(", limitType=");
        sb.append(this.b);
        return rw2.o(sb, ", currency=", this.c, Separators.RPAREN);
    }

    public yp40(double d, int i, String str) {
        this.f43014a = d;
        this.b = i;
        this.c = str;
    }
}
