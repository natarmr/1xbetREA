package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class htp0 implements itp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csp0 f13646a;
    public final boolean b;

    public htp0(csp0 csp0Var, boolean z) {
        this.f13646a = csp0Var;
        this.b = z;
    }

    @Override // a.itp0
    public final boolean a() {
        return this.b;
    }

    @Override // a.itp0
    public final csp0 b() {
        return this.f13646a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htp0)) {
            return false;
        }
        htp0 htp0Var = (htp0) obj;
        return this.f13646a.equals(htp0Var.f13646a) && this.b == htp0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f13646a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(headerUiState=" + this.f13646a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
