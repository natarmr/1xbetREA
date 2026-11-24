package a;

/* JADX INFO: loaded from: classes.dex */
public final class p7k0 extends lm40 implements v6z {
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    @Override // a.v6z
    public final int U(c810 c810Var, pj30 pj30Var, int i) {
        long jZ0 = Z0(c810Var);
        if (p4e.g(jZ0)) {
            return p4e.i(jZ0);
        }
        if (!this.s) {
            i = r4e.f(i, jZ0);
        }
        return r4e.g(pj30Var.P(i), jZ0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long Z0(vj30 vj30Var) {
        int iT;
        int iT2;
        int iT3;
        int i = 0;
        if (Float.isNaN(this.q)) {
            iT = Integer.MAX_VALUE;
        } else {
            iT = vj30Var.T(this.q);
            if (iT < 0) {
                iT = 0;
            }
        }
        if (Float.isNaN(this.r)) {
            iT2 = Integer.MAX_VALUE;
        } else {
            iT2 = vj30Var.T(this.r);
            if (iT2 < 0) {
                iT2 = 0;
            }
        }
        if (Float.isNaN(this.o)) {
            iT3 = 0;
        } else {
            iT3 = vj30Var.T(this.o);
            if (iT3 < 0) {
                iT3 = 0;
            }
            if (iT3 > iT) {
                iT3 = iT;
            }
            if (iT3 == Integer.MAX_VALUE) {
                iT3 = 0;
            }
        }
        if (!Float.isNaN(this.p)) {
            int iT4 = vj30Var.T(this.p);
            if (iT4 < 0) {
                iT4 = 0;
            }
            if (iT4 > iT2) {
                iT4 = iT2;
            }
            if (iT4 != Integer.MAX_VALUE) {
                i = iT4;
            }
        }
        return r4e.a(iT3, iT, i, iT2);
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        int iK;
        int i;
        int iJ;
        int iH;
        long jA;
        long jZ0 = Z0(vj30Var);
        if (this.s) {
            jA = r4e.e(j, jZ0);
        } else {
            if (Float.isNaN(this.o)) {
                iK = p4e.k(j);
                int i2 = p4e.i(jZ0);
                if (iK > i2) {
                    iK = i2;
                }
            } else {
                iK = p4e.k(jZ0);
            }
            if (Float.isNaN(this.q)) {
                i = p4e.i(j);
                int iK2 = p4e.k(jZ0);
                if (i < iK2) {
                    i = iK2;
                }
            } else {
                i = p4e.i(jZ0);
            }
            if (Float.isNaN(this.p)) {
                iJ = p4e.j(j);
                int iH2 = p4e.h(jZ0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = p4e.j(jZ0);
            }
            if (Float.isNaN(this.r)) {
                iH = p4e.h(j);
                int iJ2 = p4e.j(jZ0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = p4e.h(jZ0);
            }
            jA = r4e.a(iK, i, iJ, iH);
        }
        pu90 pu90VarS = pj30Var.S(jA);
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new cam(pu90VarS, (byte) 28));
    }

    @Override // a.v6z
    public final int e0(c810 c810Var, pj30 pj30Var, int i) {
        long jZ0 = Z0(c810Var);
        if (p4e.g(jZ0)) {
            return p4e.i(jZ0);
        }
        if (!this.s) {
            i = r4e.f(i, jZ0);
        }
        return r4e.g(pj30Var.L(i), jZ0);
    }

    @Override // a.v6z
    public final int v(c810 c810Var, pj30 pj30Var, int i) {
        long jZ0 = Z0(c810Var);
        if (p4e.f(jZ0)) {
            return p4e.h(jZ0);
        }
        if (!this.s) {
            i = r4e.g(i, jZ0);
        }
        return r4e.f(pj30Var.b(i), jZ0);
    }

    @Override // a.v6z
    public final int w(c810 c810Var, pj30 pj30Var, int i) {
        long jZ0 = Z0(c810Var);
        if (p4e.f(jZ0)) {
            return p4e.h(jZ0);
        }
        if (!this.s) {
            i = r4e.g(i, jZ0);
        }
        return r4e.f(pj30Var.D(i), jZ0);
    }
}
