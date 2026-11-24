package a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
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
public final class qc00 implements mc00 {
    public static final List u = q3d.j(new Pair(Float.valueOf(-60.0f), Float.valueOf(4.0f)), new Pair(Float.valueOf(-46.0f), Float.valueOf(-10.0f)), new Pair(Float.valueOf(-20.0f), Float.valueOf(16.0f)), new Pair(Float.valueOf(46.0f), Float.valueOf(-50.0f)), new Pair(Float.valueOf(60.0f), Float.valueOf(-36.0f)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsListCheckBox f28464a;
    public Integer b;
    public int c;
    public int d;
    public int e;
    public final PointF f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public final Path n;
    public final Path o;
    public final Path p;
    public final Paint q;
    public final Paint r;
    public final Interpolator s;
    public final Interpolator t;

    public qc00(DsListCheckBox dsListCheckBox, Integer num, Integer num2, Integer num3) {
        int iB;
        int iB2;
        this.f28464a = dsListCheckBox;
        this.b = num2;
        if (num != null) {
            iB = num.intValue();
        } else {
            Context context = dsListCheckBox.getContext();
            context.getClass();
            iB = m5d.b(R.attr.uikitPrimary, context);
        }
        this.c = iB;
        if (num3 != null) {
            iB2 = num3.intValue();
        } else {
            Context context2 = dsListCheckBox.getContext();
            context2.getClass();
            iB2 = m5d.b(R.attr.uikitSecondary60, context2);
        }
        this.d = iB2;
        this.e = iB2;
        this.f = new PointF();
        this.n = new Path();
        this.o = new Path();
        this.p = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.q = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        this.r = paint2;
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(dsListCheckBox.getContext(), R.anim.list_checkbox_primary_interpolator_start);
        interpolatorLoadInterpolator.getClass();
        this.s = interpolatorLoadInterpolator;
        this.t = AnimationUtils.loadInterpolator(dsListCheckBox.getContext(), R.anim.list_checkbox_primary_interpolator_end);
    }

    @Override // a.mc00
    public final void a(int i) {
        this.d = i;
        this.f28464a.invalidate();
    }

    @Override // a.mc00
    public final void b(Canvas canvas) {
        int iB;
        canvas.getClass();
        PointF pointF = this.f;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = this.k;
        Path.Direction direction = Path.Direction.CW;
        Path path = this.o;
        path.addCircle(f, f2, f3, direction);
        float f4 = pointF.x;
        float f5 = pointF.y;
        float f6 = this.i;
        Path path2 = this.n;
        path2.addCircle(f4, f5, f6, direction);
        path2.op(path, Path.Op.DIFFERENCE);
        float f7 = this.m;
        Path path3 = this.p;
        if (f7 > 0.0f) {
            path3.moveTo(((-20.0f) * f7) + pointF.x, (44.0f * f7) + pointF.y);
            for (Pair pair : u) {
                float fFloatValue = ((Number) pair.f46059a).floatValue();
                float fFloatValue2 = ((Number) pair.b).floatValue();
                float f8 = this.m;
                path3.lineTo((fFloatValue * f8) + pointF.x, (fFloatValue2 * f8) + pointF.y);
            }
            path2.op(path3, Path.Op.DIFFERENCE);
        }
        int i = this.e;
        Paint paint = this.q;
        paint.setColor(i);
        canvas.drawPath(path2, paint);
        Integer num = this.b;
        if (num != null) {
            iB = num.intValue();
        } else {
            Context context = this.f28464a.getContext();
            context.getClass();
            iB = m5d.b(R.attr.uikitStaticWhite, context);
        }
        Paint paint2 = this.r;
        paint2.setColor(iB);
        canvas.drawPath(path3, paint2);
        path3.reset();
        path.reset();
        path2.reset();
        path3.close();
    }

    @Override // a.mc00
    public final void c(int i) {
        this.c = i;
        this.f28464a.invalidate();
    }

    @Override // a.mc00
    public final void d(int i) {
        this.b = Integer.valueOf(i);
        this.f28464a.invalidate();
    }

    @Override // a.mc00
    public final void e(int i, int i2, boolean z) {
        float f = i;
        float f2 = 0.3f * f;
        this.f.set(f / 2.0f, i2 / 2.0f);
        this.g = f2;
        this.h = 0.9167f * f2;
        this.i = f2;
        float f3 = 0.8333f * f2;
        this.j = f3;
        this.k = f3;
        this.l = f2 / 120.0f;
        f(z);
    }

    @Override // a.mc00
    public final void f(boolean z) {
        if (z) {
            this.e = this.c;
            this.m = this.l;
            this.k = 0.0f;
        } else {
            this.e = this.d;
            this.m = 0.0f;
            this.k = this.j;
        }
    }

    @Override // a.mc00
    public final AnimatorSet g(boolean z) {
        f(!z);
        byte b = 0;
        Interpolator interpolator = this.t;
        Interpolator interpolator2 = this.s;
        byte b2 = 1;
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorI = i(this.g, this.h, interpolator2);
            float f = this.h;
            float f2 = this.g;
            interpolator.getClass();
            animatorSet.playSequentially(valueAnimatorI, i(f, f2, interpolator));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.j, 0.0f);
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(interpolator2);
            valueAnimatorOfFloat.addUpdateListener(new pc00(this, b));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, this.l);
            valueAnimatorOfFloat2.setDuration(250L);
            valueAnimatorOfFloat2.setInterpolator(interpolator);
            valueAnimatorOfFloat2.addUpdateListener(new pc00(this, b2));
            animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            animatorSet.play(h(this.d, this.c, interpolator2));
            return animatorSet;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator animatorI = i(this.g, this.h, interpolator2);
        float f3 = this.h;
        float f4 = this.g;
        interpolator.getClass();
        animatorSet2.playSequentially(animatorI, i(f3, f4, interpolator));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.l, 0.0f);
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.setInterpolator(interpolator2);
        valueAnimatorOfFloat3.addUpdateListener(new pc00(this, b2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, this.j);
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.setInterpolator(interpolator);
        valueAnimatorOfFloat4.addUpdateListener(new pc00(this, b));
        animatorSet3.playTogether(valueAnimatorOfFloat4, h(this.c, this.d, interpolator));
        animatorSet2.playSequentially(valueAnimatorOfFloat3, animatorSet3);
        return animatorSet2;
    }

    public final ValueAnimator h(int i, int i2, Interpolator interpolator) {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        valueAnimatorOfObject.setDuration(250L);
        valueAnimatorOfObject.setInterpolator(interpolator);
        valueAnimatorOfObject.addUpdateListener(new pc00(this, (byte) 2));
        return valueAnimatorOfObject;
    }

    public final ValueAnimator i(float f, float f2, Interpolator interpolator) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(interpolator);
        valueAnimatorOfFloat.addUpdateListener(new pc00(this, (byte) 3));
        return valueAnimatorOfFloat;
    }
}
