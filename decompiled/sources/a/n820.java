package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class n820 implements t820 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dye f23068a;

    public n820(dye dyeVar) {
        this.f23068a = dyeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n820) && this.f23068a.equals(((n820) obj).f23068a);
    }

    public final int hashCode() {
        return this.f23068a.hashCode();
    }

    public final String toString() {
        return "CouponBet(couponInfo=" + this.f23068a + Separators.RPAREN;
    }
}
