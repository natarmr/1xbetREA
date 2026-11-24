package a;

/* JADX INFO: loaded from: classes3.dex */
public final class qvj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cx6 f29389a;
    public final lnb0 b;
    public final jwo0 c;
    public final d0d d;

    public qvj0(cx6 cx6Var, lnb0 lnb0Var, jwo0 jwo0Var, d0d d0dVar) {
        this.f29389a = cx6Var;
        this.b = lnb0Var;
        this.c = jwo0Var;
        this.d = d0dVar;
    }

    public static qvj0 a(qvj0 qvj0Var, cx6 cx6Var, lnb0 lnb0Var, jwo0 jwo0Var, d0d d0dVar, int i) {
        if ((i & 1) != 0) {
            cx6Var = qvj0Var.f29389a;
        }
        if ((i & 2) != 0) {
            lnb0Var = qvj0Var.b;
        }
        if ((i & 4) != 0) {
            jwo0Var = qvj0Var.c;
        }
        if ((i & 8) != 0) {
            d0dVar = qvj0Var.d;
        }
        qvj0Var.getClass();
        qvj0Var.getClass();
        return new qvj0(cx6Var, lnb0Var, jwo0Var, d0dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvj0)) {
            return false;
        }
        qvj0 qvj0Var = (qvj0) obj;
        return this.f29389a.equals(qvj0Var.f29389a) && this.b.equals(qvj0Var.b) && this.c.equals(qvj0Var.c) && this.d.equals(qvj0Var.d);
    }

    public final int hashCode() {
        return (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f29389a.hashCode() * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "SimpleBetStateModel(betFieldState=" + this.f29389a + ", possibleWinStateModel=" + this.b + ", taxStateModel=" + this.c + ", coefficientModel=" + this.d + ", infoLine=null)";
    }
}
