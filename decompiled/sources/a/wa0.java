package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wa0 implements ya0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjl f38804a;
    public final ijl b;

    public wa0(ijl ijlVar, jjl jjlVar) {
        ijlVar.getClass();
        this.f38804a = jjlVar;
        this.b = ijlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa0)) {
            return false;
        }
        wa0 wa0Var = (wa0) obj;
        return this.f38804a.equals(wa0Var.f38804a) && this.b == wa0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38804a.hashCode() * 31);
    }

    public final String toString() {
        return "AccountSelection(accountSelectionUiModel=" + this.f38804a + ", accountSelectionStyle=" + this.b + Separators.RPAREN;
    }
}
