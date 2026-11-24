package a;

import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes.dex */
public final class xs40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f41398a = Float.NaN;
    public float b = Float.NaN;
    public int c = -1;
    public int d = -1;
    public final /* synthetic */ MotionLayout e;

    public xs40(MotionLayout motionLayout) {
        this.e = motionLayout;
    }

    public final void a() {
        int i = this.c;
        MotionLayout motionLayout = this.e;
        if (i != -1 || this.d != -1) {
            int i2 = this.d;
            if (i == -1) {
                motionLayout.G(i2);
            } else if (i2 == -1) {
                motionLayout.C(i);
            } else {
                motionLayout.D(i, i2);
            }
            motionLayout.setState(zs40.b);
        }
        boolean zIsNaN = Float.isNaN(this.b);
        float f = this.f41398a;
        if (zIsNaN) {
            if (Float.isNaN(f)) {
                return;
            }
            motionLayout.setProgress(this.f41398a);
            return;
        }
        float f2 = this.b;
        if (motionLayout.isAttachedToWindow()) {
            motionLayout.setProgress(f);
            motionLayout.setState(zs40.c);
            motionLayout.t = f2;
            if (f2 != 0.0f) {
                motionLayout.u(f2 > 0.0f ? 1.0f : 0.0f);
            } else if (f != 0.0f && f != 1.0f) {
                motionLayout.u(f > 0.5f ? 1.0f : 0.0f);
            }
        } else {
            xs40 xs40Var = motionLayout.N1;
            if (xs40Var == null) {
                xs40Var = new xs40(motionLayout);
                motionLayout.N1 = xs40Var;
            }
            xs40Var.f41398a = f;
            xs40Var.b = f2;
        }
        this.f41398a = Float.NaN;
        this.b = Float.NaN;
        this.c = -1;
        this.d = -1;
    }
}
