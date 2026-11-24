package a;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class yfg0 extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f42542a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - f42542a) * ((double) f2)) + ((double) f));
    }

    public static float b(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f42542a) * ((double) f2)) + ((double) (f * 1.5f)));
    }
}
