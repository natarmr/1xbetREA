package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z2o0 implements a3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2n f43680a;
    public final m2n b;
    public final y1m c;
    public final String d;

    public z2o0(m2n m2nVar, m2n m2nVar2, y1m y1mVar, String str) {
        this.f43680a = m2nVar;
        this.b = m2nVar2;
        this.c = y1mVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2o0)) {
            return false;
        }
        z2o0 z2o0Var = (z2o0) obj;
        return this.f43680a.equals(z2o0Var.f43680a) && this.b.equals(z2o0Var.b) && this.c.equals(z2o0Var.c) && this.d.equals(z2o0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f43680a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WinningFormula(firstOpponent=" + this.f43680a + ", secondOpponent=" + this.b + ", scoreModel=" + this.c + ", gameLabel=" + this.d + Separators.RPAREN;
    }
}
