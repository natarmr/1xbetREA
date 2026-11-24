package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rop0 implements sop0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mop0 f30850a;
    public final boolean b;

    public rop0(mop0 mop0Var, boolean z) {
        this.f30850a = mop0Var;
        this.b = z;
    }

    @Override // a.sop0
    public final boolean a() {
        return this.b;
    }

    @Override // a.sop0
    public final mop0 b() {
        return this.f30850a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rop0)) {
            return false;
        }
        rop0 rop0Var = (rop0) obj;
        return this.f30850a.equals(rop0Var.f30850a) && this.b == rop0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f30850a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(headerUiState=" + this.f30850a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
