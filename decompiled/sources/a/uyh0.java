package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uyh0 implements xyh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f36489a;
    public final zxj0 b;

    public uyh0(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.f36489a = m0k0Var;
        this.b = zxj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyh0)) {
            return false;
        }
        uyh0 uyh0Var = (uyh0) obj;
        return this.f36489a.equals(uyh0Var.f36489a) && this.b.equals(uyh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36489a.hashCode() * 31);
    }

    public final String toString() {
        return "OnReplaceCoupon(singleBetGame=" + this.f36489a + ", simpleBetZip=" + this.b + Separators.RPAREN;
    }
}
