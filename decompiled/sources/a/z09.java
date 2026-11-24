package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class z09 implements b19 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjl f43554a;
    public final ijl b;

    public z09(ijl ijlVar, jjl jjlVar) {
        ijlVar.getClass();
        this.f43554a = jjlVar;
        this.b = ijlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z09)) {
            return false;
        }
        z09 z09Var = (z09) obj;
        return this.f43554a.equals(z09Var.f43554a) && this.b == z09Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43554a.hashCode() * 31);
    }

    public final String toString() {
        return "AccountSelection(accountSelectionUiModel=" + this.f43554a + ", accountSelectionStyle=" + this.b + Separators.RPAREN;
    }
}
