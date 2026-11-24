package org.xplatform.ui_core.viewcomponents.layouts.constraint;

import a.cqj0;
import a.hqj0;
import a.zpj0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class ShimmerConstraintLayout extends ConstraintLayout {
    public final Paint q;
    public final hqj0 r;
    public final boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.q = new Paint();
        hqj0 hqj0Var = new hqj0();
        this.r = hqj0Var;
        this.s = true;
        setWillNotDraw(false);
        hqj0Var.setCallback(this);
        setShimmer(((zpj0) ((zpj0) new zpj0().H0(0.7f)).J0(0.3f)).o0());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        super.dispatchDraw(canvas);
        if (this.s) {
            this.r.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hqj0 hqj0Var = this.r;
        if (hqj0Var.a()) {
            return;
        }
        hqj0Var.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hqj0 hqj0Var = this.r;
        if (hqj0Var.e == null || !hqj0Var.a()) {
            return;
        }
        hqj0Var.e.cancel();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.r.setBounds(0, 0, getWidth(), getHeight());
    }

    public final void setShimmer(cqj0 cqj0Var) {
        this.r.c(cqj0Var);
        if (cqj0Var != null) {
            setLayerType(2, this.q);
        } else {
            setLayerType(0, null);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        drawable.getClass();
        return super.verifyDrawable(drawable) || drawable == this.r;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerConstraintLayout(Context context) {
        this(context, null);
        context.getClass();
    }
}
