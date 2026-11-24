package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uqq0 implements xqq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f36130a;
    public final boolean b;

    public uqq0(jkm jkmVar, boolean z) {
        this.f36130a = jkmVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqq0)) {
            return false;
        }
        uqq0 uqq0Var = (uqq0) obj;
        return this.f36130a.equals(uqq0Var.f36130a) && this.b == uqq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f36130a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(lottieConfig=" + this.f36130a + ", showTimeout=" + this.b + Separators.RPAREN;
    }
}
