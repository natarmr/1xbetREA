package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xfd implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40785a = SystemClock.uptimeMillis() + 10000;
    public Runnable b;
    public boolean c;
    public final /* synthetic */ agd d;

    public xfd(agd agdVar) {
        this.d = agdVar;
    }

    public final void a(View view) {
        view.getClass();
        if (this.c) {
            return;
        }
        this.c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        decorView.getClass();
        if (!this.c) {
            decorView.postOnAnimation(new w1((Object) this, (byte) 27));
        } else if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f40785a) {
                this.c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.b = null;
        zcr zcrVar = (zcr) this.d.g.getValue();
        synchronized (zcrVar.b) {
            z = zcrVar.c;
        }
        if (z) {
            this.c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
