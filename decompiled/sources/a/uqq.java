package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uqq extends f3k implements qai0, t7v, vld, fe60, hps0 {
    public static final xak w = new xak((byte) 19);
    public gy40 q;
    public final Function1 r;
    public qpq s;
    public pbz t;
    public j6z u;
    public final nqq v;

    public uqq(gy40 gy40Var, int i, t0 t0Var) {
        this.q = gy40Var;
        this.r = t0Var;
        nqq nqqVar = new nqq(i, new brk(2, this, uqq.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, (byte) 23), 10);
        Z0(nqqVar);
        this.v = nqqVar;
    }

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    @Override // a.t7v
    public final void P(s460 s460Var) {
        this.u = s460Var;
        if (this.v.e1().b()) {
            if (!s460Var.g1().n) {
                d1();
                return;
            }
            j6z j6zVar = this.u;
            if (j6zVar == null || !j6zVar.h()) {
                return;
            }
            d1();
        }
    }

    @Override // a.fe60
    public final void R() {
        mie0 mie0Var = new mie0();
        c9x.B(this, new gmo(mie0Var, this, (byte) 15));
        pbz pbzVar = (pbz) mie0Var.f21842a;
        if (this.v.e1().b()) {
            pbz pbzVar2 = this.t;
            if (pbzVar2 != null) {
                pbzVar2.b();
            }
            if (pbzVar != null) {
                pbzVar.a();
            } else {
                pbzVar = null;
            }
            this.t = pbzVar;
        }
    }

    @Override // a.lm40
    public final void T0() {
        pbz pbzVar = this.t;
        if (pbzVar != null) {
            pbzVar.b();
        }
        this.t = null;
    }

    public final void c1(gy40 gy40Var, nlx nlxVar) {
        if (!this.n) {
            gy40Var.b(nlxVar);
            return;
        }
        bby bbyVar = (bby) ((sje) N0()).f32300a.get(gqw0.o1);
        qjj.W(N0(), null, null, new g6q((Object) gy40Var, (Object) nlxVar, (Object) (bbyVar != null ? bbyVar.invokeOnCompletion(new f5p(gy40Var, nlxVar, (byte) 12)) : null), (yje) null, (byte) 13), 3);
    }

    public final void d1() {
        tzi tziVar;
        if (this.n) {
            if (!this.f20279a.n) {
                xcx.b("visitAncestors called on an unattached node");
            }
            lm40 lm40Var = this.f20279a.e;
            e7z e7zVarZ = vcc.Z(this);
            while (e7zVarZ != null) {
                if ((((lm40) e7zVarZ.h1.g).d & 262144) != 0) {
                    while (lm40Var != null) {
                        if ((lm40Var.c & 262144) != 0) {
                            lm40 lm40VarV = lm40Var;
                            xz40 xz40Var = null;
                            while (lm40VarV != null) {
                                if (lm40VarV instanceof hps0) {
                                    if (vqq.o == ((hps0) lm40VarV).j()) {
                                        return;
                                    }
                                }
                                if ((lm40VarV.c & 262144) != 0 && (lm40VarV instanceof f3k)) {
                                    int i = 0;
                                    for (lm40 lm40Var2 = ((f3k) lm40VarV).p; lm40Var2 != null; lm40Var2 = lm40Var2.f) {
                                        if ((lm40Var2.c & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                lm40VarV = lm40Var2;
                                            } else {
                                                if (xz40Var == null) {
                                                    xz40Var = new xz40(new lm40[16]);
                                                }
                                                if (lm40VarV != null) {
                                                    xz40Var.b(lm40VarV);
                                                    lm40VarV = null;
                                                }
                                                xz40Var.b(lm40Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                lm40VarV = vcc.V(xz40Var);
                            }
                        }
                        lm40Var = lm40Var.e;
                    }
                }
                e7zVarZ = e7zVarZ.v();
                lm40Var = (e7zVarZ == null || (tziVar = e7zVarZ.h1) == null) ? null : (wso0) tziVar.f;
            }
        }
    }

    public final void e1(gy40 gy40Var) {
        qpq qpqVar;
        if (Intrinsics.d(this.q, gy40Var)) {
            return;
        }
        gy40 gy40Var2 = this.q;
        if (gy40Var2 != null && (qpqVar = this.s) != null) {
            gy40Var2.b(new rpq(qpqVar));
        }
        this.s = null;
        this.q = gy40Var;
    }

    @Override // a.hps0
    public final Object j() {
        return w;
    }

    @Override // a.qai0
    public final void x0(abi0 abi0Var) {
        boolean zB = this.v.e1().b();
        iiy[] iiyVarArr = yai0.f42300a;
        zai0 zai0Var = xai0.l;
        iiy iiyVar = yai0.f42300a[4];
        Boolean boolValueOf = Boolean.valueOf(zB);
        zai0Var.getClass();
        abi0Var.b(zai0Var, boolValueOf);
        abi0Var.b(mai0.w, new m6(null, new wej(0, this, uqq.class, "requestFocus", "requestFocus()Z", 0, (byte) 17)));
    }
}
