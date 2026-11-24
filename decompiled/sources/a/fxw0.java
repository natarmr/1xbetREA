package a;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class fxw0 extends ryw0 {
    public static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);
    public cxw0 d;
    public cxw0 e;
    public final PriorityBlockingQueue f;
    public final LinkedBlockingQueue g;
    public final zww0 h;
    public final zww0 i;
    public final Object j;
    public final Semaphore k;

    public fxw0(kxw0 kxw0Var) {
        super(kxw0Var);
        this.j = new Object();
        this.k = new Semaphore(2);
        this.f = new PriorityBlockingQueue();
        this.g = new LinkedBlockingQueue();
        this.h = new zww0(this, "Thread death: Uncaught exception on worker thread");
        this.i = new zww0(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // a.p4
    public final void m1() {
        if (Thread.currentThread() == this.d) {
            return;
        }
        jf4.n("Call expected from worker thread");
    }

    @Override // a.ryw0
    public final boolean n1() {
        return false;
    }

    public final void q1() {
        if (Thread.currentThread() == this.e) {
            return;
        }
        jf4.n("Call expected from network thread");
    }

    public final void r1() {
        if (Thread.currentThread() != this.d) {
            return;
        }
        jf4.n("Call not expected from worker thread");
    }

    public final boolean s1() {
        return Thread.currentThread() == this.d;
    }

    public final axw0 t1(Callable callable) {
        o1();
        axw0 axw0Var = new axw0(this, callable, false);
        if (Thread.currentThread() != this.d) {
            z1(axw0Var);
            return axw0Var;
        }
        if (!this.f.isEmpty()) {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.j.a("Callable skipped the worker queue.");
        }
        axw0Var.run();
        return axw0Var;
    }

    public final axw0 u1(Callable callable) {
        o1();
        axw0 axw0Var = new axw0(this, callable, true);
        if (Thread.currentThread() == this.d) {
            axw0Var.run();
            return axw0Var;
        }
        z1(axw0Var);
        return axw0Var;
    }

    public final void v1(Runnable runnable) {
        o1();
        s0x.H(runnable);
        z1(new axw0(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object w1(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            fxw0 fxw0Var = ((kxw0) this.b).g;
            kxw0.g(fxw0Var);
            fxw0Var.v1(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                uuw0 uuw0Var = ((kxw0) this.b).f;
                kxw0.g(uuw0Var);
                quw0 quw0Var = uuw0Var.j;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                quw0Var.a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            uuw0 uuw0Var2 = ((kxw0) this.b).f;
            kxw0.g(uuw0Var2);
            uuw0Var2.j.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void x1(Runnable runnable) {
        o1();
        z1(new axw0(this, runnable, true, "Task exception on worker thread"));
    }

    public final void y1(Runnable runnable) {
        o1();
        axw0 axw0Var = new axw0(this, runnable, false, "Task exception on network thread");
        synchronized (this.j) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.g;
                linkedBlockingQueue.add(axw0Var);
                cxw0 cxw0Var = this.e;
                if (cxw0Var == null) {
                    cxw0 cxw0Var2 = new cxw0(this, "Measurement Network", linkedBlockingQueue);
                    this.e = cxw0Var2;
                    cxw0Var2.setUncaughtExceptionHandler(this.i);
                    this.e.start();
                } else {
                    Object obj = cxw0Var.f5145a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z1(axw0 axw0Var) {
        synchronized (this.j) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f;
                priorityBlockingQueue.add(axw0Var);
                cxw0 cxw0Var = this.d;
                if (cxw0Var == null) {
                    cxw0 cxw0Var2 = new cxw0(this, "Measurement Worker", priorityBlockingQueue);
                    this.d = cxw0Var2;
                    cxw0Var2.setUncaughtExceptionHandler(this.h);
                    this.d.start();
                } else {
                    Object obj = cxw0Var.f5145a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
