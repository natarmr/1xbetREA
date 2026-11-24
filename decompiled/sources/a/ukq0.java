package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class ukq0 {
    public static final rkq0 Companion = new rkq0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f35842a;
    public final int b;
    public final String c;

    public /* synthetic */ ukq0(double d, int i, int i2, String str) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, okq0.f25417a.getDescriptor());
            throw null;
        }
        this.f35842a = d;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ukq0)) {
            return false;
        }
        ukq0 ukq0Var = (ukq0) obj;
        return Double.compare(this.f35842a, ukq0Var.f35842a) == 0 && this.b == ukq0Var.b && Intrinsics.d(this.c, ukq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Double.hashCode(this.f35842a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeLimitsValue(limitValue=");
        sb.append(this.f35842a);
        sb.append(", limitType=");
        sb.append(this.b);
        return rw2.o(sb, ", limitMeasure=", this.c, Separators.RPAREN);
    }

    public ukq0(double d, int i, String str) {
        str.getClass();
        this.f35842a = d;
        this.b = i;
        this.c = str;
    }
}
