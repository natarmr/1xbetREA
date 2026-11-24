package com.google.android.material.bottomsheet;

import a.afm0;
import a.akj0;
import a.amu0;
import a.axq;
import a.ble;
import a.d7;
import a.div0;
import a.f0p;
import a.g7x;
import a.igu0;
import a.j6;
import a.jf4;
import a.jgu0;
import a.ki30;
import a.le3;
import a.mo8;
import a.n73;
import a.no8;
import a.o6;
import a.oo8;
import a.p6;
import a.pb5;
import a.ph30;
import a.po8;
import a.qfx;
import a.qo8;
import a.rgu0;
import a.rpd0;
import a.s88;
import a.th30;
import a.twn;
import a.xh;
import a.xiv0;
import a.ygu0;
import a.yke;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends yke implements ph30 {
    public boolean A;
    public final qo8 B;
    public final ValueAnimator C;
    public final int D;
    public int E;
    public int F;
    public final float G;
    public int H;
    public final float I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final boolean M;
    public boolean N;
    public final boolean O;
    public int P;
    public ygu0 Q;
    public boolean R;
    public int S;
    public boolean T;
    public float U;
    public int V;
    public int W;
    public int X;
    public WeakReference Y;
    public final ArrayList Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45562a;
    public final ArrayList a0;
    public boolean b;
    public VelocityTracker b0;
    public final float c;
    public th30 c0;
    public final int d;
    public int d0;
    public final boolean e;
    public int e0;
    public int f;
    public WeakReference f0;
    public boolean g;
    public boolean g0;
    public int h;
    public HashMap h0;
    public final int i;
    public final SparseIntArray i0;
    public final ki30 j;
    public final SparseIntArray j0;
    public final ColorStateList k;
    public final SparseIntArray k0;
    public int l;
    public final Rect l0;
    public final int m;
    public final no8 m0;
    public int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public int w;
    public int x;
    public final boolean y;
    public final akj0 z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        byte b = 0;
        this.f45562a = 0;
        this.b = true;
        this.l = -1;
        this.m = -1;
        this.B = new qo8(this);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = true;
        this.P = 4;
        this.U = 0.1f;
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.e0 = -1;
        this.i0 = new SparseIntArray();
        this.j0 = new SparseIntArray();
        this.k0 = new SparseIntArray();
        this.l0 = new Rect();
        this.m0 = new no8(this, b);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rpd0.e);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.k = g7x.A(3, context, typedArrayObtainStyledAttributes);
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.z = akj0.h(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).c();
        }
        akj0 akj0Var = this.z;
        if (akj0Var != null) {
            ki30 ki30Var = new ki30(akj0Var);
            this.j = ki30Var;
            ki30Var.o(context);
            ColorStateList colorStateList = this.k;
            if (colorStateList != null) {
                this.j.s(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.j.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(A(), 1.0f);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.C.addUpdateListener(new mo8(this, b));
        this.I = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            M(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            M(i);
        }
        L(typedArrayObtainStyledAttributes.getBoolean(10, false));
        this.o = typedArrayObtainStyledAttributes.getBoolean(16, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (this.b != z) {
            this.b = z;
            if (this.Y != null) {
                z();
            }
            O((this.b && this.P == 6) ? 3 : this.P);
            S(this.P, true);
            R();
        }
        this.K = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.L = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.M = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f45562a = typedArrayObtainStyledAttributes.getInt(13, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            jf4.o("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.G = f;
        if (this.Y != null) {
            this.F = (int) ((1.0f - f) * this.X);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
            if (dimensionPixelOffset < 0) {
                jf4.o("offset must be greater than or equal to 0");
                throw null;
            }
            this.D = dimensionPixelOffset;
            S(this.P, true);
        } else {
            int i2 = typedValuePeekValue2.data;
            if (i2 < 0) {
                jf4.o("offset must be greater than or equal to 0");
                throw null;
            }
            this.D = i2;
            S(this.P, true);
        }
        this.d = typedArrayObtainStyledAttributes.getInt(14, 500);
        this.e = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.O = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.p = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.q = typedArrayObtainStyledAttributes.getBoolean(21, false);
        this.r = typedArrayObtainStyledAttributes.getBoolean(22, false);
        this.s = typedArrayObtainStyledAttributes.getBoolean(23, true);
        this.t = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.u = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.v = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.y = typedArrayObtainStyledAttributes.getBoolean(26, true);
        typedArrayObtainStyledAttributes.recycle();
        this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View D(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewD = D(viewGroup.getChildAt(i));
            if (viewD != null) {
                return viewD;
            }
        }
        return null;
    }

    public static BottomSheetBehavior E(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ble)) {
            jf4.o("The view is not a child of CoordinatorLayout");
            return null;
        }
        yke ykeVar = ((ble) layoutParams).f2790a;
        if (ykeVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) ykeVar;
        }
        jf4.o("The view is not associated with BottomSheetBehavior");
        return null;
    }

    public static int F(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    public final float A() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        ki30 ki30Var = this.j;
        if (ki30Var != null && (weakReference = this.Y) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.Y.get();
            if (I() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float fL = ki30Var.l();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fL <= 0.0f) {
                        f = 0.0f;
                    } else {
                        f = radius / fL;
                    }
                } else {
                    f = 0.0f;
                }
                float[] fArr = ki30Var.Y;
                float fA = fArr != null ? fArr[0] : ki30Var.b.f14810a.d().f.a(ki30Var.h());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA > 0.0f) {
                        f2 = radius2 / fA;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    public final int B() {
        int iMin;
        int i;
        int i2;
        if (this.g) {
            iMin = Math.min(Math.max(this.h, this.X - ((this.W * 9) / 16)), this.V);
            i = this.w;
        } else {
            if (!this.o && !this.p && (i2 = this.n) > 0) {
                return Math.max(this.f, i2 + this.i);
            }
            iMin = this.f;
            i = this.w;
        }
        return iMin + i;
    }

    public final void C(int i) {
        float f;
        float fG;
        View view = (View) this.Y.get();
        if (view != null) {
            ArrayList arrayList = this.a0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.H;
            if (i > i2 || i2 == G()) {
                int i3 = this.H;
                f = i3 - i;
                fG = this.X - i3;
            } else {
                int i4 = this.H;
                f = i4 - i;
                fG = i4 - G();
            }
            float f2 = f / fG;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((po8) arrayList.get(i5)).b(view, f2);
            }
        }
    }

    public final int G() {
        if (this.b) {
            return this.E;
        }
        return Math.max(this.D, this.s ? 0 : this.x);
    }

    public final int H(int i) {
        if (i == 3) {
            return G();
        }
        if (i == 4) {
            return this.H;
        }
        if (i == 5) {
            return this.X;
        }
        if (i == 6) {
            return this.F;
        }
        jf4.o(twn.m(i, "Invalid state to get top offset: "));
        return 0;
    }

    public final boolean I() {
        WeakReference weakReference = this.Y;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.Y.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean J(View view) {
        Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == view) {
                return true;
            }
        }
        return false;
    }

    public final void K(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.Z.add(new WeakReference(view));
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                K(viewGroup.getChildAt(i));
            }
        }
    }

    public final void L(boolean z) {
        if (this.J != z) {
            this.J = z;
            if (!z && this.P == 5) {
                N(4);
            }
            R();
        }
    }

    public final void M(int i) {
        boolean z = this.g;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.g = true;
            }
        } else {
            if (!z && this.f == i) {
                return;
            }
            this.g = false;
            this.f = Math.max(0, i);
        }
        U();
    }

    public final void N(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(axq.n(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.J && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.b && H(i) <= this.E) ? 3 : i;
        WeakReference weakReference = this.Y;
        if (weakReference == null || weakReference.get() == null) {
            O(i);
            return;
        }
        View view = (View) this.Y.get();
        le3 le3Var = new le3(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(le3Var);
        } else {
            le3Var.run();
        }
    }

    public final void O(int i) {
        View view;
        if (this.P == i) {
            return;
        }
        this.P = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.J;
        }
        WeakReference weakReference = this.Y;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            T(true);
        } else if (i == 6 || i == 5 || i == 4) {
            T(false);
        }
        S(i, true);
        while (true) {
            ArrayList arrayList = this.a0;
            if (i2 >= arrayList.size()) {
                R();
                return;
            } else {
                ((po8) arrayList.get(i2)).c(view, i);
                i2++;
            }
        }
    }

    public final boolean P(View view, float f) {
        if (this.K) {
            return true;
        }
        if (view.getTop() < this.H) {
            return false;
        }
        return Math.abs(((f * this.U) + ((float) view.getTop())) - ((float) this.H)) / ((float) B()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        O(2);
        S(r4, true);
        r2.B.d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.n(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.H(r4)
            a.ygu0 r1 = r2.Q
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.n(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            byte r5 = r1.f42603a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.r
            if (r5 == 0) goto L30
            r5 = 0
            r1.r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.O(r3)
            r3 = 1
            r2.S(r4, r3)
            a.qo8 r2 = r2.B
            r2.d(r4)
            return
        L40:
            r2.O(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.Q(android.view.View, int, boolean):void");
    }

    public final void R() {
        View view;
        WeakReference weakReference = this.Y;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        rgu0.l(view, 1048576);
        rgu0.i(view, 0);
        rgu0.l(view, 524288);
        rgu0.i(view, 0);
        rgu0.l(view, 262144);
        rgu0.i(view, 0);
        SparseIntArray sparseIntArray = this.j0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            rgu0.l(view, i);
            rgu0.i(view, 0);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.i0;
        int i2 = sparseIntArray2.get(0, -1);
        if (i2 != -1) {
            rgu0.l(view, i2);
            rgu0.i(view, 0);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.k0;
        int i3 = sparseIntArray3.get(0, -1);
        if (i3 != -1) {
            rgu0.l(view, i3);
            rgu0.i(view, 0);
            sparseIntArray3.delete(0);
        }
        if (!this.b && this.P != 6) {
            sparseIntArray2.put(0, x(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.J && this.P != 5) {
            rgu0.m(view, d7.k, new oo8(this, 5));
        }
        int i4 = this.P;
        if (i4 == 3) {
            if (this.K && this.J) {
                return;
            }
            sparseIntArray3.put(0, x(view, R.string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i4 == 4) {
            sparseIntArray.put(0, x(view, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i4 != 6) {
                return;
            }
            if (!this.K || !this.J) {
                sparseIntArray3.put(0, x(view, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, x(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    public final void S(int i, boolean z) {
        ki30 ki30Var;
        if (i == 2) {
            return;
        }
        boolean z2 = this.P == 3 && (this.y || I());
        if (this.A == z2 || (ki30Var = this.j) == null) {
            return;
        }
        this.A = z2;
        ValueAnimator valueAnimator = this.C;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            ki30Var.t(this.A ? A() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(ki30Var.b.i, z2 ? A() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void T(boolean z) {
        WeakReference weakReference = this.Y;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.h0 != null) {
                    return;
                } else {
                    this.h0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.Y.get() && z) {
                    this.h0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.h0 = null;
        }
    }

    public final void U() {
        View view;
        if (this.Y != null) {
            z();
            if (this.P != 4 || (view = (View) this.Y.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // a.ph30
    public final void a(pb5 pb5Var) {
        th30 th30Var = this.c0;
        if (th30Var == null) {
            return;
        }
        th30Var.f = pb5Var;
    }

    @Override // a.ph30
    public final void b(pb5 pb5Var) {
        th30 th30Var = this.c0;
        if (th30Var == null) {
            return;
        }
        if (th30Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        pb5 pb5Var2 = th30Var.f;
        th30Var.f = pb5Var;
        if (pb5Var2 == null) {
            return;
        }
        th30Var.b(pb5Var.c);
    }

    @Override // a.ph30
    public final void c() {
        th30 th30Var = this.c0;
        if (th30Var == null) {
            return;
        }
        if (th30Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        pb5 pb5Var = th30Var.f;
        th30Var.f = null;
        if (pb5Var == null) {
            return;
        }
        AnimatorSet animatorSetA = th30Var.a();
        animatorSetA.setDuration(th30Var.e);
        animatorSetA.start();
    }

    @Override // a.ph30
    public final void d() {
        th30 th30Var = this.c0;
        if (th30Var == null) {
            return;
        }
        int i = th30Var.d;
        int i2 = th30Var.c;
        pb5 pb5Var = th30Var.f;
        th30Var.f = null;
        if (pb5Var != null) {
            float f = pb5Var.c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.J) {
                    AnimatorSet animatorSetA = th30Var.a();
                    animatorSetA.setDuration(n73.c(i2, f, i));
                    animatorSetA.start();
                    N(4);
                    return;
                }
                xh xhVar = new xh(this, (byte) 3);
                View view = th30Var.b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                objectAnimatorOfFloat.setInterpolator(new f0p((byte) 1));
                objectAnimatorOfFloat.setDuration(n73.c(i2, f, i));
                objectAnimatorOfFloat.addListener(new xh(th30Var, (byte) 10));
                objectAnimatorOfFloat.addListener(xhVar);
                objectAnimatorOfFloat.start();
                return;
            }
        }
        N(this.J ? 5 : 4);
    }

    @Override // a.yke
    public final void g(ble bleVar) {
        this.Y = null;
        this.Q = null;
        this.c0 = null;
    }

    @Override // a.yke
    public final void j() {
        this.Y = null;
        this.Q = null;
        this.c0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0122  */
    @Override // a.yke
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int i;
        ygu0 ygu0Var;
        if (!view.isShown() || !this.L) {
            this.R = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = null;
            VelocityTracker velocityTracker = this.b0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.b0 = null;
            }
        }
        VelocityTracker velocityTrackerObtain = this.b0;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.b0 = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        ArrayList arrayList = this.Z;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.e0 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        view2 = null;
                        break;
                    }
                    view2 = (View) ((WeakReference) it.next()).get();
                    if (view2 != null && coordinatorLayout.o(view2, x2, y)) {
                        break;
                    }
                }
            } else {
                view2 = null;
                break;
            }
            WeakReference weakReference = new WeakReference(view2);
            this.f0 = weakReference;
            if (this.P != 2 && weakReference.get() != null) {
                this.d0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.g0 = true;
            }
            this.R = this.d0 == -1 && !coordinatorLayout.o(view, x, this.e0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.g0 = false;
            this.f0 = null;
            this.d0 = -1;
            if (this.R) {
                this.R = false;
                return false;
            }
        }
        if (this.R || (ygu0Var = this.Q) == null || !ygu0Var.o(motionEvent)) {
            if (actionMasked == 2) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((WeakReference) it2.next()).get() != null) {
                        if (!this.R && this.P != 1) {
                            if (!this.e) {
                                View view3 = arrayList.isEmpty() ? null : (View) ((WeakReference) arrayList.get(0)).get();
                                if (view3 != null && coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                                    break;
                                }
                                if (this.Q == null) {
                                    break;
                                }
                            } else {
                                WeakReference weakReference2 = this.f0;
                                if (weakReference2 != null && weakReference2.get() != null) {
                                    break;
                                }
                                if (this.Q == null || (i = this.e0) == -1 || Math.abs(i - motionEvent.getY()) <= this.Q.b) {
                                    break;
                                }
                            }
                        } else {
                            break;
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // a.yke
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        byte b = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.Y == null) {
            this.h = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.o || this.g) ? false : true;
            if (this.p || this.q || this.r || this.t || this.u || this.v || z) {
                s88 s88Var = new s88(this, z, b);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                j6 j6Var = new j6();
                j6Var.f15959a = paddingStart;
                j6Var.b = paddingEnd;
                j6Var.c = paddingBottom;
                afm0 afm0Var = new afm0((Object) s88Var, (Object) j6Var, (byte) 15);
                WeakHashMap weakHashMap = rgu0.f30456a;
                igu0.c(view, afm0Var);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new amu0());
                }
            }
            qfx qfxVar = new qfx(view);
            WeakHashMap weakHashMap2 = rgu0.f30456a;
            div0.a(view, qfxVar);
            this.Y = new WeakReference(view);
            this.c0 = new th30(view);
            ki30 ki30Var = this.j;
            if (ki30Var != null) {
                view.setBackground(ki30Var);
                float elevation = this.I;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                ki30Var.r(elevation);
            } else {
                ColorStateList colorStateList = this.k;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            R();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.Q == null) {
            this.Q = new ygu0(coordinatorLayout.getContext(), coordinatorLayout, this.m0);
        }
        int top = view.getTop();
        coordinatorLayout.r(view, i);
        this.W = coordinatorLayout.getWidth();
        this.X = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.V = height;
        int i3 = this.X;
        int i4 = i3 - height;
        int i5 = this.x;
        if (i4 < i5) {
            boolean z2 = this.s;
            int i6 = this.m;
            if (z2) {
                height = i6 == -1 ? i3 : Math.min(i3, i6);
                this.V = height;
            } else {
                int i7 = i3 - i5;
                height = i6 == -1 ? i7 : Math.min(i7, i6);
                this.V = height;
            }
        }
        this.E = Math.max(0, this.X - height);
        this.F = (int) ((1.0f - this.G) * this.X);
        z();
        int i8 = this.P;
        if (i8 == 3) {
            int iG = G();
            WeakHashMap weakHashMap3 = rgu0.f30456a;
            view.offsetTopAndBottom(iG);
        } else if (i8 == 6) {
            int i9 = this.F;
            WeakHashMap weakHashMap4 = rgu0.f30456a;
            view.offsetTopAndBottom(i9);
        } else if (this.J && i8 == 5) {
            int i10 = this.X;
            WeakHashMap weakHashMap5 = rgu0.f30456a;
            view.offsetTopAndBottom(i10);
        } else if (i8 == 4) {
            int i11 = this.H;
            WeakHashMap weakHashMap6 = rgu0.f30456a;
            view.offsetTopAndBottom(i11);
        } else if (i8 == 1 || i8 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap7 = rgu0.f30456a;
            view.offsetTopAndBottom(top2);
        }
        S(this.P, false);
        ArrayList arrayList = this.Z;
        arrayList.clear();
        if (this.e) {
            K(view);
        } else {
            arrayList.add(new WeakReference(D(view)));
        }
        while (true) {
            ArrayList arrayList2 = this.a0;
            if (i2 >= arrayList2.size()) {
                return true;
            }
            ((po8) arrayList2.get(i2)).a(view);
            i2++;
        }
    }

    @Override // a.yke
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(F(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.l, marginLayoutParams.width), F(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.m, marginLayoutParams.height));
        return true;
    }

    @Override // a.yke
    public final boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f) {
        Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() != null) {
                if (!J(view2) || this.P == 3 || this.N) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // a.yke
    public final void p(int i, int i2, int i3, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
        boolean zJ;
        if (i3 != 1 && (zJ = J(view2))) {
            int top = view.getTop();
            int i4 = top - i2;
            boolean z = this.M;
            if (i2 > 0) {
                if (!this.T && !z && zJ && view2.canScrollVertically(1)) {
                    this.N = true;
                    return;
                }
                if (i4 < G()) {
                    int iG = top - G();
                    iArr[1] = iG;
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    view.offsetTopAndBottom(-iG);
                    O(3);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap2 = rgu0.f30456a;
                    view.offsetTopAndBottom(-i2);
                    O(1);
                }
            } else if (i2 < 0) {
                boolean zCanScrollVertically = view2.canScrollVertically(-1);
                if (!this.T && !z && zJ && zCanScrollVertically) {
                    this.N = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    int i5 = this.H;
                    if (i4 > i5 && !this.J) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        WeakHashMap weakHashMap3 = rgu0.f30456a;
                        view.offsetTopAndBottom(-i6);
                        O(4);
                    } else {
                        if (!this.L) {
                            return;
                        }
                        iArr[1] = i2;
                        WeakHashMap weakHashMap4 = rgu0.f30456a;
                        view.offsetTopAndBottom(-i2);
                        O(1);
                    }
                }
            }
            C(view.getTop());
            this.S = i2;
            this.T = true;
            this.N = false;
        }
    }

    @Override // a.yke
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        if (!this.O || view.isInTouchMode()) {
            return false;
        }
        int i = this.P;
        if (i != 4 && i != 6) {
            return false;
        }
        Rect rect2 = this.l0;
        if (view.getLocalVisibleRect(rect2)) {
            WeakHashMap weakHashMap = rgu0.f30456a;
            xiv0 xiv0VarA = jgu0.a(view);
            if (xiv0VarA != null) {
                rect2.bottom -= xiv0VarA.f40966a.i(519).d;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        N(3);
        return true;
    }

    @Override // a.yke
    public final void s(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.f45562a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f = savedState.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = savedState.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.J = savedState.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.K = savedState.g;
            }
        }
        int i2 = savedState.c;
        if (i2 == 1 || i2 == 2) {
            this.P = 4;
        } else {
            this.P = i2;
        }
    }

    @Override // a.yke
    public final Parcelable t(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // a.yke
    public final boolean u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.S = 0;
        this.T = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    @Override // a.yke
    public final void v(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == G()) {
            O(3);
            return;
        }
        if (J(view2) && this.T) {
            if (this.S > 0) {
                if (!this.b && view.getTop() > this.F) {
                    i3 = 6;
                }
            } else if (this.J) {
                VelocityTracker velocityTracker = this.b0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    yVelocity = this.b0.getYVelocity(this.d0);
                }
                if (P(view, yVelocity)) {
                    i3 = 5;
                } else if (this.S == 0) {
                    top2 = view.getTop();
                    if (this.b) {
                        i2 = this.F;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.H)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.H)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.E) >= Math.abs(top2 - this.H)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.b) {
                        top = view.getTop();
                        if (Math.abs(top - this.F) < Math.abs(top - this.H)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.S == 0) {
                top2 = view.getTop();
                if (this.b) {
                    i2 = this.F;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.H)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.H)) {
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.E) >= Math.abs(top2 - this.H)) {
                    i3 = 4;
                }
            } else {
                if (!this.b) {
                    top = view.getTop();
                    if (Math.abs(top - this.F) < Math.abs(top - this.H)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            Q(view, i3, false);
            this.T = false;
        }
    }

    @Override // a.yke
    public final boolean w(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.P;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        ygu0 ygu0Var = this.Q;
        if (ygu0Var != null && (this.L || i == 1)) {
            ygu0Var.i(motionEvent);
        }
        if (actionMasked == 0) {
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = null;
            VelocityTracker velocityTracker = this.b0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.b0 = null;
            }
        }
        VelocityTracker velocityTrackerObtain = this.b0;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.b0 = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (this.Q != null && ((this.L || this.P == 1) && actionMasked == 2 && !this.R)) {
            float fAbs = Math.abs(this.e0 - motionEvent.getY());
            ygu0 ygu0Var2 = this.Q;
            if (fAbs > ygu0Var2.b) {
                ygu0Var2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.R;
    }

    public final int x(View view, int i, int i2) {
        int iA;
        String string = view.getResources().getString(i);
        oo8 oo8Var = new oo8(this, i2);
        ArrayList arrayListG = rgu0.g(view);
        int i3 = 0;
        while (true) {
            if (i3 >= arrayListG.size()) {
                int i4 = 0;
                int i5 = -1;
                while (true) {
                    int[] iArr = rgu0.d;
                    if (i4 >= 32 || i5 != -1) {
                        break;
                    }
                    int i6 = iArr[i4];
                    boolean z = true;
                    for (int i7 = 0; i7 < arrayListG.size(); i7++) {
                        z &= ((d7) arrayListG.get(i7)).a() != i6;
                    }
                    if (z) {
                        i5 = i6;
                    }
                    i4++;
                }
                iA = i5;
                break;
            }
            if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((d7) arrayListG.get(i3)).f5572a).getLabel())) {
                iA = ((d7) arrayListG.get(i3)).a();
                break;
            }
            i3++;
        }
        if (iA != -1) {
            d7 d7Var = new d7(null, iA, string, oo8Var, null);
            View.AccessibilityDelegate accessibilityDelegateE = rgu0.e(view);
            p6 p6Var = accessibilityDelegateE == null ? null : accessibilityDelegateE instanceof o6 ? ((o6) accessibilityDelegateE).f24709a : new p6(accessibilityDelegateE);
            if (p6Var == null) {
                p6Var = new p6();
            }
            rgu0.o(view, p6Var);
            rgu0.l(view, d7Var.a());
            rgu0.g(view).add(d7Var);
            rgu0.i(view, 0);
        }
        return iA;
    }

    public final void y(po8 po8Var) {
        ArrayList arrayList = this.a0;
        if (arrayList.contains(po8Var)) {
            return;
        }
        arrayList.add(po8Var);
    }

    public final void z() {
        int iB = B();
        boolean z = this.b;
        int i = this.X;
        if (z) {
            this.H = Math.max(i - iB, this.E);
        } else {
            this.H = i - iB;
        }
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public SavedState(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.c = bottomSheetBehavior.P;
            this.d = bottomSheetBehavior.f;
            this.e = bottomSheetBehavior.b;
            this.f = bottomSheetBehavior.J;
            this.g = bottomSheetBehavior.K;
        }
    }

    public BottomSheetBehavior() {
        this.f45562a = 0;
        this.b = true;
        this.l = -1;
        this.m = -1;
        this.B = new qo8(this);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = true;
        this.P = 4;
        this.U = 0.1f;
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.e0 = -1;
        this.i0 = new SparseIntArray();
        this.j0 = new SparseIntArray();
        this.k0 = new SparseIntArray();
        this.l0 = new Rect();
        this.m0 = new no8(this, (byte) 0);
    }

    @Override // a.yke
    public final void q(int i, int i2, int i3, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
    }
}
