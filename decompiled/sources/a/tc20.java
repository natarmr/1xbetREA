package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tc20 implements xc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33699a;
    public final int b;
    public final int c;
    public final String d;

    public tc20(String str, int i, int i2, long j) {
        this.f33699a = j;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc20)) {
            return false;
        }
        tc20 tc20Var = (tc20) obj;
        return this.f33699a == tc20Var.f33699a && this.b == tc20Var.b && this.c == tc20Var.c && Intrinsics.d(this.d, tc20Var.d);
    }

    public final int hashCode() {
        int iA = twn.a(this.c, twn.a(this.b, Long.hashCode(this.f33699a) * 31, 31), 31);
        String str = this.d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f33699a, "ShowSuccessMultiBet(balanceId=", ", successBetCount=");
        w6x.w(this.c, ", allBetCount=", ", shareText=", this.d, sbQ);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
