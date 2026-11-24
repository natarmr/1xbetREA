package com.google.android.material.appbar;

import a.aqv;
import a.bbw0;
import a.ble;
import a.d7x;
import a.dwi0;
import a.epv0;
import a.g7x;
import a.hk50;
import a.igu0;
import a.jf4;
import a.k7x;
import a.ki30;
import a.mrv;
import a.n6x;
import a.n73;
import a.nuj0;
import a.plc;
import a.qrv;
import a.r7x;
import a.rgu0;
import a.rpd0;
import a.rq8;
import a.sb3;
import a.tb3;
import a.ub3;
import a.xiv0;
import a.xke;
import a.xr;
import a.yke;
import a.ziu0;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements xke {
    public static final /* synthetic */ int B = 0;
    public Behavior A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45555a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public xiv0 g;
    public ArrayList h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public ColorStateList m;
    public int n;
    public WeakReference o;
    public ValueAnimator p;
    public ValueAnimator.AnimatorUpdateListener q;
    public final ArrayList r;
    public final LinkedHashSet s;
    public final long t;
    public final TimeInterpolator u;
    public int[] v;
    public int w;
    public Drawable x;
    public Integer y;
    public final float z;

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(dwi0.V(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0;
        this.r = new ArrayList();
        this.s = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayL0 = mrv.l0(context3, attributeSet, rq8.p, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayL0.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayL0.getResourceId(0, 0)));
            }
            typedArrayL0.recycle();
            TypedArray typedArrayL1 = mrv.l0(context2, attributeSet, rpd0.f30882a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            this.m = g7x.A(6, context2, typedArrayL1);
            this.t = n6x.T(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.u = g7x.W(context2, R.attr.motionEasingStandardInterpolator, n73.f23021a);
            if (typedArrayL1.hasValue(4)) {
                g(typedArrayL1.getBoolean(4, false), false, false);
            }
            if (typedArrayL1.hasValue(3)) {
                rq8.T(this, typedArrayL1.getDimensionPixelSize(3, 0));
            }
            setBackground(typedArrayL1.getDrawable(0));
            if (Build.VERSION.SDK_INT >= 26) {
                if (typedArrayL1.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayL1.getBoolean(2, false));
                }
                if (typedArrayL1.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayL1.getBoolean(1, false));
                }
            }
            this.z = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.l = typedArrayL1.getBoolean(5, false);
            this.n = typedArrayL1.getResourceId(7, -1);
            setStatusBarForeground(typedArrayL1.getDrawable(8));
            typedArrayL1.recycle();
            bbw0 bbw0Var = new bbw0((Object) this, (byte) 5);
            WeakHashMap weakHashMap = rgu0.f30456a;
            igu0.c(this, bbw0Var);
        } catch (Throwable th) {
            typedArrayL0.recycle();
            throw th;
        }
    }

    public static tb3 c(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            tb3 tb3Var = new tb3((LinearLayout.LayoutParams) layoutParams);
            tb3Var.f33642a = 1;
            return tb3Var;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            tb3 tb3Var2 = new tb3((ViewGroup.MarginLayoutParams) layoutParams);
            tb3Var2.f33642a = 1;
            return tb3Var2;
        }
        tb3 tb3Var3 = new tb3(layoutParams);
        tb3Var3.f33642a = 1;
        return tb3Var3;
    }

    public final void a(ub3 ub3Var) {
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.h = arrayList;
        }
        if (ub3Var == null || arrayList.contains(ub3Var)) {
            return;
        }
        this.h.add(ub3Var);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final tb3 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        tb3 tb3Var = new tb3(context, attributeSet);
        tb3Var.f33642a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rpd0.b);
        tb3Var.f33642a = typedArrayObtainStyledAttributes.getInt(1, 0);
        tb3Var.b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new xr((byte) 8);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            tb3Var.c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return tb3Var;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof tb3;
    }

    public final void d() {
        Behavior behavior = this.A;
        BaseBehavior.SavedState savedStateK = (behavior == null || this.b == -1 || this.f != 0) ? null : behavior.K(AbsSavedState.b, this);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        if (savedStateK != null) {
            Behavior behavior2 = this.A;
            if (behavior2.m != null) {
                return;
            }
            behavior2.m = savedStateK;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.x == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f45555a);
        this.x.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.x;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(int i) {
        this.f45555a = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ub3 ub3Var = (ub3) this.h.get(i2);
                if (ub3Var != null) {
                    ub3Var.a(this, i);
                }
            }
        }
    }

    public final void f(ub3 ub3Var) {
        ArrayList arrayList = this.h;
        if (arrayList == null || ub3Var == null) {
            return;
        }
        arrayList.remove(ub3Var);
    }

    public final void g(boolean z, boolean z2, boolean z3) {
        this.f = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        tb3 tb3Var = new tb3(-1, -2);
        tb3Var.f33642a = 1;
        return tb3Var;
    }

    @Override // a.xke
    /* JADX INFO: renamed from: getBehavior */
    public yke mo39getBehavior() {
        Behavior behavior = new Behavior();
        this.A = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                tb3 tb3Var = (tb3) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = tb3Var.f33642a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) tb3Var).topMargin + ((LinearLayout.LayoutParams) tb3Var).bottomMargin;
                    if ((i3 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i3 & 2) != 0) {
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i4 + measuredHeight;
                        }
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i2 += iMin;
                    }
                    iMin = minimumHeight + i4;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                tb3 tb3Var = (tb3) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) tb3Var).topMargin + ((LinearLayout.LayoutParams) tb3Var).bottomMargin + childAt.getMeasuredHeight();
                int i3 = tb3Var.f33642a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.n;
    }

    public ki30 getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof ki30) {
            return (ki30) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i = (minimumHeight * 2) + topInset;
            return i < getHeight() ? i : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i2 = (minimumHeight2 * 2) + topInset;
        return i2 < getHeight() ? i2 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.f;
    }

    public Drawable getStatusBarForeground() {
        return this.x;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        xiv0 xiv0Var = this.g;
        if (xiv0Var != null) {
            return xiv0Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                tb3 tb3Var = (tb3) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = tb3Var.f33642a;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) tb3Var).topMargin + ((LinearLayout.LayoutParams) tb3Var).bottomMargin + minimumHeight;
                if (i2 == 0 && childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final boolean h(boolean z) {
        if (this.i || this.k == z) {
            return false;
        }
        this.k = z;
        refreshDrawableState();
        if (!(getBackground() instanceof ki30)) {
            return true;
        }
        if (this.m != null) {
            j(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.l) {
            return true;
        }
        float f = this.z;
        j(z ? 0.0f : f, z ? f : 0.0f);
        return true;
    }

    public final boolean i(View view) {
        int i;
        if (this.o == null && (i = this.n) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.n);
            }
            if (viewFindViewById != null) {
                this.o = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.o;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final void j(float f, float f2) {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.t);
        this.p.setInterpolator(this.u);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.q;
        if (animatorUpdateListener != null) {
            this.p.addUpdateListener(animatorUpdateListener);
        }
        this.p.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof ki30) {
            k7x.V(this, (ki30) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArr = this.v;
        if (iArr == null) {
            iArr = new int[4];
            this.v = iArr;
        }
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.j;
        int i2 = R.attr.state_liftable;
        if (!z) {
            i2 = -R.attr.state_liftable;
        }
        iArr[0] = i2;
        int i3 = R.attr.state_lifted;
        if (!z || !this.k) {
            i3 = -R.attr.state_lifted;
        }
        iArr[1] = i3;
        int i4 = R.attr.state_collapsible;
        if (!z) {
            i4 = -R.attr.state_collapsible;
        }
        iArr[2] = i4;
        int i5 = R.attr.state_collapsed;
        if (!z || !this.k) {
            i5 = -R.attr.state_collapsed;
        }
        iArr[3] = i5;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        d();
        this.e = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((tb3) getChildAt(i5).getLayoutParams()).c != null) {
                this.e = true;
                break;
            }
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.i) {
            return;
        }
        if (!this.l) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((tb3) getChildAt(i6).getLayoutParams()).f33642a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.j != z2) {
            this.j = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = r7x.u(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        d();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final ki30 ki30Var;
        ColorStateList colorStateList;
        Context context = getContext();
        if (drawable instanceof ki30) {
            ki30Var = (ki30) drawable;
        } else {
            ColorStateList colorStateListF = plc.F(drawable);
            if (colorStateListF == null) {
                ki30Var = null;
            } else {
                ki30 ki30Var2 = new ki30();
                ki30Var2.s(colorStateListF);
                ki30Var = ki30Var2;
            }
        }
        if (ki30Var != null && (colorStateList = ki30Var.b.c) != null) {
            this.w = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.m;
            if (colorStateList2 != null) {
                final Integer numY = d7x.y(R.attr.colorSurface, getContext());
                this.q = new ValueAnimator.AnimatorUpdateListener() { // from class: a.rb3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        int i = AppBarLayout.B;
                        AppBarLayout appBarLayout = this.f30164a;
                        LinkedHashSet linkedHashSet = appBarLayout.s;
                        ArrayList arrayList = appBarLayout.r;
                        int iF = d7x.F(appBarLayout.w, ((Float) valueAnimator.getAnimatedValue()).floatValue(), colorStateList2.getDefaultColor());
                        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iF);
                        ki30 ki30Var3 = ki30Var;
                        ki30Var3.s(colorStateListValueOf);
                        if (appBarLayout.x != null && (num = appBarLayout.y) != null && num.equals(numY)) {
                            appBarLayout.x.setTint(iF);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (it.next() != null) {
                                    hny.b();
                                    return;
                                } else if (ki30Var3.b.c != null) {
                                    throw null;
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw rw2.h(it2);
                        }
                    }
                };
            } else {
                ki30Var.o(context);
                this.q = new sb3(this, ki30Var, (byte) 0);
            }
            drawable = ki30Var;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof ki30) {
            ((ki30) background).r(f);
        }
    }

    public void setExpanded(boolean z) {
        g(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.l = z;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.n = -1;
        if (view != null) {
            this.o = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.n = i;
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.i = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            jf4.o("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setPendingAction(int i) {
        this.f = i;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.x;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.x = drawableMutate;
            if (drawableMutate instanceof ki30) {
                numValueOf = Integer.valueOf(((ki30) drawableMutate).v);
            } else {
                ColorStateList colorStateListF = plc.F(drawableMutate);
                if (colorStateListF != null) {
                    numValueOf = Integer.valueOf(colorStateListF.getDefaultColor());
                }
            }
            this.y = numValueOf;
            Drawable drawable3 = this.x;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.x.setState(getDrawableState());
                }
                this.x.setLayoutDirection(getLayoutDirection());
                this.x.setVisible(getVisibility() == 0, false);
                this.x.setCallback(this);
            }
            if (this.x != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(epv0.U(i, getContext()));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        rq8.T(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.x;
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends aqv {
        public int j;
        public int k;
        public ValueAnimator l;
        public SavedState m;
        public WeakReference n;
        public e o;

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new d();
            public boolean c;
            public boolean d;
            public int e;
            public float f;
            public boolean g;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.c = parcel.readByte() != 0;
                this.d = parcel.readByte() != 0;
                this.e = parcel.readInt();
                this.f = parcel.readFloat();
                this.g = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.e);
                parcel.writeFloat(this.f);
                parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f = -1;
            this.h = -1;
        }

        public static View G(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof hk50) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x005b  */
        public static void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View childAt;
            boolean zI;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((tb3) childAt.getLayoutParams()).f33642a;
                if ((i4 & 1) != 0) {
                    int minimumHeight = childAt.getMinimumHeight();
                    zI = true;
                    if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zI = false;
                    }
                } else {
                    zI = false;
                }
            } else {
                zI = false;
            }
            if (appBarLayout.l) {
                zI = appBarLayout.i(G(coordinatorLayout));
            }
            boolean zH = appBarLayout.h(zI);
            if (!z) {
                if (zH) {
                    ArrayList arrayList = (ArrayList) ((nuj0) coordinatorLayout.b.b).get(appBarLayout);
                    List arrayList2 = arrayList != null ? new ArrayList(arrayList) : null;
                    if (arrayList2 == null) {
                        arrayList2 = Collections.EMPTY_LIST;
                    }
                    int size = arrayList2.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        yke ykeVar = ((ble) ((View) arrayList2.get(i5)).getLayoutParams()).f2790a;
                        if (ykeVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) ykeVar).f == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        @Override // a.aqv
        public final int A() {
            return x() + this.j;
        }

        public final void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(A() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iA = A();
            ValueAnimator valueAnimator = this.l;
            if (iA == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.l.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.l = valueAnimator2;
                valueAnimator2.setInterpolator(n73.e);
                this.l.addUpdateListener(new a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator.cancel();
            }
            this.l.setDuration(Math.min(iRound, Response.BUSY_EVERYWHERE));
            this.l.setIntValues(iA, i);
            this.l.start();
        }

        @Override // a.aqv
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public boolean z(AppBarLayout appBarLayout) {
            e eVar = this.o;
            if (eVar != null) {
                return eVar.a(appBarLayout);
            }
            WeakReference weakReference = this.n;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        @Override // a.aqv
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            M(coordinatorLayout, appBarLayout);
            if (appBarLayout.l) {
                appBarLayout.h(appBarLayout.i(G(coordinatorLayout)));
            }
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        public final void I(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i2;
            int downNestedPreScrollRange;
            if (i == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i3 = i2;
                int i4 = downNestedPreScrollRange;
                if (i3 != i4) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = C(coordinatorLayout, appBarLayout2, A() - i, i3, i4);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.l) {
                appBarLayout2.h(appBarLayout2.i(view));
            }
        }

        @Override // a.yke
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (appBarLayout.l || appBarLayout.k || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.l) != null) {
                valueAnimator.cancel();
            }
            this.n = null;
            this.k = i2;
            return z;
        }

        public final SavedState K(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iX = x();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iX;
                if (childAt.getTop() + iX <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = iX == 0;
                    savedState.d = z;
                    savedState.c = !z && (-iX) >= appBarLayout.getTotalScrollRange();
                    savedState.e = i;
                    savedState.g = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    savedState.f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        @Override // a.aqv
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public int C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            int top;
            boolean zB;
            int topInset;
            int iA = A();
            int i4 = 0;
            if (i2 == 0 || iA < i2 || iA > i3) {
                this.j = 0;
            } else {
                int iU = r7x.u(i, i2, i3);
                if (iA != iU) {
                    if (!appBarLayout.e) {
                        top = iU;
                        break;
                    }
                    int iAbs = Math.abs(iU);
                    int childCount = appBarLayout.getChildCount();
                    int i5 = 0;
                    while (true) {
                        if (i5 < childCount) {
                            View childAt = appBarLayout.getChildAt(i5);
                            tb3 tb3Var = (tb3) childAt.getLayoutParams();
                            Interpolator interpolator = tb3Var.c;
                            if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i6 = tb3Var.f33642a;
                                    if ((i6 & 1) != 0) {
                                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) tb3Var).topMargin + ((LinearLayout.LayoutParams) tb3Var).bottomMargin;
                                        if ((i6 & 2) != 0) {
                                            topInset -= childAt.getMinimumHeight();
                                        }
                                    } else {
                                        topInset = 0;
                                    }
                                    if (childAt.getFitsSystemWindows()) {
                                        topInset -= appBarLayout.getTopInset();
                                    }
                                    if (topInset > 0) {
                                        float f = topInset;
                                        top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iU);
                                        break;
                                    }
                                }
                            } else {
                                i5++;
                            }
                        }
                        top = iU;
                        break;
                    }
                    ziu0 ziu0Var = this.f42714a;
                    if (ziu0Var != null) {
                        zB = ziu0Var.b(top);
                    } else {
                        this.b = top;
                        zB = false;
                    }
                    int i7 = iA - iU;
                    this.j = iU - top;
                    int i8 = 1;
                    if (zB) {
                        int i9 = 0;
                        while (i9 < appBarLayout.getChildCount()) {
                            tb3 tb3Var2 = (tb3) appBarLayout.getChildAt(i9).getLayoutParams();
                            xr xrVar = tb3Var2.b;
                            if (xrVar != null && (tb3Var2.f33642a & i8) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i9);
                                float fX = x();
                                Rect rect = (Rect) xrVar.b;
                                Rect rect2 = (Rect) xrVar.f41344a;
                                childAt2.getDrawingRect(rect2);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                rect2.offset(0, -appBarLayout.getTopInset());
                                float fAbs = rect2.top - Math.abs(fX);
                                if (fAbs <= 0.0f) {
                                    float fT = 1.0f - r7x.t(Math.abs(fAbs / rect2.height()), 0.0f, 1.0f);
                                    float fHeight = (-fAbs) - ((rect2.height() * 0.3f) * (1.0f - (fT * fT)));
                                    childAt2.setTranslationY(fHeight);
                                    childAt2.getDrawingRect(rect);
                                    rect.offset(0, (int) (-fHeight));
                                    if (fHeight >= rect.height()) {
                                        childAt2.setAlpha(0.0f);
                                    } else {
                                        childAt2.setAlpha(1.0f);
                                    }
                                    childAt2.setClipBounds(rect);
                                } else {
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(0.0f);
                                    childAt2.setAlpha(1.0f);
                                }
                            }
                            i9++;
                            i8 = 1;
                        }
                    }
                    if (!zB && appBarLayout.e) {
                        coordinatorLayout.f(appBarLayout);
                    }
                    appBarLayout.e(x());
                    N(coordinatorLayout, appBarLayout, iU, iU < iA ? -1 : 1, false);
                    i4 = i7;
                }
            }
            if (rgu0.e(coordinatorLayout) != null) {
                return i4;
            }
            rgu0.o(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return i4;
        }

        public final void M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iA = A() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                tb3 tb3Var = (tb3) childAt.getLayoutParams();
                if ((tb3Var.f33642a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) tb3Var).topMargin;
                    bottom += ((LinearLayout.LayoutParams) tb3Var).bottomMargin;
                }
                int i2 = -iA;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                tb3 tb3Var2 = (tb3) childAt2.getLayoutParams();
                int i3 = tb3Var2.f33642a;
                if ((i3 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if ((i3 & 2) == 2) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iA < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) tb3Var2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) tb3Var2).bottomMargin;
                    }
                    if (iA < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    E(coordinatorLayout, appBarLayout, r7x.u(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // a.yiu0, a.yke
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.m;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            E(coordinatorLayout, appBarLayout, i2);
                        } else {
                            D(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            E(coordinatorLayout, appBarLayout, 0);
                        } else {
                            D(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.c) {
                D(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.d) {
                D(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.e);
                int i3 = -childAt.getBottom();
                if (this.m.g) {
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.m.f) + i3;
                }
                D(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f = 0;
            this.m = null;
            int iU = r7x.u(x(), -appBarLayout.getTotalScrollRange(), 0);
            ziu0 ziu0Var = this.f42714a;
            if (ziu0Var != null) {
                ziu0Var.b(iU);
            } else {
                this.b = iU;
            }
            N(coordinatorLayout, appBarLayout, x(), 0, true);
            appBarLayout.e(x());
            if (rgu0.e(coordinatorLayout) != null) {
                return true;
            }
            rgu0.o(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // a.yke
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((ble) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.s(i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), appBarLayout);
            return true;
        }

        @Override // a.yke
        public final /* bridge */ /* synthetic */ void p(int i, int i2, int i3, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
            I(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // a.yke
        public final void q(int i, int i2, int i3, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
            BaseBehavior<T> baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = baseBehavior.C(coordinatorLayout2, appBarLayout, A() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i3 == 0 && rgu0.e(coordinatorLayout2) == null) {
                rgu0.o(coordinatorLayout2, new b(coordinatorLayout2, baseBehavior, appBarLayout));
            }
        }

        @Override // a.yke
        public final void s(View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                this.m = (SavedState) parcelable;
            } else {
                this.m = null;
            }
        }

        @Override // a.yke
        public final Parcelable t(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState savedStateK = K(absSavedState, (AppBarLayout) view);
            return savedStateK == null ? absSavedState : savedStateK;
        }

        @Override // a.yke
        public final void v(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i == 1) {
                M(coordinatorLayout, appBarLayout);
                if (appBarLayout.l) {
                    appBarLayout.h(appBarLayout.i(view2));
                }
            }
            this.n = new WeakReference(view2);
        }

        public BaseBehavior() {
            this.f = -1;
            this.h = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        tb3 tb3Var = new tb3(-1, -2);
        tb3Var.f33642a = 1;
        return tb3Var;
    }

    public static class ScrollingViewBehavior extends qrv {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rpd0.N);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public static AppBarLayout A(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // a.yke
        public final boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // a.yke
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            yke ykeVar = ((ble) view2.getLayoutParams()).f2790a;
            if (ykeVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) ykeVar).j) + this.e) - z(view2);
                WeakHashMap weakHashMap = rgu0.f30456a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.l) {
                return false;
            }
            appBarLayout.h(appBarLayout.i(view));
            return false;
        }

        @Override // a.yke
        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                rgu0.o(coordinatorLayout, null);
            }
        }

        @Override // a.yke
        public final boolean r(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutA = A(coordinatorLayout.k(view));
            if (appBarLayoutA != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayoutA.g(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior() {
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }
}
