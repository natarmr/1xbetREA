package a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n5 extends epq implements Runnable {
    public static final /* synthetic */ int k = 0;
    public ig00 i;
    public Object j;

    public n5(ig00 ig00Var, Object obj) {
        ig00Var.getClass();
        this.i = ig00Var;
        this.j = obj;
    }

    public static l5 q(ig00 ig00Var, yy3 yy3Var, Executor executor) {
        l5 l5Var = new l5(ig00Var, yy3Var);
        ig00Var.a(l5Var, n2x.I(executor, l5Var));
        return l5Var;
    }

    @Override // a.l2
    public final void e() {
        ig00 ig00Var = this.i;
        if ((ig00Var != null) & (this.f29706a instanceof e2)) {
            ig00Var.cancel(p());
        }
        this.i = null;
        this.j = null;
    }

    @Override // a.l2
    public final String l() {
        String str;
        ig00 ig00Var = this.i;
        Object obj = this.j;
        String strL = super.l();
        if (ig00Var != null) {
            str = "inputFuture=[" + ig00Var + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strL != null) {
                return str.concat(strL);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    public Object r(Object obj, Object obj2) {
        yy3 yy3Var = (yy3) obj;
        ig00 ig00VarApply = yy3Var.apply(obj2);
        x0x.E(ig00VarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", yy3Var);
        return ig00VarApply;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ig00 ig00Var = this.i;
        Object obj = this.j;
        if (((this.f29706a instanceof e2) | (ig00Var == null)) || (obj == null)) {
            return;
        }
        this.i = null;
        if (ig00Var.isCancelled()) {
            o(ig00Var);
            return;
        }
        try {
            try {
                Object objR = r(obj, hkb.E(ig00Var));
                this.j = null;
                s(objR);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    n(th);
                } finally {
                    this.j = null;
                }
            }
        } catch (Error e) {
            n(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            n(e2.getCause());
        } catch (Exception e3) {
            n(e3);
        }
    }

    public void s(Object obj) {
        o((ig00) obj);
    }
}
