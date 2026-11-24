package a;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes.dex */
public final class kcg0 extends View {
    public static final int[] f = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] g = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public met0 f18058a;
    public Boolean b;
    public Long c;
    public wss d;
    public a13 e;

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.c;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? f : g;
            met0 met0Var = this.f18058a;
            if (met0Var != null) {
                met0Var.setState(iArr);
            }
        } else {
            wss wssVar = new wss(this, (byte) 26);
            this.d = wssVar;
            postDelayed(wssVar, 50L);
        }
        this.c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(kcg0 kcg0Var) {
        met0 met0Var = kcg0Var.f18058a;
        if (met0Var != null) {
            met0Var.setState(g);
        }
        kcg0Var.d = null;
    }

    public final void b(jub0 jub0Var, boolean z, long j, int i, long j2, float f2, a13 a13Var) {
        long j3 = jub0Var.f17146a;
        if (this.f18058a == null || !Boolean.valueOf(z).equals(this.b)) {
            met0 met0Var = new met0(z);
            setBackground(met0Var);
            this.f18058a = met0Var;
            this.b = Boolean.valueOf(z);
        }
        met0 met0Var2 = this.f18058a;
        met0Var2.getClass();
        this.e = a13Var;
        e(f2, i, j, j2);
        if (z) {
            met0Var2.setHotspot(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)));
        } else {
            met0Var2.setHotspot(met0Var2.getBounds().centerX(), met0Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.e = null;
        wss wssVar = this.d;
        if (wssVar != null) {
            removeCallbacks(wssVar);
            wss wssVar2 = this.d;
            wssVar2.getClass();
            wssVar2.run();
        } else {
            met0 met0Var = this.f18058a;
            if (met0Var != null) {
                met0Var.setState(g);
            }
        }
        met0 met0Var2 = this.f18058a;
        if (met0Var2 == null) {
            return;
        }
        met0Var2.setVisible(false, false);
        unscheduleDrawable(met0Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(float f2, int i, long j, long j2) {
        met0 met0Var = this.f18058a;
        if (met0Var == null) {
            return;
        }
        if (met0Var.getRadius() != i) {
            met0Var.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f2 *= 2.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        long jC = y3d.c(f2, j2);
        y3d y3dVar = met0Var.b;
        if (!(y3dVar == null ? false : h2t0.a(y3dVar.f41946a, jC))) {
            met0Var.b = new y3d(jC);
            met0Var.setColor(ColorStateList.valueOf(fbc.U(jC)));
        }
        Rect rect = new Rect(0, 0, si30.b(h7k0.e(j)), si30.b(h7k0.c(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        met0Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        a13 a13Var = this.e;
        if (a13Var != null) {
            a13Var.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
