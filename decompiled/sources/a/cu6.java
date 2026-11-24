package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cu6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4973a;
    public final double b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public cu6(long j, double d, String str, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.f4973a = j;
        this.b = d;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu6)) {
            return false;
        }
        cu6 cu6Var = (cu6) obj;
        return this.f4973a == cu6Var.f4973a && Double.compare(this.b, cu6Var.b) == 0 && Intrinsics.d(this.c, cu6Var.c) && this.d == cu6Var.d && this.e == cu6Var.e && this.f == cu6Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(brm0.e(ua80.b(brm0.d(this.b, Long.hashCode(this.f4973a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f4973a, "BetEvent(id=", ", coefficient=");
        hne.w(sbQ, this.b, ", eventName=", this.c);
        w6x.A(", locked=", ", tracked=", sbQ, this.d, this.e);
        return f140.n(sbQ, ", addedToCoupon=", this.f, Separators.RPAREN);
    }
}
