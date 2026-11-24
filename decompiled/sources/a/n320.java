package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n320 implements l520 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zxj0 f22829a;
    public final m0k0 b;

    public n320(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.f22829a = zxj0Var;
        this.b = m0k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n320)) {
            return false;
        }
        n320 n320Var = (n320) obj;
        return this.f22829a.equals(n320Var.f22829a) && this.b.equals(n320Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22829a.hashCode() * 31);
    }

    public final String toString() {
        return "OnAddBetToCouponClick(bet=" + this.f22829a + ", game=" + this.b + Separators.RPAREN;
    }
}
