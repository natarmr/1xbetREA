package a;

/* JADX INFO: loaded from: classes.dex */
public final class pft0 extends lm40 implements v6z {
    public float o;
    public float p;

    @Override // a.v6z
    public final int U(c810 c810Var, pj30 pj30Var, int i) {
        int iP = pj30Var.P(i);
        int iT = !Float.isNaN(this.o) ? c810Var.T(this.o) : 0;
        return iP < iT ? iT : iP;
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        int iK;
        int iJ;
        if (Float.isNaN(this.o) || p4e.k(j) != 0) {
            iK = p4e.k(j);
        } else {
            int iT = vj30Var.T(this.o);
            iK = p4e.i(j);
            if (iT < 0) {
                iT = 0;
            }
            if (iT <= iK) {
                iK = iT;
            }
        }
        int i = p4e.i(j);
        if (Float.isNaN(this.p) || p4e.j(j) != 0) {
            iJ = p4e.j(j);
        } else {
            int iT2 = vj30Var.T(this.p);
            iJ = p4e.h(j);
            int i2 = iT2 >= 0 ? iT2 : 0;
            if (i2 <= iJ) {
                iJ = i2;
            }
        }
        pu90 pu90VarS = pj30Var.S(r4e.a(iK, i, iJ, p4e.h(j)));
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new klo0(pu90VarS, (byte) 7));
    }

    @Override // a.v6z
    public final int e0(c810 c810Var, pj30 pj30Var, int i) {
        int iL = pj30Var.L(i);
        int iT = !Float.isNaN(this.o) ? c810Var.T(this.o) : 0;
        return iL < iT ? iT : iL;
    }

    @Override // a.v6z
    public final int v(c810 c810Var, pj30 pj30Var, int i) {
        int iB = pj30Var.b(i);
        int iT = !Float.isNaN(this.p) ? c810Var.T(this.p) : 0;
        return iB < iT ? iT : iB;
    }

    @Override // a.v6z
    public final int w(c810 c810Var, pj30 pj30Var, int i) {
        int iD = pj30Var.D(i);
        int iT = !Float.isNaN(this.p) ? c810Var.T(this.p) : 0;
        return iD < iT ? iT : iD;
    }
}
