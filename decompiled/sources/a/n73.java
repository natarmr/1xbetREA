package a;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f23021a = new LinearInterpolator();
    public static final f0p b = new f0p((byte) 1);
    public static final f0p c = new f0p((byte) 0);
    public static final f0p d = new f0p((byte) 2);
    public static final DecelerateInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return rw2.a(f2, f, f3, f);
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        return f5 >= f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(int i, float f, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }
}
