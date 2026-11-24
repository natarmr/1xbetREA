package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s4o0 implements v4o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sws0 f31618a;
    public final sws0 b;
    public final z1m c;

    public s4o0(sws0 sws0Var, sws0 sws0Var2, z1m z1mVar) {
        this.f31618a = sws0Var;
        this.b = sws0Var2;
        this.c = z1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4o0)) {
            return false;
        }
        s4o0 s4o0Var = (s4o0) obj;
        return this.f31618a.equals(s4o0Var.f31618a) && this.b.equals(s4o0Var.b) && this.c.equals(s4o0Var.c);
    }

    public final int hashCode() {
        return this.c.f43628a.hashCode() + ((this.b.hashCode() + (this.f31618a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Fighting(firstOpponentModel=" + this.f31618a + ", secondOpponentModel=" + this.b + ", score=" + this.c + Separators.RPAREN;
    }
}
