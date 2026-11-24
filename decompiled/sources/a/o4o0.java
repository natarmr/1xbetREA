package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class o4o0 implements v4o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sws0 f24649a;
    public final sws0 b;
    public final z1m c;

    public o4o0(sws0 sws0Var, sws0 sws0Var2, z1m z1mVar) {
        this.f24649a = sws0Var;
        this.b = sws0Var2;
        this.c = z1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4o0)) {
            return false;
        }
        o4o0 o4o0Var = (o4o0) obj;
        return this.f24649a.equals(o4o0Var.f24649a) && this.b.equals(o4o0Var.b) && this.c.equals(o4o0Var.c);
    }

    public final int hashCode() {
        return this.c.f43628a.hashCode() + ((this.b.hashCode() + (this.f24649a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CardGame(firstOpponentModel=" + this.f24649a + ", secondOpponentModel=" + this.b + ", score=" + this.c + Separators.RPAREN;
    }
}
