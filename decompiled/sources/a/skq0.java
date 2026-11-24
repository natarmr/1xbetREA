package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class skq0 {
    public static final pkq0 Companion = new pkq0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f32365a;
    public final int b;
    public final String c;

    public /* synthetic */ skq0(double d, int i, int i2, String str) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, mkq0.f21956a.getDescriptor());
            throw null;
        }
        this.f32365a = d;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skq0)) {
            return false;
        }
        skq0 skq0Var = (skq0) obj;
        return Double.compare(this.f32365a, skq0Var.f32365a) == 0 && this.b == skq0Var.b && Intrinsics.d(this.c, skq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Double.hashCode(this.f32365a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeLimitsValue(limitValue=");
        sb.append(this.f32365a);
        sb.append(", limitType=");
        sb.append(this.b);
        return rw2.o(sb, ", limitMeasure=", this.c, Separators.RPAREN);
    }

    public skq0(double d, int i, String str) {
        str.getClass();
        this.f32365a = d;
        this.b = i;
        this.c = str;
    }
}
