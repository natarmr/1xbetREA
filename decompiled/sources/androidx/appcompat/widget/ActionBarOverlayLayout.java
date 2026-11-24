package androidx.appcompat.widget;

import a.ai;
import a.b040;
import a.bi;
import a.bku0;
import a.blj;
import a.eiv0;
import a.eld0;
import a.epv0;
import a.fiv0;
import a.fwq0;
import a.giv0;
import a.hiv0;
import a.igu0;
import a.iiv0;
import a.jf4;
import a.jiv0;
import a.jk50;
import a.kiv0;
import a.kk50;
import a.liv0;
import a.ox30;
import a.pfx;
import a.qhv0;
import a.rgu0;
import a.rwq0;
import a.uiv0;
import a.xh;
import a.xi;
import a.xiv0;
import a.yh;
import a.zh;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements jk50, kk50 {
    public static final int[] i1 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final xiv0 j1;
    public static final Rect k1;
    public final xh A;
    public final yh B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45287a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public blj e;
    public Drawable f;
    public final yh f1;
    public boolean g;
    public final eld0 g1;
    public boolean h;
    public final bi h1;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public final Rect m;
    public final Rect n;
    public final Rect o;
    public final Rect p;
    public final Rect q;
    public boolean r;
    public boolean s;
    public xiv0 t;
    public xiv0 u;
    public xiv0 v;
    public xiv0 w;
    public zh x;
    public OverScroller y;
    public ViewPropertyAnimator z;

    static {
        liv0 fiv0Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            fiv0Var = new kiv0();
        } else if (i >= 35) {
            fiv0Var = new jiv0();
        } else if (i >= 34) {
            fiv0Var = new iiv0();
        } else if (i >= 31) {
            fiv0Var = new hiv0();
        } else if (i >= 30) {
            fiv0Var = new giv0();
        } else {
            fiv0Var = i >= 29 ? new fiv0() : new eiv0();
        }
        fiv0Var.h(pfx.c(0, 1, 0, 1));
        j1 = fiv0Var.b();
        k1 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.m = new Rect();
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = true;
        this.s = false;
        xiv0 xiv0Var = xiv0.b;
        this.t = xiv0Var;
        this.u = xiv0Var;
        this.v = xiv0Var;
        this.w = xiv0Var;
        this.A = new xh(this, (byte) 0);
        this.B = new yh(this, (byte) 0);
        this.f1 = new yh(this, (byte) 1);
        e(context);
        this.g1 = new eld0((byte) 9);
        bi biVar = new bi(context);
        biVar.setWillNotDraw(true);
        this.h1 = biVar;
        addView(biVar);
    }

    public static boolean k(View view, int i, int i2, int i3, int i4) {
        boolean z;
        ai aiVar = (ai) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) aiVar).leftMargin != i) {
            ((ViewGroup.MarginLayoutParams) aiVar).leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (((ViewGroup.MarginLayoutParams) aiVar).topMargin != i2) {
            ((ViewGroup.MarginLayoutParams) aiVar).topMargin = i2;
            z = true;
        }
        if (((ViewGroup.MarginLayoutParams) aiVar).rightMargin != i3) {
            ((ViewGroup.MarginLayoutParams) aiVar).rightMargin = i3;
            z = true;
        }
        if (((ViewGroup.MarginLayoutParams) aiVar).bottomMargin == i4) {
            return z;
        }
        ((ViewGroup.MarginLayoutParams) aiVar).bottomMargin = i4;
        return true;
    }

    public final void a() {
        removeCallbacks(this.B);
        removeCallbacks(this.f1);
        ViewPropertyAnimator viewPropertyAnimator = this.z;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // a.jk50
    public final void b(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // a.jk50
    public final void c(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ai;
    }

    @Override // a.jk50
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f != null) {
            if (this.d.getVisibility() == 0) {
                translationY = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f.setBounds(0, translationY, getWidth(), this.f.getIntrinsicHeight() + translationY);
            this.f.draw(canvas);
        }
    }

    public final void e(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(i1);
        this.f45287a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.y = new OverScroller(context);
    }

    public final void f(int i) {
        j();
        if (i == 2) {
            ((rwq0) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((rwq0) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // a.kk50
    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        h(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ai(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ai(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        eld0 eld0Var = this.g1;
        return eld0Var.c | eld0Var.b;
    }

    public CharSequence getTitle() {
        j();
        return ((rwq0) this.e).f31228a.getTitle();
    }

    @Override // a.jk50
    public final void h(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // a.jk50
    public final boolean i(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final void j() {
        blj wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof blj) {
                wrapper = (blj) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    jf4.n("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    public final void l(ox30 ox30Var, b040 b040Var) {
        j();
        rwq0 rwq0Var = (rwq0) this.e;
        Toolbar toolbar = rwq0Var.f31228a;
        xi xiVar = rwq0Var.m;
        if (xiVar == null) {
            xiVar = new xi(toolbar.getContext());
            rwq0Var.m = xiVar;
        }
        xiVar.e = b040Var;
        if (ox30Var == null && toolbar.f45299a == null) {
            return;
        }
        toolbar.f();
        ox30 ox30Var2 = toolbar.f45299a.p;
        if (ox30Var2 == ox30Var) {
            return;
        }
        if (ox30Var2 != null) {
            ox30Var2.r(toolbar.o1);
            ox30Var2.r(toolbar.p1);
        }
        if (toolbar.p1 == null) {
            toolbar.p1 = new fwq0(toolbar);
        }
        xiVar.q = true;
        Context context = toolbar.j;
        if (ox30Var != null) {
            ox30Var.b(xiVar, context);
            ox30Var.b(toolbar.p1, toolbar.j);
        } else {
            xiVar.a(context, null);
            toolbar.p1.a(toolbar.j, null);
            xiVar.e();
            toolbar.p1.e();
        }
        toolbar.f45299a.setPopupTheme(toolbar.k);
        toolbar.f45299a.setPresenter(xiVar);
        toolbar.o1 = xiVar;
        toolbar.t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean zK;
        j();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        boolean z = true;
        boolean z2 = (windowSystemUiVisibility & 256) != 0;
        boolean z3 = (windowSystemUiVisibility & 1536) != 0;
        WeakHashMap weakHashMap = rgu0.f30456a;
        bi biVar = this.h1;
        xiv0 xiv0Var = j1;
        Rect rect = this.q;
        igu0.b(biVar, xiv0Var, rect);
        boolean zEquals = rect.equals(k1);
        this.r = !zEquals;
        boolean z4 = zEquals || (z2 && z3);
        this.s = z4;
        zh zhVar = this.x;
        if (zhVar != null) {
            ((qhv0) zhVar).o = (z2 || z4) ? false : true;
        }
        xiv0 xiv0VarH = xiv0.h(windowInsets, this);
        uiv0 uiv0Var = xiv0VarH.f40966a;
        pfx pfxVarN = uiv0Var.n();
        int i = pfxVarN.f26926a;
        int i2 = pfxVarN.f26926a;
        int i3 = pfxVarN.b;
        int i4 = pfxVarN.c;
        this.p.set(i, i3, i4, pfxVarN.d);
        if (this.s) {
            pfx pfxVarI = uiv0Var.i(2);
            int i5 = pfxVarI.f26926a;
            int i6 = pfxVarI.c;
            this.d.setPadding(i2 - i5, i3, i4 - i6, 0);
            zK = k(this.d, pfxVarI.f26926a, 0, i6, 0);
        } else {
            this.d.setPadding(0, 0, 0, 0);
            zK = k(this.d, i2, i3, i4, 0);
        }
        Rect rect2 = this.m;
        igu0.b(this, xiv0VarH, rect2);
        xiv0 xiv0VarR = uiv0Var.r(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.t = xiv0VarR;
        if (!this.u.equals(xiv0VarR)) {
            this.u = this.t;
            zK = true;
        }
        Rect rect3 = this.n;
        if (rect3.equals(rect2)) {
            z = zK;
        } else {
            rect3.set(rect2);
        }
        if (z) {
            requestLayout();
        }
        return uiv0Var.a().f40966a.c().f40966a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e(getContext());
        WeakHashMap weakHashMap = rgu0.f30456a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ai aiVar = (ai) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) aiVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) aiVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        liv0 fiv0Var;
        j();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        ai aiVar = (ai) this.d.getLayoutParams();
        int iMax = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aiVar).leftMargin + ((ViewGroup.MarginLayoutParams) aiVar).rightMargin);
        int iMax2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aiVar).topMargin + ((ViewGroup.MarginLayoutParams) aiVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = rgu0.f30456a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f45287a;
            if (this.s) {
                measuredHeight += this.p.top;
            }
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.f45287a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.m;
        Rect rect2 = this.o;
        rect2.set(rect);
        xiv0 xiv0Var = this.t;
        this.v = xiv0Var;
        if (this.g || z || !this.r) {
            pfx pfxVarC = this.s ? pfx.c(xiv0Var.b(), Math.max(this.v.d(), measuredHeight), this.v.c(), Math.max(this.v.a(), 0)) : pfx.c(xiv0Var.b(), this.v.d() + measuredHeight, this.v.c(), this.v.a());
            xiv0 xiv0Var2 = this.v;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 36) {
                fiv0Var = new kiv0(xiv0Var2);
            } else if (i3 >= 35) {
                fiv0Var = new jiv0(xiv0Var2);
            } else if (i3 >= 34) {
                fiv0Var = new iiv0(xiv0Var2);
            } else if (i3 >= 31) {
                fiv0Var = new hiv0(xiv0Var2);
            } else if (i3 >= 30) {
                fiv0Var = new giv0(xiv0Var2);
            } else {
                fiv0Var = i3 >= 29 ? new fiv0(xiv0Var2) : new eiv0(xiv0Var2);
            }
            fiv0Var.h(pfxVarC);
            this.v = fiv0Var.b();
        } else {
            boolean z2 = this.s;
            int i4 = rect2.top;
            if (z2) {
                rect2.top = Math.max(i4, measuredHeight);
                rect2.bottom = Math.max(rect2.bottom, 0);
            } else {
                rect2.top = i4 + measuredHeight;
                rect2.bottom = rect2.bottom;
            }
            this.v = this.v.f40966a.r(0, measuredHeight, 0, 0);
        }
        k(this.c, rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (!this.w.equals(this.v)) {
            xiv0 xiv0Var3 = this.v;
            this.w = xiv0Var3;
            rgu0.b(this.c, xiv0Var3);
        }
        measureChildWithMargins(this.c, i, 0, i2, 0);
        ai aiVar2 = (ai) this.c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aiVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aiVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aiVar2).topMargin + ((ViewGroup.MarginLayoutParams) aiVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.i || !z) {
            return false;
        }
        this.y.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.y.getFinalY() > this.d.getHeight()) {
            a();
            this.f1.run();
        } else {
            a();
            this.B.run();
        }
        this.j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.k + i2;
        this.k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        qhv0 qhv0Var;
        bku0 bku0Var;
        this.g1.b = i;
        this.k = getActionBarHideOffset();
        a();
        zh zhVar = this.x;
        if (zhVar == null || (bku0Var = (qhv0Var = (qhv0) zhVar).s) == null) {
            return;
        }
        bku0Var.a();
        qhv0Var.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.i || this.j) {
            return;
        }
        if (this.k <= this.d.getHeight()) {
            a();
            postDelayed(this.B, 600L);
        } else {
            a();
            postDelayed(this.f1, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        j();
        int i2 = this.l ^ i;
        this.l = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        zh zhVar = this.x;
        if (zhVar != null) {
            qhv0 qhv0Var = (qhv0) zhVar;
            qhv0Var.o = (z2 || this.s) ? false : true;
            if (z || !z2) {
                if (qhv0Var.p) {
                    qhv0Var.p = false;
                    qhv0Var.f(true);
                }
            } else if (!qhv0Var.p) {
                qhv0Var.p = true;
                qhv0Var.f(true);
            }
        }
        if ((i2 & 256) == 0 || this.x == null) {
            return;
        }
        WeakHashMap weakHashMap = rgu0.f30456a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        zh zhVar = this.x;
        if (zhVar != null) {
            ((qhv0) zhVar).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        a();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(zh zhVar) {
        this.x = zhVar;
        if (getWindowToken() != null) {
            ((qhv0) this.x).n = this.b;
            int i = this.l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = rgu0.f30456a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.h = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.i) {
            this.i = z;
            if (z) {
                return;
            }
            a();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        j();
        rwq0 rwq0Var = (rwq0) this.e;
        rwq0Var.d = i != 0 ? epv0.U(i, rwq0Var.f31228a.getContext()) : null;
        rwq0Var.c();
    }

    public void setLogo(int i) {
        j();
        rwq0 rwq0Var = (rwq0) this.e;
        rwq0Var.e = i != 0 ? epv0.U(i, rwq0Var.f31228a.getContext()) : null;
        rwq0Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.g = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((rwq0) this.e).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        rwq0 rwq0Var = (rwq0) this.e;
        if (rwq0Var.g) {
            return;
        }
        Toolbar toolbar = rwq0Var.f31228a;
        rwq0Var.h = charSequence;
        if ((rwq0Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (rwq0Var.g) {
                rgu0.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ai(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        rwq0 rwq0Var = (rwq0) this.e;
        rwq0Var.d = drawable;
        rwq0Var.c();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }
}
