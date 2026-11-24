package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m1m0 implements q1m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0m0 f21015a;
    public final jkm b;

    public m1m0(z0m0 z0m0Var, jkm jkmVar) {
        this.f21015a = z0m0Var;
        this.b = jkmVar;
    }

    @Override // a.q1m0
    public final boolean a() {
        return true;
    }

    @Override // a.q1m0
    public final z0m0 b() {
        return this.f21015a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1m0)) {
            return false;
        }
        m1m0 m1m0Var = (m1m0) obj;
        return this.f21015a.equals(m1m0Var.f21015a) && this.b.equals(m1m0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + brm0.e(this.f21015a.hashCode() * 31, 31, true);
    }

    public final String toString() {
        return "Empty(headerUiState=" + this.f21015a + ", rtlSupport=true, lottieEmptyConfig=" + this.b + Separators.RPAREN;
    }
}
