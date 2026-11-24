package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class t66 implements w66 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sws0 f33400a;
    public final sws0 b;
    public final z1m c;

    public t66(sws0 sws0Var, sws0 sws0Var2, z1m z1mVar) {
        this.f33400a = sws0Var;
        this.b = sws0Var2;
        this.c = z1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t66)) {
            return false;
        }
        t66 t66Var = (t66) obj;
        return this.f33400a.equals(t66Var.f33400a) && this.b.equals(t66Var.b) && this.c.equals(t66Var.c);
    }

    public final int hashCode() {
        return this.c.f43628a.hashCode() + ((this.b.hashCode() + (this.f33400a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Tennis(firstOpponentModel=" + this.f33400a + ", secondOpponentModel=" + this.b + ", score=" + this.c + Separators.RPAREN;
    }
}
