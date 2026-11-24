package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p7q0 extends lm40 implements vld, v6z {
    public final y9q0 o;
    public b1t0 p;
    public q58 q;

    public p7q0(y9q0 y9q0Var) {
        this.o = y9q0Var;
    }

    @Override // a.yzj
    public final void H() {
        q58 q58Var = this.q;
        if (q58Var != null) {
            q58.a(q58Var, vcc.Z(this).A, null, null, 30);
        }
        n7x.I(this);
    }

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    @Override // a.lm40
    public final void R0() {
        y9q0 y9q0VarA = afn0.A(this.o, vcc.Z(this).A);
        mrq mrqVar = (mrq) mbc.R(this, bmd.k);
        Z0(y9q0VarA, mrqVar);
        k6z k6zVar = vcc.Z(this).A;
        w6k w6kVar = vcc.Z(this).z;
        b1t0 b1t0Var = this.p;
        if (b1t0Var == null) {
            throw w6x.i("Font resolution state is not set.");
        }
        this.q = new q58(k6zVar, w6kVar, mrqVar, y9q0VarA, b1t0Var.getValue());
    }

    @Override // a.lm40
    public final void S0() {
        this.p = null;
        this.q = null;
    }

    public final void Z0(y9q0 y9q0Var, mrq mrqVar) {
        smk0 smk0Var = y9q0Var.f42262a;
        nrq nrqVar = smk0Var.f;
        psq psqVar = smk0Var.c;
        if (psqVar == null) {
            psqVar = psq.e;
        }
        lsq lsqVar = smk0Var.d;
        int i = lsqVar != null ? lsqVar.f20592a : 0;
        msq msqVar = smk0Var.e;
        this.p = ((orq) mrqVar).b(nrqVar, psqVar, i, msqVar != null ? msqVar.f22332a : 65535);
        n7x.I(this);
    }

    @Override // a.yzj
    public final void b() {
        q58 q58Var = this.q;
        if (q58Var != null) {
            q58.a(q58Var, null, vcc.Z(this).z, null, 29);
        }
        n7x.I(this);
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        q58 q58Var = this.q;
        if (q58Var == null) {
            throw w6x.i("Min size state is not set.");
        }
        pz40 pz40Var = (pz40) q58Var.g;
        b1t0 b1t0Var = this.p;
        if (b1t0Var == null) {
            throw w6x.i("Font resolution state is not set.");
        }
        Object value = b1t0Var.getValue();
        if (!Intrinsics.d(value, q58Var.f)) {
            q58Var.f = value;
            ((hgk0) pz40Var).setValue(Boolean.TRUE);
        }
        if (((Boolean) ((hgk0) pz40Var).getValue()).booleanValue()) {
            q58Var.f28138a = r6q0.a((y9q0) q58Var.e, (w6k) q58Var.c, (mrq) q58Var.d);
            ((hgk0) pz40Var).setValue(Boolean.FALSE);
        }
        long j2 = q58Var.f28138a;
        pu90 pu90VarS = pj30Var.S(r4e.e(j, r4e.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new klo0(pu90VarS, (byte) 4));
    }
}
