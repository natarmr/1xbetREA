package a;

import android.view.Choreographer;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
public final class xeu0 extends weu0 implements Choreographer.FrameCallback {
    @Override // a.weu0
    public final void a() {
        long refreshRate;
        this.b.registerDisplayListener(this, vtt0.n(null));
        this.f39037a.removeFrameCallback(this);
        this.f39037a.postFrameCallback(this);
        Display display = this.b.getDisplay(0);
        if (display != null) {
            refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
        } else {
            f1t0.g0("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            refreshRate = -9223372036854775807L;
        }
        this.d = refreshRate;
    }

    @Override // a.weu0
    public final void b() {
        this.b.unregisterDisplayListener(this);
        this.f39037a.removeFrameCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.c = j;
        this.f39037a.removeFrameCallback(this);
        this.f39037a.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long refreshRate;
        if (i == 0) {
            this.f39037a.removeFrameCallback(this);
            this.f39037a.postFrameCallback(this);
            Display display = this.b.getDisplay(0);
            if (display != null) {
                refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            } else {
                f1t0.g0("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                refreshRate = -9223372036854775807L;
            }
            this.d = refreshRate;
        }
    }
}
