package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hid implements uid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f13107a;
    public final zxj0 b;

    public hid(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.f13107a = m0k0Var;
        this.b = zxj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hid)) {
            return false;
        }
        hid hidVar = (hid) obj;
        return this.f13107a.equals(hidVar.f13107a) && this.b.equals(hidVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13107a.hashCode() * 31);
    }

    public final String toString() {
        return "OnReplaceEventInCouponClick(singleBetGame=" + this.f13107a + ", simpleBetZip=" + this.b + Separators.RPAREN;
    }
}
