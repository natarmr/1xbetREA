package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class wp40 {
    public static final sp40 Companion = new sp40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39527a;
    public final int b;
    public final String c;

    public /* synthetic */ wp40(String str, int i, int i2, long j) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, op40.f25623a.getDescriptor());
            throw null;
        }
        this.f39527a = j;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp40)) {
            return false;
        }
        wp40 wp40Var = (wp40) obj;
        return this.f39527a == wp40Var.f39527a && this.b == wp40Var.b && Intrinsics.d(this.c, wp40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Long.hashCode(this.f39527a) * 31, 31);
    }

    public final String toString() {
        return rw2.o(brm0.q(this.b, this.f39527a, "MoneyLimitsValue(limitValue=", ", limitType="), ", currency=", this.c, Separators.RPAREN);
    }

    public wp40(String str, int i, long j) {
        str.getClass();
        this.f39527a = j;
        this.b = i;
        this.c = str;
    }
}
