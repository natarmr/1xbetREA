package androidx.recyclerview.widget;

import a.ehe0;
import a.ghe0;
import a.hcp0;
import a.hhe0;
import a.i7;
import a.iac;
import a.j7;
import a.jf4;
import a.jw20;
import a.k7;
import a.l900;
import a.lqd0;
import a.mhu0;
import a.msj;
import a.nuj0;
import a.pv00;
import a.rgu0;
import a.rw2;
import a.she0;
import a.the0;
import a.whe0;
import a.xhe0;
import a.yge0;
import a.yjc;
import a.zx10;
import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public iac f45401a;
    public RecyclerView b;
    public final hcp0 c;
    public final hcp0 d;
    public she0 e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public b() {
        pv00 pv00Var = new pv00(this);
        zx10 zx10Var = new zx10(this);
        this.c = new hcp0(pv00Var);
        this.d = new hcp0(zx10Var);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int J(boolean z, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int L(View view) {
        return view.getBottom() + ((hhe0) view.getLayoutParams()).b.bottom;
    }

    public static int N(View view) {
        return view.getLeft() - ((hhe0) view.getLayoutParams()).b.left;
    }

    public static int O(View view) {
        Rect rect = ((hhe0) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int P(View view) {
        Rect rect = ((hhe0) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int Q(View view) {
        return view.getRight() + ((hhe0) view.getLayoutParams()).b.right;
    }

    public static int R(View view) {
        return view.getTop() - ((hhe0) view.getLayoutParams()).b.top;
    }

    public static int T(View view) {
        return ((hhe0) view.getLayoutParams()).f13060a.e();
    }

    public static ghe0 U(Context context, AttributeSet attributeSet, int i, int i2) {
        ghe0 ghe0Var = new ghe0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lqd0.f20483a, i, i2);
        ghe0Var.f11294a = typedArrayObtainStyledAttributes.getInt(0, 1);
        ghe0Var.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        ghe0Var.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        ghe0Var.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return ghe0Var;
    }

    public static boolean Z(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void a0(View view, int i, int i2, int i3, int i4) {
        hhe0 hhe0Var = (hhe0) view.getLayoutParams();
        Rect rect = hhe0Var.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) hhe0Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) hhe0Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) hhe0Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) hhe0Var).bottomMargin);
    }

    public static int t(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    public int A(the0 the0Var) {
        return 0;
    }

    public final void A0(msj msjVar) {
        for (int I = I() - 1; I >= 0; I--) {
            if (!RecyclerView.X(H(I)).r()) {
                View viewH = H(I);
                if (H(I) != null) {
                    this.f45401a.k(I);
                }
                msjVar.k(viewH);
            }
        }
    }

    public int B(the0 the0Var) {
        return 0;
    }

    public final void B0(msj msjVar) {
        ArrayList arrayList;
        int size = ((ArrayList) msjVar.c).size();
        int i = size - 1;
        while (true) {
            arrayList = (ArrayList) msjVar.c;
            if (i < 0) {
                break;
            }
            View view = ((xhe0) arrayList.get(i)).f40887a;
            xhe0 xhe0VarX = RecyclerView.X(view);
            if (!xhe0VarX.r()) {
                xhe0VarX.q(false);
                if (xhe0VarX.m()) {
                    this.b.removeDetachedView(view, false);
                }
                ehe0 ehe0Var = this.b.p1;
                if (ehe0Var != null) {
                    ehe0Var.d(xhe0VarX);
                }
                xhe0VarX.q(true);
                xhe0 xhe0VarX2 = RecyclerView.X(view);
                xhe0VarX2.n = null;
                xhe0VarX2.o = false;
                xhe0VarX2.j &= -33;
                msjVar.l(xhe0VarX2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) msjVar.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public final void C(msj msjVar) {
        for (int I = I() - 1; I >= 0; I--) {
            View viewH = H(I);
            xhe0 xhe0VarX = RecyclerView.X(viewH);
            if (xhe0VarX.r()) {
                if (RecyclerView.e2) {
                    Log.d("RecyclerView", "ignoring view " + xhe0VarX);
                }
            } else if (!xhe0VarX.i() || xhe0VarX.k() || this.b.m.b) {
                H(I);
                this.f45401a.c(I);
                msjVar.m(viewH);
                this.b.g.o(xhe0VarX);
            } else {
                if (H(I) != null) {
                    this.f45401a.k(I);
                }
                msjVar.l(xhe0VarX);
            }
        }
    }

    public final void C0(View view, msj msjVar) {
        D0(view);
        msjVar.k(view);
    }

    public View D(int i) {
        int I = I();
        for (int i2 = 0; i2 < I; i2++) {
            View viewH = H(i2);
            xhe0 xhe0VarX = RecyclerView.X(viewH);
            if (xhe0VarX != null && xhe0VarX.e() == i && !xhe0VarX.r() && (this.b.H1.g || !xhe0VarX.k())) {
                return viewH;
            }
        }
        return null;
    }

    public final void D0(View view) {
        iac iacVar = this.f45401a;
        jw20 jw20Var = iacVar.f14431a;
        byte b = iacVar.d;
        if (b == 1) {
            jf4.n("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (b == 2) {
            jf4.n("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            iacVar.d = (byte) 1;
            iacVar.e = view;
            int iIndexOfChild = ((RecyclerView) jw20Var.b).indexOfChild(view);
            if (iIndexOfChild < 0) {
                return;
            }
            if (iacVar.b.x(iIndexOfChild)) {
                iacVar.l(view);
            }
            jw20Var.o(iIndexOfChild);
        } finally {
            iacVar.d = (byte) 0;
            iacVar.e = null;
        }
    }

    public hhe0 E() {
        return new hhe0(-2, -2);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    public boolean E0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = this.n - getPaddingRight();
        int paddingBottom = this.o - getPaddingBottom();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - paddingLeft;
        int iMin = Math.min(0, i);
        int i2 = top - paddingTop;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - paddingRight;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - paddingBottom);
        if (this.b.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int paddingLeft2 = getPaddingLeft();
                int paddingTop2 = getPaddingTop();
                int paddingRight2 = this.n - getPaddingRight();
                int paddingBottom2 = this.o - getPaddingBottom();
                Rect rect2 = this.b.j;
                M(rect2, focusedChild);
                if (rect2.left - i4 < paddingRight2 && rect2.right - i4 > paddingLeft2 && rect2.top - i5 < paddingBottom2 && rect2.bottom - i5 > paddingTop2) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                        return true;
                    }
                    recyclerView.A0(i4, i5, null, Integer.MIN_VALUE, false);
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.A0(i4, i5, null, Integer.MIN_VALUE, false);
            return true;
        }
        return false;
    }

    public hhe0 F(Context context, AttributeSet attributeSet) {
        return new hhe0(context, attributeSet);
    }

    public final void F0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public hhe0 G(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof hhe0) {
            return new hhe0((hhe0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new hhe0((ViewGroup.MarginLayoutParams) layoutParams) : new hhe0(layoutParams);
    }

    public abstract int G0(int i, msj msjVar, the0 the0Var);

    public final View H(int i) {
        iac iacVar = this.f45401a;
        if (iacVar != null) {
            return iacVar.d(i);
        }
        return null;
    }

    public final int I() {
        iac iacVar = this.f45401a;
        if (iacVar != null) {
            return iacVar.e();
        }
        return 0;
    }

    public int I0(int i, msj msjVar, the0 the0Var) {
        return 0;
    }

    public final void J0(RecyclerView recyclerView) {
        K0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public int K(msj msjVar, the0 the0Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.m == null || !q()) {
            return 1;
        }
        return this.b.m.d();
    }

    public final void K0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0 && !RecyclerView.h2) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 != 0 || RecyclerView.h2) {
            return;
        }
        this.o = 0;
    }

    public void L0(Rect rect, int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = rgu0.f30456a;
        this.b.setMeasuredDimension(t(i, paddingRight, recyclerView.getMinimumWidth()), t(i2, paddingBottom, this.b.getMinimumHeight()));
    }

    public void M(Rect rect, View view) {
        RecyclerView.Y(rect, view);
    }

    public final void M0(int i, int i2) {
        int I = I();
        if (I == 0) {
            this.b.v(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < I; i7++) {
            View viewH = H(i7);
            Rect rect = this.b.j;
            M(rect, viewH);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.j.set(i6, i4, i3, i5);
        L0(this.b.j, i, i2);
    }

    public final void N0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.f45401a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.f45401a = recyclerView.f;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    final boolean O0(View view, int i, int i2, hhe0 hhe0Var) {
        return (!view.isLayoutRequested() && this.h && Z(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) hhe0Var).width) && Z(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) hhe0Var).height)) ? false : true;
    }

    public boolean P0() {
        return false;
    }

    public final boolean Q0(View view, int i, int i2, hhe0 hhe0Var) {
        return (this.h && Z(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) hhe0Var).width) && Z(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) hhe0Var).height)) ? false : true;
    }

    public void R0(RecyclerView recyclerView, the0 the0Var, int i) {
        l900 l900Var = new l900(recyclerView.getContext());
        l900Var.f32207a = i;
        S0(l900Var);
    }

    public final int S() {
        RecyclerView recyclerView = this.b;
        yge0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.d();
        }
        return 0;
    }

    public final void S0(she0 she0Var) {
        she0 she0Var2 = this.e;
        if (she0Var2 != null && she0Var != she0Var2 && she0Var2.e) {
            she0Var2.h();
        }
        this.e = she0Var;
        RecyclerView recyclerView = this.b;
        she0Var.getClass();
        whe0 whe0Var = recyclerView.E1;
        whe0Var.g.removeCallbacks(whe0Var);
        whe0Var.c.abortAnimation();
        if (she0Var.h) {
            Log.w("RecyclerView", "An instance of " + she0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + she0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        she0Var.b = recyclerView;
        she0Var.c = this;
        int i = she0Var.f32207a;
        if (i == -1) {
            jf4.o("Invalid target position");
            return;
        }
        recyclerView.H1.f33958a = i;
        she0Var.e = true;
        she0Var.d = true;
        she0Var.f = recyclerView.n.D(i);
        she0Var.e();
        she0Var.b.E1.b();
        she0Var.h = true;
    }

    public boolean T0() {
        return false;
    }

    public int V(msj msjVar, the0 the0Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.m == null || !r()) {
            return 1;
        }
        return this.b.m.d();
    }

    public final void W(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((hhe0) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean X() {
        return false;
    }

    public boolean Y() {
        return false;
    }

    public void b0(View view) {
        hhe0 hhe0Var = (hhe0) view.getLayoutParams();
        Rect rectZ = this.b.Z(view);
        int i = rectZ.left + rectZ.right;
        int i2 = rectZ.top + rectZ.bottom;
        int iJ = J(q(), this.n, this.l, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) hhe0Var).leftMargin + ((ViewGroup.MarginLayoutParams) hhe0Var).rightMargin + i, ((ViewGroup.MarginLayoutParams) hhe0Var).width);
        int iJ2 = J(r(), this.o, this.m, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) hhe0Var).topMargin + ((ViewGroup.MarginLayoutParams) hhe0Var).bottomMargin + i2, ((ViewGroup.MarginLayoutParams) hhe0Var).height);
        if (O0(view, iJ, iJ2, hhe0Var)) {
            view.measure(iJ, iJ2);
        }
    }

    public void c0(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iE = recyclerView.f.e();
            for (int i2 = 0; i2 < iE; i2++) {
                recyclerView.f.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void d0(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iE = recyclerView.f.e();
            for (int i2 = 0; i2 < iE; i2++) {
                recyclerView.f.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void f0(RecyclerView recyclerView) {
    }

    public final int getPaddingBottom() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int getPaddingEnd() {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = rgu0.f30456a;
        return recyclerView.getPaddingEnd();
    }

    public final int getPaddingLeft() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int getPaddingRight() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int getPaddingStart() {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = rgu0.f30456a;
        return recyclerView.getPaddingStart();
    }

    public final int getPaddingTop() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public View h0(View view, int i, msj msjVar, the0 the0Var) {
        return null;
    }

    public void i0(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        msj msjVar = recyclerView.c;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        yge0 yge0Var = this.b.m;
        if (yge0Var != null) {
            accessibilityEvent.setItemCount(yge0Var.d());
        }
    }

    public void j0(msj msjVar, the0 the0Var, k7 k7Var) {
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            k7Var.a(8192);
            k7Var.n(true);
            k7Var.h(67108864, true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            k7Var.a(4096);
            k7Var.n(true);
            k7Var.h(67108864, true);
        }
        k7Var.k(i7.b(V(msjVar, the0Var), K(msjVar, the0Var), 0));
    }

    public void k0(msj msjVar, the0 the0Var, View view, k7 k7Var) {
        k7Var.l(j7.a(false, r() ? T(view) : 0, 1, q() ? T(view) : 0, 1));
    }

    public final void l(View view) {
        m(view, -1, false);
    }

    public final void l0(View view, k7 k7Var) {
        xhe0 xhe0VarX = RecyclerView.X(view);
        if (xhe0VarX == null || xhe0VarX.k()) {
            return;
        }
        iac iacVar = this.f45401a;
        if (iacVar.c.contains(xhe0VarX.f40887a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        k0(recyclerView.c, recyclerView.H1, view, k7Var);
    }

    public final void m(View view, int i, boolean z) {
        xhe0 xhe0VarX = RecyclerView.X(view);
        if (z || xhe0VarX.k()) {
            nuj0 nuj0Var = (nuj0) this.b.g.b;
            mhu0 mhu0VarA = (mhu0) nuj0Var.get(xhe0VarX);
            if (mhu0VarA == null) {
                mhu0VarA = mhu0.a();
                nuj0Var.put(xhe0VarX, mhu0VarA);
            }
            mhu0VarA.f21815a |= 1;
        } else {
            this.b.g.o(xhe0VarX);
        }
        hhe0 hhe0Var = (hhe0) view.getLayoutParams();
        if (xhe0VarX.s() || xhe0VarX.l()) {
            if (xhe0VarX.l()) {
                xhe0VarX.n.p(xhe0VarX);
            } else {
                xhe0VarX.j &= -33;
            }
            this.f45401a.b(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            iac iacVar = this.f45401a;
            if (parent == recyclerView) {
                int iJ = iacVar.j(view);
                if (i == -1) {
                    i = this.f45401a.e();
                }
                if (iJ == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.H());
                }
                if (iJ != i) {
                    b bVar = this.b.n;
                    View viewH = bVar.H(iJ);
                    if (viewH == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iJ + bVar.b.toString());
                    }
                    bVar.H(iJ);
                    bVar.f45401a.c(iJ);
                    bVar.o(viewH, i);
                }
            } else {
                iacVar.a(view, i, false);
                hhe0Var.c = true;
                she0 she0Var = this.e;
                if (she0Var != null && she0Var.e) {
                    she0Var.b.getClass();
                    if (RecyclerView.V(view) == she0Var.f32207a) {
                        she0Var.f = view;
                        if (RecyclerView.e2) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (hhe0Var.d) {
            if (RecyclerView.e2) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + hhe0Var.f13060a);
            }
            xhe0VarX.f40887a.invalidate();
            hhe0Var.d = false;
        }
    }

    public void m0(RecyclerView recyclerView, int i, int i2) {
    }

    public void n(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.p(str);
        }
    }

    public final void o(View view, int i) {
        hhe0 hhe0Var = (hhe0) view.getLayoutParams();
        xhe0 xhe0VarX = RecyclerView.X(view);
        boolean zK = xhe0VarX.k();
        RecyclerView recyclerView = this.b;
        if (zK) {
            nuj0 nuj0Var = (nuj0) recyclerView.g.b;
            mhu0 mhu0VarA = (mhu0) nuj0Var.get(xhe0VarX);
            if (mhu0VarA == null) {
                mhu0VarA = mhu0.a();
                nuj0Var.put(xhe0VarX, mhu0VarA);
            }
            mhu0VarA.f21815a |= 1;
        } else {
            recyclerView.g.o(xhe0VarX);
        }
        this.f45401a.b(view, i, hhe0Var, xhe0VarX.k());
    }

    public final void p(Rect rect, View view) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.Z(view));
        }
    }

    public boolean q() {
        return true;
    }

    public boolean r() {
        return false;
    }

    public void r0(RecyclerView recyclerView, int i, int i2) {
        q0(i);
    }

    public boolean s(hhe0 hhe0Var) {
        return true;
    }

    public abstract void s0(msj msjVar, the0 the0Var);

    public void u0(Parcelable parcelable) {
    }

    public Parcelable v0() {
        return null;
    }

    public int w(the0 the0Var) {
        return 0;
    }

    public void w0(int i) {
    }

    public int x(the0 the0Var) {
        return 0;
    }

    public boolean x0(int i, Bundle bundle) {
        RecyclerView recyclerView = this.b;
        return y0(recyclerView.c, recyclerView.H1, i, bundle);
    }

    public int y(the0 the0Var) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062 A[PHI: r11
  0x0062: PHI (r11v8 int) = (r11v5 int), (r11v19 int) binds: [B:27:0x007e, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean y0(msj msjVar, the0 the0Var, int i, Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        float f;
        if (this.b != null) {
            int iHeight = this.o;
            int iWidth = this.n;
            Rect rect = new Rect();
            if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i == 4096) {
                paddingTop = this.b.canScrollVertically(1) ? (iHeight - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.b.canScrollHorizontally(1)) {
                    paddingLeft = (iWidth - getPaddingLeft()) - getPaddingRight();
                } else {
                    paddingLeft = 0;
                }
            } else if (i != 8192) {
                paddingTop = 0;
                paddingLeft = 0;
            } else {
                paddingTop = this.b.canScrollVertically(-1) ? -((iHeight - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    paddingLeft = -((iWidth - getPaddingLeft()) - getPaddingRight());
                } else {
                    paddingLeft = 0;
                }
            }
            if (paddingTop != 0 || paddingLeft != 0) {
                if (bundle != null) {
                    f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                    if (f < 0.0f) {
                        if (RecyclerView.d2) {
                            jf4.o(rw2.j(f, "attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (", Separators.RPAREN));
                            return false;
                        }
                    }
                } else {
                    f = 1.0f;
                }
                if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                    if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                        paddingLeft = (int) (paddingLeft * f);
                        paddingTop = (int) (paddingTop * f);
                    }
                    this.b.A0(paddingLeft, paddingTop, null, Integer.MIN_VALUE, true);
                    return true;
                }
                RecyclerView recyclerView = this.b;
                yge0 yge0Var = recyclerView.m;
                if (yge0Var != null) {
                    if (i == 4096) {
                        recyclerView.B0(yge0Var.d() - 1);
                        return true;
                    }
                    if (i != 8192) {
                        return true;
                    }
                    recyclerView.B0(0);
                    return true;
                }
            }
        }
        return false;
    }

    public int z(the0 the0Var) {
        return 0;
    }

    public final void z0() {
        for (int I = I() - 1; I >= 0; I--) {
            this.f45401a.k(I);
        }
    }

    public void n0() {
    }

    public void H0(int i) {
    }

    public void e0(yge0 yge0Var) {
    }

    public void q0(int i) {
    }

    public void t0(the0 the0Var) {
    }

    public void g0(RecyclerView recyclerView, msj msjVar) {
    }

    public void o0(int i, int i2) {
    }

    public void p0(int i, int i2) {
    }

    public void v(int i, yjc yjcVar) {
    }

    public void u(int i, int i2, the0 the0Var, yjc yjcVar) {
    }
}
