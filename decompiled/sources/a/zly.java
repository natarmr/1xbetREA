package a;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class zly extends lm40 implements v6z, vld {
    public boolean A;
    public final t33 B = xf0.c(0.0f);
    public ghn o;
    public Function1 p;
    public float q;
    public float r;
    public Integer s;
    public scq0 t;
    public z0i u;
    public ViewTreeObserver v;
    public c4m0 w;
    public bby x;
    public wly y;
    public View z;

    public zly(ghn ghnVar, Function1 function1) {
        this.o = ghnVar;
        this.p = function1;
    }

    @Override // a.lm40
    public final void R0() {
        this.t = x4d0.f0(this, new vly(this, (byte) 0));
        zfn zfnVar = dy2.f;
        View rootView = ((View) mbc.R(this, zfnVar)).getRootView();
        z0i z0iVar = new z0i(this, (byte) 1);
        wly wlyVar = new wly(this, (byte) 0);
        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(z0iVar);
        viewTreeObserver.addOnWindowFocusChangeListener(wlyVar);
        this.u = z0iVar;
        this.y = wlyVar;
        this.v = viewTreeObserver;
        View rootView2 = ((View) mbc.R(this, zfnVar)).getRootView();
        yly ylyVar = new yly(this, rootView2);
        WeakHashMap weakHashMap = rgu0.f30456a;
        div0.a(rootView2, ylyVar);
        this.z = rootView2;
    }

    @Override // a.lm40
    public final void S0() {
        scq0 scq0Var = this.t;
        if (scq0Var != null) {
            scq0Var.b();
        }
        this.t = null;
        ViewTreeObserver viewTreeObserver = this.v;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            z0i z0iVar = this.u;
            if (z0iVar != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(z0iVar);
            }
            wly wlyVar = this.y;
            if (wlyVar != null) {
                viewTreeObserver.removeOnWindowFocusChangeListener(wlyVar);
            }
        }
        this.u = null;
        this.y = null;
        this.v = null;
        View view = this.z;
        if (view != null) {
            WeakHashMap weakHashMap = rgu0.f30456a;
            div0.a(view, null);
            this.z = null;
            this.A = false;
        }
        bby bbyVar = this.x;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.x = null;
        c4m0 c4m0Var = this.w;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.w = null;
        this.s = null;
    }

    public final void Z0(float f, boolean z) {
        float f2 = 0.0f;
        if (z) {
            Integer num = this.s;
            if (num == null) {
                return;
            }
            float fIntValue = (f - num.intValue()) + ((Number) this.p.invoke(mbc.R(this, bmd.h))).floatValue();
            if (fIntValue >= 0.0f) {
                f2 = fIntValue;
            }
        }
        if (f2 == this.r) {
            return;
        }
        this.r = f2;
        boolean zA = a8k0.A();
        c4m0 c4m0Var = this.w;
        yje yjeVar = null;
        if (zA) {
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            this.w = qjj.W(N0(), null, null, new xly(this, f2, yjeVar, (byte) 0), 3);
        } else {
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            this.w = qjj.W(N0(), null, null, new xly(this, f2, yjeVar, (byte) 1), 3);
        }
    }

    public final void a1() {
        if (this.A) {
            return;
        }
        View rootView = ((View) mbc.R(this, dy2.f)).getRootView();
        WeakHashMap weakHashMap = rgu0.f30456a;
        xiv0 xiv0VarA = jgu0.a(rootView);
        boolean z = false;
        if ((xiv0VarA != null ? xiv0VarA.f40966a.u(8) : false) && rootView.hasWindowFocus()) {
            z = true;
        }
        Z0(z ? xiv0VarA.f40966a.i(8).d : 0.0f, z);
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        long j2;
        pj30Var.getClass();
        boolean z = p4e.h(j) != Integer.MAX_VALUE;
        if (z) {
            int iH = p4e.h(j) - l1e0.d(si30.b(this.q), 0, p4e.h(j));
            j2 = j;
            j = p4e.b(j2, 0, 0, 0, iH < 0 ? 0 : iH, 3);
        } else {
            j2 = j;
        }
        pu90 pu90VarS = pj30Var.S(j);
        return vj30.x(vj30Var, pu90VarS.f27604a, z ? p4e.h(j2) : pu90VarS.b, new cam(pu90VarS, (byte) 10));
    }
}
