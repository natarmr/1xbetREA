package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class e130 implements g130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f7019a;
    public final zxj0 b;

    public e130(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.f7019a = m0k0Var;
        this.b = zxj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e130)) {
            return false;
        }
        e130 e130Var = (e130) obj;
        return this.f7019a.equals(e130Var.f7019a) && this.b.equals(e130Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7019a.hashCode() * 31);
    }

    public final String toString() {
        return "ReplaceCouponEventClick(singleBetGame=" + this.f7019a + ", simpleBetZip=" + this.b + Separators.RPAREN;
    }
}
