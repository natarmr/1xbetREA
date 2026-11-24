package a;

/* JADX INFO: loaded from: classes.dex */
public final class x7m0 extends e8m0 {
    public j4 c;
    public int d;
    public int e;

    public x7m0(long j, j4 j4Var) {
        super(j);
        this.c = j4Var;
    }

    @Override // a.e8m0
    public final void a(e8m0 e8m0Var) {
        synchronized (p8a.l) {
            e8m0Var.getClass();
            this.c = ((x7m0) e8m0Var).c;
            this.d = ((x7m0) e8m0Var).d;
            this.e = ((x7m0) e8m0Var).e;
        }
    }

    @Override // a.e8m0
    public final e8m0 b(long j) {
        return new x7m0(j, this.c);
    }
}
