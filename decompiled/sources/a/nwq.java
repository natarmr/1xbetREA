package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nwq implements s5k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5k0 f24246a;

    public nwq(s5k0 s5k0Var) {
        s5k0Var.getClass();
        this.f24246a = s5k0Var;
    }

    @Override // a.s5k0
    public void F0(f99 f99Var, long j) {
        this.f24246a.F0(f99Var, j);
    }

    @Override // a.s5k0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f24246a.close();
    }

    @Override // a.s5k0, java.io.Flushable
    public void flush() {
        this.f24246a.flush();
    }

    @Override // a.s5k0
    public final fmq0 h() {
        return this.f24246a.h();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f24246a + ')';
    }
}
