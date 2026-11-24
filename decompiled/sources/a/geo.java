package a;

/* JADX INFO: loaded from: classes2.dex */
public final class geo extends heo {
    public final Runnable c;

    public geo(Runnable runnable, long j) {
        super(j);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // a.heo
    public final String toString() {
        return super.toString() + this.c;
    }
}
