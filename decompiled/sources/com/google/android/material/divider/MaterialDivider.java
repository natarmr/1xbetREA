package com.google.android.material.divider;

import a.dwi0;
import a.g7x;
import a.ki30;
import a.mrv;
import a.rpd0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ki30 f45572a;
    public int b;
    public int c;
    public int d;
    public int e;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(dwi0.V(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f45572a = new ki30();
        TypedArray typedArrayL0 = mrv.l0(context2, attributeSet, rpd0.E, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.b = typedArrayL0.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.d = typedArrayL0.getDimensionPixelOffset(2, 0);
        this.e = typedArrayL0.getDimensionPixelOffset(1, 0);
        setDividerColor(g7x.A(0, context2, typedArrayL0).getDefaultColor());
        typedArrayL0.recycle();
    }

    public int getDividerColor() {
        return this.c;
    }

    public int getDividerInsetEnd() {
        return this.e;
    }

    public int getDividerInsetStart() {
        return this.d;
    }

    public int getDividerThickness() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.e : this.d;
        if (z) {
            width = getWidth();
            i = this.d;
        } else {
            width = getWidth();
            i = this.e;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        ki30 ki30Var = this.f45572a;
        ki30Var.setBounds(i2, 0, i3, bottom);
        ki30Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.b;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.c != i) {
            this.c = i;
            this.f45572a.s(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.e = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.d = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.b != i) {
            this.b = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(Context context) {
        this(context, null);
    }
}
