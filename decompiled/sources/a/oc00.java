package a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.List;
import kotlin.Pair;
import org.xbet.client1.R;
import org.xplatform.uikit.components.list_checkbox.DsListCheckBox;

/* JADX INFO: loaded from: classes6.dex */
public final class oc00 implements mc00 {
    public static final List x = q3d.j(new Pair(Float.valueOf(-60.0f), Float.valueOf(4.0f)), new Pair(Float.valueOf(-46.0f), Float.valueOf(-10.0f)), new Pair(Float.valueOf(-20.0f), Float.valueOf(16.0f)), new Pair(Float.valueOf(46.0f), Float.valueOf(-50.0f)), new Pair(Float.valueOf(60.0f), Float.valueOf(-36.0f)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsListCheckBox f25005a;
    public final int b;
    public final PointF c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public final Path m;
    public final Path n;
    public final Path o;
    public final Path p;
    public final Paint q;
    public final Paint r;
    public final Paint s;
    public final Interpolator t;
    public final Interpolator u;
    public final Interpolator v;
    public final Interpolator w;

    public oc00(DsListCheckBox dsListCheckBox, Integer num, Integer num2, Integer num3) {
        this.f25005a = dsListCheckBox;
        Context context = dsListCheckBox.getContext();
        context.getClass();
        int iB = m5d.b(R.attr.uikitPrimary, context);
        Context context2 = dsListCheckBox.getContext();
        context2.getClass();
        int iB2 = m5d.b(R.attr.uikitStaticWhite, context2);
        Context context3 = dsListCheckBox.getContext();
        context3.getClass();
        this.b = m5d.b(R.attr.uikitStaticBlack20, context3);
        this.c = new PointF();
        this.m = new Path();
        this.n = new Path();
        this.o = new Path();
        this.p = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(num3 != null ? num3.intValue() : iB2);
        this.q = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setColor(num != null ? num.intValue() : iB);
        this.r = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setColor(num2 != null ? num2.intValue() : iB2);
        this.s = paint3;
        this.t = AnimationUtils.loadInterpolator(dsListCheckBox.getContext(), R.anim.list_checkbox_overlay_interpolator_checked_end);
        this.u = AnimationUtils.loadInterpolator(dsListCheckBox.getContext(), R.anim.list_checkbox_overlay_interpolator_checked_start);
        this.v = AnimationUtils.loadInterpolator(dsListCheckBox.getContext(), R.anim.list_checkbox_overlay_interpolator_unchecked_end);
        this.w = AnimationUtils.loadInterpolator(dsListCheckBox.getContext(), R.anim.list_checkbox_overlay_interpolator_unchecked_start);
    }

    @Override // a.mc00
    public final void a(int i) {
        this.q.setColor(i);
        this.f25005a.invalidate();
    }

    @Override // a.mc00
    public final void b(Canvas canvas) {
        canvas.getClass();
        PointF pointF = this.c;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = this.j;
        Path.Direction direction = Path.Direction.CW;
        Path path = this.o;
        path.addCircle(f, f2, f3, direction);
        float f4 = pointF.x;
        float f5 = pointF.y;
        float f6 = this.f;
        Path path2 = this.m;
        path2.addCircle(f4, f5, f6, direction);
        path2.op(path, Path.Op.DIFFERENCE);
        canvas.drawPath(path2, this.q);
        float f7 = this.i;
        Path path3 = this.n;
        if (f7 != 0.0f) {
            path3.addCircle(pointF.x, pointF.y, f7, direction);
            canvas.drawPath(path3, this.r);
        }
        float f8 = this.l;
        Path path4 = this.p;
        if (f8 != 0.0f) {
            path4.moveTo(((-20.0f) * this.l) + pointF.x, (44.0f * this.l) + pointF.y);
            for (Pair pair : x) {
                float fFloatValue = ((Number) pair.f46059a).floatValue();
                float fFloatValue2 = ((Number) pair.b).floatValue();
                float f9 = this.l;
                path4.lineTo((fFloatValue * f9) + pointF.x, (fFloatValue2 * f9) + pointF.y);
            }
            canvas.drawPath(path4, this.s);
        }
        path4.reset();
        path3.reset();
        path2.reset();
        path.reset();
        path4.close();
    }

    @Override // a.mc00
    public final void c(int i) {
        this.r.setColor(i);
        this.f25005a.invalidate();
    }

    @Override // a.mc00
    public final void d(int i) {
        this.s.setColor(i);
        this.f25005a.invalidate();
    }

    @Override // a.mc00
    public final void e(int i, int i2, boolean z) {
        float f = i;
        float f2 = 0.3f * f;
        this.c.set(f / 2.0f, i2 / 2.0f);
        this.d = f2;
        this.e = f2 * 0.9167f;
        this.f = f2;
        float f3 = 0.8333f * f2;
        this.g = f3;
        this.h = 0.9167f * f3;
        this.k = f2 / 120.0f;
        this.q.setShadowLayer((f2 - f3) * 1.5f, 0.0f, 0.0f, this.b);
        f(z);
    }

    @Override // a.mc00
    public final void f(boolean z) {
        if (z) {
            this.i = this.g;
            this.l = this.k;
            this.j = 0.0f;
        } else {
            this.i = 0.0f;
            this.l = 0.0f;
            this.j = this.g;
        }
    }

    @Override // a.mc00
    public final AnimatorSet g(boolean z) {
        f(!z);
        byte b = 0;
        if (!z) {
            AnimatorSet animatorSet = new AnimatorSet();
            float f = this.d;
            float f2 = this.e;
            Interpolator interpolator = this.u;
            interpolator.getClass();
            ValueAnimator valueAnimatorJ = j(f, f2, interpolator, 250L);
            float f3 = this.e;
            float f4 = this.d;
            Interpolator interpolator2 = this.t;
            interpolator2.getClass();
            animatorSet.playSequentially(valueAnimatorJ, j(f3, f4, interpolator2, 200L));
            animatorSet.playSequentially(h(this.g, this.h, interpolator, 250L), h(this.h, this.g, interpolator2, 200L));
            animatorSet.playSequentially(i(this.g, this.h, interpolator, 250L), i(this.h, 0.0f, interpolator2, 200L));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.k, 0.0f);
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(interpolator);
            valueAnimatorOfFloat.addUpdateListener(new nc00(this, b));
            animatorSet.playSequentially(valueAnimatorOfFloat);
            return animatorSet;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        float f5 = this.d;
        float f6 = this.e;
        Interpolator interpolator3 = this.w;
        interpolator3.getClass();
        Animator animatorJ = j(f5, f6, interpolator3, 250L);
        float f7 = this.e;
        float f8 = this.d;
        Interpolator interpolator4 = this.v;
        interpolator4.getClass();
        animatorSet2.playSequentially(animatorJ, j(f7, f8, interpolator4, 200L));
        animatorSet2.playSequentially(h(this.g, this.h, interpolator3, 250L), h(this.h, this.g, interpolator4, 200L));
        Animator animatorI = i(0.0f, this.h, interpolator3, 250L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, this.k);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.setInterpolator(interpolator4);
        valueAnimatorOfFloat2.addUpdateListener(new nc00(this, b));
        animatorSet3.playTogether(valueAnimatorOfFloat2, i(this.h, this.g, interpolator4, 200L));
        animatorSet2.playSequentially(animatorI, animatorSet3);
        return animatorSet2;
    }

    public final ValueAnimator h(float f, float f2, Interpolator interpolator, long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(interpolator);
        valueAnimatorOfFloat.addUpdateListener(new nc00(this, (byte) 2));
        return valueAnimatorOfFloat;
    }

    public final ValueAnimator i(float f, float f2, Interpolator interpolator, long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(interpolator);
        valueAnimatorOfFloat.addUpdateListener(new nc00(this, (byte) 3));
        return valueAnimatorOfFloat;
    }

    public final ValueAnimator j(float f, float f2, Interpolator interpolator, long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(interpolator);
        valueAnimatorOfFloat.addUpdateListener(new nc00(this, (byte) 1));
        return valueAnimatorOfFloat;
    }
}
