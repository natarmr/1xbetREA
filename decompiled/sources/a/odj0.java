package a;

import android.gov.nist.core.Separators;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.github.terrakok.cicerone.androidx.FragmentScreen$Companion$invoke$1;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.auth_history.impl.navigation.AuthHistoryScreenFactoryImpl$getScreen$1;
import org.xplatform.coef_type.impl.navigation.CoefTypeScreenFactoryImpl$getSettingsCoefTypeScreen$1;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.democonfig.impl.navigation.DemoConfigScreenFactoryImpl$getScannerDemoConfigScreen$1;
import org.xplatform.feature.office.social.impl.navigation.SocialScreenFactoryImpl$getSocialNetworksScreen$1;
import org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$TestSectionScreen;
import org.xplatform.features.notification_settings.impl.navigation.PushNotificationSettingsScreens$PushNotificationSettingsFragmentScreen;
import org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType;
import org.xplatform.login.new_place.api.navigation.SmsCodeExtras;
import org.xplatform.login.new_place.impl.navigation.ConfirmationNewPlaceScreen;
import org.xplatform.mailing.impl.navigation.MailingScreenFactoryImpl$getMailingManagementFragment$1;
import org.xplatform.make_bet_settings.impl.navigation.SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1;
import org.xplatform.onboarding_section.impl.navigation.OnboardingScreens$OnboardingSectionsFragmentScreen;
import org.xplatform.personal.impl.navigation.PersonalScreen$PersonalDataScreen;
import org.xplatform.pin_code.impl.navigation.PinCodeScreensFactoryImpl$pinCodeSettingsScreen$1;
import org.xplatform.popular.settings.impl.navigation.PopularSettingsScreenFactoryImpl$getScreen$1;
import org.xplatform.proxy.navigation.ProxySettingsScreen;
import org.xplatform.security.impl.navigation.TwoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1;
import org.xplatform.shake.impl.navigation.HandShakeSettingsFragmentScreen;
import org.xplatform.share_app.impl.navigation.ShareAppScreens$ShareAppQrFragmentScreen;
import org.xplatform.sportgame.markets.display_settings.impl.navigation.MarketsDisplaySettingsScreenFactoryImpl$getScreen$1;
import org.xplatform.themesettings.impl.navigation.ThemeSettingsScreen$ThemeUiKitScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class odj0 extends i3t0 {
    public static final /* synthetic */ int V0 = 0;
    public final jw20 A;
    public final iw20 A0;
    public final cyh B;
    public final hs00 B0;
    public final z4w0 C;
    public final nhf0 C0;
    public final uuz D;
    public final rek0 D0;
    public final ctf0 E;
    public final dyg0 E0;
    public final mne F;
    public final kwd F0;
    public final bzu G;
    public final tqx G0;
    public final ieu H;
    public final hfk0 H0;
    public final abu I;
    public final tsu I0;
    public final ieu J;
    public final peu J0;
    public final dzt K;
    public final mnb K0;
    public final rou L;
    public final lef0 L0;
    public final svs0 M;
    public final ot M0;
    public final l7k N;
    public final jyg0 N0;
    public final s64 O;
    public final evz O0;
    public final cmt P;
    public bby P0;
    public final duj Q;
    public bby Q0;
    public final ivn R;
    public c4m0 R0;
    public final gxu S;
    public c4m0 S0;
    public final wgu T;
    public bby T0;
    public final nh70 U;
    public final c4m0 U0;
    public final cl5 V;
    public final y3j0 W;
    public final gle0 X;
    public final cmt Y;
    public final j6m0 Z;
    public final zie0 a0;
    public final xuz b0;
    public final rl70 c0;
    public final f4u d0;
    public final s64 e0;
    public final au0 f0;
    public final s9m0 g0;
    public final iqt h0;
    public final x1u i0;
    public final bbw0 j0;
    public final sqx k0;
    public final nr00 l0;
    public final ubu m0;
    public final zoi0 n0;
    public final rjo o;
    public final nrt o0;
    public final ojj p;
    public final nou p0;
    public final mi70 q;
    public final nyb q0;
    public final s31 r;
    public final rkt0 r0;
    public final m1e s;
    public final yk50 s0;
    public final qgd t;
    public final zyt t0;
    public final ieu u;
    public final p4u u0;
    public final v88 v;
    public final a6u v0;
    public final ih5 w;
    public final bu90 w0;
    public final y3v x;
    public final im4 x0;
    public final jh70 y;
    public final gne0 y0;
    public final i1w0 z;
    public final usd z0;

    public odj0(rjo rjoVar, ojj ojjVar, mi70 mi70Var, s31 s31Var, m1e m1eVar, qgd qgdVar, ieu ieuVar, lbu lbuVar, v88 v88Var, ih5 ih5Var, y3v y3vVar, jh70 jh70Var, i1w0 i1w0Var, jw20 jw20Var, pru pruVar, bzt bztVar, cyh cyhVar, z4w0 z4w0Var, uuz uuzVar, ctf0 ctf0Var, yox yoxVar, mne mneVar, bzu bzuVar, ieu ieuVar2, abu abuVar, ieu ieuVar3, dzt dztVar, rou rouVar, x4u x4uVar, svs0 svs0Var, l7k l7kVar, s64 s64Var, cmt cmtVar, duj dujVar, ivn ivnVar, gxu gxuVar, wgu wguVar, nh70 nh70Var, cl5 cl5Var, y3j0 y3j0Var, gle0 gle0Var, cmt cmtVar2, j6m0 j6m0Var, zie0 zie0Var, xuz xuzVar, rl70 rl70Var, f4u f4uVar, s64 s64Var2, au0 au0Var, s9m0 s9m0Var, iqt iqtVar, x1u x1uVar, bbw0 bbw0Var, sqx sqxVar, nr00 nr00Var, nv20 nv20Var, ubu ubuVar, zoi0 zoi0Var, nrt nrtVar, nou nouVar, nyb nybVar, rkt0 rkt0Var, yk50 yk50Var, zyt zytVar, p4u p4uVar, czt cztVar, a6u a6uVar, bu90 bu90Var, im4 im4Var, sd60 sd60Var, zx10 zx10Var, gne0 gne0Var, rqt rqtVar, qho qhoVar, usd usdVar, iw20 iw20Var, hs00 hs00Var, rqt rqtVar2, String str, nhf0 nhf0Var, rek0 rek0Var, dyg0 dyg0Var, kwd kwdVar, tqx tqxVar, yzn0 yzn0Var, ubu ubuVar2, hfk0 hfk0Var, tsu tsuVar, peu peuVar, mnb mnbVar, lef0 lef0Var, ot otVar, jyg0 jyg0Var, epc epcVar, tqt tqtVar, evz evzVar, vzg0 vzg0Var) {
        m1eVar.getClass();
        i1w0Var.getClass();
        ctf0Var.getClass();
        wguVar.getClass();
        axi0 axi0Var = new axi0(iqtVar, ubuVar2, ctf0Var, pruVar, bztVar, cztVar, lbuVar, sqxVar, ivnVar, zytVar, rqtVar, rqtVar2, yzn0Var, qhoVar, epcVar, tqtVar, (byte) 1);
        h0j0 h0j0Var = new h0j0(ctf0Var, (byte) 2);
        vs10 vs10Var = mneVar.c;
        super(null, axi0Var, h0j0Var, cvm0.p(vs10Var, mneVar.f22085a), null);
        this.o = rjoVar;
        this.p = ojjVar;
        this.q = mi70Var;
        this.r = s31Var;
        this.s = m1eVar;
        this.t = qgdVar;
        this.u = ieuVar;
        this.v = v88Var;
        this.w = ih5Var;
        this.x = y3vVar;
        this.y = jh70Var;
        this.z = i1w0Var;
        this.A = jw20Var;
        this.B = cyhVar;
        this.C = z4w0Var;
        this.D = uuzVar;
        this.E = ctf0Var;
        this.F = mneVar;
        this.G = bzuVar;
        this.H = ieuVar2;
        this.I = abuVar;
        this.J = ieuVar3;
        this.K = dztVar;
        this.L = rouVar;
        this.M = svs0Var;
        this.N = l7kVar;
        this.O = s64Var;
        this.P = cmtVar;
        this.Q = dujVar;
        this.R = ivnVar;
        this.S = gxuVar;
        this.T = wguVar;
        this.U = nh70Var;
        this.V = cl5Var;
        this.W = y3j0Var;
        this.X = gle0Var;
        this.Y = cmtVar2;
        this.Z = j6m0Var;
        this.a0 = zie0Var;
        this.b0 = xuzVar;
        this.c0 = rl70Var;
        this.d0 = f4uVar;
        this.e0 = s64Var2;
        this.f0 = au0Var;
        this.g0 = s9m0Var;
        this.h0 = iqtVar;
        this.i0 = x1uVar;
        this.j0 = bbw0Var;
        this.k0 = sqxVar;
        this.l0 = nr00Var;
        this.m0 = ubuVar;
        this.n0 = zoi0Var;
        this.o0 = nrtVar;
        this.p0 = nouVar;
        this.q0 = nybVar;
        this.r0 = rkt0Var;
        this.s0 = yk50Var;
        this.t0 = zytVar;
        this.u0 = p4uVar;
        this.v0 = a6uVar;
        this.w0 = bu90Var;
        this.x0 = im4Var;
        this.y0 = gne0Var;
        this.z0 = usdVar;
        this.A0 = iw20Var;
        this.B0 = hs00Var;
        this.C0 = nhf0Var;
        this.D0 = rek0Var;
        this.E0 = dyg0Var;
        this.F0 = kwdVar;
        this.G0 = tqxVar;
        this.H0 = hfk0Var;
        this.I0 = tsuVar;
        this.J0 = peuVar;
        this.K0 = mnbVar;
        this.L0 = lef0Var;
        this.M0 = otVar;
        this.N0 = jyg0Var;
        this.O0 = evzVar;
        yje yjeVar = null;
        i3t0.K(this, null, null, new hhb0(this, yjeVar, (byte) 12), 3);
        e3c.n(this.U0);
        this.U0 = sac.T(new fnq(new xp90(im4Var.b(), (byte) 5), new idj0(this, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), vs10Var), foe.h);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(ql5 ql5Var, zje zjeVar) {
        ycj0 ycj0Var;
        if (zjeVar instanceof ycj0) {
            ycj0Var = (ycj0) zjeVar;
            int i = ycj0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ycj0Var.k = i - Integer.MIN_VALUE;
            } else {
                ycj0Var = new ycj0(this, zjeVar);
            }
        } else {
            ycj0Var = new ycj0(this, zjeVar);
        }
        Object obj = ycj0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ycj0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            if (ql5Var == null) {
                return Unit.f46060a;
            }
            ycj0Var.k = 1;
            if (this.K0.a(ql5Var, ycj0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        S(false);
        return Unit.f46060a;
    }

    public final void N(boolean z) {
        int i;
        if (((tcj0) D()).T && 2 <= (i = ((tcj0) D()).U) && i < 11 && z) {
            V();
            H(new r3j0((byte) 11));
            return;
        }
        byte b = 0;
        yje yjeVar = null;
        if (((tcj0) D()).T && ((tcj0) D()).U >= 11 && z) {
            H(new r3j0((byte) 14));
            H(new r3j0((byte) 15));
            sac.V(jiu0.a(this), adj0.f682a, null, this.F.c, new bdj0(this, yjeVar, b), 10);
            return;
        }
        this.C0.getClass();
        bby bbyVar = this.P0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.P0 = sac.i0(jiu0.a(this), "SettingsViewModel.checkUpdate", 3, 0L, null, null, new cdj0(this, z, yjeVar, b), null, null, new ij90((Object) this, z, (byte) 8), null, 732);
        } else if (z && ((tcj0) D()).T) {
            H(new r3j0((byte) 17));
        }
    }

    public final void O(Throwable th, uu4 uu4Var) {
        ConfirmationNewPlaceScreenType smsCode;
        boolean z = th instanceof fn50;
        i1w0 i1w0Var = this.z;
        if (z) {
            fn50 fn50Var = (fn50) th;
            boolean z2 = fn50Var.d;
            String str = fn50Var.c;
            if (z2) {
                this.q0.b(str);
            }
            String str2 = fn50Var.b;
            String str3 = fn50Var.f;
            if (z2) {
                smsCode = new ConfirmationNewPlaceScreenType.Authenticator(str2, "REQUEST_CONFIRMATION_NEW_PLACE_KEY", str3, str);
            } else {
                smsCode = fn50Var.e ? new ConfirmationNewPlaceScreenType.SmsCode(str2, "REQUEST_CONFIRMATION_NEW_PLACE_KEY", str3, new SmsCodeExtras.FromAuthenticatorExtras("")) : new ConfirmationNewPlaceScreenType.Simple(str2, "REQUEST_CONFIRMATION_NEW_PLACE_KEY", str3, fn50Var.g);
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            this.F0.getClass();
            FragmentScreen confirmationNewPlaceScreen = new ConfirmationNewPlaceScreen(smsCode);
            if (confirmationNewPlaceScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) confirmationNewPlaceScreen)));
            } else {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(confirmationNewPlaceScreen)));
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
            boolean z3 = th instanceof n64;
            dcj0 dcj0Var = dcj0.f5849a;
            if (z3) {
                G(dcj0Var);
                return;
            }
            if (!(th instanceof kj50)) {
                if (th instanceof k6a) {
                    sac.V(jiu0.a(this), new huh0(this, uu4Var, (byte) 8), null, null, new qe5((Object) this, (Object) uu4Var, (yje) null, (byte) 15), 14);
                    return;
                }
                if (!(th instanceof zhi0)) {
                    this.p.c("Login error: " + th.getMessage(), th);
                    G(dcj0Var);
                    return;
                }
                zhi0 zhi0Var = (zhi0) th;
                int errorCode = zhi0Var.c.getErrorCode();
                String message = zhi0Var.getMessage();
                String str4 = message != null ? message : "";
                this.x.s(String.valueOf(errorCode));
                this.e0.h(errorCode);
                G(new ncj0(str4));
                return;
            }
            this.M.getClass();
            FragmentScreen twoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1 = new TwoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1();
            i1w0Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (twoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1 instanceof DialogScreen) {
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) twoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1)));
            } else {
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(twoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1)));
            }
            ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
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

    public final void P() {
        i1w0 i1w0Var = this.z;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new a1w0(new wcj0(this, (byte) 2))), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void Q(nqh0 nqh0Var) {
        this.r.i();
        s64 s64Var = this.O;
        b1j.v("acc_settings", s64Var.f31684a, 3246L);
        s64Var.e("safety_settings");
        i1w0 i1w0Var = this.z;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        k0w0VarI.h(iw20.f(this.A0, nqh0Var));
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

    public final void R(boolean z) {
        if (!z) {
            this.r.I();
            y1p y1pVar = y1p.MAIN;
            this.N.c("acc_settings");
        }
        sac.V(jiu0.a(this), new vcj0(this, (byte) 0), null, this.F.b, new cdj0(this, z, null, (byte) 1), 10);
    }

    public final void S(boolean z) {
        bby bbyVar = this.T0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.T0 = sac.V(jiu0.a(this), new vcj0(this, (byte) 7), null, this.F.b, new fj3(z, (Object) this, (yje) null, (byte) 22), 10);
        }
    }

    public final void T(boolean z) {
        this.r0.g(z);
        this.n0.a(z);
        H(new cxi0((byte) 8, z));
    }

    public final void U() {
        i1w0 i1w0Var = this.z;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, m0w0.f20976a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void V() {
        bby bbyVar = this.Q0;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.Q0 = null;
        this.Q0 = sac.f0(jiu0.a(this), 2L, TimeUnit.SECONDS, this.F.b, kdj0.f18111a, new fdj0(this, yjeVar, (byte) 1), 32);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W(zje zjeVar) {
        ndj0 ndj0Var;
        m2c0 m2c0Var;
        if (zjeVar instanceof ndj0) {
            ndj0Var = (ndj0) zjeVar;
            int i = ndj0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndj0Var.l = i - Integer.MIN_VALUE;
            } else {
                ndj0Var = new ndj0(this, zjeVar);
            }
        } else {
            ndj0Var = new ndj0(this, zjeVar);
        }
        Object objA = ndj0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ndj0Var.l;
        boolean z = false;
        if (i2 == 0) {
            z1x.P(objA);
            ndj0Var.l = 1;
            objA = this.L.a(false, ndj0Var);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z1x.P(objA);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m2c0Var = ndj0Var.i;
            z1x.P(objA);
        }
        if (((Boolean) objA).booleanValue() && m2c0Var.n0) {
            z = true;
        }
        H(new xh20((Object) m2c0Var, z, (byte) 18));
        return Unit.f46060a;
        m2c0 m2c0Var2 = (m2c0) objA;
        ndj0Var.i = m2c0Var2;
        ndj0Var.l = 2;
        Object objN = this.S.n(ndj0Var);
        if (objN != wneVar) {
            m2c0Var = m2c0Var2;
            objA = objN;
            if (((Boolean) objA).booleanValue()) {
                z = true;
            }
            H(new xh20((Object) m2c0Var, z, (byte) 18));
            return Unit.f46060a;
        }
        return wneVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        lbj0 lbj0Var = (lbj0) obj;
        lbj0Var.getClass();
        boolean z = lbj0Var instanceof taj0;
        byte b = 25;
        byte b2 = 11;
        byte b3 = 7;
        byte b4 = 5;
        byte b5 = 4;
        boolean z2 = false;
        s31 s31Var = this.r;
        byte b6 = 2;
        yje yjeVar = null;
        mne mneVar = this.F;
        i1w0 i1w0Var = this.z;
        byte b7 = 1;
        char c = 1;
        if (z) {
            taj0 taj0Var = (taj0) lbj0Var;
            if (taj0Var instanceof iaj0) {
                sac.V(jiu0.a(this), new wvi0((byte) 23), null, mneVar.c, new kbh0(this, ((iaj0) taj0Var).f14441a, yjeVar, b4), 10);
                return;
            }
            if (!(taj0Var instanceof jaj0)) {
                byte b8 = 10;
                if (taj0Var instanceof laj0) {
                    String str = ((tcj0) D()).E;
                    if (str.length() == 0) {
                        sac.V(jiu0.a(this), new vcj0(this, b8), null, mneVar.c, new bdj0(this, yjeVar, b7), 10);
                        return;
                    } else {
                        G(new xbj0(nsm0.l(str, this.T.a())));
                        return;
                    }
                }
                if (taj0Var instanceof raj0) {
                    U();
                    return;
                }
                if (taj0Var instanceof naj0) {
                    sac.V(jiu0.a(this), new vcj0(this, (byte) 14), null, mneVar.b, new bdj0(this, yjeVar, b3), 10);
                    return;
                }
                if (taj0Var instanceof oaj0) {
                    U();
                    return;
                }
                if (taj0Var instanceof haj0) {
                    haj0 haj0Var = (haj0) taj0Var;
                    double d = haj0Var.f12727a;
                    boolean z3 = haj0Var.b;
                    s31Var.m();
                    ctf0 ctf0Var = this.E;
                    if (d < 0.1d) {
                        H(new s5h(b4, "0.0 ".concat(ctf0Var.b.a(R.string.mega_bytes_abbreviated, Arrays.copyOf(new Object[0], 0))), z2));
                        return;
                    }
                    if (z3) {
                        G(sbj0.f31938a);
                        return;
                    }
                    H(new s5h(b4, d + Separators.SP + ctf0Var.b.a(R.string.mega_bytes_abbreviated, Arrays.copyOf(new Object[0], 0)), (boolean) (c == true ? 1 : 0)));
                    return;
                }
                if (taj0Var instanceof maj0) {
                    i1w0Var.d(new vcj0(this, (byte) 16));
                    return;
                }
                if (taj0Var instanceof gaj0) {
                    sac.V(jiu0.a(this), edj0.f7620a, null, null, new kbh0(this, taj0Var, yjeVar, b3), 14);
                    return;
                }
                if (taj0Var instanceof eaj0) {
                    ((vlk) this.L0.f19899a).f37628a.e("changeBalance", ((eaj0) taj0Var).f7468a);
                    return;
                }
                if (taj0Var.equals(kaj0.f17966a)) {
                    E();
                    return;
                }
                if (taj0Var instanceof saj0) {
                    sac.V(jiu0.a(this), mdj0.f21600a, null, mneVar.b, new bdj0(this, yjeVar, b2), 10);
                    return;
                }
                if (taj0Var instanceof faj0) {
                    this.C.a(((faj0) taj0Var).f9210a);
                    return;
                }
                if (!taj0Var.equals(paj0.f26658a)) {
                    if (!taj0Var.equals(qaj0.f28397a)) {
                        t9f.b();
                        return;
                    } else {
                        e3c.n(this.R0);
                        e3c.n(this.S0);
                        return;
                    }
                }
                c4m0 c4m0Var = this.R0;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.R0 = sac.T(new fnq(this.s.b(), new bdj0(this, yjeVar, b8), (byte) 4), jiu0.a(this), ldj0.h);
                }
                c4m0 c4m0Var2 = this.S0;
                if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                    this.S0 = sac.T(new fnq(this.B0.a(), new yg1(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new tri0(b6, yjeVar, b6));
                    return;
                }
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    i1w0Var.d(new vcj0(this, (byte) 15));
                    return;
                }
                i1w0Var.a((oe50) pawVar.next());
            }
        } else {
            if (!(lbj0Var instanceof kbj0)) {
                return;
            }
            kbj0 kbj0Var = (kbj0) lbj0Var;
            if (kbj0Var instanceof bbj0) {
                R(true);
                return;
            }
            if (kbj0Var instanceof jbj0) {
                R(false);
                return;
            }
            if (kbj0Var instanceof uaj0) {
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            } else {
                boolean z4 = kbj0Var instanceof gbj0;
                uuz uuzVar = this.D;
                y3j0 y3j0Var = this.W;
                hfk0 hfk0Var = this.H0;
                bcj0 bcj0Var = bcj0.f2359a;
                if (z4) {
                    hej0 hej0Var = ((gbj0) kbj0Var).f11017a;
                    if (hej0Var == null) {
                        return;
                    }
                    boolean z5 = hej0Var instanceof ahj0;
                    qgd qgdVar = this.t;
                    if (z5) {
                        CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                        ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, new f1w0(qgdVar.g0())), i1w0Var, copyOnWriteArrayListQ3, 0);
                        while (true) {
                            paw pawVar3 = (paw) listIteratorP3;
                            if (!pawVar3.hasNext()) {
                                return;
                            } else {
                                i1w0Var.a((oe50) pawVar3.next());
                            }
                        }
                    } else if (hej0Var instanceof n8j0) {
                        s31Var.x();
                        i1w0Var.getClass();
                        k0w0 k0w0Var = new k0w0(i1w0Var);
                        this.w0.getClass();
                        k0w0Var.h(new PinCodeScreensFactoryImpl$pinCodeSettingsScreen$1());
                        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                        while (true) {
                            paw pawVar4 = (paw) listIteratorO;
                            if (!pawVar4.hasNext()) {
                                return;
                            } else {
                                i1w0Var.a((oe50) pawVar4.next());
                            }
                        }
                    } else {
                        if (hej0Var instanceof x8j0) {
                            G(wbj0.f38882a);
                            return;
                        }
                        if (hej0Var instanceof zgj0) {
                            i1w0Var.f("authenticatorChangedResultKey", new xcj0(this, (byte) 0));
                            s31Var.l();
                            sac.V(jiu0.a(this), new vcj0(this, b2), null, mneVar.c, new bdj0(this, yjeVar, b5), 10);
                            return;
                        }
                        if (hej0Var instanceof dhj0) {
                            if (((tcj0) D()).c) {
                                Q(nqh0.f23960a);
                                return;
                            } else {
                                G(new jcj0(vvi0.f38101a));
                                return;
                            }
                        }
                        if (hej0Var instanceof ygj0) {
                            if (!((tcj0) D()).c) {
                                G(new jcj0(vvi0.e));
                                return;
                            }
                            if (((tcj0) D()).D == tsh0.GIFT) {
                                Q(nqh0.b);
                                return;
                            }
                            i1w0Var.getClass();
                            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                            hfk0Var.getClass();
                            AuthHistoryScreenFactoryImpl$getScreen$1 authHistoryScreenFactoryImpl$getScreen$1 = new AuthHistoryScreenFactoryImpl$getScreen$1();
                            if (authHistoryScreenFactoryImpl$getScreen$1 instanceof DialogScreen) {
                                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) authHistoryScreenFactoryImpl$getScreen$1)));
                            } else {
                                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(authHistoryScreenFactoryImpl$getScreen$1)));
                            }
                            ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                            while (true) {
                                paw pawVar5 = (paw) listIteratorO2;
                                if (!pawVar5.hasNext()) {
                                    return;
                                } else {
                                    i1w0Var.a((oe50) pawVar5.next());
                                }
                            }
                        } else if (hej0Var instanceof o8j0) {
                            if (!((tcj0) D()).c) {
                                G(new jcj0(vvi0.b));
                                return;
                            }
                            s31Var.D();
                            i1w0Var.getClass();
                            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                            SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1 settingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1A = y3j0.a(y3j0Var);
                            if (settingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1A instanceof DialogScreen) {
                                copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) settingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1A)));
                            } else {
                                copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(settingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1A)));
                            }
                            ListIterator listIteratorO3 = b1j.o(i1w0Var, copyOnWriteArrayList2, 0);
                            while (true) {
                                paw pawVar6 = (paw) listIteratorO3;
                                if (!pawVar6.hasNext()) {
                                    return;
                                } else {
                                    i1w0Var.a((oe50) pawVar6.next());
                                }
                            }
                        } else {
                            if (hej0Var instanceof bhj0) {
                                if (((tcj0) D()).c) {
                                    P();
                                    return;
                                } else {
                                    G(new jcj0(vvi0.c));
                                    return;
                                }
                            }
                            if (hej0Var instanceof xhj0) {
                                s31Var.n();
                                i1w0Var.getClass();
                                k0w0 k0w0Var2 = new k0w0(i1w0Var);
                                this.V.getClass();
                                k0w0Var2.h(new CoefTypeScreenFactoryImpl$getSettingsCoefTypeScreen$1());
                                ListIterator listIteratorO4 = b1j.o(i1w0Var, k0w0Var2.f17489a, 0);
                                while (true) {
                                    paw pawVar7 = (paw) listIteratorO4;
                                    if (!pawVar7.hasNext()) {
                                        return;
                                    } else {
                                        i1w0Var.a((oe50) pawVar7.next());
                                    }
                                }
                            } else if (hej0Var instanceof q8j0) {
                                s31Var.A();
                                i1w0Var.getClass();
                                k0w0 k0w0Var3 = new k0w0(i1w0Var);
                                this.c0.getClass();
                                k0w0Var3.h(new PushNotificationSettingsScreens$PushNotificationSettingsFragmentScreen());
                                ListIterator listIteratorO5 = b1j.o(i1w0Var, k0w0Var3.f17489a, 0);
                                while (true) {
                                    paw pawVar8 = (paw) listIteratorO5;
                                    if (!pawVar8.hasNext()) {
                                        return;
                                    } else {
                                        i1w0Var.a((oe50) pawVar8.next());
                                    }
                                }
                            } else if (hej0Var instanceof j8j0) {
                                if (!((tcj0) D()).c) {
                                    G(new jcj0(vvi0.d));
                                    return;
                                }
                                s31Var.t();
                                i1w0Var.getClass();
                                CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
                                uuzVar.getClass();
                                MailingScreenFactoryImpl$getMailingManagementFragment$1 mailingScreenFactoryImpl$getMailingManagementFragment$1 = new MailingScreenFactoryImpl$getMailingManagementFragment$1();
                                if (mailingScreenFactoryImpl$getMailingManagementFragment$1 instanceof DialogScreen) {
                                    copyOnWriteArrayList3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) mailingScreenFactoryImpl$getMailingManagementFragment$1)));
                                } else {
                                    copyOnWriteArrayList3.add(new c8d(y7d.f42146a, new w0w0(mailingScreenFactoryImpl$getMailingManagementFragment$1)));
                                }
                                ListIterator listIteratorO6 = b1j.o(i1w0Var, copyOnWriteArrayList3, 0);
                                while (true) {
                                    paw pawVar9 = (paw) listIteratorO6;
                                    if (!pawVar9.hasNext()) {
                                        return;
                                    } else {
                                        i1w0Var.a((oe50) pawVar9.next());
                                    }
                                }
                            } else if (hej0Var instanceof l8j0) {
                                s31Var.o();
                                i1w0Var.getClass();
                                k0w0 k0w0Var4 = new k0w0(i1w0Var);
                                this.Z.getClass();
                                k0w0Var4.h(new ThemeSettingsScreen$ThemeUiKitScreen());
                                ListIterator listIteratorO7 = b1j.o(i1w0Var, k0w0Var4.f17489a, 0);
                                while (true) {
                                    paw pawVar10 = (paw) listIteratorO7;
                                    if (!pawVar10.hasNext()) {
                                        return;
                                    } else {
                                        i1w0Var.a((oe50) pawVar10.next());
                                    }
                                }
                            } else if (hej0Var instanceof p8j0) {
                                s31Var.y();
                                i1w0Var.getClass();
                                CopyOnWriteArrayList copyOnWriteArrayList4 = new CopyOnWriteArrayList();
                                PopularSettingsScreenFactoryImpl$getScreen$1 popularSettingsScreenFactoryImpl$getScreen$1S = qgdVar.S();
                                if (popularSettingsScreenFactoryImpl$getScreen$1S instanceof DialogScreen) {
                                    copyOnWriteArrayList4.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) popularSettingsScreenFactoryImpl$getScreen$1S)));
                                } else {
                                    copyOnWriteArrayList4.add(new c8d(y7d.f42146a, new w0w0(popularSettingsScreenFactoryImpl$getScreen$1S)));
                                }
                                ListIterator listIteratorO8 = b1j.o(i1w0Var, copyOnWriteArrayList4, 0);
                                while (true) {
                                    paw pawVar11 = (paw) listIteratorO8;
                                    if (!pawVar11.hasNext()) {
                                        return;
                                    } else {
                                        i1w0Var.a((oe50) pawVar11.next());
                                    }
                                }
                            } else if (hej0Var instanceof s8j0) {
                                s31Var.q();
                                if (((tcj0) D()).K) {
                                    return;
                                }
                                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                                this.a0.getClass();
                                k0w0VarI.h(new HandShakeSettingsFragmentScreen());
                                ListIterator listIteratorO9 = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                                while (true) {
                                    paw pawVar12 = (paw) listIteratorO9;
                                    if (!pawVar12.hasNext()) {
                                        return;
                                    } else {
                                        i1w0Var.a((oe50) pawVar12.next());
                                    }
                                }
                            } else if (hej0Var instanceof y8j0) {
                                s31Var.f31532a.c("widget_fastaccess_setup");
                                this.f0.f1455a.a(xun.f41520a, 3155L);
                                i1w0Var.getClass();
                                CopyOnWriteArrayList copyOnWriteArrayList5 = new CopyOnWriteArrayList();
                                this.A.getClass();
                                FragmentScreen$Companion$invoke$1 fragmentScreen$Companion$invoke$1S = ydx.S();
                                if (fragmentScreen$Companion$invoke$1S instanceof DialogScreen) {
                                    copyOnWriteArrayList5.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen$Companion$invoke$1S)));
                                } else {
                                    copyOnWriteArrayList5.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen$Companion$invoke$1S)));
                                }
                                ListIterator listIteratorO10 = b1j.o(i1w0Var, copyOnWriteArrayList5, 0);
                                while (true) {
                                    paw pawVar13 = (paw) listIteratorO10;
                                    if (!pawVar13.hasNext()) {
                                        return;
                                    } else {
                                        i1w0Var.a((oe50) pawVar13.next());
                                    }
                                }
                            } else if (hej0Var instanceof i8j0) {
                                s31Var.s();
                                i1w0Var.getClass();
                                k0w0 k0w0Var5 = new k0w0(i1w0Var);
                                k0w0.j(k0w0Var5, jgc.INSTANCE, new vcj0(this, (byte) 12));
                                ListIterator listIteratorO11 = b1j.o(i1w0Var, k0w0Var5.f17489a, 0);
                                while (true) {
                                    paw pawVar14 = (paw) listIteratorO11;
                                    if (!pawVar14.hasNext()) {
                                        return;
                                    } else {
                                        i1w0Var.a((oe50) pawVar14.next());
                                    }
                                }
                            } else {
                                if (hej0Var instanceof e8j0) {
                                    s31Var.u();
                                    G(new qcj0(((tcj0) D()).E.length() > 0));
                                    return;
                                }
                                if (hej0Var instanceof chj0) {
                                    s31Var.z();
                                    i1w0Var.getClass();
                                    CopyOnWriteArrayList copyOnWriteArrayList6 = new CopyOnWriteArrayList();
                                    qgdVar.getClass();
                                    ProxySettingsScreen proxySettingsScreen = new ProxySettingsScreen();
                                    if (proxySettingsScreen instanceof DialogScreen) {
                                        copyOnWriteArrayList6.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) proxySettingsScreen)));
                                    } else {
                                        copyOnWriteArrayList6.add(new c8d(y7d.f42146a, new w0w0(proxySettingsScreen)));
                                    }
                                    ListIterator listIteratorO12 = b1j.o(i1w0Var, copyOnWriteArrayList6, 0);
                                    while (true) {
                                        paw pawVar15 = (paw) listIteratorO12;
                                        if (!pawVar15.hasNext()) {
                                            return;
                                        } else {
                                            i1w0Var.a((oe50) pawVar15.next());
                                        }
                                    }
                                } else if (hej0Var instanceof v8j0) {
                                    s31Var.C();
                                    i1w0Var.getClass();
                                    k0w0 k0w0Var6 = new k0w0(i1w0Var);
                                    this.y0.getClass();
                                    k0w0Var6.h(new SocialScreenFactoryImpl$getSocialNetworksScreen$1());
                                    ListIterator listIteratorO13 = b1j.o(i1w0Var, k0w0Var6.f17489a, 0);
                                    while (true) {
                                        paw pawVar16 = (paw) listIteratorO13;
                                        if (!pawVar16.hasNext()) {
                                            return;
                                        } else {
                                            i1w0Var.a((oe50) pawVar16.next());
                                        }
                                    }
                                } else {
                                    if (hej0Var instanceof r8j0) {
                                        G(ybj0.f42345a);
                                        return;
                                    }
                                    if (hej0Var instanceof u8j0) {
                                        if (((tcj0) D()).w) {
                                            H(new cxi0((byte) 7, false));
                                            s31Var.E();
                                            sac.V(jiu0.a(this), new vcj0(this, (byte) 5), new wcj0(this, (byte) 1), mneVar.c, new bdj0(this, yjeVar, (byte) 8), 8);
                                            return;
                                        }
                                        return;
                                    }
                                    if (hej0Var instanceof k8j0) {
                                        k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
                                        this.O0.getClass();
                                        k0w0VarI2.h(new MarketsDisplaySettingsScreenFactoryImpl$getScreen$1());
                                        ListIterator listIteratorO14 = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
                                        while (true) {
                                            paw pawVar17 = (paw) listIteratorO14;
                                            if (!pawVar17.hasNext()) {
                                                return;
                                            } else {
                                                i1w0Var.a((oe50) pawVar17.next());
                                            }
                                        }
                                    } else if (hej0Var instanceof t8j0) {
                                        s31Var.F();
                                        i1w0Var.getClass();
                                        k0w0 k0w0Var7 = new k0w0(i1w0Var);
                                        this.X.getClass();
                                        k0w0Var7.h(new ShareAppScreens$ShareAppQrFragmentScreen());
                                        ListIterator listIteratorO15 = b1j.o(i1w0Var, k0w0Var7.f17489a, 0);
                                        while (true) {
                                            paw pawVar18 = (paw) listIteratorO15;
                                            if (!pawVar18.hasNext()) {
                                                return;
                                            } else {
                                                i1w0Var.a((oe50) pawVar18.next());
                                            }
                                        }
                                    } else if (hej0Var instanceof m8j0) {
                                        s31Var.v();
                                        if (((tcj0) D()).K) {
                                            return;
                                        }
                                        k0w0 k0w0VarI3 = cs0.i(i1w0Var, i1w0Var);
                                        this.b0.getClass();
                                        k0w0VarI3.h(new OnboardingScreens$OnboardingSectionsFragmentScreen());
                                        ListIterator listIteratorO16 = b1j.o(i1w0Var, k0w0VarI3.f17489a, 0);
                                        while (true) {
                                            paw pawVar19 = (paw) listIteratorO16;
                                            if (!pawVar19.hasNext()) {
                                                return;
                                            } else {
                                                i1w0Var.a((oe50) pawVar19.next());
                                            }
                                        }
                                    } else if (hej0Var instanceof w8j0) {
                                        CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var);
                                        this.g0.getClass();
                                        TestSectionScreen$TestSectionScreen testSectionScreen$TestSectionScreen = new TestSectionScreen$TestSectionScreen();
                                        if (testSectionScreen$TestSectionScreen instanceof DialogScreen) {
                                            copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) testSectionScreen$TestSectionScreen)));
                                        } else {
                                            copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new w0w0(testSectionScreen$TestSectionScreen)));
                                        }
                                        ListIterator listIteratorO17 = b1j.o(i1w0Var, copyOnWriteArrayListQ4, 0);
                                        while (true) {
                                            paw pawVar20 = (paw) listIteratorO17;
                                            if (!pawVar20.hasNext()) {
                                                return;
                                            } else {
                                                i1w0Var.a((oe50) pawVar20.next());
                                            }
                                        }
                                    } else {
                                        if (hej0Var instanceof pzi0) {
                                            N(true);
                                            return;
                                        }
                                        if (hej0Var instanceof f8j0) {
                                            G(new rbj0(true));
                                            return;
                                        }
                                        if (hej0Var instanceof dy00) {
                                            G(icj0.f14538a);
                                            return;
                                        }
                                        if (hej0Var instanceof hzi0) {
                                            G(ubj0.f35385a);
                                            return;
                                        }
                                        if (!(hej0Var instanceof g8j0)) {
                                            if (hej0Var instanceof h8j0) {
                                                sac.V(jiu0.a(this), new uki0(1, this.o, rjo.class, "log", "log(Ljava/lang/Throwable;)V", 0, (byte) 11), null, null, new bdj0(this, yjeVar, (byte) 3), 14);
                                                return;
                                            } else {
                                                if (hej0Var instanceof f4k) {
                                                    G(bcj0Var);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        k0w0 k0w0VarI4 = cs0.i(i1w0Var, i1w0Var);
                                        this.z0.getClass();
                                        k0w0VarI4.h(new DemoConfigScreenFactoryImpl$getScannerDemoConfigScreen$1());
                                        ListIterator listIteratorO18 = b1j.o(i1w0Var, k0w0VarI4.f17489a, 0);
                                        while (true) {
                                            paw pawVar21 = (paw) listIteratorO18;
                                            if (!pawVar21.hasNext()) {
                                                return;
                                            } else {
                                                i1w0Var.a((oe50) pawVar21.next());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    boolean z6 = kbj0Var instanceof xaj0;
                    ubu ubuVar = this.m0;
                    if (z6) {
                        H(new cxi0((byte) 4, ubuVar.a()));
                        return;
                    }
                    if (kbj0Var instanceof zaj0) {
                        G(new tbj0(((tcj0) D()).d));
                        return;
                    }
                    boolean z7 = kbj0Var instanceof hbj0;
                    byte b9 = 6;
                    byte b10 = 9;
                    s64 s64Var = this.O;
                    if (z7) {
                        zdj0 zdj0Var = ((hbj0) kbj0Var).f12773a;
                        if (zdj0Var != null) {
                            if (zdj0Var instanceof ydj0) {
                                s31Var.B();
                                boolean z8 = !ubuVar.a();
                                H(new cxi0((byte) 4, z8));
                                sac.V(jiu0.a(this), new vcj0(this, b10), null, null, new zcj0(this, z8, null), 14);
                                return;
                            }
                            if (zdj0Var instanceof xdj0) {
                                boolean z9 = ((xdj0) zdj0Var).c;
                                s31Var.k(z9);
                                s64Var.g(z9);
                                this.G0.a(z9);
                                H(new cxi0((byte) 6, z9));
                                return;
                            }
                        }
                        t9f.b();
                        return;
                    }
                    if (kbj0Var instanceof dbj0) {
                        CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var);
                        PersonalScreen$PersonalDataScreen personalScreen$PersonalDataScreenJ = jh70.j(this.y, false);
                        if (personalScreen$PersonalDataScreenJ instanceof DialogScreen) {
                            copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) personalScreen$PersonalDataScreenJ)));
                        } else {
                            copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new w0w0(personalScreen$PersonalDataScreenJ)));
                        }
                        ListIterator listIteratorO19 = b1j.o(i1w0Var, copyOnWriteArrayListQ5, 0);
                        while (true) {
                            paw pawVar22 = (paw) listIteratorO19;
                            if (!pawVar22.hasNext()) {
                                return;
                            } else {
                                i1w0Var.a((oe50) pawVar22.next());
                            }
                        }
                    } else {
                        if (kbj0Var.equals(cbj0.f4064a)) {
                            G(ecj0.f7569a);
                            return;
                        }
                        if (kbj0Var.equals(fbj0.f9262a)) {
                            S(true);
                            return;
                        }
                        if (kbj0Var.equals(waj0.f38830a)) {
                            sac.V(jiu0.a(this), new vcj0(this, (byte) 17), null, mneVar.b, new bdj0(this, yjeVar, (byte) 5), 10);
                            return;
                        }
                        if (!(kbj0Var instanceof ibj0)) {
                            if (kbj0Var instanceof yaj0) {
                                sac.V(jiu0.a(this), jdj0.f16331a, null, mneVar.b, new bdj0(this, yjeVar, b9), 10);
                                return;
                            }
                            if (kbj0Var instanceof vaj0) {
                                ql5 ql5Var = ((vaj0) kbj0Var).f37091a;
                                if (ql5Var == null) {
                                    return;
                                }
                                sac.V(jiu0.a(this), new vcj0(this, (byte) 2), null, mneVar.b, new zye0(this, ql5Var, yjeVar, (byte) 25), 10);
                                return;
                            }
                            if (kbj0Var.equals(abj0.f583a)) {
                                G(bcj0Var);
                                return;
                            } else {
                                if (!kbj0Var.equals(ebj0.f7521a)) {
                                    t9f.b();
                                    return;
                                }
                                s31Var.p();
                                s64Var.e("details");
                                sac.V(jiu0.a(this), new vcj0(this, b5), null, mneVar.f22085a, new bdj0(this, yjeVar, b10), 10);
                                return;
                            }
                        }
                        int iOrdinal = ((ibj0) kbj0Var).f14490a.ordinal();
                        if (iOrdinal == 0) {
                            Q(nqh0.f23960a);
                            return;
                        }
                        if (iOrdinal == 1) {
                            s31Var.D();
                            i1w0Var.getClass();
                            CopyOnWriteArrayList copyOnWriteArrayList7 = new CopyOnWriteArrayList();
                            SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1 settingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1A2 = y3j0.a(y3j0Var);
                            if (settingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1A2 instanceof DialogScreen) {
                                copyOnWriteArrayList7.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) settingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1A2)));
                            } else {
                                copyOnWriteArrayList7.add(new c8d(y7d.f42146a, new w0w0(settingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1A2)));
                            }
                            ListIterator listIteratorO20 = b1j.o(i1w0Var, copyOnWriteArrayList7, 0);
                            while (true) {
                                paw pawVar23 = (paw) listIteratorO20;
                                if (!pawVar23.hasNext()) {
                                    return;
                                } else {
                                    i1w0Var.a((oe50) pawVar23.next());
                                }
                            }
                        } else {
                            if (iOrdinal == 2) {
                                P();
                                return;
                            }
                            if (iOrdinal == 3) {
                                s31Var.t();
                                i1w0Var.getClass();
                                CopyOnWriteArrayList copyOnWriteArrayList8 = new CopyOnWriteArrayList();
                                uuzVar.getClass();
                                MailingScreenFactoryImpl$getMailingManagementFragment$1 mailingScreenFactoryImpl$getMailingManagementFragment$2 = new MailingScreenFactoryImpl$getMailingManagementFragment$1();
                                if (mailingScreenFactoryImpl$getMailingManagementFragment$2 instanceof DialogScreen) {
                                    copyOnWriteArrayList8.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) mailingScreenFactoryImpl$getMailingManagementFragment$2)));
                                } else {
                                    copyOnWriteArrayList8.add(new c8d(y7d.f42146a, new w0w0(mailingScreenFactoryImpl$getMailingManagementFragment$2)));
                                }
                                ListIterator listIteratorO21 = b1j.o(i1w0Var, copyOnWriteArrayList8, 0);
                                while (true) {
                                    paw pawVar24 = (paw) listIteratorO21;
                                    if (!pawVar24.hasNext()) {
                                        return;
                                    } else {
                                        i1w0Var.a((oe50) pawVar24.next());
                                    }
                                }
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return;
                                }
                                i1w0Var.getClass();
                                CopyOnWriteArrayList copyOnWriteArrayList9 = new CopyOnWriteArrayList();
                                hfk0Var.getClass();
                                AuthHistoryScreenFactoryImpl$getScreen$1 authHistoryScreenFactoryImpl$getScreen$2 = new AuthHistoryScreenFactoryImpl$getScreen$1();
                                if (authHistoryScreenFactoryImpl$getScreen$2 instanceof DialogScreen) {
                                    copyOnWriteArrayList9.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) authHistoryScreenFactoryImpl$getScreen$2)));
                                } else {
                                    copyOnWriteArrayList9.add(new c8d(y7d.f42146a, new w0w0(authHistoryScreenFactoryImpl$getScreen$2)));
                                }
                                ListIterator listIteratorO22 = b1j.o(i1w0Var, copyOnWriteArrayList9, 0);
                                while (true) {
                                    paw pawVar25 = (paw) listIteratorO22;
                                    if (!pawVar25.hasNext()) {
                                        return;
                                    } else {
                                        i1w0Var.a((oe50) pawVar25.next());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
