package a;

import com.appsflyer.share.attribution.RequestError;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import org.xplatform.promotions.loyalty.impl.navigation.PromotionsLoyaltyScreens$ChampionsClubFragmentScreen;
import org.xplatform.results.impl.di.navigation.ResultsScreenFactoryImpl$getMainScreen$1;
import org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getHomeFragmentScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class rio0 extends w46 {
    public final b4j A;
    public final atz A0;
    public final hs60 B;
    public final r2u B0;
    public final ix0 C;
    public final rpt C0;
    public final gw60 D;
    public final nhf0 D0;
    public final gg5 E;
    public final yfu E0;
    public final lk5 F;
    public final yox F0;
    public final rqt G;
    public final bzs0 G0;
    public final kj5 H;
    public final kys0 H0;
    public final org.xplatform.toto_bet.core.navigation.a I;
    public final cyu I0;
    public final xex J;
    public final lk5 J0;
    public final m6m0 K;
    public final eke0 K0;
    public final r9u L;
    public final p7m0 L0;
    public final xr M;
    public final ol60 M0;
    public final pek N;
    public final p7m0 N0;
    public final uzc0 O;
    public boolean O0;
    public final r040 P;
    public bby P0;
    public final iw20 Q;
    public bby Q0;
    public final vzg0 R;
    public bby R0;
    public final yoc S;
    public bby S0;
    public final yoc T;
    public final ieu U;
    public final cmt V;
    public final tzi W;
    public final pau X;
    public final lbu Y;
    public final prc Z;
    public final s2m0 a0;
    public final nlu b;
    public final lme0 b0;
    public final pru c;
    public final xak c0;
    public final lbu d;
    public final kl5 d0;
    public final duj e;
    public final ouu e0;
    public final ouu f;
    public final jdk0 f0;
    public final iqt g;
    public final u8u g0;
    public final gxu h;
    public final hsj h0;
    public final rou i;
    public final pwi i0;
    public final vqc j;
    public final roq0 j0;
    public final ls k;
    public final o470 k0;
    public final vjp l;
    public final z7z l0;
    public final vqc m;
    public final z7z m0;
    public final peg0 n;
    public final ys70 n0;
    public final oct o;
    public final hqx o0;
    public final g9m0 p;
    public final pzt p0;
    public final jh70 q;
    public final rjo q0;
    public final mi70 r;
    public final s64 r0;
    public final tf3 s;
    public final bbw0 s0;
    public final ag3 t;
    public final b4j t0;
    public final y3v u;
    public final je u0;
    public final std v;
    public final qho v0;
    public final gle0 w;
    public final o3c w0;
    public final ctf0 x;
    public final n4u x0;
    public final mne y;
    public final jqc y0;
    public final i1w0 z;
    public final roi0 z0;

    public rio0(nlu nluVar, pru pruVar, lbu lbuVar, duj dujVar, ouu ouuVar, iqt iqtVar, gxu gxuVar, rou rouVar, vqc vqcVar, ls lsVar, vjp vjpVar, vqc vqcVar2, peg0 peg0Var, oct octVar, g9m0 g9m0Var, jh70 jh70Var, mi70 mi70Var, tf3 tf3Var, ag3 ag3Var, y3v y3vVar, std stdVar, gle0 gle0Var, ctf0 ctf0Var, mne mneVar, i1w0 i1w0Var, b4j b4jVar, hs60 hs60Var, ix0 ix0Var, gw60 gw60Var, gg5 gg5Var, lk5 lk5Var, rqt rqtVar, kj5 kj5Var, org.xplatform.toto_bet.core.navigation.a aVar, xex xexVar, m6m0 m6m0Var, r9u r9uVar, xr xrVar, pek pekVar, uzc0 uzc0Var, r040 r040Var, iw20 iw20Var, vzg0 vzg0Var, yoc yocVar, yoc yocVar2, ieu ieuVar, cmt cmtVar, tzi tziVar, pau pauVar, lbu lbuVar2, prc prcVar, s2m0 s2m0Var, lme0 lme0Var, xak xakVar, kl5 kl5Var, ouu ouuVar2, jdk0 jdk0Var, khf0 khf0Var, trm0 trm0Var, u8u u8uVar, hsj hsjVar, do20 do20Var, tf3 tf3Var2, pwi pwiVar, roq0 roq0Var, o470 o470Var, z7z z7zVar, z7z z7zVar2, ys70 ys70Var, hqx hqxVar, pzt pztVar, rjo rjoVar, s64 s64Var, bbw0 bbw0Var, b4j b4jVar2, je jeVar, qho qhoVar, o3c o3cVar, n4u n4uVar, jqc jqcVar, roi0 roi0Var, atz atzVar, kc60 kc60Var, r2u r2uVar, rpt rptVar, nhf0 nhf0Var, yfu yfuVar, yox yoxVar, bzs0 bzs0Var, kys0 kys0Var, cyu cyuVar, lk5 lk5Var2, eke0 eke0Var) {
        i1w0Var.getClass();
        r9uVar.getClass();
        z7zVar.getClass();
        z7zVar2.getClass();
        this.b = nluVar;
        this.c = pruVar;
        this.d = lbuVar;
        this.e = dujVar;
        this.f = ouuVar;
        this.g = iqtVar;
        this.h = gxuVar;
        this.i = rouVar;
        this.j = vqcVar;
        this.k = lsVar;
        this.l = vjpVar;
        this.m = vqcVar2;
        this.n = peg0Var;
        this.o = octVar;
        this.p = g9m0Var;
        this.q = jh70Var;
        this.r = mi70Var;
        this.s = tf3Var;
        this.t = ag3Var;
        this.u = y3vVar;
        this.v = stdVar;
        this.w = gle0Var;
        this.x = ctf0Var;
        this.y = mneVar;
        this.z = i1w0Var;
        this.A = b4jVar;
        this.B = hs60Var;
        this.C = ix0Var;
        this.D = gw60Var;
        this.E = gg5Var;
        this.F = lk5Var;
        this.G = rqtVar;
        this.H = kj5Var;
        this.I = aVar;
        this.J = xexVar;
        this.K = m6m0Var;
        this.L = r9uVar;
        this.M = xrVar;
        this.N = pekVar;
        this.O = uzc0Var;
        this.P = r040Var;
        this.Q = iw20Var;
        this.R = vzg0Var;
        this.S = yocVar;
        this.T = yocVar2;
        this.U = ieuVar;
        this.V = cmtVar;
        this.W = tziVar;
        this.X = pauVar;
        this.Y = lbuVar2;
        this.Z = prcVar;
        this.a0 = s2m0Var;
        this.b0 = lme0Var;
        this.c0 = xakVar;
        this.d0 = kl5Var;
        this.e0 = ouuVar2;
        this.f0 = jdk0Var;
        this.g0 = u8uVar;
        this.h0 = hsjVar;
        this.i0 = pwiVar;
        this.j0 = roq0Var;
        this.k0 = o470Var;
        this.l0 = z7zVar;
        this.m0 = z7zVar2;
        this.n0 = ys70Var;
        this.o0 = hqxVar;
        this.p0 = pztVar;
        this.q0 = rjoVar;
        this.r0 = s64Var;
        this.s0 = bbw0Var;
        this.t0 = b4jVar2;
        this.u0 = jeVar;
        this.v0 = qhoVar;
        this.w0 = o3cVar;
        this.x0 = n4uVar;
        this.y0 = jqcVar;
        this.z0 = roi0Var;
        this.A0 = atzVar;
        this.B0 = r2uVar;
        this.C0 = rptVar;
        this.D0 = nhf0Var;
        this.E0 = yfuVar;
        this.F0 = yoxVar;
        this.G0 = bzs0Var;
        this.H0 = kys0Var;
        this.I0 = cyuVar;
        this.J0 = lk5Var2;
        this.K0 = eke0Var;
        this.L0 = q7m0.a(yho0.f42647a);
        this.M0 = new ol60(3);
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.N0 = q7m0.a(lunVar);
        yje yjeVar = null;
        sac.T(new fnq(new va(((qe50) ouuVar2.b).b, (byte) 23), new lio0(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), oio0.h);
        sac.T(new fnq(dtb.z(kc60Var.a(), 1), new ssl0((Object) this, yjeVar, (byte) 13), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), oho0.h);
    }

    public final void A(Throwable th) {
        this.e.b(th, new mho0(this, (byte) 0));
    }

    public final void B() {
        e3c.n(this.S0);
        this.S0 = sac.V(jiu0.a(this), hio0.f13124a, null, this.y.f22085a, new jio0(this, null, (byte) 0), 10);
    }

    public final void C(f240 f240Var) {
        String strV = bww.V(z());
        String strD = vvw.D(f240Var);
        ag3 ag3Var = this.t;
        ag3Var.b(strV, strD);
        this.E.m(strV, strD);
        int iOrdinal = f240Var.m().ordinal();
        if (iOrdinal == 11) {
            this.D.c();
        } else {
            if (iOrdinal != 13) {
                return;
            }
            ag3Var.c();
            b1j.v("menu_other", this.r0.f31684a, 3246L);
        }
    }

    public final void D(lr1 lr1Var) {
        sac.V(jiu0.a(this), new tfo0(1, this, rio0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, this.y.f22085a, new lcl0(this, lr1Var, null, (byte) 19), 10);
    }

    public final void E(f240 f240Var) {
        p7m0 p7m0Var;
        Object value;
        LinkedHashMap linkedHashMapP;
        f240Var.getClass();
        iz30 iz30VarM = f240Var.m();
        boolean z = false;
        z = false;
        if (this.Z.o(iz30VarM)) {
            do {
                p7m0Var = this.N0;
                value = p7m0Var.getValue();
                Map map = (Map) value;
                linkedHashMapP = xp20.p(map);
                for (r040 r040Var : linkedHashMapP.keySet()) {
                    Object obj = map.get(r040Var);
                    Object obj2 = obj;
                    if (obj == null) {
                        obj2 = iun.f15405a;
                    }
                    ArrayList arrayListN0 = CollectionsKt.N0((Collection) obj2);
                    Iterator it = arrayListN0.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        } else if (((f240) it.next()).m() == iz30VarM) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        f240 f240Var2 = (f240) arrayListN0.get(i);
                        arrayListN0.set(i, fww.y(f240Var2, !f240Var2.K()));
                        linkedHashMapP.put(r040Var, arrayListN0);
                    }
                }
            } while (!p7m0Var.m(value, linkedHashMapP));
        }
        C(f240Var);
        int iOrdinal = f240Var.m().ordinal();
        byte b = 18;
        byte b2 = 14;
        byte b3 = 1;
        vjp vjpVar = this.l;
        r9u r9uVar = this.L;
        pru pruVar = this.c;
        byte b4 = 2;
        mne mneVar = this.y;
        yje yjeVar = null;
        i1w0 i1w0Var = this.z;
        switch (iOrdinal) {
            case 1:
                j700 j700Var = j700.b;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                FragmentScreen fragmentScreenA = vjpVar.a(j700Var);
                if (fragmentScreenA instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenA)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenA)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (pawVar.hasNext()) {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            case 2:
                j700 j700Var2 = j700.f16016a;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                FragmentScreen fragmentScreenA2 = vjpVar.a(j700Var2);
                if (fragmentScreenA2 instanceof DialogScreen) {
                    copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenA2)));
                } else {
                    copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenA2)));
                }
                ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO2;
                    if (pawVar2.hasNext()) {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                    break;
                }
                break;
            case 3:
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                this.v.getClass();
                k0w0VarI.h(new DayExpressScreen(true));
                ListIterator listIteratorO3 = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorO3;
                    if (pawVar3.hasNext()) {
                        i1w0Var.a((oe50) pawVar3.next());
                    }
                    break;
                }
                break;
            case 4:
                j700 j700Var3 = j700.c;
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                FragmentScreen fragmentScreenA3 = vjpVar.a(j700Var3);
                if (fragmentScreenA3 instanceof DialogScreen) {
                    copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenA3)));
                } else {
                    copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenA3)));
                }
                ListIterator listIteratorO4 = b1j.o(i1w0Var, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar4 = (paw) listIteratorO4;
                    if (pawVar4.hasNext()) {
                        i1w0Var.a((oe50) pawVar4.next());
                    }
                    break;
                }
                break;
            case 5:
                j700 j700Var4 = j700.d;
                CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var);
                FragmentScreen fragmentScreenA4 = vjpVar.a(j700Var4);
                if (fragmentScreenA4 instanceof DialogScreen) {
                    copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenA4)));
                } else {
                    copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenA4)));
                }
                ListIterator listIteratorO5 = b1j.o(i1w0Var, copyOnWriteArrayListQ4, 0);
                while (true) {
                    paw pawVar5 = (paw) listIteratorO5;
                    if (pawVar5.hasNext()) {
                        i1w0Var.a((oe50) pawVar5.next());
                    }
                    break;
                }
                break;
            case 6:
                k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
                this.w.getClass();
                k0w0VarI2.h(new ResultsScreenFactoryImpl$getMainScreen$1());
                ListIterator listIteratorO6 = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
                while (true) {
                    paw pawVar6 = (paw) listIteratorO6;
                    if (pawVar6.hasNext()) {
                        i1w0Var.a((oe50) pawVar6.next());
                    }
                    break;
                }
                break;
            case 7:
                i1w0Var.d(new lho0(this, (byte) 10));
                break;
            case 8:
                D(new fr1(new fs80(null, nw80.i.getId(), null, null, 0L, true, 93), null, 2));
                break;
            case 9:
                k0w0 k0w0VarI3 = cs0.i(i1w0Var, i1w0Var);
                k0w0VarI3.h(oct.f(this.o, 0L, null, 0, null, null, 31));
                ListIterator listIteratorO7 = b1j.o(i1w0Var, k0w0VarI3.f17489a, 0);
                while (true) {
                    paw pawVar7 = (paw) listIteratorO7;
                    if (pawVar7.hasNext()) {
                        i1w0Var.a((oe50) pawVar7.next());
                    }
                    break;
                }
                break;
            case 10:
                i1w0Var.d(new itn0(this, t270.b, b2));
                break;
            case 11:
                i1w0Var.d(new itn0(this, t270.c, b2));
                break;
            case 12:
                i1w0Var.d(new itn0(this, t270.d, b2));
                break;
            case 13:
                CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var);
                FragmentScreen fragmentScreenF = iw20.f(this.Q, nqh0.f23960a);
                if (fragmentScreenF instanceof DialogScreen) {
                    copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenF)));
                } else {
                    copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenF)));
                }
                ListIterator listIteratorO8 = b1j.o(i1w0Var, copyOnWriteArrayListQ5, 0);
                while (true) {
                    paw pawVar8 = (paw) listIteratorO8;
                    if (pawVar8.hasNext()) {
                        i1w0Var.a((oe50) pawVar8.next());
                    }
                    break;
                }
                break;
            case 14:
                CopyOnWriteArrayList copyOnWriteArrayListQ6 = b1j.q(i1w0Var);
                FragmentScreen fragmentScreenC = uzc0.c(this.O, 0);
                if (fragmentScreenC instanceof DialogScreen) {
                    copyOnWriteArrayListQ6.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenC)));
                } else {
                    copyOnWriteArrayListQ6.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenC)));
                }
                ListIterator listIteratorO9 = b1j.o(i1w0Var, copyOnWriteArrayListQ6, 0);
                while (true) {
                    paw pawVar9 = (paw) listIteratorO9;
                    if (pawVar9.hasNext()) {
                        i1w0Var.a((oe50) pawVar9.next());
                    }
                    break;
                }
                break;
            case 15:
                i1w0Var.d(new lho0(this, b4));
                break;
            case 16:
                ygp ygpVar = ygp.Z;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                boolean zD = j1q0Var.f15748a.d(ygpVar);
                pek pekVar = this.N;
                if (!zD) {
                    i1w0Var.getClass();
                    k0w0 k0w0Var = new k0w0(i1w0Var);
                    pekVar.getClass();
                    k0w0Var.h(new FinBetScreen());
                    ListIterator listIteratorO10 = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                    while (true) {
                        paw pawVar10 = (paw) listIteratorO10;
                        if (pawVar10.hasNext()) {
                            i1w0Var.a((oe50) pawVar10.next());
                        }
                    }
                } else {
                    i1w0Var.getClass();
                    k0w0 k0w0Var2 = new k0w0(i1w0Var);
                    pekVar.getClass();
                    k0w0Var2.h(new FinBetsScreen());
                    ListIterator listIteratorO11 = b1j.o(i1w0Var, k0w0Var2.f17489a, 0);
                    while (true) {
                        paw pawVar11 = (paw) listIteratorO11;
                        if (pawVar11.hasNext()) {
                            i1w0Var.a((oe50) pawVar11.next());
                        }
                    }
                }
                break;
            case 17:
                i1w0Var.d(new lho0(this, z ? (byte) 1 : (byte) 0));
                break;
            case 18:
                i1w0Var.d(new lho0(this, (byte) 8));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 46:
                i1w0Var.d(new lho0(this, b3));
                break;
            case 20:
                if (pruVar.a().B0) {
                    ygp ygpVar2 = ygp.u;
                    r9uVar.getClass();
                    j1q0 j1q0Var2 = r9uVar.f30104a;
                    j1q0Var2.getClass();
                    if (j1q0Var2.f15748a.d(ygpVar2)) {
                        z = true;
                    }
                }
                i1w0Var.d(new ij90((Object) this, z, (byte) 13));
                break;
            case 21:
                CopyOnWriteArrayList copyOnWriteArrayListQ7 = b1j.q(i1w0Var);
                FragmentScreen fragmentScreenD = ((uf3) this.s).d(true);
                if (fragmentScreenD instanceof DialogScreen) {
                    copyOnWriteArrayListQ7.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenD)));
                } else {
                    copyOnWriteArrayListQ7.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenD)));
                }
                ListIterator listIteratorO12 = b1j.o(i1w0Var, copyOnWriteArrayListQ7, 0);
                while (true) {
                    paw pawVar12 = (paw) listIteratorO12;
                    if (pawVar12.hasNext()) {
                        i1w0Var.a((oe50) pawVar12.next());
                    }
                    break;
                }
                break;
            case 22:
                CopyOnWriteArrayList copyOnWriteArrayListQ8 = b1j.q(i1w0Var);
                FragmentScreen fragmentScreenB = rqt.b(this.G);
                if (fragmentScreenB instanceof DialogScreen) {
                    copyOnWriteArrayListQ8.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenB)));
                } else {
                    copyOnWriteArrayListQ8.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenB)));
                }
                ListIterator listIteratorO13 = b1j.o(i1w0Var, copyOnWriteArrayListQ8, 0);
                while (true) {
                    paw pawVar13 = (paw) listIteratorO13;
                    if (pawVar13.hasNext()) {
                        i1w0Var.a((oe50) pawVar13.next());
                    }
                    break;
                }
                break;
            case 24:
                sac.V(jiu0.a(this), new tfo0(1, this, rio0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 10), null, mneVar.c, new jio0(this, yjeVar, b3), 10);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                i1w0Var.d(new lho0(this, (byte) 20));
                break;
            case 32:
                sac.V(jiu0.a(this), new tfo0(1, this, rio0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, mneVar.f22085a, new lio0(this, yjeVar, z ? (byte) 1 : (byte) 0), 10);
                CyberHomeParams cyberHomeParams = new CyberHomeParams(org.xplatform.cyber.section.api.domain.entity.d.d(0), CyberGamesParentSectionModel.FromSection.INSTANCE);
                CopyOnWriteArrayList copyOnWriteArrayListQ9 = b1j.q(i1w0Var);
                vqc vqcVar = this.m;
                vqcVar.getClass();
                FragmentScreen cyberGamesScreenFactoryImpl$homeScreen$1 = new CyberGamesScreenFactoryImpl$homeScreen$1(vqcVar, cyberHomeParams);
                if (cyberGamesScreenFactoryImpl$homeScreen$1 instanceof DialogScreen) {
                    copyOnWriteArrayListQ9.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) cyberGamesScreenFactoryImpl$homeScreen$1)));
                } else {
                    copyOnWriteArrayListQ9.add(new c8d(y7d.f42146a, new w0w0(cyberGamesScreenFactoryImpl$homeScreen$1)));
                }
                ListIterator listIteratorO14 = b1j.o(i1w0Var, copyOnWriteArrayListQ9, 0);
                while (true) {
                    paw pawVar14 = (paw) listIteratorO14;
                    if (pawVar14.hasNext()) {
                        i1w0Var.a((oe50) pawVar14.next());
                    }
                    break;
                }
                break;
            case 33:
                k0w0 k0w0VarI4 = cs0.i(i1w0Var, i1w0Var);
                this.H0.getClass();
                k0w0VarI4.h(new UfcScreensFactoryImpl$getHomeFragmentScreen$1());
                ListIterator listIteratorO15 = b1j.o(i1w0Var, k0w0VarI4.f17489a, 0);
                while (true) {
                    paw pawVar15 = (paw) listIteratorO15;
                    if (pawVar15.hasNext()) {
                        i1w0Var.a((oe50) pawVar15.next());
                    }
                    break;
                }
                break;
            case 34:
                D(new hr1(0L, 3));
                break;
            case 35:
                D(new fr1(null, null, 3));
                break;
            case 36:
                D(new jr1(new evc0(true, 0L)));
                break;
            case 37:
                D(new jr1());
                this.A.m();
                this.C.m();
                break;
            case 38:
                i1w0Var.d(new lho0(this, (byte) 15));
                break;
            case 39:
                i1w0Var.d(new lho0(this, (byte) 16));
                break;
            case 41:
                k0w0 k0w0VarI5 = cs0.i(i1w0Var, i1w0Var);
                this.c0.getClass();
                k0w0VarI5.h(new FastGamesScreenFactoryImpl$provideFastGamesScreen$1());
                ListIterator listIteratorO16 = b1j.o(i1w0Var, k0w0VarI5.f17489a, 0);
                while (true) {
                    paw pawVar16 = (paw) listIteratorO16;
                    if (pawVar16.hasNext()) {
                        i1w0Var.a((oe50) pawVar16.next());
                    }
                    break;
                }
                break;
            case 42:
            case 55:
                D(new fr1(new fs80(null, nw80.b.getId(), null, null, 0L, false, 93), null, 2));
                break;
            case 43:
            case 57:
                D(new fr1(new fs80(null, nw80.f24223a.getId(), null, null, 0L, false, 93), null, 2));
                break;
            case 44:
                D(new hr1(0L, 3));
                break;
            case 45:
                D(new kr1());
                break;
            case 47:
                k0w0 k0w0VarI6 = cs0.i(i1w0Var, i1w0Var);
                this.r.getClass();
                k0w0VarI6.h(new PromotionsLoyaltyScreens$ChampionsClubFragmentScreen());
                ListIterator listIteratorO17 = b1j.o(i1w0Var, k0w0VarI6.f17489a, 0);
                while (true) {
                    paw pawVar17 = (paw) listIteratorO17;
                    if (pawVar17.hasNext()) {
                        i1w0Var.a((oe50) pawVar17.next());
                    }
                    break;
                }
                break;
            case 48:
                i1w0Var.d(new lho0(this, (byte) 17));
                break;
            case 49:
                D(new fr1(new fs80(this.x.b.a(R.string.bingo_top_title, Arrays.copyOf(new Object[0], 0)), nw80.c.getId(), null, null, 0L, false, 124), null, 2));
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                sac.V(jiu0.a(this), new lho0(this, (byte) 11), null, mneVar.f22085a, new lcl0(this, new nho0(this, b4), yjeVar, b), 10);
                break;
            case 51:
                i1w0Var.d(new lho0(this, b));
                break;
            case 52:
            case 53:
            case 54:
                k0w0 k0w0VarI7 = cs0.i(i1w0Var, i1w0Var);
                ys70 ys70Var = this.n0;
                ys70Var.getClass();
                k0w0VarI7.h(new OnlineCallScreenFactoryImpl$getScreen$1(ys70Var));
                ListIterator listIteratorO18 = b1j.o(i1w0Var, k0w0VarI7.f17489a, 0);
                while (true) {
                    paw pawVar18 = (paw) listIteratorO18;
                    if (pawVar18.hasNext()) {
                        i1w0Var.a((oe50) pawVar18.next());
                    }
                    break;
                }
                break;
            case 56:
                k0w0 k0w0VarI8 = cs0.i(i1w0Var, i1w0Var);
                rz4.u(this.b0, k0w0VarI8);
                ListIterator listIteratorO19 = b1j.o(i1w0Var, k0w0VarI8.f17489a, 0);
                while (true) {
                    paw pawVar19 = (paw) listIteratorO19;
                    if (pawVar19.hasNext()) {
                        i1w0Var.a((oe50) pawVar19.next());
                    }
                    break;
                }
                break;
            case 58:
                D(new er1(false, 126L));
                break;
            case 59:
                sac.V(jiu0.a(this), new lho0(this, (byte) 7), null, mneVar.f22085a, new kio0(this, yjeVar, z ? (byte) 1 : (byte) 0), 10);
                break;
            case 60:
                this.t0.f("menu_aggregator", "");
                this.u0.d("menu_aggregator", "");
                i1w0Var.d(new lho0(this, (byte) 12));
                break;
            case 61:
                CopyOnWriteArrayList copyOnWriteArrayListQ10 = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ10, new c8d(y7d.f42146a, new a1w0(new nho0(this, b3))), i1w0Var, copyOnWriteArrayListQ10, 0);
                while (true) {
                    paw pawVar20 = (paw) listIteratorP;
                    if (pawVar20.hasNext()) {
                        i1w0Var.a((oe50) pawVar20.next());
                    }
                    break;
                }
                break;
            case 62:
                i1w0Var.d(new lho0(this, (byte) 19));
                break;
            case 63:
                F(R.string.info_partner_programm, pruVar.a().m.k);
                break;
            case 64:
                F(R.string.info_agent_programm, pruVar.a().m.l);
                break;
            case 65:
                i1w0Var.d(new lho0(this, (byte) 9));
                break;
            case 66:
                k0w0 k0w0VarI9 = cs0.i(i1w0Var, i1w0Var);
                vjpVar.getClass();
                k0w0VarI9.h(new FeedScreenFactoryImpl$getPolybetScreen$1());
                ListIterator listIteratorO20 = b1j.o(i1w0Var, k0w0VarI9.f17489a, 0);
                while (true) {
                    paw pawVar21 = (paw) listIteratorO20;
                    if (pawVar21.hasNext()) {
                        i1w0Var.a((oe50) pawVar21.next());
                    }
                    break;
                }
                break;
        }
    }

    public final void F(int i, String str) {
        boolean z = this.c.a().p0;
        boolean zO = StringsKt.O(str, "https://", false);
        i1w0 i1w0Var = this.z;
        if (zO && z) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            this.F0.getClass();
            FragmentScreen paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1 = new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(str);
            if (paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1 instanceof DialogScreen) {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1)));
            } else {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1)));
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
        } else {
            if (StringsKt.O(str, "https://", false)) {
                this.M0.f(new qho0(str));
                return;
            }
            if (str.length() <= 0) {
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            this.G0.getClass();
            FragmentScreen fragmentScreenD = bzs0.d(i, str);
            if (fragmentScreenD instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenD)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenD)));
            }
            ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }

    public final void G(long j) {
        bby bbyVar = this.R0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.R0 = sac.f0(jiu0.a(this), j, TimeUnit.SECONDS, this.y.b, new lho0(this, (byte) 3), new lio0(this, null, (byte) 2), 32);
        }
    }

    public final void H() {
        sac.V(jiu0.a(this), qio0.f28801a, null, this.y.f22085a, new eho0(this, null, (byte) 1), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(zje zjeVar) {
        bio0 bio0Var;
        Object g0g0Var;
        if (zjeVar instanceof bio0) {
            bio0Var = (bio0) zjeVar;
            int i = bio0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bio0Var.k = i - Integer.MIN_VALUE;
            } else {
                bio0Var = new bio0(this, zjeVar);
            }
        } else {
            bio0Var = new bio0(this, zjeVar);
        }
        Object obj = bio0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = bio0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                o3c o3cVar = this.w0;
                bio0Var.k = 1;
                if (o3c.p(o3cVar, false, bio0Var, 3) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            g0g0Var = Unit.f46060a;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null && (thA instanceof sq60)) {
            H();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable x(a.zje r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a.cio0
            if (r0 == 0) goto L13
            r0 = r8
            a.cio0 r0 = (a.cio0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.cio0 r0 = new a.cio0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> La7
            goto L74
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r3
        L31:
            boolean r7 = r0.j
            a.rio0 r2 = r0.i
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> La7
            goto L57
        L39:
            a.z1x.P(r8)
            a.e0g0 r8 = a.j0g0.b     // Catch: java.lang.Throwable -> La7
            a.n4u r8 = r7.x0     // Catch: java.lang.Throwable -> La7
            boolean r8 = r8.f()     // Catch: java.lang.Throwable -> La7
            a.jqc r2 = r7.y0     // Catch: java.lang.Throwable -> La7
            r0.i = r7     // Catch: java.lang.Throwable -> La7
            r0.j = r8     // Catch: java.lang.Throwable -> La7
            r0.m = r5     // Catch: java.lang.Throwable -> La7
            java.io.Serializable r2 = r2.a(r0)     // Catch: java.lang.Throwable -> La7
            if (r2 != r1) goto L53
            goto L73
        L53:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L57:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> La7
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> La7
            if (r7 == 0) goto L65
            if (r8 == 0) goto L62
            goto L65
        L62:
            a.iun r7 = a.iun.f15405a     // Catch: java.lang.Throwable -> La7
            goto La4
        L65:
            a.ieu r8 = r2.U     // Catch: java.lang.Throwable -> La7
            r0.i = r3     // Catch: java.lang.Throwable -> La7
            r0.j = r7     // Catch: java.lang.Throwable -> La7
            r0.m = r4     // Catch: java.lang.Throwable -> La7
            java.io.Serializable r8 = r8.e(r0)     // Catch: java.lang.Throwable -> La7
            if (r8 != r1) goto L74
        L73:
            return r1
        L74:
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> La7
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La7
            r7.<init>()     // Catch: java.lang.Throwable -> La7
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> La7
        L7f:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto La4
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> La7
            r1 = r0
            a.mz60 r1 = (a.mz60) r1     // Catch: java.lang.Throwable -> La7
            a.a570 r2 = r1.b     // Catch: java.lang.Throwable -> La7
            long r2 = a.x1x.D(r2)     // Catch: java.lang.Throwable -> La7
            a.s470 r4 = a.s470.LUCKY_WHEEL     // Catch: java.lang.Throwable -> La7
            long r4 = r4.a()     // Catch: java.lang.Throwable -> La7
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L7f
            boolean r1 = r1.f     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L7f
            r7.add(r0)     // Catch: java.lang.Throwable -> La7
            goto L7f
        La4:
            a.e0g0 r8 = a.j0g0.b     // Catch: java.lang.Throwable -> La7
            goto Lb0
        La7:
            r7 = move-exception
            a.e0g0 r8 = a.j0g0.b
            a.g0g0 r8 = new a.g0g0
            r8.<init>(r7)
            r7 = r8
        Lb0:
            a.iun r8 = a.iun.f15405a
            boolean r0 = r7 instanceof a.g0g0
            if (r0 == 0) goto Lb7
            r7 = r8
        Lb7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rio0.x(a.zje):java.io.Serializable");
    }

    public final gmq y(r040 r040Var) {
        gmq mgo0Var = new mgo0(new qgo0(this.N0, r040Var, (byte) 2), (byte) 1);
        if (aio0.f934a[r040Var.ordinal()] == 1) {
            mgo0Var = aoq.c(this.o0.a(), new fe0((yje) null, (Object) mgo0Var, (Object) this, (byte) 19));
        }
        return ulb.L(mgo0Var, this.y.f22085a);
    }

    public final r040 z() {
        r040 r040Var = (r040) this.R.a("SELECTED_TAB_KEY");
        return r040Var == null ? this.P : r040Var;
    }
}
