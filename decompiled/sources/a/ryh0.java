package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ryh0 implements xyh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f31315a;
    public final zxj0 b;

    public ryh0(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.f31315a = m0k0Var;
        this.b = zxj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryh0)) {
            return false;
        }
        ryh0 ryh0Var = (ryh0) obj;
        return this.f31315a.equals(ryh0Var.f31315a) && this.b.equals(ryh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31315a.hashCode() * 31);
    }

    public final String toString() {
        return "OnAlreadyAddedEventToCoupon(singleBetGame=" + this.f31315a + ", simpleBetZip=" + this.b + Separators.RPAREN;
    }
}
