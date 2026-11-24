package com.google.android.material.card;

import a.akj0;
import a.blj0;
import a.d7x;
import a.di30;
import a.dwi0;
import a.epv0;
import a.fi30;
import a.g7x;
import a.ii30;
import a.jiq0;
import a.k7x;
import a.ki30;
import a.lul0;
import a.mrv;
import a.n6x;
import a.rpd0;
import a.u7m0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, blj0 {
    public static final int[] k = {R.attr.state_checkable};
    public static final int[] l = {R.attr.state_checked};
    public static final int[] m = {org.xbet.client1.R.attr.state_dragged};
    public static final int[] n = {R.attr.state_hovered};
    public final fi30 g;
    public final boolean h;
    public boolean i;
    public boolean j;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        u7m0 u7m0VarG;
        super(dwi0.V(context, attributeSet, org.xbet.client1.R.attr.materialCardViewStyle, org.xbet.client1.R.style.Widget_MaterialComponents_CardView), attributeSet, org.xbet.client1.R.attr.materialCardViewStyle);
        this.i = false;
        this.j = false;
        this.h = true;
        TypedArray typedArrayL0 = mrv.l0(getContext(), attributeSet, rpd0.C, org.xbet.client1.R.attr.materialCardViewStyle, org.xbet.client1.R.style.Widget_MaterialComponents_CardView, new int[0]);
        fi30 fi30Var = new fi30(this, attributeSet);
        this.g = fi30Var;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        ki30 ki30Var = fi30Var.c;
        ki30Var.s(cardBackgroundColor);
        fi30Var.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        fi30Var.l();
        MaterialCardView materialCardView = fi30Var.f9569a;
        ColorStateList colorStateListA = g7x.A(11, materialCardView.getContext(), typedArrayL0);
        fi30Var.o = colorStateListA;
        if (colorStateListA == null) {
            fi30Var.o = ColorStateList.valueOf(-1);
        }
        fi30Var.i = typedArrayL0.getDimensionPixelSize(12, 0);
        boolean z = typedArrayL0.getBoolean(0, false);
        fi30Var.t = z;
        materialCardView.setLongClickable(z);
        fi30Var.m = g7x.A(6, materialCardView.getContext(), typedArrayL0);
        fi30Var.g(g7x.D(2, materialCardView.getContext(), typedArrayL0));
        fi30Var.g = typedArrayL0.getDimensionPixelSize(5, 0);
        fi30Var.f = typedArrayL0.getDimensionPixelSize(4, 0);
        fi30Var.h = typedArrayL0.getInteger(3, 8388661);
        ColorStateList colorStateListA2 = g7x.A(7, materialCardView.getContext(), typedArrayL0);
        fi30Var.l = colorStateListA2;
        if (colorStateListA2 == null) {
            fi30Var.l = ColorStateList.valueOf(d7x.H(materialCardView.getContext(), n6x.V(materialCardView, org.xbet.client1.R.attr.colorControlHighlight)));
        }
        ColorStateList colorStateListA3 = g7x.A(1, materialCardView.getContext(), typedArrayL0);
        colorStateListA3 = colorStateListA3 == null ? ColorStateList.valueOf(0) : colorStateListA3;
        ki30 ki30Var2 = fi30Var.d;
        ki30Var2.s(colorStateListA3);
        RippleDrawable rippleDrawable = fi30Var.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(fi30Var.l);
        }
        ki30Var.r(materialCardView.getCardElevation());
        float f = fi30Var.i;
        ColorStateList colorStateList = fi30Var.o;
        ki30Var2.b.j = f;
        ki30Var2.invalidateSelf();
        ii30 ii30Var = ki30Var2.b;
        if (ii30Var.d != colorStateList) {
            ii30Var.d = colorStateList;
            ki30Var2.onStateChange(ki30Var2.getState());
        }
        materialCardView.setBackgroundInternal(fi30Var.d(ki30Var));
        Drawable drawableC = fi30Var.j() ? fi30Var.c() : ki30Var2;
        fi30Var.j = drawableC;
        materialCardView.setForeground(fi30Var.d(drawableC));
        if (fi30Var.e == -1.0f && (u7m0VarG = u7m0.g(8, materialCardView.getContext(), typedArrayL0)) != null) {
            lul0 lul0VarX = g7x.X(materialCardView.getContext());
            ki30Var.q(lul0VarX);
            ki30Var2.q(lul0VarX);
            ki30 ki30Var3 = fi30Var.r;
            if (ki30Var3 != null) {
                ki30Var3.q(lul0VarX);
            }
            fi30Var.h(u7m0VarG);
        }
        typedArrayL0.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.g.c.getBounds());
        return rectF;
    }

    public final void b() {
        fi30 fi30Var;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (fi30Var = this.g).p) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        fi30Var.p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        fi30Var.p.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.g.c.b.c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.g.d.b.c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.g.k;
    }

    public int getCheckedIconGravity() {
        return this.g.h;
    }

    public int getCheckedIconMargin() {
        return this.g.f;
    }

    public int getCheckedIconSize() {
        return this.g.g;
    }

    public ColorStateList getCheckedIconTint() {
        return this.g.m;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.g.b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.g.b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.g.b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.g.b.top;
    }

    public float getProgress() {
        return this.g.c.b.i;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.g.c.l();
    }

    public ColorStateList getRippleColor() {
        return this.g.l;
    }

    public akj0 getShapeAppearanceModel() {
        return this.g.n.d();
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.g.o;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.g.o;
    }

    public int getStrokeWidth() {
        return this.g.i;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fi30 fi30Var = this.g;
        fi30Var.k();
        k7x.V(this, fi30Var.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 8);
        fi30 fi30Var = this.g;
        if (fi30Var != null && fi30Var.t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, k);
        }
        if (this.i) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, l);
        }
        if (this.j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, m);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.PRESSED_STATE_SET);
            }
            if (isHovered()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, n);
            }
            if (isEnabled()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.ENABLED_STATE_SET);
            }
            if (isFocused()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.FOCUSED_STATE_SET);
            }
            if (isSelected()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.SELECTED_STATE_SET);
            }
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.i);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        fi30 fi30Var = this.g;
        accessibilityNodeInfo.setCheckable(fi30Var != null && fi30Var.t);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.i);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.g.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.h) {
            fi30 fi30Var = this.g;
            if (!fi30Var.s) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                fi30Var.s = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.g.c.s(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        fi30 fi30Var = this.g;
        fi30Var.c.r(fi30Var.f9569a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        ki30 ki30Var = this.g.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        ki30Var.s(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.g.t = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.i != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.g.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        fi30 fi30Var = this.g;
        if (fi30Var.h != i) {
            fi30Var.h = i;
            MaterialCardView materialCardView = fi30Var.f9569a;
            fi30Var.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.g.f = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.g.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.g.g(epv0.U(i, getContext()));
    }

    public void setCheckedIconSize(int i) {
        this.g.g = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.g.g = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        fi30 fi30Var = this.g;
        fi30Var.m = colorStateList;
        Drawable drawable = fi30Var.k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        fi30 fi30Var = this.g;
        if (fi30Var != null) {
            fi30Var.k();
        }
    }

    public void setDragged(boolean z) {
        if (this.j != z) {
            this.j = z;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.g.m();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        fi30 fi30Var = this.g;
        fi30Var.m();
        fi30Var.l();
    }

    public void setProgress(float f) {
        fi30 fi30Var = this.g;
        fi30Var.c.t(f);
        ki30 ki30Var = fi30Var.d;
        if (ki30Var != null) {
            ki30Var.t(f);
        }
        ki30 ki30Var2 = fi30Var.r;
        if (ki30Var2 != null) {
            ki30Var2.t(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        fi30 fi30Var = this.g;
        fi30Var.e = f;
        fi30Var.h(fi30Var.n.d().a(f));
        fi30Var.j.invalidateSelf();
        if (fi30Var.i() || (fi30Var.f9569a.getPreventCornerOverlap() && !fi30Var.c.p())) {
            fi30Var.l();
        }
        if (fi30Var.i()) {
            fi30Var.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        fi30 fi30Var = this.g;
        fi30Var.l = colorStateList;
        RippleDrawable rippleDrawable = fi30Var.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListN0 = jiq0.n0(i, getContext());
        fi30 fi30Var = this.g;
        fi30Var.l = colorStateListN0;
        RippleDrawable rippleDrawable = fi30Var.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListN0);
        }
    }

    @Override // a.blj0
    public void setShapeAppearanceModel(akj0 akj0Var) {
        setClipToOutline(akj0Var.k(getBoundsAsRectF()));
        this.g.h(akj0Var);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        fi30 fi30Var = this.g;
        if (fi30Var.o != colorStateList) {
            fi30Var.o = colorStateList;
            ki30 ki30Var = fi30Var.d;
            ki30Var.b.j = fi30Var.i;
            ki30Var.invalidateSelf();
            ii30 ii30Var = ki30Var.b;
            if (ii30Var.d != colorStateList) {
                ii30Var.d = colorStateList;
                ki30Var.onStateChange(ki30Var.getState());
            }
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        fi30 fi30Var = this.g;
        if (i != fi30Var.i) {
            fi30Var.i = i;
            ki30 ki30Var = fi30Var.d;
            ColorStateList colorStateList = fi30Var.o;
            ki30Var.b.j = i;
            ki30Var.invalidateSelf();
            ii30 ii30Var = ki30Var.b;
            if (ii30Var.d != colorStateList) {
                ii30Var.d = colorStateList;
                ki30Var.onStateChange(ki30Var.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        fi30 fi30Var = this.g;
        fi30Var.m();
        fi30Var.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        fi30 fi30Var = this.g;
        if (fi30Var != null && fi30Var.t && isEnabled()) {
            this.i = !this.i;
            refreshDrawableState();
            b();
            fi30Var.f(this.i, true);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.g.c.s(colorStateList);
    }

    public void setOnCheckedChangeListener(di30 di30Var) {
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }
}
