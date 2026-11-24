package a;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* JADX INFO: loaded from: classes.dex */
public final class yeu0 extends weu0 implements Choreographer$VsyncCallback {
    public final Handler e;

    public yeu0(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.e = vtt0.n(null);
    }

    @Override // a.weu0
    public final void a() {
        this.b.registerDisplayListener(this, vtt0.n(null));
        Choreographer choreographer = this.f39037a;
        choreographer.removeVsyncCallback(this);
        choreographer.postVsyncCallback(this);
    }

    @Override // a.weu0
    public final void b() {
        this.b.unregisterDisplayListener(this);
        this.e.removeCallbacksAndMessages(null);
        this.f39037a.removeVsyncCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.e.removeCallbacksAndMessages(null);
            Choreographer choreographer = this.f39037a;
            choreographer.removeVsyncCallback(this);
            choreographer.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.c = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.d = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.d = -9223372036854775807L;
        }
        this.e.removeCallbacksAndMessages(null);
        this.e.postDelayed(new apj0((Object) this, (byte) 21), 500L);
    }
}
