package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class obv0 implements ubv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f24998a;
    public final m97 b;

    static {
        k97 k97Var = m97.Companion;
    }

    public obv0(m0k0 m0k0Var, m97 m97Var) {
        this.f24998a = m0k0Var;
        this.b = m97Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obv0)) {
            return false;
        }
        obv0 obv0Var = (obv0) obj;
        return this.f24998a.equals(obv0Var.f24998a) && this.b.equals(obv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24998a.hashCode() * 31);
    }

    public final String toString() {
        return "CouponHasEvent(betGame=" + this.f24998a + ", betInfo=" + this.b + Separators.RPAREN;
    }
}
