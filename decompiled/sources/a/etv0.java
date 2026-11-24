package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class etv0 extends lm40 implements vld {
    public int A;
    public xcz o;
    public xcz p;
    public ywv0 q;
    public boolean r;
    public bby s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public static boolean b1(awv0 awv0Var) {
        dwv0 dwv0Var = awv0Var.f1594a;
        if (dwv0Var instanceof bwv0) {
            mcz mczVar = ((bwv0) dwv0Var).f3347a;
            mczVar.getClass();
            ncz nczVar = (ncz) CollectionsKt.f0(mczVar.l);
            if (nczVar != null && nczVar.f23317a == mczVar.o - 1) {
                return true;
            }
        } else if (!(dwv0Var instanceof cwv0)) {
            t9f.b();
            return false;
        }
        return false;
    }

    @Override // a.lm40
    public final void R0() {
        muv0 muv0Var = this.q.e;
        muv0Var.d++;
        boolean z = this.r;
        muv0Var.f = z;
        if (!z) {
            ((hgk0) muv0Var.i).setValue(zsv0.f44926a);
        }
        d1();
        this.s = qjj.W(N0(), null, null, new k6s0(this, null, (byte) 28), 3);
    }

    @Override // a.lm40
    public final void S0() {
        d1();
        muv0 muv0Var = this.q.e;
        muv0Var.f = false;
        ((hgk0) muv0Var.i).setValue(zsv0.f44926a);
        muv0 muv0Var2 = this.q.e;
        int i = muv0Var2.d - 1;
        muv0Var2.d = i >= 0 ? i : 0;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:59:0x0159  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z0(svv0 svv0Var, awv0 awv0Var, yje yjeVar) {
        ctv0 ctv0Var;
        boolean zE;
        Object obj;
        boolean z;
        svv0 svv0Var2;
        awv0 awv0Var2;
        svv0 svv0Var3;
        int iIntValue;
        int i;
        String str;
        int iIntValue2;
        int i2;
        if (yjeVar instanceof ctv0) {
            ctv0Var = (ctv0) yjeVar;
            int i3 = ctv0Var.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ctv0Var.n = i3 - Integer.MIN_VALUE;
            } else {
                ctv0Var = new ctv0(this, yjeVar);
            }
        } else {
            ctv0Var = new ctv0(this, yjeVar);
        }
        Object objA1 = ctv0Var.l;
        Object obj2 = wne.f39444a;
        int i4 = ctv0Var.n;
        if (i4 == 0) {
            z1x.P(objA1);
            dwv0 dwv0Var = awv0Var.f1594a;
            if (dwv0Var instanceof bwv0) {
                zE = bzs0.e((bwv0) dwv0Var, awv0Var.b);
            } else {
                if (!(dwv0Var instanceof cwv0)) {
                    t9f.b();
                    return null;
                }
                zE = true;
            }
            if (svv0Var != null) {
                if (svv0Var instanceof rvv0) {
                    e1(0, 0, 0, "IDLE", b1(awv0Var), zE);
                } else {
                    z = zE;
                    obj = null;
                    if (svv0Var instanceof nvv0) {
                        nvv0 nvv0Var = (nvv0) svv0Var;
                        c1(nvv0Var.f24206a, 0, awv0Var);
                        e1(nvv0Var.f24206a, nvv0Var.b, 0, "ARMED_IDLE", true, z);
                    } else if (svv0Var instanceof pvv0) {
                        if (!this.o.j.a()) {
                            pvv0 pvv0Var = (pvv0) svv0Var;
                            c1(pvv0Var.b, pvv0Var.d, awv0Var);
                            int i5 = pvv0Var.f27681a;
                            ctv0Var.i = svv0Var;
                            ctv0Var.j = awv0Var;
                            ctv0Var.k = z;
                            ctv0Var.n = 1;
                            objA1 = a1(i5, ctv0Var);
                            if (objA1 != obj2) {
                                svv0Var3 = svv0Var;
                                awv0Var2 = awv0Var;
                                iIntValue = ((Number) objA1).intValue();
                                pvv0 pvv0Var2 = (pvv0) svv0Var3;
                                i = pvv0Var2.f27681a;
                                if (i != 0) {
                                    this.z = iIntValue;
                                    this.x += iIntValue;
                                }
                                if (i == 0) {
                                    str = "ARMED_IDLE";
                                } else {
                                    str = "PINNING";
                                }
                                e1(pvv0Var2.b, pvv0Var2.c, i, str, true, z);
                            }
                            return obj2;
                        }
                        this.t = false;
                        this.v = 0;
                        this.w = 0;
                        this.x = 0;
                        this.y = 0;
                        this.z = 0;
                        e1(0, 0, 0, "DISARM_USER", b1(awv0Var), z);
                    } else if (svv0Var instanceof qvv0) {
                        if (!this.o.j.a()) {
                            qvv0 qvv0Var = (qvv0) svv0Var;
                            this.y = qvv0Var.d;
                            int i6 = qvv0Var.f29408a;
                            ctv0Var.i = svv0Var;
                            ctv0Var.j = awv0Var;
                            ctv0Var.k = z;
                            ctv0Var.n = 2;
                            objA1 = a1(i6, ctv0Var);
                            if (objA1 != obj2) {
                                svv0Var2 = svv0Var;
                                awv0Var2 = awv0Var;
                                iIntValue2 = ((Number) objA1).intValue();
                                qvv0 qvv0Var2 = (qvv0) svv0Var2;
                                i2 = qvv0Var2.f29408a;
                                if (i2 != 0) {
                                    this.z = iIntValue2;
                                    this.x += iIntValue2;
                                }
                                e1(qvv0Var2.b, qvv0Var2.c, i2, "ESTIMATING", false, z);
                            }
                            return obj2;
                        }
                        this.t = false;
                        this.v = 0;
                        this.w = 0;
                        this.x = 0;
                        this.y = 0;
                        this.z = 0;
                        e1(0, 0, 0, "DISARM_USER", b1(awv0Var), z);
                    } else if (svv0Var instanceof ovv0) {
                        tvv0 tvv0Var = ((ovv0) svv0Var).f25944a;
                        if (tvv0Var == tvv0.b) {
                            this.t = false;
                            this.v = 0;
                            this.w = 0;
                            this.x = 0;
                            this.y = 0;
                            this.z = 0;
                            e1(0, 0, 0, "DISARM_USER", b1(awv0Var), z);
                        } else {
                            this.t = false;
                            this.v = 0;
                            this.w = 0;
                            this.x = 0;
                            this.y = 0;
                            this.z = 0;
                            e1(0, 0, 0, kng0.k("DISARM_", tvv0Var.name()), b1(awv0Var), z);
                        }
                    }
                }
                awv0Var2 = awv0Var;
            } else {
                obj = null;
            }
            t9f.b();
            return obj;
        }
        if (i4 == 1) {
            boolean z2 = ctv0Var.k;
            awv0 awv0Var3 = ctv0Var.j;
            svv0 svv0Var4 = ctv0Var.i;
            z1x.P(objA1);
            z = z2;
            svv0Var3 = svv0Var4;
            awv0Var2 = awv0Var3;
            iIntValue = ((Number) objA1).intValue();
            pvv0 pvv0Var3 = (pvv0) svv0Var3;
            i = pvv0Var3.f27681a;
            if (i != 0) {
                this.z = iIntValue;
                this.x += iIntValue;
            }
            if (i == 0) {
                str = "ARMED_IDLE";
            } else {
                str = "PINNING";
            }
            e1(pvv0Var3.b, pvv0Var3.c, i, str, true, z);
        } else {
            if (i4 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = ctv0Var.k;
            awv0 awv0Var4 = ctv0Var.j;
            svv0 svv0Var5 = ctv0Var.i;
            z1x.P(objA1);
            z = z3;
            svv0Var2 = svv0Var5;
            awv0Var2 = awv0Var4;
            iIntValue2 = ((Number) objA1).intValue();
            qvv0 qvv0Var3 = (qvv0) svv0Var2;
            i2 = qvv0Var3.f29408a;
            if (i2 != 0) {
                this.z = iIntValue2;
                this.x += iIntValue2;
            }
            e1(qvv0Var3.b, qvv0Var3.c, i2, "ESTIMATING", false, z);
        }
        dwv0 dwv0Var2 = awv0Var2.f1594a;
        if (dwv0Var2 instanceof cwv0) {
            this.A = ((cwv0) dwv0Var2).f5097a;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a1(int i, zje zjeVar) {
        dtv0 dtv0Var;
        kie0 kie0Var;
        if (zjeVar instanceof dtv0) {
            dtv0Var = (dtv0) zjeVar;
            int i2 = dtv0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dtv0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                dtv0Var = new dtv0(this, zjeVar);
            }
        } else {
            dtv0Var = new dtv0(this, zjeVar);
        }
        Object obj = dtv0Var.j;
        wne wneVar = wne.f39444a;
        int i3 = dtv0Var.l;
        try {
            if (i3 == 0) {
                z1x.P(obj);
                if (i == 0) {
                    return new Integer(0);
                }
                this.u = true;
                kie0 kie0Var2 = new kie0();
                xcz xczVar = this.o;
                c050 c050Var = c050.f3507a;
                mc0 mc0Var = new mc0(kie0Var2, i, (yje) null);
                dtv0Var.i = kie0Var2;
                dtv0Var.l = 1;
                if (xczVar.b(c050Var, mc0Var, dtv0Var) == wneVar) {
                    return wneVar;
                }
                kie0Var = kie0Var2;
            } else {
                if (i3 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kie0Var = dtv0Var.i;
                z1x.P(obj);
            }
            int i4 = kie0Var.f18333a;
            this.u = false;
            return new Integer(i4);
        } catch (Throwable th) {
            this.u = false;
            throw th;
        }
    }

    public final void c1(int i, int i2, awv0 awv0Var) {
        int i3;
        this.t = true;
        this.v = i;
        dwv0 dwv0Var = awv0Var.f1594a;
        if (dwv0Var instanceof bwv0) {
            i3 = ((bwv0) dwv0Var).f3347a.o;
        } else {
            if (!(dwv0Var instanceof cwv0)) {
                t9f.b();
                return;
            }
            i3 = 0;
        }
        this.w = i3;
        this.x = 0;
        this.y = i2;
        this.z = 0;
    }

    public final void d1() {
        bby bbyVar = this.s;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.s = null;
        this.t = false;
        this.u = false;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = -1;
    }

    public final void e1(int i, int i2, int i3, String str, boolean z, boolean z2) {
    }
}
