package a;

import androidx.fragment.app.Fragment;
import java.io.Serializable;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.authenticator.impl.navigation.AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class kw50 extends i3t0 {
    public static final /* synthetic */ int N = 0;
    public final m1e A;
    public final mne B;
    public final i1w0 C;
    public final ctf0 D;
    public final gle0 E;
    public final o24 F;
    public final bzt G;
    public c4m0 H;
    public bby I;
    public bby J;
    public bby K;
    public bby L;
    public boolean M;
    public final vzg0 o;
    public final rou p;
    public final kzt q;
    public final twc r;
    public final xnt s;
    public final tzi t;
    public final rek0 u;
    public final iqt v;
    public final nv20 w;
    public final nv20 x;
    public final grj y;
    public final duj z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw50(vzg0 vzg0Var, rou rouVar, loc locVar, kzt kztVar, twc twcVar, xnt xntVar, tzi tziVar, rek0 rek0Var, iqt iqtVar, nv20 nv20Var, nv20 nv20Var2, grj grjVar, duj dujVar, m1e m1eVar, mne mneVar, i1w0 i1w0Var, ctf0 ctf0Var, gle0 gle0Var, o24 o24Var, bzt bztVar) {
        super(null, new pu50(o24Var, (byte) 2), new v510(ctf0Var, (byte) 17), cvm0.p(mneVar.c, mneVar.f22085a), null);
        locVar.getClass();
        kztVar.getClass();
        twcVar.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        this.o = vzg0Var;
        this.p = rouVar;
        this.q = kztVar;
        this.r = twcVar;
        this.s = xntVar;
        this.t = tziVar;
        this.u = rek0Var;
        this.v = iqtVar;
        this.w = nv20Var;
        this.x = nv20Var2;
        this.y = grjVar;
        this.z = dujVar;
        this.A = m1eVar;
        this.B = mneVar;
        this.C = i1w0Var;
        this.D = ctf0Var;
        this.E = gle0Var;
        this.F = o24Var;
        this.G = bztVar;
        this.M = true;
    }

    public final void M(mm40 mm40Var, String str, Fragment fragment, fet fetVar, int i) {
        int i2;
        fetVar.g0(421258675);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(fragment) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(this) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            this.x.getClass();
            int i3 = i2;
            new gle0().a(fragment, mm40Var, new RuleData(str, 14, (Map) null, (String) null), null, true, fetVar, (14 & (i3 >> 6)) | 224256 | ((i3 << 3) & 112));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((Object) this, mm40Var, (Object) str, (Object) fragment, i, (byte) 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(kr5 kr5Var, zje zjeVar) {
        fw50 fw50Var;
        Object value;
        if (zjeVar instanceof fw50) {
            fw50Var = (fw50) zjeVar;
            int i = fw50Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fw50Var.k = i - Integer.MIN_VALUE;
            } else {
                fw50Var = new fw50(this, zjeVar);
            }
        } else {
            fw50Var = new fw50(this, zjeVar);
        }
        Object objG = fw50Var.i;
        wne wneVar = wne.f39444a;
        int i2 = fw50Var.k;
        if (i2 == 0) {
            z1x.P(objG);
            int i3 = kr5Var.m;
            fw50Var.k = 1;
            objG = this.q.f19166a.g(i3, fw50Var);
            if (objG == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objG);
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, zv50.a((zv50) value, null, null, null, false, null, 0, zBooleanValue, !zBooleanValue, false, false, 59391)));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object O(kr5 kr5Var, zje zjeVar) {
        gw50 gw50Var;
        if (zjeVar instanceof gw50) {
            gw50Var = (gw50) zjeVar;
            int i = gw50Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gw50Var.k = i - Integer.MIN_VALUE;
            } else {
                gw50Var = new gw50(this, zjeVar);
            }
        } else {
            gw50Var = new gw50(this, zjeVar);
        }
        gw50 gw50Var2 = gw50Var;
        Object objR = gw50Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = gw50Var2.k;
        if (i2 == 0) {
            z1x.P(objR);
            String str = kr5Var.d;
            gw50Var2.k = 1;
            objR = tzi.r(this.t, str, null, null, null, gw50Var2, 30);
            if (objR == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objR);
        }
        for (Object obj : (Iterable) objR) {
            if (((ykg0) obj).e == clg0.BUTTON) {
                return obj;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable P(zje zjeVar) {
        hw50 hw50Var;
        if (zjeVar instanceof hw50) {
            hw50Var = (hw50) zjeVar;
            int i = hw50Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hw50Var.k = i - Integer.MIN_VALUE;
            } else {
                hw50Var = new hw50(this, zjeVar);
            }
        } else {
            hw50Var = new hw50(this, zjeVar);
        }
        Object objA = hw50Var.i;
        wne wneVar = wne.f39444a;
        int i2 = hw50Var.k;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objA);
            hw50Var.k = 1;
            objA = this.s.a(hw50Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        for (Object obj2 : ((it5) objA).b) {
            if (((kr5) obj2).d.equals((String) this.F.b)) {
                obj = obj2;
                break;
            }
        }
        kr5 kr5Var = (kr5) obj;
        if (kr5Var != null) {
            return kr5Var;
        }
        List listC = kotlin.collections.a.c(1);
        nv20 nv20Var = this.w;
        nv20Var.getClass();
        ctf0 ctf0Var = (ctf0) nv20Var.f24171a;
        String str = p2e.f26245a;
        gl5 gl5Var = cs5.b;
        oo5 oo5Var = oo5.ACTION_OPEN_SECTION;
        String strF = ctf0Var.f(R.string.promo_daily_tournament, new Object[0]);
        String strF2 = ctf0Var.f(R.string.promo_daily_tournament_sub, new Object[0]);
        us5[] us5VarArr = us5.f36194a;
        return new kr5(listC, 1037, 0, "banner_1xGames_day_1", "prize_everyday_tournament_new", str, "", "", "", "", "", false, 3, oo5Var, strF, "", strF2, "", kotlin.collections.a.c(9), iun.f15405a, 0, "", "", 9, "", "", "");
    }

    public final void Q(m2c0 m2c0Var) {
        bby bbyVar = this.I;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.I = sac.V(jiu0.a(this), new r750(1, this, kw50.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, this.B.b, new xr10(m2c0Var, this, null, (byte) 27), 10);
        }
    }

    public final void R(Throwable th) {
        this.z.b(th, new jt50(th, this, (byte) 3));
        th.printStackTrace();
    }

    public final void S() {
        v3c.N(this.K);
        if (this.M) {
            bby bbyVar = this.K;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.K = sac.V(jiu0.a(this), new r750(1, this, kw50.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, this.B.b, new mt00((Object) this, (yje) null, (byte) 24), 10);
            }
        }
    }

    public final void T(mk80 mk80Var) {
        H(new nb50(mk80Var, this.G.f3488a.a().r, (byte) 2));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        nv50 nv50Var = (nv50) obj;
        nv50Var.getClass();
        boolean z = nv50Var instanceof fv50;
        final byte b = 0;
        i1w0 i1w0Var = this.C;
        if (z) {
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
        } else if (nv50Var instanceof ev50) {
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            ListIterator listIteratorP2 = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        } else {
            boolean z2 = nv50Var instanceof gv50;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z2) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value4 = p7m0Var.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value4, zv50.a((zv50) value4, null, null, null, false, null, 0, false, false, false, false, 28671)));
                return;
            }
            if (nv50Var instanceof kv50) {
                if (!this.v.f15225a.a()) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var2.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value3, zv50.a((zv50) value3, null, null, null, false, null, 0, false, false, false, true, 28671)));
                    return;
                }
                int i = ((zv50) D()).f45041a.m;
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, new a1w0(new x9c(this, i, (byte) 8))), i1w0Var, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorP3;
                    if (!pawVar3.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar3.next());
                    }
                }
            } else {
                if (nv50Var instanceof hv50) {
                    S();
                    return;
                }
                boolean z3 = nv50Var instanceof dv50;
                mne mneVar = this.B;
                yje yjeVar = null;
                final byte b2 = 1;
                if (z3) {
                    bby bbyVar = this.J;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        this.J = sac.V(jiu0.a(this), new Function1(this) { // from class: a.ew50
                            public final /* synthetic */ kw50 b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b3 = b;
                                kw50 kw50Var = this.b;
                                switch (b3) {
                                    case 0:
                                        Throwable th = (Throwable) obj2;
                                        th.getClass();
                                        if (th instanceof j7t0) {
                                            i1w0 i1w0Var2 = kw50Var.C;
                                            k0w0 k0w0VarI = cs0.i(i1w0Var2, i1w0Var2);
                                            kw50Var.u.getClass();
                                            k0w0VarI.h(new AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1(true));
                                            ListIterator listIteratorO = b1j.o(i1w0Var2, k0w0VarI.f17489a, 0);
                                            while (true) {
                                                paw pawVar4 = (paw) listIteratorO;
                                                if (pawVar4.hasNext()) {
                                                    i1w0Var2.a((oe50) pawVar4.next());
                                                }
                                            }
                                        } else {
                                            kw50Var.R(th);
                                        }
                                        break;
                                    default:
                                        k0w0 k0w0Var = (k0w0) obj2;
                                        k0w0Var.getClass();
                                        gle0 gle0Var = kw50Var.E;
                                        RuleData ruleData = new RuleData((String) kw50Var.F.b, 14, (Map) null, (String) null);
                                        gle0Var.getClass();
                                        k0w0Var.h(new RulesScreenFactoryImpl$getRulesFragmentScreen$1(ruleData, R.string.rules, false, false, false));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, null, mneVar.b, new iw50(this, yjeVar, b2), 10);
                        return;
                    }
                    return;
                }
                if (nv50Var instanceof jv50) {
                    i1w0Var.d(new Function1(this) { // from class: a.ew50
                        public final /* synthetic */ kw50 b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            byte b3 = b2;
                            kw50 kw50Var = this.b;
                            switch (b3) {
                                case 0:
                                    Throwable th = (Throwable) obj2;
                                    th.getClass();
                                    if (th instanceof j7t0) {
                                        i1w0 i1w0Var2 = kw50Var.C;
                                        k0w0 k0w0VarI = cs0.i(i1w0Var2, i1w0Var2);
                                        kw50Var.u.getClass();
                                        k0w0VarI.h(new AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1(true));
                                        ListIterator listIteratorO = b1j.o(i1w0Var2, k0w0VarI.f17489a, 0);
                                        while (true) {
                                            paw pawVar4 = (paw) listIteratorO;
                                            if (pawVar4.hasNext()) {
                                                i1w0Var2.a((oe50) pawVar4.next());
                                            }
                                        }
                                    } else {
                                        kw50Var.R(th);
                                    }
                                    break;
                                default:
                                    k0w0 k0w0Var = (k0w0) obj2;
                                    k0w0Var.getClass();
                                    gle0 gle0Var = kw50Var.E;
                                    RuleData ruleData = new RuleData((String) kw50Var.F.b, 14, (Map) null, (String) null);
                                    gle0Var.getClass();
                                    k0w0Var.h(new RulesScreenFactoryImpl$getRulesFragmentScreen$1(ruleData, R.string.rules, false, false, false));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    return;
                }
                if (nv50Var instanceof iv50) {
                    bby bbyVar2 = this.L;
                    if (bbyVar2 == null || !bbyVar2.isActive()) {
                        this.L = sac.V(jiu0.a(this), new r750(1, this, kw50.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 29), null, mneVar.f22085a, new z210(this, yjeVar, (byte) 17), 10);
                        return;
                    }
                    return;
                }
                if (!(nv50Var instanceof lv50)) {
                    if (nv50Var instanceof bv50) {
                        p7m0 p7m0Var3 = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var3.getValue();
                            value2.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var3.m(value2, zv50.a((zv50) value2, null, null, null, true, null, 0, false, false, false, false, 65279)));
                        return;
                    }
                    if (nv50Var instanceof cv50) {
                        p7m0 p7m0Var4 = ocjVar.f25029a;
                        do {
                            value = p7m0Var4.getValue();
                            value.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var4.m(value, zv50.a((zv50) value, null, null, null, false, null, 0, false, false, false, false, 65279)));
                        return;
                    }
                    if (nv50Var instanceof av50) {
                        c4m0 c4m0Var = this.H;
                        if (c4m0Var == null || !c4m0Var.isActive()) {
                            this.H = slb.U(new fnq(this.A.b(), new iw50(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a));
                            return;
                        }
                        return;
                    }
                    if (nv50Var instanceof yu50) {
                        c4m0 c4m0Var2 = this.H;
                        if (c4m0Var2 != null) {
                            v3c.N(c4m0Var2);
                            return;
                        }
                        return;
                    }
                    if (nv50Var instanceof zu50) {
                        E();
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                int i2 = ((lv50) nv50Var).f20703a;
                p7m0 p7m0Var5 = ocjVar.f25029a;
                while (true) {
                    Object value5 = p7m0Var5.getValue();
                    value5.getClass();
                    oyg0Var.getClass();
                    int i3 = i2;
                    if (p7m0Var5.m(value5, zv50.a((zv50) value5, null, null, null, false, null, i3, false, false, false, false, 64511))) {
                        this.o.e("CURRENT_SELECTED_TAB", Integer.valueOf(i3));
                        return;
                    }
                    i2 = i3;
                }
            }
        }
    }
}
