package a;

import com.appsflyer.share.attribution.RequestError;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
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
public final class ab extends w46 {
    public final hs60 A;
    public final ix0 B;
    public final gw60 C;
    public final lk5 D;
    public final rqt E;
    public final kj5 F;
    public final org.xplatform.toto_bet.core.navigation.a G;
    public final xex H;
    public final m6m0 I;
    public final xr J;
    public final r9u K;
    public final pek L;
    public final uzc0 M;
    public final iw20 N;
    public final lbu O;
    public final prc P;
    public final boolean Q;
    public final s2m0 R;
    public final lme0 S;
    public final xak T;
    public final kl5 U;
    public final jdk0 V;
    public final u8u W;
    public final ouu X;
    public final gg5 Y;
    public final z7z Z;
    public final z7z a0;
    public final nlu b;
    public final ys70 b0;
    public final pru c;
    public final hqx c0;
    public final duj d;
    public final pzt d0;
    public final ouu e;
    public final s64 e0;
    public final iqt f;
    public final b4j f0;
    public final gxu g;
    public final je g0;
    public final rou h;
    public final qho h0;
    public final vqc i;
    public final o3c i0;
    public final ls j;
    public final atz j0;
    public final vjp k;
    public final r2u k0;
    public final vqc l;
    public final rpt l0;
    public final peg0 m;
    public final yfu m0;
    public final oct n;
    public final yox n0;
    public final g9m0 o;
    public final bzs0 o0;
    public final jh70 p;
    public final lbu p0;
    public final mi70 q;
    public final nhf0 q0;
    public final tf3 r;
    public final kys0 r0;
    public final ag3 s;
    public final cyu s0;
    public final y3v t;
    public final lk5 t0;
    public final std u;
    public final eke0 u0;
    public final gle0 v;
    public final p7m0 v0;
    public final ctf0 w;
    public final ol60 w0;
    public final mne x;
    public final p7m0 x0;
    public final i1w0 y;
    public final p7m0 y0;
    public final b4j z;

