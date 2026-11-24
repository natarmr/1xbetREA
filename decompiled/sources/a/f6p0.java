package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class f6p0 implements h6p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u5p0 f9024a;
    public final boolean b;

    public f6p0(u5p0 u5p0Var, boolean z) {
        this.f9024a = u5p0Var;
        this.b = z;
    }

    @Override // a.h6p0
    public final boolean a() {
        return this.b;
    }

    @Override // a.h6p0
    public final u5p0 b() {
        return this.f9024a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6p0)) {
            return false;
        }
        f6p0 f6p0Var = (f6p0) obj;
        return this.f9024a.equals(f6p0Var.f9024a) && this.b == f6p0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f9024a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(headerUiState=" + this.f9024a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
