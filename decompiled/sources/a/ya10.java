package a;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ya10 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42273a;
    public final /* synthetic */ bb10 b;

    public /* synthetic */ ya10(bb10 bb10Var, byte b) {
        this.f42273a = b;
        this.b = bb10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f42273a;
        bb10 bb10Var = this.b;
        switch (b) {
            case 0:
                Drawable.Callback callback = bb10Var.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(bb10Var);
                    return;
                }
                return;
            default:
                Semaphore semaphore = bb10Var.n1;
                uld uldVar = bb10Var.o;
                if (uldVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    uldVar.r(bb10Var.b.a());
                    if (bb10.t1 && bb10Var.l1) {
                        Handler handler = bb10Var.o1;
                        if (handler == null) {
                            handler = new Handler(Looper.getMainLooper());
                            bb10Var.o1 = handler;
                            bb10Var.p1 = new ya10(bb10Var, (byte) 0);
                        }
                        handler.post(bb10Var.p1);
                    }
                    break;
                } catch (InterruptedException unused) {
                } finally {
                    semaphore.release();
                }
                return;
        }
    }
}
