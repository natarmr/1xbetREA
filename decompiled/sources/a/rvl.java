package a;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.List;
import kotlin.Pair;
import org.xbet.client1.R;
import org.xplatform.uikit.components.check_box.old.DsCheckBoxOld;

/* JADX INFO: loaded from: classes6.dex */
public final class rvl {
    public static final List A;
    public static final List z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsCheckBoxOld f31174a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final PointF f;
    public final PointF g;
    public final RectF h;
    public float i;
    public final Path j;
    public final Path k;
    public final Path l;
    public float m;
    public float n;
    public float o;
    public float p;
    public final Paint q;
    public final Paint r;
    public final n0o0 s;
    public final float t;
    public float u;
    public final LinearInterpolator v;
    public final DecelerateInterpolator w;
    public final AccelerateInterpolator x;
    public final ArgbEvaluator y;

    static {
        Float fValueOf = Float.valueOf(-20.0f);
        Pair pair = new Pair(fValueOf, Float.valueOf(16.0f));
        Float fValueOf2 = Float.valueOf(-46.0f);
        Float fValueOf3 = Float.valueOf(-10.0f);
        Pair pair2 = new Pair(fValueOf2, fValueOf3);
        Pair pair3 = new Pair(Float.valueOf(-60.0f), Float.valueOf(4.0f));
        Pair pair4 = new Pair(fValueOf, Float.valueOf(44.0f));
        Pair pair5 = new Pair(Float.valueOf(60.0f), Float.valueOf(-36.0f));
        Float fValueOf4 = Float.valueOf(46.0f);
        Float fValueOf5 = Float.valueOf(-50.0f);
        z = q3d.j(pair, pair2, pair3, pair4, pair5, new Pair(fValueOf4, fValueOf5));
        Pair pair6 = new Pair(fValueOf, fValueOf3);
        Pair pair7 = new Pair(fValueOf5, fValueOf3);
        Float fValueOf6 = Float.valueOf(10.0f);
        Pair pair8 = new Pair(fValueOf5, fValueOf6);
        Pair pair9 = new Pair(fValueOf, fValueOf6);
        Float fValueOf7 = Float.valueOf(50.0f);
        A = q3d.j(pair6, pair7, pair8, pair9, new Pair(fValueOf7, fValueOf6), new Pair(fValueOf7, fValueOf3));
    }

    public rvl(DsCheckBoxOld dsCheckBoxOld) {
        this.f31174a = dsCheckBoxOld;
        Context context = dsCheckBoxOld.getContext();
        context.getClass();
        this.b = m5d.b(R.attr.uikitPrimary, context);
        Context context2 = dsCheckBoxOld.getContext();
        context2.getClass();
        this.c = m5d.b(R.attr.uikitStaticTransparent, context2);
        Context context3 = dsCheckBoxOld.getContext();
        context3.getClass();
        this.d = m5d.b(R.attr.uikitSecondary60, context3);
        Context context4 = dsCheckBoxOld.getContext();
        context4.getClass();
        this.e = m5d.b(R.attr.uikitWarning, context4);
        this.f = new PointF();
        this.g = new PointF();
        this.h = new RectF();
        this.j = new Path();
        this.k = new Path();
        this.l = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.q = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        this.r = paint2;
        this.s = maz.b(new knl((byte) 20));
        this.t = 1.0f / z.size();
        this.v = new LinearInterpolator();
        this.w = new DecelerateInterpolator();
        this.x = new AccelerateInterpolator();
        this.y = new ArgbEvaluator();
    }

