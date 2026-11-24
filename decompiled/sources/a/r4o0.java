package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r4o0 implements v4o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sws0 f29846a;
    public final sws0 b;
    public final z1m c;

    public r4o0(sws0 sws0Var, sws0 sws0Var2, z1m z1mVar) {
        this.f29846a = sws0Var;
        this.b = sws0Var2;
        this.c = z1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4o0)) {
            return false;
        }
        r4o0 r4o0Var = (r4o0) obj;
        return this.f29846a.equals(r4o0Var.f29846a) && this.b.equals(r4o0Var.b) && this.c.equals(r4o0Var.c);
    }

    public final int hashCode() {
        return this.c.f43628a.hashCode() + ((this.b.hashCode() + (this.f29846a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DicePoker(firstOpponentModel=" + this.f29846a + ", secondOpponentModel=" + this.b + ", score=" + this.c + Separators.RPAREN;
    }
}
