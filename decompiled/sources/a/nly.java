package a;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;

/* JADX INFO: loaded from: classes6.dex */
public final class nly extends lm40 implements v6z, vld {
    public final t33 A = xf0.c(0.0f);
    public boolean o;
    public ghn p;
    public float q;
    public l7m0 r;
    public float s;
    public Integer t;
    public int u;
    public scq0 v;
    public thq w;
    public ViewTreeObserver x;
    public c4m0 y;
    public bby z;

    public nly(boolean z, ghn ghnVar, float f, l7m0 l7m0Var) {
        this.o = z;
        this.p = ghnVar;
        this.q = f;
        this.r = l7m0Var;
    }

    @Override // a.lm40
    public final void R0() {
        Z0();
        this.v = x4d0.f0(this, new lly(this, (byte) 1));
        c1();
    }

    @Override // a.lm40
    public final void S0() {
        agd agdVarB1;
        Window window;
        if (this.o && (agdVarB1 = b1()) != null && (window = agdVarB1.getWindow()) != null) {
            window.setSoftInputMode(this.u);
        }
        scq0 scq0Var = this.v;
        if (scq0Var != null) {
            scq0Var.b();
        }
        this.v = null;
        d1();
        c4m0 c4m0Var = this.y;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.y = null;
        this.t = null;
    }

    public final void Z0() {
        agd agdVarB1;
        if (this.o && (agdVarB1 = b1()) != null) {
            Window window = agdVarB1.getWindow();
            this.u = window.getAttributes().softInputMode;
            window.setSoftInputMode(a8k0.A() ? 16 : 48);
        }
    }

    public final void a1(float f, boolean z) {
        Integer num = this.t;
        if (num != null) {
            int iIntValue = num.intValue();
            float f2 = 0.0f;
            if (z) {
                float f3 = (f - iIntValue) - this.q;
                if (f3 >= 0.0f) {
                    f2 = f3;
                }
            }
            yje yjeVar = null;
            if (a8k0.A() || !this.o) {
                c4m0 c4m0Var = this.y;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                this.y = qjj.W(N0(), null, null, new mly(this, f2, yjeVar, (byte) 0), 3);
                return;
            }
            c4m0 c4m0Var2 = this.y;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
            this.y = qjj.W(N0(), null, null, new mly(this, f2, yjeVar, (byte) 1), 3);
        }
    }

    public final agd b1() {
        for (Context context = ((View) mbc.R(this, dy2.f)).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof agd) {
                return (agd) context;
            }
        }
        return null;
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        pj30Var.getClass();
        pu90 pu90VarS = pj30Var.S(j);
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new okw(pu90VarS, this, (byte) 14));
    }

    public final void c1() {
        l7m0 l7m0Var = this.r;
        if (l7m0Var != null) {
            this.z = qjj.W(N0(), null, null, new u5u(l7m0Var, this, null, (byte) 28), 3);
            return;
        }
        View rootView = ((View) mbc.R(this, dy2.f)).getRootView();
        thq thqVar = new thq((byte) 1, rootView, this);
        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(thqVar);
        this.w = thqVar;
        this.x = viewTreeObserver;
    }

    public final void d1() {
        thq thqVar = this.w;
        if (thqVar != null) {
            ViewTreeObserver viewTreeObserver = this.x;
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(thqVar);
            }
            this.w = null;
            this.x = null;
        }
        bby bbyVar = this.z;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.z = null;
    }
}
