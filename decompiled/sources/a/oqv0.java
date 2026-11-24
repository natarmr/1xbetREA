package a;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class oqv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f25709a = wv00.h("WorkerWrapper");

    public static final Object a(ig00 ig00Var, og00 og00Var, bnn0 bnn0Var) {
        Object obj;
        try {
            if (!ig00Var.isDone()) {
                n5a n5aVar = new n5a(1, pnx.b(bnn0Var));
                n5aVar.r();
                ig00Var.a(new lfr(ig00Var, n5aVar), zmk.f44629a);
                n5aVar.t(new xlr0(og00Var, ig00Var, (byte) 12));
                Object objP = n5aVar.p();
                wne wneVar = wne.f39444a;
                return objP;
            }
            boolean z = false;
            while (true) {
                try {
                    obj = ig00Var.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
