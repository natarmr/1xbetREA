package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class krt0 implements Serializable {
    public static final jrt0 Companion = new jrt0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18785a;
    public final boolean b;
    public final boolean c;
    public final double d;

    public /* synthetic */ krt0(int i, long j, boolean z, boolean z2, double d) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, irt0.f15275a.getDescriptor());
            throw null;
        }
        this.f18785a = j;
        this.b = z;
        this.c = z2;
        this.d = d;
    }

    public static krt0 a(krt0 krt0Var, boolean z, boolean z2, double d, int i) {
        long j = krt0Var.f18785a;
        if ((i & 2) != 0) {
            z = krt0Var.b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = krt0Var.c;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            d = krt0Var.d;
        }
        return new krt0(j, z3, z4, d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krt0)) {
            return false;
        }
        krt0 krt0Var = (krt0) obj;
        return this.f18785a == krt0Var.f18785a && this.b == krt0Var.b && this.c == krt0Var.c && Double.compare(this.d, krt0Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + brm0.e(brm0.e(Long.hashCode(this.f18785a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f18785a, "UserInfo(userId=", ", lnC=", this.b);
        rz4.A(sbR, ", lvC=", this.c, ", userProfit=");
        return axq.l(sbR, this.d, Separators.RPAREN);
    }

    public krt0(long j, boolean z, boolean z2, double d) {
        this.f18785a = j;
        this.b = z;
        this.c = z2;
        this.d = d;
    }
}
