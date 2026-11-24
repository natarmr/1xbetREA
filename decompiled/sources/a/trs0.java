package a;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class trs0 extends epq implements RunnableFuture {
    public volatile srs0 i;

    public trs0(Callable callable) {
        this.i = new srs0(this, callable);
    }

    @Override // a.l2
    public final void e() {
        srs0 srs0Var;
        if (p() && (srs0Var = this.i) != null) {
            tsn tsnVar = srs0.e;
            tsn tsnVar2 = srs0.d;
            Runnable runnable = (Runnable) srs0Var.get();
            if (runnable instanceof Thread) {
                wmx wmxVar = new wmx(srs0Var);
                wmxVar.a(Thread.currentThread());
                if (srs0Var.compareAndSet(runnable, wmxVar)) {
                    try {
                        ((Thread) runnable).interrupt();
                        if (((Runnable) srs0Var.getAndSet(tsnVar2)) == tsnVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) srs0Var.getAndSet(tsnVar2)) == tsnVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.i = null;
    }

    @Override // a.l2
    public final String l() {
        srs0 srs0Var = this.i;
        if (srs0Var == null) {
            return super.l();
        }
        return "task=[" + srs0Var + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        srs0 srs0Var = this.i;
        if (srs0Var != null) {
            srs0Var.run();
        }
        this.i = null;
    }
}
