package a;

/* JADX INFO: loaded from: classes.dex */
public final class y7r extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z7r f42166a;
    public final Throwable b;

    public y7r(z7r z7rVar, Throwable th) {
        super(th);
        this.f42166a = z7rVar;
        this.b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.b;
    }
}
