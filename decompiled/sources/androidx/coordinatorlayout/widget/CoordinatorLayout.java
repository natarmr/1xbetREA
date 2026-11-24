package androidx.coordinatorlayout.widget;

import a.ale;
import a.ali;
import a.ble;
import a.bwa0;
import a.cle;
import a.e9d0;
import a.eld0;
import a.gqd0;
import a.igu0;
import a.jf4;
import a.jk50;
import a.kk50;
import a.lhu0;
import a.lrc;
import a.nuj0;
import a.rgu0;
import a.vt5;
import a.xiv0;
import a.xke;
import a.yke;
import a.zke;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements jk50, kk50 {
    public static final String t;
    public static final Class[] u;
    public static final ThreadLocal v;
    public static final vt5 w;
    public static final bwa0 x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f45353a;
    public final ali b;
    public final ArrayList c;
    public final int[] d;
    public final int[] e;
    public final int[] f;
    public boolean g;
    public boolean h;
    public final int[] i;
    public View j;
    public View k;
    public cle l;
    public boolean m;
    public xiv0 n;
    public boolean o;
    public Drawable p;
    public ViewGroup.OnHierarchyChangeListener q;
    public lrc r;
    public final eld0 s;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public SparseArray c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.c = new SparseArray(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.c.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.c.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.c.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        t = r0 != null ? r0.getName() : null;
        w = new vt5((byte) 11);
        u = new Class[]{Context.class, AttributeSet.class};
        v = new ThreadLocal();
        x = new bwa0(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f45353a = new ArrayList();
        this.b = new ali();
        this.c = new ArrayList();
        this.d = new int[2];
        this.e = new int[2];
        this.f = new int[2];
        this.s = new eld0((byte) 9);
        int[] iArr = gqd0.f11728a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        rgu0.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.i = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.i;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.p = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        z();
        super.setOnHierarchyChangeListener(new ale(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) x.a();
        return rect == null ? new Rect() : rect;
    }

    private int getFullContentHeight() {
        int height = 0;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            ble bleVar = (ble) childAt.getLayoutParams();
            height += childAt.getHeight() + ((ViewGroup.MarginLayoutParams) bleVar).topMargin + ((ViewGroup.MarginLayoutParams) bleVar).bottomMargin;
        }
        return height;
    }

    public static void l(int i, Rect rect, Rect rect2, ble bleVar, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = bleVar.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = bleVar.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ble n(View view) {
        ble bleVar = (ble) view.getLayoutParams();
        if (!bleVar.b) {
            if (view instanceof xke) {
                yke ykeVarMo39getBehavior = ((xke) view).mo39getBehavior();
                if (ykeVarMo39getBehavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                bleVar.b(ykeVarMo39getBehavior);
                bleVar.b = true;
                return bleVar;
            }
            zke zkeVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                zkeVar = (zke) superclass.getAnnotation(zke.class);
                if (zkeVar != null) {
                    break;
                }
            }
            if (zkeVar != null) {
                try {
                    bleVar.b((yke) zkeVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + zkeVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            bleVar.b = true;
        }
        return bleVar;
    }

    public static void x(View view, int i) {
        ble bleVar = (ble) view.getLayoutParams();
        int i2 = bleVar.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = rgu0.f30456a;
            view.offsetLeftAndRight(i - i2);
            bleVar.i = i;
        }
    }

    public static void y(View view, int i) {
        ble bleVar = (ble) view.getLayoutParams();
        int i2 = bleVar.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = rgu0.f30456a;
            view.offsetTopAndBottom(i - i2);
            bleVar.j = i;
        }
    }

    @Override // a.jk50
    public final void b(View view, View view2, int i, int i2) {
        eld0 eld0Var = this.s;
        if (i2 == 1) {
            eld0Var.c = i;
        } else {
            eld0Var.b = i;
        }
        this.k = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((ble) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // a.jk50
    public final void c(View view, int i) {
        eld0 eld0Var = this.s;
        if (i == 1) {
            eld0Var.c = 0;
        } else {
            eld0Var.b = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            ble bleVar = (ble) childAt.getLayoutParams();
            if (bleVar.a(i)) {
                yke ykeVar = bleVar.f2790a;
                if (ykeVar != null) {
                    ykeVar.v(this, childAt, view, i);
                }
                if (i == 0) {
                    bleVar.m = false;
                } else if (i == 1) {
                    bleVar.n = false;
                }
                bleVar.o = false;
            }
        }
        this.k = null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof ble) && super.checkLayoutParams(layoutParams);
    }

    @Override // a.jk50
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        yke ykeVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ble bleVar = (ble) childAt.getLayoutParams();
                if (bleVar.a(i3) && (ykeVar = bleVar.f2790a) != null) {
                    int[] iArr2 = this.d;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ykeVar.p(i, i2, i3, childAt, view, this, iArr2);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!zDispatchKeyEvent && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? p(-getHeight()) : p(-((int) (getHeight() * 0.2f)));
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? p(getHeight()) : p((int) (getHeight() * 0.2f));
            }
            if (keyCode == 62) {
                return keyEvent.isShiftPressed() ? p(-getFullContentHeight()) : p(getFullContentHeight() - getHeight());
            }
            if (keyCode == 92) {
                return p(-getHeight());
            }
            if (keyCode == 93) {
                return p(getHeight());
            }
            if (keyCode == 122) {
                return p(-getFullContentHeight());
            }
            if (keyCode == 123) {
                return p(getFullContentHeight() - getHeight());
            }
        }
        return zDispatchKeyEvent;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        yke ykeVar = ((ble) view.getLayoutParams()).f2790a;
        if (ykeVar != null) {
            ykeVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void e(ble bleVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) bleVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) bleVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) bleVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) bleVar).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public final void f(View view) {
        ArrayList arrayList = (ArrayList) ((nuj0) this.b.b).get(view);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View view2 = (View) arrayList.get(i);
            yke ykeVar = ((ble) view2.getLayoutParams()).f2790a;
            if (ykeVar != null) {
                ykeVar.h(this, view2, view);
            }
        }
    }

    @Override // a.kk50
    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        yke ykeVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                ble bleVar = (ble) childAt.getLayoutParams();
                if (bleVar.a(i5) && (ykeVar = bleVar.f2790a) != null) {
                    int[] iArr2 = this.d;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ykeVar.q(i2, i3, i4, childAt, view, this, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ble(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ble) {
            return new ble((ble) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ble((ViewGroup.MarginLayoutParams) layoutParams) : new ble(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        v();
        return Collections.unmodifiableList(this.f45353a);
    }

    public final xiv0 getLastWindowInsets() {
        return this.n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        eld0 eld0Var = this.s;
        return eld0Var.c | eld0Var.b;
    }

    public Drawable getStatusBarBackground() {
        return this.p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // a.jk50
    public final void h(View view, int i, int i2, int i3, int i4, int i5) {
        g(view, i, i2, i3, i4, 0, this.e);
    }

    @Override // a.jk50
    public final boolean i(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                ble bleVar = (ble) childAt.getLayoutParams();
                yke ykeVar = bleVar.f2790a;
                if (ykeVar != null) {
                    boolean zU = ykeVar.u(this, childAt, view, view2, i, i2);
                    z |= zU;
                    if (i2 == 0) {
                        bleVar.m = zU;
                    } else if (i2 == 1) {
                        bleVar.n = zU;
                    }
                } else if (i2 == 0) {
                    bleVar.m = false;
                } else if (i2 == 1) {
                    bleVar.n = false;
                }
            }
        }
        return z;
    }

    public final void j(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            lhu0.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final List k(View view) {
        nuj0 nuj0Var = (nuj0) this.b.b;
        int i = nuj0Var.c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) nuj0Var.j(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(nuj0Var.f(i2));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public final int m(int i) {
        int[] iArr = this.i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i, int i2) {
        bwa0 bwa0Var = x;
        Rect rectA = a();
        lhu0.a(this, view, rectA);
        try {
            return rectA.contains(i, i2);
        } finally {
            rectA.setEmpty();
            bwa0Var.c(rectA);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
        if (this.m) {
            if (this.l == null) {
                this.l = new cle(this, (byte) 0);
            }
            getViewTreeObserver().addOnPreDrawListener(this.l);
        }
        if (this.n == null) {
            WeakHashMap weakHashMap = rgu0.f30456a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w();
        if (this.m && this.l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.l);
        }
        View view = this.k;
        if (view != null) {
            c(view, 0);
        }
        this.h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.o || this.p == null) {
            return;
        }
        xiv0 xiv0Var = this.n;
        int iD = xiv0Var != null ? xiv0Var.d() : 0;
        if (iD > 0) {
            this.p.setBounds(0, 0, getWidth(), iD);
            this.p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            w();
        }
        boolean zU = u(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zU;
        }
        this.j = null;
        w();
        return zU;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        yke ykeVar;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f45353a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((ykeVar = ((ble) view.getLayoutParams()).f2790a) == null || !ykeVar.l(this, view, layoutDirection))) {
                r(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0134  */
    /* JADX WARN: Code duplicated, block: B:72:0x015f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0169  */
    /* JADX WARN: Code duplicated, block: B:78:0x0188  */
    /* JADX WARN: Code duplicated, block: B:79:0x018b  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        yke ykeVar;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        ArrayList arrayList;
        int i10;
        View view;
        int i11;
        boolean zM;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.v();
        int childCount = coordinatorLayout.getChildCount();
        int i12 = 0;
        loop0: while (true) {
            if (i12 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i12);
            nuj0 nuj0Var = (nuj0) coordinatorLayout.b.b;
            int i13 = nuj0Var.c;
            for (int i14 = 0; i14 < i13; i14++) {
                ArrayList arrayList2 = (ArrayList) nuj0Var.j(i14);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i12++;
        }
        if (z != coordinatorLayout.m) {
            boolean z4 = coordinatorLayout.h;
            if (z) {
                if (z4) {
                    if (coordinatorLayout.l == null) {
                        coordinatorLayout.l = new cle(coordinatorLayout, (byte) 0);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.l);
                }
                coordinatorLayout.m = true;
            } else {
                if (z4 && coordinatorLayout.l != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.l);
                }
                coordinatorLayout.m = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z5 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i15 = paddingLeft + paddingRight;
        int i16 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        if (coordinatorLayout.n != null) {
            WeakHashMap weakHashMap = rgu0.f30456a;
            if (coordinatorLayout.getFitsSystemWindows()) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        ArrayList arrayList3 = coordinatorLayout.f45353a;
        int size3 = arrayList3.size();
        int i17 = 0;
        int iCombineMeasuredStates = 0;
        while (i17 < size3) {
            View view2 = (View) arrayList3.get(i17);
            int i18 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i4 = size3;
                i11 = i17;
                i6 = paddingLeft;
                suggestedMinimumWidth = i18;
                z3 = false;
                i8 = paddingRight;
            } else {
                ble bleVar = (ble) view2.getLayoutParams();
                int i19 = bleVar.e;
                if (i19 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int iM = coordinatorLayout.m(i19);
                    int i20 = bleVar.c;
                    if (i20 == 0) {
                        i20 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z5) && !(absoluteGravity == 5 && z5)) {
                        if ((absoluteGravity == 5 && !z5) || (absoluteGravity == 3 && z5)) {
                            iMax = Math.max(0, iM - paddingLeft);
                        }
                        if (z2) {
                            WeakHashMap weakHashMap2 = rgu0.f30456a;
                            if (view2.getFitsSystemWindows()) {
                                iMakeMeasureSpec = i;
                                iMakeMeasureSpec2 = i2;
                            } else {
                                int iC = coordinatorLayout.n.c() + coordinatorLayout.n.b();
                                int iA = coordinatorLayout.n.a() + coordinatorLayout.n.d();
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                            }
                        } else {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        }
                        ykeVar = bleVar.f2790a;
                        if (ykeVar != null) {
                            z3 = false;
                            i6 = paddingLeft;
                            i7 = i18;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            int i21 = iMakeMeasureSpec;
                            i11 = i17;
                            int i22 = iMakeMeasureSpec2;
                            zM = ykeVar.m(this, view2, i21, i5, i22);
                            view = view2;
                            iMakeMeasureSpec = i21;
                            i10 = i22;
                            if (zM) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) bleVar).leftMargin + ((ViewGroup.MarginLayoutParams) bleVar).rightMargin);
                            int iMax3 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) bleVar).topMargin + ((ViewGroup.MarginLayoutParams) bleVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            i6 = paddingLeft;
                            i7 = i18;
                            z3 = false;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            i10 = iMakeMeasureSpec2;
                            view = view2;
                            i11 = i17;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) bleVar).leftMargin + ((ViewGroup.MarginLayoutParams) bleVar).rightMargin);
                        int iMax5 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) bleVar).topMargin + ((ViewGroup.MarginLayoutParams) bleVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iM);
                    }
                    int i23 = size3;
                    i5 = iMax;
                    i4 = i23;
                    if (z2) {
                        WeakHashMap weakHashMap3 = rgu0.f30456a;
                        if (view2.getFitsSystemWindows()) {
                            int iC2 = coordinatorLayout.n.c() + coordinatorLayout.n.b();
                            int iA2 = coordinatorLayout.n.a() + coordinatorLayout.n.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC2, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA2, mode2);
                        } else {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        }
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                    ykeVar = bleVar.f2790a;
                    if (ykeVar != null) {
                        z3 = false;
                        i6 = paddingLeft;
                        i7 = i18;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        int i24 = iMakeMeasureSpec;
                        i11 = i17;
                        int i25 = iMakeMeasureSpec2;
                        zM = ykeVar.m(this, view2, i24, i5, i25);
                        view = view2;
                        iMakeMeasureSpec = i24;
                        i10 = i25;
                        if (zM) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) bleVar).leftMargin + ((ViewGroup.MarginLayoutParams) bleVar).rightMargin);
                        int iMax7 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) bleVar).topMargin + ((ViewGroup.MarginLayoutParams) bleVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        i6 = paddingLeft;
                        i7 = i18;
                        z3 = false;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        i10 = iMakeMeasureSpec2;
                        view = view2;
                        i11 = i17;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) bleVar).leftMargin + ((ViewGroup.MarginLayoutParams) bleVar).rightMargin);
                    int iMax9 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) bleVar).topMargin + ((ViewGroup.MarginLayoutParams) bleVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i4 = size3;
                i5 = 0;
                if (z2) {
                    WeakHashMap weakHashMap4 = rgu0.f30456a;
                    if (view2.getFitsSystemWindows()) {
                        int iC3 = coordinatorLayout.n.c() + coordinatorLayout.n.b();
                        int iA3 = coordinatorLayout.n.a() + coordinatorLayout.n.d();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC3, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA3, mode2);
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                ykeVar = bleVar.f2790a;
                if (ykeVar != null) {
                    z3 = false;
                    i6 = paddingLeft;
                    i7 = i18;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    int i26 = iMakeMeasureSpec;
                    i11 = i17;
                    int i27 = iMakeMeasureSpec2;
                    zM = ykeVar.m(this, view2, i26, i5, i27);
                    view = view2;
                    iMakeMeasureSpec = i26;
                    i10 = i27;
                    if (zM) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) bleVar).leftMargin + ((ViewGroup.MarginLayoutParams) bleVar).rightMargin);
                    int iMax11 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) bleVar).topMargin + ((ViewGroup.MarginLayoutParams) bleVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    i6 = paddingLeft;
                    i7 = i18;
                    z3 = false;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    i10 = iMakeMeasureSpec2;
                    view = view2;
                    i11 = i17;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) bleVar).leftMargin + ((ViewGroup.MarginLayoutParams) bleVar).rightMargin);
                int iMax13 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) bleVar).topMargin + ((ViewGroup.MarginLayoutParams) bleVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i17 = i11 + 1;
            paddingLeft = i6;
            paddingRight = i8;
            size3 = i4;
            arrayList3 = arrayList;
        }
        int i28 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i28), View.resolveSizeAndState(suggestedMinimumHeight, i2, i28 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        yke ykeVar;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                ble bleVar = (ble) childAt.getLayoutParams();
                if (bleVar.a(0) && (ykeVar = bleVar.f2790a) != null) {
                    ykeVar.n(this, childAt, view);
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        yke ykeVar;
        int childCount = getChildCount();
        boolean zO = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                ble bleVar = (ble) childAt.getLayoutParams();
                if (bleVar.a(0) && (ykeVar = bleVar.f2790a) != null) {
                    zO |= ykeVar.o(this, childAt, view, f2);
                }
            }
        }
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        d(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        h(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        b(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f45367a);
        SparseArray sparseArray = savedState.c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            yke ykeVar = n(childAt).f2790a;
            if (id != -1 && ykeVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                ykeVar.s(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableT;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            yke ykeVar = ((ble) childAt.getLayoutParams()).f2790a;
            if (id != -1 && ykeVar != null && (parcelableT = ykeVar.t(childAt)) != null) {
                sparseArray.append(id, parcelableT);
            }
        }
        savedState.c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return i(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zU;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.j;
        boolean z = false;
        if (view != null) {
            yke ykeVar = ((ble) view.getLayoutParams()).f2790a;
            zU = ykeVar != null ? ykeVar.w(this, this.j, motionEvent) : false;
        } else {
            zU = u(motionEvent, 1);
            if (actionMasked != 0 && zU) {
                z = true;
            }
        }
        if (this.j == null || actionMasked == 3) {
            zU |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            super.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zU;
        }
        this.j = null;
        w();
        return zU;
    }

    public final boolean p(int i) {
        View view;
        View focusedChild = this;
        while (true) {
            if (focusedChild == null) {
                view = null;
                break;
            }
            if (focusedChild.isFocused()) {
                view = focusedChild;
                break;
            }
            focusedChild = focusedChild instanceof ViewGroup ? ((ViewGroup) focusedChild).getFocusedChild() : null;
        }
        i(this, view, 2, 1);
        d(view, 0, i, this.f, 1);
        int[] iArr = this.f;
        int i2 = iArr[1];
        iArr[0] = 0;
        iArr[1] = 0;
        g(view, 0, i2, 0, i, 1, iArr);
        c(view, 1);
        return iArr[1] > 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00dc  */
    public final void q(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean zH;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        int i10;
        View view;
        ble bleVar;
        yke ykeVar;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f45353a;
        int size = arrayList2.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        int i11 = 0;
        while (true) {
            bwa0 bwa0Var = x;
            if (i11 >= size) {
                Rect rect2 = rectA3;
                rectA.setEmpty();
                bwa0Var.c(rectA);
                rectA2.setEmpty();
                bwa0Var.c(rectA2);
                rect2.setEmpty();
                bwa0Var.c(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i11);
            ble bleVar2 = (ble) view2.getLayoutParams();
            if (i != 0 || view2.getVisibility() != 8) {
                int i12 = 0;
                while (i12 < i11) {
                    if (bleVar2.l == ((View) arrayList2.get(i12))) {
                        ble bleVar3 = (ble) view2.getLayoutParams();
                        if (bleVar3.k != null) {
                            Rect rectA4 = a();
                            Rect rectA5 = a();
                            ble bleVar4 = bleVar2;
                            Rect rectA6 = a();
                            lhu0.a(this, bleVar3.k, rectA4);
                            j(view2, rectA5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            i10 = i12;
                            layoutDirection = layoutDirection;
                            bleVar = bleVar4;
                            view = view3;
                            l(layoutDirection, rectA4, rectA6, bleVar3, measuredWidth, measuredHeight);
                            boolean z3 = (rectA6.left == rectA5.left && rectA6.top == rectA5.top) ? false : true;
                            e(bleVar3, rectA6, measuredWidth, measuredHeight);
                            int i13 = rectA6.left - rectA5.left;
                            int i14 = rectA6.top - rectA5.top;
                            if (i13 != 0) {
                                WeakHashMap weakHashMap = rgu0.f30456a;
                                view.offsetLeftAndRight(i13);
                            }
                            if (i14 != 0) {
                                WeakHashMap weakHashMap2 = rgu0.f30456a;
                                view.offsetTopAndBottom(i14);
                            }
                            if (z3 && (ykeVar = bleVar3.f2790a) != null) {
                                ykeVar.h(this, view, bleVar3.k);
                            }
                            rectA4.setEmpty();
                            bwa0Var.c(rectA4);
                            rectA5.setEmpty();
                            bwa0Var.c(rectA5);
                            rectA6.setEmpty();
                            bwa0Var.c(rectA6);
                        } else {
                            i10 = i12;
                            view = view2;
                            bleVar = bleVar2;
                        }
                    } else {
                        i10 = i12;
                        view = view2;
                        bleVar = bleVar2;
                    }
                    i12 = i10 + 1;
                    bleVar2 = bleVar;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i11 = i11;
                    rectA3 = rectA3;
                }
                ArrayList arrayList3 = arrayList2;
                int i15 = size;
                Rect rect3 = rectA3;
                i2 = i11;
                View view4 = view2;
                ble bleVar5 = bleVar2;
                j(view4, rectA2, true);
                if (bleVar5.g != 0 && !rectA2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(bleVar5.g, layoutDirection);
                    int i16 = absoluteGravity & 112;
                    if (i16 == 48) {
                        rectA.top = Math.max(rectA.top, rectA2.bottom);
                    } else if (i16 == 80) {
                        rectA.bottom = Math.max(rectA.bottom, getHeight() - rectA2.top);
                    }
                    int i17 = absoluteGravity & 7;
                    if (i17 == 3) {
                        rectA.left = Math.max(rectA.left, rectA2.right);
                    } else if (i17 == 5) {
                        rectA.right = Math.max(rectA.right, getWidth() - rectA2.left);
                    }
                }
                if (bleVar5.h != 0 && view4.getVisibility() == 0 && view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                    ble bleVar6 = (ble) view4.getLayoutParams();
                    yke ykeVar2 = bleVar6.f2790a;
                    Rect rectA7 = a();
                    Rect rectA8 = a();
                    rectA8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                    if (ykeVar2 == null || !ykeVar2.e(rectA7, view4)) {
                        rectA7.set(rectA8);
                    } else if (!rectA8.contains(rectA7)) {
                        throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA7.toShortString() + " | Bounds:" + rectA8.toShortString());
                    }
                    rectA8.setEmpty();
                    bwa0Var.c(rectA8);
                    if (rectA7.isEmpty()) {
                        rectA7.setEmpty();
                        bwa0Var.c(rectA7);
                    } else {
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(bleVar6.h, layoutDirection);
                        if ((absoluteGravity2 & 48) != 48 || (i8 = (rectA7.top - ((ViewGroup.MarginLayoutParams) bleVar6).topMargin) - bleVar6.j) >= (i9 = rectA.top)) {
                            z = false;
                        } else {
                            y(view4, i9 - i8);
                            z = true;
                        }
                        if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectA7.bottom) - ((ViewGroup.MarginLayoutParams) bleVar6).bottomMargin) + bleVar6.j) < (i7 = rectA.bottom)) {
                            y(view4, height - i7);
                            z = true;
                        }
                        if (!z) {
                            y(view4, 0);
                        }
                        if ((absoluteGravity2 & 3) != 3 || (i5 = (rectA7.left - ((ViewGroup.MarginLayoutParams) bleVar6).leftMargin) - bleVar6.i) >= (i6 = rectA.left)) {
                            z2 = false;
                        } else {
                            x(view4, i6 - i5);
                            z2 = true;
                        }
                        if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectA7.right) - ((ViewGroup.MarginLayoutParams) bleVar6).rightMargin) + bleVar6.i) < (i4 = rectA.right)) {
                            x(view4, width - i4);
                            z2 = true;
                        }
                        if (!z2) {
                            x(view4, 0);
                        }
                        rectA7.setEmpty();
                        bwa0Var.c(rectA7);
                    }
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((ble) view4.getLayoutParams()).p);
                    if (rect.equals(rectA2)) {
                        arrayList = arrayList3;
                        i3 = i15;
                    } else {
                        ((ble) view4.getLayoutParams()).p.set(rectA2);
                    }
                } else {
                    rect = rect3;
                }
                int i18 = i2 + 1;
                i3 = i15;
                while (true) {
                    arrayList = arrayList3;
                    if (i18 >= i3) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i18);
                    ble bleVar7 = (ble) view5.getLayoutParams();
                    yke ykeVar3 = bleVar7.f2790a;
                    if (ykeVar3 != null && ykeVar3.f(this, view5, view4)) {
                        if (i == 0 && bleVar7.o) {
                            bleVar7.o = false;
                        } else {
                            if (i != 2) {
                                zH = ykeVar3.h(this, view5, view4);
                            } else {
                                ykeVar3.i(this, view4);
                                zH = true;
                            }
                            if (i == 1) {
                                bleVar7.o = zH;
                            }
                        }
                    }
                    i18++;
                    arrayList3 = arrayList;
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                rect = rectA3;
                i2 = i11;
            }
            i11 = i2 + 1;
            rectA3 = rect;
            size = i3;
            arrayList2 = arrayList;
        }
    }

    public final void r(View view, int i) {
        int i2;
        ble bleVar = (ble) view.getLayoutParams();
        View view2 = bleVar.k;
        if (view2 == null && bleVar.f != -1) {
            jf4.n("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        bwa0 bwa0Var = x;
        if (view2 != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            try {
                lhu0.a(this, view2, rectA);
                ble bleVar2 = (ble) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, rectA, rectA2, bleVar2, measuredWidth, measuredHeight);
                e(bleVar2, rectA2, measuredWidth, measuredHeight);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                rectA.setEmpty();
                bwa0Var.c(rectA);
                rectA2.setEmpty();
                bwa0Var.c(rectA2);
            }
        }
        int i3 = bleVar.e;
        if (i3 < 0) {
            ble bleVar3 = (ble) view.getLayoutParams();
            Rect rectA3 = a();
            rectA3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) bleVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) bleVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) bleVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) bleVar3).bottomMargin);
            if (this.n != null) {
                WeakHashMap weakHashMap = rgu0.f30456a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectA3.left = this.n.b() + rectA3.left;
                    rectA3.top = this.n.d() + rectA3.top;
                    rectA3.right -= this.n.c();
                    rectA3.bottom -= this.n.a();
                }
            }
            Rect rectA4 = a();
            int i4 = bleVar3.c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA3, rectA4, i);
            view.layout(rectA4.left, rectA4.top, rectA4.right, rectA4.bottom);
            rectA3.setEmpty();
            bwa0Var.c(rectA3);
            rectA4.setEmpty();
            bwa0Var.c(rectA4);
            return;
        }
        ble bleVar4 = (ble) view.getLayoutParams();
        int i5 = bleVar4.c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iM = m(i3) - measuredWidth2;
        if (i6 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iM += measuredWidth2;
        }
        if (i7 != 16) {
            i2 = i7 != 80 ? 0 : measuredHeight2;
        } else {
            i2 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) bleVar4).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) bleVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) bleVar4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) bleVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        yke ykeVar = ((ble) view.getLayoutParams()).f2790a;
        if (ykeVar == null || !ykeVar.r(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.g) {
            return;
        }
        if (this.j == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                yke ykeVar = ((ble) childAt.getLayoutParams()).f2790a;
                if (ykeVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    ykeVar.k(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        w();
        this.g = true;
    }

    public final void s(int i, int i2, int i3, View view) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        z();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.p.setState(getDrawableState());
                }
                this.p.setLayoutDirection(getLayoutDirection());
                this.p.setVisible(getVisibility() == 0, false);
                this.p.setCallback(this);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.p;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.p.setVisible(z, false);
    }

    public final boolean t(yke ykeVar, View view, MotionEvent motionEvent, int i) {
        if (i == 0) {
            return ykeVar.k(this, view, motionEvent);
        }
        if (i == 1) {
            return ykeVar.w(this, view, motionEvent);
        }
        e9d0.o();
        return false;
    }

    public final boolean u(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        vt5 vt5Var = w;
        if (vt5Var != null) {
            Collections.sort(arrayList, vt5Var);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zT = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            yke ykeVar = ((ble) view.getLayoutParams()).f2790a;
            if (zT && actionMasked != 0) {
                if (ykeVar != null) {
                    if (motionEventObtain == null) {
                        motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(3);
                    }
                    t(ykeVar, view, motionEventObtain, i);
                }
            } else if (!zT && ykeVar != null && (zT = t(ykeVar, view, motionEvent, i))) {
                this.j = view;
                if (actionMasked != 3 && actionMasked != 1) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        View view2 = (View) arrayList.get(i4);
                        yke ykeVar2 = ((ble) view2.getLayoutParams()).f2790a;
                        if (ykeVar2 != null) {
                            if (motionEventObtain == null) {
                                motionEventObtain = MotionEvent.obtain(motionEvent);
                                motionEventObtain.setAction(3);
                            }
                            t(ykeVar2, view2, motionEventObtain, i);
                        }
                    }
                }
            }
        }
        arrayList.clear();
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        return zT;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0093
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void v() {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.v():void");
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }

    public final void w() {
        View view = this.j;
        if (view != null) {
            yke ykeVar = ((ble) view.getLayoutParams()).f2790a;
            if (ykeVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                ykeVar.w(this, this.j, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.j = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((ble) getChildAt(i).getLayoutParams()).getClass();
        }
        this.g = false;
    }

    public final void z() {
        WeakHashMap weakHashMap = rgu0.f30456a;
        if (!getFitsSystemWindows()) {
            igu0.c(this, null);
            return;
        }
        lrc lrcVar = this.r;
        if (lrcVar == null) {
            lrcVar = new lrc((Object) this, (byte) 8);
            this.r = lrcVar;
        }
        igu0.c(this, lrcVar);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ble(getContext(), attributeSet);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }
}
