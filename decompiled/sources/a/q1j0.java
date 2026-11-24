package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen$Companion$invoke$1;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.coef_type.impl.navigation.CoefTypeScreenFactoryImpl$getSettingsCoefTypeScreen$1;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.democonfig.impl.navigation.DemoConfigScreenFactoryImpl$getScannerDemoConfigScreen$1;
import org.xplatform.feature.office.social.impl.navigation.SocialScreenFactoryImpl$getSocialNetworksScreen$1;
import org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$TestSectionScreen;
import org.xplatform.features.notification_settings.impl.navigation.PushNotificationSettingsScreens$PushNotificationSettingsFragmentScreen;
import org.xplatform.onboarding_section.impl.navigation.OnboardingScreens$OnboardingSectionsFragmentScreen;
import org.xplatform.pin_code.impl.navigation.PinCodeScreensFactoryImpl$pinCodeSettingsScreen$1;
import org.xplatform.popular.settings.impl.navigation.PopularSettingsScreenFactoryImpl$getScreen$1;
import org.xplatform.proxy.navigation.ProxySettingsScreen;
import org.xplatform.rate_app.impl.navigation.RateAppDialogFactoryImpl$getRateAppDialog$1;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;
import org.xplatform.shake.impl.navigation.HandShakeSettingsFragmentScreen;
import org.xplatform.share_app.impl.navigation.ShareAppScreens$ShareAppQrFragmentScreen;
import org.xplatform.sportgame.markets.display_settings.impl.navigation.MarketsDisplaySettingsScreenFactoryImpl$getScreen$1;
import org.xplatform.themesettings.impl.navigation.ThemeSettingsScreen$ThemeUiKitScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q1j0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27956a;
    public final /* synthetic */ t1j0 b;

    public /* synthetic */ q1j0(t1j0 t1j0Var, byte b) {
        this.f27956a = b;
        this.b = t1j0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f27956a;
        Object[] objArr = 0;
        byte b2 = 1;
        t1j0 t1j0Var = this.b;
        yje yjeVar = null;
        switch (b) {
            case 0:
                String str = (String) obj;
                zie0 zie0Var = t1j0.Y1;
                str.getClass();
                org.xplatform.settings.impl.presentation.a aVarI0 = t1j0Var.I0();
                sac.V(jiu0.a(aVarI0), new wvi0((byte) 25), null, aVarI0.s.c, new sej0(aVarI0, str, yjeVar, objArr == true ? 1 : 0), 10);
                return Unit.f46060a;
            case 1:
                iqt0 iqt0Var = (iqt0) obj;
                zie0 zie0Var2 = t1j0.Y1;
                iqt0Var.getClass();
                t1j0Var.I0().o.a(iqt0Var);
                return Unit.f46060a;
            case 2:
                ConfirmationNewPlaceResultType confirmationNewPlaceResultType = (ConfirmationNewPlaceResultType) obj;
                zie0 zie0Var3 = t1j0.Y1;
                confirmationNewPlaceResultType.getClass();
                org.xplatform.settings.impl.presentation.a aVarI1 = t1j0Var.I0();
                if (confirmationNewPlaceResultType instanceof ConfirmationNewPlaceResultType.Success) {
                    sac.V(jiu0.a(aVarI1), hfj0.f12977a, null, aVarI1.s.b, new oej0(aVarI1, yjeVar, (byte) 13), 10);
                } else if (confirmationNewPlaceResultType instanceof ConfirmationNewPlaceResultType.Error) {
                    aVarI1.G(new i1j0(aVarI1.q.f(R.string.authorization_error, new Object[0])), null);
                } else if (!(confirmationNewPlaceResultType instanceof ConfirmationNewPlaceResultType.Canceled)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case 3:
                hej0 hej0Var = (hej0) obj;
                zie0 zie0Var4 = t1j0.Y1;
                hej0Var.getClass();
                org.xplatform.settings.impl.presentation.a aVarI2 = t1j0Var.I0();
                sff0 sff0Var = aVarI2.J0;
                boolean z = aVarI2.K0;
                mne mneVar = aVarI2.s;
                qgd qgdVar = aVarI2.e;
                p7m0 p7m0Var = aVarI2.X0;
                s64 s64Var = aVarI2.A;
                s31 s31Var = aVarI2.d;
                i1w0 i1w0Var = aVarI2.k;
                if (hej0Var instanceof eij0) {
                    aVarI2.E(true);
                } else if (hej0Var instanceof zhj0) {
                    aVarI2.E(false);
                } else if (hej0Var instanceof hhj0) {
                    i8i.D("point", "verification", s31Var.f31532a, "acc_settings_menu");
                    s64Var.e("verification");
                    i1w0Var.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, new f1w0(qgdVar.g0())), i1w0Var, copyOnWriteArrayList, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else if (hej0Var instanceof m9j0) {
                    s31Var.x();
                    s64Var.e("pin");
                    i1w0Var.getClass();
                    k0w0 k0w0Var = new k0w0(i1w0Var);
                    aVarI2.l0.getClass();
                    k0w0Var.h(new PinCodeScreensFactoryImpl$pinCodeSettingsScreen$1());
                    ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorO;
                        if (pawVar2.hasNext()) {
                            i1w0Var.a((oe50) pawVar2.next());
                        }
                    }
                } else if (hej0Var instanceof ghj0) {
                    i1w0Var.f("authenticatorChangedResultKey", new dxi0(aVarI2, (byte) 1));
                    s31Var.l();
                    s64Var.e("1xauth");
                    sac.V(jiu0.a(aVarI2), new kej0(aVarI2, (byte) 9), null, mneVar.c, new oej0(aVarI2, yjeVar, (byte) 6), 10);
                } else if (hej0Var instanceof qhj0) {
                    aVarI2.F();
                } else if (hej0Var instanceof fhj0) {
                    if (!((caj0) p7m0Var.getValue()).d) {
                        aVarI2.G(new f1j0(vvi0.e), null);
                    } else if (sff0Var.g.r == tsh0.GIFT) {
                        aVarI2.C(nqh0.b);
                    } else {
                        s31Var.r();
                        s64Var.e("history");
                        i1w0Var.d(new kej0(aVarI2, (byte) 17));
                    }
                } else if (hej0Var instanceof n9j0) {
                    if (((caj0) p7m0Var.getValue()).d) {
                        s31Var.D();
                        s64Var.e("transactions");
                        i1w0Var.d(new kej0(aVarI2, (byte) 16));
                    } else {
                        aVarI2.G(new f1j0(vvi0.b), null);
                    }
                } else if (hej0Var instanceof jhj0) {
                    org.xplatform.settings.impl.presentation.a.D(aVarI2);
                } else if (hej0Var instanceof yhj0) {
                    s31Var.n();
                    s64Var.e("coeff_type");
                    i1w0Var.getClass();
                    k0w0 k0w0Var2 = new k0w0(i1w0Var);
                    aVarI2.H.getClass();
                    k0w0Var2.h(new CoefTypeScreenFactoryImpl$getSettingsCoefTypeScreen$1());
                    ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0Var2.f17489a, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorO2;
                        if (pawVar3.hasNext()) {
                            i1w0Var.a((oe50) pawVar3.next());
                        }
                    }
                } else if (hej0Var instanceof p9j0) {
                    s31Var.A();
                    s64Var.e("push");
                    i1w0Var.getClass();
                    k0w0 k0w0Var3 = new k0w0(i1w0Var);
                    aVarI2.O.getClass();
                    k0w0Var3.h(new PushNotificationSettingsScreens$PushNotificationSettingsFragmentScreen());
                    ListIterator listIteratorO3 = b1j.o(i1w0Var, k0w0Var3.f17489a, 0);
                    while (true) {
                        paw pawVar4 = (paw) listIteratorO3;
                        if (pawVar4.hasNext()) {
                            i1w0Var.a((oe50) pawVar4.next());
                        }
                    }
                } else if ((hej0Var instanceof f9j0) || (hej0Var instanceof ihj0)) {
                    if (((caj0) p7m0Var.getValue()).d) {
                        s31Var.t();
                        s64Var.e("mailing");
                        i1w0Var.d(new kej0(aVarI2, (byte) 10));
                    } else {
                        aVarI2.G(new f1j0(vvi0.d), null);
                    }
                } else if (hej0Var instanceof h9j0) {
                    s31Var.o();
                    s64Var.e("dark_theme");
                    i1w0Var.getClass();
                    k0w0 k0w0Var4 = new k0w0(i1w0Var);
                    aVarI2.L.getClass();
                    k0w0Var4.h(new ThemeSettingsScreen$ThemeUiKitScreen());
                    ListIterator listIteratorO4 = b1j.o(i1w0Var, k0w0Var4.f17489a, 0);
                    while (true) {
                        paw pawVar5 = (paw) listIteratorO4;
                        if (pawVar5.hasNext()) {
                            i1w0Var.a((oe50) pawVar5.next());
                        }
                    }
                } else if (hej0Var instanceof o9j0) {
                    s31Var.y();
                    s64Var.e("popular");
                    i1w0Var.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                    PopularSettingsScreenFactoryImpl$getScreen$1 popularSettingsScreenFactoryImpl$getScreen$1S = qgdVar.S();
                    if (popularSettingsScreenFactoryImpl$getScreen$1S instanceof DialogScreen) {
                        copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) popularSettingsScreenFactoryImpl$getScreen$1S)));
                    } else {
                        copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(popularSettingsScreenFactoryImpl$getScreen$1S)));
                    }
                    ListIterator listIteratorO5 = b1j.o(i1w0Var, copyOnWriteArrayList2, 0);
                    while (true) {
                        paw pawVar6 = (paw) listIteratorO5;
                        if (pawVar6.hasNext()) {
                            i1w0Var.a((oe50) pawVar6.next());
                        }
                    }
                } else if (hej0Var instanceof s9j0) {
                    s31Var.q();
                    s64Var.e("gesture");
                    if (!z) {
                        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                        aVarI2.M.getClass();
                        k0w0VarI.h(new HandShakeSettingsFragmentScreen());
                        ListIterator listIteratorO6 = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                        while (true) {
                            paw pawVar7 = (paw) listIteratorO6;
                            if (pawVar7.hasNext()) {
                                i1w0Var.a((oe50) pawVar7.next());
                            }
                        }
                    }
                } else if (hej0Var instanceof y9j0) {
                    s31Var.f31532a.c("widget_fastaccess_setup");
                    aVarI2.R.f1455a.a(xun.f41520a, 3155L);
                    i1w0Var.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
                    aVarI2.l.getClass();
                    FragmentScreen$Companion$invoke$1 fragmentScreen$Companion$invoke$1S = ydx.S();
                    if (fragmentScreen$Companion$invoke$1S instanceof DialogScreen) {
                        copyOnWriteArrayList3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen$Companion$invoke$1S)));
                    } else {
                        copyOnWriteArrayList3.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen$Companion$invoke$1S)));
                    }
                    ListIterator listIteratorO7 = b1j.o(i1w0Var, copyOnWriteArrayList3, 0);
                    while (true) {
                        paw pawVar8 = (paw) listIteratorO7;
                        if (pawVar8.hasNext()) {
                            i1w0Var.a((oe50) pawVar8.next());
                        }
                    }
                } else {
                    byte b3 = 11;
                    if (hej0Var instanceof e9j0) {
                        s31Var.s();
                        s64Var.e("language");
                        i1w0Var.getClass();
                        CopyOnWriteArrayList copyOnWriteArrayList4 = new CopyOnWriteArrayList();
                        jgc jgcVar = jgc.INSTANCE;
                        kej0 kej0Var = new kej0(aVarI2, (byte) 8);
                        jgcVar.getClass();
                        ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayList4, new c8d(y7d.f42146a, new c1w0(jgcVar, new onu0(jgcVar, kej0Var, (byte) 11))), i1w0Var, copyOnWriteArrayList4, 0);
                        while (true) {
                            paw pawVar9 = (paw) listIteratorP2;
                            if (pawVar9.hasNext()) {
                                i1w0Var.a((oe50) pawVar9.next());
                            }
                        }
                    } else if (hej0Var instanceof a9j0) {
                        s31Var.u();
                        s64Var.e("mirror");
                        aVarI2.G(new m1j0(sff0Var.O.length() > 0), null);
                    } else if (hej0Var instanceof phj0) {
                        s31Var.z();
                        s64Var.e("proxy");
                        i1w0Var.getClass();
                        CopyOnWriteArrayList copyOnWriteArrayList5 = new CopyOnWriteArrayList();
                        qgdVar.getClass();
                        ProxySettingsScreen proxySettingsScreen = new ProxySettingsScreen();
                        if (proxySettingsScreen instanceof DialogScreen) {
                            copyOnWriteArrayList5.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) proxySettingsScreen)));
                        } else {
                            copyOnWriteArrayList5.add(new c8d(y7d.f42146a, new w0w0(proxySettingsScreen)));
                        }
                        ListIterator listIteratorO8 = b1j.o(i1w0Var, copyOnWriteArrayList5, 0);
                        while (true) {
                            paw pawVar10 = (paw) listIteratorO8;
                            if (pawVar10.hasNext()) {
                                i1w0Var.a((oe50) pawVar10.next());
                            }
                        }
                    } else if (hej0Var instanceof v9j0) {
                        s31Var.C();
                        s64Var.e("social_media");
                        i1w0Var.getClass();
                        k0w0 k0w0Var5 = new k0w0(i1w0Var);
                        aVarI2.n0.getClass();
                        k0w0Var5.h(new SocialScreenFactoryImpl$getSocialNetworksScreen$1());
                        ListIterator listIteratorO9 = b1j.o(i1w0Var, k0w0Var5.f17489a, 0);
                        while (true) {
                            paw pawVar11 = (paw) listIteratorO9;
                            if (pawVar11.hasNext()) {
                                i1w0Var.a((oe50) pawVar11.next());
                            }
                        }
                    } else if (hej0Var instanceof q9j0) {
                        aVarI2.G(v0j0.f36583a, null);
                    } else if (hej0Var instanceof u9j0) {
                        if (((caj0) p7m0Var.getValue()).r) {
                            aVarI2.y(false);
                            s31Var.E();
                            s64Var.e("share");
                            sac.V(jiu0.a(aVarI2), new kej0(aVarI2, (byte) 7), new lej0(aVarI2, b2), mneVar.c, new oej0(aVarI2, yjeVar, b3), 8);
                        }
                    } else if (hej0Var instanceof t9j0) {
                        s31Var.F();
                        s64Var.e("qr_share");
                        i1w0Var.getClass();
                        k0w0 k0w0Var6 = new k0w0(i1w0Var);
                        aVarI2.J.getClass();
                        k0w0Var6.h(new ShareAppScreens$ShareAppQrFragmentScreen());
                        ListIterator listIteratorO10 = b1j.o(i1w0Var, k0w0Var6.f17489a, 0);
                        while (true) {
                            paw pawVar12 = (paw) listIteratorO10;
                            if (pawVar12.hasNext()) {
                                i1w0Var.a((oe50) pawVar12.next());
                            }
                        }
                    } else if (hej0Var instanceof r9j0) {
                        k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
                        aVarI2.H0.getClass();
                        k0w0VarI2.h(new RateAppDialogFactoryImpl$getRateAppDialog$1());
                        ListIterator listIteratorO11 = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
                        while (true) {
                            paw pawVar13 = (paw) listIteratorO11;
                            if (pawVar13.hasNext()) {
                                i1w0Var.a((oe50) pawVar13.next());
                            }
                        }
                    } else if (hej0Var instanceof i9j0) {
                        s31Var.v();
                        s64Var.e("getting_started");
                        if (!z) {
                            k0w0 k0w0VarI3 = cs0.i(i1w0Var, i1w0Var);
                            aVarI2.N.getClass();
                            k0w0VarI3.h(new OnboardingScreens$OnboardingSectionsFragmentScreen());
                            ListIterator listIteratorO12 = b1j.o(i1w0Var, k0w0VarI3.f17489a, 0);
                            while (true) {
                                paw pawVar14 = (paw) listIteratorO12;
                                if (pawVar14.hasNext()) {
                                    i1w0Var.a((oe50) pawVar14.next());
                                }
                            }
                        }
                    } else if (hej0Var instanceof w9j0) {
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        aVarI2.S.getClass();
                        TestSectionScreen$TestSectionScreen testSectionScreen$TestSectionScreen = new TestSectionScreen$TestSectionScreen();
                        if (testSectionScreen$TestSectionScreen instanceof DialogScreen) {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) testSectionScreen$TestSectionScreen)));
                        } else {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(testSectionScreen$TestSectionScreen)));
                        }
                        ListIterator listIteratorO13 = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar15 = (paw) listIteratorO13;
                            if (pawVar15.hasNext()) {
                                i1w0Var.a((oe50) pawVar15.next());
                            }
                        }
                    } else if (hej0Var instanceof tzi0) {
                        aVarI2.x(true);
                    } else if (hej0Var instanceof b9j0) {
                        aVarI2.G(new o0j0(true), null);
                    } else if (hej0Var instanceof mv00) {
                        ((kt2) aVarI2.z0.b).c("acc_logout_call");
                        String strG = aVarI2.B.g();
                        s64Var.getClass();
                        s64Var.f31684a.a(cui0.b(new j1p(strG, (byte) 2)), 3255L);
                        sac.V(jiu0.a(aVarI2), dfj0.f6005a, null, mneVar.f22085a, new bai0(aVarI2, e1j0.f7038a, yjeVar, (byte) 15), 10);
                    } else if (hej0Var instanceof hzi0) {
                        aVarI2.G(r0j0.f29633a, null);
                    } else if (hej0Var instanceof c9j0) {
                        k0w0 k0w0VarI4 = cs0.i(i1w0Var, i1w0Var);
                        aVarI2.p0.getClass();
                        k0w0VarI4.h(new DemoConfigScreenFactoryImpl$getScannerDemoConfigScreen$1());
                        ListIterator listIteratorO14 = b1j.o(i1w0Var, k0w0VarI4.f17489a, 0);
                        while (true) {
                            paw pawVar16 = (paw) listIteratorO14;
                            if (pawVar16.hasNext()) {
                                i1w0Var.a((oe50) pawVar16.next());
                            }
                        }
                    } else if (hej0Var instanceof d9j0) {
                        sac.V(jiu0.a(aVarI2), new uki0(1, aVarI2.b, rjo.class, "log", "log(Ljava/lang/Throwable;)V", 0, (byte) 13), null, null, new oej0(aVarI2, yjeVar, (byte) 5), 14);
                    } else if (hej0Var instanceof g4k) {
                        aVarI2.G(y0j0.f41808a, null);
                    } else if (hej0Var instanceof x9j0) {
                        aVarI2.G(t0j0.f33122a, null);
                    } else if (hej0Var instanceof g9j0) {
                        k0w0 k0w0VarI5 = cs0.i(i1w0Var, i1w0Var);
                        aVarI2.F0.getClass();
                        k0w0VarI5.h(new MarketsDisplaySettingsScreenFactoryImpl$getScreen$1());
                        ListIterator listIteratorO15 = b1j.o(i1w0Var, k0w0VarI5.f17489a, 0);
                        while (true) {
                            paw pawVar17 = (paw) listIteratorO15;
                            if (pawVar17.hasNext()) {
                                i1w0Var.a((oe50) pawVar17.next());
                            }
                        }
                    }
                }
                return Unit.f46060a;
            default:
                gej0 gej0Var = (gej0) obj;
                zie0 zie0Var5 = t1j0.Y1;
                gej0Var.getClass();
                org.xplatform.settings.impl.presentation.a aVarI3 = t1j0Var.I0();
                s64 s64Var2 = aVarI3.A;
                s31 s31Var2 = aVarI3.d;
                if (gej0Var instanceof fej0) {
                    s31Var2.B();
                    s64Var2.e("QR_auth");
                    boolean z2 = !aVarI3.b0.a();
                    aVarI3.H(z2);
                    sac.V(jiu0.a(aVarI3), new kej0(aVarI3, (byte) 4), null, null, new qej0(aVarI3, z2, null), 14);
                } else {
                    if (!(gej0Var instanceof bej0)) {
                        t9f.b();
                        return null;
                    }
                    boolean z3 = ((bej0) gej0Var).c;
                    p7m0 p7m0Var2 = aVarI3.X0;
                    while (true) {
                        Object value = p7m0Var2.getValue();
                        s31Var2.k(z3);
                        s64Var2.g(z3);
                        aVarI3.w0.a(z3);
                        boolean z4 = z3;
                        if (!p7m0Var2.m(value, caj0.a((caj0) value, false, false, false, null, false, false, null, null, false, false, false, false, false, z4, false, false, null, false, false, false, false, false, 33488895))) {
                            z3 = z4;
                        }
                    }
                }
                return Unit.f46060a;
        }
    }
}
