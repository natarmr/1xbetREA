package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class lp40 {
    public static final kp40 Companion = new kp40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20423a;
    public final int b;
    public final String c;

    public /* synthetic */ lp40(String str, int i, int i2, long j) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, jp40.f16884a.getDescriptor());
            throw null;
        }
        this.f20423a = j;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp40)) {
            return false;
        }
        lp40 lp40Var = (lp40) obj;
        return this.f20423a == lp40Var.f20423a && this.b == lp40Var.b && Intrinsics.d(this.c, lp40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Long.hashCode(this.f20423a) * 31, 31);
    }

    public final String toString() {
        return rw2.o(brm0.q(this.b, this.f20423a, "MoneyLimitValueRequest(limitValue=", ", limitType="), ", currency=", this.c, Separators.RPAREN);
    }

    public lp40(String str, int i, long j) {
        str.getClass();
        this.f20423a = j;
        this.b = i;
        this.c = str;
    }
}
