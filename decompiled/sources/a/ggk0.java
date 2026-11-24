package a;

/* JADX INFO: loaded from: classes.dex */
public final class ggk0 extends e8m0 {
    public Object c;

    public ggk0(Object obj, long j) {
        super(j);
        this.c = obj;
    }

    @Override // a.e8m0
    public final void a(e8m0 e8m0Var) {
        e8m0Var.getClass();
        this.c = ((ggk0) e8m0Var).c;
    }

    @Override // a.e8m0
    public final e8m0 b(long j) {
        return new ggk0(this.c, j);
    }
}
