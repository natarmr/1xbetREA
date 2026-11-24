package a;

import java.util.List;
import org.xplatform.search.impl.presentation.sport.models.SportSearchFragmentSettings;

/* JADX INFO: loaded from: classes5.dex */
public final class xpl0 extends i3t0 {
    public static final /* synthetic */ int P = 0;
    public final cyu A;
    public final mne B;
    public final x4u C;
    public final ilp0 D;
    public final hjd E;
    public final m1e F;
    public final bzt G;
    public final r9u H;
    public final n0o0 I;
    public final int J;
    public c4m0 K;
    public bby L;
    public bby M;
    public bby N;
    public bby O;
    public final SportSearchFragmentSettings o;
    public final pru p;
    public final u8u q;
    public final wdu r;
    public final wdu s;
    public final rrd t;
    public final wdu u;
    public final j3c v;
    public final luu w;
    public final lbu x;
    public final ivn y;
    public final s31 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public xpl0(vzg0 vzg0Var, SportSearchFragmentSettings sportSearchFragmentSettings, pru pruVar, u8u u8uVar, wdu wduVar, wdu wduVar2, rrd rrdVar, wdu wduVar3, j3c j3cVar, luu luuVar, svu svuVar, ctf0 ctf0Var, lbu lbuVar, ivn ivnVar, y78 y78Var, i1w0 i1w0Var, s31 s31Var, cyu cyuVar, mne mneVar, x4u x4uVar, ilp0 ilp0Var, hjd hjdVar, m1e m1eVar, bzt bztVar, r9u r9uVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(vzg0Var, new ge2(ctf0Var, y78Var, (byte) 2), cvm0.p(vs10Var, rwjVar), new j1l0(svuVar, (byte) 6));
        this.o = sportSearchFragmentSettings;
        this.p = pruVar;
        this.q = u8uVar;
        this.r = wduVar;
        this.s = wduVar2;
        this.t = rrdVar;
        this.u = wduVar3;
        this.v = j3cVar;
        this.w = luuVar;
        this.x = lbuVar;
        this.y = ivnVar;
        this.z = s31Var;
        this.A = cyuVar;
        this.B = mneVar;
        this.C = x4uVar;
        this.D = ilp0Var;
        this.E = hjdVar;
        this.F = m1eVar;
        this.G = bztVar;
        this.H = r9uVar;
        byte b = 0;
        this.I = maz.b(new lpl0(this, b));
        this.J = bztVar.f3488a.a().r;
        Q();
        v3c.N(this.O);
        yje yjeVar = null;
        this.O = i3t0.F(this, hjdVar, null, null, new gcl0((byte) 14), 119);
        P();
        i3t0.K(this, null, null, new npl0(this, yjeVar, b), 3);
        sac.V(jiu0.a(this), opl0.f25647a, null, rwjVar, new d21(this, yjeVar, (byte) 17), 10);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r6 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(a.zje r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a.mpl0
            if (r0 == 0) goto L13
            r0 = r6
            a.mpl0 r0 = (a.mpl0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.mpl0 r0 = new a.mpl0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            a.ivn r5 = r5.y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            a.z1x.P(r6)
            goto L70
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L33:
            a.z1x.P(r6)
            goto L50
        L37:
            a.z1x.P(r6)
            a.y9s r6 = a.y9s.b
            r5.getClass()
            java.lang.Object r2 = r5.f15453a
            a.w5z r2 = (a.w5z) r2
            a.gmq r6 = r2.r(r6)
            r0.k = r4
            java.lang.Object r6 = a.ntb.M(r6, r0)
            if (r6 != r1) goto L50
            goto L6f
        L50:
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L5a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L7b
        L5a:
            a.y9s r6 = a.y9s.f42264a
            r5.getClass()
            java.lang.Object r5 = r5.f15453a
            a.w5z r5 = (a.w5z) r5
            a.gmq r5 = r5.r(r6)
            r0.k = r3
            java.lang.Object r6 = a.ntb.M(r5, r0)
            if (r6 != r1) goto L70
        L6f:
            return r1
        L70:
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L7c
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L7b
            goto L7c
        L7b:
            r4 = 0
        L7c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xpl0.M(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:4:0x0003, B:6:0x0016, B:8:0x0022, B:13:0x002b, B:15:0x002f, B:41:0x0087, B:42:0x008b, B:48:0x00f7, B:17:0x0035, B:19:0x0041, B:21:0x004d, B:24:0x0053, B:26:0x0057, B:29:0x005e, B:31:0x006a, B:33:0x0076, B:36:0x007c, B:38:0x0080, B:45:0x00bf, B:46:0x00c3), top: B:54:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0041 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:4:0x0003, B:6:0x0016, B:8:0x0022, B:13:0x002b, B:15:0x002f, B:41:0x0087, B:42:0x008b, B:48:0x00f7, B:17:0x0035, B:19:0x0041, B:21:0x004d, B:24:0x0053, B:26:0x0057, B:29:0x005e, B:31:0x006a, B:33:0x0076, B:36:0x007c, B:38:0x0080, B:45:0x00bf, B:46:0x00c3), top: B:54:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x004d A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:4:0x0003, B:6:0x0016, B:8:0x0022, B:13:0x002b, B:15:0x002f, B:41:0x0087, B:42:0x008b, B:48:0x00f7, B:17:0x0035, B:19:0x0041, B:21:0x004d, B:24:0x0053, B:26:0x0057, B:29:0x005e, B:31:0x006a, B:33:0x0076, B:36:0x007c, B:38:0x0080, B:45:0x00bf, B:46:0x00c3), top: B:54:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:4:0x0003, B:6:0x0016, B:8:0x0022, B:13:0x002b, B:15:0x002f, B:41:0x0087, B:42:0x008b, B:48:0x00f7, B:17:0x0035, B:19:0x0041, B:21:0x004d, B:24:0x0053, B:26:0x0057, B:29:0x005e, B:31:0x006a, B:33:0x0076, B:36:0x007c, B:38:0x0080, B:45:0x00bf, B:46:0x00c3), top: B:54:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x007c A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:4:0x0003, B:6:0x0016, B:8:0x0022, B:13:0x002b, B:15:0x002f, B:41:0x0087, B:42:0x008b, B:48:0x00f7, B:17:0x0035, B:19:0x0041, B:21:0x004d, B:24:0x0053, B:26:0x0057, B:29:0x005e, B:31:0x006a, B:33:0x0076, B:36:0x007c, B:38:0x0080, B:45:0x00bf, B:46:0x00c3), top: B:54:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0087 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:4:0x0003, B:6:0x0016, B:8:0x0022, B:13:0x002b, B:15:0x002f, B:41:0x0087, B:42:0x008b, B:48:0x00f7, B:17:0x0035, B:19:0x0041, B:21:0x004d, B:24:0x0053, B:26:0x0057, B:29:0x005e, B:31:0x006a, B:33:0x0076, B:36:0x007c, B:38:0x0080, B:45:0x00bf, B:46:0x00c3), top: B:54:0x0003 }] */
    public final synchronized void N(String str) {
        p7m0 p7m0Var;
        Object value;
        phh0 phh0Var;
        thh0 thh0Var;
        nhh0 nhh0Var;
        thh0 thh0Var2;
        nhh0 nhh0Var2;
        List list;
        List list2;
        p7m0 p7m0Var2;
        Object value2;
        a4x a4xVar;
        try {
            v3c.N(this.M);
            byte b = 1;
            yje yjeVar = null;
            if (((hpl0) D()).f instanceof xmf0) {
                if (((hpl0) D()).h instanceof nhh0) {
                    thh0Var = ((hpl0) D()).h;
                    if (thh0Var instanceof nhh0) {
                        nhh0Var = (nhh0) thh0Var;
                    } else {
                        nhh0Var = null;
                    }
                    if (nhh0Var != null) {
                        thh0Var2 = ((hpl0) D()).i;
                        if (thh0Var2 instanceof nhh0) {
                            nhh0Var2 = (nhh0) thh0Var2;
                        } else {
                            nhh0Var2 = null;
                        }
                        if (nhh0Var2 != null) {
                        }
                        p7m0Var2 = this.i.f25029a;
                        do {
                            value2 = p7m0Var2.getValue();
                            value2.getClass();
                            this.f.getClass();
                        } while (!p7m0Var2.m(value2, hpl0.a((hpl0) value2, false, false, null, null, true, null, null, null, null, null, null, null, null, null, null, false, 262127)));
                    } else {
                        thh0Var2 = ((hpl0) D()).i;
                        if (thh0Var2 instanceof nhh0) {
                            nhh0Var2 = (nhh0) thh0Var2;
                        } else {
                            nhh0Var2 = null;
                        }
                        if (nhh0Var2 != null) {
                        }
                        p7m0Var2 = this.i.f25029a;
                        do {
                            value2 = p7m0Var2.getValue();
                            value2.getClass();
                            this.f.getClass();
                        } while (!p7m0Var2.m(value2, hpl0.a((hpl0) value2, false, false, null, null, true, null, null, null, null, null, null, null, null, null, null, false, 262127)));
                    }
                }
                p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                    phh0Var = phh0.f26997a;
                } while (!p7m0Var.m(value, hpl0.a((hpl0) value, false, false, null, null, false, null, null, phh0Var, phh0Var, null, null, null, null, null, null, false, 261743)));
            } else {
                dnf0 dnf0Var = ((hpl0) D()).f;
                zmf0 zmf0Var = dnf0Var instanceof zmf0 ? (zmf0) dnf0Var : null;
                if (zmf0Var == null || (a4xVar = zmf0Var.f44624a) == null || !a4xVar.isEmpty()) {
                    p7m0Var2 = this.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        this.f.getClass();
                    } while (!p7m0Var2.m(value2, hpl0.a((hpl0) value2, false, false, null, null, true, null, null, null, null, null, null, null, null, null, null, false, 262127)));
                } else {
                    if (((hpl0) D()).h instanceof nhh0) {
                        thh0Var = ((hpl0) D()).h;
                        if (thh0Var instanceof nhh0) {
                            nhh0Var = (nhh0) thh0Var;
                        } else {
                            nhh0Var = null;
                        }
                        if ((nhh0Var != null || (list2 = nhh0Var.f23533a) == null || !list2.isEmpty()) && (((hpl0) D()).i instanceof nhh0)) {
                            thh0Var2 = ((hpl0) D()).i;
                            if (thh0Var2 instanceof nhh0) {
                                nhh0Var2 = (nhh0) thh0Var2;
                            } else {
                                nhh0Var2 = null;
                            }
                            if (nhh0Var2 != null || (list = nhh0Var2.f23533a) == null || !list.isEmpty()) {
                                p7m0Var2 = this.i.f25029a;
                                do {
                                    value2 = p7m0Var2.getValue();
                                    value2.getClass();
                                    this.f.getClass();
                                } while (!p7m0Var2.m(value2, hpl0.a((hpl0) value2, false, false, null, null, true, null, null, null, null, null, null, null, null, null, null, false, 262127)));
                            }
                        }
                    }
                    p7m0Var = this.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        this.f.getClass();
                        phh0Var = phh0.f26997a;
                    } while (!p7m0Var.m(value, hpl0.a((hpl0) value, false, false, null, null, false, null, null, phh0Var, phh0Var, null, null, null, null, null, null, false, 261743)));
                }
            }
            this.M = sac.V(jiu0.a(this), ppl0.f27379a, new lpl0(this, b), this.B.f22085a, new qkb0((Object) this, (Object) str, yjeVar, (byte) 23), 8);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void O(boolean z) {
        Object value;
        phh0 phh0Var;
        Object value2;
        try {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
                phh0Var = phh0.f26997a;
            } while (!p7m0Var.m(value, hpl0.a((hpl0) value, false, false, null, null, false, null, null, phh0Var, phh0Var, null, null, null, null, null, null, false, 261759)));
            a8z a8zVarA = maz.a(wez.b, new rd7(z, (Object) this, (byte) 20));
            bby bbyVar = this.L;
            if ((bbyVar == null || !bbyVar.isActive()) && !((Boolean) a8zVarA.getValue()).booleanValue()) {
                this.L = sac.W(jiu0.a(this), !((hpl0) D()).f13449a, xpl0.class.getName(), this.B.f22085a, new j1l0(this, (byte) 7), new spl0(this, null, (byte) 0));
                p7m0 p7m0Var2 = this.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    this.f.getClass();
                } while (!p7m0Var2.m(value2, hpl0.a((hpl0) value2, true, false, null, null, false, null, null, null, null, null, null, null, null, null, null, false, 262142)));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void P() {
        bby bbyVar = this.N;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.N = sac.V(jiu0.a(this), tpl0.f34339a, null, this.B.f22085a, new spl0(this, null, b), 10);
        }
    }

    public final void Q() {
        v3c.N(this.K);
        yje yjeVar = null;
        this.K = sac.T(new fnq(i120.W(new lsa(aoq.a(((n8v) ((g2v) this.C.f40284a).f10580a).f23108a, new lcl0(this, yjeVar, (byte) 4)), (byte) 10)), new bai0(this, yjeVar, (byte) 28), (byte) 4), d5c.S(jiu0.a(this), this.B.f22085a), wpl0.h);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        vol0 vol0Var = (vol0) obj;
        vol0Var.getClass();
        byte b = 0;
        if (vol0Var instanceof mol0) {
            v3c.N(this.O);
            this.O = i3t0.F(this, this.E, null, null, new gcl0((byte) 14), 119);
            i3t0.K(this, null, null, new npl0(this, null, b), 3);
            return;
        }
        boolean z = vol0Var instanceof sol0;
        epl0 epl0Var = epl0.f8194a;
        if (z) {
            aw40 aw40Var = ((sol0) vol0Var).f32549a;
            G(epl0Var);
            h97.x("game_id", Long.valueOf(aw40Var.f1556a), this.z.f31532a, "search_recomendation_call");
            b1j.r((int) aw40Var.f1556a, (s1p) this.A.f5196a, 3073L);
            this.D.d(aw40Var.b);
            return;
        }
        boolean zEquals = vol0Var.equals(uol0.f36023a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (zEquals) {
            if (this.F.c()) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value2, hpl0.a((hpl0) value2, false, false, "", null, false, null, null, null, null, null, null, null, null, null, null, false, 262136)));
                String str = ((hpl0) D()).d;
                if (str.length() == 0) {
                    O(true);
                    return;
                } else {
                    N(str);
                    return;
                }
            }
            return;
        }
        if (vol0Var instanceof rol0) {
            H(new cxi0((byte) 19, ((rol0) vol0Var).f30845a));
            return;
        }
        if (vol0Var.equals(tol0.f34291a)) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value, hpl0.a((hpl0) value, false, false, "", null, false, null, null, null, null, null, null, null, null, null, null, false, 262137)));
            N(((hpl0) D()).d);
            return;
        }
        if (vol0Var instanceof pol0) {
            i3t0.B(this, this.E, new vid[]{((pol0) vol0Var).f27335a});
            return;
        }
        if (vol0Var.equals(lol0.f20398a)) {
            E();
            return;
        }
        if (vol0Var.equals(nol0.f23873a)) {
            P();
            Q();
            return;
        }
        if (!vol0Var.equals(ool0.f25601a)) {
            if (vol0Var.equals(qol0.f29079a)) {
                G(epl0Var);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        v3c.N(this.O);
        v3c.N(this.K);
        v3c.N(this.M);
        v3c.N(this.L);
        v3c.N(this.N);
    }
}
