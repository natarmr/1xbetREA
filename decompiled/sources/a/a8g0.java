package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class a8g0 implements d8g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y6g0 f424a;
    public final boolean b;
    public final y7g0 c;

    public a8g0(y6g0 y6g0Var, boolean z, y7g0 y7g0Var) {
        this.f424a = y6g0Var;
        this.b = z;
        this.c = y7g0Var;
    }

    @Override // a.d8g0
    public final boolean a() {
        return this.b;
    }

    @Override // a.d8g0
    public final y6g0 b() {
        return this.f424a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8g0)) {
            return false;
        }
        a8g0 a8g0Var = (a8g0) obj;
        return this.f424a.equals(a8g0Var.f424a) && this.b == a8g0Var.b && this.c.equals(a8g0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f424a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Content(headerUiState=" + this.f424a + ", rtlSupport=" + this.b + ", tableContent=" + this.c + Separators.RPAREN;
    }
}
