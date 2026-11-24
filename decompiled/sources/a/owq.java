package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class owq implements emk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final emk0 f25976a;

    public owq(emk0 emk0Var) {
        emk0Var.getClass();
        this.f25976a = emk0Var;
    }

    @Override // a.emk0
    public long Y(f99 f99Var, long j) {
        f99Var.getClass();
        return this.f25976a.Y(f99Var, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f25976a.close();
    }

    @Override // a.emk0
    public final fmq0 h() {
        return this.f25976a.h();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f25976a + ')';
    }
}