    public final AnimatorSet a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        tvl tvlVarD = d();
        pvl pvlVar = new pvl(this, (byte) 0);
        tvlVarD.getClass();
        AccelerateInterpolator accelerateInterpolator = this.x;
        accelerateInterpolator.getClass();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(350L);
        valueAnimatorOfFloat.setInterpolator(accelerateInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new fd5(pvlVar, (byte) 14));
        animatorSet.play(valueAnimatorOfFloat);
        return animatorSet;
    }

    public final int b(boolean z2) {
        if (this.f31174a.isEnabled()) {
            return z2 ? this.e : this.b;
        }
        return this.d;
    }

    public final AnimatorSet c(awl awlVar, boolean z2) {
        Pair pair;
        Pair pair2;
        DsCheckBoxOld dsCheckBoxOld = this.f31174a;
        boolean zIsEnabled = dsCheckBoxOld.isEnabled();
        int i = this.b;
        int i2 = this.e;
        int i3 = this.c;
        int i4 = this.d;
        if (zIsEnabled) {
            pair = z2 ? new Pair(Integer.valueOf(i2), Integer.valueOf(i3)) : new Pair(Integer.valueOf(i), Integer.valueOf(i3));
        } else {
            pair = new Pair(Integer.valueOf(i4), Integer.valueOf(i3));
        }
        int iIntValue = ((Number) pair.f46059a).intValue();
        int iIntValue2 = ((Number) pair.b).intValue();
        if (dsCheckBoxOld.isEnabled()) {
            pair2 = z2 ? new Pair(Integer.valueOf(i2), Integer.valueOf(i2)) : new Pair(Integer.valueOf(i), Integer.valueOf(i4));
        } else {
            pair2 = new Pair(Integer.valueOf(i4), Integer.valueOf(i4));
        }
        int iIntValue3 = ((Number) pair2.f46059a).intValue();
        int iIntValue4 = ((Number) pair2.b).intValue();
        List list = awlVar == awl.STATE_CHECKED ? z : A;
        AnimatorSet animatorSet = new AnimatorSet();
        tvl tvlVarD = d();
        qvl qvlVar = new qvl(this, list, (byte) 0);
        tvlVarD.getClass();
        AccelerateInterpolator accelerateInterpolator = this.x;
        accelerateInterpolator.getClass();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.6f);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(accelerateInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new fd5(qvlVar, (byte) 15));
        tvl tvlVarD2 = d();
        pvl pvlVar = new pvl(this, (byte) 1);
        tvlVarD2.getClass();
        LinearInterpolator linearInterpolator = this.v;
        ArgbEvaluator argbEvaluator = this.y;
        ValueAnimator valueAnimatorA = tvl.a(iIntValue, iIntValue2, linearInterpolator, argbEvaluator, pvlVar);
        tvl tvlVarD3 = d();
        pvl pvlVar2 = new pvl(this, (byte) 2);
        tvlVarD3.getClass();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorA, tvl.a(iIntValue3, iIntValue4, linearInterpolator, argbEvaluator, pvlVar2));
        return animatorSet;
    }

    public final tvl d() {
        return (tvl) this.s.getValue();
    }

    public final AnimatorSet e(awl awlVar, boolean z2) {
        Pair pair;
        Pair pair2;
        ValueAnimator valueAnimatorOfInt;
        DsCheckBoxOld dsCheckBoxOld = this.f31174a;
        boolean zIsEnabled = dsCheckBoxOld.isEnabled();
        int i = this.b;
        int i2 = this.c;
        int i3 = this.e;
        int i4 = this.d;
        if (zIsEnabled) {
            pair = z2 ? new Pair(Integer.valueOf(i2), Integer.valueOf(i3)) : new Pair(Integer.valueOf(i2), Integer.valueOf(i));
        } else {
            pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i4));
        }
        int iIntValue = ((Number) pair.f46059a).intValue();
        int iIntValue2 = ((Number) pair.b).intValue();
        if (dsCheckBoxOld.isEnabled()) {
            pair2 = z2 ? new Pair(Integer.valueOf(i3), Integer.valueOf(i3)) : new Pair(Integer.valueOf(i4), Integer.valueOf(i));
        } else {
            pair2 = new Pair(Integer.valueOf(i4), Integer.valueOf(i4));
        }
        int iIntValue3 = ((Number) pair2.f46059a).intValue();
        int iIntValue4 = ((Number) pair2.b).intValue();
        awl awlVar2 = awl.STATE_CHECKED;
        List list = awlVar == awlVar2 ? z : A;
        byte b = 1;
        DecelerateInterpolator decelerateInterpolator = this.w;
        if (awlVar == awlVar2) {
            valueAnimatorOfInt = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfInt.setDuration(350L);
            valueAnimatorOfInt.setInterpolator(decelerateInterpolator);
            valueAnimatorOfInt.addUpdateListener(new fd5(this, (byte) 12));
        } else {
            valueAnimatorOfInt = ValueAnimator.ofInt(0, 1);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        tvl tvlVarD = d();
        qvl qvlVar = new qvl(this, list, b);
        tvlVarD.getClass();
        decelerateInterpolator.getClass();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.6f, 1.0f);
        valueAnimatorOfFloat.setDuration(350L);
        valueAnimatorOfFloat.setInterpolator(decelerateInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new fd5(qvlVar, (byte) 13));
        tvl tvlVarD2 = d();
        pvl pvlVar = new pvl(this, (byte) 3);
        tvlVarD2.getClass();
        LinearInterpolator linearInterpolator = this.v;
        ArgbEvaluator argbEvaluator = this.y;
        ValueAnimator valueAnimatorA = tvl.a(iIntValue, iIntValue2, linearInterpolator, argbEvaluator, pvlVar);
        tvl tvlVarD3 = d();
        pvl pvlVar2 = new pvl(this, (byte) 4);
        tvlVarD3.getClass();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfInt, valueAnimatorA, tvl.a(iIntValue3, iIntValue4, linearInterpolator, argbEvaluator, pvlVar2));
        return animatorSet;
    }

    public final void f(float f) {
        this.u = f;
        float f2 = this.p;
        float f3 = (f2 - (f * f2)) / 2.0f;
        RectF rectF = this.h;
        this.n = si30.b(rectF.left + f3);
        this.o = si30.b(rectF.right - f3);
        this.f31174a.invalidate();
    }

    public final void g(awl awlVar, boolean z2) {
        awlVar.getClass();
        int iOrdinal = awlVar.ordinal();
        List list = A;
        Paint paint = this.q;
        Paint paint2 = this.r;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                paint2.setColor(b(z2));
                paint.setColor(b(z2));
                h(z);
                f(1.0f);
                return;
            }
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            paint2.setColor(b(z2));
            paint.setColor(b(z2));
            h(list);
            f(1.0f);
            return;
        }
        DsCheckBoxOld dsCheckBoxOld = this.f31174a;
        boolean zIsEnabled = dsCheckBoxOld.isEnabled();
        int i = this.e;
        int i2 = this.c;
        if (zIsEnabled && z2) {
            i2 = i;
        }
        paint2.setColor(i2);
        boolean zIsEnabled2 = dsCheckBoxOld.isEnabled();
        int i3 = this.d;
        if (!zIsEnabled2 || !z2) {
            i = i3;
        }
        paint.setColor(i);
        h(list);
        f(0.0f);
    }

    public final void h(List list) {
        Path path = this.l;
        path.reset();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            Pair pair = (Pair) obj;
            float fFloatValue = ((Number) pair.f46059a).floatValue();
            float fFloatValue2 = ((Number) pair.b).floatValue();
            PointF pointF = this.f;
            if (i == 0) {
                float f = this.m;
                path.moveTo((fFloatValue * f) + pointF.x, (fFloatValue2 * f) + pointF.y);
            } else {
                float f2 = this.m;
                path.lineTo((fFloatValue * f2) + pointF.x, (fFloatValue2 * f2) + pointF.y);
            }
            i = i2;
        }
        path.close();
    }
}
