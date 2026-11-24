package a;

import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class sp70 extends w46 {
    public final ucu A;
    public final dcu B;
    public final mne C;
    public final xcc D;
    public final xyb E;
    public final hsj0 F;
    public final t0u G;
    public final oct H;
    public final y5s I;
    public final m1e J;
    public final iw20 K;
    public final khf0 L;
    public final pru M;
    public boolean N;
    public boolean O;
    public final p7m0 P;
    public final p7m0 Q;
    public final p7m0 R;
    public final q99 S;
    public final p7m0 T;
    public final p7m0 U;
    public final i1w0 b;
    public final gle0 c;
    public final gmt d;
    public final fq e;
    public final g9c f;
    public final ztt g;
    public final wni0 h;
    public final uni0 i;
    public final but j;
    public final pbu k;
    public final fqx l;
    public final oqt m;
    public final utt n;
    public final lzt o;
    public final l1u p;
    public final k1u q;
    public final vcu r;
    public final dqx s;
    public final xsi0 t;
    public final tni0 u;
    public final fpx v;
    public final spx w;
    public final hj50 x;
    public final d3c y;
    public final ycu z;

    public sp70(i1w0 i1w0Var, csr csrVar, gle0 gle0Var, gmt gmtVar, fq fqVar, g9c g9cVar, ztt zttVar, wni0 wni0Var, uni0 uni0Var, but butVar, pbu pbuVar, fqx fqxVar, qa60 qa60Var, oqt oqtVar, utt uttVar, lzt lztVar, l1u l1uVar, k1u k1uVar, vcu vcuVar, dqx dqxVar, xsi0 xsi0Var, tni0 tni0Var, fpx fpxVar, spx spxVar, hj50 hj50Var, d3c d3cVar, ycu ycuVar, ucu ucuVar, dcu dcuVar, mne mneVar, xcc xccVar, xyb xybVar, hsj0 hsj0Var, t0u t0uVar, oct octVar, y5s y5sVar, m1e m1eVar, iw20 iw20Var, khf0 khf0Var, pru pruVar) {
        i1w0Var.getClass();
        csrVar.getClass();
        gmtVar.getClass();
        fqVar.getClass();
        g9cVar.getClass();
        zttVar.getClass();
        wni0Var.getClass();
        uni0Var.getClass();
        butVar.getClass();
        pbuVar.getClass();
        fqxVar.getClass();
        qa60Var.getClass();
        oqtVar.getClass();
        uttVar.getClass();
        lztVar.getClass();
        l1uVar.getClass();
        k1uVar.getClass();
        vcuVar.getClass();
        dqxVar.getClass();
        xsi0Var.getClass();
        tni0Var.getClass();
        fpxVar.getClass();
        spxVar.getClass();
        hj50Var.getClass();
        d3cVar.getClass();
        ucuVar.getClass();
        dcuVar.getClass();
        xccVar.getClass();
        xybVar.getClass();
        hsj0Var.getClass();
        t0uVar.getClass();
        y5sVar.getClass();
        this.b = i1w0Var;
        this.c = gle0Var;
        this.d = gmtVar;
        this.e = fqVar;
        this.f = g9cVar;
        this.g = zttVar;
        this.h = wni0Var;
        this.i = uni0Var;
        this.j = butVar;
        this.k = pbuVar;
        this.l = fqxVar;
        this.m = oqtVar;
        this.n = uttVar;
        this.o = lztVar;
        this.p = l1uVar;
        this.q = k1uVar;
        this.r = vcuVar;
        this.s = dqxVar;
        this.t = xsi0Var;
        this.u = tni0Var;
        this.v = fpxVar;
        this.w = spxVar;
        this.x = hj50Var;
        this.y = d3cVar;
        this.z = ycuVar;
        this.A = ucuVar;
        this.B = dcuVar;
        this.C = mneVar;
        this.D = xccVar;
        this.E = xybVar;
        this.F = hsj0Var;
        this.G = t0uVar;
        this.H = octVar;
        this.I = y5sVar;
        this.J = m1eVar;
        this.K = iw20Var;
        this.L = khf0Var;
        this.M = pruVar;
        this.P = q7m0.a(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        this.Q = q7m0.a(bool);
        this.R = q7m0.a(bool);
        yje yjeVar = null;
        this.S = vtb.d(0, null, null, 7);
        this.T = q7m0.a(ap70.f1238a);
        this.U = q7m0.a(new ip70(false, false, false, csr.e));
        G(csrVar, hg8.f13005a);
        fnq fnqVar = new fnq(m1eVar.b(), new kp70(this, yjeVar, (byte) 2), (byte) 4);
        bvc bvcVarA = jiu0.a(this);
        rwj rwjVar = mneVar.f22085a;
        sac.T(fnqVar, d5c.S(bvcVarA, rwjVar), foe.h);
        Class<sp70> cls = sp70.class;
        slb.U(new dnq(new fnq(new m430(qa60Var.a(), this, (byte) 9), new gq50(2, this, cls, "handleCommand", "handleCommand(Lorg/xplatform/core/domain/GameCommand;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 18), (byte) 4), new pr60(3, yjeVar, (byte) 15), (byte) 1), d5c.S(jiu0.a(this), rwjVar));
        sac.V(jiu0.a(this), new gk70(1, this, cls, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, mneVar.f22085a, new kp70(this, yjeVar, (byte) 1), 10);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0103  */
    /* JADX WARN: Code duplicated, block: B:55:0x0116  */
    /* JADX WARN: Code duplicated, block: B:57:0x0122  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(boolean z, zje zjeVar) {
        lp70 lp70Var;
        iy5 iy5Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        csr csrVarA;
        p7m0 p7m0Var;
        Object value;
        if (zjeVar instanceof lp70) {
            lp70Var = (lp70) zjeVar;
            int i = lp70Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                lp70Var.m = i - Integer.MIN_VALUE;
            } else {
                lp70Var = new lp70(this, zjeVar);
            }
        } else {
            lp70Var = new lp70(this, zjeVar);
        }
        Object objA = lp70Var.k;
        wne wneVar = wne.f39444a;
        int i2 = lp70Var.m;
        y5s y5sVar = this.I;
        ztt zttVar = this.g;
        boolean z6 = true;
        if (i2 == 0) {
            z1x.P(objA);
            long jA = y5sVar.f42064a.a();
            lp70Var.i = z;
            lp70Var.m = 1;
            objA = this.j.a(jA, lp70Var);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z = lp70Var.i;
            z1x.P(objA);
        } else {
            if (i2 == 2) {
                z3 = lp70Var.j;
                z2 = lp70Var.i;
                z1x.P(objA);
                ((Boolean) objA).getClass();
                this.i.f35963a.f26724a.t = true;
                j5t.a(Boolean.TRUE, "bonusForAccountChecked");
                long jA2 = y5sVar.f42064a.a();
                lp70Var.i = z2;
                lp70Var.j = z3;
                lp70Var.m = 3;
                objA = this.k.a(jA2, lp70Var);
                if (objA != wneVar) {
                    z4 = z2;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = lp70Var.j;
            z4 = lp70Var.i;
            z1x.P(objA);
        }
        if (((Boolean) objA).booleanValue() || !z3) {
            z5 = false;
        } else {
            z5 = true;
        }
        csrVarA = zttVar.a();
        d3c d3cVar = this.y;
        if (z5) {
            csrVarA.getClass();
            w(new iy5(csrVarA));
        } else if (!csrVarA.a() && !d3cVar.a()) {
            if (z4) {
                F(dp70.f6450a);
                csr csrVar = csr.e;
                csrVar.getClass();
                w(new iy5(csrVar));
            } else {
                Boolean bool = Boolean.TRUE;
                p7m0 p7m0Var2 = this.Q;
                p7m0Var2.getClass();
                p7m0Var2.o(null, bool);
            }
        }
        if (!z3 && (!d3cVar.a() || zttVar.a().a())) {
            z6 = false;
        }
        this.O = z6;
        do {
            p7m0Var = this.U;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, ip70.a((ip70) value, this.O, false, false, null, 14)));
        return Unit.f46060a;
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        if (z) {
            if (!zttVar.a().a()) {
                F(new ep70());
            }
            iy5Var = new iy5(csr.e);
        } else {
            iy5Var = zBooleanValue ? new iy5(zttVar.a()) : null;
        }
        if (iy5Var != null) {
            lp70Var.i = z;
            lp70Var.j = zBooleanValue;
            lp70Var.m = 2;
            Object objF = this.e.f(iy5Var, lp70Var);
            if (objF != wneVar) {
                z2 = z;
                z3 = zBooleanValue;
                objA = objF;
                ((Boolean) objA).getClass();
                this.i.f35963a.f26724a.t = true;
                j5t.a(Boolean.TRUE, "bonusForAccountChecked");
                long jA3 = y5sVar.f42064a.a();
                lp70Var.i = z2;
                lp70Var.j = z3;
                lp70Var.m = 3;
                objA = this.k.a(jA3, lp70Var);
                if (objA != wneVar) {
                    z4 = z2;
                    if (((Boolean) objA).booleanValue()) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    csrVarA = zttVar.a();
                    d3c d3cVar2 = this.y;
                    if (z5) {
                        csrVarA.getClass();
                        w(new iy5(csrVarA));
                    } else if (!csrVarA.a()) {
                        if (z4) {
                            F(dp70.f6450a);
                            csr csrVar2 = csr.e;
                            csrVar2.getClass();
                            w(new iy5(csrVar2));
                        } else {
                            Boolean bool2 = Boolean.TRUE;
                            p7m0 p7m0Var3 = this.Q;
                            p7m0Var3.getClass();
                            p7m0Var3.o(null, bool2);
                        }
                    }
                    if (!z3) {
                        z6 = false;
                    }
                    this.O = z6;
                    do {
                        p7m0Var = this.U;
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, ip70.a((ip70) value, this.O, false, false, null, 14)));
                    return Unit.f46060a;
                }
            }
        } else {
            z2 = z;
            z3 = zBooleanValue;
            this.i.f35963a.f26724a.t = true;
            j5t.a(Boolean.TRUE, "bonusForAccountChecked");
            long jA4 = y5sVar.f42064a.a();
            lp70Var.i = z2;
            lp70Var.j = z3;
            lp70Var.m = 3;
            objA = this.k.a(jA4, lp70Var);
            if (objA != wneVar) {
                z4 = z2;
                if (((Boolean) objA).booleanValue()) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                csrVarA = zttVar.a();
                d3c d3cVar3 = this.y;
                if (z5) {
                    csrVarA.getClass();
                    w(new iy5(csrVarA));
                } else if (!csrVarA.a()) {
                    if (z4) {
                        F(dp70.f6450a);
                        csr csrVar3 = csr.e;
                        csrVar3.getClass();
                        w(new iy5(csrVar3));
                    } else {
                        Boolean bool3 = Boolean.TRUE;
                        p7m0 p7m0Var4 = this.Q;
                        p7m0Var4.getClass();
                        p7m0Var4.o(null, bool3);
                    }
                }
                if (!z3) {
                    z6 = false;
                }
                this.O = z6;
                do {
                    p7m0Var = this.U;
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, ip70.a((ip70) value, this.O, false, false, null, 14)));
                return Unit.f46060a;
            }
        }
        return wneVar;
    }

    public final void B() {
        i1w0 i1w0Var = this.b;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(long j, zje zjeVar, csr csrVar) {
        mp70 mp70Var;
        long j2;
        csr csrVar2;
        long j3;
        csr csrVar3;
        if (zjeVar instanceof mp70) {
            mp70Var = (mp70) zjeVar;
            int i = mp70Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                mp70Var.n = i - Integer.MIN_VALUE;
            } else {
                mp70Var = new mp70(this, zjeVar);
            }
        } else {
            mp70Var = new mp70(this, zjeVar);
        }
        Object objA = mp70Var.l;
        wne wneVar = wne.f39444a;
        int i2 = mp70Var.n;
        oct octVar = this.H;
        if (i2 == 0) {
            z1x.P(objA);
            mp70Var.i = csrVar;
            mp70Var.k = j;
            mp70Var.n = 1;
            objA = this.z.a(j, mp70Var);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                j3 = mp70Var.k;
                csrVar3 = mp70Var.i;
                z1x.P(objA);
                return octVar.a(j3, csrVar3, (String) objA);
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j4 = mp70Var.k;
            octVar = mp70Var.j;
            csr csrVar4 = mp70Var.i;
            z1x.P(objA);
            j2 = j4;
            csrVar2 = csrVar4;
            oct octVar2 = octVar;
            boolean zBooleanValue = ((Boolean) objA).booleanValue();
            String string = UUID.randomUUID().toString();
            string.getClass();
            return octVar2.b(j2, csrVar2, zBooleanValue, string);
        }
        j = mp70Var.k;
        csrVar = mp70Var.i;
        z1x.P(objA);
        a570 a570Var = (a570) objA;
        if (a570Var != null) {
            if (a570Var instanceof w470) {
                mp70Var.i = csrVar;
                mp70Var.k = j;
                mp70Var.n = 2;
                objA = this.A.a(j, mp70Var);
                if (objA != wneVar) {
                    j3 = j;
                    csrVar3 = csrVar;
                    return octVar.a(j3, csrVar3, (String) objA);
                }
            } else if (a570Var instanceof z470) {
                mp70Var.i = csrVar;
                mp70Var.j = octVar;
                mp70Var.k = j;
                mp70Var.n = 3;
                objA = this.B.a(j, mp70Var);
                if (objA != wneVar) {
                    j2 = j;
                    csrVar2 = csrVar;
                    oct octVar3 = octVar;
                    boolean zBooleanValue2 = ((Boolean) objA).booleanValue();
                    String string2 = UUID.randomUUID().toString();
                    string2.getClass();
                    return octVar3.b(j2, csrVar2, zBooleanValue2, string2);
                }
            }
            return wneVar;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b6, code lost:
    
        if (A(false, r3) == r4) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015a, code lost:
    
        if (A(r5, r3) == r4) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(a.zy5 r21, a.yje r22) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.sp70.D(a.zy5, a.yje):java.lang.Object");
    }

    public final void E(Throwable th) {
        sac.V(jiu0.a(this), op70.f25629a, null, this.C.f22085a, new wk70(this, th, null, (byte) 18), 10);
    }

    public final void F(hp70 hp70Var) {
        sac.V(jiu0.a(this), new wk60((byte) 25), null, null, new wk70(this, hp70Var, null, (byte) 20), 14);
    }

    public final void G(csr csrVar, hg8 hg8Var) {
        boolean z = this.M.a().d.f27973a.g;
        if (!csrVar.f4905a.f3145a.b() || z) {
            if (!csrVar.a()) {
                iw20 iw20Var = this.K;
                iw20Var.getClass();
                b6s b6sVar = (b6s) iw20Var.f15470a;
                b6sVar.getClass();
                a6s a6sVar = b6sVar.f2070a;
                a6sVar.getClass();
                a6sVar.f332a = hg8Var;
            }
            this.h.a(csrVar);
        }
    }

    public final void w(zy5 zy5Var) {
        sac.V(jiu0.a(this), jp70.f16888a, null, this.C.f22085a, new wk70(this, zy5Var, null, (byte) 17), 10);
    }

    public final void x(boolean z) {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.U;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, ip70.a((ip70) value, false, false, (!this.l.a() || this.F.f13587a.f26724a.A) ? z : false, null, 11)));
    }

    public final void y(boolean z) {
        while (true) {
            p7m0 p7m0Var = this.U;
            Object value = p7m0Var.getValue();
            boolean z2 = z;
            if (p7m0Var.m(value, ip70.a((ip70) value, false, z2, false, null, 13))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public final void z() {
        sac.V(jiu0.a(this), new gk70(1, this, sp70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, this.C.f22085a, new kp70(this, null, (byte) 0), 10);
    }
}
