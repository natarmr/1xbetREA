package a;

import com.appsflyer.share.attribution.RequestError;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.github.terrakok.cicerone.androidx.FragmentScreen$Companion$invoke$1;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
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
import org.xplatform.info.impl.navigation.InfoScreenFactoryImpl$getInfoScreen$1;
import org.xplatform.promotions.loyalty.impl.navigation.PromotionsLoyaltyScreens$ChampionsClubFragmentScreen;
import org.xplatform.promotions.news.impl.navigation.PromotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1;
import org.xplatform.results.impl.di.navigation.ResultsScreenFactoryImpl$getMainScreen$1;
import org.xplatform.security.impl.navigation.SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getHomeFragmentScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wd00 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38949a;
    public final /* synthetic */ ce00 b;

    public /* synthetic */ wd00(ce00 ce00Var, byte b) {
        this.f38949a = b;
        this.b = ce00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f38949a;
        byte b2 = 6;
        byte b3 = 7;
        boolean z = false;
        z = false;
        ce00 ce00Var = this.b;
        switch (b) {
            case 0:
                wsz wszVar = ce00.P1;
                ((GamesActionsFragmentResultModel) obj).getClass();
                ce00Var.H0().y();
                break;
            case 1:
                f240 f240Var = (f240) obj;
                wsz wszVar2 = ce00.P1;
                f240Var.getClass();
                ef00 ef00VarH0 = ce00Var.H0();
                pek pekVar = ef00VarH0.x;
                vjp vjpVar = ef00VarH0.E;
                r9u r9uVar = ef00VarH0.A;
                mne mneVar = ef00VarH0.N;
                pru pruVar = ef00VarH0.g;
                i1w0 i1w0Var = ef00VarH0.Q;
                if (ef00VarH0.h.o(f240Var.m())) {
                    ef00VarH0.y();
                }
                ef00VarH0.z(f240Var);
                byte b4 = 11;
                byte b5 = 2;
                byte b6 = 3;
                byte b7 = 8;
                byte b8 = 1;
                yje yjeVar = null;
                switch (f240Var.m().ordinal()) {
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
                        ef00VarH0.s.getClass();
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
                        ef00VarH0.t.getClass();
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
                        i1w0Var.d(new ee00(ef00VarH0, (byte) 7));
                        break;
                    case 8:
                        ef00VarH0.B(nw80.i.getId());
                        break;
                    case 9:
                        k0w0 k0w0VarI3 = cs0.i(i1w0Var, i1w0Var);
                        k0w0VarI3.h(oct.f(ef00VarH0.o, 0L, null, 0, null, null, 31));
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
                        i1w0Var.d(new u400(ef00VarH0, t270.b, b7));
                        break;
                    case 11:
                        i1w0Var.d(new u400(ef00VarH0, t270.c, b7));
                        break;
                    case 12:
                        i1w0Var.d(new u400(ef00VarH0, t270.d, b7));
                        break;
                    case 13:
                        CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var);
                        SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1 securitySettingsScreenFactoryImpl$getSecuritySettingsScreen$1F = iw20.f(ef00VarH0.u, nqh0.f23960a);
                        if (securitySettingsScreenFactoryImpl$getSecuritySettingsScreen$1F instanceof DialogScreen) {
                            copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) securitySettingsScreenFactoryImpl$getSecuritySettingsScreen$1F)));
                        } else {
                            copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new w0w0(securitySettingsScreenFactoryImpl$getSecuritySettingsScreen$1F)));
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
                        PromotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1 promotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1C = uzc0.c(ef00VarH0.v, 0);
                        if (promotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1C instanceof DialogScreen) {
                            copyOnWriteArrayListQ6.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) promotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1C)));
                        } else {
                            copyOnWriteArrayListQ6.add(new c8d(y7d.f42146a, new w0w0(promotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1C)));
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
                        i1w0Var.d(new ee00(ef00VarH0, b5));
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
                        i1w0Var.d(new ee00(ef00VarH0, (byte) 6));
                        break;
                    case 18:
                        i1w0Var.d(new ee00(ef00VarH0, b4));
                        break;
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    case 46:
                        i1w0Var.d(new ee00(ef00VarH0, b8));
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
                        i1w0Var.d(new x9((Object) ef00VarH0, z, (byte) 27));
                        break;
                    case 21:
                        CopyOnWriteArrayList copyOnWriteArrayListQ7 = b1j.q(i1w0Var);
                        FragmentScreen$Companion$invoke$1 fragmentScreen$Companion$invoke$1D = ef00VarH0.I.d(true);
                        if (fragmentScreen$Companion$invoke$1D instanceof DialogScreen) {
                            copyOnWriteArrayListQ7.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen$Companion$invoke$1D)));
                        } else {
                            copyOnWriteArrayListQ7.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen$Companion$invoke$1D)));
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
                        InfoScreenFactoryImpl$getInfoScreen$1 infoScreenFactoryImpl$getInfoScreen$1B = rqt.b(ef00VarH0.C);
                        if (infoScreenFactoryImpl$getInfoScreen$1B instanceof DialogScreen) {
                            copyOnWriteArrayListQ8.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) infoScreenFactoryImpl$getInfoScreen$1B)));
                        } else {
                            copyOnWriteArrayListQ8.add(new c8d(y7d.f42146a, new w0w0(infoScreenFactoryImpl$getInfoScreen$1B)));
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
                        ef00VarH0.A(new hr1(0L, 3));
                        break;
                    case 24:
                        sac.V(jiu0.a(ef00VarH0), new svz(1, ef00VarH0, ef00.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, mneVar.c, new xe00(ef00VarH0, yjeVar, b8), 10);
                        break;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        i1w0Var.d(new ee00(ef00VarH0, z ? (byte) 1 : (byte) 0));
                        break;
                    case 32:
                        sac.V(jiu0.a(ef00VarH0), new svz(1, ef00VarH0, ef00.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, mneVar.f22085a, new ye00(ef00VarH0, yjeVar, z ? (byte) 1 : (byte) 0), 10);
                        CyberHomeParams cyberHomeParams = new CyberHomeParams(org.xplatform.cyber.section.api.domain.entity.d.d(0), CyberGamesParentSectionModel.FromSection.INSTANCE);
                        CopyOnWriteArrayList copyOnWriteArrayListQ9 = b1j.q(i1w0Var);
                        vqc vqcVar = ef00VarH0.F;
                        vqcVar.getClass();
                        CyberGamesScreenFactoryImpl$homeScreen$1 cyberGamesScreenFactoryImpl$homeScreen$1 = new CyberGamesScreenFactoryImpl$homeScreen$1(vqcVar, cyberHomeParams);
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
                        ef00VarH0.r0.getClass();
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
                        ef00VarH0.A(new fr1(null, null, 3));
                        break;
                    case 36:
                        ef00VarH0.A(new jr1(new evc0(true, 0L)));
                        break;
                    case 37:
                        ef00VarH0.A(new jr1());
                        ef00VarH0.J.m();
                        ef00VarH0.L.m();
                        break;
                    case 38:
                        i1w0Var.d(new ee00(ef00VarH0, (byte) 12));
                        break;
                    case 39:
                        i1w0Var.d(new ee00(ef00VarH0, (byte) 13));
                        break;
                    case 40:
                    case 41:
                        k0w0 k0w0VarI5 = cs0.i(i1w0Var, i1w0Var);
                        ef00VarH0.U.getClass();
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
                        ef00VarH0.B(nw80.b.getId());
                        break;
                    case 43:
                    case 57:
                        ef00VarH0.B(nw80.f24223a.getId());
                        break;
                    case 44:
                        ef00VarH0.A(new hr1(0L, 3));
                        break;
                    case 45:
                        ef00VarH0.A(new kr1());
                        break;
                    case 47:
                        k0w0 k0w0VarI6 = cs0.i(i1w0Var, i1w0Var);
                        ef00VarH0.r.getClass();
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
                        i1w0Var.d(new ee00(ef00VarH0, (byte) 14));
                        break;
                    case 49:
                    case 51:
                        i1w0Var.d(new ee00(ef00VarH0, (byte) 15));
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        sac.V(jiu0.a(ef00VarH0), new ee00(ef00VarH0, (byte) 5), null, mneVar.f22085a, new juy(ef00VarH0, new ge00(ef00VarH0, b5), yjeVar, b4), 10);
                        break;
                    case 52:
                    case 53:
                    case 54:
                        k0w0 k0w0VarI7 = cs0.i(i1w0Var, i1w0Var);
                        ys70 ys70Var = ef00VarH0.c0;
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
                        rz4.u(ef00VarH0.T, k0w0VarI8);
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
                        ef00VarH0.A(new er1(false, 126L));
                        break;
                    case 60:
                        ef00VarH0.f0.f("menu_aggregator", "");
                        ef00VarH0.g0.d("menu_aggregator", "");
                        i1w0Var.d(new ee00(ef00VarH0, b6));
                        break;
                    case 61:
                        CopyOnWriteArrayList copyOnWriteArrayListQ10 = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ10, new c8d(y7d.f42146a, new a1w0(new ge00(ef00VarH0, b8))), i1w0Var, copyOnWriteArrayListQ10, 0);
                        while (true) {
                            paw pawVar20 = (paw) listIteratorP;
                            if (pawVar20.hasNext()) {
                                i1w0Var.a((oe50) pawVar20.next());
                            }
                            break;
                        }
                        break;
                    case 62:
                        i1w0Var.d(new ee00(ef00VarH0, (byte) 16));
                        break;
                    case 63:
                        ef00VarH0.C(R.string.info_partner_programm, pruVar.a().m.k);
                        break;
                    case 64:
                        ef00VarH0.C(R.string.info_agent_programm, pruVar.a().m.l);
                        break;
                    case 65:
                        i1w0Var.d(new ee00(ef00VarH0, b7));
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
                wsz wszVar3 = ce00.P1;
                z140Var.getClass();
                ef00 ef00VarH1 = ce00Var.H0();
                ef00VarH1.z(z140Var);
                FragmentScreen fragmentScreenH = ef00VarH1.H.h(z140Var.getEventId(), z140Var.getTitle());
                i1w0 i1w0Var2 = ef00VarH1.Q;
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
                wsz wszVar4 = ce00.P1;
                d240Var.getClass();
                ef00 ef00VarH2 = ce00Var.H0();
                ef00VarH2.z(d240Var);
                ef00VarH2.Q.d(new u400(ef00VarH2, d240Var, b2));
                break;
            default:
                c240 c240Var = (c240) obj;
                wsz wszVar5 = ce00.P1;
                c240Var.getClass();
                ef00 ef00VarH3 = ce00Var.H0();
                ef00VarH3.z(c240Var);
                ef00VarH3.Q.d(new u400(ef00VarH3, c240Var, b3));
                break;
        }
        return Unit.f46060a;
    }
}
