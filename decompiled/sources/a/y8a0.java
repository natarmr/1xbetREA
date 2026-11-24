package a;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class y8a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x8a0 f42187a;
    public final dmo b;
    public short c;
    public Object d;
    public final Looper e;
    public boolean f;

    public y8a0(dmo dmoVar, x8a0 x8a0Var, bmq0 bmq0Var, int i, Looper looper) {
        this.b = dmoVar;
        this.f42187a = x8a0Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        x0x.K(!this.f);
        this.f = true;
        dmo dmoVar = this.b;
        if (!dmoVar.k1 && dmoVar.i.getThread().isAlive()) {
            dmoVar.g.c(14, this).b();
        } else {
            f1t0.g0("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
