package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ut20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36237a;
    public final boolean b;
    public final int c;

    public ut20(int i, long j, boolean z) {
        this.f36237a = j;
        this.b = z;
        this.c = i;
    }

    public static ut20 a(ut20 ut20Var, int i) {
        long j = ut20Var.f36237a;
        boolean z = ut20Var.b;
        ut20Var.getClass();
        return new ut20(i, j, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut20)) {
            return false;
        }
        ut20 ut20Var = (ut20) obj;
        return this.f36237a == ut20Var.f36237a && this.b == ut20Var.b && this.c == ut20Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + brm0.e(Long.hashCode(this.f36237a) * 31, 31, this.b);
    }

    public final String toString() {
        return vqd.p(kng0.r(this.f36237a, "MarketFilterEntity(id=", ", hidden=", this.b), ", pinnedPosition=", this.c, Separators.RPAREN);
    }
}
