package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class z1 extends lm40 implements ehl, v6z, qai0 {
    public u12 o;
    public qge p;
    public float q;
    public a4d r;
    public boolean s;
    public String t;
    public t4e u;

    public z1(u12 u12Var, qge qgeVar, float f, a4d a4dVar, boolean z, String str, t4e t4eVar) {
        this.o = u12Var;
        this.p = qgeVar;
        this.q = f;
        this.r = a4dVar;
        this.s = z;
        this.t = str;
        this.u = t4eVar;
    }

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    @Override // a.v6z
    public final int U(c810 c810Var, pj30 pj30Var, int i) {
        long jB = r4e.b(0, 0, 0, i, 7);
        t4e t4eVar = this.u;
        if (t4eVar != null) {
            t4eVar.h(jB);
        }
        if (a1().i() == 9205357640488583168L) {
            return pj30Var.P(i);
        }
        long jB1 = b1(jB);
        return Math.max(p4e.k(jB1), pj30Var.P(i));
    }

    public final long Z0(long j) {
        if (h7k0.f(j)) {
            return 0L;
        }
        long jI = a1().i();
        if (jI != 9205357640488583168L) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32));
            if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            }
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI & 4294967295L));
            if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
            long jA = this.p.a(jFloatToRawIntBits, j);
            if (Math.abs(Float.intBitsToFloat((int) (jA >> 32))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (4294967295L & jA))) <= Float.MAX_VALUE) {
                return q8x.I(jFloatToRawIntBits, jA);
            }
        }
        return j;
    }

    public abstract pm80 a1();

    public final long b1(long j) {
        float fK;
        int iJ;
        float f;
        boolean zG = p4e.g(j);
        boolean zF = p4e.f(j);
        if (!zG || !zF) {
            pm80 pm80VarA1 = a1();
            boolean z = p4e.e(j) && p4e.d(j);
            long jI = pm80VarA1.i();
            if (jI != 9205357640488583168L) {
                if (!z || (!zG && !zF)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI & 4294967295L));
                    if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                        int i = iut0.b;
                        float fK2 = p4e.k(j);
                        float fI = p4e.i(j);
                        if (fIntBitsToFloat < fK2) {
                            fIntBitsToFloat = fK2;
                        }
                        if (fIntBitsToFloat <= fI) {
                            fI = fIntBitsToFloat;
                        }
                        fK = fI;
                    } else {
                        fK = p4e.k(j);
                    }
                    if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                        int i2 = iut0.b;
                        float fJ = p4e.j(j);
                        float fH = p4e.h(j);
                        if (fIntBitsToFloat2 < fJ) {
                            fIntBitsToFloat2 = fJ;
                        }
                        if (fIntBitsToFloat2 <= fH) {
                            fH = fIntBitsToFloat2;
                        }
                        f = fH;
                    } else {
                        iJ = p4e.j(j);
                    }
                    long jZ0 = Z0((((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fK)) << 32));
                    return p4e.b(j, r4e.g(si30.b(Float.intBitsToFloat((int) (jZ0 >> 32))), j), 0, r4e.f(si30.b(Float.intBitsToFloat((int) (jZ0 & 4294967295L))), j), 0, 10);
                }
                fK = p4e.i(j);
                iJ = p4e.h(j);
                f = iJ;
                long jZ1 = Z0((((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fK)) << 32));
                return p4e.b(j, r4e.g(si30.b(Float.intBitsToFloat((int) (jZ1 >> 32))), j), 0, r4e.f(si30.b(Float.intBitsToFloat((int) (jZ1 & 4294967295L))), j), 0, 10);
            }
            if (z && (!(pm80VarA1 instanceof mz3) || ((lz3) ((mz3) pm80VarA1).u.f40549a.getValue()).a() != null)) {
                return p4e.b(j, p4e.i(j), 0, p4e.h(j), 0, 10);
            }
        }
        return j;
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        t4e t4eVar = this.u;
        if (t4eVar != null) {
            t4eVar.h(j);
        }
        pu90 pu90VarS = pj30Var.S(b1(j));
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new y1(pu90VarS, (byte) 0));
    }

    @Override // a.v6z
    public final int e0(c810 c810Var, pj30 pj30Var, int i) {
        long jB = r4e.b(0, 0, 0, i, 7);
        t4e t4eVar = this.u;
        if (t4eVar != null) {
            t4eVar.h(jB);
        }
        if (a1().i() == 9205357640488583168L) {
            return pj30Var.L(i);
        }
        long jB1 = b1(jB);
        return Math.max(p4e.k(jB1), pj30Var.L(i));
    }

    @Override // a.ehl
    public final void u0(g7z g7zVar) {
        a6a a6aVar = g7zVar.f10839a;
        long jZ0 = Z0(a6aVar.d());
        long jA = this.o.a(iut0.e(jZ0), iut0.e(a6aVar.d()), g7zVar.getLayoutDirection());
        int i = (int) (jA >> 32);
        int i2 = (int) (jA & 4294967295L);
        nr nrVar = a6aVar.b;
        long jP = nrVar.p();
        nrVar.i().l();
        try {
            fvt0 fvt0Var = (fvt0) nrVar.b;
            if (this.s) {
                fvt0.m(fvt0Var, 0.0f, 0.0f, 31);
            }
            fvt0Var.A(i, i2);
            a1().e(g7zVar, jZ0, this.q, this.r);
            nrVar.i().i();
            nrVar.H(jP);
            g7zVar.a();
        } catch (Throwable th) {
            defpackage.c.g(nrVar, jP);
            throw th;
        }
    }

    @Override // a.v6z
    public final int v(c810 c810Var, pj30 pj30Var, int i) {
        long jB = r4e.b(0, i, 0, 0, 13);
        t4e t4eVar = this.u;
        if (t4eVar != null) {
            t4eVar.h(jB);
        }
        if (a1().i() == 9205357640488583168L) {
            return pj30Var.b(i);
        }
        long jB1 = b1(jB);
        return Math.max(p4e.j(jB1), pj30Var.b(i));
    }

    @Override // a.v6z
    public final int w(c810 c810Var, pj30 pj30Var, int i) {
        long jB = r4e.b(0, i, 0, 0, 13);
        t4e t4eVar = this.u;
        if (t4eVar != null) {
            t4eVar.h(jB);
        }
        if (a1().i() == 9205357640488583168L) {
            return pj30Var.D(i);
        }
        long jB1 = b1(jB);
        return Math.max(p4e.j(jB1), pj30Var.D(i));
    }

    @Override // a.qai0
    public final void x0(abi0 abi0Var) {
        String str = this.t;
        if (str != null) {
            yai0.b(abi0Var, str);
            yai0.e(abi0Var, 5);
        }
    }
}
