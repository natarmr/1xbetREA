package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class e5k0 implements f5k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z4k0 f7238a;
    public final boolean b;

    public e5k0(z4k0 z4k0Var, boolean z) {
        this.f7238a = z4k0Var;
        this.b = z;
    }

    @Override // a.f5k0
    public final boolean a() {
        return this.b;
    }

    @Override // a.f5k0
    public final z4k0 b() {
        return this.f7238a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5k0)) {
            return false;
        }
        e5k0 e5k0Var = (e5k0) obj;
        return this.f7238a.equals(e5k0Var.f7238a) && this.b == e5k0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f7238a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(headerUiState=" + this.f7238a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
