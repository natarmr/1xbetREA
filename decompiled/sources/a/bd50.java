package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class bd50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qc50 f2384a;
    public final imm b;

    public bd50(qc50 qc50Var, imm immVar) {
        this.f2384a = qc50Var;
        this.b = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd50)) {
            return false;
        }
        bd50 bd50Var = (bd50) obj;
        return this.f2384a.equals(bd50Var.f2384a) && this.b.equals(bd50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2384a.hashCode() * 31);
    }

    public final String toString() {
        return "NavigationBarUiModel(navigationBarMiddleUiModel=" + this.f2384a + ", dsNavigationBarUiModel=" + this.b + Separators.RPAREN;
    }
}
