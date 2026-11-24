package a;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ulu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35892a;
    public final int b;
    public final ds40 c;
    public final int d;
    public final vkr0 f;
    public final Interpolator g;
    public float i;
    public float j;
    public final boolean m;
    public final vjy e = new vjy((byte) 0);
    public boolean h = false;
    public final Rect l = new Rect();
    public long k = System.nanoTime();

    public ulu0(vkr0 vkr0Var, ds40 ds40Var, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
        this.m = false;
        this.f = vkr0Var;
        this.c = ds40Var;
        this.d = i2;
        ArrayList arrayList = (ArrayList) vkr0Var.e;
        if (arrayList == null) {
            arrayList = new ArrayList();
            vkr0Var.e = arrayList;
        }
        arrayList.add(this);
        this.g = interpolator;
        this.f35892a = i4;
        this.b = i5;
        if (i3 == 3) {
            this.m = true;
        }
        this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
        a();
    }

    public final void a() {
        boolean z = this.h;
        int i = this.b;
        int i2 = this.f35892a;
        Interpolator interpolator = this.g;
        ds40 ds40Var = this.c;
        vkr0 vkr0Var = this.f;
        if (z) {
            long jNanoTime = System.nanoTime();
            long j = jNanoTime - this.k;
            this.k = jNanoTime;
            float interpolation = this.i - (((float) (j * 1.0E-6d)) * this.j);
            this.i = interpolation;
            if (interpolation < 0.0f) {
                this.i = 0.0f;
                interpolation = 0.0f;
            }
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(interpolation);
            }
            boolean zD = ds40Var.d(interpolation, jNanoTime, this.e, ds40Var.b);
            if (this.i <= 0.0f) {
                if (i2 != -1) {
                    ds40Var.b.setTag(i2, Long.valueOf(System.nanoTime()));
                }
                if (i != -1) {
                    ds40Var.b.setTag(i, null);
                }
                ((ArrayList) vkr0Var.f).add(this);
            }
            if (this.i > 0.0f || zD) {
                ((MotionLayout) vkr0Var.b).invalidate();
                return;
            }
            return;
        }
        long jNanoTime2 = System.nanoTime();
        long j2 = jNanoTime2 - this.k;
        this.k = jNanoTime2;
        float interpolation2 = (((float) (j2 * 1.0E-6d)) * this.j) + this.i;
        this.i = interpolation2;
        if (interpolation2 >= 1.0f) {
            this.i = 1.0f;
            interpolation2 = 1.0f;
        }
        if (interpolator != null) {
            interpolation2 = interpolator.getInterpolation(interpolation2);
        }
        boolean zD2 = ds40Var.d(interpolation2, jNanoTime2, this.e, ds40Var.b);
        if (this.i >= 1.0f) {
            if (i2 != -1) {
                ds40Var.b.setTag(i2, Long.valueOf(System.nanoTime()));
            }
            if (i != -1) {
                ds40Var.b.setTag(i, null);
            }
            if (!this.m) {
                ((ArrayList) vkr0Var.f).add(this);
            }
        }
        if (this.i < 1.0f || zD2) {
            ((MotionLayout) vkr0Var.b).invalidate();
        }
    }

    public final void b() {
        this.h = true;
        int i = this.d;
        if (i != -1) {
            this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
        }
        ((MotionLayout) this.f.b).invalidate();
        this.k = System.nanoTime();
    }
}
