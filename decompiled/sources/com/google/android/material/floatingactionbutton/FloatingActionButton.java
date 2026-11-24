package com.google.android.material.floatingactionbutton;

import a.ack;
import a.afn0;
import a.akj0;
import a.ano;
import a.ble;
import a.blj0;
import a.bwl;
import a.dwi0;
import a.g7x;
import a.jf4;
import a.k7x;
import a.mrv;
import a.ocg0;
import a.puu0;
import a.rgu0;
import a.rpd0;
import a.td3;
import a.u3u0;
import a.uuo;
import a.xh;
import a.xke;
import a.yke;
import a.ylq;
import a.ym8;
import a.zlq;
import a.zt40;
import a.zz2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class FloatingActionButton extends puu0 implements ano, blj0, xke {
    public ColorStateList b;
    public PorterDuff.Mode c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public ColorStateList f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public final Rect l;
    public final Rect m;
    public final zz2 n;
    public final u3u0 o;
    public zlq p;

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        Drawable layerDrawable;
        super(dwi0.V(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        this.f27635a = getVisibility();
        this.l = new Rect();
        this.m = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayL0 = mrv.l0(context2, attributeSet, rpd0.o, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.b = g7x.A(1, context2, typedArrayL0);
        this.c = afn0.y(typedArrayL0.getInt(2, -1), null);
        this.f = g7x.A(12, context2, typedArrayL0);
        this.g = typedArrayL0.getInt(7, -1);
        this.h = typedArrayL0.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayL0.getDimensionPixelSize(3, 0);
        float dimension = typedArrayL0.getDimension(4, 0.0f);
        float dimension2 = typedArrayL0.getDimension(9, 0.0f);
        float dimension3 = typedArrayL0.getDimension(11, 0.0f);
        this.k = typedArrayL0.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayL0.getDimensionPixelSize(10, 0));
        zt40 zt40VarA = zt40.a(15, context2, typedArrayL0);
        zt40 zt40VarA2 = zt40.a(8, context2, typedArrayL0);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, rpd0.G, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        akj0 akj0VarC = akj0.i(contextThemeWrapper.obtainStyledAttributes(rpd0.O), akj0.m).c();
        boolean z = typedArrayL0.getBoolean(5, false);
        setEnabled(typedArrayL0.getBoolean(0, true));
        typedArrayL0.recycle();
        zz2 zz2Var = new zz2(this);
        this.n = zz2Var;
        zz2Var.z(attributeSet, R.attr.floatingActionButtonStyle);
        u3u0 u3u0Var = new u3u0();
        u3u0Var.b = false;
        u3u0Var.f35015a = 0;
        u3u0Var.c = this;
        this.o = u3u0Var;
        getImpl().g(akj0VarC);
        zlq impl = getImpl();
        ColorStateList colorStateList = this.b;
        PorterDuff.Mode mode = this.c;
        ColorStateList colorStateList2 = this.f;
        FloatingActionButton floatingActionButton = impl.s;
        akj0 akj0Var = impl.f44593a;
        akj0Var.getClass();
        ylq ylqVar = new ylq(akj0Var);
        impl.b = ylqVar;
        ylqVar.setTintList(colorStateList);
        if (mode != null) {
            impl.b.setTintMode(mode);
        }
        impl.b.o(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            akj0 akj0Var2 = impl.f44593a;
            akj0Var2.getClass();
            ym8 ym8Var = new ym8(akj0Var2);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            ym8Var.i = color;
            ym8Var.j = color2;
            ym8Var.k = color3;
            ym8Var.l = color4;
            float f = dimensionPixelSize;
            if (ym8Var.h != f) {
                ym8Var.h = f;
                ym8Var.b.setStrokeWidth(f * 1.3333f);
                ym8Var.n = true;
                ym8Var.invalidateSelf();
            }
            if (colorStateList != null) {
                ym8Var.m = colorStateList.getColorForState(ym8Var.getState(), ym8Var.m);
            }
            ym8Var.p = colorStateList;
            ym8Var.n = true;
            ym8Var.invalidateSelf();
            impl.d = ym8Var;
            ym8 ym8Var2 = impl.d;
            ym8Var2.getClass();
            ylq ylqVar2 = impl.b;
            ylqVar2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{ym8Var2, ylqVar2});
            drawable = null;
        } else {
            drawable = null;
            impl.d = null;
            layerDrawable = impl.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(ocg0.b(colorStateList2), layerDrawable, drawable);
        impl.c = rippleDrawable;
        FocusRingDrawable.f(floatingActionButton.getContext(), rippleDrawable, impl.b);
        impl.e = rippleDrawable;
        getImpl().k = dimensionPixelSize2;
        zlq impl2 = getImpl();
        if (impl2.h != dimension) {
            impl2.h = dimension;
            impl2.e(dimension, impl2.i, impl2.j);
        }
        zlq impl3 = getImpl();
        if (impl3.i != dimension2) {
            impl3.i = dimension2;
            impl3.e(impl3.h, dimension2, impl3.j);
        }
        zlq impl4 = getImpl();
        if (impl4.j != dimension3) {
            impl4.j = dimension3;
            impl4.e(impl4.h, impl4.i, dimension3);
        }
        getImpl().n = zt40VarA;
        getImpl().o = zt40VarA2;
        getImpl().f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private zlq getImpl() {
        zlq zlqVar = this.p;
        if (zlqVar != null) {
            return zlqVar;
        }
        zlq zlqVar2 = new zlq(this, new bwl(this));
        this.p = zlqVar2;
        return zlqVar2;
    }

    public final int c(int i) {
        int i2 = this.h;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? c(1) : c(0);
    }

    public final void d() {
        zlq impl = getImpl();
        FloatingActionButton floatingActionButton = impl.s;
        int visibility = floatingActionButton.getVisibility();
        byte b = impl.r;
        if (visibility == 0) {
            if (b == 1) {
                return;
            }
        } else if (b != 2) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton2 = impl.s;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(4, false);
            return;
        }
        zt40 zt40Var = impl.o;
        AnimatorSet animatorSetB = zt40Var != null ? impl.b(zt40Var, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, zlq.B, zlq.C);
        animatorSetB.addListener(new uuo(impl));
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final void e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.d;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(td3.c(colorForState, mode));
    }

    public final void f() {
        zlq impl = getImpl();
        FloatingActionButton floatingActionButton = impl.s;
        Matrix matrix = impl.x;
        FloatingActionButton floatingActionButton2 = impl.s;
        int visibility = floatingActionButton.getVisibility();
        byte b = impl.r;
        if (visibility != 0) {
            if (b == 2) {
                return;
            }
        } else if (b != 1) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z = impl.n == null;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z ? 0.4f : 0.0f);
            float f = z ? 0.4f : 0.0f;
            impl.p = f;
            impl.a(f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        zt40 zt40Var = impl.n;
        AnimatorSet animatorSetB = zt40Var != null ? impl.b(zt40Var, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, zlq.z, zlq.A);
        animatorSetB.addListener(new xh(impl, (byte) 7));
        animatorSetB.start();
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.c;
    }

    @Override // a.xke
    /* JADX INFO: renamed from: getBehavior */
    public yke mo39getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().s.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().e;
    }

    public int getCustomSize() {
        return this.h;
    }

    public int getExpandedComponentIdHint() {
        return this.o.f35015a;
    }

    public zt40 getHideMotionSpec() {
        return getImpl().o;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f;
    }

    public akj0 getShapeAppearanceModel() {
        akj0 akj0Var = getImpl().f44593a;
        akj0Var.getClass();
        return akj0Var;
    }

    public zt40 getShowMotionSpec() {
        return getImpl().n;
    }

    public int getSize() {
        return this.g;
    }

    public int getSizeDimension() {
        return c(this.g);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.e;
    }

    public boolean getUseCompatPadding() {
        return this.k;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zlq impl = getImpl();
        ylq ylqVar = impl.b;
        if (ylqVar != null) {
            k7x.V(impl.s, ylqVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().s.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.i = (sizeDimension - this.j) / 2;
        getImpl().h();
        int iMin = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.l;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f45367a);
        Bundle bundle = (Bundle) extendableSavedState.c.get("expandableWidgetHelper");
        bundle.getClass();
        u3u0 u3u0Var = this.o;
        u3u0Var.getClass();
        u3u0Var.b = bundle.getBoolean("expanded", false);
        u3u0Var.f35015a = bundle.getInt("expandedComponentIdHint", 0);
        if (u3u0Var.b) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) u3u0Var.c;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).f(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        u3u0 u3u0Var = this.o;
        u3u0Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", u3u0Var.b);
        bundle.putInt("expandedComponentIdHint", u3u0Var.f35015a);
        extendableSavedState.c.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.m;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i = rect.left;
            Rect rect2 = this.l;
            rect.left = i + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            zlq zlqVar = this.p;
            int i2 = -(zlqVar.f ? Math.max((zlqVar.k - zlqVar.s.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i2, i2);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.b != colorStateList) {
            this.b = colorStateList;
            zlq impl = getImpl();
            ylq ylqVar = impl.b;
            if (ylqVar != null) {
                ylqVar.setTintList(colorStateList);
            }
            ym8 ym8Var = impl.d;
            if (ym8Var != null) {
                if (colorStateList != null) {
                    ym8Var.m = colorStateList.getColorForState(ym8Var.getState(), ym8Var.m);
                }
                ym8Var.p = colorStateList;
                ym8Var.n = true;
                ym8Var.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.c != mode) {
            this.c = mode;
            ylq ylqVar = getImpl().b;
            if (ylqVar != null) {
                ylqVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        if (Build.VERSION.SDK_INT >= 26) {
            setTooltipText(isClickable() ? getContentDescription() : null);
        }
    }

    public void setCompatElevation(float f) {
        zlq impl = getImpl();
        if (impl.h != f) {
            impl.h = f;
            impl.e(f, impl.i, impl.j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        zlq impl = getImpl();
        if (impl.i != f) {
            impl.i = f;
            impl.e(impl.h, f, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        zlq impl = getImpl();
        if (impl.j != f) {
            impl.j = f;
            impl.e(impl.h, impl.i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        if (Build.VERSION.SDK_INT >= 26) {
            setTooltipText(isClickable() ? getContentDescription() : null);
        }
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            jf4.o("Custom size must be non-negative");
        } else if (i != this.h) {
            this.h = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ylq ylqVar = getImpl().b;
        if (ylqVar != null) {
            ylqVar.r(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f) {
            getImpl().f = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.o.f35015a = i;
    }

    public void setHideMotionSpec(zt40 zt40Var) {
        getImpl().o = zt40Var;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(zt40.b(i, getContext()));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            zlq impl = getImpl();
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.x;
            impl.a(f, matrix);
            impl.s.setImageMatrix(matrix);
            if (this.d != null) {
                e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.n.G(i);
        e();
    }

    public void setMaxImageSize(int i) {
        this.j = i;
        zlq impl = getImpl();
        if (impl.q != i) {
            impl.q = i;
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.x;
            impl.a(f, matrix);
            impl.s.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            zlq impl = getImpl();
            ColorStateList colorStateList2 = this.f;
            RippleDrawable rippleDrawable = impl.c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(ocg0.b(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(ocg0.b(colorStateList2));
            }
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z) {
        zlq impl = getImpl();
        impl.g = z;
        impl.h();
    }

    @Override // a.blj0
    public void setShapeAppearanceModel(akj0 akj0Var) {
        getImpl().g(akj0Var);
    }

    public void setShowMotionSpec(zt40 zt40Var) {
        getImpl().n = zt40Var;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(zt40.b(i, getContext()));
    }

    public void setSize(int i) {
        this.h = 0;
        if (i != this.g) {
            this.g = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().f();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.k != z) {
            this.k = z;
            getImpl().h();
        }
    }

    @Override // a.puu0, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends yke {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f45573a;
        public final boolean b;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rpd0.p);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // a.yke
        public final boolean e(Rect rect, View view) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.l;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // a.yke
        public final void g(ble bleVar) {
            if (bleVar.h == 0) {
                bleVar.h = 80;
            }
        }

        @Override // a.yke
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                x(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof ble ? ((ble) layoutParams).f2790a instanceof BottomSheetBehavior : false) {
                    y(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // a.yke
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List listK = coordinatorLayout.k(floatingActionButton);
            int size = listK.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) listK.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof ble ? ((ble) layoutParams).f2790a instanceof BottomSheetBehavior : false) && y(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (x(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(floatingActionButton, i);
            Rect rect = floatingActionButton.l;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                ble bleVar = (ble) floatingActionButton.getLayoutParams();
                int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) bleVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) bleVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) bleVar).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) bleVar).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    floatingActionButton.offsetTopAndBottom(i2);
                }
                if (i4 != 0) {
                    WeakHashMap weakHashMap2 = rgu0.f30456a;
                    floatingActionButton.offsetLeftAndRight(i4);
                }
            }
            return true;
        }

        public final boolean x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            ble bleVar = (ble) floatingActionButton.getLayoutParams();
            if (!this.b || bleVar.f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            Rect rect = this.f45573a;
            if (rect == null) {
                rect = new Rect();
                this.f45573a = rect;
            }
            ack.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        public final boolean y(View view, FloatingActionButton floatingActionButton) {
            ble bleVar = (ble) floatingActionButton.getLayoutParams();
            if (!this.b || bleVar.f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((ble) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        public BaseBehavior() {
            this.b = true;
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }
}