    public ab(nlu nluVar, pru pruVar, duj dujVar, ouu ouuVar, iqt iqtVar, gxu gxuVar, rou rouVar, vqc vqcVar, ls lsVar, vjp vjpVar, vqc vqcVar2, peg0 peg0Var, oct octVar, g9m0 g9m0Var, jh70 jh70Var, mi70 mi70Var, tf3 tf3Var, ag3 ag3Var, y3v y3vVar, std stdVar, gle0 gle0Var, ctf0 ctf0Var, mne mneVar, i1w0 i1w0Var, b4j b4jVar, hs60 hs60Var, ix0 ix0Var, gw60 gw60Var, lk5 lk5Var, rqt rqtVar, kj5 kj5Var, org.xplatform.toto_bet.core.navigation.a aVar, xex xexVar, m6m0 m6m0Var, xr xrVar, r9u r9uVar, pek pekVar, uzc0 uzc0Var, iw20 iw20Var, vzg0 vzg0Var, lbu lbuVar, prc prcVar, boolean z, s2m0 s2m0Var, lme0 lme0Var, xak xakVar, kl5 kl5Var, jdk0 jdk0Var, u8u u8uVar, ouu ouuVar2, gg5 gg5Var, z7z z7zVar, z7z z7zVar2, ys70 ys70Var, hqx hqxVar, pzt pztVar, s64 s64Var, b4j b4jVar2, je jeVar, qho qhoVar, o3c o3cVar, atz atzVar, r2u r2uVar, rpt rptVar, yfu yfuVar, yox yoxVar, bzs0 bzs0Var, lbu lbuVar2, nhf0 nhf0Var, kc60 kc60Var, kys0 kys0Var, cyu cyuVar, lk5 lk5Var2, eke0 eke0Var) {
        i1w0Var.getClass();
        r9uVar.getClass();
        z7zVar.getClass();
        z7zVar2.getClass();
        this.b = nluVar;
        this.c = pruVar;
        this.d = dujVar;
        this.e = ouuVar;
        this.f = iqtVar;
        this.g = gxuVar;
        this.h = rouVar;
        this.i = vqcVar;
        this.j = lsVar;
        this.k = vjpVar;
        this.l = vqcVar2;
        this.m = peg0Var;
        this.n = octVar;
        this.o = g9m0Var;
        this.p = jh70Var;
        this.q = mi70Var;
        this.r = tf3Var;
        this.s = ag3Var;
        this.t = y3vVar;
        this.u = stdVar;
        this.v = gle0Var;
        this.w = ctf0Var;
        this.x = mneVar;
        this.y = i1w0Var;
        this.z = b4jVar;
        this.A = hs60Var;
        this.B = ix0Var;
        this.C = gw60Var;
        this.D = lk5Var;
        this.E = rqtVar;
        this.F = kj5Var;
        this.G = aVar;
        this.H = xexVar;
        this.I = m6m0Var;
        this.J = xrVar;
        this.K = r9uVar;
        this.L = pekVar;
        this.M = uzc0Var;
        this.N = iw20Var;
        this.O = lbuVar;
        this.P = prcVar;
        this.Q = z;
        this.R = s2m0Var;
        this.S = lme0Var;
        this.T = xakVar;
        this.U = kl5Var;
        this.V = jdk0Var;
        this.W = u8uVar;
        this.X = ouuVar2;
        this.Y = gg5Var;
        this.Z = z7zVar;
        this.a0 = z7zVar2;
        this.b0 = ys70Var;
        this.c0 = hqxVar;
        this.d0 = pztVar;
        this.e0 = s64Var;
        this.f0 = b4jVar2;
        this.g0 = jeVar;
        this.h0 = qhoVar;
        this.i0 = o3cVar;
        this.j0 = atzVar;
        this.k0 = r2uVar;
        this.l0 = rptVar;
        this.m0 = yfuVar;
        this.n0 = yoxVar;
        this.o0 = bzs0Var;
        this.p0 = lbuVar2;
        this.q0 = nhf0Var;
        this.r0 = kys0Var;
        this.s0 = cyuVar;
        this.t0 = lk5Var2;
        this.u0 = eke0Var;
        this.v0 = q7m0.a(ga.f10941a);
        this.w0 = new ol60(3);
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.x0 = q7m0.a(lunVar);
        this.y0 = q7m0.a(iun.f15405a);
        yje yjeVar = null;
        byte b = 0;
        sac.T(new fnq(dtb.z(kc60Var.a(), 1), new qa(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), ra.h);
        sac.T(new fnq(new va(((qe50) ouuVar2.b).b, (byte) 0), new wa(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), xa.h);
    }

    public final void A(lr1 lr1Var) {
        sac.V(jiu0.a(this), new t0(1, this, ab.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, this.x.f22085a, new l1(this, lr1Var, null, (byte) 3), 10);
    }

    public final void B(long j) {
        A(new fr1(new fs80(null, j, null, null, 0L, false, 125), null, 2));
    }

    public final void C(cc ccVar) {
        Object value;
        ArrayList arrayListN0;
        Object value2;
        ArrayList arrayListN1;
        boolean z = ccVar.d;
        r040 r040Var = ccVar.f4085a;
        p7m0 p7m0Var = this.y0;
        if (z) {
            do {
                value2 = p7m0Var.getValue();
                arrayListN1 = CollectionsKt.N0((List) value2);
                arrayListN1.remove(r040Var);
            } while (!p7m0Var.m(value2, arrayListN1));
            return;
        }
        do {
            value = p7m0Var.getValue();
            arrayListN0 = CollectionsKt.N0((List) value);
            arrayListN0.add(r040Var);
        } while (!p7m0Var.m(value, arrayListN0));
    }

    public final void D() {
        this.w0.f(new da(((smu) this.Z.get()).a(), ((rmu) this.a0.get()).a()));
    }

    /* JADX WARN: Code duplicated, block: B:131:0x03f4  */
    public final void E(f240 f240Var) {
        boolean z;
        p7m0 p7m0Var;
        Object value;
        LinkedHashMap linkedHashMapP;
        iz30 iz30VarM = f240Var.m();
        byte b = 0;
        boolean z2 = true;
        if (this.P.o(iz30VarM)) {
            do {
                p7m0Var = this.x0;
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
        z(f240Var);
        int iOrdinal = f240Var.m().ordinal();
        byte b2 = 2;
        byte b3 = 7;
        vjp vjpVar = this.k;
        mne mneVar = this.x;
        r9u r9uVar = this.K;
        pru pruVar = this.c;
        yje yjeVar = null;
        i1w0 i1w0Var = this.y;
        switch (iOrdinal) {
            case 0:
            case 59:
                break;
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
                this.u.getClass();
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
                this.v.getClass();
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
                i1w0Var.d(new u9(this, b3));
                break;
            case 8:
                B(nw80.i.getId());
                break;
            case 9:
                k0w0 k0w0VarI3 = cs0.i(i1w0Var, i1w0Var);
                k0w0VarI3.h(oct.f(this.n, 0L, null, 0, null, null, 31));
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
                i1w0Var.d(new k1(this, t270.b, b3));
                break;
            case 11:
                i1w0Var.d(new k1(this, t270.c, b3));
                break;
            case 12:
                i1w0Var.d(new k1(this, t270.d, b3));
                break;
            case 13:
                CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var);
                FragmentScreen fragmentScreenF = iw20.f(this.N, nqh0.f23960a);
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
                FragmentScreen fragmentScreenC = uzc0.c(this.M, 0);
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
                i1w0Var.d(new u9(this, b2));
                break;
            case 16:
                ygp ygpVar = ygp.Z;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                boolean zD = j1q0Var.f15748a.d(ygpVar);
                pek pekVar = this.L;
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
                i1w0Var.d(new u9(this, (byte) 6));
                break;
            case 18:
                i1w0Var.d(new u9(this, (byte) 11));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 46:
                i1w0Var.d(new u9(this, z2 ? 1 : 0));
                break;
            case 20:
                if (pruVar.a().B0) {
                    ygp ygpVar2 = ygp.u;
                    r9uVar.getClass();
                    j1q0 j1q0Var2 = r9uVar.f30104a;
                    j1q0Var2.getClass();
                    z = j1q0Var2.f15748a.d(ygpVar2);
                }
                i1w0Var.d(new x9(this, z, b));
                break;
            case 21:
                CopyOnWriteArrayList copyOnWriteArrayListQ7 = b1j.q(i1w0Var);
                FragmentScreen fragmentScreenD = ((uf3) this.r).d(true);
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
                FragmentScreen fragmentScreenB = rqt.b(this.E);
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
            case 23:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 34:
                A(new hr1(0L, 3));
                break;
            case 24:
                sac.V(jiu0.a(this), new t0(1, this, ab.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, mneVar.c, new ya(this, yjeVar, b), 10);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                i1w0Var.d(new u9(this, b));
                break;
            case 32:
                this.i.k(pzb.C(new b5((byte) 3)));
                CyberHomeParams cyberHomeParams = new CyberHomeParams(org.xplatform.cyber.section.api.domain.entity.d.d(0), CyberGamesParentSectionModel.FromSection.INSTANCE);
                CopyOnWriteArrayList copyOnWriteArrayListQ9 = b1j.q(i1w0Var);
                vqc vqcVar = this.l;
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
                this.r0.getClass();
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
            case 35:
                A(new fr1(null, null, 3));
                break;
            case 36:
                A(new jr1(new evc0(true, 0L)));
                break;
            case 37:
                A(new jr1());
                this.z.m();
                this.B.m();
                break;
            case 38:
                i1w0Var.d(new u9(this, (byte) 12));
                break;
            case 39:
                i1w0Var.d(new u9(this, (byte) 13));
                break;
            case 40:
            case 41:
                k0w0 k0w0VarI5 = cs0.i(i1w0Var, i1w0Var);
                this.T.getClass();
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
                B(nw80.b.getId());
                break;
            case 43:
            case 57:
                B(nw80.f24223a.getId());
                break;
            case 44:
                A(new hr1(0L, 3));
                break;
            case 45:
                A(new kr1());
                break;
            case 47:
                k0w0 k0w0VarI6 = cs0.i(i1w0Var, i1w0Var);
                this.q.getClass();
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
                i1w0Var.d(new u9(this, (byte) 14));
                break;
            case 49:
            case 51:
                i1w0Var.d(new u9(this, (byte) 15));
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                sac.V(jiu0.a(this), new u9(this, (byte) 8), null, mneVar.f22085a, new l1(this, new w9(this, b2), yjeVar, b2), 10);
                break;
            case 52:
            case 53:
            case 54:
                k0w0 k0w0VarI7 = cs0.i(i1w0Var, i1w0Var);
                ys70 ys70Var = this.b0;
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
                rz4.u(this.S, k0w0VarI8);
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
                A(new er1(false, 126L));
                break;
            case 60:
                this.f0.f("menu_aggregator", "");
                this.g0.d("menu_aggregator", "");
                i1w0Var.d(new u9(this, (byte) 5));
                break;
            case 61:
                CopyOnWriteArrayList copyOnWriteArrayListQ10 = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ10, new c8d(y7d.f42146a, new a1w0(new w9(this, b))), i1w0Var, copyOnWriteArrayListQ10, 0);
                while (true) {
                    paw pawVar20 = (paw) listIteratorP;
                    if (pawVar20.hasNext()) {
                        i1w0Var.a((oe50) pawVar20.next());
                    }
                    break;
                }
                break;
            case 62:
                i1w0Var.d(new u9(this, (byte) 16));
                break;
            case 63:
                J(R.string.info_partner_programm, pruVar.a().m.k);
                break;
            case 64:
                J(R.string.info_agent_programm, pruVar.a().m.l);
                break;
            case 65:
                i1w0Var.d(new u9(this, (byte) 4));
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
            default:
                t9f.b();
                break;
        }
    }

    public final void F(z140 z140Var) {
        Object next;
        int eventId = z140Var.getEventId();
        Map map = (Map) this.x0.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Iterator it = ((List) entry.getValue()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((f240) next).m() != z140Var.m());
            if (next != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        r040 r040Var = (r040) CollectionsKt.V(linkedHashMap.keySet());
        if (r040Var != null) {
            String strV = bww.V(r040Var);
            this.s.a(strV, String.valueOf(z140Var.getEventId()));
            this.Y.l(z140Var.getEventId(), strV);
        }
        FragmentScreen fragmentScreenH = this.t.h(eventId, z140Var.getTitle());
        i1w0 i1w0Var = this.y;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        if (fragmentScreenH instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenH)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenH)));
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

    public final void G(c240 c240Var) {
        z(c240Var);
        this.y.d(new k1(this, c240Var, (byte) 5));
    }

    public final void H(d240 d240Var) {
        z(d240Var);
        this.y.d(new k1(this, d240Var, (byte) 6));
    }

    public final void I(u4s u4sVar, String str) {
        sac.V(jiu0.a(this), new t0(1, this, ab.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, this.x.f22085a, new n1((byte) 1, (yje) null, (Serializable) str, (Object) u4sVar, (Object) this), 10);
    }

    public final void J(int i, String str) {
        boolean z = this.c.a().p0;
        boolean zO = StringsKt.O(str, "https://", false);
        i1w0 i1w0Var = this.y;
        if (zO && z) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            this.n0.getClass();
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
                this.w0.f(new y9(str));
                return;
            }
            if (str.length() <= 0) {
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            this.o0.getClass();
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(zje zjeVar) {
        ia iaVar;
        if (zjeVar instanceof ia) {
            iaVar = (ia) zjeVar;
            int i = iaVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                iaVar.k = i - Integer.MIN_VALUE;
            } else {
                iaVar = new ia(this, zjeVar);
            }
        } else {
            iaVar = new ia(this, zjeVar);
        }
        Object obj = iaVar.i;
        wne wneVar = wne.f39444a;
        int i2 = iaVar.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                o3c o3cVar = this.i0;
                iaVar.k = 1;
                if (o3c.p(o3cVar, false, iaVar, 3) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable unused) {
            e0g0 e0g0Var3 = j0g0.b;
        }
        return Unit.f46060a;
    }

    public final gmq x(List list) {
        list.getClass();
        String str = this.c.a().d.f27973a.b;
        return dub.e0(this.x0, this.d0.a(), this.y0, this.c0.a(), new ja(this, list, str, null));
    }

    public final void y() {
        sac.V(jiu0.a(this), ka.f17938a, null, this.x.f22085a, new oa((Object) this, (yje) null, (byte) 0), 10);
    }

    public final void z(f240 f240Var) {
        iz30 iz30VarM = f240Var.m();
        String strV = bww.V(f240Var.n());
        String strD = vvw.D(f240Var);
        ag3 ag3Var = this.s;
        ag3Var.b(strV, strD);
        this.Y.m(strV, strD);
        int iOrdinal = iz30VarM.ordinal();
        if (iOrdinal == 11) {
            this.C.c();
        } else {
            if (iOrdinal != 13) {
                return;
            }
            ag3Var.c();
            b1j.v("menu_other", this.e0.f31684a, 3246L);
        }
    }
}
