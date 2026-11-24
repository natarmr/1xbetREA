package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ww50 implements yw50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eu50 f39871a;
    public final boolean b;

    public ww50(eu50 eu50Var, boolean z) {
        this.f39871a = eu50Var;
        this.b = z;
    }

    @Override // a.yw50
    public final boolean a() {
        return this.b;
    }

    @Override // a.yw50
    public final eu50 b() {
        return this.f39871a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww50)) {
            return false;
        }
        ww50 ww50Var = (ww50) obj;
        return this.f39871a.equals(ww50Var.f39871a) && this.b == ww50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f39871a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(headerUiState=" + this.f39871a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
