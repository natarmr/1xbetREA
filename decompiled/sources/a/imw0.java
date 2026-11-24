package a;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class imw0 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f15047a;
    public final short b;
    public final CountDownLatch c;

    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public imw0(u40 u40Var, long j) {
        super("AdIdClientAutoDisconnectThread");
        this.f15047a = new WeakReference(u40Var);
        this.b = (int) j;
        this.c = new CountDownLatch(1);
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        u40 u40Var;
        WeakReference weakReference = this.f15047a;
        try {
            if (this.c.await(this.b, TimeUnit.MILLISECONDS) || (u40Var = (u40) weakReference.get()) == null) {
                return;
            }
            u40Var.c();
        } catch (InterruptedException unused) {
            u40 u40Var2 = (u40) weakReference.get();
            if (u40Var2 != null) {
                u40Var2.c();
            }
        }
    }
}
