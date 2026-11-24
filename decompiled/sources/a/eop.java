package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params.ChoosenDate;
import org.xplatform.feed.linelive.presentation.feeds.betonyoursscreen.router.BetOnYoursLineLiveScreens$ChooseCountryFragmentScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class eop extends i3t0 {
    public static final /* synthetic */ int Z = 0;
    public final pru A;
    public final lrc B;
    public final dxt C;
    public final lbu D;
    public final epi0 E;
    public final lef0 F;
    public final lbu G;
    public final dpi0 H;
    public final xsu I;
    public final ugf0 J;
    public final lef0 K;
    public final dxt L;
    public final sqt M;
    public final pmi0 N;
    public final s31 O;
    public final cyu P;
    public final tzi Q;
    public final spc R;
    public c4m0 S;
    public final c4m0 T;
    public final c4m0 U;
    public final c4m0 V;
    public final bby W;
    public bby X;
    public c4m0 Y;
    public final vzg0 o;
    public final i1w0 p;
    public final f9h0 q;
    public final long[] r;
    public final String s;
    public final j700 t;
    public final ctf0 u;
    public final yo4 v;
    public final zr1 w;
    public final imf0 x;
    public final mne y;
    public final m1e z;

    public eop(vzg0 vzg0Var, i1w0 i1w0Var, f9h0 f9h0Var, long[] jArr, String str, j700 j700Var, ctf0 ctf0Var, yo4 yo4Var, zr1 zr1Var, imf0 imf0Var, mne mneVar, m1e m1eVar, pru pruVar, lrc lrcVar, dxt dxtVar, lbu lbuVar, xfu xfuVar, xsu xsuVar, xsu xsuVar2, dxt dxtVar2, epi0 epi0Var, lef0 lef0Var, cmt cmtVar, lbu lbuVar2, dpi0 dpi0Var, xsu xsuVar3, ugf0 ugf0Var, lef0 lef0Var2, dxt dxtVar3, sqt sqtVar, pmi0 pmi0Var, bwl bwlVar, s31 s31Var, cyu cyuVar, tzi tziVar, spc spcVar) {
        rwj rwjVar;
        ctf0Var.getClass();
        m1eVar.getClass();
        ng0 ng0Var = new ng0(ctf0Var, j700Var, vzg0Var, f9h0Var, jArr);
        bcn bcnVar = new bcn(ctf0Var, (byte) 13);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar2 = mneVar.f22085a;
        super(null, ng0Var, bcnVar, cvm0.p(vs10Var, rwjVar2), null);
        this.o = vzg0Var;
        this.p = i1w0Var;
        this.q = f9h0Var;
        this.r = jArr;
        this.s = str;
        this.t = j700Var;
        this.u = ctf0Var;
        this.v = yo4Var;
        this.w = zr1Var;
        this.x = imf0Var;
        this.y = mneVar;
        this.z = m1eVar;
        this.A = pruVar;
        this.B = lrcVar;
        this.C = dxtVar;
        this.D = lbuVar;
        this.E = epi0Var;
        this.F = lef0Var;
        this.G = lbuVar2;
        this.H = dpi0Var;
        this.I = xsuVar3;
        this.J = ugf0Var;
        this.K = lef0Var2;
        this.L = dxtVar3;
        this.M = sqtVar;
        this.N = pmi0Var;
        this.O = s31Var;
        this.P = cyuVar;
        this.Q = tziVar;
        this.R = spcVar;
        String str2 = (String) vzg0Var.a("KEY_SEARCH_QUERY");
        Q(str2 == null ? "" : str2);
        yje yjeVar = null;
        byte b = 0;
        sac.T(new fnq(vtb.N(((m8l0) dxtVar2.f6863a.f19899a).f), new wnp(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar2), xnp.h);
        byte b2 = 1;
        sac.T(new fnq(((hkp) xsuVar.f41434a).f13218a.d, new wnp(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), rwjVar2), aop.h);
        bby bbyVar = this.W;
        if (bbyVar == null || !bbyVar.isActive()) {
            rwjVar = rwjVar2;
            this.W = sac.V(jiu0.a(this), tnp.f34247a, null, rwjVar2, new unp(this, yjeVar, b), 10);
        } else {
            rwjVar = rwjVar2;
        }
        c4m0 c4m0Var = this.T;
        byte b3 = 2;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.T = slb.U(new fnq(((m8l0) ((lef0) xsuVar2.f41434a).f19899a).f21376a, new znp(this, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(this), rwjVar));
        }
        c4m0 c4m0Var2 = this.V;
        if (c4m0Var2 == null || !c4m0Var2.isActive()) {
            this.V = slb.U(new fnq(((hkp) cmtVar.b).f13218a.c, new znp(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), rwjVar));
        }
        c4m0 c4m0Var3 = this.U;
        if (c4m0Var3 == null || !c4m0Var3.isActive()) {
            this.U = slb.U(new fnq(xfuVar.a(M()), new wnp(this, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(this), rwjVar));
        }
        sac.T(new fnq(((hkp) bwlVar.f3330a).f13218a.b, new unp(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), rwjVar), ynp.h);
        if (f9h0Var.equals(z8h0.f43966a)) {
            sac.V(jiu0.a(this), dop.f6424a, null, rwjVar, new fr9(this, yjeVar, (byte) 29), 10);
        }
        Integer num = (Integer) vzg0Var.a("KEY_TIME_FILTER_ID");
        if (num != null) {
            int iIntValue = num.intValue();
            ygq0.b.getClass();
            lef0Var2.i(j6m0.a(iIntValue), M());
        }
        Long l = (Long) vzg0Var.a("KEY_TIME_FILTER_START");
        if (l != null) {
            pmi0Var.j(l.longValue());
        }
        Long l2 = (Long) vzg0Var.a("KEY_TIME_FILTER_END");
        if (l2 != null) {
            dxtVar3.a(l2.longValue());
        }
    }

    public final boolean M() {
        f9h0 f9h0Var = this.q;
        d8h0 d8h0Var = f9h0Var instanceof d8h0 ? (d8h0) f9h0Var : null;
        if (d8h0Var == null || !d8h0Var.b) {
            m8h0 m8h0Var = f9h0Var instanceof m8h0 ? (m8h0) f9h0Var : null;
            if (m8h0Var == null || !m8h0Var.c) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(String str, zje zjeVar) {
        vnp vnpVar;
        j700 j700Var;
        wgh0 wgh0Var;
        if (zjeVar instanceof vnp) {
            vnpVar = (vnp) zjeVar;
            int i = vnpVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                vnpVar.l = i - Integer.MIN_VALUE;
            } else {
                vnpVar = new vnp(this, zjeVar);
            }
        } else {
            vnpVar = new vnp(this, zjeVar);
        }
        Object objM = vnpVar.j;
        wne wneVar = wne.f39444a;
        int i2 = vnpVar.l;
        if (i2 == 0) {
            z1x.P(objM);
            gmq gmqVarW = w();
            vnpVar.i = str;
            vnpVar.l = 1;
            objM = ntb.M(gmqVarW, vnpVar);
            if (objM == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = vnpVar.i;
            z1x.P(objM);
        }
        qnp qnpVar = (qnp) objM;
        if (qnpVar != null && (j700Var = qnpVar.e) != null) {
            if ((((pnp) D()).d instanceof y8h0) && j700Var != j700.c) {
                wgh0Var = wgh0.FILTER_SPORT;
            } else if (((pnp) D()).d instanceof z8h0) {
                wgh0Var = wgh0.SPORT_DOMESTIC;
            } else {
                int iOrdinal = j700Var.ordinal();
                if (iOrdinal == 0) {
                    wgh0Var = wgh0.SPORT_LINE;
                } else if (iOrdinal == 1) {
                    wgh0Var = wgh0.SPORT_LIVE;
                } else if (iOrdinal == 2) {
                    wgh0Var = wgh0.SPORT_STREAM;
                } else {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return null;
                    }
                    wgh0Var = wgh0.SPORT_CYBER_CHAMP;
                }
            }
            this.O.h(wgh0Var, str, null);
            this.P.D(null, wgh0Var.f39117a, str);
        }
        return Unit.f46060a;
    }

    public final void O() {
        i1w0 i1w0Var = this.p;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        FragmentScreen betOnYoursLineLiveScreens$ChooseCountryFragmentScreen = new BetOnYoursLineLiveScreens$ChooseCountryFragmentScreen();
        if (betOnYoursLineLiveScreens$ChooseCountryFragmentScreen instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) betOnYoursLineLiveScreens$ChooseCountryFragmentScreen)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(betOnYoursLineLiveScreens$ChooseCountryFragmentScreen)));
        }
        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void P() {
        j700 j700VarW = hfm0.w((pnp) D());
        if ((((pnp) D()).d instanceof m8h0) || (((pnp) D()).d instanceof p8h0)) {
            return;
        }
        e3c.n(this.Y);
        boolean z = j700VarW == j700.c || j700VarW == j700.b || j700VarW == j700.d;
        List listF0 = tx3.f0(this.r);
        tzi tziVar = this.Q;
        tziVar.getClass();
        listF0.getClass();
        yje yjeVar = null;
        this.Y = J(new fnq(i120.W(aoq.c(new vsg0(new u5u((Object) tziVar, yjeVar, (byte) 22)), new erx(yjeVar, tziVar, z, listF0, (byte) 0))), new wnp(this, yjeVar, (byte) 3), (byte) 4), this.y.f22085a, bop.f2945a);
    }

    public final void Q(String str) {
        e3c.n(this.X);
        this.X = i3t0.K(this, null, null, new hr(this, str, null, (byte) 13), 3);
    }

    public final void R(ygq0 ygq0Var) {
        this.K.i(ygq0Var, M());
        this.o.e("KEY_TIME_FILTER_ID", Integer.valueOf(ygq0Var.f42598a));
    }

    public final void S() {
        G(new akp((((pnp) D()).u.b.f39129a == -1 || ((pnp) D()).u.b.b == -1) ? new ChoosenDate.SingleDate(new Date(((pnp) D()).u.b.f39129a)) : new ChoosenDate.Interval(new Date(((pnp) D()).u.b.f39129a), new Date(((pnp) D()).u.b.b))));
    }

    @Override // a.diu0
    public final void v() {
        LinkedHashMap linkedHashMap = whp.f39175a;
        f9h0 f9h0Var = this.q;
        f9h0Var.getClass();
        String str = this.s;
        str.getClass();
        LinkedHashMap linkedHashMap2 = whp.f39175a;
        xhp xhpVar = (xhp) linkedHashMap2.get(str);
        if (xhpVar != null) {
            LinkedHashSet linkedHashSetE = eui0.e(xhpVar.f40905a, f9h0Var.getClass().getSimpleName());
            xhp xhpVar2 = new xhp(linkedHashSetE, xhpVar.b);
            if (linkedHashSetE.isEmpty()) {
                linkedHashMap2.remove(str);
            } else {
                linkedHashMap2.put(str, xhpVar2);
            }
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        dt2 dt2Var;
        g1p g1pVar;
        wgh0 wgh0Var;
        Object value3;
        zmb zmbVar;
        zmb zmbVar2;
        xdk0 xdk0Var;
        Object value4;
        ujp ujpVar = (ujp) obj;
        ujpVar.getClass();
        super.x(ujpVar);
        boolean z = ujpVar instanceof njp;
        byte b = 3;
        byte b2 = 1;
        yje yjeVar = null;
        if (!z && !(ujpVar instanceof ojp) && !(ujpVar instanceof ljp) && !(ujpVar instanceof hjp)) {
            i3t0.K(this, null, null, new snp(this, yjeVar, b2), 3);
        }
        boolean z2 = ujpVar instanceof ajp;
        byte b3 = 0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (!z2) {
            boolean z3 = ujpVar instanceof bjp;
            byte b4 = 2;
            mne mneVar = this.y;
            if (z3) {
                sac.V(jiu0.a(this), new rnp(b3), null, mneVar.f22085a, new unp(this, yjeVar, b4), 10);
                return;
            }
            if (ujpVar instanceof cjp) {
                this.F.j(!((pnp) D()).q);
                return;
            }
            boolean z4 = ujpVar instanceof ejp;
            zr1 zr1Var = this.w;
            yo4 yo4Var = this.v;
            vzg0 vzg0Var = this.o;
            if (z4) {
                pek0 pek0Var = pek0.f26859a;
                int iOrdinal = ((pnp) D()).t.ordinal();
                if (iOrdinal == 0) {
                    zmbVar = zmb.b;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    zmbVar = zmb.f44617a;
                }
                zmb zmbVar3 = zmbVar;
                p7m0 p7m0Var = ocjVar.f25029a;
                while (true) {
                    Object value5 = p7m0Var.getValue();
                    value5.getClass();
                    oyg0Var.getClass();
                    zmbVar2 = zmbVar3;
                    if (p7m0Var.m(value5, pnp.a((pnp) value5, null, false, null, null, false, false, null, false, 0, null, false, false, false, false, zmbVar3, null, 1572863))) {
                        break;
                    } else {
                        zmbVar3 = zmbVar2;
                    }
                }
                vzg0Var.e("KEY_CHAMP_SORT_TYPE", zmbVar2);
                dxt dxtVar = this.C;
                dxtVar.getClass();
                m8l0 m8l0Var = (m8l0) dxtVar.f6863a.f19899a;
                m8l0Var.getClass();
                m8l0Var.f.o(null, zmbVar2);
                boolean z5 = zmbVar2 == zmb.b;
                i8i.D("action", z5 ? "on" : "off", yo4Var.f42966a, "bet_champs_country_click");
                zr1Var.f44833a.a(cui0.b(new j1p(z5 ? "on" : "off", (byte) 0)), 11322L);
                int iOrdinal2 = zmbVar2.ordinal();
                ctf0 ctf0Var = this.u;
                if (iOrdinal2 == 0) {
                    lsm0 lsm0Var = ctf0Var.b;
                    lsm0 lsm0Var2 = ctf0Var.b;
                    xdk0Var = new xdk0(pek0Var, lsm0Var.a(R.string.feed_group_by_country_snack_disabled_title, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.feed_group_by_country_snack_disabled_subtitle, Arrays.copyOf(new Object[0], 0)), new hdk0(lsm0Var2.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), new dfp((byte) 10)), null, null, 112);
                } else if (iOrdinal2 != 1) {
                    t9f.b();
                    return;
                } else {
                    lsm0 lsm0Var3 = ctf0Var.b;
                    lsm0 lsm0Var4 = ctf0Var.b;
                    xdk0Var = new xdk0(pek0Var, lsm0Var3.a(R.string.feed_group_by_country_snack_title, Arrays.copyOf(new Object[0], 0)), lsm0Var4.a(R.string.feed_group_by_country_snack_subtitle, Arrays.copyOf(new Object[0], 0)), new hdk0(lsm0Var4.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), new dfp((byte) 11)), null, null, 112);
                }
                G(new bkp(xdk0Var));
                return;
            }
            if (ujpVar instanceof djp) {
                int i = ((pnp) D()).k;
                if (i == 0) {
                    wgh0Var = wgh0.SPORT_LIVE;
                } else if (i != 1) {
                    wgh0Var = i != 2 ? wgh0.UNKNOWN : wgh0.CYBER_SPORT_ALL;
                } else {
                    wgh0Var = wgh0.SPORT_LINE;
                }
                this.O.g(wgh0Var);
                this.P.C(wgh0Var.f39117a);
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var2.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value3, pnp.a((pnp) value3, null, true, null, null, true, false, null, false, 0, null, false, false, false, false, null, null, 2097085)));
                return;
            }
            if (ujpVar instanceof fjp) {
                boolean z6 = !((pnp) D()).r;
                f9h0 f9h0Var = this.q;
                boolean z7 = f9h0Var instanceof d8h0;
                z8h0 z8h0Var = z8h0.f43966a;
                y8h0 y8h0Var = y8h0.f42195a;
                if (z7) {
                    dt2Var = dt2.CHAMPS;
                } else if ((f9h0Var instanceof m8h0) || (f9h0Var instanceof p8h0)) {
                    dt2Var = dt2.MATCHES;
                } else {
                    if (!Intrinsics.d(f9h0Var, y8h0Var) && !Intrinsics.d(f9h0Var, z8h0Var)) {
                        t9f.b();
                        return;
                    }
                    dt2Var = dt2.SPORT;
                }
                yo4Var.e(z6, dt2Var, ((pnp) D()).k == 2 ? ct2.CYBER : ct2.LIVE);
                if (z7) {
                    g1pVar = g1p.CHAMPS;
                } else if ((f9h0Var instanceof m8h0) || (f9h0Var instanceof p8h0)) {
                    g1pVar = g1p.MATCHES;
                } else {
                    if (!Intrinsics.d(f9h0Var, y8h0Var) && !Intrinsics.d(f9h0Var, z8h0Var)) {
                        t9f.b();
                        return;
                    }
                    g1pVar = g1p.SPORT;
                }
                zr1Var.g(g1pVar, z6, ((pnp) D()).k == 2 ? f1p.CYBER : f1p.LIVE);
                ((m8l0) ((lef0) this.E.b).f19899a).f21376a.o(null, Boolean.valueOf(z6));
                return;
            }
            if (ujpVar instanceof jjp) {
                Q(((jjp) ujpVar).f16628a);
                return;
            }
            if (ujpVar instanceof mjp) {
                mjp mjpVar = (mjp) ujpVar;
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value2, pnp.a((pnp) value2, null, false, null, null, false, false, null, false, mjpVar.f21906a, null, false, false, false, false, null, null, 2096127)));
                vzg0Var.e("KEY_CURRENT_TAB", Integer.valueOf(mjpVar.f21906a));
                P();
                return;
            }
            if (ujpVar instanceof sjp) {
                Date date = ((sjp) ujpVar).f32313a;
                this.N.j(date.getTime());
                vzg0Var.e("KEY_TIME_FILTER_START", Long.valueOf(date.getTime()));
                return;
            }
            if (ujpVar instanceof tjp) {
                R(((tjp) ujpVar).f34059a);
                return;
            }
            if (ujpVar instanceof rjp) {
                Date date2 = ((rjp) ujpVar).f30606a;
                this.L.a(date2.getTime());
                vzg0Var.e("KEY_TIME_FILTER_END", Long.valueOf(date2.getTime()));
                if (((pnp) D()).h) {
                    R(ygq0.CUSTOM_DATE);
                    return;
                }
                return;
            }
            if (ujpVar instanceof hjp) {
                i3t0.K(this, null, null, new snp(this, yjeVar, b3), 3);
                return;
            }
            if (ujpVar instanceof ojp) {
                c4m0 c4m0Var = this.S;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                c4m0 c4m0Var2 = this.Y;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                    return;
                }
                return;
            }
            if (z) {
                String str = (String) vzg0Var.a("KEY_SEARCH_QUERY");
                Q(str != null ? str : "");
                c4m0 c4m0Var3 = this.S;
                if (c4m0Var3 == null || !c4m0Var3.isActive()) {
                    this.S = slb.U(new fnq(this.z.b(), new znp(this, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a));
                }
                P();
                return;
            }
            if (ujpVar instanceof kjp) {
                sac.V(jiu0.a(this), cop.f4713a, null, mneVar.f22085a, new defpackage.e(this, ((kjp) ujpVar).f18398a, yjeVar, b), 10);
                return;
            }
            if (ujpVar instanceof pjp) {
                O();
                return;
            }
            if (ujpVar instanceof gjp) {
                chq0 chq0Var = ((gjp) ujpVar).f11411a;
                if (chq0Var instanceof ahq0) {
                    j6m0 j6m0Var = ygq0.b;
                    byte b5 = ((ahq0) chq0Var).f886a;
                    j6m0Var.getClass();
                    R(j6m0.a(b5));
                    return;
                }
                if (chq0Var instanceof bhq0) {
                    S();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            if (ujpVar instanceof qjp) {
                if (((pnp) D()).h) {
                    S();
                    return;
                }
                return;
            } else {
                if (!(ujpVar instanceof ljp)) {
                    if (ujpVar instanceof ijp) {
                        G(zjp.f44492a);
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                if (((ljp) ujpVar).f20163a) {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value = p7m0Var4.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var4.m(value, pnp.a((pnp) value, null, false, null, null, ((ljp) ujpVar).f20163a, false, null, false, 0, null, false, false, false, false, null, null, 2097087)));
                    return;
                }
                return;
            }
        }
        boolean z8 = ((ajp) ujpVar).f988a;
        if (((pnp) D()).b) {
            p7m0 p7m0Var5 = ocjVar.f25029a;
            do {
                value4 = p7m0Var5.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var5.m(value4, pnp.a((pnp) value4, null, false, null, "", false, false, null, false, 0, null, false, false, false, false, null, null, 2097117)));
            gkp gkpVar = this.x.f15023a.f13218a;
            gkpVar.getClass();
            gkpVar.f11455a.o(null, "");
            return;
        }
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.p;
        if (z8) {
            c4m0 c4m0Var4 = this.U;
            if (c4m0Var4 != null) {
                c4m0Var4.cancel(null);
            }
            this.B.z(M());
            i1w0Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
