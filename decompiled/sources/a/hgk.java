package a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public final class hgk extends shl {
    public static final ggk x = new ggk(0);
    public final whl n;
    public final kul0 o;
    public final uhl p;
    public float q;
    public boolean r;
    public final ValueAnimator s;
    public ValueAnimator t;
    public TimeInterpolator u;
    public TimeInterpolator v;
    public TimeInterpolator w;

    public hgk(Context context, u06 u06Var, whl whlVar) {
        super(context, u06Var);
        this.r = false;
        this.n = whlVar;
        uhl uhlVar = new uhl();
        this.p = uhlVar;
        uhlVar.h = true;
        kul0 kul0Var = new kul0(this, x);
        this.o = kul0Var;
        lul0 lul0Var = new lul0();
        lul0Var.a(1.0f);
        lul0Var.b(50.0f);
        kul0Var.m = lul0Var;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.s = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new sb3(this, u06Var, (byte) 2));
        if (u06Var.b(true) && u06Var.m != 0) {
            valueAnimator.start();
        }
        if (this.i != 1.0f) {
            this.i = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.l)) {
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.d;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.e;
            boolean z2 = objectAnimator2 != null && objectAnimator2.isRunning();
            whl whlVar = this.n;
            whlVar.f39171a.d();
            whlVar.a(canvas, bounds, fB, z, z2);
            float fC = c();
            uhl uhlVar = this.p;
            uhlVar.f = fC;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.j;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            u06 u06Var = this.b;
            uhlVar.c = u06Var.e[0];
            int iT = u06Var.i;
            whl whlVar2 = this.n;
            if (iT > 0) {
                if (!(whlVar2 instanceof c900)) {
                    iT = (int) ((r7x.t(uhlVar.b, 0.0f, 0.01f) * iT) / 0.01f);
                }
                this.n.d(canvas, paint, uhlVar.b, 1.0f, u06Var.f, this.k, iT);
            } else {
                whlVar2.d(canvas, paint, 0.0f, 1.0f, u06Var.f, this.k, 0);
            }
            int i = this.k;
            whl whlVar3 = this.n;
            whlVar3.c(canvas, paint, uhlVar, i);
            whlVar3.b(canvas, paint, u06Var.e[0], this.k);
            canvas.restore();
        }
    }

    @Override // a.shl
    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean zE = super.e(z, z2, z3);
        w73 w73Var = this.c;
        ContentResolver contentResolver = this.f32217a.getContentResolver();
        w73Var.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.r = true;
            return zE;
        }
        this.r = false;
        this.o.m.b(50.0f / f);
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.n.f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.o.d();
        this.p.b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        float f = i;
        u06 u06Var = this.b;
        float f2 = (f < u06Var.o * 10000.0f || f > u06Var.p * 10000.0f) ? 0.0f : 1.0f;
        boolean z = this.r;
        uhl uhlVar = this.p;
        kul0 kul0Var = this.o;
        if (z) {
            kul0Var.d();
            uhlVar.b = f / 10000.0f;
            invalidateSelf();
            uhlVar.e = f2;
            invalidateSelf();
        } else {
            int iWidth = getBounds().width();
            int iHeight = getBounds().height();
            if (iWidth > 0 && iHeight > 0) {
                if (this.n instanceof c900) {
                    kul0Var.b(10000.0f / iWidth);
                } else {
                    kul0Var.b((float) (10000.0d / (((double) Math.min(iHeight, iWidth)) * 3.141592653589793d)));
                }
            }
            kul0Var.b = uhlVar.b * 10000.0f;
            kul0Var.c = true;
            kul0Var.a(f);
        }
        return true;
    }
}
