package a;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public abstract class weu0 implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Choreographer f39037a;
    public final DisplayManager b;
    public volatile long c = -9223372036854775807L;
    public volatile long d = -9223372036854775807L;

    public weu0(Choreographer choreographer, DisplayManager displayManager) {
        this.f39037a = choreographer;
        this.b = displayManager;
    }

    public abstract void a();

    public abstract void b();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
