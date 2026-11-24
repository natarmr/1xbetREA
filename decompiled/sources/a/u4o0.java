package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class u4o0 implements v4o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sws0 f35061a;
    public final sws0 b;
    public final z1m c;

    public u4o0(sws0 sws0Var, sws0 sws0Var2, z1m z1mVar) {
        this.f35061a = sws0Var;
        this.b = sws0Var2;
        this.c = z1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4o0)) {
            return false;
        }
        u4o0 u4o0Var = (u4o0) obj;
        return this.f35061a.equals(u4o0Var.f35061a) && this.b.equals(u4o0Var.b) && this.c.equals(u4o0Var.c);
    }

    public final int hashCode() {
        return this.c.f43628a.hashCode() + ((this.b.hashCode() + (this.f35061a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WinningFormula(firstOpponentModel=" + this.f35061a + ", secondOpponentModel=" + this.b + ", score=" + this.c + Separators.RPAREN;
    }
}
