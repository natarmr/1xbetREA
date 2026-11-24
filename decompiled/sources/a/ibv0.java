package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ibv0 implements lbv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f14509a;
    public final zxj0 b;

    public ibv0(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.f14509a = m0k0Var;
        this.b = zxj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibv0)) {
            return false;
        }
        ibv0 ibv0Var = (ibv0) obj;
        return this.f14509a.equals(ibv0Var.f14509a) && this.b.equals(ibv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14509a.hashCode() * 31);
    }

    public final String toString() {
        return "OnReplaceCouponClicked(singleBetGame=" + this.f14509a + ", simpleBetZip=" + this.b + Separators.RPAREN;
    }
}
