package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gw0 implements iw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12000a;
    public final long b;

    public gw0(long j, long j2) {
        this.f12000a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw0)) {
            return false;
        }
        gw0 gw0Var = (gw0) obj;
        return this.f12000a == gw0Var.f12000a && this.b == gw0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f12000a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f12000a, "ShowPaymentDialog(balanceId=", ", productId="));
    }
}
