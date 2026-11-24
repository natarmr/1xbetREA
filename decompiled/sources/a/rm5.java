package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rm5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30729a;
    public final double b;
    public final String c;

    public rm5(long j, double d, String str) {
        str.getClass();
        this.f30729a = j;
        this.b = d;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm5)) {
            return false;
        }
        rm5 rm5Var = (rm5) obj;
        return this.f30729a == rm5Var.f30729a && Double.compare(this.b, rm5Var.b) == 0 && Intrinsics.d(this.c, rm5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.d(this.b, Long.hashCode(this.f30729a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f30729a, "BalanceState(balanceId=", ", amount=");
        hne.w(sbQ, this.b, ", currency=", this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
