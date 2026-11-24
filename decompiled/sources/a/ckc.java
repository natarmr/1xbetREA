package a;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class ckc extends Drawable implements Animatable {
    public static final LinearInterpolator g = new LinearInterpolator();
    public static final f0p h = new f0p((byte) 1);
    public static final int[] i = {-16777216};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bkc f4499a;
    public float b;
    public final Resources c;
    public final ValueAnimator d;
    public float e;
    public boolean f;

    public ckc(Context context) {
        context.getClass();
        this.c = context.getResources();
        bkc bkcVar = new bkc();
        this.f4499a = bkcVar;
        bkcVar.i = i;
        bkcVar.a(0);
        bkcVar.h = 2.5f;
        bkcVar.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new zjc(this, bkcVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(g);
        valueAnimatorOfFloat.addListener(new akc(this, bkcVar));
        this.d = valueAnimatorOfFloat;
    }

    public static void d(float f, bkc bkcVar) {
        if (f <= 0.75f) {
            bkcVar.u = bkcVar.i[bkcVar.j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = bkcVar.i;
        int i2 = bkcVar.j;
        int i3 = iArr[i2];
        int i4 = iArr[(i2 + 1) % iArr.length];
        int i5 = (i3 >> 24) & 255;
        int i6 = (i3 >> 16) & 255;
        int i7 = (i3 >> 8) & 255;
        int i8 = i3 & 255;
        bkcVar.u = ((i5 + ((int) ((((i4 >> 24) & 255) - i5) * f2))) << 24) | ((i6 + ((int) ((((i4 >> 16) & 255) - i6) * f2))) << 16) | ((i7 + ((int) ((((i4 >> 8) & 255) - i7) * f2))) << 8) | (i8 + ((int) (f2 * ((i4 & 255) - i8))));
    }

    public final void a(float f, bkc bkcVar, boolean z) {
        float interpolation;
        if (this.f) {
            d(f, bkcVar);
            float fFloor = (float) (Math.floor(bkcVar.m / 0.8f) + 1.0d);
            float f2 = bkcVar.k;
            float f3 = bkcVar.l;
            bkcVar.e = (((f3 - 0.01f) - f2) * f) + f2;
            bkcVar.f = f3;
            float f4 = bkcVar.m;
            bkcVar.g = rw2.a(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = bkcVar.m;
            float interpolation2 = bkcVar.k;
            f0p f0pVar = h;
            if (f < 0.5f) {
                interpolation = (f0pVar.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation2;
            } else {
                float f6 = interpolation2 + 0.79f;
                interpolation2 = f6 - (((1.0f - f0pVar.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.e) * 216.0f;
            bkcVar.e = interpolation2;
            bkcVar.f = interpolation;
            bkcVar.g = f7;
            this.b = f8;
        }
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = this.c.getDisplayMetrics().density;
        float f6 = f2 * f5;
        bkc bkcVar = this.f4499a;
        bkcVar.h = f6;
        bkcVar.b.setStrokeWidth(f6);
        bkcVar.q = f * f5;
        bkcVar.a(0);
        bkcVar.r = (int) (f3 * f5);
        bkcVar.s = (int) (f4 * f5);
    }

    public final void c(int i2) {
        if (i2 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.b, bounds.exactCenterX(), bounds.exactCenterY());
        bkc bkcVar = this.f4499a;
        Paint paint = bkcVar.b;
        RectF rectF = bkcVar.f2741a;
        float f = bkcVar.q;
        float fMin = (bkcVar.h / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((bkcVar.r * bkcVar.p) / 2.0f, bkcVar.h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = bkcVar.e;
        float f3 = bkcVar.g;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((bkcVar.f + f3) * 360.0f) - f4;
        paint.setColor(bkcVar.u);
        paint.setAlpha(bkcVar.t);
        float f6 = bkcVar.h / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, bkcVar.d);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        Paint paint2 = bkcVar.c;
        if (bkcVar.n) {
            Path path = bkcVar.o;
            if (path == null) {
                Path path2 = new Path();
                bkcVar.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (bkcVar.r * bkcVar.p) / 2.0f;
            bkcVar.o.moveTo(0.0f, 0.0f);
            bkcVar.o.lineTo(bkcVar.r * bkcVar.p, 0.0f);
            Path path3 = bkcVar.o;
            float f9 = bkcVar.r;
            float f10 = bkcVar.p;
            path3.lineTo((f9 * f10) / 2.0f, bkcVar.s * f10);
            bkcVar.o.offset((rectF.centerX() + fMin2) - f8, (bkcVar.h / 2.0f) + rectF.centerY());
            bkcVar.o.close();
            paint2.setColor(bkcVar.u);
            paint2.setAlpha(bkcVar.t);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(bkcVar.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4499a.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f4499a.t = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4499a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.d;
        valueAnimator.cancel();
        bkc bkcVar = this.f4499a;
        float f = bkcVar.e;
        bkcVar.k = f;
        float f2 = bkcVar.f;
        bkcVar.l = f2;
        bkcVar.m = bkcVar.g;
        if (f2 != f) {
            this.f = true;
            valueAnimator.setDuration(666L);
            valueAnimator.start();
            return;
        }
        bkcVar.a(0);
        bkcVar.k = 0.0f;
        bkcVar.l = 0.0f;
        bkcVar.m = 0.0f;
        bkcVar.e = 0.0f;
        bkcVar.f = 0.0f;
        bkcVar.g = 0.0f;
        valueAnimator.setDuration(1332L);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d.cancel();
        this.b = 0.0f;
        bkc bkcVar = this.f4499a;
        if (bkcVar.n) {
            bkcVar.n = false;
        }
        bkcVar.a(0);
        bkcVar.k = 0.0f;
        bkcVar.l = 0.0f;
        bkcVar.m = 0.0f;
        bkcVar.e = 0.0f;
        bkcVar.f = 0.0f;
        bkcVar.g = 0.0f;
        invalidateSelf();
    }
}
