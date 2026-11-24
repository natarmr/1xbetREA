package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dap0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5762a;
    public final vb90 b;

    public dap0(String str, vb90 vb90Var) {
        this.f5762a = str;
        this.b = vb90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dap0)) {
            return false;
        }
        dap0 dap0Var = (dap0) obj;
        return this.f5762a.equals(dap0Var.f5762a) && this.b.equals(dap0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f5762a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5762a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamDetailsResultCardUiModel(key=" + this.f5762a + ", gameCardUiModel=" + this.b + Separators.RPAREN;
    }
}
