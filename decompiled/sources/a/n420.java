package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n420 implements l520 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zxj0 f22879a;
    public final m0k0 b;

    public n420(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.f22879a = zxj0Var;
        this.b = m0k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n420)) {
            return false;
        }
        n420 n420Var = (n420) obj;
        return this.f22879a.equals(n420Var.f22879a) && this.b.equals(n420Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22879a.hashCode() * 31);
    }

    public final String toString() {
        return "OnReplaceBetInCouponClick(bet=" + this.f22879a + ", game=" + this.b + Separators.RPAREN;
    }
}
