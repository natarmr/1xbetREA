package a;

import com.huawei.hms.framework.common.BundleUtil;
import kotlin.Unit;
import org.xplatform.game_broadcasting.api.presentation.models.BroadcastingVideoLandscapeParams;

/* JADX INFO: loaded from: classes4.dex */
public final class k69 extends i3t0 {
    public static final /* synthetic */ int K = 0;
    public final mne A;
    public final fuj0 B;
    public final nw20 C;
    public final chf0 D;
    public final xex E;
    public c4m0 F;
    public bby G;
    public c4m0 H;
    public bby I;
    public boolean J;
    public final BroadcastingVideoLandscapeParams o;
    public final m1e p;
    public final lbu q;
    public final ali r;
    public final a5v s;
    public final lut t;
    public final sdi0 u;
    public final yox v;
    public final ljf0 w;
    public final hrx x;
    public final reu y;
    public final iqt z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k69(BroadcastingVideoLandscapeParams broadcastingVideoLandscapeParams, m1e m1eVar, lbu lbuVar, ali aliVar, a5v a5vVar, lut lutVar, sdi0 sdi0Var, yox yoxVar, ljf0 ljf0Var, hrx hrxVar, reu reuVar, iqt iqtVar, mne mneVar, fuj0 fuj0Var, nw20 nw20Var, chf0 chf0Var, xex xexVar, g2v g2vVar, lut lutVar2, hrx hrxVar2, pru pruVar) {
        super(new co0((Object) broadcastingVideoLandscapeParams, (Object) m1eVar, (Object) lutVar2, (Object) hrxVar2, pruVar, (Object) g2vVar, (byte) 2), cvm0.p(mneVar.c, mneVar.f22085a), new d69((byte) 0), (yzn0) null);
        m1eVar.getClass();
        this.o = broadcastingVideoLandscapeParams;
        this.p = m1eVar;
        this.q = lbuVar;
        this.r = aliVar;
        this.s = a5vVar;
        this.t = lutVar;
        this.u = sdi0Var;
        this.v = yoxVar;
        this.w = ljf0Var;
        this.x = hrxVar;
        this.y = reuVar;
        this.z = iqtVar;
        this.A = mneVar;
        this.B = fuj0Var;
        this.C = nw20Var;
        this.D = chf0Var;
        this.E = xexVar;
        String str = k69.class.getSimpleName() + BundleUtil.UNDERLINE_TAG + ((z59) D()).f43804a;
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            String str2 = str;
            if (p7m0Var.m(value, z59.a((z59) value, null, false, false, false, false, null, false, false, str2, null, 491519))) {
                return;
            } else {
                str = str2;
            }
        }
    }

    public final void M() {
        Object value;
        if (this.o.f) {
            Q();
            return;
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, z59.a((z59) value, null, false, false, false, false, null, false, false, null, null, 507903)));
        G(u59.f35084a);
        this.r.d();
        i3t0.K(this, this.A.f22085a, null, new f69(this, null, (byte) 2), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object N(zje zjeVar) {
        g69 g69Var;
        hl90 hl90Var;
        if (zjeVar instanceof g69) {
            g69Var = (g69) zjeVar;
            int i = g69Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                g69Var.k = i - Integer.MIN_VALUE;
            } else {
                g69Var = new g69(this, zjeVar);
            }
        } else {
            g69Var = new g69(this, zjeVar);
        }
        Object objB = g69Var.i;
        wne wneVar = wne.f39444a;
        int i2 = g69Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            if (!this.z.f15225a.a()) {
                return Unit.f46060a;
            }
            g69Var.k = 1;
            objB = ((b3c0) this.y.b).b(g69Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        m2c0 m2c0Var = (m2c0) objB;
        jqt0 jqt0Var = m2c0Var.k;
        String str = m2c0Var.Z;
        int iOrdinal = jqt0Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            hl90Var = str.length() == 0 ? hl90.b : hl90.c;
        } else {
            hl90Var = hl90.f13247a;
        }
        hl90 hl90Var2 = hl90Var;
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            String str2 = str;
            if (p7m0Var.m(value, z59.a((z59) value, null, false, false, false, false, hl90Var2, false, false, null, str2, 391647))) {
                break;
            }
            str = str2;
        }
        G(e69.f7269a[hl90Var2.ordinal()] == 1 ? w59.f38572a : v59.f36817a);
        return Unit.f46060a;
    }

    public final void O(String str) {
        BroadcastingVideoLandscapeParams broadcastingVideoLandscapeParams = this.o;
        long j = broadcastingVideoLandscapeParams.b;
        long j2 = broadcastingVideoLandscapeParams.d;
        xex xexVar = this.E;
        xexVar.getClass();
        ik4 ik4Var = (ik4) xexVar.b;
        ik4Var.getClass();
        s1p s1pVar = ik4Var.f14907a;
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p((byte) 2, j));
        if (j == 40) {
            yni0Var.add(new i1p((byte) 0, j2));
        }
        yni0Var.add(new j1p(str, (byte) 0));
        s1pVar.a(cui0.a(yni0Var), 12008L);
        vd1 vd1Var = (vd1) xexVar.f40764a;
        vd1Var.getClass();
        kt2 kt2Var = vd1Var.f37210a;
        jo20 jo20Var = new jo20();
        jo20Var.put("option", str);
        jo20Var.put("sport_id", Long.valueOf(j));
        if (j == 40) {
            jo20Var.put("sub_sport_id", Long.valueOf(j2));
        }
        kt2Var.a("broadcast_phone_popup_action", jo20Var.b());
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void x(m59 m59Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        m59Var.getClass();
        if (m59Var.equals(c59.f3760a)) {
            M();
            return;
        }
        if (m59Var.equals(f59.f8950a)) {
            M();
            return;
        }
        boolean zEquals = m59Var.equals(j59.f15923a);
        ali aliVar = this.r;
        mne mneVar = this.A;
        yje yjeVar = null;
        if (zEquals) {
            G(x59.f40303a);
            i3t0.K(this, mneVar.f22085a, null, new f69(this, yjeVar, (byte) 3), 2);
            aliVar.d();
            return;
        }
        if (m59Var.equals(l59.f19442a)) {
            Q();
            return;
        }
        boolean zEquals2 = m59Var.equals(g59.f10707a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (zEquals2) {
            if (!((z59) D()).f) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value5 = p7m0Var.getValue();
                    value5.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value5, z59.a((z59) value5, null, true, false, false, false, null, false, false, null, null, 524255)));
                T();
                return;
            }
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value6 = p7m0Var2.getValue();
                value6.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value6, z59.a((z59) value6, null, false, false, false, false, null, false, false, null, null, 524191)));
            S();
            R();
            return;
        }
        byte b = 4;
        byte b2 = 1;
        if (m59Var.equals(k59.f17708a)) {
            bby bbyVar = this.G;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.G = i3t0.K(this, mneVar.c, null, new f69(this, yjeVar, b), 2);
                return;
            }
            return;
        }
        if (!m59Var.equals(i59.f14182a)) {
            if (m59Var.equals(h59.f12468a)) {
                bby bbyVar2 = this.I;
                if (bbyVar2 == null || !bbyVar2.isActive()) {
                    this.I = I(mneVar.c, new d38(this, (byte) 17), new f69(this, yjeVar, b2));
                    return;
                }
                return;
            }
            if (m59Var.equals(d59.f5494a)) {
                O("add");
                aliVar.d();
                ((oeg0) aliVar.f1068a).c().d(new g7p((Object) aliVar, (byte) 18));
                return;
            }
            if (m59Var.equals(b59.f1991a)) {
                O("activate");
                aliVar.d();
                ((oeg0) aliVar.f1068a).c().d(new f5p(aliVar, ((z59) D()).r, (byte) 26));
                return;
            }
            if (m59Var.equals(e59.f7222a)) {
                O("close");
                M();
                return;
            }
            byte b3 = 0;
            if (m59Var.equals(a59.f259a)) {
                if (this.J) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var3.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value4, z59.a((z59) value4, null, true, false, false, false, null, false, false, null, null, 524191)));
                }
                c4m0 c4m0Var = this.F;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.F = i3t0.L(this, new fnq(this.p.b(), new h69(this, yjeVar, b3), (byte) 4), mneVar.f22085a, null, 2);
                }
                c4m0 c4m0Var2 = this.H;
                if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                    this.H = i3t0.L(this, new fnq(new lr(i120.W(new h2c(((neu0) this.v.f43005a).f23405a.c, (byte) 25)), (byte) 29), new h69(this, yjeVar, b2), (byte) 4), mneVar.f22085a, null, 2);
                    return;
                }
                return;
            }
            if (m59Var.equals(z49.f43758a)) {
                c4m0 c4m0Var3 = this.F;
                if (c4m0Var3 != null) {
                    c4m0Var3.cancel(null);
                }
                c4m0 c4m0Var4 = this.H;
                if (c4m0Var4 != null) {
                    c4m0Var4.cancel(null);
                }
                this.J = ((z59) D()).f;
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value3, z59.a((z59) value3, null, false, false, false, false, null, false, false, null, null, 524191)));
                S();
                R();
                return;
            }
            if (m59Var.equals(y49.f41990a)) {
                if (((z59) D()).k) {
                    return;
                }
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var5.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var5.m(value2, z59.a((z59) value2, null, true, true, false, false, null, false, false, null, null, 524191)));
                i3t0.K(this, mneVar.f22085a, null, new f69(this, yjeVar, b3), 2);
                T();
                return;
            }
            if (!m59Var.equals(x49.f40253a)) {
                if (m59Var.equals(w49.f38533a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            p7m0 p7m0Var6 = ocjVar.f25029a;
            do {
                value = p7m0Var6.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var6.m(value, z59.a((z59) value, null, false, false, false, false, null, true, false, null, null, 522143)));
            S();
            R();
            return;
        }
        boolean z = !((z59) D()).i;
        this.t.b.d.f22888a.d("GAME_BROADCAST_SOUND_ENABLE", z);
        p7m0 p7m0Var7 = ocjVar.f25029a;
        while (true) {
            Object value7 = p7m0Var7.getValue();
            value7.getClass();
            oyg0Var.getClass();
            boolean z2 = z;
            if (p7m0Var7.m(value7, z59.a((z59) value7, null, false, false, false, z2, null, false, false, null, null, 524031))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public final void Q() {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, z59.a((z59) value, null, false, false, false, false, null, false, false, null, null, 507903)));
        i3t0.K(this, null, null, new f69(this, null, (byte) 5), 3);
        G(new t59(new vb8((Object) this, (byte) 17)));
    }

    public final void R() {
        this.C.o(((z59) D()).p);
    }

    public final void S() {
        if (((z59) D()).n) {
            v3c.N(this.x.f13553a.f23405a.b);
        }
    }

    public final void T() {
        this.B.A(((z59) D()).f43804a, ((z59) D()).b, ((z59) D()).d, v39.VIDEO, ((z59) D()).c, ((z59) D()).p);
    }

    @Override // a.diu0
    public final void v() {
        if (((z59) D()).o) {
            b49 b49VarM = this.D.M(((z59) D()).p);
            if (b49VarM instanceof a49) {
                a49 a49Var = (a49) b49VarM;
                this.E.O(a49Var.b, a49Var.c, a49Var.f212a, a49Var.d, a49Var.e);
            }
        }
    }
}
