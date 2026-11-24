package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kl2 implements ml2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f18465a;
    public final m97 b;

    public kl2(m0k0 m0k0Var, m97 m97Var) {
        this.f18465a = m0k0Var;
        this.b = m97Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl2)) {
            return false;
        }
        kl2 kl2Var = (kl2) obj;
        return this.f18465a.equals(kl2Var.f18465a) && this.b.equals(kl2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18465a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowMakeBetDialog(singleBetGame=" + this.f18465a + ", betInfo=" + this.b + Separators.RPAREN;
    }
}
