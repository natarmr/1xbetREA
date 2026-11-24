package com.google.android.material.progressindicator;

import a.c900;
import a.d5x;
import a.f900;
import a.h900;
import a.hgk;
import a.jf4;
import a.k900;
import a.mrv;
import a.rpd0;
import a.t06;
import a.u06;
import a.vhl;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import java.util.Objects;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class LinearProgressIndicator extends t06 {
    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        k900 k900Var = (k900) this.f33104a;
        c900 c900Var = new c900(k900Var);
        c900Var.f = 300.0f;
        c900Var.o = new Pair(new vhl(), new vhl());
        Context context2 = getContext();
        setIndeterminateDrawable(new d5x(context2, k900Var, c900Var, k900Var.q == 0 ? new f900(k900Var) : new h900(context2, k900Var)));
        setProgressDrawable(new hgk(getContext(), k900Var, c900Var));
        this.i = true;
    }

    @Override // a.t06
    public final u06 a(Context context, AttributeSet attributeSet) {
        k900 k900Var = new k900(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        mrv.c0(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = rpd0.t;
        mrv.d0(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        k900Var.q = typedArrayObtainStyledAttributes.getInt(0, 1);
        k900Var.r = typedArrayObtainStyledAttributes.getInt(1, 0);
        k900Var.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            k900Var.u = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(2);
        if (typedValuePeekValue != null) {
            int i = typedValuePeekValue.type;
            if (i == 5) {
                k900Var.v = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), k900Var.f34840a / 2);
                k900Var.x = false;
                k900Var.y = true;
            } else if (i == 6) {
                k900Var.w = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                k900Var.x = true;
                k900Var.y = true;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        k900Var.d();
        k900Var.s = k900Var.r == 1;
        return k900Var;
    }

    @Override // a.t06
    public final void c(int i) {
        u06 u06Var = this.f33104a;
        if (u06Var != null && ((k900) u06Var).q == 0 && isIndeterminate()) {
            return;
        }
        super.c(i);
    }

    public int getIndeterminateAnimationType() {
        return ((k900) this.f33104a).q;
    }

    public int getIndicatorDirection() {
        return ((k900) this.f33104a).r;
    }

    public int getTrackInnerCornerRadius() {
        return ((k900) this.f33104a).v;
    }

    public Integer getTrackStopIndicatorPadding() {
        return ((k900) this.f33104a).u;
    }

    public int getTrackStopIndicatorSize() {
        return ((k900) this.f33104a).t;
    }

    @Override // a.t06, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        u06 u06Var = this.f33104a;
        k900 k900Var = (k900) u06Var;
        boolean z2 = true;
        if (((k900) u06Var).r != 1 && ((getLayoutDirection() != 1 || ((k900) u06Var).r != 2) && (getLayoutDirection() != 0 || ((k900) u06Var).r != 3))) {
            z2 = false;
        }
        k900Var.s = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        d5x indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        hgk progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        u06 u06Var = this.f33104a;
        if (((k900) u06Var).q == i) {
            return;
        }
        if (d() && isIndeterminate()) {
            jf4.n("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ((k900) u06Var).q = i;
        ((k900) u06Var).d();
        if (i == 0) {
            d5x indeterminateDrawable = getIndeterminateDrawable();
            f900 f900Var = new f900((k900) u06Var);
            indeterminateDrawable.o = f900Var;
            f900Var.f3600a = indeterminateDrawable;
        } else {
            d5x indeterminateDrawable2 = getIndeterminateDrawable();
            h900 h900Var = new h900(getContext(), (k900) u06Var);
            indeterminateDrawable2.o = h900Var;
            h900Var.f3600a = indeterminateDrawable2;
        }
        b();
        invalidate();
    }

    @Override // a.t06
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((k900) this.f33104a).d();
    }

    public void setIndicatorDirection(int i) {
        u06 u06Var = this.f33104a;
        ((k900) u06Var).r = i;
        k900 k900Var = (k900) u06Var;
        boolean z = true;
        if (i != 1 && ((getLayoutDirection() != 1 || ((k900) u06Var).r != 2) && (getLayoutDirection() != 0 || i != 3))) {
            z = false;
        }
        k900Var.s = z;
        invalidate();
    }

    @Override // a.t06
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((k900) this.f33104a).d();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i) {
        u06 u06Var = this.f33104a;
        if (((k900) u06Var).v != i) {
            ((k900) u06Var).v = Math.round(Math.min(i, ((k900) u06Var).f34840a / 2.0f));
            ((k900) u06Var).x = false;
            ((k900) u06Var).y = true;
            ((k900) u06Var).d();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f) {
        u06 u06Var = this.f33104a;
        if (((k900) u06Var).w != f) {
            ((k900) u06Var).w = Math.min(f, 0.5f);
            ((k900) u06Var).x = true;
            ((k900) u06Var).y = true;
            ((k900) u06Var).d();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        u06 u06Var = this.f33104a;
        if (Objects.equals(((k900) u06Var).u, num)) {
            return;
        }
        ((k900) u06Var).u = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        u06 u06Var = this.f33104a;
        if (((k900) u06Var).t != i) {
            ((k900) u06Var).t = i;
            ((k900) u06Var).d();
            invalidate();
        }
    }

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }
}
