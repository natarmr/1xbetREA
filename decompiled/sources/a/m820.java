package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class m820 implements s820 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cye f21350a;

    public m820(cye cyeVar) {
        this.f21350a = cyeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m820) && this.f21350a.equals(((m820) obj).f21350a);
    }

    public final int hashCode() {
        return this.f21350a.hashCode();
    }

    public final String toString() {
        return "CouponBet(couponInfo=" + this.f21350a + Separators.RPAREN;
    }
}
