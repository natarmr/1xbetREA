package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nmh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f23773a;
    public final mtl b;
    public final plh0 c;
    public final boolean d;

    public nmh0(imm immVar, mtl mtlVar, plh0 plh0Var, boolean z) {
        this.f23773a = immVar;
        this.b = mtlVar;
        this.c = plh0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmh0)) {
            return false;
        }
        nmh0 nmh0Var = (nmh0) obj;
        return this.f23773a.equals(nmh0Var.f23773a) && this.b.equals(nmh0Var.b) && this.c.equals(nmh0Var.c) && this.d == nmh0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + cs0.b(this.b.f22376a, this.f23773a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "SecretQuestionUiState(navigationBar=" + this.f23773a + ", bottomBarModel=" + this.b + ", contentState=" + this.c + ", loaderState=" + this.d + Separators.RPAREN;
    }
}
