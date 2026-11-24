package com.google.android.material.sidesheet;

import a.akj0;
import a.axq;
import a.ble;
import a.d7;
import a.daf;
import a.f0p;
import a.g7x;
import a.hny;
import a.htf0;
import a.jf4;
import a.ki30;
import a.li30;
import a.mi30;
import a.n73;
import a.no8;
import a.pb5;
import a.ph30;
import a.piz;
import a.q0;
import a.qo8;
import a.rgu0;
import a.rpd0;
import a.rw2;
import a.ua80;
import a.w7;
import a.xh;
import a.ygu0;
import a.yke;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends yke implements ph30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public piz f45578a;
    public final ki30 b;
    public final ColorStateList c;
    public final akj0 d;
    public final qo8 e;
    public final float f;
    public final boolean g;
    public int h;
    public ygu0 i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public mi30 t;
    public int u;
    public final LinkedHashSet v;
    public final no8 w;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new qo8(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new no8(this, (byte) 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rpd0.Q);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.c = g7x.A(3, context, typedArrayObtainStyledAttributes);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.d = akj0.h(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).c();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        akj0 akj0Var = this.d;
        if (akj0Var != null) {
            ki30 ki30Var = new ki30(akj0Var);
            this.b = ki30Var;
            ki30Var.o(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.s(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1.n(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        y(2);
        r2.e.d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L17
            r0 = 5
            if (r4 != r0) goto Ld
            a.piz r0 = r2.f45578a
            int r0 = r0.D()
            goto L1d
        Ld:
            java.lang.String r2 = "Invalid state to get outer edge offset: "
            java.lang.String r2 = a.twn.m(r4, r2)
            a.jf4.o(r2)
            return
        L17:
            a.piz r0 = r2.f45578a
            int r0 = r0.C()
        L1d:
            a.ygu0 r1 = r2.i
            if (r1 == 0) goto L55
            if (r5 == 0) goto L2e
            int r3 = r3.getTop()
            boolean r3 = r1.n(r0, r3)
            if (r3 == 0) goto L55
            goto L4b
        L2e:
            int r5 = r3.getTop()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L49
            byte r5 = r1.f42603a
            if (r5 != 0) goto L49
            android.view.View r5 = r1.r
            if (r5 == 0) goto L49
            r5 = 0
            r1.r = r5
        L49:
            if (r3 == 0) goto L55
        L4b:
            r3 = 2
            r2.y(r3)
            a.qo8 r2 = r2.e
            r2.d(r4)
            return
        L55:
            r2.y(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.A(android.view.View, int, boolean):void");
    }

    public final void B() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        rgu0.l(view, 262144);
        rgu0.i(view, 0);
        rgu0.l(view, 1048576);
        rgu0.i(view, 0);
        final int i = 5;
        if (this.h != 5) {
            rgu0.m(view, d7.k, new w7() { // from class: a.ptj0
                @Override // a.w7
                public final boolean e(View view2) {
                    this.f27568a.x(i);
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.h != 3) {
            rgu0.m(view, d7.j, new w7() { // from class: a.ptj0
                @Override // a.w7
                public final boolean e(View view2) {
                    this.f27568a.x(i2);
                    return true;
                }
            });
        }
    }

    @Override // a.ph30
    public final void a(pb5 pb5Var) {
        mi30 mi30Var = this.t;
        if (mi30Var == null) {
            return;
        }
        mi30Var.f = pb5Var;
    }

    @Override // a.ph30
    public final void b(pb5 pb5Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        mi30 mi30Var = this.t;
        if (mi30Var == null) {
            return;
        }
        piz pizVar = this.f45578a;
        int i = (pizVar == null || pizVar.G() == 0) ? 5 : 3;
        if (mi30Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        pb5 pb5Var2 = mi30Var.f;
        mi30Var.f = pb5Var;
        if (pb5Var2 != null) {
            mi30Var.a(pb5Var.c, i, pb5Var.d == 0);
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.p.get();
        WeakReference weakReference2 = this.q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.f45578a.Y(marginLayoutParams, (int) ((view.getScaleX() * this.l) + this.o));
        view2.requestLayout();
    }

    @Override // a.ph30
    public final void c() {
        mi30 mi30Var = this.t;
        if (mi30Var == null) {
            return;
        }
        View view = mi30Var.b;
        if (mi30Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        pb5 pb5Var = mi30Var.f;
        mi30Var.f = null;
        if (pb5Var == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(mi30Var.e);
        animatorSet.start();
    }

    @Override // a.ph30
    public final void d() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final int i2;
        mi30 mi30Var = this.t;
        if (mi30Var == null) {
            return;
        }
        pb5 pb5Var = mi30Var.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        mi30Var.f = null;
        int i3 = 5;
        if (pb5Var == null || Build.VERSION.SDK_INT < 34) {
            x(5);
            return;
        }
        piz pizVar = this.f45578a;
        if (pizVar != null && pizVar.G() != 0) {
            i3 = 3;
        }
        xh xhVar = new xh(this, (byte) 11);
        WeakReference weakReference = this.q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            switch (this.f45578a.f27062a) {
                case 0:
                    i2 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i2 = marginLayoutParams.rightMargin;
                    break;
            }
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: a.qtj0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f29302a.f45578a.Y(marginLayoutParams, n73.c(i2, valueAnimator.getAnimatedFraction(), 0));
                    view.requestLayout();
                }
            };
        }
        View view2 = mi30Var.b;
        boolean z = pb5Var.d == 0;
        boolean z2 = (Gravity.getAbsoluteGravity(i3, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z2 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z2) {
            f = -f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new f0p((byte) 1));
        objectAnimatorOfFloat.setDuration(n73.c(mi30Var.c, pb5Var.c, mi30Var.d));
        objectAnimatorOfFloat.addListener(new li30(mi30Var, z, i3));
        objectAnimatorOfFloat.addListener(xhVar);
        objectAnimatorOfFloat.start();
    }

    @Override // a.yke
    public final void g(ble bleVar) {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // a.yke
    public final void j() {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // a.yke
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ygu0 ygu0Var;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && rgu0.f(view) == null) || !this.g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        VelocityTracker velocityTrackerObtain = this.s;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.s = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (ygu0Var = this.i) == null || !ygu0Var.o(motionEvent)) ? false : true;
    }

    @Override // a.yke
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int left;
        int i2;
        int iF;
        int i3;
        View viewFindViewById;
        byte b = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.p;
        ki30 ki30Var = this.b;
        byte b2 = 0;
        if (weakReference == null) {
            this.p = new WeakReference(view);
            this.t = new mi30(view);
            if (ki30Var != null) {
                view.setBackground(ki30Var);
                float elevation = this.f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                ki30Var.r(elevation);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i4 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            B();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (rgu0.f(view) == null) {
                rgu0.p(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((ble) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        piz pizVar = this.f45578a;
        if (pizVar == null || pizVar.G() != i5) {
            ble bleVar = null;
            akj0 akj0Var = this.d;
            if (i5 == 0) {
                this.f45578a = new piz(this, b);
                if (akj0Var != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof ble)) {
                        bleVar = (ble) view3.getLayoutParams();
                    }
                    if (bleVar == null || ((ViewGroup.MarginLayoutParams) bleVar).rightMargin <= 0) {
                        daf dafVarL = akj0Var.l();
                        dafVarL.g = new q0(0.0f);
                        dafVarL.U(0.0f);
                        akj0 akj0VarC = dafVarL.c();
                        if (ki30Var != null) {
                            ki30Var.setShapeAppearanceModel(akj0VarC);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    jf4.o(ua80.e(i5, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                    return false;
                }
                this.f45578a = new piz(this, b2);
                if (akj0Var != null) {
                    WeakReference weakReference3 = this.p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof ble)) {
                        bleVar = (ble) view2.getLayoutParams();
                    }
                    if (bleVar == null || ((ViewGroup.MarginLayoutParams) bleVar).leftMargin <= 0) {
                        daf dafVarL2 = akj0Var.l();
                        dafVarL2.f = new q0(0.0f);
                        dafVarL2.T(0.0f);
                        akj0 akj0VarC2 = dafVarL2.c();
                        if (ki30Var != null) {
                            ki30Var.setShapeAppearanceModel(akj0VarC2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new ygu0(coordinatorLayout.getContext(), coordinatorLayout, this.w);
        }
        int iF2 = this.f45578a.F(view);
        coordinatorLayout.r(view, i);
        this.m = coordinatorLayout.getWidth();
        switch (this.f45578a.f27062a) {
            case 0:
                left = coordinatorLayout.getLeft();
                break;
            default:
                left = coordinatorLayout.getRight();
                break;
        }
        this.n = left;
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            switch (this.f45578a.f27062a) {
                case 0:
                    i2 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i2 = marginLayoutParams.rightMargin;
                    break;
            }
        } else {
            i2 = 0;
        }
        this.o = i2;
        int i6 = this.h;
        if (i6 == 1 || i6 == 2) {
            iF = iF2 - this.f45578a.F(view);
        } else if (i6 == 3) {
            iF = 0;
        } else {
            if (i6 != 5) {
                hny.s(this.h, "Unexpected value: ");
                return false;
            }
            iF = this.f45578a.D();
        }
        WeakHashMap weakHashMap2 = rgu0.f30456a;
        view.offsetLeftAndRight(iF);
        if (this.q == null && (i3 = this.r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                hny.b();
                return false;
            }
        }
        return true;
    }

    @Override // a.yke
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // a.yke
    public final void s(View view, Parcelable parcelable) {
        int i = ((SavedState) parcelable).c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // a.yke
    public final Parcelable t(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // a.yke
    public final boolean w(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (z()) {
            this.i.i(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        VelocityTracker velocityTrackerObtain = this.s;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.s = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (z() && actionMasked == 2 && !this.j && z()) {
            float fAbs = Math.abs(this.u - motionEvent.getX());
            ygu0 ygu0Var = this.i;
            if (fAbs > ygu0Var.b) {
                ygu0Var.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void x(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(axq.n(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            y(i);
            return;
        }
        View view = (View) this.p.get();
        htf0 htf0Var = new htf0(this, i, (byte) 1);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(htf0Var);
        } else {
            htf0Var.run();
        }
    }

    public final void y(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.v.iterator();
        if (it.hasNext()) {
            throw rw2.h(it);
        }
        B();
    }

    public final boolean z() {
        if (this.i != null) {
            return this.g || this.h == 1;
        }
        return false;
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
        }

        public SavedState(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.c = sideSheetBehavior.h;
        }
    }

    public SideSheetBehavior() {
        this.e = new qo8(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new no8(this, (byte) 1);
    }
}
