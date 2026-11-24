package org.xplatform.ui_core.viewcomponents.layouts.linear;

import a.cqj0;
import a.hqj0;
import a.iqj0;
import a.zpj0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class ShimmerLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f47194a;
    public final hqj0 b;
    public boolean c;
    public Integer d;
    public final iqj0 e;

    /* JADX WARN: Illegal instructions before constructor call */
    public ShimmerLinearLayout(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f47194a = new Paint();
        hqj0 hqj0Var = new hqj0();
        this.b = hqj0Var;
        this.c = true;
        this.e = new iqj0(this, context, (byte) 0);
        setWillNotDraw(false);
        hqj0Var.setCallback(this);
        setShimmer(((zpj0) ((zpj0) new zpj0().H0(0.7f)).J0(0.3f)).o0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getOccupiedHeightSpace() {
        int childCount = getChildCount();
        int height = 0;
        for (int i = 0; i < childCount; i++) {
            height += getChildAt(i).getHeight();
        }
        return height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getOccupiedWidthSpace() {
        int childCount = getChildCount();
        int width = 0;
        for (int i = 0; i < childCount; i++) {
            width += getChildAt(i).getWidth();
        }
        return width;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        super.dispatchDraw(canvas);
        if (this.c) {
            this.b.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hqj0 hqj0Var = this.b;
        if (!hqj0Var.a()) {
            hqj0Var.d();
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hqj0 hqj0Var = this.b;
        if (hqj0Var.e != null && hqj0Var.a()) {
            hqj0Var.e.cancel();
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.e);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        view.getClass();
        super.onVisibilityChanged(view, i);
        hqj0 hqj0Var = this.b;
        if (i == 0) {
            if (this.c) {
                return;
            }
            this.c = true;
            hqj0Var.d();
            return;
        }
        if (i == 8 && this.c) {
            if (hqj0Var.e != null && hqj0Var.a()) {
                hqj0Var.e.cancel();
            }
            this.c = false;
            invalidate();
        }
    }

    public final void setShimmer(cqj0 cqj0Var) {
        this.b.c(cqj0Var);
        if (cqj0Var != null) {
            setLayerType(2, this.f47194a);
        } else {
            setLayerType(0, null);
        }
    }

    public final void setShimmerItems(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        drawable.getClass();
        return super.verifyDrawable(drawable) || drawable == this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerLinearLayout(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
