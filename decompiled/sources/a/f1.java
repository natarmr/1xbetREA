package a;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f1 extends epq implements Runnable {
    public static final /* synthetic */ int l = 0;
    public ig00 i;
    public Class j;
    public Object k;

    public f1(ig00 ig00Var, Class cls, Object obj) {
        this.i = ig00Var;
        this.j = cls;
        this.k = obj;
    }

    @Override // a.l2
    public final void e() {
        ig00 ig00Var = this.i;
        if ((ig00Var != null) & (this.f29706a instanceof e2)) {
            ig00Var.cancel(p());
        }
        this.i = null;
        this.j = null;
        this.k = null;
    }

    @Override // a.l2
    public final String l() {
        String str;
        ig00 ig00Var = this.i;
        Class cls = this.j;
        Object obj = this.k;
        String strL = super.l();
        if (ig00Var != null) {
            str = "inputFuture=[" + ig00Var + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strL != null) {
                return str.concat(strL);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    public Object q(Object obj, Throwable th) {
        yy3 yy3Var = (yy3) obj;
        ig00 ig00VarApply = yy3Var.apply(th);
        x0x.E(ig00VarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", yy3Var);
        return ig00VarApply;
    }

    public void r(Object obj) {
        o((ig00) obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objE;
        ig00 ig00Var = this.i;
        Class cls = this.j;
        Object obj = this.k;
        if (((obj == null) || ((ig00Var == null) | (cls == null))) || (this.f29706a instanceof e2)) {
            return;
        }
        this.i = null;
        try {
            th = ig00Var instanceof r2 ? ((r2) ig00Var).c() : null;
            objE = th == null ? hkb.E(ig00Var) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + ig00Var.getClass() + " threw " + e.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            m(objE);
            return;
        }
        if (!cls.isInstance(th)) {
            o(ig00Var);
            return;
        }
        try {
            Object objQ = q(obj, th);
            this.j = null;
            this.k = null;
            r(objQ);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                n(th2);
            } finally {
                this.j = null;
                this.k = null;
            }
        }
    }
}
