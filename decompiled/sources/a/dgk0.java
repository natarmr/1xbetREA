package a;

/* JADX INFO: loaded from: classes.dex */
public final class dgk0 extends e8m0 {
    public long c;

    public dgk0(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // a.e8m0
    public final void a(e8m0 e8m0Var) {
        e8m0Var.getClass();
        this.c = ((dgk0) e8m0Var).c;
    }

    @Override // a.e8m0
    public final e8m0 b(long j) {
        return new dgk0(j, this.c);
    }
}
