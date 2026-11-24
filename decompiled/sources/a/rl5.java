package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rl5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f30680a;
    public final kg b;

    public rl5(ql5 ql5Var, kg kgVar) {
        this.f30680a = ql5Var;
        this.b = kgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl5)) {
            return false;
        }
        rl5 rl5Var = (rl5) obj;
        return this.f30680a.equals(rl5Var.f30680a) && this.b == rl5Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30680a.hashCode() * 31);
    }

    public final String toString() {
        return "BalanceModelMapperState(balance=" + this.f30680a + ", accountSelectionStyle=" + this.b + Separators.RPAREN;
    }
}
