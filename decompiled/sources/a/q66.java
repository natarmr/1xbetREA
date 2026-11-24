package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q66 implements w66 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sws0 f28186a;
    public final sws0 b;
    public final z1m c;

    public q66(sws0 sws0Var, sws0 sws0Var2, z1m z1mVar) {
        this.f28186a = sws0Var;
        this.b = sws0Var2;
        this.c = z1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q66)) {
            return false;
        }
        q66 q66Var = (q66) obj;
        return this.f28186a.equals(q66Var.f28186a) && this.b.equals(q66Var.b) && this.c.equals(q66Var.c);
    }

    public final int hashCode() {
        return this.c.f43628a.hashCode() + ((this.b.hashCode() + (this.f28186a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Cyber(firstOpponentModel=" + this.f28186a + ", secondOpponentModel=" + this.b + ", score=" + this.c + Separators.RPAREN;
    }
}
