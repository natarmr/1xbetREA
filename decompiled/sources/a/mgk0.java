package a;

/* JADX INFO: loaded from: classes.dex */
public final class mgk0 extends e8m0 {
    public eh90 c;
    public int d;

    public mgk0(long j, eh90 eh90Var) {
        super(j);
        this.c = eh90Var;
    }

    @Override // a.e8m0
    public final void a(e8m0 e8m0Var) {
        e8m0Var.getClass();
        mgk0 mgk0Var = (mgk0) e8m0Var;
        synchronized (q8a.h) {
            this.c = mgk0Var.c;
            this.d = mgk0Var.d;
        }
    }

    @Override // a.e8m0
    public final e8m0 b(long j) {
        return new mgk0(j, this.c);
    }
}
