package a;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class x1 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f40096a;
    public IBinder b;
    public yqv0 c;
    public nld d;
    public skd e;
    public Function0 f;
    public boolean g;
    public boolean h;
    public boolean i;

    public x1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        sgu0 sgu0Var = new sgu0(this, (byte) 1);
        addOnAttachStateChangeListener(sgu0Var);
        tgu0 tgu0Var = new tgu0(this);
        b8k0.J(this).f45046a.add(tgu0Var);
        this.f = new hot0(this, sgu0Var, tgu0Var, (byte) 2);
    }

    private final void setParentContext(nld nldVar) {
        if (this.d != nldVar) {
            this.d = nldVar;
            if (nldVar != null) {
                this.f40096a = null;
            }
            yqv0 yqv0Var = this.c;
            if (yqv0Var != null) {
                yqv0Var.a();
                this.c = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.b != iBinder) {
            this.b = iBinder;
            this.f40096a = null;
        }
    }

    public abstract void a(int i, fet fetVar);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.e == null) {
                AndroidComposeView androidComposeView = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof AndroidComposeView) {
                        androidComposeView = (AndroidComposeView) childAt;
                    }
                }
                if (androidComposeView != null) {
                    androidComposeView.setComposeViewContext(k(ibc.e0(this), androidComposeView.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                f();
            }
        }
    }

    public final void c() {
        if (this.h) {
            return;
        }
        v4i0.p(kng0.l("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
    }

    public final void d() {
        skd skdVar;
        if (this.d != null || isAttachedToWindow() || ((skdVar = this.e) != null && skdVar.f32341a.isAttachedToWindow())) {
            f();
        } else {
            jf4.n("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void e() {
        View childAt = getChildAt(0);
        AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
        if (androidComposeView != null && androidComposeView.composeViewContextIncrementedDuringInit) {
            androidComposeView.getComposeViewContext().b();
            androidComposeView.composeViewContextIncrementedDuringInit = false;
        }
        yqv0 yqv0Var = this.c;
        if (yqv0Var != null) {
            yqv0Var.a();
        }
        this.c = null;
        requestLayout();
    }

    public final void f() {
        if (this.c == null) {
            try {
                this.h = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    skd skdVarI = this.e;
                    if (skdVarI == null) {
                        skdVarI = i();
                    }
                    this.c = frv0.a(this, skdVarI, new ugd(1003123809, true, new iob0((Object) this, (byte) 20)));
                    Trace.endSection();
                    this.h = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                this.h = false;
                throw th2;
            }
        }
    }

    public void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m12getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        gy4 gy4Var = tag instanceof gy4 ? (gy4) tag : null;
        if (gy4Var != null) {
            return gy4Var.f12107a;
        }
        return 1;
    }

    public final skd getComposeViewContext$ui() {
        return this.e;
    }

    public final boolean getHasComposition() {
        return this.c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.g;
    }

    public void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public final skd i() {
        skd composeViewContext;
        riu0 riu0Var;
        riu0 riu0Var2 = null;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                composeViewContext = androidComposeView.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewE0 = ibc.e0(this);
        skd skdVarH0 = ibc.h0(viewE0);
        if (skdVarH0 != null) {
            return k(viewE0, skdVarH0);
        }
        nld nldVarJ = j();
        clz clzVarL = s7n0.l(viewE0);
        if (clzVarL == null) {
            clzVarL = composeViewContext != null ? composeViewContext.d() : null;
            if (clzVarL == null) {
                jf4.n("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        clz clzVar = clzVarL;
        i0h0 i0h0VarP = w7n0.p(viewE0);
        if (i0h0VarP == null) {
            if (composeViewContext != null) {
                composeViewContext.g();
                i0h0VarP = composeViewContext.e;
                i0h0VarP.getClass();
            } else {
                i0h0VarP = null;
            }
            if (i0h0VarP == null) {
                jf4.n("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        i0h0 i0h0Var = i0h0VarP;
        riu0 riu0VarH = n8n0.h(viewE0);
        if (riu0VarH == null) {
            if (composeViewContext != null) {
                composeViewContext.g();
                riu0Var2 = composeViewContext.f;
            }
            riu0Var = riu0Var2;
        } else {
            riu0Var = riu0VarH;
        }
        skd skdVar = new skd(ibc.h0(ibc.e0(viewE0)), viewE0, nldVarJ, clzVar, i0h0Var, riu0Var);
        viewE0.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(skdVar));
        return skdVar;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.i || super.isTransitionGroup();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a.nld] */
    /* JADX WARN: Type inference failed for: r0v1, types: [a.nld] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [a.nld] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [a.fge0] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v21 */
    public final nld j() {
        nld nldVar;
        ?? A = this.d;
        if (A == 0) {
            A = sjv0.a(this);
            if (A == 0) {
                Object parent = getParent();
                A = A;
                while (A == 0 && (parent instanceof View)) {
                    View view = (View) parent;
                    nld nldVarA = sjv0.a(view);
                    parent = k7n0.v(view);
                    A = nldVarA;
                }
            }
            if (A != 0) {
                ?? r2 = (!(A instanceof fge0) || ((dge0) ((fge0) A).u.getValue()).compareTo(dge0.b) > 0) ? A : 0;
                if (r2 != 0) {
                    this.f40096a = new WeakReference(r2);
                }
            } else {
                A = 0;
            }
            if (A == 0) {
                WeakReference weakReference = this.f40096a;
                if (weakReference == null || (nldVar = (nld) weakReference.get()) == null) {
                    A = 0;
                } else {
                    boolean z = nldVar instanceof fge0;
                    A = nldVar;
                    if (z) {
                        int iCompareTo = ((dge0) ((fge0) nldVar).u.getValue()).compareTo(dge0.b);
                        A = nldVar;
                        if (iCompareTo <= 0) {
                            A = 0;
                        }
                    }
                }
                if (A == 0) {
                    A = sjv0.b(this);
                    ?? r1 = ((dge0) A.u.getValue()).compareTo(dge0.b) > 0 ? A : 0;
                    if (r1 != 0) {
                        this.f40096a = new WeakReference(r1);
                    }
                }
            }
        }
        return A;
    }

    public final skd k(View view, skd skdVar) {
        nld nldVarJ = j();
        clz clzVarL = s7n0.l(view);
        riu0 riu0VarH = n8n0.h(view);
        i0h0 i0h0VarP = w7n0.p(view);
        if (nldVarJ == skdVar.c() && clzVarL == skdVar.d()) {
            skdVar.g();
            if (riu0VarH == skdVar.f) {
                skdVar.g();
                i0h0 i0h0Var = skdVar.e;
                i0h0Var.getClass();
                if (i0h0VarP == i0h0Var) {
                    return skdVar;
                }
            }
        }
        if (nldVarJ.k() != skdVar.c().k()) {
            e();
        }
        if (clzVarL == null) {
            clzVarL = skdVar.d();
        }
        clz clzVar = clzVarL;
        if (i0h0VarP == null) {
            skdVar.g();
            i0h0VarP = skdVar.e;
            i0h0VarP.getClass();
        }
        skd skdVar2 = new skd(skdVar, view, nldVarJ, clzVar, i0h0VarP, riu0VarH);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(skdVar2));
        return skdVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        hz40 hz40Var = sjv0.f32320a;
        Object objV = k7n0.v(this);
        View view = this;
        while (objV instanceof View) {
            View view2 = (View) objV;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objV = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new w1((Object) this, (byte) 0));
        } else {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        h(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m13setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new gy4(i));
    }

    public final void setComposeViewContext$ui(skd skdVar) {
        if (this.e != skdVar) {
            if (skdVar == null) {
                e();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
                if (androidComposeView != null) {
                    if (androidComposeView.getCoroutineContext() != skdVar.c().k()) {
                        e();
                    }
                    androidComposeView.setComposeViewContext(skdVar);
                }
            }
            this.e = skdVar;
        }
    }

    public final void setParentCompositionContext(nld nldVar) {
        setParentContext(nldVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.g = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((cg80) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.i = true;
    }

    public final void setViewCompositionStrategy(vgu0 vgu0Var) {
        Function0 function0 = this.f;
        if (function0 != null) {
            function0.invoke();
        }
        this.f = vgu0Var.d(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
