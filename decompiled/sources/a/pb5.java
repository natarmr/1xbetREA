package a;

import android.os.Build;
import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class pb5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26689a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pb5(BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        backEvent.getClass();
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.f26689a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }

    public pb5(float f, float f2, float f3, int i, long j) {
        this.f26689a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pb5(xe50 xe50Var) {
        this(xe50Var.c, xe50Var.d, xe50Var.b, xe50Var.f40728a, xe50Var.e);
        xe50Var.getClass();
    }
}
