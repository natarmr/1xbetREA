package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class u3q0 implements w3q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3q0 f35011a;
    public final boolean b;

    public u3q0(k3q0 k3q0Var, boolean z) {
        this.f35011a = k3q0Var;
        this.b = z;
    }

    @Override // a.w3q0
    public final boolean a() {
        return this.b;
    }

    @Override // a.w3q0
    public final k3q0 b() {
        return this.f35011a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3q0)) {
            return false;
        }
        u3q0 u3q0Var = (u3q0) obj;
        return this.f35011a.equals(u3q0Var.f35011a) && this.b == u3q0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f35011a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(headerUiState=" + this.f35011a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
