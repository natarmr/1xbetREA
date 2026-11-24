package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class u66 implements w66 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sws0 f35123a;
    public final sws0 b;
    public final z1m c;

    public u66(sws0 sws0Var, sws0 sws0Var2, z1m z1mVar) {
        this.f35123a = sws0Var;
        this.b = sws0Var2;
        this.c = z1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u66)) {
            return false;
        }
        u66 u66Var = (u66) obj;
        return this.f35123a.equals(u66Var.f35123a) && this.b.equals(u66Var.b) && this.c.equals(u66Var.c);
    }

    public final int hashCode() {
        return this.c.f43628a.hashCode() + ((this.b.hashCode() + (this.f35123a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TwoOpponents(firstOpponentModel=" + this.f35123a + ", secondOpponentModel=" + this.b + ", score=" + this.c + Separators.RPAREN;
    }
}
