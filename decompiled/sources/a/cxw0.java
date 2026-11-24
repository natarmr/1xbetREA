package a;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class cxw0 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5145a;
    public final BlockingQueue b;
    public boolean c = false;
    public final /* synthetic */ fxw0 d;

    public cxw0(fxw0 fxw0Var, String str, BlockingQueue blockingQueue) {
        this.d = fxw0Var;
        s0x.H(blockingQueue);
        this.f5145a = new Object();
        this.b = blockingQueue;
        setName(str);
    }

    public final void a() {
        fxw0 fxw0Var = this.d;
        synchronized (fxw0Var.j) {
            try {
                if (!this.c) {
                    fxw0Var.k.release();
                    fxw0Var.j.notifyAll();
                    if (this == fxw0Var.d) {
                        fxw0Var.d = null;
                    } else if (this == fxw0Var.e) {
                        fxw0Var.e = null;
                    } else {
                        uuw0 uuw0Var = ((kxw0) fxw0Var.b).f;
                        kxw0.g(uuw0Var);
                        uuw0Var.g.a("Current scheduler thread is neither worker nor network");
                    }
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.d.k.acquire();
                z = true;
            } catch (InterruptedException e) {
                uuw0 uuw0Var = ((kxw0) this.d.b).f;
                kxw0.g(uuw0Var);
                uuw0Var.j.b(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.b;
                axw0 axw0Var = (axw0) blockingQueue.poll();
                if (axw0Var != null) {
                    Process.setThreadPriority(true != axw0Var.b ? 10 : threadPriority);
                    axw0Var.run();
                } else {
                    Object obj = this.f5145a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.d.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                uuw0 uuw0Var2 = ((kxw0) this.d.b).f;
                                kxw0.g(uuw0Var2);
                                uuw0Var2.j.b(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.d.j) {
                        if (this.b.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
