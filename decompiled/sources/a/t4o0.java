package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class t4o0 implements v4o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sws0 f33331a;
    public final sws0 b;
    public final z1m c;

    public t4o0(sws0 sws0Var, sws0 sws0Var2, z1m z1mVar) {
        this.f33331a = sws0Var;
        this.b = sws0Var2;
        this.c = z1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4o0)) {
            return false;
        }
        t4o0 t4o0Var = (t4o0) obj;
        return this.f33331a.equals(t4o0Var.f33331a) && this.b.equals(t4o0Var.b) && this.c.equals(t4o0Var.c);
    }

    public final int hashCode() {
        return this.c.f43628a.hashCode() + ((this.b.hashCode() + (this.f33331a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Roulette(firstOpponentModel=" + this.f33331a + ", secondOpponentModel=" + this.b + ", score=" + this.c + Separators.RPAREN;
    }
}
