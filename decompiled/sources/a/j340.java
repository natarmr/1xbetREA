package a;

import android.gov.nist.core.Separators;
import com.appsflyer.share.attribution.RequestError;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.github.terrakok.cicerone.androidx.FragmentScreen$Companion$invoke$1;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;
import org.xplatform.cyber.section.api.home.CyberHomeParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$homeScreen$1;
import org.xplatform.fast_games.impl.navigation.FastGamesScreenFactoryImpl$provideFastGamesScreen$1;
import org.xplatform.feature.dayexpress.impl.presentation.DayExpressScreen;
import org.xplatform.feature.fin_bet.impl.presentation.FinBetScreen;
import org.xplatform.feature.fin_bet.impl.presentation.navigation.FinBetsScreen;
import org.xplatform.feature.online_call.impl.navigation.OnlineCallScreenFactoryImpl$getScreen$1;
import org.xplatform.feed.navigation.FeedScreenFactoryImpl$getPolybetScreen$1;
import org.xplatform.info.impl.navigation.InfoScreenFactoryImpl$getInfoScreen$1;
import org.xplatform.messages.navigation.MessagesScreens$MessagesScreen;
import org.xplatform.personal.impl.navigation.PersonalScreen$EditProfileTjScreen;
import org.xplatform.personal.impl.navigation.PersonalScreen$PersonalDataScreen;
import org.xplatform.promotions.loyalty.impl.navigation.PromotionsLoyaltyScreens$ChampionsClubFragmentScreen;
import org.xplatform.promotions.news.impl.navigation.PromotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1;
import org.xplatform.results.impl.di.navigation.ResultsScreenFactoryImpl$getMainScreen$1;
import org.xplatform.security.impl.navigation.SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1;
import org.xplatform.toto_jackpot.impl.navigation.TotoJackpotScreens$TotoJackpotDsFragmentScreen;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getHomeFragmentScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class j340 extends i3t0 {
    public static final /* synthetic */ int i1 = 0;
    public final lbu A;
    public final jdk0 A0;
    public final x1u B;
    public final u8u B0;
    public final rou C;
    public final gg5 C0;
    public final ahu D;
    public final ys70 D0;
    public final mnb E;
    public final z7z E0;
    public final zlt0 F;
    public final z7z F0;
    public final kc60 G;
    public final s64 G0;
    public final g5k H;
    public final b4j H0;
    public final duj I;
    public final je I0;
    public final ctf0 J;
    public final atz J0;
    public final dmt K;
    public final yox K0;
    public final tzi L;
    public final bzs0 L0;
    public final wpt M;
    public final lbu M0;
    public final lbu N;
    public final phf0 N0;
    public final r9u O;
    public final ouu O0;
    public final yfu P;
    public final gxu P0;
    public final nlu Q;
    public final kys0 Q0;
    public final r2u R;
    public final cyu R0;
    public final rpt S;
    public final lk5 S0;
    public final iqt T;
    public final eke0 T0;
    public final vjp U;
    public final mi70 U0;
    public final vqc V;
    public final pwi V0;
    public final peg0 W;
    public final roq0 W0;
    public final oct X;
    public final o470 X0;
    public final gle0 Y;
    public final v8d Y0;
    public final jh70 Z;
    public final sff0 Z0;
    public final uf3 a0;
    public c4m0 a1;
    public final prc b0;
    public c4m0 b1;
    public final vqc c0;
    public c4m0 c1;
    public final ls d0;
    public bby d1;
    public final g9m0 e0;
    public c4m0 e1;
    public final ag3 f0;
    public bby f1;
    public final y3v g0;
    public c4m0 g1;
    public final std h0;
    public bby h1;
    public final b4j i0;
    public final hs60 j0;
    public final ix0 k0;
    public final gw60 l0;
    public final lk5 m0;
    public final rqt n0;
    public final do20 o;
    public final kj5 o0;
    public final ouu p;
    public final org.xplatform.toto_bet.core.navigation.a p0;
    public final i1w0 q;
    public final xex q0;
    public final pmi0 r;
    public final m6m0 r0;
    public final mne s;
    public final xr s0;
    public final ot t;
    public final pek t0;
    public final jyg0 u;
    public final uzc0 u0;
    public final q840 v;
    public final iw20 v0;
    public final jh70 w;
    public final s2m0 w0;
    public final v88 x;
    public final lme0 x0;
    public final ytt y;
    public final xak y0;
    public final yfu z;
    public final kl5 z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public j340(vzg0 vzg0Var, pru pruVar, do20 do20Var, ouu ouuVar, i1w0 i1w0Var, q040 q040Var, pmi0 pmi0Var, mne mneVar, ot otVar, jyg0 jyg0Var, q840 q840Var, jh70 jh70Var, v88 v88Var, ytt yttVar, yfu yfuVar, lbu lbuVar, x1u x1uVar, rou rouVar, ahu ahuVar, mnb mnbVar, zlt0 zlt0Var, kc60 kc60Var, g5k g5kVar, duj dujVar, ctf0 ctf0Var, m1e m1eVar, dmt dmtVar, tzi tziVar, wpt wptVar, lbu lbuVar2, r9u r9uVar, qho qhoVar, yfu yfuVar2, nlu nluVar, r2u r2uVar, rpt rptVar, iqt iqtVar, vjp vjpVar, vqc vqcVar, peg0 peg0Var, oct octVar, gle0 gle0Var, jh70 jh70Var2, uf3 uf3Var, prc prcVar, vqc vqcVar2, ls lsVar, g9m0 g9m0Var, ag3 ag3Var, y3v y3vVar, std stdVar, b4j b4jVar, hs60 hs60Var, ix0 ix0Var, gw60 gw60Var, lk5 lk5Var, rqt rqtVar, kj5 kj5Var, org.xplatform.toto_bet.core.navigation.a aVar, xex xexVar, m6m0 m6m0Var, xr xrVar, pek pekVar, uzc0 uzc0Var, iw20 iw20Var, s2m0 s2m0Var, lme0 lme0Var, xak xakVar, kl5 kl5Var, jdk0 jdk0Var, u8u u8uVar, gg5 gg5Var, ys70 ys70Var, z7z z7zVar, z7z z7zVar2, s64 s64Var, b4j b4jVar2, je jeVar, atz atzVar, yox yoxVar, bzs0 bzs0Var, lbu lbuVar3, phf0 phf0Var, ouu ouuVar2, gxu gxuVar, kys0 kys0Var, cyu cyuVar, lk5 lk5Var2, eke0 eke0Var, mi70 mi70Var, pwi pwiVar, roq0 roq0Var, o470 o470Var, n4u n4uVar, bzt bztVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        ys70Var.getClass();
        z7zVar.getClass();
        z7zVar2.getClass();
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        byte b = 17;
        super(vzg0Var, new tg4((Object) pruVar, (Object) iqtVar, (Object) n4uVar, (Object) dmtVar, (Object) q040Var, (Object) qhoVar, (Object) ctf0Var, (byte) 8), cvm0.p(vs10Var, rwjVar), new bw20(ctf0Var, qhoVar, b));
        this.o = do20Var;
        this.p = ouuVar;
        this.q = i1w0Var;
        this.r = pmi0Var;
        this.s = mneVar;
        this.t = otVar;
        this.u = jyg0Var;
        this.v = q840Var;
        this.w = jh70Var;
        this.x = v88Var;
        this.y = yttVar;
        this.z = yfuVar;
        this.A = lbuVar;
        this.B = x1uVar;
        this.C = rouVar;
        this.D = ahuVar;
        this.E = mnbVar;
        this.F = zlt0Var;
        this.G = kc60Var;
        this.H = g5kVar;
        this.I = dujVar;
        this.J = ctf0Var;
        this.K = dmtVar;
        this.L = tziVar;
        this.M = wptVar;
        this.N = lbuVar2;
        this.O = r9uVar;
        this.P = yfuVar2;
        this.Q = nluVar;
        this.R = r2uVar;
        this.S = rptVar;
        this.T = iqtVar;
        this.U = vjpVar;
        this.V = vqcVar;
        this.W = peg0Var;
        this.X = octVar;
        this.Y = gle0Var;
        this.Z = jh70Var2;
        this.a0 = uf3Var;
        this.b0 = prcVar;
        this.c0 = vqcVar2;
        this.d0 = lsVar;
        this.e0 = g9m0Var;
        this.f0 = ag3Var;
        this.g0 = y3vVar;
        this.h0 = stdVar;
        this.i0 = b4jVar;
        this.j0 = hs60Var;
        this.k0 = ix0Var;
        this.l0 = gw60Var;
        this.m0 = lk5Var;
        this.n0 = rqtVar;
        this.o0 = kj5Var;
        this.p0 = aVar;
        this.q0 = xexVar;
        this.r0 = m6m0Var;
        this.s0 = xrVar;
        this.t0 = pekVar;
        this.u0 = uzc0Var;
        this.v0 = iw20Var;
        this.w0 = s2m0Var;
        this.x0 = lme0Var;
        this.y0 = xakVar;
        this.z0 = kl5Var;
        this.A0 = jdk0Var;
        this.B0 = u8uVar;
        this.C0 = gg5Var;
        this.D0 = ys70Var;
        this.E0 = z7zVar;
        this.F0 = z7zVar2;
        this.G0 = s64Var;
        this.H0 = b4jVar2;
        this.I0 = jeVar;
        this.J0 = atzVar;
        this.K0 = yoxVar;
        this.L0 = bzs0Var;
        this.M0 = lbuVar3;
        this.N0 = phf0Var;
        this.O0 = ouuVar2;
        this.P0 = gxuVar;
        this.Q0 = kys0Var;
        this.R0 = cyuVar;
        this.S0 = lk5Var2;
        this.T0 = eke0Var;
        this.U0 = mi70Var;
        this.V0 = pwiVar;
        this.W0 = roq0Var;
        this.X0 = o470Var;
        this.Y0 = bztVar.f3488a.a();
        this.Z0 = pruVar.a();
        boolean zBooleanValue = q040Var.c;
        Boolean bool = (Boolean) vzg0Var.a("SHOW_TELEGRAM_BOT_ON_START");
        zBooleanValue = bool != null ? bool.booleanValue() : zBooleanValue;
        Boolean bool2 = Boolean.FALSE;
        vzg0Var.e("SHOW_TELEGRAM_BOT_ON_START", bool2);
        if (zBooleanValue) {
            i1w0Var.d(new p240(this, b));
        }
        boolean zBooleanValue2 = q040Var.b;
        Boolean bool3 = (Boolean) vzg0Var.a("SHOW_CHANGE_ACCOUNT_ON_START");
        zBooleanValue2 = bool3 != null ? bool3.booleanValue() : zBooleanValue2;
        vzg0Var.e("SHOW_CHANGE_ACCOUNT_ON_START", bool2);
        if (zBooleanValue2) {
            G(x040.f40053a);
        }
        yje yjeVar = null;
        sac.V(jiu0.a(this), null, null, mneVar.b, new mq10((diu0) this, yjeVar, (byte) 27), 11);
        sac.T(new fnq(new va(((qe50) ouuVar.b).b, (byte) 17), new d340(this, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), rwjVar), e340.h);
    }

    public final void M(ql5 ql5Var) {
        if (ql5Var == null) {
            return;
        }
        bby bbyVar = this.d1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.d1 = sac.V(jiu0.a(this), s240.f31484a, null, this.s.b, new t240(this, ql5Var, null, (byte) 0), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable N(zje zjeVar) {
        u240 u240Var;
        Serializable g0g0Var;
        if (zjeVar instanceof u240) {
            u240Var = (u240) zjeVar;
            int i = u240Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                u240Var.k = i - Integer.MIN_VALUE;
            } else {
                u240Var = new u240(this, zjeVar);
            }
        } else {
            u240Var = new u240(this, zjeVar);
        }
        Object objA = u240Var.i;
        wne wneVar = wne.f39444a;
        int i2 = u240Var.k;
        try {
            if (i2 == 0) {
                z1x.P(objA);
                e0g0 e0g0Var = j0g0.b;
                rou rouVar = this.C;
                u240Var.k = 1;
                objA = rouVar.a(false, u240Var);
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
            m2c0 m2c0Var = (m2c0) objA;
            g0g0Var = StringsKt.u0(m2c0Var.U + Separators.SP + m2c0Var.V).toString();
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return g0g0Var instanceof g0g0 ? "" : g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(zje zjeVar) {
        v240 v240Var;
        long j;
        if (zjeVar instanceof v240) {
            v240Var = (v240) zjeVar;
            int i = v240Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                v240Var.l = i - Integer.MIN_VALUE;
            } else {
                v240Var = new v240(this, zjeVar);
            }
        } else {
            v240Var = new v240(this, zjeVar);
        }
        Object objN = v240Var.j;
        Object obj = wne.f39444a;
        int i2 = v240Var.l;
        if (i2 == 0) {
            z1x.P(objN);
            long jA = this.B.a();
            v240Var.i = jA;
            v240Var.l = 1;
            objN = N(v240Var);
            if (objN == obj) {
                return obj;
            }
            j = jA;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = v240Var.i;
            z1x.P(objN);
        }
        String str = (String) objN;
        if (!StringsKt.W(str)) {
            return str;
        }
        ctf0 ctf0Var = this.J;
        if (j <= 0) {
            return ctf0Var.b.a(R.string.user, Arrays.copyOf(new Object[0], 0));
        }
        return ctf0Var.b.a(R.string.menu_account_id, Arrays.copyOf(new Object[]{new Long(j)}, 1));
    }

    public final void P(Throwable th) {
        this.I.b(th, new b120(this, (byte) 23));
    }

    public final void Q(iz30 iz30Var) {
        String strV = bww.V(((d140) D()).s);
        String strC = vvw.C(iz30Var);
        this.f0.b(strV, strC);
        this.C0.m(strV, strC);
    }

    public final void R(lr1 lr1Var) {
        sac.V(jiu0.a(this), new i240(1, this, j340.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, this.s.f22085a, new mq10((Object) this, (Object) lr1Var, (yje) null, (byte) 28), 10);
    }

    public final void S() {
        sac.V(jiu0.a(this), new f340(1, this, j340.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, this.s.c, new z240(this, null, (byte) 2), 10);
    }

    public final void T() {
        sac.V(jiu0.a(this), new f340(1, this, j340.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 2), new q240(this, (byte) 1), this.s.c, new z240(this, null, (byte) 3), 8);
    }

    public final void U() {
        tzi tziVar = this.L;
        ((ag3) tziVar.h).f809a.c("main_menu_settings");
        ((s64) tziVar.e).f31684a.a(xun.f41520a, 3143L);
        FragmentScreen fragmentScreenB = pmi0.b(this.r, true);
        i1w0 i1w0Var = this.q;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        if (fragmentScreenB instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenB)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenB)));
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

    public final void V(int i, String str) {
        boolean z = this.Z0.p0;
        byte b = 0;
        boolean zO = StringsKt.O(str, "https://", false);
        i1w0 i1w0Var = this.q;
        if (zO && z) {
            i1w0Var.d(new r240(this, str, b));
            return;
        }
        if (StringsKt.O(str, "https://", false)) {
            G(new t040(str));
            return;
        }
        if (str.length() <= 0) {
            return;
        }
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        this.L0.getClass();
        k0w0VarI.h(bzs0.d(i, str));
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object W(zje zjeVar) {
        i340 i340Var;
        Object value;
        if (zjeVar instanceof i340) {
            i340Var = (i340) zjeVar;
            int i = i340Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                i340Var.k = i - Integer.MIN_VALUE;
            } else {
                i340Var = new i340(this, zjeVar);
            }
        } else {
            i340Var = new i340(this, zjeVar);
        }
        Object objB = i340Var.i;
        Object obj = wne.f39444a;
        int i2 = i340Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            i340Var.k = 1;
            objB = this.D.b(bm5.f2822a, i340Var);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        ql5 ql5Var = (ql5) objB;
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(ql5Var.b, p3u0.c);
        String str = ql5Var.f;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, d140.a((d140) value, false, false, false, null, null, null, null, strC, str, false, false, null, false, null, null, null, null, null, null, 1073741439)));
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        cv30 cv30Var = (cv30) obj;
        cv30Var.getClass();
        boolean zEquals = cv30Var.equals(vt30.f37983a);
        byte b = 5;
        byte b2 = 13;
        byte b3 = 2;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        byte b4 = 1;
        mne mneVar = this.s;
        yje yjeVar = null;
        if (zEquals) {
            c4m0 c4m0Var = this.e1;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                if (((d140) D()).p) {
                    this.e1 = sac.T(new fnq(new m430(vtb.N(((esh0) this.M.f39557a.b).c), this, (byte) 1), new a340(this, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), new vf20(2, this, j340.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 11));
                } else {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, d140.a((d140) value2, false, false, false, null, null, null, null, null, null, false, false, null, false, null, null, null, null, null, null, 1073741807)));
                }
            }
            if (this.Y0.p == lxw.h) {
                sac.V(jiu0.a(this), new p240(this, b2), null, mneVar.b, new z240(this, yjeVar, b), 10);
            }
            v3c.N(this.f1);
            bvc bvcVarA = jiu0.a(this);
            dvj dvjVar = mneVar.b;
            rwj rwjVar = mneVar.f22085a;
            this.f1 = sac.V(bvcVarA, null, null, dvjVar, new y240(this, yjeVar, objArr6 == true ? 1 : 0), 11);
            c4m0 c4m0Var2 = this.a1;
            if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                this.a1 = sac.T(new fnq(this.G.a(), new a340(this, yjeVar, objArr5 == true ? 1 : 0), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new vf20(2, this, j340.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 9));
            }
            c4m0 c4m0Var3 = this.g1;
            if (c4m0Var3 == null || !c4m0Var3.isActive()) {
                this.g1 = sac.T(new fnq(this.N0.m(), new mw20(this, null), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new vf20(2, this, j340.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 8));
                return;
            }
            return;
        }
        if (cv30Var.equals(xt30.f41446a)) {
            c4m0 c4m0Var4 = this.e1;
            if (c4m0Var4 != null) {
                c4m0Var4.cancel(null);
            }
            c4m0 c4m0Var5 = this.a1;
            if (c4m0Var5 != null) {
                c4m0Var5.cancel(null);
            }
            c4m0 c4m0Var6 = this.b1;
            if (c4m0Var6 != null) {
                c4m0Var6.cancel(null);
            }
            c4m0 c4m0Var7 = this.c1;
            if (c4m0Var7 != null) {
                c4m0Var7.cancel(null);
            }
            c4m0 c4m0Var8 = this.g1;
            if (c4m0Var8 != null) {
                c4m0Var8.cancel(null);
                return;
            }
            return;
        }
        boolean zEquals2 = cv30Var.equals(ju30.f17132a);
        i1w0 i1w0Var = this.q;
        if (zEquals2) {
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
        } else {
            if (cv30Var.equals(vu30.f38033a)) {
                U();
                return;
            }
            boolean zEquals3 = cv30Var.equals(qu30.f29329a);
            q840 q840Var = this.v;
            tzi tziVar = this.L;
            if (zEquals3) {
                ((ag3) tziVar.h).f809a.c("header_menu_msg_click");
                ((je) tziVar.d).f16351a.a(xun.f41520a, 3137L);
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                q840Var.getClass();
                MessagesScreens$MessagesScreen messagesScreens$MessagesScreen = new MessagesScreens$MessagesScreen();
                if (messagesScreens$MessagesScreen instanceof DialogScreen) {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) messagesScreens$MessagesScreen)));
                } else {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(messagesScreens$MessagesScreen)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            } else {
                boolean zEquals4 = cv30Var.equals(tu30.f34532a);
                jh70 jh70Var = this.w;
                if (zEquals4) {
                    if (!((d140) D()).p) {
                        return;
                    }
                    i8i.D("screen", "menu", ((zg) tziVar.j).f44322a, "acc_pers_data_move");
                    ((au0) tziVar.g).f1455a.a(cui0.b(new j1p("menu", (byte) 0)), 11012L);
                    i1w0Var.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                    PersonalScreen$PersonalDataScreen personalScreen$PersonalDataScreenJ = jh70.j(jh70Var, false);
                    if (personalScreen$PersonalDataScreenJ instanceof DialogScreen) {
                        copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) personalScreen$PersonalDataScreenJ)));
                    } else {
                        copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(personalScreen$PersonalDataScreenJ)));
                    }
                    ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayList2, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorO2;
                        if (!pawVar3.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar3.next());
                        }
                    }
                } else {
                    if (cv30Var.equals(ou30.f25858a)) {
                        S();
                        return;
                    }
                    if (cv30Var.equals(uu30.f36283a)) {
                        T();
                        return;
                    }
                    if (cv30Var.equals(wu30.f39773a)) {
                        sac.V(jiu0.a(this), new f340(1, this, j340.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 3), null, mneVar.b, new d340(this, yjeVar, b4), 10);
                        return;
                    }
                    if (cv30Var.equals(av30.f1508a)) {
                        ((ag3) tziVar.h).f809a.c("main_menu_upd_balance_call");
                        ((gg5) tziVar.c).f11237a.a(xun.f41520a, 3144L);
                        sac.V(jiu0.a(this), new f340(1, this, j340.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, mneVar.b, new z240(this, yjeVar, (byte) 4), 10);
                        return;
                    }
                    boolean zEquals5 = cv30Var.equals(su30.f32803a);
                    v88 v88Var = this.x;
                    if (zEquals5) {
                        v88.b(v88Var, i1w0Var, 0L, 4);
                        return;
                    }
                    if (cv30Var.equals(ru30.f31105a)) {
                        i1w0Var.getClass();
                        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
                        jh70Var.getClass();
                        PersonalScreen$EditProfileTjScreen personalScreen$EditProfileTjScreen = PersonalScreen$EditProfileTjScreen.f46781a;
                        if (personalScreen$EditProfileTjScreen instanceof DialogScreen) {
                            copyOnWriteArrayList3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) personalScreen$EditProfileTjScreen)));
                        } else {
                            copyOnWriteArrayList3.add(new c8d(y7d.f42146a, new w0w0(personalScreen$EditProfileTjScreen)));
                        }
                        ListIterator listIteratorO3 = b1j.o(i1w0Var, copyOnWriteArrayList3, 0);
                        while (true) {
                            paw pawVar4 = (paw) listIteratorO3;
                            if (!pawVar4.hasNext()) {
                                return;
                            } else {
                                i1w0Var.a((oe50) pawVar4.next());
                            }
                        }
                    } else {
                        if (cv30Var instanceof lu30) {
                            ql5 ql5Var = ((lu30) cv30Var).f20655a;
                            if (ql5Var == null) {
                                return;
                            }
                            sac.V(jiu0.a(this), new i240(1, this, j340.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 29), null, mneVar.b, new t240(this, ql5Var, null, b4), 10);
                            return;
                        }
                        if (cv30Var instanceof mu30) {
                            ((vlk) this.F.b).f37628a.e("changeBalance", ((mu30) cv30Var).f22395a);
                            return;
                        }
                        if (cv30Var.equals(nu30.f24130a)) {
                            sac.V(jiu0.a(this), new f340(1, this, j340.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, mneVar.b, new z240(this, null, b4), 10);
                            return;
                        }
                        byte b5 = 17;
                        if (cv30Var.equals(zu30.f44991a)) {
                            i1w0Var.d(new p240(this, b5));
                            return;
                        }
                        if (cv30Var.equals(ut30.f36239a)) {
                            E();
                            return;
                        }
                        byte b6 = 9;
                        if (cv30Var instanceof yu30) {
                            H(new u49(b5, ((yu30) cv30Var).f43250a, (boolean) (objArr4 == true ? 1 : 0)));
                            Object[] objArr7 = ((d140) D()).s == r040.AGGREGATOR ? 1 : 0;
                            boolean z = ((d140) D()).B;
                            if (objArr7 == 0 || z) {
                                return;
                            }
                            bby bbyVar = this.h1;
                            if (bbyVar == null || !bbyVar.isActive()) {
                                bby bbyVar2 = this.h1;
                                if (bbyVar2 == null || !bbyVar2.isActive()) {
                                    this.h1 = sac.f0(jiu0.a(this), 0L, TimeUnit.SECONDS, mneVar.b, new p240(this, b6), new d340(this, null, (byte) 2), 32);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (cv30Var instanceof iu30) {
                            H(new b120(((iu30) cv30Var).f15380a, (byte) 22));
                            return;
                        }
                        if (!(cv30Var instanceof pu30)) {
                            if (cv30Var.equals(wt30.f39720a)) {
                                p7m0 p7m0Var2 = ocjVar.f25029a;
                                do {
                                    value = p7m0Var2.getValue();
                                    value.getClass();
                                    oyg0Var.getClass();
                                } while (!p7m0Var2.m(value, d140.a((d140) value, false, false, false, null, null, null, null, null, null, false, false, null, false, null, null, null, null, null, null, 1073737727)));
                                return;
                            }
                            if (cv30Var instanceof ku30) {
                                M(((ku30) cv30Var).f18895a);
                                return;
                            } else if (cv30Var instanceof xu30) {
                                i1w0Var.d(new r240(this, ((xu30) cv30Var).f41491a, b4));
                                return;
                            } else {
                                t9f.b();
                                return;
                            }
                        }
                        wy30 wy30Var = ((pu30) cv30Var).f27595a;
                        iz30 iz30VarM = wy30Var.m();
                        if (this.b0.o(iz30VarM)) {
                            H(new b120(iz30VarM, (byte) 21));
                        }
                        Q(iz30VarM);
                        int iOrdinal = iz30VarM.ordinal();
                        ag3 ag3Var = this.f0;
                        if (iOrdinal == 11) {
                            this.l0.c();
                        } else if (iOrdinal == 13) {
                            ag3Var.c();
                            b1j.v("menu_other", this.G0.f31684a, 3246L);
                        }
                        if (wy30Var instanceof ry30) {
                            int iOrdinal2 = ((ry30) wy30Var).f31293a.ordinal();
                            byte b7 = 26;
                            byte b8 = 18;
                            byte b9 = 3;
                            vjp vjpVar = this.U;
                            sff0 sff0Var = this.Z0;
                            switch (iOrdinal2) {
                                case 1:
                                    j700 j700Var = j700.b;
                                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                                    FragmentScreen fragmentScreenA = vjpVar.a(j700Var);
                                    if (fragmentScreenA instanceof DialogScreen) {
                                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenA)));
                                    } else {
                                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenA)));
                                    }
                                    ListIterator listIteratorO4 = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
                                    while (true) {
                                        paw pawVar5 = (paw) listIteratorO4;
                                        if (pawVar5.hasNext()) {
                                            i1w0Var.a((oe50) pawVar5.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 2:
                                    j700 j700Var2 = j700.f16016a;
                                    CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                                    FragmentScreen fragmentScreenA2 = vjpVar.a(j700Var2);
                                    if (fragmentScreenA2 instanceof DialogScreen) {
                                        copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenA2)));
                                    } else {
                                        copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenA2)));
                                    }
                                    ListIterator listIteratorO5 = b1j.o(i1w0Var, copyOnWriteArrayListQ3, 0);
                                    while (true) {
                                        paw pawVar6 = (paw) listIteratorO5;
                                        if (pawVar6.hasNext()) {
                                            i1w0Var.a((oe50) pawVar6.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 3:
                                    k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                                    this.h0.getClass();
                                    k0w0VarI.h(new DayExpressScreen(true));
                                    ListIterator listIteratorO6 = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                                    while (true) {
                                        paw pawVar7 = (paw) listIteratorO6;
                                        if (pawVar7.hasNext()) {
                                            i1w0Var.a((oe50) pawVar7.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 4:
                                    j700 j700Var3 = j700.c;
                                    CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var);
                                    FragmentScreen fragmentScreenA3 = vjpVar.a(j700Var3);
                                    if (fragmentScreenA3 instanceof DialogScreen) {
                                        copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenA3)));
                                    } else {
                                        copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenA3)));
                                    }
                                    ListIterator listIteratorO7 = b1j.o(i1w0Var, copyOnWriteArrayListQ4, 0);
                                    while (true) {
                                        paw pawVar8 = (paw) listIteratorO7;
                                        if (pawVar8.hasNext()) {
                                            i1w0Var.a((oe50) pawVar8.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 5:
                                    j700 j700Var4 = j700.d;
                                    CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var);
                                    FragmentScreen fragmentScreenA4 = vjpVar.a(j700Var4);
                                    if (fragmentScreenA4 instanceof DialogScreen) {
                                        copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenA4)));
                                    } else {
                                        copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenA4)));
                                    }
                                    ListIterator listIteratorO8 = b1j.o(i1w0Var, copyOnWriteArrayListQ5, 0);
                                    while (true) {
                                        paw pawVar9 = (paw) listIteratorO8;
                                        if (pawVar9.hasNext()) {
                                            i1w0Var.a((oe50) pawVar9.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 6:
                                    k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
                                    this.Y.getClass();
                                    k0w0VarI2.h(new ResultsScreenFactoryImpl$getMainScreen$1());
                                    ListIterator listIteratorO9 = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
                                    while (true) {
                                        paw pawVar10 = (paw) listIteratorO9;
                                        if (pawVar10.hasNext()) {
                                            i1w0Var.a((oe50) pawVar10.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 7:
                                    i1w0Var.d(new p240(this, (byte) 11));
                                    break;
                                case 8:
                                    i1w0Var.d(new qi4((Object) this, nw80.i.getId(), (byte) 9));
                                    break;
                                case 9:
                                    k0w0 k0w0VarI3 = cs0.i(i1w0Var, i1w0Var);
                                    k0w0VarI3.h(oct.f(this.X, 0L, null, 0, null, null, 31));
                                    ListIterator listIteratorO10 = b1j.o(i1w0Var, k0w0VarI3.f17489a, 0);
                                    while (true) {
                                        paw pawVar11 = (paw) listIteratorO10;
                                        if (pawVar11.hasNext()) {
                                            i1w0Var.a((oe50) pawVar11.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 10:
                                    i1w0Var.d(new bw20(this, t270.b, b8));
                                    break;
                                case 11:
                                    i1w0Var.d(new bw20(this, t270.c, b8));
                                    break;
                                case 12:
                                    i1w0Var.d(new bw20(this, t270.d, b8));
                                    break;
                                case 13:
                                    CopyOnWriteArrayList copyOnWriteArrayListQ6 = b1j.q(i1w0Var);
                                    SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1 securitySettingsScreenFactoryImpl$getSecuritySettingsScreen$1F = iw20.f(this.v0, nqh0.f23960a);
                                    if (securitySettingsScreenFactoryImpl$getSecuritySettingsScreen$1F instanceof DialogScreen) {
                                        copyOnWriteArrayListQ6.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) securitySettingsScreenFactoryImpl$getSecuritySettingsScreen$1F)));
                                    } else {
                                        copyOnWriteArrayListQ6.add(new c8d(y7d.f42146a, new w0w0(securitySettingsScreenFactoryImpl$getSecuritySettingsScreen$1F)));
                                    }
                                    ListIterator listIteratorO11 = b1j.o(i1w0Var, copyOnWriteArrayListQ6, 0);
                                    while (true) {
                                        paw pawVar12 = (paw) listIteratorO11;
                                        if (pawVar12.hasNext()) {
                                            i1w0Var.a((oe50) pawVar12.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 14:
                                    CopyOnWriteArrayList copyOnWriteArrayListQ7 = b1j.q(i1w0Var);
                                    PromotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1 promotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1C = uzc0.c(this.u0, 0);
                                    if (promotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1C instanceof DialogScreen) {
                                        copyOnWriteArrayListQ7.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) promotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1C)));
                                    } else {
                                        copyOnWriteArrayListQ7.add(new c8d(y7d.f42146a, new w0w0(promotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1C)));
                                    }
                                    ListIterator listIteratorO12 = b1j.o(i1w0Var, copyOnWriteArrayListQ7, 0);
                                    while (true) {
                                        paw pawVar13 = (paw) listIteratorO12;
                                        if (pawVar13.hasNext()) {
                                            i1w0Var.a((oe50) pawVar13.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 15:
                                    i1w0Var.d(new p240(this, (byte) 8));
                                    break;
                                case 16:
                                    ygp ygpVar = ygp.Z;
                                    r9u r9uVar = this.O;
                                    r9uVar.getClass();
                                    j1q0 j1q0Var = r9uVar.f30104a;
                                    j1q0Var.getClass();
                                    boolean zD = j1q0Var.f15748a.d(ygpVar);
                                    pek pekVar = this.t0;
                                    if (!zD) {
                                        i1w0Var.getClass();
                                        k0w0 k0w0Var = new k0w0(i1w0Var);
                                        pekVar.getClass();
                                        k0w0Var.h(new FinBetScreen());
                                        ListIterator listIteratorO13 = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                                        while (true) {
                                            paw pawVar14 = (paw) listIteratorO13;
                                            if (pawVar14.hasNext()) {
                                                i1w0Var.a((oe50) pawVar14.next());
                                            }
                                        }
                                    } else {
                                        i1w0Var.getClass();
                                        k0w0 k0w0Var2 = new k0w0(i1w0Var);
                                        pekVar.getClass();
                                        k0w0Var2.h(new FinBetsScreen());
                                        ListIterator listIteratorO14 = b1j.o(i1w0Var, k0w0Var2.f17489a, 0);
                                        while (true) {
                                            paw pawVar15 = (paw) listIteratorO14;
                                            if (pawVar15.hasNext()) {
                                                i1w0Var.a((oe50) pawVar15.next());
                                            }
                                        }
                                    }
                                    break;
                                case 17:
                                    i1w0Var.d(new p240(this, objArr == true ? 1 : 0));
                                    break;
                                case 18:
                                    i1w0Var.d(new p240(this, b4));
                                    break;
                                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                case 46:
                                    i1w0Var.d(new p240(this, (byte) 7));
                                    break;
                                case 20:
                                    i1w0Var.d(new p240(this, (byte) 2));
                                    break;
                                case 21:
                                    CopyOnWriteArrayList copyOnWriteArrayListQ8 = b1j.q(i1w0Var);
                                    FragmentScreen$Companion$invoke$1 fragmentScreen$Companion$invoke$1D = this.a0.d(true);
                                    if (fragmentScreen$Companion$invoke$1D instanceof DialogScreen) {
                                        copyOnWriteArrayListQ8.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen$Companion$invoke$1D)));
                                    } else {
                                        copyOnWriteArrayListQ8.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen$Companion$invoke$1D)));
                                    }
                                    ListIterator listIteratorO15 = b1j.o(i1w0Var, copyOnWriteArrayListQ8, 0);
                                    while (true) {
                                        paw pawVar16 = (paw) listIteratorO15;
                                        if (pawVar16.hasNext()) {
                                            i1w0Var.a((oe50) pawVar16.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 22:
                                    CopyOnWriteArrayList copyOnWriteArrayListQ9 = b1j.q(i1w0Var);
                                    InfoScreenFactoryImpl$getInfoScreen$1 infoScreenFactoryImpl$getInfoScreen$1B = rqt.b(this.n0);
                                    if (infoScreenFactoryImpl$getInfoScreen$1B instanceof DialogScreen) {
                                        copyOnWriteArrayListQ9.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) infoScreenFactoryImpl$getInfoScreen$1B)));
                                    } else {
                                        copyOnWriteArrayListQ9.add(new c8d(y7d.f42146a, new w0w0(infoScreenFactoryImpl$getInfoScreen$1B)));
                                    }
                                    ListIterator listIteratorO16 = b1j.o(i1w0Var, copyOnWriteArrayListQ9, 0);
                                    while (true) {
                                        paw pawVar17 = (paw) listIteratorO16;
                                        if (pawVar17.hasNext()) {
                                            i1w0Var.a((oe50) pawVar17.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 23:
                                    ((ag3) tziVar.h).f809a.c("header_menu_msg_click");
                                    ((je) tziVar.d).f16351a.a(xun.f41520a, 3137L);
                                    i1w0Var.getClass();
                                    CopyOnWriteArrayList copyOnWriteArrayList4 = new CopyOnWriteArrayList();
                                    q840Var.getClass();
                                    MessagesScreens$MessagesScreen messagesScreens$MessagesScreen2 = new MessagesScreens$MessagesScreen();
                                    if (messagesScreens$MessagesScreen2 instanceof DialogScreen) {
                                        copyOnWriteArrayList4.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) messagesScreens$MessagesScreen2)));
                                    } else {
                                        copyOnWriteArrayList4.add(new c8d(y7d.f42146a, new w0w0(messagesScreens$MessagesScreen2)));
                                    }
                                    ListIterator listIteratorO17 = b1j.o(i1w0Var, copyOnWriteArrayList4, 0);
                                    while (true) {
                                        paw pawVar18 = (paw) listIteratorO17;
                                        if (pawVar18.hasNext()) {
                                            i1w0Var.a((oe50) pawVar18.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 24:
                                    sac.V(jiu0.a(this), new i240(1, this, j340.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, mneVar.c, new y240(this, null, b4), 10);
                                    break;
                                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                    i1w0Var.d(new p240(this, (byte) 17));
                                    break;
                                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                                    S();
                                    break;
                                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                                    T();
                                    break;
                                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                                    U();
                                    break;
                                case 32:
                                    this.c0.k(pzb.C(new tr20(b7)));
                                    CyberHomeParams cyberHomeParams = new CyberHomeParams(org.xplatform.cyber.section.api.domain.entity.d.d(0), CyberGamesParentSectionModel.FromSection.INSTANCE);
                                    CopyOnWriteArrayList copyOnWriteArrayListQ10 = b1j.q(i1w0Var);
                                    vqc vqcVar = this.V;
                                    vqcVar.getClass();
                                    CyberGamesScreenFactoryImpl$homeScreen$1 cyberGamesScreenFactoryImpl$homeScreen$1 = new CyberGamesScreenFactoryImpl$homeScreen$1(vqcVar, cyberHomeParams);
                                    if (cyberGamesScreenFactoryImpl$homeScreen$1 instanceof DialogScreen) {
                                        copyOnWriteArrayListQ10.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) cyberGamesScreenFactoryImpl$homeScreen$1)));
                                    } else {
                                        copyOnWriteArrayListQ10.add(new c8d(y7d.f42146a, new w0w0(cyberGamesScreenFactoryImpl$homeScreen$1)));
                                    }
                                    ListIterator listIteratorO18 = b1j.o(i1w0Var, copyOnWriteArrayListQ10, 0);
                                    while (true) {
                                        paw pawVar19 = (paw) listIteratorO18;
                                        if (pawVar19.hasNext()) {
                                            i1w0Var.a((oe50) pawVar19.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 33:
                                    k0w0 k0w0VarI4 = cs0.i(i1w0Var, i1w0Var);
                                    this.Q0.getClass();
                                    k0w0VarI4.h(new UfcScreensFactoryImpl$getHomeFragmentScreen$1());
                                    ListIterator listIteratorO19 = b1j.o(i1w0Var, k0w0VarI4.f17489a, 0);
                                    while (true) {
                                        paw pawVar20 = (paw) listIteratorO19;
                                        if (pawVar20.hasNext()) {
                                            i1w0Var.a((oe50) pawVar20.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 34:
                                    R(new hr1(0L, 3));
                                    break;
                                case 35:
                                    R(new fr1(null, null, 3));
                                    break;
                                case 36:
                                    R(new jr1(new evc0(true, 0L)));
                                    break;
                                case 37:
                                    R(new jr1());
                                    this.i0.m();
                                    this.k0.m();
                                    break;
                                case 38:
                                    i1w0Var.d(new p240(this, b9));
                                    break;
                                case 39:
                                    i1w0Var.d(new p240(this, (byte) 4));
                                    break;
                                case 40:
                                    v88.b(v88Var, i1w0Var, 0L, 4);
                                    break;
                                case 41:
                                    k0w0 k0w0VarI5 = cs0.i(i1w0Var, i1w0Var);
                                    this.y0.getClass();
                                    k0w0VarI5.h(new FastGamesScreenFactoryImpl$provideFastGamesScreen$1());
                                    ListIterator listIteratorO20 = b1j.o(i1w0Var, k0w0VarI5.f17489a, 0);
                                    while (true) {
                                        paw pawVar21 = (paw) listIteratorO20;
                                        if (pawVar21.hasNext()) {
                                            i1w0Var.a((oe50) pawVar21.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 42:
                                case 55:
                                    i1w0Var.d(new qi4((Object) this, nw80.b.getId(), (byte) 9));
                                    break;
                                case 43:
                                case 57:
                                    i1w0Var.d(new qi4((Object) this, nw80.f24223a.getId(), (byte) 9));
                                    break;
                                case 44:
                                    R(new hr1(0L, 3));
                                    break;
                                case 45:
                                    R(new kr1());
                                    break;
                                case 47:
                                    k0w0 k0w0VarI6 = cs0.i(i1w0Var, i1w0Var);
                                    this.U0.getClass();
                                    k0w0VarI6.h(new PromotionsLoyaltyScreens$ChampionsClubFragmentScreen());
                                    ListIterator listIteratorO21 = b1j.o(i1w0Var, k0w0VarI6.f17489a, 0);
                                    while (true) {
                                        paw pawVar22 = (paw) listIteratorO21;
                                        if (pawVar22.hasNext()) {
                                            i1w0Var.a((oe50) pawVar22.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 48:
                                    i1w0Var.d(new p240(this, (byte) 5));
                                    break;
                                case 49:
                                case 51:
                                    k0w0 k0w0VarI7 = cs0.i(i1w0Var, i1w0Var);
                                    this.w0.getClass();
                                    k0w0VarI7.h(new TotoJackpotScreens$TotoJackpotDsFragmentScreen());
                                    ListIterator listIteratorO22 = b1j.o(i1w0Var, k0w0VarI7.f17489a, 0);
                                    while (true) {
                                        paw pawVar23 = (paw) listIteratorO22;
                                        if (pawVar23.hasNext()) {
                                            i1w0Var.a((oe50) pawVar23.next());
                                        }
                                        break;
                                    }
                                    break;
                                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                    sac.V(jiu0.a(this), new i240(1, this, j340.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 25), null, mneVar.f22085a, new mq10(this, new q240(this, objArr2 == true ? 1 : 0), (yje) null, b7), 10);
                                    break;
                                case 52:
                                case 53:
                                case 54:
                                    k0w0 k0w0VarI8 = cs0.i(i1w0Var, i1w0Var);
                                    ys70 ys70Var = this.D0;
                                    ys70Var.getClass();
                                    k0w0VarI8.h(new OnlineCallScreenFactoryImpl$getScreen$1(ys70Var));
                                    ListIterator listIteratorO23 = b1j.o(i1w0Var, k0w0VarI8.f17489a, 0);
                                    while (true) {
                                        paw pawVar24 = (paw) listIteratorO23;
                                        if (pawVar24.hasNext()) {
                                            i1w0Var.a((oe50) pawVar24.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 56:
                                    k0w0 k0w0VarI9 = cs0.i(i1w0Var, i1w0Var);
                                    rz4.u(this.x0, k0w0VarI9);
                                    ListIterator listIteratorO24 = b1j.o(i1w0Var, k0w0VarI9.f17489a, 0);
                                    while (true) {
                                        paw pawVar25 = (paw) listIteratorO24;
                                        if (pawVar25.hasNext()) {
                                            i1w0Var.a((oe50) pawVar25.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 58:
                                    R(new er1(false, 126L));
                                    break;
                                case 60:
                                    this.H0.f("menu_aggregator", "");
                                    this.I0.d("menu_aggregator", "");
                                    i1w0Var.d(new p240(this, (byte) 10));
                                    break;
                                case 61:
                                    sac.V(jiu0.a(this), new i240(1, this, j340.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, mneVar.f22085a, new z240(this, null, objArr3 == true ? 1 : 0), 10);
                                    break;
                                case 62:
                                    i1w0Var.d(new p240(this, (byte) 6));
                                    break;
                                case 63:
                                    V(R.string.info_partner_programm, sff0Var.m.k);
                                    break;
                                case 64:
                                    V(R.string.info_agent_programm, sff0Var.m.l);
                                    break;
                                case 65:
                                    i1w0Var.d(new p240(this, (byte) 12));
                                    break;
                                case 66:
                                    k0w0 k0w0VarI10 = cs0.i(i1w0Var, i1w0Var);
                                    vjpVar.getClass();
                                    k0w0VarI10.h(new FeedScreenFactoryImpl$getPolybetScreen$1());
                                    ListIterator listIteratorO25 = b1j.o(i1w0Var, k0w0VarI10.f17489a, 0);
                                    while (true) {
                                        paw pawVar26 = (paw) listIteratorO25;
                                        if (pawVar26.hasNext()) {
                                            i1w0Var.a((oe50) pawVar26.next());
                                        }
                                        break;
                                    }
                                    break;
                            }
                            return;
                        }
                        if (wy30Var instanceof vy30) {
                            sac.V(jiu0.a(this), new f340(1, this, j340.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, mneVar.f22085a, new n1(wy30Var, (Object) this, (yje) null, (byte) 19), 10);
                            return;
                        }
                        if (!(wy30Var instanceof sy30)) {
                            if (wy30Var instanceof uy30) {
                                uy30 uy30Var = (uy30) wy30Var;
                                iz30 iz30Var = uy30Var.f36470a;
                                d240 d240Var = new d240(false, iz30Var, r040.VIRTUAL, uy30Var.b, uy30Var.c, "", "", 0L);
                                Q(iz30Var);
                                i1w0Var.d(new bw20((Object) this, (Object) d240Var, (byte) 16));
                                return;
                            }
                            if (!(wy30Var instanceof ty30)) {
                                if (wy30Var instanceof qy30) {
                                    G(new b140(((smu) this.E0.get()).a(), ((rmu) this.F0.get()).a()));
                                    return;
                                } else {
                                    t9f.b();
                                    return;
                                }
                            }
                            ty30 ty30Var = (ty30) wy30Var;
                            iz30 iz30Var2 = ty30Var.f34733a;
                            c240 c240Var = new c240(false, iz30Var2, r040.VIRTUAL, ty30Var.b, ty30Var.c, "", "", "", 0L);
                            Q(iz30Var2);
                            i1w0Var.d(new bw20((Object) this, (Object) c240Var, (byte) 15));
                            return;
                        }
                        sy30 sy30Var = (sy30) wy30Var;
                        int i = sy30Var.f33007a;
                        String strV = bww.V(((d140) D()).s);
                        ag3Var.a(strV, String.valueOf(i));
                        this.C0.l(i, strV);
                        FragmentScreen fragmentScreenH = this.g0.h(i, sy30Var.b);
                        CopyOnWriteArrayList copyOnWriteArrayListQ11 = b1j.q(i1w0Var);
                        if (fragmentScreenH instanceof DialogScreen) {
                            copyOnWriteArrayListQ11.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenH)));
                        } else {
                            copyOnWriteArrayListQ11.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenH)));
                        }
                        ListIterator listIteratorO26 = b1j.o(i1w0Var, copyOnWriteArrayListQ11, 0);
                        while (true) {
                            paw pawVar27 = (paw) listIteratorO26;
                            if (!pawVar27.hasNext()) {
                                return;
                            } else {
                                i1w0Var.a((oe50) pawVar27.next());
                            }
                        }
                    }
                }
            }
        }
    }
}
