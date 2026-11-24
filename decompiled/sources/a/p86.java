package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class p86 implements r86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xws0 f26539a;
    public final xws0 b;
    public final y1m c;

    public p86(xws0 xws0Var, xws0 xws0Var2, y1m y1mVar) {
        this.f26539a = xws0Var;
        this.b = xws0Var2;
        this.c = y1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p86)) {
            return false;
        }
        p86 p86Var = (p86) obj;
        return this.f26539a.equals(p86Var.f26539a) && this.b.equals(p86Var.b) && this.c.equals(p86Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f26539a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TwoOpponents(firstOpponentModel=" + this.f26539a + ", secondOpponentModel=" + this.b + ", score=" + this.c + Separators.RPAREN;
    }
}
