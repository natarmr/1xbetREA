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
import kotlin.jvm.functions.Function1;
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
import org.xplatform.games_section.api.models.GamesActionsFragmentResultModel;
import org.xplatform.promotions.loyalty.impl.navigation.PromotionsLoyaltyScreens$ChampionsClubFragmentScreen;
import org.xplatform.results.impl.di.navigation.ResultsScreenFactoryImpl$getMainScreen$1;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getHomeFragmentScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class usq0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36225a;
    public final /* synthetic */ xsq0 b;

    public /* synthetic */ usq0(xsq0 xsq0Var, byte b) {
        this.f36225a = b;
        this.b = xsq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x051f  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        pek pekVar;
        pru pruVar;
        boolean z;
        boolean z2;
        byte b = this.f36225a;
        byte b2 = 12;
        byte b3 = 13;
        int i = 0;
        xsq0 xsq0Var = this.b;
        switch (b) {
            case 0:
                y2m0 y2m0Var = xsq0.P1;
                ((GamesActionsFragmentResultModel) obj).getClass();
                xsq0Var.H0().F();
                break;
            case 1:
                f240 f240Var = (f240) obj;
                y2m0 y2m0Var2 = xsq0.P1;
                f240Var.getClass();
                xtq0 xtq0VarH0 = xsq0Var.H0();
                pek pekVar2 = xtq0VarH0.M;
                vjp vjpVar = xtq0VarH0.k;
                r9u r9uVar = xtq0VarH0.L;
                mne mneVar = xtq0VarH0.x;
                pru pruVar2 = xtq0VarH0.c;
                i1w0 i1w0Var = xtq0VarH0.y;
                iz30 iz30VarM = f240Var.m();
                if (xtq0VarH0.Q.o(iz30VarM)) {
                    p7m0 p7m0Var = xtq0VarH0.D0;
                    while (true) {
                        Object value = p7m0Var.getValue();
                        Map map = (Map) value;
                        LinkedHashMap linkedHashMapP = xp20.p(map);
                        for (r040 r040Var : linkedHashMapP.keySet()) {
                            Object obj2 = map.get(r040Var);
                            Object obj3 = obj2;
                            if (obj2 == null) {
                                obj3 = iun.f15405a;
                            }
                            ArrayList arrayListN0 = CollectionsKt.N0((Collection) obj3);
                            Iterator it = arrayListN0.iterator();
                            int i2 = i;
                            while (true) {
                                if (!it.hasNext()) {
                                    i2 = -1;
                                } else if (((f240) it.next()).m() != iz30VarM) {
                                    i2++;
                                }
                            }
                            int i3 = i2;
                            if (i3 >= 0) {
                                f240 f240Var2 = (f240) arrayListN0.get(i3);
                                arrayListN0.set(i3, fww.y(f240Var2, !f240Var2.K()));
                                linkedHashMapP.put(r040Var, arrayListN0);
                            }
                            pekVar2 = pekVar2;
                            pruVar2 = pruVar2;
                            i = 0;
                        }
                        pekVar = pekVar2;
                        pruVar = pruVar2;
                        z = true;
                        if (!p7m0Var.m(value, linkedHashMapP)) {
                            pekVar2 = pekVar;
                            pruVar2 = pruVar;
                            i = 0;
                        }
                    }
                } else {
                    pekVar = pekVar2;
                    pruVar = pruVar2;
                    z = true;
                }
                xtq0VarH0.B(f240Var);
                int iOrdinal = f240Var.m().ordinal();
                byte b4 = 17;
                byte b5 = 2;
                byte b6 = 6;
                byte b7 = 3;
                byte b8 = 14;
                yje yjeVar = null;
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
                        xtq0VarH0.u.getClass();
                        k0w0VarI.h(new DayExpressScreen(z));
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
                        xtq0VarH0.v.getClass();
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
                        i1w0Var.d(new zsq0(xtq0VarH0, (byte) 8));
                        break;
                    case 8:
                        xtq0VarH0.D(nw80.i.getId());
                        break;
                    case 9:
                        k0w0 k0w0VarI3 = cs0.i(i1w0Var, i1w0Var);
                        k0w0VarI3.h(oct.f(xtq0VarH0.n, 0L, null, 0, null, null, 31));
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
                        i1w0Var.d(new b8q0(xtq0VarH0, t270.b, b8));
                        break;
                    case 11:
                        i1w0Var.d(new b8q0(xtq0VarH0, t270.c, b8));
                        break;
                    case 12:
                        i1w0Var.d(new b8q0(xtq0VarH0, t270.d, b8));
                        break;
                    case 13:
                        CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var);
                        FragmentScreen fragmentScreenF = iw20.f(xtq0VarH0.O, nqh0.f23960a);
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
                        FragmentScreen fragmentScreenC = uzc0.c(xtq0VarH0.N, 0);
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
                        i1w0Var.d(new zsq0(xtq0VarH0, b7));
                        break;
                    case 16:
                        ygp ygpVar = ygp.Z;
                        r9uVar.getClass();
                        j1q0 j1q0Var = r9uVar.f30104a;
                        j1q0Var.getClass();
                        if (!j1q0Var.f15748a.d(ygpVar)) {
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
                        i1w0Var.d(new zsq0(xtq0VarH0, (byte) 12));
                        break;
                    case 18:
                        i1w0Var.d(new zsq0(xtq0VarH0, (byte) 13));
                        break;
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    case 46:
                        i1w0Var.d(new zsq0(xtq0VarH0, b5));
                        break;
                    case 20:
                        boolean z3 = z;
                        if (pruVar.a().B0) {
                            ygp ygpVar2 = ygp.u;
                            r9uVar.getClass();
                            j1q0 j1q0Var2 = r9uVar.f30104a;
                            j1q0Var2.getClass();
                            if (j1q0Var2.f15748a.d(ygpVar2)) {
                                z2 = z3;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        i1w0Var.d(new ij90(xtq0VarH0, z2, b4));
                        break;
                    case 21:
                        CopyOnWriteArrayList copyOnWriteArrayListQ7 = b1j.q(i1w0Var);
                        FragmentScreen fragmentScreenD = ((uf3) xtq0VarH0.r).d(z);
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
                        FragmentScreen fragmentScreenB = rqt.b(xtq0VarH0.F);
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
                        xtq0VarH0.C(new hr1(0L, 3));
                        break;
                    case 24:
                        sac.V(jiu0.a(xtq0VarH0), new w6q0(1, xtq0VarH0, xtq0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, mneVar.f22085a, new ptq0(xtq0VarH0, yjeVar, z ? (byte) 1 : (byte) 0), 10);
                        break;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        i1w0Var.d(new zsq0(xtq0VarH0, (byte) 1));
                        break;
                    case 32:
                        sac.V(jiu0.a(xtq0VarH0), new w6q0(1, xtq0VarH0, xtq0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 16), null, mneVar.f22085a, new qtq0(xtq0VarH0, yjeVar, (byte) 0), 10);
                        CyberHomeParams cyberHomeParams = new CyberHomeParams(org.xplatform.cyber.section.api.domain.entity.d.d(0), CyberGamesParentSectionModel.FromSection.INSTANCE);
                        CopyOnWriteArrayList copyOnWriteArrayListQ9 = b1j.q(i1w0Var);
                        vqc vqcVar = xtq0VarH0.l;
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
                        xtq0VarH0.x0.getClass();
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
                        xtq0VarH0.C(new fr1(null, null, 3));
                        break;
                    case 36:
                        xtq0VarH0.C(new jr1(new evc0(z, 0L)));
                        break;
                    case 37:
                        xtq0VarH0.C(new jr1());
                        xtq0VarH0.z.m();
                        xtq0VarH0.B.m();
                        break;
                    case 38:
                        i1w0Var.d(new zsq0(xtq0VarH0, b8));
                        break;
                    case 39:
                        i1w0Var.d(new zsq0(xtq0VarH0, (byte) 15));
                        break;
                    case 40:
                    case 41:
                        k0w0 k0w0VarI5 = cs0.i(i1w0Var, i1w0Var);
                        xtq0VarH0.U.getClass();
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
                        xtq0VarH0.D(nw80.b.getId());
                        break;
                    case 43:
                    case 57:
                        xtq0VarH0.D(nw80.f24223a.getId());
                        break;
                    case 44:
                        xtq0VarH0.C(new hr1(0L, 3));
                        break;
                    case 45:
                        xtq0VarH0.C(new kr1());
                        break;
                    case 47:
                        k0w0 k0w0VarI6 = cs0.i(i1w0Var, i1w0Var);
                        xtq0VarH0.q.getClass();
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
                        i1w0Var.d(new zsq0(xtq0VarH0, (byte) 16));
                        break;
                    case 49:
                    case 51:
                        i1w0Var.d(new zsq0(xtq0VarH0, b4));
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        sac.V(jiu0.a(xtq0VarH0), new zsq0(xtq0VarH0, (byte) 5), null, mneVar.f22085a, new meq0(xtq0VarH0, new atq0(xtq0VarH0, b5), yjeVar, b6), 10);
                        break;
                    case 52:
                    case 53:
                    case 54:
                        k0w0 k0w0VarI7 = cs0.i(i1w0Var, i1w0Var);
                        ys70 ys70Var = xtq0VarH0.b0;
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
                        rz4.u(xtq0VarH0.T, k0w0VarI8);
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
                        xtq0VarH0.C(new er1(false, 126L));
                        break;
                    case 60:
                        xtq0VarH0.f0.f("menu_aggregator", "");
                        xtq0VarH0.g0.d("menu_aggregator", "");
                        i1w0Var.d(new zsq0(xtq0VarH0, (byte) 9));
                        break;
                    case 61:
                        CopyOnWriteArrayList copyOnWriteArrayListQ10 = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ10, new c8d(y7d.f42146a, new a1w0(new atq0(xtq0VarH0, (byte) 0))), i1w0Var, copyOnWriteArrayListQ10, 0);
                        while (true) {
                            paw pawVar20 = (paw) listIteratorP;
                            if (pawVar20.hasNext()) {
                                i1w0Var.a((oe50) pawVar20.next());
                            }
                            break;
                        }
                        break;
                    case 62:
                        i1w0Var.d(new zsq0(xtq0VarH0, (byte) 0));
                        break;
                    case 63:
                        xtq0VarH0.E(R.string.info_partner_programm, pruVar.a().m.k);
                        break;
                    case 64:
                        xtq0VarH0.E(R.string.info_agent_programm, pruVar.a().m.l);
                        break;
                    case 65:
                        i1w0Var.d(new zsq0(xtq0VarH0, b6));
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
                break;
            case 2:
                z140 z140Var = (z140) obj;
                y2m0 y2m0Var3 = xsq0.P1;
                z140Var.getClass();
                xtq0 xtq0VarH1 = xsq0Var.H0();
                int eventId = z140Var.getEventId();
                xtq0VarH1.A(z140Var);
                FragmentScreen fragmentScreenH = xtq0VarH1.t.h(eventId, z140Var.getTitle());
                i1w0 i1w0Var2 = xtq0VarH1.y;
                CopyOnWriteArrayList copyOnWriteArrayListQ11 = b1j.q(i1w0Var2);
                if (fragmentScreenH instanceof DialogScreen) {
                    copyOnWriteArrayListQ11.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenH)));
                } else {
                    copyOnWriteArrayListQ11.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenH)));
                }
                ListIterator listIteratorO21 = b1j.o(i1w0Var2, copyOnWriteArrayListQ11, 0);
                while (true) {
                    paw pawVar22 = (paw) listIteratorO21;
                    if (pawVar22.hasNext()) {
                        i1w0Var2.a((oe50) pawVar22.next());
                    }
                    break;
                }
                break;
            case 3:
                d240 d240Var = (d240) obj;
                y2m0 y2m0Var4 = xsq0.P1;
                d240Var.getClass();
                xtq0 xtq0VarH2 = xsq0Var.H0();
                xtq0VarH2.B(d240Var);
                xtq0VarH2.y.d(new b8q0(xtq0VarH2, d240Var, b2));
                break;
            default:
                c240 c240Var = (c240) obj;
                y2m0 y2m0Var5 = xsq0.P1;
                c240Var.getClass();
                xtq0 xtq0VarH3 = xsq0Var.H0();
                xtq0VarH3.B(c240Var);
                xtq0VarH3.y.d(new b8q0(xtq0VarH3, c240Var, b3));
                break;
        }
        return Unit.f46060a;
    }
}
