package org.xplatform.ui_core;

import a.aqd0;
import a.jmu0;
import a.l0d;
import a.l43;
import a.m43;
import a.m5d;
import a.n43;
import a.r7x;
import a.sj3;
import a.t9f;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class AnimatedCoefficientView extends FrameLayout {
    public static final /* synthetic */ int j1 = 0;
    public float A;
    public long B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f47180a;
    public final TextPaint b;
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;
    public final int f;
    public long f1;
    public final PathInterpolator g;
    public long g1;
    public int h;
    public long h1;
    public final ImageView i;
    public long i1;
    public String j;
    public String k;
    public l0d l;
    public float m;
    public float n;
    public float o;
    public float p;
    public int q;
    public int r;
    public int s;
    public int t;
    public float u;
    public float v;
    public AnimatorSet w;
    public AnimatorSet x;
    public final float y;
    public float z;

    /* JADX WARN: Illegal instructions before constructor call */
    public AnimatedCoefficientView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        r7x.r(textPaint, context, R.style.TextStyle_Caption_Medium_L_TextPrimary);
        this.f47180a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setAntiAlias(true);
        r7x.r(textPaint2, context, R.style.TextStyle_Caption_Medium_L_TextPrimary);
        this.b = textPaint2;
        Drawable drawable = context.getDrawable(R.drawable.ic_glyph_arrow_up);
        sj3.B0(drawable, context, R.attr.uikitCoefHigher);
        this.c = drawable;
        Drawable drawable2 = context.getDrawable(R.drawable.ic_glyph_arrow_down);
        sj3.B0(drawable2, context, R.attr.uikitCoefLower);
        this.d = drawable2;
        Drawable drawable3 = context.getDrawable(R.drawable.ic_glyph_lock);
        sj3.B0(drawable3, context, R.attr.uikitSecondary);
        this.e = drawable3;
        this.f = m5d.b(R.attr.uikitTextPrimary, context);
        this.g = new PathInterpolator(0.42f, 0.0f, 1.0f, 1.0f);
        this.h = getResources().getDimensionPixelSize(R.dimen.size_12);
        ImageView imageView = new ImageView(context);
        int i2 = this.h;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        addView(imageView);
        this.i = imageView;
        this.j = "";
        this.k = "";
        this.l = l0d.f19195a;
        this.y = getResources().getDimensionPixelSize(R.dimen.text_12);
        this.z = getResources().getDimensionPixelSize(R.dimen.text_12);
        this.A = this.y;
        this.B = 400L;
        this.f1 = 3000L;
        this.g1 = 400L;
        this.h1 = 4000L;
        this.i1 = 400L;
        setTag("AnimatedCoefficientView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aqd0.f1291a, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        if (resourceId != 0) {
            Context context2 = getContext();
            context2.getClass();
            r7x.r(textPaint2, context2, resourceId);
            Context context3 = getContext();
            context3.getClass();
            r7x.r(textPaint, context3, resourceId);
            this.y = textPaint2.getTextSize();
            this.A = textPaint2.getTextSize();
        }
        setMinTextSize(typedArrayObtainStyledAttributes.getDimension(1, this.y));
        setCoefficientChangeArrowSize(typedArrayObtainStyledAttributes.getDimension(0, this.h));
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
    }

    private final int getCurNewCoefColor() {
        int i;
        Context context = getContext();
        context.getClass();
        int iOrdinal = this.l.ordinal();
        if (iOrdinal == 1) {
            i = R.attr.uikitCoefHigher;
        } else if (iOrdinal != 2) {
            i = iOrdinal != 4 ? R.attr.uikitTextPrimary : R.attr.uikitSecondary;
        } else {
            i = R.attr.uikitCoefLower;
        }
        return m5d.b(i, context);
    }

    private final int getOldCoefColor() {
        int i;
        Context context = getContext();
        context.getClass();
        int iOrdinal = this.l.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 4) {
            i = R.attr.uikitSecondary60;
        } else {
            i = iOrdinal != 5 ? R.attr.uikitTextPrimary : R.attr.uikitSecondary;
        }
        return m5d.b(i, context);
    }

    public final void a() {
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.x;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    public final ValueAnimator b() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(127, 0);
        valueAnimatorOfInt.setStartDelay(this.B + this.f1);
        valueAnimatorOfInt.setDuration(this.g1);
        valueAnimatorOfInt.setInterpolator(this.g);
        valueAnimatorOfInt.addUpdateListener(new l43(this, (byte) 6));
        return valueAnimatorOfInt;
    }

    public final ValueAnimator c() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.u, this.v);
        valueAnimatorOfFloat.setDuration(this.B);
        valueAnimatorOfFloat.setInterpolator(this.g);
        valueAnimatorOfFloat.addUpdateListener(new l43(this, (byte) 8));
        return valueAnimatorOfFloat;
    }

    public final ValueAnimator d() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 127);
        valueAnimatorOfInt.setDuration(this.B);
        valueAnimatorOfInt.setInterpolator(this.g);
        valueAnimatorOfInt.addUpdateListener(new l43(this, (byte) 3));
        return valueAnimatorOfInt;
    }

    public final ValueAnimator e() {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(getCurNewCoefColor()), Integer.valueOf(this.f));
        valueAnimatorOfObject.setStartDelay(this.h1);
        valueAnimatorOfObject.setDuration(this.i1);
        valueAnimatorOfObject.setInterpolator(this.g);
        valueAnimatorOfObject.addUpdateListener(new l43(this, (byte) 9));
        return valueAnimatorOfObject;
    }

    public final void f(boolean z) {
        PathInterpolator pathInterpolator = this.g;
        TextPaint textPaint = this.b;
        if (z) {
            h();
            a();
            textPaint.setFlags(16);
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorC = c();
            ValueAnimator valueAnimatorD = d();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
            valueAnimatorOfInt.setDuration(this.B);
            valueAnimatorOfInt.setInterpolator(pathInterpolator);
            valueAnimatorOfInt.addUpdateListener(new l43(this, (byte) 0));
            animatorSet.playTogether(valueAnimatorC, valueAnimatorD, valueAnimatorOfInt);
            animatorSet.addListener(new n43(this, (byte) 1));
            animatorSet.start();
            this.w = animatorSet;
            return;
        }
        AnimatorSet animatorSet2 = this.w;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.x;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        textPaint.setAlpha(0);
        this.i.setImageDrawable(this.e);
        AnimatorSet animatorSet4 = new AnimatorSet();
        Context context = getContext();
        context.getClass();
        int iB = m5d.b(R.attr.uikitTextPrimary, context);
        Context context2 = getContext();
        context2.getClass();
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(iB, m5d.b(R.attr.uikitSecondary, context2));
        valueAnimatorOfArgb.setDuration(400L);
        valueAnimatorOfArgb.setInterpolator(pathInterpolator);
        valueAnimatorOfArgb.addUpdateListener(new l43(this, (byte) 1));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.B);
        valueAnimatorOfFloat.setInterpolator(pathInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new l43(this, (byte) 4));
        animatorSet4.playTogether(valueAnimatorOfArgb, valueAnimatorOfFloat);
        animatorSet4.start();
        this.w = animatorSet4;
    }

    public final void g(boolean z) {
        TextPaint textPaint = this.b;
        if (!z) {
            AnimatorSet animatorSet = this.w;
            if (animatorSet == null || !animatorSet.isRunning()) {
                AnimatorSet animatorSet2 = this.x;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    textPaint.setAlpha(0);
                    this.f47180a.setColor(getCurNewCoefColor());
                    invalidate();
                    return;
                }
                return;
            }
            return;
        }
        textPaint.setAlpha(0);
        AnimatorSet animatorSet3 = new AnimatorSet();
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(getCurNewCoefColor()), Integer.valueOf(this.f));
        valueAnimatorOfObject.setDuration(this.i1);
        PathInterpolator pathInterpolator = this.g;
        valueAnimatorOfObject.setInterpolator(pathInterpolator);
        valueAnimatorOfObject.addUpdateListener(new l43(this, (byte) 5));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 0);
        valueAnimatorOfInt.setDuration(this.i1);
        valueAnimatorOfInt.setInterpolator(pathInterpolator);
        valueAnimatorOfInt.addUpdateListener(new l43(this, (byte) 7));
        animatorSet3.play(valueAnimatorOfObject).with(valueAnimatorOfInt);
        animatorSet3.start();
        this.x = animatorSet3;
    }

    public final void h() {
        Drawable drawable;
        this.b.setColor(getOldCoefColor());
        this.f47180a.setColor(getCurNewCoefColor());
        int iOrdinal = this.l.ordinal();
        if (iOrdinal == 1) {
            drawable = this.c;
        } else if (iOrdinal != 2) {
            drawable = (iOrdinal == 4 || iOrdinal == 5) ? this.e : null;
        } else {
            drawable = this.d;
        }
        this.i.setImageDrawable(drawable);
        invalidate();
    }

    public final void i(String str, String str2, l0d l0dVar) {
        l0d l0dVar2;
        str.getClass();
        str2.getClass();
        l0dVar.getClass();
        l0d l0dVar3 = this.l;
        l0d l0dVar4 = l0d.e;
        boolean z = l0dVar3 == l0dVar4 && l0dVar == l0d.f19195a;
        boolean z2 = l0dVar3 == l0dVar4 && l0dVar == l0dVar4 && !str.equals(str2);
        boolean z3 = (str.equals(this.j) && str2.equals(this.k) && l0dVar == this.l) ? false : true;
        if (!str.equals(this.j)) {
            j();
        }
        boolean z4 = l0dVar == l0d.f19195a && ((l0dVar2 = this.l) == l0d.b || l0dVar2 == l0d.c);
        this.j = str;
        if (!z4) {
            this.k = str2;
        }
        this.l = l0dVar;
        if (z3) {
            requestLayout();
        }
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new m43(l0dVar, this, z2, z));
            return;
        }
        int iOrdinal = l0dVar.ordinal();
        if (iOrdinal == 0) {
            g(z);
            return;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            h();
            a();
            l();
            return;
        }
        if (iOrdinal == 3) {
            a();
            j();
            h();
            this.b.setAlpha(0);
            return;
        }
        if (iOrdinal == 4) {
            f(z2);
            return;
        }
        if (iOrdinal != 5) {
            t9f.b();
            return;
        }
        h();
        this.f47180a.setAlpha(0);
        a();
        k();
    }

    public final void j() {
        a();
        this.b.setAlpha(0);
        this.f47180a.setAlpha(1);
        h();
        invalidate();
    }

    public final void k() {
        this.b.setFlags(16);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(c());
        animatorSet.addListener(new n43(this, (byte) 0));
        animatorSet.start();
        this.w = animatorSet;
    }

    public final void l() {
        this.b.setFlags(16);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorC = c();
        ValueAnimator valueAnimatorD = d();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
        valueAnimatorOfInt.setDuration(this.B);
        valueAnimatorOfInt.setInterpolator(this.g);
        valueAnimatorOfInt.addUpdateListener(new l43(this, (byte) 0));
        animatorSet.playTogether(valueAnimatorC, valueAnimatorD, valueAnimatorOfInt);
        animatorSet.addListener(new n43(this, (byte) 2));
        animatorSet.start();
        this.w = animatorSet;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.w = null;
        AnimatorSet animatorSet2 = this.x;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.x = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        String str = this.j;
        float measuredWidth = this.o;
        float f = this.p;
        float f2 = this.s;
        if (getLayoutDirection() == 1) {
            measuredWidth = (getMeasuredWidth() - f2) - measuredWidth;
        }
        canvas.drawText(str, measuredWidth, f, this.f47180a);
        String str2 = this.k;
        float f3 = this.t;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint = this.b;
        CharSequence charSequenceEllipsize = TextUtils.ellipsize(str2, textPaint, f3, truncateAt);
        charSequenceEllipsize.getClass();
        float measuredWidth2 = this.m;
        float f4 = this.n;
        float f5 = this.t;
        if (getLayoutDirection() == 1) {
            measuredWidth2 = (getMeasuredWidth() - f5) - measuredWidth2;
        }
        canvas.drawText(charSequenceEllipsize.toString(), measuredWidth2, f4, textPaint);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.q;
        int i6 = this.r;
        int i7 = this.h;
        jmu0.f(i5, i6, i5 + i7, i7 + i6, this.i, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        int mode = View.MeasureSpec.getMode(i);
        TextPaint textPaint = this.b;
        TextPaint textPaint2 = this.f47180a;
        if (mode == 1073741824) {
            float f = this.z;
            float f2 = this.y;
            if (f2 == f) {
                this.s = (int) textPaint2.measureText(this.j);
                this.t = (int) textPaint.measureText(this.k);
            } else {
                int size2 = View.MeasureSpec.getSize(i);
                this.A = f2;
                textPaint2.setTextSize(f2);
                textPaint.setTextSize(this.A);
                this.s = (int) textPaint2.measureText(this.j);
                int iMeasureText = (int) textPaint.measureText(this.k);
                this.t = iMeasureText;
                float f3 = this.s + iMeasureText;
                int i3 = this.h;
                while (size2 < f3 + i3) {
                    float f4 = this.A - 1.0f;
                    this.A = f4;
                    textPaint2.setTextSize(f4);
                    textPaint.setTextSize(this.A);
                    this.s = (int) textPaint2.measureText(this.j);
                    int iMeasureText2 = (int) textPaint.measureText(this.k);
                    this.t = iMeasureText2;
                    f3 = this.s + iMeasureText2;
                    i3 = this.h;
                }
            }
            int size3 = (View.MeasureSpec.getSize(i) - this.s) - this.h;
            int i4 = this.t;
            if (i4 <= size3) {
                size3 = i4;
            }
            this.t = size3;
            size = View.MeasureSpec.getSize(i);
        } else {
            Integer numValueOf = Integer.valueOf((int) textPaint.measureText(this.k));
            if (this.k.length() <= 0) {
                numValueOf = null;
            }
            this.t = numValueOf != null ? numValueOf.intValue() : 0;
            int iMeasureText3 = (int) textPaint2.measureText(this.j);
            this.s = iMeasureText3;
            size = iMeasureText3 + this.t + this.h;
        }
        Paint.FontMetrics fontMetrics = textPaint2.getFontMetrics();
        int i5 = (int) (fontMetrics.descent - fontMetrics.ascent);
        Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
        int iMax = Math.max(Math.max(i5, (int) (fontMetrics2.descent - fontMetrics2.ascent)), this.h);
        float f5 = size;
        this.o = f5 - this.s;
        if (this.l != l0d.f19195a || (((animatorSet = this.w) == null || !animatorSet.isRunning()) && ((animatorSet2 = this.x) == null || !animatorSet2.isRunning()))) {
            float f6 = this.t;
            float f7 = f5 - f6;
            this.u = f7;
            this.m = f7;
            this.v = ((f5 - this.s) - this.h) - f6;
            Paint.FontMetrics fontMetrics3 = textPaint.getFontMetrics();
            this.n = ((((int) (fontMetrics3.descent - fontMetrics3.ascent)) / 2.0f) + (iMax / 2)) - textPaint.getFontMetrics().descent;
        }
        int i6 = iMax / 2;
        Paint.FontMetrics fontMetrics4 = textPaint2.getFontMetrics();
        this.p = ((((int) (fontMetrics4.descent - fontMetrics4.ascent)) / 2.0f) + i6) - textPaint2.getFontMetrics().descent;
        int i7 = size - this.s;
        int i8 = this.h;
        this.q = i7 - i8;
        this.r = i6 - (i8 / 2);
        setMeasuredDimension(size, iMax);
    }

    public final void setCoefficientChangeArrowSize(int i) {
        this.h = getResources().getDimensionPixelSize(i);
    }

    public final void setHideOldCoefficientDelayMs(long j) {
        this.f1 = j;
    }

    public final void setHideOldCoefficientDurationMs(long j) {
        this.g1 = j;
    }

    public final void setMinTextSize(int i) {
        this.z = getResources().getDimensionPixelSize(i);
    }

    public final void setShowCoefficientChangedAnimationDurationMs(long j) {
        this.B = j;
    }

    public final void setSwitchOffCoefficientHighlightingDelayMs(long j) {
        this.h1 = j;
    }

    public final void setSwitchOffCoefficientHighlightingDurationMs(long j) {
        this.i1 = j;
    }

    public final void setCoefficientChangeArrowSize(float f) {
        this.h = (int) f;
    }

    public final void setMinTextSize(float f) {
        this.z = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedCoefficientView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedCoefficientView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
