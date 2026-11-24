package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gbv0 implements lbv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f11031a;
    public final zxj0 b;

    public gbv0(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.f11031a = m0k0Var;
        this.b = zxj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbv0)) {
            return false;
        }
        gbv0 gbv0Var = (gbv0) obj;
        return this.f11031a.equals(gbv0Var.f11031a) && this.b.equals(gbv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11031a.hashCode() * 31);
    }

    public final String toString() {
        return "OnAddToCouponClicked(singleBetGame=" + this.f11031a + ", simpleBetZip=" + this.b + Separators.RPAREN;
    }
}
