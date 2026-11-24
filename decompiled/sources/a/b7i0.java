package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class b7i0 {
    public static final x6i0 Companion = new x6i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2111a;
    public final int b;
    public final String c;

    public /* synthetic */ b7i0(String str, int i, int i2, long j) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, t6i0.f33418a.getDescriptor());
            throw null;
        }
        this.f2111a = j;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7i0)) {
            return false;
        }
        b7i0 b7i0Var = (b7i0) obj;
        return this.f2111a == b7i0Var.f2111a && this.b == b7i0Var.b && Intrinsics.d(this.c, b7i0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Long.hashCode(this.f2111a) * 31, 31);
    }

    public final String toString() {
        return rw2.o(brm0.q(this.b, this.f2111a, "SelfExcludeLimitsValue(limitValue=", ", limitType="), ", limitMeasure=", this.c, Separators.RPAREN);
    }

    public b7i0(long j, String str) {
        str.getClass();
        this.f2111a = j;
        this.b = 30;
        this.c = str;
    }
}
