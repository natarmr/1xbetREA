package a;

/* JADX INFO: loaded from: classes.dex */
public final class abe0 implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fvk f574a;

    public abe0(fvk fvkVar) {
        this.f574a = fvkVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f574a.close();
    }
}
