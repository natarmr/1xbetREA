package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class n1m0 implements q1m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0m0 f22758a;
    public final jkm b;

    public n1m0(z0m0 z0m0Var, jkm jkmVar) {
        this.f22758a = z0m0Var;
        this.b = jkmVar;
    }

    @Override // a.q1m0
    public final boolean a() {
        return true;
    }

    @Override // a.q1m0
    public final z0m0 b() {
        return this.f22758a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1m0)) {
            return false;
        }
        n1m0 n1m0Var = (n1m0) obj;
        return this.f22758a.equals(n1m0Var.f22758a) && this.b.equals(n1m0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + brm0.e(this.f22758a.hashCode() * 31, 31, true);
    }

    public final String toString() {
        return "Error(headerUiState=" + this.f22758a + ", rtlSupport=true, lottieEmptyConfig=" + this.b + Separators.RPAREN;
    }
}
