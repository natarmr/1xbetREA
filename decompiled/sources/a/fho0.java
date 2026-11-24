package a;

import com.appsflyer.share.attribution.RequestError;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
public final class fho0 extends w46 {
    public final hs60 A;
    public final lk5 A0;
    public final ix0 B;
    public final eke0 B0;
    public final gw60 C;
    public final p7m0 C0;
    public final gg5 D;
    public final ol60 D0;
    public final lk5 E;
    public final p7m0 E0;
    public final rqt F;
    public bby F0;
    public final kj5 G;
    public bby G0;
    public final org.xplatform.toto_bet.core.navigation.a H;
    public final xex I;
    public final m6m0 J;
    public final r9u K;
    public final xr L;
    public final pek M;
    public final uzc0 N;
    public final r040 O;
    public final lbu P;
    public final prc Q;
    public final iw20 R;
    public final s2m0 S;
    public final lme0 T;
    public final xak U;
    public final kl5 V;
    public final ouu W;
    public final jdk0 X;
    public final u8u Y;
    public final vzg0 Z;
    public final z7z a0;
    public final nlu b;
    public final z7z b0;
    public final pru c;
    public final ys70 c0;
    public final duj d;
    public final hqx d0;
    public final ouu e;
    public final pzt e0;
    public final iqt f;
    public final b4j f0;
    public final gxu g;
    public final je g0;
    public final rou h;
    public final qho h0;
    public final vqc i;
    public final o3c i0;
    public final ls j;
    public final yoc j0;
    public final vjp k;
    public final yoc k0;
    public final vqc l;
    public final ieu l0;
    public final peg0 m;
    public final pau m0;
    public final oct n;
    public final n4u n0;
    public final g9m0 o;
    public final jqc o0;
    public final jh70 p;
    public final roi0 p0;
    public final mi70 q;
    public final atz q0;
    public final tf3 r;
    public final r2u r0;
    public final ag3 s;
    public final rpt s0;
    public final y3v t;
    public final yfu t0;
    public final std u;
    public final yox u0;
    public final gle0 v;
    public final bzs0 v0;
    public final ctf0 w;
    public final lbu w0;
    public final mne x;
    public final nhf0 x0;
    public final i1w0 y;
    public final kys0 y0;
    public final b4j z;
    public final cyu z0;

