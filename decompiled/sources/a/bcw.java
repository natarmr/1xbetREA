package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bcw implements hcw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f2373a;
    public final zxj0 b;

    public bcw(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.f2373a = m0k0Var;
        this.b = zxj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcw)) {
            return false;
        }
        bcw bcwVar = (bcw) obj;
        return this.f2373a.equals(bcwVar.f2373a) && this.b.equals(bcwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2373a.hashCode() * 31);
    }

    public final String toString() {
        return "OnAlreadyAddedEventToCoupon(singleBetGame=" + this.f2373a + ", simpleBetZip=" + this.b + Separators.RPAREN;
    }
}
