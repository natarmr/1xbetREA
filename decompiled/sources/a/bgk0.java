package a;

/* JADX INFO: loaded from: classes.dex */
public final class bgk0 extends e8m0 {
    public int c;

    public bgk0(long j, int i) {
        super(j);
        this.c = i;
    }

    @Override // a.e8m0
    public final void a(e8m0 e8m0Var) {
        e8m0Var.getClass();
        this.c = ((bgk0) e8m0Var).c;
    }

    @Override // a.e8m0
    public final e8m0 b(long j) {
        return new bgk0(j, this.c);
    }
}