    public fho0(nlu nluVar, pru pruVar, duj dujVar, ouu ouuVar, iqt iqtVar, gxu gxuVar, rou rouVar, vqc vqcVar, ls lsVar, vjp vjpVar, vqc vqcVar2, peg0 peg0Var, oct octVar, g9m0 g9m0Var, jh70 jh70Var, mi70 mi70Var, tf3 tf3Var, ag3 ag3Var, y3v y3vVar, std stdVar, k9c k9cVar, gle0 gle0Var, ctf0 ctf0Var, mne mneVar, i1w0 i1w0Var, b4j b4jVar, hs60 hs60Var, ix0 ix0Var, gw60 gw60Var, gg5 gg5Var, lk5 lk5Var, rqt rqtVar, kj5 kj5Var, org.xplatform.toto_bet.core.navigation.a aVar, xex xexVar, m6m0 m6m0Var, r9u r9uVar, xr xrVar, pek pekVar, uzc0 uzc0Var, r040 r040Var, lbu lbuVar, prc prcVar, iw20 iw20Var, s2m0 s2m0Var, lme0 lme0Var, xak xakVar, kl5 kl5Var, ouu ouuVar2, jdk0 jdk0Var, ahu ahuVar, u8u u8uVar, vzg0 vzg0Var, z7z z7zVar, z7z z7zVar2, ys70 ys70Var, hqx hqxVar, pzt pztVar, b4j b4jVar2, je jeVar, qho qhoVar, o3c o3cVar, yoc yocVar, yoc yocVar2, ieu ieuVar, pau pauVar, n4u n4uVar, jqc jqcVar, roi0 roi0Var, atz atzVar, r2u r2uVar, rpt rptVar, yfu yfuVar, yox yoxVar, bzs0 bzs0Var, lbu lbuVar2, nhf0 nhf0Var, kc60 kc60Var, kys0 kys0Var, cyu cyuVar, lk5 lk5Var2, eke0 eke0Var) {
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
        this.D = gg5Var;
        this.E = lk5Var;
        this.F = rqtVar;
        this.G = kj5Var;
        this.H = aVar;
        this.I = xexVar;
        this.J = m6m0Var;
        this.K = r9uVar;
        this.L = xrVar;
        this.M = pekVar;
        this.N = uzc0Var;
        this.O = r040Var;
        this.P = lbuVar;
        this.Q = prcVar;
        this.R = iw20Var;
        this.S = s2m0Var;
        this.T = lme0Var;
        this.U = xakVar;
        this.V = kl5Var;
        this.W = ouuVar2;
        this.X = jdk0Var;
        this.Y = u8uVar;
        this.Z = vzg0Var;
        this.a0 = z7zVar;
        this.b0 = z7zVar2;
        this.c0 = ys70Var;
        this.d0 = hqxVar;
        this.e0 = pztVar;
        this.f0 = b4jVar2;
        this.g0 = jeVar;
        this.h0 = qhoVar;
        this.i0 = o3cVar;
        this.j0 = yocVar;
        this.k0 = yocVar2;
        this.l0 = ieuVar;
        this.m0 = pauVar;
        this.n0 = n4uVar;
        this.o0 = jqcVar;
        this.p0 = roi0Var;
        this.q0 = atzVar;
        this.r0 = r2uVar;
        this.s0 = rptVar;
        this.t0 = yfuVar;
        this.u0 = yoxVar;
        this.v0 = bzs0Var;
        this.w0 = lbuVar2;
        this.x0 = nhf0Var;
        this.y0 = kys0Var;
        this.z0 = cyuVar;
        this.A0 = lk5Var2;
        this.B0 = eke0Var;
        this.C0 = q7m0.a(ggo0.f11261a);
        this.D0 = new ol60(3);
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.E0 = q7m0.a(lunVar);
        yje yjeVar = null;
        sac.T(new fnq(dtb.z(kc60Var.a(), 1), new ssl0((Object) this, yjeVar, (byte) 12), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), ygo0.h);
        B();
        sac.T(new fnq(new va(((qe50) ouuVar2.b).b, (byte) 22), new xgo0(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), bho0.h);
    }

    public final void A(Throwable th) {
        this.d.b(th, new xfo0(this, (byte) 0));
    }

    public final void B() {
        bby bbyVar = this.F0;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.F0 = sac.V(jiu0.a(this), ugo0.f35635a, null, this.x.f22085a, new wgo0(this, yjeVar, (byte) 0), 10);
    }

    public final void C(f240 f240Var) {
        iz30 iz30VarM = f240Var.m();
        String strV = bww.V(z());
        String strD = vvw.D(f240Var);
        this.s.b(strV, strD);
        this.D.m(strV, strD);
        if (iz30VarM == iz30.h) {
            this.C.c();
        }
    }

    public final void D(lr1 lr1Var) {
        sac.V(jiu0.a(this), new tfo0(1, this, fho0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, this.x.f22085a, new lcl0(this, lr1Var, null, (byte) 16), 10);
    }

    public final void E(long j) {
        D(new fr1(new fs80(null, j, null, null, 0L, false, 125), null, 2));
    }

    public final void F(f240 f240Var) {
        p7m0 p7m0Var;
        Object value;
        LinkedHashMap linkedHashMapP;
        f240Var.getClass();
        iz30 iz30VarM = f240Var.m();
        boolean z = false;
        z = false;
        byte b = 1;
        if (this.Q.o(iz30VarM)) {
            do {
                p7m0Var = this.E0;
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
        byte b2 = 15;
        byte b3 = 2;
        byte b4 = 9;
        byte b5 = 3;
        vjp vjpVar = this.k;
        r9u r9uVar = this.K;
        mne mneVar = this.x;
        pru pruVar = this.c;
        yje yjeVar = null;
        i1w0 i1w0Var = this.y;
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
                i1w0Var.d(new vfo0(this, (byte) 6));
                break;
            case 8:
                E(nw80.i.getId());
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
                i1w0Var.d(new itn0(this, t270.b, b4));
                break;
            case 11:
                i1w0Var.d(new itn0(this, t270.c, b4));
                break;
            case 12:
                i1w0Var.d(new itn0(this, t270.d, b4));
                break;
            case 13:
                CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var);
                FragmentScreen fragmentScreenF = iw20.f(this.R, nqh0.f23960a);
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
                FragmentScreen fragmentScreenC = uzc0.c(this.N, 0);
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
                i1w0Var.d(new vfo0(this, b5));
                break;
            case 16:
                ygp ygpVar = ygp.Z;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                boolean zD = j1q0Var.f15748a.d(ygpVar);
                pek pekVar = this.M;
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
                i1w0Var.d(new vfo0(this, (byte) 12));
                break;
            case 18:
                i1w0Var.d(new vfo0(this, (byte) 13));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 46:
                i1w0Var.d(new vfo0(this, b3));
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
                i1w0Var.d(new ij90((Object) this, z, (byte) 12));
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
                FragmentScreen fragmentScreenB = rqt.b(this.F);
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
                D(new hr1(0L, 3));
                break;
            case 24:
                sac.V(jiu0.a(this), new tfo0(1, this, fho0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, mneVar.f22085a, new wgo0(this, yjeVar, b), 10);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                i1w0Var.d(new vfo0(this, b));
                break;
            case 32:
                sac.V(jiu0.a(this), new tfo0(1, this, fho0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 2), null, mneVar.f22085a, new xgo0(this, yjeVar, z ? (byte) 1 : (byte) 0), 10);
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
                this.y0.getClass();
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
                D(new fr1(null, null, 3));
                break;
            case 36:
                D(new jr1(new evc0(true, 0L)));
                break;
            case 37:
                D(new jr1());
                this.z.m();
                this.B.m();
                break;
            case 38:
                i1w0Var.d(new itn0(this, pruVar.a().V0, (byte) 10));
                break;
            case 39:
                i1w0Var.d(new vfo0(this, (byte) 14));
                break;
            case 40:
            case 41:
                k0w0 k0w0VarI5 = cs0.i(i1w0Var, i1w0Var);
                this.U.getClass();
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
                E(nw80.b.getId());
                break;
            case 43:
            case 57:
                E(nw80.f24223a.getId());
                break;
            case 44:
                D(new hr1(0L, 3));
                break;
            case 45:
                D(new kr1());
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
                i1w0Var.d(new vfo0(this, b2));
                break;
            case 49:
            case 51:
                i1w0Var.d(new vfo0(this, (byte) 16));
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                sac.V(jiu0.a(this), new vfo0(this, (byte) 5), null, mneVar.f22085a, new lcl0(this, new wfo0(this, b3), yjeVar, b2), 10);
                break;
            case 52:
            case 53:
            case 54:
                k0w0 k0w0VarI7 = cs0.i(i1w0Var, i1w0Var);
                ys70 ys70Var = this.c0;
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
                rz4.u(this.T, k0w0VarI8);
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
            case 60:
                this.f0.f("menu_aggregator", "");
                this.g0.d("menu_aggregator", "");
                i1w0Var.d(new vfo0(this, b4));
                break;
            case 61:
                CopyOnWriteArrayList copyOnWriteArrayListQ10 = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ10, new c8d(y7d.f42146a, new a1w0(new wfo0(this, z ? (byte) 1 : (byte) 0))), i1w0Var, copyOnWriteArrayListQ10, 0);
                while (true) {
                    paw pawVar20 = (paw) listIteratorP;
                    if (pawVar20.hasNext()) {
                        i1w0Var.a((oe50) pawVar20.next());
                    }
                    break;
                }
                break;
            case 62:
                i1w0Var.d(new vfo0(this, z ? (byte) 1 : (byte) 0));
                break;
            case 63:
                G(R.string.info_partner_programm, pruVar.a().m.k);
                break;
            case 64:
                G(R.string.info_agent_programm, pruVar.a().m.l);
                break;
            case 65:
                i1w0Var.d(new vfo0(this, (byte) 7));
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

    public final void G(int i, String str) {
        boolean z = this.c.a().p0;
        boolean zO = StringsKt.O(str, "https://", false);
        i1w0 i1w0Var = this.y;
        if (zO && z) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            this.u0.getClass();
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
                this.D0.f(new yfo0(str));
                return;
            }
            if (str.length() <= 0) {
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            this.v0.getClass();
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

    public final void H() {
        sac.V(jiu0.a(this), dho0.f6102a, null, this.x.f22085a, new eho0(this, null, (byte) 0), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(zje zjeVar) {
        igo0 igo0Var;
        Object g0g0Var;
        if (zjeVar instanceof igo0) {
            igo0Var = (igo0) zjeVar;
            int i = igo0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                igo0Var.k = i - Integer.MIN_VALUE;
            } else {
                igo0Var = new igo0(this, zjeVar);
            }
        } else {
            igo0Var = new igo0(this, zjeVar);
        }
        Object obj = igo0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = igo0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                o3c o3cVar = this.i0;
                igo0Var.k = 1;
                if (o3c.p(o3cVar, false, igo0Var, 3) == wneVar) {
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
            boolean r0 = r8 instanceof a.jgo0
            if (r0 == 0) goto L13
            r0 = r8
            a.jgo0 r0 = (a.jgo0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.jgo0 r0 = new a.jgo0
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
            a.fho0 r2 = r0.i
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> La7
            goto L57
        L39:
            a.z1x.P(r8)
            a.e0g0 r8 = a.j0g0.b     // Catch: java.lang.Throwable -> La7
            a.n4u r8 = r7.n0     // Catch: java.lang.Throwable -> La7
            boolean r8 = r8.f()     // Catch: java.lang.Throwable -> La7
            a.jqc r2 = r7.o0     // Catch: java.lang.Throwable -> La7
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
            a.ieu r8 = r2.l0     // Catch: java.lang.Throwable -> La7
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
        throw new UnsupportedOperationException("Method not decompiled: a.fho0.x(a.zje):java.io.Serializable");
    }

    public final gmq y(r040 r040Var) {
        return aoq.c(new qgo0(this.d0.a(), r040Var, (byte) 0), new o2v(new mgo0(new qgo0(this.E0, r040Var, (byte) 1), (byte) 0), this, (yje) null));
    }

    public final r040 z() {
        r040 r040Var = (r040) this.Z.a("SELECTED_TAB_KEY");
        return r040Var == null ? this.O : r040Var;
    }
}
