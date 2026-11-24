package com.facebook.shimmer;

import a.aqj0;
import a.cqj0;
import a.hqj0;
import a.p4;
import a.ppd0;
import a.zpj0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f45453a;
    public final hqj0 b;
    public boolean c;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.f45453a = new Paint();
        this.b = new hqj0();
        this.c = true;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        p4 zpj0Var;
        setWillNotDraw(false);
        hqj0 hqj0Var = this.b;
        hqj0Var.setCallback(this);
        Paint paint = this.f45453a;
        if (attributeSet == null) {
            cqj0 cqj0VarO0 = new zpj0().o0();
            hqj0Var.c(cqj0VarO0);
            if (cqj0VarO0.n) {
                setLayerType(2, paint);
                return;
            } else {
                setLayerType(0, null);
                return;
            }
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ppd0.f27371a, 0, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(4) && typedArrayObtainStyledAttributes.getBoolean(4, false)) {
                zpj0Var = new aqj0((byte) 10);
                ((cqj0) zpj0Var.b).p = false;
            } else {
                zpj0Var = new zpj0();
            }
            cqj0 cqj0VarO1 = zpj0Var.r0(typedArrayObtainStyledAttributes).o0();
            hqj0Var.c(cqj0VarO1);
            if (cqj0VarO1.n) {
                setLayerType(2, paint);
            } else {
                setLayerType(0, null);
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void b() {
        this.b.d();
    }

    public final void c() {
        hqj0 hqj0Var = this.b;
        if (hqj0Var.e == null || !hqj0Var.a()) {
            return;
        }
        hqj0Var.e.cancel();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c) {
            this.b.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45453a = new Paint();
        this.b = new hqj0();
        this.c = true;
        a(context, attributeSet);
    }
}
