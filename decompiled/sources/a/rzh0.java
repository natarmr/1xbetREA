package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rzh0 implements szh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f31361a;
    public final m97 b;
    public final nq2 c;

    static {
        k97 k97Var = m97.Companion;
    }

    public rzh0(m0k0 m0k0Var, m97 m97Var, nq2 nq2Var) {
        this.f31361a = m0k0Var;
        this.b = m97Var;
        this.c = nq2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rzh0) {
            rzh0 rzh0Var = (rzh0) obj;
            return this.f31361a.equals(rzh0Var.f31361a) && this.b.equals(rzh0Var.b) && this.c == rzh0Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f31361a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SendMakeBetSideEffect(betGame=" + this.f31361a + ", betInfo=" + this.b + ", entryPoint=" + this.c + Separators.RPAREN;
    }
}
