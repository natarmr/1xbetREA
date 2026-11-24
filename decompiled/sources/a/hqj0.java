package a;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class hqj0 extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mo8 f13487a = new mo8(this, 4);
    public final Paint b;
    public final Rect c;
    public final Matrix d;
    public ValueAnimator e;
    public cqj0 f;

    public hqj0() {
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Rect();
        this.d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final boolean a() {
        ValueAnimator valueAnimator = this.e;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    public final void b() {
        cqj0 cqj0Var;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || valueAnimator.isStarted() || (cqj0Var = this.f) == null || !cqj0Var.o || getCallback() == null) {
            return;
        }
        this.e.start();
    }

    public final void c(cqj0 cqj0Var) {
        boolean zIsStarted;
        this.f = cqj0Var;
        if (cqj0Var != null) {
            this.b.setXfermode(new PorterDuffXfermode(this.f.p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        e();
        if (this.f != null) {
            ValueAnimator valueAnimator = this.e;
            if (valueAnimator != null) {
                zIsStarted = valueAnimator.isStarted();
                this.e.cancel();
                this.e.removeAllUpdateListeners();
            } else {
                zIsStarted = false;
            }
            cqj0 cqj0Var2 = this.f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (cqj0Var2.t / cqj0Var2.s) + 1.0f);
            this.e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setRepeatMode(this.f.r);
            this.e.setRepeatCount(this.f.q);
            ValueAnimator valueAnimator2 = this.e;
            cqj0 cqj0Var3 = this.f;
            valueAnimator2.setDuration(cqj0Var3.s + cqj0Var3.t);
            this.e.addUpdateListener(this.f13487a);
            if (zIsStarted) {
                this.e.start();
            }
        }
        invalidateSelf();
    }

    public final void d() {
        if (this.e == null || a() || getCallback() == null) {
            return;
        }
        this.e.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fA;
        float fA2;
        if (this.f != null) {
            Paint paint = this.b;
            if (paint.getShader() == null) {
                return;
            }
            float fTan = (float) Math.tan(Math.toRadians(this.f.m));
            Rect rect = this.c;
            float fWidth = (rect.width() * fTan) + rect.height();
            float fHeight = (fTan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.e;
            float f = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            byte b = this.f.c;
            if (b != 1) {
                if (b == 2) {
                    fA2 = rw2.a(-fHeight, fHeight, animatedFraction, fHeight);
                } else if (b != 3) {
                    float f2 = -fHeight;
                    fA2 = rw2.a(fHeight, f2, animatedFraction, f2);
                } else {
                    fA = rw2.a(-fWidth, fWidth, animatedFraction, fWidth);
                }
                f = fA2;
                fA = 0.0f;
            } else {
                float f3 = -fWidth;
                fA = rw2.a(fWidth, f3, animatedFraction, f3);
            }
            Matrix matrix = this.d;
            matrix.reset();
            matrix.setRotate(this.f.m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f, fA);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    public final void e() {
        cqj0 cqj0Var;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (cqj0Var = this.f) == null) {
            return;
        }
        int iRound = cqj0Var.g;
        if (iRound <= 0) {
            iRound = Math.round(cqj0Var.i * iWidth);
        }
        cqj0 cqj0Var2 = this.f;
        int iRound2 = cqj0Var2.h;
        if (iRound2 <= 0) {
            iRound2 = Math.round(cqj0Var2.j * iHeight);
        }
        cqj0 cqj0Var3 = this.f;
        boolean z = true;
        if (!cqj0Var3.f) {
            byte b = cqj0Var3.c;
            if (b != 1 && b != 3) {
                z = false;
            }
            if (z) {
                iRound = 0;
            }
            if (!z) {
                iRound2 = 0;
            }
            cqj0 cqj0Var4 = this.f;
            radialGradient = new LinearGradient(0.0f, 0.0f, iRound, iRound2, cqj0Var4.b, cqj0Var4.f4796a, Shader.TileMode.CLAMP);
        } else {
            float fMax = (float) (((double) Math.max(iRound, iRound2)) / Math.sqrt(2.0d));
            cqj0 cqj0Var5 = this.f;
            radialGradient = new RadialGradient(iRound / 2.0f, iRound2 / 2.0f, fMax, cqj0Var5.b, cqj0Var5.f4796a, Shader.TileMode.CLAMP);
        }
        this.b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        cqj0 cqj0Var = this.f;
        if (cqj0Var != null) {
            return (cqj0Var.n || cqj0Var.p) ? -3 : -1;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(0, 0, rect.width(), rect.height());
        e();
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
