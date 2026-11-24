package a;

/* JADX INFO: loaded from: classes2.dex */
public final class nuo0 extends cuo0 {
    public final Runnable c;

    public nuo0(Runnable runnable, long j, boolean z) {
        super(z, j);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(qjj.R(runnable));
        sb.append(", ");
        sb.append(this.f4997a);
        sb.append(", ");
        return axq.m(sb, this.b ? "Blocking" : "Non-blocking", ']');
    }
}
