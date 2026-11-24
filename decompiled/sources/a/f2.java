package a;

/* JADX INFO: loaded from: classes2.dex */
public final class f2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2 f8791a;
    public final ig00 b;

    public f2(l2 l2Var, ig00 ig00Var) {
        this.f8791a = l2Var;
        this.b = ig00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f8791a.f29706a != this) {
            return;
        }
        Object objJ = l2.j(this.b);
        if (r2.g.b0(this.f8791a, this, objJ)) {
            l2.g(this.f8791a, false);
        }
    }
}
