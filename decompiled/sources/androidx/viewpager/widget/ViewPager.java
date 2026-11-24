package androidx.viewpager.widget;

import a.axq;
import a.bwf;
import a.c46;
import a.dw9;
import a.fju0;
import a.fuj0;
import a.gju0;
import a.hju0;
import a.igu0;
import a.iju0;
import a.itt0;
import a.jf4;
import a.jju0;
import a.jzt0;
import a.obo0;
import a.pj80;
import a.rgu0;
import a.ryx;
import a.rz4;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public int A;
    public int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45409a;
    public final ArrayList b;
    public final hju0 c;
    public final Rect d;
    public pj80 e;
    public int f;
    public float f1;
    public int g;
    public float g1;
    public Parcelable h;
    public float h1;
    public ClassLoader i;
    public float i1;
    public Scroller j;
    public int j1;
    public boolean k;
    public VelocityTracker k1;
    public bwf l;
    public int l1;
    public int m;
    public int m1;
    public Drawable n;
    public int n1;
    public int o;
    public int o1;
    public int p;
    public EdgeEffect p1;
    public float q;
    public EdgeEffect q1;
    public float r;
    public boolean r1;
    public int s;
    public boolean s1;
    public boolean t;
    public int t1;
    public boolean u;
    public ArrayList u1;
    public boolean v;
    public jju0 v1;
    public int w;
    public ArrayList w1;
    public boolean x;
    public final fju0 x1;
    public boolean y;
    public int y1;
    public int z;
    public static final int[] z1 = {R.attr.layout_gravity};
    public static final jzt0 A1 = new jzt0((byte) 2);
    public static final ryx B1 = new ryx((byte) 4);

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int c;
        public Parcelable d;
        public final ClassLoader e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.c = parcel.readInt();
            this.d = parcel.readParcelable(classLoader);
            this.e = classLoader;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return rz4.j(this.c, "}", sb);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeParcelable(this.d, i);
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.b = new ArrayList();
        this.c = new hju0();
        this.d = new Rect();
        this.g = -1;
        this.h = null;
        this.i = null;
        this.q = -3.4028235E38f;
        this.r = Float.MAX_VALUE;
        this.w = 1;
        this.j1 = -1;
        this.r1 = true;
        this.x1 = new fju0((Object) this, (byte) 0);
        this.y1 = 0;
        k();
    }

    public static boolean c(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (!(view instanceof ViewGroup)) {
            return z ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i5 = i2 + scrollX;
            if (i5 < childAt.getLeft() || i5 >= childAt.getRight() || (i4 = i3 + scrollY) < childAt.getTop() || i4 >= childAt.getBottom() || !c(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
            }
        }
        if (z || !view.canScrollHorizontally(-i)) {
        }
        return true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.u != z) {
            this.u = z;
        }
    }

    public final hju0 a(int i, int i2) {
        hju0 hju0Var = new hju0();
        hju0Var.b = i;
        hju0Var.f13178a = this.e.d(this, i);
        this.e.getClass();
        hju0Var.d = 1.0f;
        ArrayList arrayList = this.b;
        if (i2 < 0 || i2 >= arrayList.size()) {
            arrayList.add(hju0Var);
            return hju0Var;
        }
        arrayList.add(i2, hju0Var);
        return hju0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        hju0 hju0VarH;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (hju0VarH = h(childAt)) != null && hju0VarH.b == this.f) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        hju0 hju0VarH;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (hju0VarH = h(childAt)) != null && hju0VarH.b == this.f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        iju0 iju0Var = (iju0) layoutParams;
        boolean z = iju0Var.f14895a | (view.getClass().getAnnotation(gju0.class) != null);
        iju0Var.f14895a = z;
        if (!this.t) {
            super.addView(view, i, layoutParams);
        } else if (z) {
            jf4.n("Cannot add pager decor view during layout");
        } else {
            iju0Var.d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    public final boolean b(int i) {
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb = new StringBuilder(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        boolean z = true;
        boolean zN = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.d;
            if (i == 17) {
                int i2 = g(rect, viewFindNextFocus).left;
                int i3 = g(rect, viewFindFocus).left;
                if (viewFindFocus == null || i2 < i3) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                } else {
                    int i4 = this.f;
                    if (i4 > 0) {
                        this.v = false;
                        v(i4 - 1, 0, true, false);
                    } else {
                        z = false;
                    }
                    zN = z;
                }
            } else if (i == 66) {
                zRequestFocus = (viewFindFocus == null || g(rect, viewFindNextFocus).left > g(rect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : n();
            }
            zN = zRequestFocus;
        } else if (i == 17 || i == 1) {
            int i5 = this.f;
            if (i5 > 0) {
                this.v = false;
                v(i5 - 1, 0, true, false);
            } else {
                z = false;
            }
            zN = z;
        } else if (i == 66 || i == 2) {
            zN = n();
        }
        if (zN) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zN;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.q));
        }
        return i > 0 && scrollX < ((int) (((float) clientWidth) * this.r));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof iju0) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.k = true;
        if (this.j.isFinished() || !this.j.computeScrollOffset()) {
            d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.j.getCurrX();
        int currY = this.j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!o(currX)) {
                this.j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = rgu0.f30456a;
        postInvalidateOnAnimation();
    }

    public final void d(boolean z) {
        boolean z2 = this.y1 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.j.isFinished()) {
                this.j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.j.getCurrX();
                int currY = this.j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        o(currX);
                    }
                }
            }
        }
        this.v = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                break;
            }
            hju0 hju0Var = (hju0) arrayList.get(i);
            if (hju0Var.c) {
                hju0Var.c = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            fju0 fju0Var = this.x1;
            if (!z) {
                fju0Var.run();
            } else {
                WeakHashMap weakHashMap = rgu0.f30456a;
                postOnAnimation(fju0Var);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zB;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zB = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        zB = keyEvent.hasModifiers(2) ? n() : b(66);
                    } else if (keyCode != 61) {
                        zB = false;
                    } else if (keyEvent.hasNoModifiers()) {
                        zB = b(2);
                    } else if (keyEvent.hasModifiers(1)) {
                        zB = b(1);
                    } else {
                        zB = false;
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    int i = this.f;
                    if (i > 0) {
                        this.v = false;
                        v(i - 1, 0, true, false);
                        zB = true;
                    } else {
                        zB = false;
                    }
                } else {
                    zB = b(17);
                }
            }
            if (!zB) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        hju0 hju0VarH;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (hju0VarH = h(childAt)) != null && hju0VarH.b == this.f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        pj80 pj80Var;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pj80Var = this.e) != null && pj80Var.c() > 1)) {
            if (!this.p1.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.q * width);
                this.p1.setSize(height, width);
                zDraw = this.p1.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.q1.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.r + 1.0f)) * width2);
                this.q1.setSize(height2, width2);
                zDraw |= this.q1.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.p1.finish();
            this.q1.finish();
        }
        if (zDraw) {
            WeakHashMap weakHashMap = rgu0.f30456a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        int iC = this.e.c();
        this.f45409a = iC;
        ArrayList arrayList = this.b;
        boolean z = arrayList.size() < (this.w * 2) + 1 && arrayList.size() < iC;
        int i = this.f;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            hju0 hju0Var = (hju0) arrayList.get(i2);
            pj80 pj80Var = this.e;
            Object obj = hju0Var.f13178a;
            pj80Var.getClass();
        }
        Collections.sort(arrayList, A1);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                iju0 iju0Var = (iju0) getChildAt(i3).getLayoutParams();
                if (!iju0Var.f14895a) {
                    iju0Var.c = 0.0f;
                }
            }
            v(i, 0, false, true);
            requestLayout();
        }
    }

    public final void f(int i) {
        jju0 jju0Var = this.v1;
        if (jju0Var != null) {
            jju0Var.c(i);
        }
        ArrayList arrayList = this.u1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                jju0 jju0Var2 = (jju0) this.u1.get(i2);
                if (jju0Var2 != null) {
                    jju0Var2.c(i);
                }
            }
        }
    }

    public final Rect g(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        iju0 iju0Var = new iju0(-1, -1);
        iju0Var.c = 0.0f;
        return iju0Var;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        iju0 iju0Var = new iju0(context, attributeSet);
        iju0Var.c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z1);
        iju0Var.b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return iju0Var;
    }

    public pj80 getAdapter() {
        return this.e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.w;
    }

    public int getPageMargin() {
        return this.m;
    }

    public final hju0 h(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return null;
            }
            hju0 hju0Var = (hju0) arrayList.get(i);
            if (this.e.e(view, hju0Var.f13178a)) {
                return hju0Var;
            }
            i++;
        }
    }

    public final hju0 i() {
        hju0 hju0Var;
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.m / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        hju0 hju0Var2 = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                break;
            }
            hju0 hju0Var3 = (hju0) arrayList.get(i2);
            if (z || hju0Var3.b == (i = i3 + 1)) {
                hju0Var = hju0Var3;
            } else {
                float f4 = f + f3 + f2;
                hju0 hju0Var4 = this.c;
                hju0Var4.e = f4;
                hju0Var4.b = i;
                this.e.getClass();
                hju0Var4.d = 1.0f;
                i2--;
                hju0Var = hju0Var4;
            }
            f = hju0Var.e;
            float f5 = hju0Var.d + f + f2;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f5 || i2 == arrayList.size() - 1) {
                return hju0Var;
            }
            int i4 = hju0Var.b;
            float f6 = hju0Var.d;
            i2++;
            hju0 hju0Var5 = hju0Var;
            i3 = i4;
            f3 = f6;
            hju0Var2 = hju0Var5;
            z = false;
        }
        return hju0Var2;
    }

    public final hju0 j(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            hju0 hju0Var = (hju0) arrayList.get(i2);
            if (hju0Var.b == i) {
                return hju0Var;
            }
            i2++;
        }
    }

    public final void k() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.j = new Scroller(context, B1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.B = viewConfiguration.getScaledPagingTouchSlop();
        this.l1 = (int) (400.0f * f);
        this.m1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.p1 = new EdgeEffect(context);
        this.q1 = new EdgeEffect(context);
        this.n1 = (int) (25.0f * f);
        this.o1 = (int) (2.0f * f);
        this.z = (int) (f * 16.0f);
        rgu0.o(this, new c46(this, (byte) 8));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        igu0.c(this, new fuj0(this));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    public final void l(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.t1 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                iju0 iju0Var = (iju0) childAt.getLayoutParams();
                if (iju0Var.f14895a) {
                    int i4 = iju0Var.b & 7;
                    if (i4 != 1) {
                        if (i4 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i5 = iMax;
                    width = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        jju0 jju0Var = this.v1;
        if (jju0Var != null) {
            jju0Var.a(i, f, i2);
        }
        ArrayList arrayList = this.u1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                jju0 jju0Var2 = (jju0) this.u1.get(i6);
                if (jju0Var2 != null) {
                    jju0Var2.a(i, f, i2);
                }
            }
        }
        this.s1 = true;
    }

    public final void m(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.j1) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1 = motionEvent.getX(i);
            this.j1 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.k1;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean n() {
        pj80 pj80Var = this.e;
        if (pj80Var == null || this.f >= pj80Var.c() - 1) {
            return false;
        }
        int i = this.f + 1;
        this.v = false;
        v(i, 0, true, false);
        return true;
    }

    public final boolean o(int i) {
        if (this.b.size() == 0) {
            if (!this.r1) {
                this.s1 = false;
                l(0, 0.0f, 0);
                if (!this.s1) {
                    jf4.n("onPageScrolled did not call superclass implementation");
                    return false;
                }
            }
            return false;
        }
        hju0 hju0VarI = i();
        int clientWidth = getClientWidth();
        int i2 = this.m;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = hju0VarI.b;
        float f2 = ((i / f) - hju0VarI.e) / (hju0VarI.d + (i2 / f));
        this.s1 = false;
        l(i4, f2, (int) (i3 * f2));
        if (this.s1) {
            return true;
        }
        jf4.n("onPageScrolled did not call superclass implementation");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r1 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.x1);
        Scroller scroller = this.j;
        if (scroller != null && !scroller.isFinished()) {
            this.j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        super.onDraw(canvas);
        if (this.m <= 0 || this.n == null) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0 || this.e == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f2 = width;
        float f3 = this.m / f2;
        int i2 = 0;
        hju0 hju0Var = (hju0) arrayList.get(0);
        float f4 = hju0Var.e;
        int size = arrayList.size();
        int i3 = hju0Var.b;
        int i4 = ((hju0) arrayList.get(size - 1)).b;
        while (i3 < i4) {
            while (true) {
                i = hju0Var.b;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                hju0Var = (hju0) arrayList.get(i2);
            }
            if (i3 == i) {
                float f5 = hju0Var.e;
                float f6 = hju0Var.d;
                f = (f5 + f6) * f2;
                f4 = f5 + f6 + f3;
            } else {
                this.e.getClass();
                f = (f4 + 1.0f) * f2;
                f4 = 1.0f + f3 + f4;
            }
            if (this.m + f > scrollX) {
                this.n.setBounds(Math.round(f), this.o, Math.round(this.m + f), this.p);
                this.n.draw(canvas);
            }
            if (f > scrollX + width) {
                return;
            }
            i3++;
            arrayList = arrayList;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            t();
            return false;
        }
        if (action != 0) {
            if (this.x) {
                return true;
            }
            if (this.y) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.h1 = x;
            this.f1 = x;
            float y = motionEvent.getY();
            this.i1 = y;
            this.g1 = y;
            this.j1 = motionEvent.getPointerId(0);
            this.y = false;
            this.k = true;
            this.j.computeScrollOffset();
            if (this.y1 != 2 || Math.abs(this.j.getFinalX() - this.j.getCurrX()) <= this.o1) {
                d(false);
                this.x = false;
            } else {
                this.j.abortAnimation();
                this.v = false;
                q();
                this.x = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.j1;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.f1;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.i1);
                if (f != 0.0f) {
                    float f2 = this.f1;
                    if ((f2 >= this.A || f <= 0.0f) && ((f2 <= getWidth() - this.A || f >= 0.0f) && c((int) f, (int) x2, (int) y2, this, false))) {
                        this.f1 = x2;
                        this.g1 = y2;
                        this.y = true;
                        return false;
                    }
                }
                float f3 = this.B;
                if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                    this.x = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f4 = this.h1;
                    float f5 = this.B;
                    this.f1 = f > 0.0f ? f4 + f5 : f4 - f5;
                    this.g1 = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f3) {
                    this.y = true;
                }
                if (this.x && p(x2)) {
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m(motionEvent);
        }
        VelocityTracker velocityTrackerObtain = this.k1;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.k1 = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        return this.x;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        hju0 hju0VarH;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                iju0 iju0Var = (iju0) childAt.getLayoutParams();
                if (iju0Var.f14895a) {
                    int i9 = iju0Var.b;
                    int i10 = i9 & 7;
                    int i11 = i9 & 112;
                    if (i10 != 1) {
                        if (i10 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i10 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i11 != 16) {
                            if (i11 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i11 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i12 = paddingLeft + scrollX;
                            childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + paddingTop);
                            i7++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i13 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i13;
                        int i14 = paddingLeft + scrollX;
                        childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i15;
                    if (i11 != 16) {
                        if (i11 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i11 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i16 = paddingLeft + scrollX;
                        childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i17 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i17;
                    int i18 = paddingLeft + scrollX;
                    childAt.layout(i18, paddingTop, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + paddingTop);
                    i7++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i19 = (i5 - paddingLeft) - paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                iju0 iju0Var2 = (iju0) childAt2.getLayoutParams();
                if (!iju0Var2.f14895a && (hju0VarH = h(childAt2)) != null) {
                    float f = i19;
                    int i21 = ((int) (hju0VarH.e * f)) + paddingLeft;
                    if (iju0Var2.d) {
                        iju0Var2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * iju0Var2.c), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.o = paddingTop;
        this.p = i6 - paddingBottom;
        this.t1 = i7;
        if (this.r1) {
            z2 = false;
            u(this.f, 0, false, false);
        } else {
            z2 = false;
        }
        this.r1 = z2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        iju0 iju0Var;
        iju0 iju0Var2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.A = Math.min(measuredWidth / 10, this.z);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (iju0Var2 = (iju0) childAt.getLayoutParams()) != null && iju0Var2.f14895a) {
                int i6 = iju0Var2.b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) iju0Var2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) iju0Var2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.s = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.t = true;
        q();
        this.t = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((iju0Var = (iju0) childAt2.getLayoutParams()) == null || !iju0Var.f14895a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * iju0Var.c), 1073741824), this.s);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        hju0 hju0VarH;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (hju0VarH = h(childAt)) != null && hju0VarH.b == this.f && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        ClassLoader classLoader = savedState.e;
        super.onRestoreInstanceState(savedState.f45367a);
        pj80 pj80Var = this.e;
        if (pj80Var != null) {
            pj80Var.f(savedState.d, classLoader);
            v(savedState.c, 0, false, true);
        } else {
            this.g = savedState.c;
            this.h = savedState.d;
            this.i = classLoader;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.f;
        pj80 pj80Var = this.e;
        if (pj80Var != null) {
            savedState.d = pj80Var.g();
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.m;
            s(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pj80 pj80Var;
        boolean zT = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pj80Var = this.e) == null || pj80Var.c() == 0) {
            return false;
        }
        VelocityTracker velocityTrackerObtain = this.k1;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.k1 = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.j.abortAnimation();
            this.v = false;
            q();
            float x = motionEvent.getX();
            this.h1 = x;
            this.f1 = x;
            float y = motionEvent.getY();
            this.i1 = y;
            this.g1 = y;
            this.j1 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f1 = motionEvent.getX(actionIndex);
                        this.j1 = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m(motionEvent);
                        this.f1 = motionEvent.getX(motionEvent.findPointerIndex(this.j1));
                    }
                } else if (this.x) {
                    u(this.f, 0, true, false);
                    zT = t();
                }
            } else if (!this.x) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.j1);
                if (iFindPointerIndex == -1) {
                    zT = t();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.f1);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.g1);
                    if (fAbs > this.B && fAbs > fAbs2) {
                        this.x = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        float f = this.h1;
                        float f2 = x2 - f;
                        int i = this.B;
                        this.f1 = f2 > 0.0f ? f + i : f - i;
                        this.g1 = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.x) {
                        zT = p(motionEvent.getX(motionEvent.findPointerIndex(this.j1)));
                    }
                }
            } else if (this.x) {
                zT = p(motionEvent.getX(motionEvent.findPointerIndex(this.j1)));
            }
        } else if (this.x) {
            VelocityTracker velocityTracker = this.k1;
            velocityTracker.computeCurrentVelocity(1000, this.m1);
            int xVelocity = (int) velocityTracker.getXVelocity(this.j1);
            this.v = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            hju0 hju0VarI = i();
            float f3 = clientWidth;
            float f4 = this.m / f3;
            int iMax = hju0VarI.b;
            float f5 = ((scrollX / f3) - hju0VarI.e) / (hju0VarI.d + f4);
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.j1)) - this.h1)) <= this.n1 || Math.abs(xVelocity) <= this.l1) {
                iMax += (int) (f5 + (iMax >= this.f ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                iMax++;
            }
            ArrayList arrayList = this.b;
            if (arrayList.size() > 0) {
                iMax = Math.max(((hju0) arrayList.get(0)).b, Math.min(iMax, ((hju0) dw9.l(1, arrayList)).b));
            }
            v(iMax, xVelocity, true, true);
            zT = t();
        }
        if (zT) {
            WeakHashMap weakHashMap = rgu0.f30456a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final boolean p(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f1 - f;
        this.f1 = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.q * clientWidth;
        float f4 = this.r * clientWidth;
        ArrayList arrayList = this.b;
        boolean z3 = false;
        hju0 hju0Var = (hju0) arrayList.get(0);
        hju0 hju0Var2 = (hju0) dw9.l(1, arrayList);
        if (hju0Var.b != 0) {
            f3 = hju0Var.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (hju0Var2.b != this.e.c() - 1) {
            f4 = hju0Var2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.p1.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.q1.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f1 = (scrollX - i) + this.f1;
        scrollTo(i, getScrollY());
        o(i);
        return z3;
    }

    public final void q() {
        r(this.f);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c3 A[PHI: r7 r11 r15
  0x00c3: PHI (r7v15 int) = (r7v14 int), (r7v4 int), (r7v18 int) binds: [B:62:0x00e7, B:59:0x00d3, B:50:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r11v32 int) = (r11v1 int), (r11v31 int), (r11v35 int) binds: [B:62:0x00e7, B:59:0x00d3, B:50:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r15v6 float) = (r15v4 float), (r15v5 float), (r15v3 float) binds: [B:62:0x00e7, B:59:0x00d3, B:50:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0145 A[PHI: r3 r12
  0x0145: PHI (r3v21 float) = (r3v19 float), (r3v20 float), (r3v18 float) binds: [B:96:0x016c, B:93:0x0156, B:86:0x013c] A[DONT_GENERATE, DONT_INLINE]
  0x0145: PHI (r12v25 int) = (r12v23 int), (r12v24 int), (r12v22 int) binds: [B:96:0x016c, B:93:0x0156, B:86:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    public final void r(int i) {
        hju0 hju0VarJ;
        String hexString;
        ArrayList arrayList;
        hju0 hju0VarA;
        float f;
        hju0 hju0VarH;
        hju0 hju0VarH2;
        int i2;
        int i3;
        hju0 hju0Var;
        hju0 hju0Var2;
        hju0 hju0Var3;
        int i4 = this.f;
        if (i4 != i) {
            hju0VarJ = j(i4);
            this.f = i;
        } else {
            hju0VarJ = null;
        }
        if (this.e == null || this.v || getWindowToken() == null) {
            return;
        }
        this.e.i(this);
        int i5 = this.w;
        int iMax = Math.max(0, this.f - i5);
        int iC = this.e.c();
        int iMin = Math.min(iC - 1, this.f + i5);
        if (iC != this.f45409a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            axq.r(this.f45409a, iC, ", found: ", " Pager id: ", sb);
            sb.append(hexString);
            sb.append(" Pager class: ");
            sb.append(getClass());
            sb.append(" Problematic adapter: ");
            itt0.n(sb, this.e.getClass());
            return;
        }
        int i6 = 0;
        while (true) {
            arrayList = this.b;
            if (i6 < arrayList.size()) {
                hju0VarA = (hju0) arrayList.get(i6);
                int i7 = hju0VarA.b;
                int i8 = this.f;
                if (i7 >= i8) {
                    if (i7 != i8) {
                        break;
                    } else {
                        break;
                    }
                }
                i6++;
            }
            hju0VarA = null;
            break;
        }
        if (hju0VarA == null && iC > 0) {
            hju0VarA = a(this.f, i6);
        }
        if (hju0VarA != null) {
            int i9 = i6 - 1;
            hju0 hju0Var4 = i9 >= 0 ? (hju0) arrayList.get(i9) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - hju0VarA.d);
            float f2 = 0.0f;
            for (int i10 = this.f - 1; i10 >= 0; i10--) {
                if (f2 < paddingLeft || i10 >= iMax) {
                    if (hju0Var4 == null || i10 != hju0Var4.b) {
                        f2 += a(i10, i9 + 1).d;
                        i6++;
                        if (i9 >= 0) {
                            hju0Var3 = (hju0) arrayList.get(i9);
                        } else {
                            hju0Var3 = null;
                        }
                    } else {
                        f2 += hju0Var4.d;
                        i9--;
                        if (i9 >= 0) {
                            hju0Var3 = (hju0) arrayList.get(i9);
                        } else {
                            hju0Var3 = null;
                        }
                    }
                    hju0Var4 = hju0Var3;
                } else {
                    if (hju0Var4 == null) {
                        break;
                    }
                    if (i10 == hju0Var4.b && !hju0Var4.c) {
                        arrayList.remove(i9);
                        this.e.a(this, i10, hju0Var4.f13178a);
                        i9--;
                        i6--;
                        if (i9 >= 0) {
                            hju0Var3 = (hju0) arrayList.get(i9);
                        } else {
                            hju0Var3 = null;
                        }
                        hju0Var4 = hju0Var3;
                    }
                }
            }
            f = 0.0f;
            float f3 = hju0VarA.d;
            int i11 = i6 + 1;
            if (f3 < 2.0f) {
                hju0 hju0Var5 = i11 < arrayList.size() ? (hju0) arrayList.get(i11) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i12 = i11;
                for (int i13 = this.f + 1; i13 < iC; i13++) {
                    if (f3 >= paddingRight && i13 > iMin) {
                        if (hju0Var5 == null) {
                            break;
                        }
                        if (i13 == hju0Var5.b && !hju0Var5.c) {
                            arrayList.remove(i12);
                            this.e.a(this, i13, hju0Var5.f13178a);
                            if (i12 < arrayList.size()) {
                                hju0Var5 = (hju0) arrayList.get(i12);
                            } else {
                                hju0Var5 = null;
                            }
                        }
                    } else if (hju0Var5 == null || i13 != hju0Var5.b) {
                        hju0 hju0VarA2 = a(i13, i12);
                        i12++;
                        f3 += hju0VarA2.d;
                        if (i12 < arrayList.size()) {
                            hju0Var5 = (hju0) arrayList.get(i12);
                        } else {
                            hju0Var5 = null;
                        }
                    } else {
                        f3 += hju0Var5.d;
                        i12++;
                        if (i12 < arrayList.size()) {
                            hju0Var5 = (hju0) arrayList.get(i12);
                        } else {
                            hju0Var5 = null;
                        }
                    }
                }
            }
            int iC2 = this.e.c();
            int clientWidth2 = getClientWidth();
            float f4 = clientWidth2 > 0 ? this.m / clientWidth2 : 0.0f;
            if (hju0VarJ != null) {
                int i14 = hju0VarJ.b;
                int i15 = hju0VarA.b;
                if (i14 < i15) {
                    float f5 = hju0VarJ.e + hju0VarJ.d + f4;
                    int i16 = i14 + 1;
                    int i17 = 0;
                    while (i16 <= hju0VarA.b && i17 < arrayList.size()) {
                        Object obj = arrayList.get(i17);
                        while (true) {
                            hju0Var2 = (hju0) obj;
                            if (i16 <= hju0Var2.b || i17 >= arrayList.size() - 1) {
                                break;
                            }
                            i17++;
                            obj = arrayList.get(i17);
                        }
                        while (i16 < hju0Var2.b) {
                            this.e.getClass();
                            f5 += 1.0f + f4;
                            i16++;
                        }
                        hju0Var2.e = f5;
                        f5 += hju0Var2.d + f4;
                        i16++;
                    }
                } else if (i14 > i15) {
                    int size = arrayList.size() - 1;
                    float f6 = hju0VarJ.e;
                    while (true) {
                        i14--;
                        if (i14 < hju0VarA.b || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            hju0Var = (hju0) obj2;
                            if (i14 >= hju0Var.b || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i14 > hju0Var.b) {
                            this.e.getClass();
                            f6 -= 1.0f + f4;
                            i14--;
                        }
                        f6 -= hju0Var.d + f4;
                        hju0Var.e = f6;
                    }
                }
            }
            int size2 = arrayList.size();
            float f7 = hju0VarA.e;
            int i18 = hju0VarA.b;
            int i19 = i18 - 1;
            this.q = i18 == 0 ? f7 : -3.4028235E38f;
            int i20 = iC2 - 1;
            this.r = i18 == i20 ? (hju0VarA.d + f7) - 1.0f : Float.MAX_VALUE;
            int i21 = i6 - 1;
            while (i21 >= 0) {
                hju0 hju0Var6 = (hju0) arrayList.get(i21);
                while (true) {
                    i3 = hju0Var6.b;
                    if (i19 <= i3) {
                        break;
                    }
                    i19--;
                    this.e.getClass();
                    f7 -= 1.0f + f4;
                }
                f7 -= hju0Var6.d + f4;
                hju0Var6.e = f7;
                if (i3 == 0) {
                    this.q = f7;
                }
                i21--;
                i19--;
            }
            float f8 = hju0VarA.e + hju0VarA.d + f4;
            int i22 = hju0VarA.b;
            while (true) {
                i22++;
                if (i11 >= size2) {
                    break;
                }
                hju0 hju0Var7 = (hju0) arrayList.get(i11);
                while (true) {
                    i2 = hju0Var7.b;
                    if (i22 >= i2) {
                        break;
                    }
                    i22++;
                    this.e.getClass();
                    f8 += 1.0f + f4;
                }
                if (i2 == i20) {
                    this.r = (hju0Var7.d + f8) - 1.0f;
                }
                hju0Var7.e = f8;
                f8 += hju0Var7.d + f4;
                i11++;
            }
            this.e.h(hju0VarA.f13178a);
        } else {
            f = 0.0f;
        }
        this.e.b();
        int childCount = getChildCount();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt = getChildAt(i23);
            iju0 iju0Var = (iju0) childAt.getLayoutParams();
            iju0Var.getClass();
            if (!iju0Var.f14895a && iju0Var.c == f && (hju0VarH2 = h(childAt)) != null) {
                iju0Var.c = hju0VarH2.d;
            }
        }
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                hju0VarH = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    hju0VarH = h(viewFindFocus);
                    break;
                } else {
                    if (parent == null || !(parent instanceof View)) {
                        hju0VarH = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }
            if (hju0VarH == null || hju0VarH.b != this.f) {
                for (int i24 = 0; i24 < getChildCount(); i24++) {
                    View childAt2 = getChildAt(i24);
                    hju0 hju0VarH3 = h(childAt2);
                    if (hju0VarH3 != null && hju0VarH3.b == this.f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.t) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.b.isEmpty()) {
            if (!this.j.isFinished()) {
                this.j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        hju0 hju0VarJ = j(this.f);
        int iMin = (int) ((hju0VarJ != null ? Math.min(hju0VarJ.e, this.r) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            d(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public void setAdapter(pj80 pj80Var) {
        ArrayList arrayList = this.b;
        pj80 pj80Var2 = this.e;
        if (pj80Var2 != null) {
            synchronized (pj80Var2) {
            }
            this.e.i(this);
            for (int i = 0; i < arrayList.size(); i++) {
                hju0 hju0Var = (hju0) arrayList.get(i);
                this.e.a(this, hju0Var.b, hju0Var.f13178a);
            }
            this.e.b();
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((iju0) getChildAt(i2).getLayoutParams()).f14895a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f = 0;
            scrollTo(0, 0);
        }
        this.e = pj80Var;
        this.f45409a = 0;
        if (pj80Var != null) {
            if (this.l == null) {
                this.l = new bwf(this, (byte) 3);
            }
            synchronized (this.e) {
            }
            this.v = false;
            boolean z = this.r1;
            this.r1 = true;
            this.f45409a = this.e.c();
            if (this.g >= 0) {
                this.e.f(this.h, this.i);
                v(this.g, 0, false, true);
                this.g = -1;
                this.h = null;
                this.i = null;
            } else if (z) {
                requestLayout();
            } else {
                q();
            }
        }
        ArrayList arrayList2 = this.w1;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.w1.size();
        for (int i3 = 0; i3 < size; i3++) {
            obo0 obo0Var = (obo0) this.w1.get(i3);
            TabLayout tabLayout = obo0Var.b;
            if (tabLayout.r1 == this) {
                tabLayout.k(pj80Var, obo0Var.f24992a);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.v = false;
        v(i, 0, !this.r1, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.w) {
            this.w = i;
            q();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(jju0 jju0Var) {
        this.v1 = jju0Var;
    }

    public void setPageMargin(int i) {
        int i2 = this.m;
        this.m = i;
        int width = getWidth();
        s(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.y1 == i) {
            return;
        }
        this.y1 = i;
        jju0 jju0Var = this.v1;
        if (jju0Var != null) {
            jju0Var.b(i);
        }
        ArrayList arrayList = this.u1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                jju0 jju0Var2 = (jju0) this.u1.get(i2);
                if (jju0Var2 != null) {
                    jju0Var2.b(i);
                }
            }
        }
    }

    public final boolean t() {
        this.j1 = -1;
        this.x = false;
        this.y = false;
        VelocityTracker velocityTracker = this.k1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.k1 = null;
        }
        this.p1.onRelease();
        this.q1.onRelease();
        return this.p1.isFinished() || this.q1.isFinished();
    }

    public final void u(int i, int i2, boolean z, boolean z2) {
        int iMax;
        int scrollX;
        int iAbs;
        hju0 hju0VarJ = j(i);
        if (hju0VarJ != null) {
            iMax = (int) (Math.max(this.q, Math.min(hju0VarJ.e, this.r)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (!z) {
            if (z2) {
                f(i);
            }
            d(false);
            scrollTo(iMax, 0);
            o(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.j;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                boolean z3 = this.k;
                Scroller scroller2 = this.j;
                scrollX = z3 ? scroller2.getCurrX() : scroller2.getStartX();
                this.j.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = iMax - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                d(false);
                q();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i6 = clientWidth / 2;
                float f = clientWidth;
                float f2 = i6;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                int iAbs2 = Math.abs(i2);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.e.getClass();
                    iAbs = (int) (((Math.abs(i4) / ((f * 1.0f) + this.m)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, Response.BUSY_EVERYWHERE);
                this.k = false;
                this.j.startScroll(i3, scrollY, i4, i5, iMin);
                WeakHashMap weakHashMap = rgu0.f30456a;
                postInvalidateOnAnimation();
            }
        }
        if (z2) {
            f(i);
        }
    }

    public final void v(int i, int i2, boolean z, boolean z2) {
        pj80 pj80Var = this.e;
        if (pj80Var == null || pj80Var.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.b;
        if (!z2 && this.f == i && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.e.c()) {
            i = this.e.c() - 1;
        }
        int i3 = this.w;
        int i4 = this.f;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((hju0) arrayList.get(i5)).c = true;
            }
        }
        boolean z3 = this.f != i;
        if (!this.r1) {
            r(i);
            u(i, i2, z, z3);
        } else {
            this.f = i;
            if (z3) {
                f(i);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.n;
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getDrawable(i));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList();
        this.c = new hju0();
        this.d = new Rect();
        this.g = -1;
        this.h = null;
        this.i = null;
        this.q = -3.4028235E38f;
        this.r = Float.MAX_VALUE;
        this.w = 1;
        this.j1 = -1;
        this.r1 = true;
        this.x1 = new fju0((Object) this, (byte) 0);
        this.y1 = 0;
        k();
    }
}
