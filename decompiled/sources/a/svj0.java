package a;

/* JADX INFO: loaded from: classes3.dex */
public final class svj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ex6 f32870a;
    public final nnb0 b;
    public final lwo0 c;

    public svj0(ex6 ex6Var, nnb0 nnb0Var, lwo0 lwo0Var) {
        this.f32870a = ex6Var;
        this.b = nnb0Var;
        this.c = lwo0Var;
    }

    public static svj0 a(svj0 svj0Var, ex6 ex6Var, nnb0 nnb0Var, lwo0 lwo0Var, int i) {
        if ((i & 1) != 0) {
            ex6Var = svj0Var.f32870a;
        }
        if ((i & 2) != 0) {
            nnb0Var = svj0Var.b;
        }
        if ((i & 4) != 0) {
            lwo0Var = svj0Var.c;
        }
        svj0Var.getClass();
        svj0Var.getClass();
        return new svj0(ex6Var, nnb0Var, lwo0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svj0)) {
            return false;
        }
        svj0 svj0Var = (svj0) obj;
        return this.f32870a.equals(svj0Var.f32870a) && this.b.equals(svj0Var.b) && this.c.equals(svj0Var.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() + ((this.b.hashCode() + (this.f32870a.hashCode() * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "SimpleBetStateModel(betFieldState=" + this.f32870a + ", possibleWinStateModel=" + this.b + ", taxStateModel=" + this.c + ", infoLine=null)";
    }
}
