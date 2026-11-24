package a;

/* JADX INFO: loaded from: classes2.dex */
public final class er40 extends k2 implements Runnable {
    public final Runnable h;

    public er40(Runnable runnable) {
        runnable.getClass();
        this.h = runnable;
    }

    @Override // a.l2
    public final String l() {
        return "task=[" + this.h + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } catch (Throwable th) {
            n(th);
            throw th;
        }
    }
}
