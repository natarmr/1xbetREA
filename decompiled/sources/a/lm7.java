package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lm7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20283a;

    public lm7(long j) {
        this.f20283a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lm7) && this.f20283a == ((lm7) obj).f20283a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20283a);
    }

    public final String toString() {
        return axq.h(this.f20283a, "BetSlipState(couponEventCount=", Separators.RPAREN);
    }
}
