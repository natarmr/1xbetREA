package a;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class rmb0 extends x1 {
    public static final peb0 g1 = new peb0((byte) 18);
    public final pz40 A;
    public boolean B;
    public final int[] f1;
    public Function0 j;
    public wmb0 k;
    public String l;
    public final View m;
    public final boolean n;
    public final mi70 o;
    public final WindowManager p;
    public final WindowManager.LayoutParams q;
    public vmb0 r;
    public k6z s;
    public final pz40 t;
    public final pz40 u;
    public mkx v;
    public final zbk w;
    public final Rect x;
    public final pgk0 y;
    public ma3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmb0(Function0 function0, wmb0 wmb0Var, String str, View view, w6k w6kVar, vmb0 vmb0Var, UUID uuid, boolean z) {
        super(view.getContext(), null);
        int i = Build.VERSION.SDK_INT;
        mi70 umb0Var = i >= 30 ? new umb0() : i >= 29 ? new smb0() : new mi70();
        this.j = function0;
        this.k = wmb0Var;
        this.l = str;
        this.m = view;
        this.n = z;
        this.o = umb0Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.p = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        wmb0 wmb0Var2 = this.k;
        boolean zB = k13.b(view);
        boolean z2 = wmb0Var2.b;
        int i2 = wmb0Var2.f39398a;
        if (z2 && zB) {
            i2 |= 8192;
        } else if (z2 && !zB) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.k.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.q = layoutParams;
        this.r = vmb0Var;
        this.s = k6z.f17794a;
        this.t = androidx.compose.runtime.e.e(null);
        this.u = androidx.compose.runtime.e.e(null);
        this.w = jgk0.b(new ssa0(this, (byte) 7));
        this.x = new Rect();
        this.y = new pgk0(new f13(this, (byte) 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, s7n0.l(view));
        setTag(R.id.view_tree_view_model_store_owner, n8n0.h(view));
        setTag(R.id.view_tree_saved_state_registry_owner, w7n0.p(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(w6kVar.w0(8.0f));
        setOutlineProvider(new ruc((byte) 3));
        this.A = androidx.compose.runtime.e.e(vbw0.f37160a);
        this.f1 = new int[2];
    }

    private final Function2<fet, Integer, Unit> getContent() {
        return (Function2) ((hgk0) this.A).getValue();
    }

    private final mkx getDisplayBounds() {
        int i = this.k.f39398a & 512;
        View view = this.m;
        Rect rect = this.x;
        mi70 mi70Var = this.o;
        if (i == 0) {
            mi70Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            mi70Var.a(rect, view);
        }
        return new mkx(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final j6z getParentLayoutCoordinates() {
        return (j6z) ((hgk0) this.u).getValue();
    }

    public static final boolean m(rmb0 rmb0Var) {
        j6z parentLayoutCoordinates = rmb0Var.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.h()) {
            parentLayoutCoordinates = null;
        }
        return (parentLayoutCoordinates == null || rmb0Var.m9getPopupContentSizebOM6tXw() == null) ? false : true;
    }

    private final void setContent(Function2<? super fet, ? super Integer, Unit> function2) {
        ((hgk0) this.A).setValue(function2);
    }

    private final void setParentLayoutCoordinates(j6z j6zVar) {
        ((hgk0) this.u).setValue(j6zVar);
    }

    @Override // a.x1
    public final void a(int i, fet fetVar) {
        fetVar.g0(-857613600);
        int i2 = (fetVar.i(this) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lma0(this, i, (byte) 13);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.k.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0 function0 = this.j;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // a.x1
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        super.g(z, i, i2, i3, i4);
        this.k.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.q;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.o.getClass();
        this.p.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.w.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.q;
    }

    public final k6z getParentLayoutDirection() {
        return this.s;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final qkx m9getPopupContentSizebOM6tXw() {
        return (qkx) ((hgk0) this.t).getValue();
    }

    public final vmb0 getPositionProvider() {
        return this.r;
    }

    @Override // a.x1
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.B;
    }

    public final String getTestTag() {
        return this.l;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // a.x1
    public final void h(int i, int i2) {
        this.k.getClass();
        mkx displayBounds = getDisplayBounds();
        super.h(View.MeasureSpec.makeMeasureSpec(displayBounds.c - displayBounds.f21964a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.a(), Integer.MIN_VALUE));
    }

    public final void n(nld nldVar, Function2 function2) {
        setParentCompositionContext(nldVar);
        setContent(function2);
        this.B = true;
    }

    public final void o(Function0 function0, wmb0 wmb0Var, String str, k6z k6zVar) {
        int i;
        this.j = function0;
        this.l = str;
        if (!Intrinsics.d(this.k, wmb0Var)) {
            wmb0Var.getClass();
            this.k = wmb0Var;
            boolean zB = k13.b(this.m);
            boolean z = wmb0Var.b;
            int i2 = wmb0Var.f39398a;
            if (z && zB) {
                i2 |= 8192;
            } else if (z && !zB) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.q;
            layoutParams.flags = i2;
            this.o.getClass();
            this.p.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = k6zVar.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    @Override // a.x1, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y.e();
        if (!this.k.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        ma3 ma3Var = this.z;
        if (ma3Var == null) {
            ma3 ma3Var2 = new ma3(this.j, (byte) 0);
            this.z = ma3Var2;
            ma3Var = ma3Var2;
        }
        f7.t(this, ma3Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pgk0 pgk0Var = this.y;
        jk8 jk8Var = pgk0Var.h;
        if (jk8Var != null) {
            jk8Var.a();
        }
        pgk0Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            f7.u(this, this.z);
        }
        this.z = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.k.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.j;
            if (function0 != null) {
                function0.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            Function0 function1 = this.j;
            if (function1 != null) {
                function1.invoke();
            }
        }
        return true;
    }

    public final void p() {
        j6z parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.h()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jG = parentLayoutCoordinates.g();
            long jR = this.n ? parentLayoutCoordinates.R(0L) : parentLayoutCoordinates.G(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jR >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jR & 4294967295L)))) & 4294967295L);
            int i = (int) (jRound >> 32);
            int i2 = (int) (jRound & 4294967295L);
            mkx mkxVar = new mkx(i, i2, ((int) (jG >> 32)) + i, ((int) (jG & 4294967295L)) + i2);
            if (mkxVar.equals(this.v)) {
                return;
            }
            this.v = mkxVar;
            r();
        }
    }

    public final void q(j6z j6zVar) {
        setParentLayoutCoordinates(j6zVar);
        p();
    }

    public final void r() {
        qkx qkxVarM9getPopupContentSizebOM6tXw;
        final mkx mkxVar = this.v;
        if (mkxVar == null || (qkxVarM9getPopupContentSizebOM6tXw = m9getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long j = qkxVarM9getPopupContentSizebOM6tXw.f28908a;
        mkx displayBounds = getDisplayBounds();
        final long jA = (((long) displayBounds.a()) & 4294967295L) | (((long) (displayBounds.c - displayBounds.f21964a)) << 32);
        final lie0 lie0Var = new lie0();
        lie0Var.f20100a = 0L;
        this.y.d(this, g1, new Function0() { // from class: a.qmb0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                rmb0 rmb0Var = this;
                lie0Var.f20100a = rmb0Var.r.a(mkxVar, jA, rmb0Var.s, j);
                return Unit.f46060a;
            }
        });
        long j2 = lie0Var.f20100a;
        WindowManager.LayoutParams layoutParams = this.q;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.k.e;
        mi70 mi70Var = this.o;
        if (z) {
            mi70Var.b(this, (int) (jA >> 32), (int) (jA & 4294967295L));
        }
        mi70Var.getClass();
        this.p.updateViewLayout(this, layoutParams);
    }

    public final void setParentLayoutDirection(k6z k6zVar) {
        this.s = k6zVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m10setPopupContentSizefhxjrPA(qkx qkxVar) {
        ((hgk0) this.t).setValue(qkxVar);
    }

    public final void setPositionProvider(vmb0 vmb0Var) {
        this.r = vmb0Var;
    }

    public final void setTestTag(String str) {
        this.l = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public x1 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
