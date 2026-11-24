package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class o820 implements u820 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eye f24812a;

    public o820(eye eyeVar) {
        this.f24812a = eyeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o820) && this.f24812a.equals(((o820) obj).f24812a);
    }

    public final int hashCode() {
        return this.f24812a.hashCode();
    }

    public final String toString() {
        return "CouponBet(couponInfo=" + this.f24812a + Separators.RPAREN;
    }
}
