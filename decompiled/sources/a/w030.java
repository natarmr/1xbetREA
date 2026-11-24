package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class w030 implements g130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f38330a;
    public final zxj0 b;

    public w030(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.f38330a = m0k0Var;
        this.b = zxj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w030)) {
            return false;
        }
        w030 w030Var = (w030) obj;
        return this.f38330a.equals(w030Var.f38330a) && this.b.equals(w030Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38330a.hashCode() * 31);
    }

    public final String toString() {
        return "AddCouponEventClick(singleBetGame=" + this.f38330a + ", simpleBetZip=" + this.b + Separators.RPAREN;
    }
}
