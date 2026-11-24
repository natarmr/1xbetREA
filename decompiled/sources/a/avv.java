package a;

/* JADX INFO: loaded from: classes.dex */
public final class avv extends lm40 implements vld, v6z, fe60 {
    public y9q0 o;
    public boolean p;
    public int q;
    public boolean r;
    public int s;
    public int t;
    public y9q0 u;
    public b1t0 v;

    @Override // a.yzj
    public final void H() {
        this.u = afn0.A(this.o, vcc.Z(this).A);
        this.r = true;
        n7x.I(this);
    }

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    @Override // a.fe60
    public final void R() {
        if (this.v != null) {
            c9x.B(this, new zuv(this, (byte) 1));
        }
        this.r = true;
        n7x.I(this);
    }

    @Override // a.lm40
    public final void R0() {
        mrq mrqVar = (mrq) mbc.R(this, bmd.k);
        this.u = afn0.A(this.o, vcc.Z(this).A);
        nrq nrqVar = b1().f42262a.f;
        psq psqVar = b1().f42262a.c;
        if (psqVar == null) {
            psqVar = psq.e;
        }
        lsq lsqVar = b1().f42262a.d;
        int i = lsqVar != null ? lsqVar.f20592a : 0;
        msq msqVar = b1().f42262a.e;
        this.v = ((orq) mrqVar).b(nrqVar, psqVar, i, msqVar != null ? msqVar.f22332a : 65535);
        c9x.B(this, new zuv(this, (byte) 0));
        this.r = true;
    }

    @Override // a.lm40
    public final void S0() {
        this.u = null;
        this.v = null;
        this.r = false;
    }

    public final void Z0(vj30 vj30Var, y9q0 y9q0Var, mrq mrqVar) {
        y8q0 y8q0Var = r6q0.b(y9q0Var, vj30Var, mrqVar, 3, true).d;
        float fG = y8q0Var.g(0);
        float fG2 = y8q0Var.g(1);
        float fG3 = y8q0Var.g(2);
        this.s = aac.P(fG, fG2, fG3, this.p ? 1 : 0, 1);
        this.t = aac.P(fG, fG2, fG3, this.q, Integer.MAX_VALUE);
    }

    public final void a1(c810 c810Var) {
        if (this.r) {
            Z0(c810Var, b1(), (mrq) mbc.R(this, bmd.k));
            this.r = false;
        }
        int i = this.s;
        this.s = i >= 0 ? i : 0;
        int i2 = this.t;
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        this.t = i2;
    }

    @Override // a.yzj
    public final void b() {
        this.r = true;
        n7x.I(this);
    }

    public final y9q0 b1() {
        y9q0 y9q0Var = this.u;
        if (y9q0Var != null) {
            return y9q0Var;
        }
        throw w6x.i("Resolved style is not set.");
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        if (this.r) {
            Z0(vj30Var, b1(), (mrq) mbc.R(this, bmd.k));
            this.r = false;
        }
        int i = this.s;
        int iD = i != -1 ? l1e0.d(i, p4e.j(j), p4e.h(j)) : p4e.j(j);
        int i2 = this.t;
        pu90 pu90VarS = pj30Var.S(p4e.b(j, 0, 0, iD, i2 != -1 ? l1e0.d(i2, p4e.j(j), p4e.h(j)) : p4e.h(j), 3));
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new cam(pu90VarS, (byte) 8));
    }

    @Override // a.v6z
    public final int v(c810 c810Var, pj30 pj30Var, int i) {
        a1(c810Var);
        int i2 = this.s;
        int i3 = this.t;
        if (i2 == i3) {
            return i3;
        }
        int iB = pj30Var.b(i);
        int i4 = this.s;
        int i5 = this.t;
        if (iB < i4) {
            iB = i4;
        }
        return iB > i5 ? i5 : iB;
    }

    @Override // a.v6z
    public final int w(c810 c810Var, pj30 pj30Var, int i) {
        a1(c810Var);
        int i2 = this.s;
        if (i2 == this.t) {
            return i2;
        }
        int iD = pj30Var.D(i);
        int i3 = this.s;
        int i4 = this.t;
        if (iD < i3) {
            iD = i3;
        }
        return iD > i4 ? i4 : iD;
    }
}
