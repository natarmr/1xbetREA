package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q4o0 implements v4o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sws0 f28109a;
    public final sws0 b;
    public final z1m c;

    public q4o0(sws0 sws0Var, sws0 sws0Var2, z1m z1mVar) {
        this.f28109a = sws0Var;
        this.b = sws0Var2;
        this.c = z1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4o0)) {
            return false;
        }
        q4o0 q4o0Var = (q4o0) obj;
        return this.f28109a.equals(q4o0Var.f28109a) && this.b.equals(q4o0Var.b) && this.c.equals(q4o0Var.c);
    }

    public final int hashCode() {
        return this.c.f43628a.hashCode() + ((this.b.hashCode() + (this.f28109a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Dice(firstOpponentModel=" + this.f28109a + ", secondOpponentModel=" + this.b + ", score=" + this.c + Separators.RPAREN;
    }
}
