package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class q1h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27953a;
    public final long b;

    public q1h0(String str, long j) {
        this.f27953a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1h0)) {
            return false;
        }
        q1h0 q1h0Var = (q1h0) obj;
        return this.f27953a.equals(q1h0Var.f27953a) && this.b == q1h0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f27953a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "ScannerCouponModel(betId=", this.f27953a, ", bonusUserId=");
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
