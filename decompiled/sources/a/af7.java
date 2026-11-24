package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class af7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f764a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;

    public af7(boolean z, boolean z2, long j, long j2, long j3, long j4, String str) {
        str.getClass();
        this.f764a = z;
        this.b = z2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = str;
    }

    public static af7 a(af7 af7Var, long j, long j2, int i) {
        boolean z = af7Var.f764a;
        boolean z2 = af7Var.b;
        if ((i & 4) != 0) {
            j = af7Var.c;
        }
        long j3 = j;
        long j4 = af7Var.d;
        long j5 = af7Var.e;
        long j6 = (i & 32) != 0 ? af7Var.f : j2;
        String str = af7Var.g;
        str.getClass();
        return new af7(z, z2, j3, j4, j5, j6, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af7)) {
            return false;
        }
        af7 af7Var = (af7) obj;
        return this.f764a == af7Var.f764a && this.b == af7Var.b && this.c == af7Var.c && this.d == af7Var.d && this.e == af7Var.e && this.f == af7Var.f && Intrinsics.d(this.g, af7Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + rw2.b(rw2.b(rw2.b(rw2.b(brm0.e(Boolean.hashCode(this.f764a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("BetLimitIeModel(isFreeValue=", ", isLimitInactive=", ", betLimitValue=", this.f764a, this.b);
        sbQ.append(this.c);
        kng0.A(sbQ, ", currentBetLimitValue=", this.d, ", pendingBetLimitValue=");
        sbQ.append(this.e);
        kng0.A(sbQ, ", betLimitPeriodValue=", this.f, ", currency=");
        return axq.n(sbQ, this.g, Separators.RPAREN);
    }
}
