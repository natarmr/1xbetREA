package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class tb1 implements wb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33639a;
    public final long b;

    public tb1(long j, long j2) {
        this.f33639a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb1)) {
            return false;
        }
        tb1 tb1Var = (tb1) obj;
        return this.f33639a == tb1Var.f33639a && this.b == tb1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f33639a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f33639a, "ShowTransferMoneyDialog(balanceId=", ", productId="));
    }
}
