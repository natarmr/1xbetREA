package a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public abstract class whl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u06 f39171a;
    public final Path b;
    public final Path c;
    public final PathMeasure d;
    public final Matrix e;

    public whl(u06 u06Var) {
        Path path = new Path();
        this.b = path;
        this.c = new Path();
        this.d = new PathMeasure(path, false);
        this.f39171a = u06Var;
        this.e = new Matrix();
    }

    public static float h(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public abstract void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2);

    public abstract void c(Canvas canvas, Paint paint, uhl uhlVar, int i);

    public abstract void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3);

    public int e() {
        u06 u06Var = this.f39171a;
        return (((k900) u06Var).l * 2) + ((k900) u06Var).f34840a;
    }

    public int f() {
        return -1;
    }

    public abstract void g();

    public void b(Canvas canvas, Paint paint, int i, int i2) {
    }
}
