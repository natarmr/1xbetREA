package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class la20 implements ma20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19686a;
    public final int b;
    public final int c;
    public final String d;

    public la20(String str, int i, int i2, long j) {
        this.f19686a = j;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la20)) {
            return false;
        }
        la20 la20Var = (la20) obj;
        return this.f19686a == la20Var.f19686a && this.b == la20Var.b && this.c == la20Var.c && Intrinsics.d(this.d, la20Var.d);
    }

    public final int hashCode() {
        int iA = twn.a(this.c, twn.a(this.b, Long.hashCode(this.f19686a) * 31, 31), 31);
        String str = this.d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f19686a, "ShowSuccessMultiBet(balanceId=", ", successBetCount=");
        w6x.w(this.c, ", allBetCount=", ", shareText=", this.d, sbQ);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
