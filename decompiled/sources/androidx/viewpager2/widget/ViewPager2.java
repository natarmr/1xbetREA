package androidx.viewpager2.widget;

import a.a9g;
import a.bwl;
import a.ehe0;
import a.f5r;
import a.fht0;
import a.gah0;
import a.h97;
import a.hah0;
import a.i7;
import a.jf4;
import a.k8m0;
import a.kju0;
import a.lju0;
import a.lz2;
import a.mju0;
import a.mx2;
import a.nju0;
import a.npd0;
import a.oju0;
import a.pju0;
import a.qju0;
import a.rgu0;
import a.u710;
import a.v4i0;
import a.w4p0;
import a.xp6;
import a.y63;
import a.y6e;
import a.yge0;
import a.zlt0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f45410a;
    public final Rect b;
    public final xp6 c;
    public int d;
    public boolean e;
    public final kju0 f;
    public y6e g;
    public int h;
    public Parcelable i;
    public RecyclerView j;
    public pju0 k;
    public hah0 l;
    public xp6 m;
    public bwl n;
    public a9g o;
    public ehe0 p;
    public boolean q;
    public boolean r;
    public int s;
    public fht0 t;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45411a;
        public int b;
        public Parcelable c;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f45411a);
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, i);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.f45410a = new Rect();
        this.b = new Rect();
        this.c = new xp6();
        this.e = false;
        this.f = new kju0(this, (byte) 0);
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        fht0 fht0Var = new fht0();
        fht0Var.d = this;
        fht0Var.f9559a = new w4p0((Object) fht0Var, (byte) 14);
        fht0Var.b = new zlt0((Object) fht0Var, (byte) 4);
        this.t = fht0Var;
        qju0 qju0Var = new qju0(this, context);
        this.j = qju0Var;
        qju0Var.setId(View.generateViewId());
        this.j.setDescendantFocusability(131072);
        y6e y6eVar = new y6e(this, context);
        this.g = y6eVar;
        this.j.setLayoutManager(y6eVar);
        byte b = 1;
        this.j.setScrollingTouchSlop(1);
        int[] iArr = npd0.f23908a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        rgu0.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        byte b2 = 0;
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            RecyclerView recyclerView = this.j;
            mju0 mju0Var = new mju0();
            ArrayList arrayList = recyclerView.f1;
            if (arrayList == null) {
                arrayList = new ArrayList();
                recyclerView.f1 = arrayList;
            }
            arrayList.add(mju0Var);
            hah0 hah0Var = new hah0(this);
            this.l = hah0Var;
            this.n = new bwl(hah0Var);
            pju0 pju0Var = new pju0(this);
            this.k = pju0Var;
            pju0Var.b(this.j);
            this.j.o(this.l);
            xp6 xp6Var = new xp6();
            this.m = xp6Var;
            this.l.f12725a = xp6Var;
            lju0 lju0Var = new lju0(this, b2);
            lju0 lju0Var2 = new lju0(this, b);
            ((ArrayList) xp6Var.b).add(lju0Var);
            ((ArrayList) this.m.b).add(lju0Var2);
            fht0 fht0Var2 = this.t;
            RecyclerView recyclerView2 = this.j;
            fht0Var2.getClass();
            recyclerView2.setImportantForAccessibility(2);
            fht0Var2.c = new kju0(fht0Var2, b);
            ViewPager2 viewPager2 = (ViewPager2) fht0Var2.d;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.m.b).add(this.c);
            a9g a9gVar = new a9g(this.g);
            this.o = a9gVar;
            ((ArrayList) this.m.b).add(a9gVar);
            RecyclerView recyclerView3 = this.j;
            attachViewToParent(recyclerView3, 0, recyclerView3.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean b() {
        return this.g.b.getLayoutDirection() == 1;
    }

    public final void c(nju0 nju0Var) {
        ((ArrayList) this.c.b).add(nju0Var);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.j.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.j.canScrollVertically(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        yge0 adapter;
        if (this.h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            if (adapter instanceof k8m0) {
                f5r f5rVar = (f5r) ((k8m0) adapter);
                u710 u710Var = f5rVar.f;
                u710 u710Var2 = f5rVar.g;
                if (!u710Var2.d() || !u710Var.d()) {
                    jf4.n("Expected the adapter to be 'fresh' while restoring state.");
                    return;
                }
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(f5rVar.getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        u710Var.f(f5rVar.e.Q(bundle, str), Long.parseLong(str.substring(2)));
                    } else {
                        if (!str.startsWith("s#") || str.length() <= 2) {
                            jf4.o("Unexpected key in savedState: ".concat(str));
                            return;
                        }
                        long j = Long.parseLong(str.substring(2));
                        Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                        if (f5rVar.A(j)) {
                            u710Var2.f(savedState, j);
                        }
                    }
                }
                if (!u710Var.d()) {
                    f5rVar.l = true;
                    f5rVar.k = true;
                    f5rVar.C();
                    Handler handler = new Handler(Looper.getMainLooper());
                    mx2 mx2Var = new mx2(f5rVar, (byte) 14);
                    f5rVar.d.a(new lz2((Object) handler, (Object) mx2Var, (byte) 3));
                    handler.postDelayed(mx2Var, 10000L);
                }
            }
            this.i = null;
        }
        int iMax = Math.max(0, Math.min(this.h, adapter.d() - 1));
        this.d = iMax;
        this.h = -1;
        this.j.y0(iMax);
        this.t.p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f45411a;
            sparseArray.put(this.j.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        d();
    }

    public final void e(int i, boolean z) {
        Object obj = this.n.f3330a;
        f(i, z);
    }

    public final void f(int i, boolean z) {
        xp6 xp6Var;
        yge0 adapter = getAdapter();
        if (adapter == null) {
            if (this.h != -1) {
                this.h = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.d() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.d() - 1);
        int i2 = this.d;
        if (iMin == i2 && this.l.f == 0) {
            return;
        }
        if (iMin == i2 && z) {
            return;
        }
        double d = i2;
        this.d = iMin;
        this.t.p();
        hah0 hah0Var = this.l;
        if (hah0Var.f != 0) {
            hah0Var.h();
            gah0 gah0Var = hah0Var.g;
            d = ((double) gah0Var.b) + ((double) gah0Var.f10965a);
        }
        hah0 hah0Var2 = this.l;
        hah0Var2.getClass();
        hah0Var2.e = z ? 2 : 3;
        boolean z2 = hah0Var2.i != iMin;
        hah0Var2.i = iMin;
        hah0Var2.f(2);
        if (z2 && (xp6Var = hah0Var2.f12725a) != null) {
            xp6Var.c(iMin);
        }
        if (!z) {
            this.j.y0(iMin);
            return;
        }
        double d2 = iMin;
        double dAbs = Math.abs(d2 - d);
        RecyclerView recyclerView = this.j;
        if (dAbs <= 3.0d) {
            recyclerView.B0(iMin);
            return;
        }
        recyclerView.y0(d2 > d ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView2 = this.j;
        recyclerView2.post(new y63(recyclerView2, iMin));
    }

    public final void g(nju0 nju0Var) {
        ((ArrayList) this.c.b).remove(nju0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.t.getClass();
        this.t.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public yge0 getAdapter() {
        return this.j.getAdapter();
    }

    public int getCurrentItem() {
        return this.d;
    }

    public int getItemDecorationCount() {
        return this.j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.s;
    }

    public int getOrientation() {
        return this.g.p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.l.f;
    }

    public final void h() {
        pju0 pju0Var = this.k;
        if (pju0Var == null) {
            jf4.n("Design assumption violated.");
            return;
        }
        View viewE = pju0Var.e(this.g);
        if (viewE == null) {
            return;
        }
        this.g.getClass();
        int iT = b.T(viewE);
        if (iT != this.d && getScrollState() == 0) {
            this.m.c(iT);
        }
        this.e = false;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iD;
        int iD2;
        int iD3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.t.d;
        if (viewPager2.getAdapter() == null) {
            iD = 0;
            iD2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            iD = viewPager2.getAdapter().d();
            iD2 = 1;
        } else {
            iD2 = viewPager2.getAdapter().d();
            iD = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) i7.b(iD, iD2, 0).f14266a);
        yge0 adapter = viewPager2.getAdapter();
        if (adapter == null || (iD3 = adapter.d()) == 0 || !viewPager2.r) {
            return;
        }
        if (viewPager2.d > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.d < iD3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f45410a;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.e) {
            h();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.j, i, i2);
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        int measuredState = this.j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.h = savedState.b;
        this.i = savedState.c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f45411a = this.j.getId();
        int i = this.h;
        if (i == -1) {
            i = this.d;
        }
        savedState.b = i;
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            savedState.c = parcelable;
            return savedState;
        }
        Object adapter = this.j.getAdapter();
        if (adapter instanceof k8m0) {
            f5r f5rVar = (f5r) ((k8m0) adapter);
            f5rVar.getClass();
            u710 u710Var = f5rVar.f;
            int iH = u710Var.h();
            u710 u710Var2 = f5rVar.g;
            Bundle bundle = new Bundle(u710Var2.h() + iH);
            for (int i2 = 0; i2 < u710Var.h(); i2++) {
                long jE = u710Var.e(i2);
                Fragment fragment = (Fragment) u710Var.b(jE);
                if (fragment != null && fragment.N()) {
                    f5rVar.e.j0(bundle, fragment, h97.h(jE, "f#"));
                }
            }
            for (int i3 = 0; i3 < u710Var2.h(); i3++) {
                long jE2 = u710Var2.e(i3);
                if (f5rVar.A(jE2)) {
                    bundle.putParcelable(h97.h(jE2, "s#"), (Parcelable) u710Var2.b(jE2));
                }
            }
            savedState.c = bundle;
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.t.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        fht0 fht0Var = this.t;
        fht0Var.getClass();
        ViewPager2 viewPager2 = (ViewPager2) fht0Var.d;
        if (i != 8192 && i != 4096) {
            v4i0.e();
            return false;
        }
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.r) {
            viewPager2.f(currentItem, true);
        }
        return true;
    }

    public void setAdapter(yge0 yge0Var) {
        yge0 adapter = this.j.getAdapter();
        fht0 fht0Var = this.t;
        if (adapter != null) {
            adapter.y((kju0) fht0Var.c);
        } else {
            fht0Var.getClass();
        }
        kju0 kju0Var = this.f;
        if (adapter != null) {
            adapter.y(kju0Var);
        }
        this.j.setAdapter(yge0Var);
        this.d = 0;
        d();
        fht0 fht0Var2 = this.t;
        fht0Var2.p();
        if (yge0Var != null) {
            yge0Var.v((kju0) fht0Var2.c);
        }
        if (yge0Var != null) {
            yge0Var.v(kju0Var);
        }
    }

    public void setCurrentItem(int i) {
        e(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.t.p();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            jf4.o("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.s = i;
            this.j.requestLayout();
        }
    }

    public void setOrientation(int i) {
        this.g.x1(i);
        this.t.p();
    }

    public void setPageTransformer(oju0 oju0Var) {
        boolean z = this.q;
        if (oju0Var != null) {
            if (!z) {
                this.p = this.j.getItemAnimator();
                this.q = true;
            }
            this.j.setItemAnimator(null);
        } else if (z) {
            this.j.setItemAnimator(this.p);
            this.p = null;
            this.q = false;
        }
        a9g a9gVar = this.o;
        if (oju0Var == ((oju0) a9gVar.c)) {
            return;
        }
        a9gVar.c = oju0Var;
        if (oju0Var == null) {
            return;
        }
        hah0 hah0Var = this.l;
        hah0Var.h();
        gah0 gah0Var = hah0Var.g;
        double d = ((double) gah0Var.b) + ((double) gah0Var.f10965a);
        int i = (int) d;
        float f = (float) (d - ((double) i));
        this.o.b(i, f, Math.round(getPageSize() * f));
    }

    public void setUserInputEnabled(boolean z) {
        this.r = z;
        this.t.p();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45410a = new Rect();
        this.b = new Rect();
        this.c = new xp6();
        this.e = false;
        this.f = new kju0(this, (byte) 0);
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        a(context, attributeSet);
    }
}
