package a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class h04 implements Runnable {
    public static Handler f;
    public final /* synthetic */ saw0 e;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rb10 f12214a = new rb10(this, new jmv(this, 1));

    public h04(saw0 saw0Var) {
        this.e = saw0Var;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (h04.class) {
            try {
                handler = f;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    f = handler;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new mfr(this, obj, false, (byte) 11));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a();
    }
}
