package a;

/* JADX INFO: loaded from: classes.dex */
public final class jy3 extends lm40 implements v6z {
    public float o;
    public boolean p;

    @Override // a.v6z
    public final int U(c810 c810Var, pj30 pj30Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.o) : pj30Var.P(i);
    }

    public final long Z0(boolean z, long j) {
        int iRound;
        int iH = p4e.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH * this.o)) <= 0) {
            return 0L;
        }
        if (!z || ny9.U(iRound, iH, j)) {
            return (((long) iRound) << 32) | (((long) iH) & 4294967295L);
        }
        return 0L;
    }

    public final long a1(boolean z, long j) {
        int iRound;
        int i = p4e.i(j);
        if (i == Integer.MAX_VALUE || (iRound = Math.round(i / this.o)) <= 0) {
            return 0L;
        }
        if (!z || ny9.U(i, iRound, j)) {
            return (((long) i) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long b1(boolean z, long j) {
        int iJ = p4e.j(j);
        int iRound = Math.round(iJ * this.o);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || ny9.U(iRound, iJ, j)) {
            return (((long) iRound) << 32) | (((long) iJ) & 4294967295L);
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        long jZ0;
        if (this.p) {
            jZ0 = Z0(true, j);
            if (qkx.a(jZ0, 0L)) {
                jZ0 = a1(true, j);
                if (qkx.a(jZ0, 0L)) {
                    jZ0 = b1(true, j);
                    if (qkx.a(jZ0, 0L)) {
                        jZ0 = c1(true, j);
                        if (qkx.a(jZ0, 0L)) {
                            jZ0 = Z0(false, j);
                            if (qkx.a(jZ0, 0L)) {
                                jZ0 = a1(false, j);
                                if (qkx.a(jZ0, 0L)) {
                                    jZ0 = b1(false, j);
                                    if (qkx.a(jZ0, 0L)) {
                                        jZ0 = c1(false, j);
                                        if (qkx.a(jZ0, 0L)) {
                                            jZ0 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            jZ0 = a1(true, j);
            if (qkx.a(jZ0, 0L)) {
                jZ0 = Z0(true, j);
                if (qkx.a(jZ0, 0L)) {
                    jZ0 = c1(true, j);
                    if (qkx.a(jZ0, 0L)) {
                        jZ0 = b1(true, j);
                        if (qkx.a(jZ0, 0L)) {
                            jZ0 = a1(false, j);
                            if (qkx.a(jZ0, 0L)) {
                                jZ0 = Z0(false, j);
                                if (qkx.a(jZ0, 0L)) {
                                    jZ0 = c1(false, j);
                                    if (qkx.a(jZ0, 0L)) {
                                        jZ0 = b1(false, j);
                                        if (qkx.a(jZ0, 0L)) {
                                            jZ0 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!qkx.a(jZ0, 0L)) {
            int i = (int) (jZ0 >> 32);
            int i2 = (int) (4294967295L & jZ0);
            if (!((i >= 0) & (i2 >= 0))) {
                zcx.a("width and height must be >= 0");
            }
            j = r4e.h(i, i, i2, i2);
        }
        pu90 pu90VarS = pj30Var.S(j);
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new y1(pu90VarS, (byte) 4));
    }

    public final long c1(boolean z, long j) {
        int iK = p4e.k(j);
        int iRound = Math.round(iK / this.o);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || ny9.U(iK, iRound, j)) {
            return (((long) iK) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // a.v6z
    public final int e0(c810 c810Var, pj30 pj30Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.o) : pj30Var.L(i);
    }

    @Override // a.v6z
    public final int v(c810 c810Var, pj30 pj30Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.o) : pj30Var.b(i);
    }

    @Override // a.v6z
    public final int w(c810 c810Var, pj30 pj30Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.o) : pj30Var.D(i);
    }
}
