package a;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class bmu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hmu0 f2855a;
    public static final uob b;
    public static final uob c;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2855a = new imu0();
        } else {
            f2855a = new hmu0();
        }
        b = new uob(Float.class, "translationAlpha", (byte) 16);
        c = new uob(Rect.class, "clipBounds", (byte) 17);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f2855a.I(view, i, i2, i3, i4);
    }

    public static void b(View view, float f) {
        f2855a.A(view, f);
    }

    public static void c(View view, int i) {
        f2855a.J(view, i);
    }
}
