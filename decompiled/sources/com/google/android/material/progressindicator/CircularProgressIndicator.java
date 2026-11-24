package com.google.android.material.progressindicator;

import a.c2;
import a.d5x;
import a.dkc;
import a.hgk;
import a.itf0;
import a.jf4;
import a.m4u0;
import a.n4u0;
import a.t06;
import a.tjc;
import a.u06;
import a.vjc;
import a.xjc;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class CircularProgressIndicator extends t06 {
    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        dkc dkcVar = (dkc) this.f33104a;
        tjc tjcVar = new tjc(dkcVar);
        Context context2 = getContext();
        d5x d5xVar = new d5x(context2, dkcVar, tjcVar, dkcVar.q == 1 ? new xjc(context2, dkcVar) : new vjc(dkcVar));
        Resources resources = context2.getResources();
        n4u0 n4u0Var = new n4u0();
        ThreadLocal threadLocal = itf0.f15351a;
        n4u0Var.f7201a = resources.getDrawable(R.drawable.ic_mtrl_arrow_circle, null);
        new m4u0(n4u0Var.f7201a.getConstantState());
        d5xVar.p = n4u0Var;
        setIndeterminateDrawable(d5xVar);
        setProgressDrawable(new hgk(getContext(), dkcVar, tjcVar));
        this.i = true;
    }

    public int getIndeterminateAnimationType() {
        return ((dkc) this.f33104a).q;
    }

    public int getIndicatorDirection() {
        return ((dkc) this.f33104a).t;
    }

    public int getIndicatorInset() {
        return ((dkc) this.f33104a).s;
    }

    public int getIndicatorSize() {
        return ((dkc) this.f33104a).r;
    }

    public void setIndeterminateAnimationType(int i) {
        u06 u06Var = this.f33104a;
        if (((dkc) u06Var).q == i) {
            return;
        }
        if (d() && isIndeterminate()) {
            jf4.n("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ((dkc) u06Var).q = i;
        ((dkc) u06Var).d();
        c2 xjcVar = i == 1 ? new xjc(getContext(), (dkc) u06Var) : new vjc((dkc) u06Var);
        d5x indeterminateDrawable = getIndeterminateDrawable();
        indeterminateDrawable.o = xjcVar;
        xjcVar.f3600a = indeterminateDrawable;
        b();
        invalidate();
    }

    public void setIndicatorDirection(int i) {
        ((dkc) this.f33104a).t = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        u06 u06Var = this.f33104a;
        if (((dkc) u06Var).s != i) {
            ((dkc) u06Var).s = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        u06 u06Var = this.f33104a;
        if (((dkc) u06Var).r != iMax) {
            ((dkc) u06Var).r = iMax;
            ((dkc) u06Var).d();
            requestLayout();
            invalidate();
        }
    }

    @Override // a.t06
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((dkc) this.f33104a).d();
    }

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }
}
