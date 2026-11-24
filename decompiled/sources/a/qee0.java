package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qee0 implements see0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjl f28579a;
    public final ijl b;

    public qee0(ijl ijlVar, jjl jjlVar) {
        ijlVar.getClass();
        this.f28579a = jjlVar;
        this.b = ijlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qee0)) {
            return false;
        }
        qee0 qee0Var = (qee0) obj;
        return this.f28579a.equals(qee0Var.f28579a) && this.b == qee0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28579a.hashCode() * 31);
    }

    public final String toString() {
        return "AccountSelection(accountSelectionUiModel=" + this.f28579a + ", accountSelectionStyle=" + this.b + Separators.RPAREN;
    }
}
