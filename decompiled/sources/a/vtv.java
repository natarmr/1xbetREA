package a;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public final class vtv extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ani0 f38026a;
    public final ntv b;
    public boolean c = true;
    public boolean d;

    public vtv(ani0 ani0Var, ntv ntvVar) {
        this.f38026a = ani0Var;
        this.b = ntvVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Canvas canvasLockCanvas;
        super.run();
        while (this.c) {
            Canvas canvas = null;
            if (this.d && (canvasLockCanvas = ((ntv) this.f38026a.f1155a).lockCanvas()) != null) {
                synchronized (this.f38026a) {
                    this.b.a(canvasLockCanvas);
                    this.d = false;
                }
                canvas = canvasLockCanvas;
            }
            if (canvas != null) {
                ((ntv) this.f38026a.f1155a).unlockCanvasAndPost(canvas);
            }
        }
    }
}
