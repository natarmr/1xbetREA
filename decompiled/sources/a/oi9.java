package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class oi9 extends lm40 implements fe60, y99, ehl {
    public final pi9 o;
    public boolean p;
    public b3h0 q;
    public Function1 r;

    public oi9(pi9 pi9Var, Function1 function1) {
        this.o = pi9Var;
        this.r = function1;
        pi9Var.f27033a = this;
        pi9Var.d = new vb8((Object) this, (byte) 23);
    }

    @Override // a.yzj
    public final void H() {
        Z0();
    }

    @Override // a.fe60
    public final void R() {
        Z0();
    }

    @Override // a.lm40
    public final void S0() {
        b3h0 b3h0Var = this.q;
        if (b3h0Var != null) {
            b3h0Var.d();
        }
    }

    @Override // a.lm40
    public final void T0() {
        Z0();
    }

    public final void Z0() {
        b3h0 b3h0Var = this.q;
        if (b3h0Var != null) {
            b3h0Var.d();
        }
        this.p = false;
        this.o.b = null;
        vfc.J(this);
    }

    @Override // a.yzj
    public final void b() {
        Z0();
    }

    @Override // a.y99
    public final long d() {
        return n2x.Q(vcc.X(this, 4).c);
    }

    @Override // a.y99
    public final w6k getDensity() {
        return vcc.Z(this).z;
    }

    @Override // a.y99
    public final k6z getLayoutDirection() {
        return vcc.Z(this).A;
    }

    @Override // a.ehl
    public final void p0() {
        Z0();
    }

    @Override // a.ehl
    public final void u0(g7z g7zVar) {
        boolean z = this.p;
        pi9 pi9Var = this.o;
        if (!z) {
            pi9Var.b = null;
            pi9Var.c = g7zVar;
            c9x.B(this, new gj4(this, pi9Var, (byte) 27));
            if (pi9Var.b == null) {
                throw cs0.g("DrawResult not defined, did you forget to call onDraw?");
            }
            this.p = true;
        }
        psc pscVar = pi9Var.b;
        pscVar.getClass();
        ((Function1) pscVar.b).invoke(g7zVar);
    }
}
