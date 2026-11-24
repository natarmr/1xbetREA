package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wbr0 implements xbr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rbr0 f38894a;
    public final boolean b;

    public wbr0(rbr0 rbr0Var, boolean z) {
        this.f38894a = rbr0Var;
        this.b = z;
    }

    @Override // a.xbr0
    public final boolean a() {
        return this.b;
    }

    @Override // a.xbr0
    public final rbr0 b() {
        return this.f38894a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbr0)) {
            return false;
        }
        wbr0 wbr0Var = (wbr0) obj;
        return this.f38894a.equals(wbr0Var.f38894a) && this.b == wbr0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f38894a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(headerUiState=" + this.f38894a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
