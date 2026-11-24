package a;

/* JADX INFO: loaded from: classes.dex */
public final class fvk implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final evk f10219a;
    public boolean b;
    public final /* synthetic */ hvk c;

    public fvk(hvk hvkVar, evk evkVar) {
        this.c = hvkVar;
        this.f10219a = evkVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        hvk hvkVar = this.c;
        synchronized (hvkVar.h) {
            evk evkVar = this.f10219a;
            int i = evkVar.h - 1;
            evkVar.h = i;
            if (i == 0 && evkVar.f) {
                hvkVar.r(evkVar);
            }
        }
    }
}
