package a;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class r23 extends lne {
    public static final n0o0 m = maz.b(new t32(27));
    public static final y50 n = new y50(4);
    public final Choreographer c;
    public final Handler d;
    public boolean i;
    public boolean j;
    public final t23 l;
    public final Object e = new Object();
    public final xw3 f = new xw3();
    public ArrayList g = new ArrayList();
    public ArrayList h = new ArrayList();
    public final q23 k = new q23(this);

    public r23(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.l = new t23(choreographer, this);
    }

    @Override // a.lne
    public final void q(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.e) {
            this.f.addLast(runnable);
            if (!this.i) {
                this.i = true;
                this.d.post(this.k);
                if (!this.j) {
                    this.j = true;
                    this.c.postFrameCallback(this.k);
                }
            }
        }
    }

    public final void x() {
        Runnable runnable;
        boolean z;
        do {
            synchronized (this.e) {
                xw3 xw3Var = this.f;
                runnable = (Runnable) (xw3Var.isEmpty() ? null : xw3Var.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.e) {
                    xw3 xw3Var2 = this.f;
                    runnable = (Runnable) (xw3Var2.isEmpty() ? null : xw3Var2.removeFirst());
                }
            }
            synchronized (this.e) {
                if (this.f.isEmpty()) {
                    z = false;
                    this.i = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
