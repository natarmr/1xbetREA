package a;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.xplatform.domino.presentation.views.DominoHandView;

/* JADX INFO: loaded from: classes4.dex */
public final class qb8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f28435a;
    public nb8 b;
    public boolean c;
    public boolean d;
    public float e;
    public boolean f;
    public float g;
    public final Rect h;
    public float i;
    public float j;
    public boolean k;
    public float l;
    public float m;
    public boolean n;
    public byte o;
    public int p;
    public int q;
    public float r;
    public boolean s;

    public qb8(Context context, Drawable drawable, int i, int i2) {
        context.getClass();
        drawable.getClass();
        this.f28435a = new Rect();
        this.g = 1.0f;
        this.h = new Rect();
        this.r = 1.0f;
        this.b = new nb8(context, drawable, i, i2);
        this.p = i;
        this.q = i2;
        this.d = i == i2;
    }

    public final boolean a(int i) {
        return i == this.p || i == this.q;
    }

    public final boolean b(int i, int i2) {
        int i3;
        int i4 = this.p;
        return i == i4 || i2 == i4 || i == (i3 = this.q) || i2 == i3;
    }

    public final AnimatorSet c(DominoHandView dominoHandView) {
        if (!this.k) {
            return null;
        }
        float f = this.i;
        Rect rect = this.f28435a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f - rect.centerX(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ob8(this, (byte) 0));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.j - rect.centerY(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(new sb3(this, dominoHandView, (byte) 1));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setTarget(dominoHandView);
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(600L);
        return animatorSet;
    }

    public final AnimatorSet d(View view, Rect rect, int i, int i2) {
        rect.getClass();
        Rect rect2 = this.f28435a;
        if (rect2.equals(rect)) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((rect2.left - rect.left) - i, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new pb8(this, view, (byte) 0));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat((rect2.top - rect.top) - i2, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(new ob8(this, (byte) 1));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.r, 1.0f);
        valueAnimatorOfFloat3.addUpdateListener(new ob8(this, (byte) 2));
        rect2.set(rect);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setTarget(view);
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3);
        animatorSet.setDuration(600L);
        return animatorSet;
    }

    public final void e(Canvas canvas, int i, int i2) {
        nb8 nb8Var;
        canvas.getClass();
        canvas.save();
        float f = this.r;
        canvas.scale(f, f, i, i2);
        boolean z = this.k;
        Rect rect = this.f28435a;
        if (z) {
            canvas.translate(this.i - rect.centerX(), this.j - rect.centerY());
        }
        canvas.translate(this.l, this.m);
        int i3 = this.o & 7;
        if (i3 == 3) {
            canvas.translate(-((rect.height() / 2) - (rect.centerX() - rect.left)), 0.0f);
        } else if (i3 == 5) {
            canvas.translate((rect.height() / 2) - (rect.centerX() - rect.left), 0.0f);
        }
        int i4 = this.o & 112;
        if (i4 == 48) {
            canvas.translate(0.0f, -((rect.height() / 2) - (rect.centerX() - rect.left)));
        } else if (i4 == 80) {
            canvas.translate(0.0f, (rect.height() / 2) - (rect.centerX() - rect.left));
        }
        canvas.rotate(this.e, rect.centerX(), rect.centerY());
        Rect rect2 = this.h;
        rect2.set(rect);
        rect2.inset(-5, -5);
        this.b.setBounds(rect);
        if (this.s || !this.n) {
            boolean z2 = this.f;
            nb8 nb8Var2 = this.b;
            if (z2) {
                nb8Var2.b = 1.0f;
            } else {
                nb8Var2.b = this.g;
            }
            nb8Var = nb8Var2;
        } else {
            nb8Var = this.b;
            nb8Var.b = 0.5f;
        }
        nb8Var.draw(canvas);
        canvas.restore();
    }

    public final void f(View view, float f, boolean z) {
        if (!z) {
            this.e = f;
            view.invalidate();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.e, f);
        valueAnimatorOfFloat.setTarget(view);
        valueAnimatorOfFloat.addUpdateListener(new pb8(this, view, (byte) 1));
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.start();
    }

    public qb8(Context context, Drawable drawable) {
        context.getClass();
        drawable.getClass();
        this.f28435a = new Rect();
        this.g = 1.0f;
        this.h = new Rect();
        this.r = 1.0f;
        this.b = new nb8(context, drawable, 0, 0);
        this.d = false;
    }
}
