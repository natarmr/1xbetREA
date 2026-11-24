package a;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gef extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1h0 f11153a;
    public final int b;
    public final boolean c;
    public final ArrayList d = new ArrayList();
    public final int e;
    public final int f;
    public long g;
    public int h;
    public byte i;
    public Drawable j;
    public final Drawable k;

    public gef(Drawable drawable, Drawable drawable2, j1h0 j1h0Var, int i, boolean z) {
        this.f11153a = j1h0Var;
        this.b = i;
        this.c = z;
        this.e = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.h = 255;
        this.j = drawable != null ? drawable.mutate() : null;
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.k = drawableMutate;
        if (i <= 0) {
            jf4.o("durationMillis must be > 0.");
            throw null;
        }
        Drawable drawable3 = this.j;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (drawableMutate != null) {
            drawableMutate.setCallback(this);
        }
    }

    public final int a(Integer num, Integer num2) {
        if (num != null && num.intValue() == -1) {
            return -1;
        }
        if (num2 != null && num2.intValue() == -1) {
            return -1;
        }
        return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
    }

    public final void b() {
        this.i = (byte) 2;
        this.j = null;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s06) arrayList.get(i)).a(this);
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dA = u1c.A(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f11153a, f7k0.c);
        int iA = si30.a((((double) iWidth) - (((double) intrinsicWidth) * dA)) / 2.0d);
        int iA2 = si30.a((((double) iHeight) - (dA * ((double) intrinsicHeight))) / 2.0d);
        drawable.setBounds(rect.left + iA, rect.top + iA2, rect.right - iA, rect.bottom - iA2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        byte b = this.i;
        if (b == 0) {
            Drawable drawable2 = this.j;
            if (drawable2 != null) {
                drawable2.setAlpha(this.h);
                int iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            return;
        }
        Drawable drawable3 = this.k;
        if (b == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.h);
                int iSave2 = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave2);
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.g) / ((double) this.b);
        double dB = l1e0.b(dUptimeMillis, 0.0d, 1.0d);
        int i = this.h;
        int i2 = (int) (dB * ((double) i));
        if (this.c) {
            i -= i2;
        }
        boolean z = dUptimeMillis >= 1.0d;
        if (!z && (drawable = this.j) != null) {
            drawable.setAlpha(i);
            int iSave3 = canvas.save();
            try {
                drawable.draw(canvas);
                canvas.restoreToCount(iSave3);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave3);
                throw th;
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i2);
            int iSave4 = canvas.save();
            try {
                drawable3.draw(canvas);
                canvas.restoreToCount(iSave4);
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave4);
                throw th2;
            }
        }
        if (z) {
            b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        byte b = this.i;
        if (b == 0) {
            Drawable drawable = this.j;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.k;
        if (b != 1) {
            if (b == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.j;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.j;
        byte b = this.i;
        if (b == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.k;
        if (b == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.i == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.j;
        if (drawable != null ? drawable.isStateful() : false) {
            return true;
        }
        Drawable drawable2 = this.k;
        return drawable2 != null ? drawable2.isStateful() : false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.j;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.j;
        boolean level = drawable != null ? drawable.setLevel(i) : false;
        Drawable drawable2 = this.k;
        return level || (drawable2 != null ? drawable2.setLevel(i) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.j;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.k;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            c99.s(twn.m(i, "Invalid alpha: "));
        } else {
            this.h = i;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.j;
        boolean z3 = drawable != null && drawable.setVisible(z, z2);
        Drawable drawable2 = this.k;
        return visible || z3 || (drawable2 != null && drawable2.setVisible(z, z2));
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.j;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.k;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.i != 0) {
            return;
        }
        this.i = (byte) 1;
        this.g = SystemClock.uptimeMillis();
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s06) arrayList.get(i)).b(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.j;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.k;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.i != 2) {
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
