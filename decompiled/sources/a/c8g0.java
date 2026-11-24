package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class c8g0 implements d8g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y6g0 f3913a;
    public final boolean b;

    public c8g0(y6g0 y6g0Var, boolean z) {
        this.f3913a = y6g0Var;
        this.b = z;
    }

    @Override // a.d8g0
    public final boolean a() {
        return this.b;
    }

    @Override // a.d8g0
    public final y6g0 b() {
        return this.f3913a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8g0)) {
            return false;
        }
        c8g0 c8g0Var = (c8g0) obj;
        return this.f3913a.equals(c8g0Var.f3913a) && this.b == c8g0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f3913a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(headerUiState=" + this.f3913a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
