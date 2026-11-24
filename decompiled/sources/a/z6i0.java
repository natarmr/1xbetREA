package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class z6i0 {
    public static final v6i0 Companion = new v6i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43869a;
    public final int b;
    public final String c;

    public /* synthetic */ z6i0(String str, int i, int i2, long j) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, r6i0.f29934a.getDescriptor());
            throw null;
        }
        this.f43869a = j;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6i0)) {
            return false;
        }
        z6i0 z6i0Var = (z6i0) obj;
        return this.f43869a == z6i0Var.f43869a && this.b == z6i0Var.b && Intrinsics.d(this.c, z6i0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Long.hashCode(this.f43869a) * 31, 31);
    }

    public final String toString() {
        return rw2.o(brm0.q(this.b, this.f43869a, "SelfExcludeLimitsValue(limitValue=", ", limitType="), ", limitMeasure=", this.c, Separators.RPAREN);
    }

    public z6i0(long j, String str) {
        this.f43869a = j;
        this.b = 30;
        this.c = str;
    }
}
