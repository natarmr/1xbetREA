package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tu8 implements vu8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjl f34538a;
    public final ijl b;

    public tu8(ijl ijlVar, jjl jjlVar) {
        ijlVar.getClass();
        this.f34538a = jjlVar;
        this.b = ijlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu8)) {
            return false;
        }
        tu8 tu8Var = (tu8) obj;
        return this.f34538a.equals(tu8Var.f34538a) && this.b == tu8Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34538a.hashCode() * 31);
    }

    public final String toString() {
        return "AccountSelection(accountSelectionUiModel=" + this.f34538a + ", accountSelectionStyle=" + this.b + Separators.RPAREN;
    }
}
