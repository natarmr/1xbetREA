package a;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class srs0 extends AtomicReference implements Runnable {
    public static final tsn d;
    public static final tsn e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32695a = 0;
    public final /* synthetic */ trs0 b;
    public final Object c;

    static {
        byte b = 1;
        d = new tsn(b);
        e = new tsn(b);
    }

    public srs0(trs0 trs0Var, Callable callable) {
        this.b = trs0Var;
        callable.getClass();
        this.c = callable;
    }

    public final void a(Object obj) {
        byte b = this.f32695a;
        trs0 trs0Var = this.b;
        switch (b) {
            case 0:
                trs0Var.o((ig00) obj);
                break;
            default:
                trs0Var.m(obj);
                break;
        }
    }

    public final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        wmx wmxVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof wmx;
            tsn tsnVar = e;
            if (!z2 && runnable != tsnVar) {
                break;
            }
            if (z2) {
                wmxVar = (wmx) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == tsnVar || compareAndSet(runnable, tsnVar)) {
                z = Thread.interrupted() || z;
                LockSupport.park(wmxVar);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zIsDone;
        Thread threadCurrentThread = Thread.currentThread();
        Object objCall = null;
        if (compareAndSet(null, threadCurrentThread)) {
            byte b = this.f32695a;
            trs0 trs0Var = this.b;
            switch (b) {
                case 0:
                    zIsDone = trs0Var.isDone();
                    break;
                default:
                    zIsDone = trs0Var.isDone();
                    break;
            }
            tsn tsnVar = d;
            if (!zIsDone) {
                Object obj = this.c;
                try {
                    switch (b) {
                        case 0:
                            zas0 zas0Var = (zas0) obj;
                            Callable callable = (Callable) zas0Var.b;
                            ank ankVar = ank.f1158a;
                            trs0 trs0Var2 = new trs0(callable);
                            ankVar.execute(trs0Var2);
                            x0x.E(trs0Var2, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zas0Var);
                            objCall = trs0Var2;
                            break;
                        default:
                            objCall = ((Callable) obj).call();
                            break;
                    }
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, tsnVar)) {
                            b(threadCurrentThread);
                        }
                        if (zIsDone) {
                            return;
                        }
                        switch (b) {
                            case 0:
                                trs0Var.n(th);
                                return;
                            default:
                                trs0Var.n(th);
                                return;
                        }
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, tsnVar)) {
                            b(threadCurrentThread);
                        }
                        if (!zIsDone) {
                            a(objCall);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, tsnVar)) {
                b(threadCurrentThread);
            }
            if (zIsDone) {
                return;
            }
            a(objCall);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        String string;
        Runnable runnable = (Runnable) get();
        if (runnable == d) {
            str = "running=[DONE]";
        } else if (runnable instanceof wmx) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbT = brm0.t(str, ", ");
        byte b = this.f32695a;
        Object obj = this.c;
        switch (b) {
            case 0:
                string = ((zas0) obj).toString();
                break;
            default:
                string = ((Callable) obj).toString();
                break;
        }
        sbT.append(string);
        return sbT.toString();
    }

    public srs0(trs0 trs0Var, zas0 zas0Var) {
        this.b = trs0Var;
        this.c = zas0Var;
    }
}
