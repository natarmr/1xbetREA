package org.xplatform.uikit.components.shimmer;

import a.bqd0;
import a.h14;
import a.ktt0;
import a.wqm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class DsShimmerView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wqm f47261a;
    public boolean b;
    public final Rect c;
    public h14 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsShimmerView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.shimmerViewStyle);
        wqm wqmVar = new wqm(getLayoutDirection() == 1);
        this.f47261a = wqmVar;
        this.c = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.m0, R.attr.shimmerViewStyle, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(typedArrayObtainStyledAttributes.getDimension(1, 0.0f));
        gradientDrawable.setColor(ktt0.m(0, context, typedArrayObtainStyledAttributes));
        setBackground(gradientDrawable);
        typedArrayObtainStyledAttributes.recycle();
        setLayerType(2, new Paint());
        wqmVar.setCallback(this);
    }

    public final void a() {
        if (getVisibility() == 0 && isAttachedToWindow() && this.b) {
            this.f47261a.c.start();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.getClass();
        super.draw(canvas);
        this.f47261a.draw(canvas);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.getClass();
        super.invalidateDrawable(drawable);
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d == null) {
            h14 h14Var = new h14(this, (byte) 1);
            this.d = h14Var;
            getViewTreeObserver().addOnPreDrawListener(h14Var);
        }
        a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        h14 h14Var = this.d;
        if (h14Var != null) {
            getViewTreeObserver().removeOnPreDrawListener(h14Var);
            this.d = null;
        }
        this.b = false;
        this.f47261a.c.cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f47261a.setBounds(0, 0, size, size2);
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (getVisibility() == 0) {
            a();
        } else {
            this.f47261a.c.cancel();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsShimmerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsShimmerView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
