package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class icr0 implements kcr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kbr0 f14548a;
    public final boolean b;

    public icr0(kbr0 kbr0Var, boolean z) {
        this.f14548a = kbr0Var;
        this.b = z;
    }

    @Override // a.kcr0
    public final boolean a() {
        return this.b;
    }

    @Override // a.kcr0
    public final kbr0 b() {
        return this.f14548a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icr0)) {
            return false;
        }
        icr0 icr0Var = (icr0) obj;
        return this.f14548a.equals(icr0Var.f14548a) && this.b == icr0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f14548a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(headerUiState=" + this.f14548a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
