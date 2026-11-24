package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class p66 implements w66 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sws0 f26439a;
    public final sws0 b;
    public final z1m c;

    public p66(sws0 sws0Var, sws0 sws0Var2, z1m z1mVar) {
        this.f26439a = sws0Var;
        this.b = sws0Var2;
        this.c = z1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p66)) {
            return false;
        }
        p66 p66Var = (p66) obj;
        return this.f26439a.equals(p66Var.f26439a) && this.b.equals(p66Var.b) && this.c.equals(p66Var.c);
    }

    public final int hashCode() {
        return this.c.f43628a.hashCode() + ((this.b.hashCode() + (this.f26439a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Cricket(firstOpponentModel=" + this.f26439a + ", secondOpponentModel=" + this.b + ", score=" + this.c + Separators.RPAREN;
    }
}
