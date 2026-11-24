package a;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class k33 extends ViewGroup implements kk50, zjd, dg80, zf60 {
    public static final sy2 A = new sy2((byte) 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yj50 f17599a;
    public final View b;
    public final cg80 c;
    public Function0 d;
    public boolean e;
    public Function0 f;
    public Function0 g;
    public mm40 h;
    public Function1 i;
    public w6k j;
    public Function1 k;
    public clz l;
    public i0h0 m;
    public final int[] n;
    public long o;
    public xiv0 p;
    public Function1 q;
    public final g33 r;
    public final g33 s;
    public Function1 t;
    public final int[] u;
    public int v;
    public int w;
    public final eld0 x;
    public boolean y;
    public final e7z z;

    public k33(Context context, androidx.compose.runtime.a aVar, int i, yj50 yj50Var, View view, cg80 cg80Var) {
        super(context);
        this.f17599a = yj50Var;
        this.b = view;
        this.c = cg80Var;
        hz40 hz40Var = sjv0.f32320a;
        setTag(R.id.androidx_compose_ui_view_composition_context, aVar);
        byte b = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        bhu0 bhu0Var = (bhu0) this;
        h33 h33Var = new h33(bhu0Var, b);
        WeakHashMap weakHashMap = rgu0.f30456a;
        div0.a(this, h33Var);
        igu0.c(this, this);
        this.d = new t32((byte) 29);
        this.f = new f33(b);
        byte b2 = 1;
        this.g = new f33(b2);
        jm40 jm40Var = jm40.b;
        this.h = jm40Var;
        this.j = hic.g();
        this.n = new int[2];
        this.o = 0L;
        this.r = new g33(bhu0Var, b);
        this.s = new g33(bhu0Var, b2);
        this.u = new int[2];
        this.v = Integer.MIN_VALUE;
        this.w = Integer.MIN_VALUE;
        this.x = new eld0((byte) 9);
        e7z e7zVar = new e7z(3);
        e7zVar.p = bhu0Var;
        mm40 mm40VarA = pai0.a(cjx.V(jm40Var, aad.e, yj50Var), true, new sy2((byte) 9));
        jpa0 jpa0Var = new jpa0();
        jpa0Var.b = new e33(bhu0Var, (byte) 2);
        caz cazVar = new caz();
        caz cazVar2 = jpa0Var.c;
        if (cazVar2 != null) {
            cazVar2.b = null;
        }
        jpa0Var.c = cazVar;
        cazVar.b = jpa0Var;
        setOnRequestDisallowInterceptTouchEvent$ui(cazVar);
        mm40 mm40VarE = ro4.d0(rq8.K(mm40VarA.e(jpa0Var), new on((Object) bhu0Var, (Object) e7zVar, (Object) bhu0Var, (byte) 14)), new d33(bhu0Var, e7zVar, b)).e(new y29(new e33(bhu0Var, b)));
        e7zVar.e0(this.h.e(mm40VarE));
        this.i = new df1(e7zVar, mm40VarE, (byte) 26);
        e7zVar.a0(this.j);
        this.k = new b33(e7zVar, b2);
        e7zVar.o1 = new d33(bhu0Var, e7zVar, b2);
        e7zVar.p1 = new e33(bhu0Var, b2);
        e7zVar.d0(new i33(bhu0Var, e7zVar));
        this.z = e7zVar;
    }

    private final eg80 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            xcx.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.c.getSnapshotObserver();
    }

    public static pfx j(pfx pfxVar, int i, int i2, int i3, int i4) {
        int i5 = pfxVar.f26926a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = pfxVar.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = pfxVar.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = pfxVar.d - i4;
        return pfx.c(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    public static int m(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(l1e0.d(i3, i, i2), 1073741824);
        }
        if (i3 != -2 || i2 == Integer.MAX_VALUE) {
            return (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    public static final Unit n(bhu0 bhu0Var) {
        if (bhu0Var.e && bhu0Var.isAttachedToWindow() && bhu0Var.b.getParent() == bhu0Var) {
            eg80 snapshotObserver = bhu0Var.getSnapshotObserver();
            snapshotObserver.f7752a.d(bhu0Var, A, bhu0Var.d);
        }
        return Unit.f46060a;
    }

    @Override // a.zjd
    public final void a() {
        this.f.invoke();
        removeAllViewsInLayout();
    }

    @Override // a.jk50
    public final void b(View view, View view2, int i, int i2) {
        eld0 eld0Var = this.x;
        if (i2 == 1) {
            eld0Var.c = i;
        } else {
            eld0Var.b = i;
        }
    }

    @Override // a.jk50
    public final void c(View view, int i) {
        eld0 eld0Var = this.x;
        if (i == 1) {
            eld0Var.c = 0;
        } else {
            eld0Var.b = 0;
        }
    }

    @Override // a.jk50
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        if (this.b.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            int i4 = i3 == 0 ? 1 : 2;
            ek50 ek50Var = this.f17599a.f42727a;
            ek50 ek50VarA1 = ek50Var != null ? ek50Var.a1() : null;
            long jC = ek50VarA1 != null ? ek50VarA1.C(i4, jFloatToRawIntBits) : 0L;
            iArr[0] = x0x.L(Float.intBitsToFloat((int) (jC >> 32)));
            iArr[1] = x0x.L(Float.intBitsToFloat((int) (jC & 4294967295L)));
        }
    }

    @Override // a.zjd
    public final void e() {
        View view = this.b;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f.invoke();
        }
    }

    @Override // a.zjd
    public final void f() {
        this.g.invoke();
    }

    @Override // a.kk50
    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.b.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            ek50 ek50Var = this.f17599a.f42727a;
            ek50 ek50VarA1 = ek50Var != null ? ek50Var.a1() : null;
            long jS = ek50VarA1 != null ? ek50VarA1.S(i6, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[0] = x0x.L(Float.intBitsToFloat((int) (jS >> 32)));
            iArr[1] = x0x.L(Float.intBitsToFloat((int) (jS & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.u;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final w6k getDensity() {
        return this.j;
    }

    public final View getInteropView() {
        return this.b;
    }

    public final e7z getLayoutNode() {
        return this.z;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final clz getLifecycleOwner() {
        return this.l;
    }

    public final mm40 getModifier() {
        return this.h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        eld0 eld0Var = this.x;
        return eld0Var.c | eld0Var.b;
    }

    public final Function1<w6k, Unit> getOnDensityChanged$ui() {
        return this.k;
    }

    public final Function1<mm40, Unit> getOnModifierChanged$ui() {
        return this.i;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.t;
    }

    public final Function0<Unit> getRelease() {
        return this.g;
    }

    public final Function0<Unit> getReset() {
        return this.f;
    }

    public final i0h0 getSavedStateRegistryOwner() {
        return this.m;
    }

    public final Function0<Unit> getUpdate() {
        return this.d;
    }

    public final View getView() {
        return this.b;
    }

    @Override // a.jk50
    public final void h(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.b.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            ek50 ek50Var = this.f17599a.f42727a;
            ek50 ek50VarA1 = ek50Var != null ? ek50Var.a1() : null;
            if (ek50VarA1 != null) {
                ek50VarA1.S(i6, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override // a.dg80
    public final boolean h0() {
        return isAttachedToWindow();
    }

    @Override // a.jk50
    public final boolean i(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.y) {
            this.z.D();
            return null;
        }
        this.b.postOnAnimation(new fx2(this.s, (byte) 3));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.b.isNestedScrollingEnabled();
    }

    public final xiv0 k(xiv0 xiv0Var) {
        uiv0 uiv0Var = xiv0Var.f40966a;
        pfx pfxVarI = uiv0Var.i(-1);
        pfx pfxVar = pfx.e;
        if (!pfxVarI.equals(pfxVar) || !uiv0Var.j(-9).equals(pfxVar) || uiv0Var.h() != null) {
            rdx rdxVar = (rdx) this.z.h1.d;
            if (rdxVar.D1.n) {
                long J = x1x.J(rdxVar.Y(0L));
                int i = (int) (J >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (J & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jG = k7x.C(rdxVar).g();
                int i3 = (int) (jG >> 32);
                int i4 = (int) (jG & 4294967295L);
                long j = rdxVar.c;
                long J2 = x1x.J(rdxVar.Y((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (J2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & J2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return xiv0Var.f40966a.r(i, i2, i5, i7);
                }
            }
        }
        return xiv0Var;
    }

    @Override // a.zf60
    public final xiv0 l(View view, xiv0 xiv0Var) {
        this.p = new xiv0(xiv0Var);
        return k(xiv0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.y) {
            this.z.D();
        } else {
            this.b.postOnAnimation(new fx2(this.s, (byte) 3));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f7752a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.v = i;
        this.w = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        qjj.W(this.f17599a.c(), null, null, new j33(z, this, wpm0.g(f * (-1.0f), f2 * (-1.0f)), (yje) null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        qjj.W(this.f17599a.c(), null, null, new ey((Object) this, wpm0.g(f * (-1.0f), f2 * (-1.0f)), (yje) null, (byte) 7), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Function1 function1 = this.q;
        if (function1 == null) {
            return true;
        }
        function1.invoke(rect != null ? e9x.X(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        Function1 function1 = this.t;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(w6k w6kVar) {
        if (w6kVar != this.j) {
            this.j = w6kVar;
            Function1 function1 = this.k;
            if (function1 != null) {
                function1.invoke(w6kVar);
            }
        }
    }

    public final void setLifecycleOwner(clz clzVar) {
        if (clzVar != this.l) {
            this.l = clzVar;
            setTag(R.id.view_tree_lifecycle_owner, clzVar);
        }
    }

    public final void setModifier(mm40 mm40Var) {
        if (mm40Var != this.h) {
            this.h = mm40Var;
            Function1 function1 = this.i;
            if (function1 != null) {
                function1.invoke(mm40Var);
            }
        }
    }

    public final void setOnDensityChanged$ui(Function1<? super w6k, Unit> function1) {
        this.k = function1;
    }

    public final void setOnModifierChanged$ui(Function1<? super mm40, Unit> function1) {
        this.i = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(Function1<? super Boolean, Unit> function1) {
        this.t = function1;
    }

    public final void setRelease(Function0<Unit> function0) {
        this.g = function0;
    }

    public final void setReset(Function0<Unit> function0) {
        this.f = function0;
    }

    public final void setSavedStateRegistryOwner(i0h0 i0h0Var) {
        if (i0h0Var != this.m) {
            this.m = i0h0Var;
            setTag(R.id.view_tree_saved_state_registry_owner, i0h0Var);
        }
    }

    public final void setUpdate(Function0<Unit> function0) {
        this.d = function0;
        this.e = true;
        this.r.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
