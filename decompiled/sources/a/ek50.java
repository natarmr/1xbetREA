package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ek50 extends lm40 implements hps0, vj50 {
    public vj50 o;
    public yj50 p;
    public ek50 q;
    public final String r;

    public ek50(vj50 vj50Var, yj50 yj50Var) {
        this.o = vj50Var;
        this.p = yj50Var == null ? new yj50() : yj50Var;
        this.r = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        ek50 ek50VarA1 = this.n ? a1() : null;
        long jC = ek50VarA1 != null ? ek50VarA1.C(i, j) : 0L;
        return ne60.f(jC, this.o.C(i, ne60.e(j, jC)));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r9 == r1) goto L27;
     */
    @Override // a.vj50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I0(long r7, a.yje r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof a.dk50
            if (r0 == 0) goto L13
            r0 = r9
            a.dk50 r0 = (a.dk50) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L1a
        L13:
            a.dk50 r0 = new a.dk50
            a.zje r9 = (a.zje) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            long r6 = r0.i
            a.z1x.P(r9)
            goto L6c
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L35:
            long r7 = r0.i
            a.z1x.P(r9)
            goto L53
        L3b:
            a.z1x.P(r9)
            boolean r9 = r6.n
            if (r9 == 0) goto L46
            a.ek50 r3 = r6.a1()
        L46:
            if (r3 == 0) goto L58
            r0.i = r7
            r0.l = r5
            java.lang.Object r9 = r3.I0(r7, r0)
            if (r9 != r1) goto L53
            goto L6a
        L53:
            a.g6u0 r9 = (a.g6u0) r9
            long r2 = r9.f10786a
            goto L5a
        L58:
            r2 = 0
        L5a:
            a.vj50 r6 = r6.o
            long r7 = a.g6u0.d(r7, r2)
            r0.i = r2
            r0.l = r4
            java.lang.Object r9 = r6.I0(r7, r0)
            if (r9 != r1) goto L6b
        L6a:
            return r1
        L6b:
            r6 = r2
        L6c:
            a.g6u0 r9 = (a.g6u0) r9
            long r8 = r9.f10786a
            long r6 = a.g6u0.e(r6, r8)
            a.g6u0 r8 = new a.g6u0
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ek50.I0(long, a.yje):java.lang.Object");
    }

    @Override // a.lm40
    public final void R0() {
        yj50 yj50Var = this.p;
        yj50Var.f42727a = this;
        yj50Var.b = null;
        this.q = null;
        yj50Var.c = new np30(this, (byte) 19);
        yj50Var.d = N0();
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        long jS = this.o.S(i, j, j2);
        ek50 ek50VarA1 = this.n ? a1() : null;
        return ne60.f(jS, ek50VarA1 != null ? ek50VarA1.S(i, ne60.f(j, jS), ne60.e(j2, jS)) : 0L);
    }

    @Override // a.lm40
    public final void S0() {
        mie0 mie0Var = new mie0();
        etm0.u(this, new cx2(mie0Var, (byte) 7));
        ek50 ek50Var = (ek50) ((hps0) mie0Var.f21842a);
        this.q = ek50Var;
        yj50 yj50Var = this.p;
        yj50Var.b = ek50Var;
        if (yj50Var.f42727a == this) {
            yj50Var.f42727a = null;
            yj50Var.d = null;
            yj50Var.c = knx.h;
        }
    }

    public final vne Z0() {
        ek50 ek50VarA1 = a1();
        vne vneVarZ0 = ek50VarA1 != null ? ek50VarA1.Z0() : null;
        if (vneVarZ0 != null && d5c.R(vneVarZ0)) {
            return vneVarZ0;
        }
        vne vneVar = this.p.d;
        if (vneVar != null) {
            return vneVar;
        }
        jf4.n("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final ek50 a1() {
        tzi tziVar;
        hps0 hps0Var = null;
        if (!this.n) {
            return null;
        }
        if (!this.f20279a.n) {
            xcx.b("visitAncestors called on an unattached node");
        }
        lm40 lm40Var = this.f20279a.e;
        e7z e7zVarZ = vcc.Z(this);
        loop0: while (e7zVarZ != null) {
            if ((((lm40) e7zVarZ.h1.g).d & 262144) != 0) {
                while (lm40Var != null) {
                    if ((lm40Var.c & 262144) != 0) {
                        lm40 lm40VarV = lm40Var;
                        xz40 xz40Var = null;
                        while (lm40VarV != null) {
                            if (lm40VarV instanceof hps0) {
                                hps0 hps0Var2 = (hps0) lm40VarV;
                                if (Intrinsics.d(this.r, hps0Var2.j()) && ek50.class == hps0Var2.getClass()) {
                                    hps0Var = hps0Var2;
                                    break loop0;
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
        return (ek50) hps0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        ck50 ck50Var;
        long j3;
        long j4;
        long j5;
        long j6;
        if (zjeVar instanceof ck50) {
            ck50Var = (ck50) zjeVar;
            int i = ck50Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ck50Var.m = i - Integer.MIN_VALUE;
            } else {
                ck50Var = new ck50(this, zjeVar);
            }
        } else {
            ck50Var = new ck50(this, zjeVar);
        }
        ck50 ck50Var2 = ck50Var;
        Object objG = ck50Var2.k;
        wne wneVar = wne.f39444a;
        int i2 = ck50Var2.m;
        ek50 ek50VarA1 = null;
        if (i2 == 0) {
            z1x.P(objG);
            vj50 vj50Var = this.o;
            ck50Var2.i = j;
            ck50Var2.j = j2;
            ck50Var2.m = 1;
            objG = vj50Var.g(j, j2, ck50Var2);
            if (objG != wneVar) {
                j3 = j2;
            }
            return wneVar;
        }
        if (i2 == 1) {
            long j7 = ck50Var2.j;
            long j8 = ck50Var2.i;
            z1x.P(objG);
            j3 = j7;
            j = j8;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j6 = ck50Var2.i;
            z1x.P(objG);
        }
        j5 = ((g6u0) objG).f10786a;
        j4 = j6;
        return new g6u0(g6u0.e(j4, j5));
        j4 = ((g6u0) objG).f10786a;
        boolean z = this.n;
        if (!z) {
            ek50VarA1 = this.q;
        } else if (z) {
            ek50VarA1 = a1();
        }
        vj50 vj50Var2 = ek50VarA1;
        if (vj50Var2 != null) {
            long jE = g6u0.e(j, j4);
            long jD = g6u0.d(j3, j4);
            ck50Var2.i = j4;
            ck50Var2.m = 2;
            objG = vj50Var2.g(jE, jD, ck50Var2);
            if (objG != wneVar) {
                j6 = j4;
                j5 = ((g6u0) objG).f10786a;
                j4 = j6;
            }
            return wneVar;
        }
        j5 = 0;
        return new g6u0(g6u0.e(j4, j5));
    }

    @Override // a.hps0
    public final Object j() {
        return this.r;
    }
}
