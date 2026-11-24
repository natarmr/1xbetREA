package a;

import android.gov.nist.core.Separators;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.github.terrakok.cicerone.androidx.FragmentScreen$Companion$invoke$1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.coef_type.impl.navigation.CoefTypeScreenFactoryImpl$getSettingsCoefTypeScreen$1;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.democonfig.impl.navigation.DemoConfigScreenFactoryImpl$getScannerDemoConfigScreen$1;
import org.xplatform.feature.office.social.impl.navigation.SocialScreenFactoryImpl$getSocialNetworksScreen$1;
import org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$TestSectionScreen;
import org.xplatform.features.notification_settings.impl.navigation.PushNotificationSettingsScreens$PushNotificationSettingsFragmentScreen;
import org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType;
import org.xplatform.login.new_place.api.navigation.SmsCodeExtras;
import org.xplatform.login.new_place.impl.navigation.ConfirmationNewPlaceScreen;
import org.xplatform.onboarding_section.impl.navigation.OnboardingScreens$OnboardingSectionsFragmentScreen;
import org.xplatform.personal.impl.navigation.PersonalScreen$PersonalDataScreen;
import org.xplatform.pin_code.impl.navigation.PinCodeScreensFactoryImpl$pinCodeSettingsScreen$1;
import org.xplatform.popular.settings.impl.navigation.PopularSettingsScreenFactoryImpl$getScreen$1;
import org.xplatform.proxy.navigation.ProxySettingsScreen;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;
import org.xplatform.security.impl.navigation.TwoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1;
import org.xplatform.shake.impl.navigation.HandShakeSettingsFragmentScreen;
import org.xplatform.share_app.impl.navigation.ShareAppScreens$ShareAppQrFragmentScreen;
import org.xplatform.sportgame.markets.display_settings.impl.navigation.MarketsDisplaySettingsScreenFactoryImpl$getScreen$1;
import org.xplatform.themesettings.impl.navigation.ThemeSettingsScreen$ThemeUiKitScreen;
import org.xplatform.wallet.impl.navigation.WalletsScreen$WalletsScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class xxi0 extends i3t0 {
    public static final /* synthetic */ int Y0 = 0;
    public final i1w0 A;
    public final bu90 A0;
    public final jw20 B;
    public final gne0 B0;
    public final cyh C;
    public final usd C0;
    public final z4w0 D;
    public final iw20 D0;
    public final uuz E;
    public final hs00 E0;
    public final ctf0 F;
    public final nhf0 F0;
    public final yox G;
    public final rek0 G0;
    public final mne H;
    public final dyg0 H0;
    public final bzu I;
    public final kwd I0;
    public final ieu J;
    public final im4 J0;
    public final abu K;
    public final tqx K0;
    public final rou L;
    public final evz L0;
    public final x4u M;
    public final hfk0 M0;
    public final svs0 N;
    public final sff0 N0;
    public final l7k O;
    public final boolean O0;
    public final s64 P;
    public final boolean P0;
    public final cmt Q;
    public fxi0 Q0;
    public final duj R;
    public bby R0;
    public final ivn S;
    public bby S0;
    public final gxu T;
    public bby T0;
    public final wgu U;
    public c4m0 U0;
    public final nh70 V;
    public bby V0;
    public final cl5 W;
    public c4m0 W0;
    public final y3j0 X;
    public final c4m0 X0;
    public final gle0 Y;
    public final cmt Z;
    public final j6m0 a0;
    public final zie0 b0;
    public final xuz c0;
    public final rl70 d0;
    public final f4u e0;
    public final s64 f0;
    public final au0 g0;
    public final s9m0 h0;
    public final tsu i0;
    public final iqt j0;
    public final x1u k0;
    public final bbw0 l0;
    public final sqx m0;
    public final nr00 n0;
    public final rjo o;
    public final nv20 o0;
    public final ojj p;
    public final ubu p0;
    public final mi70 q;
    public final zoi0 q0;
    public final s31 r;
    public final nrt r0;
    public final m1e s;
    public final nou s0;
    public final qgd t;
    public final ieu t0;
    public final ahu u;
    public final nyb u0;
    public final dzt v;
    public final rkt0 v0;
    public final v88 w;
    public final yk50 w0;
    public final ih5 x;
    public final zyt x0;
    public final y3v y;
    public final p4u y0;
    public final jh70 z;
    public final a6u z0;

    public xxi0(rjo rjoVar, ojj ojjVar, mi70 mi70Var, s31 s31Var, m1e m1eVar, qgd qgdVar, ahu ahuVar, lbu lbuVar, dzt dztVar, v88 v88Var, ih5 ih5Var, y3v y3vVar, jh70 jh70Var, i1w0 i1w0Var, jw20 jw20Var, pru pruVar, bzt bztVar, cyh cyhVar, z4w0 z4w0Var, uuz uuzVar, ctf0 ctf0Var, yox yoxVar, mne mneVar, bzu bzuVar, ieu ieuVar, abu abuVar, rou rouVar, x4u x4uVar, svs0 svs0Var, l7k l7kVar, s64 s64Var, cmt cmtVar, duj dujVar, ivn ivnVar, gxu gxuVar, wgu wguVar, nh70 nh70Var, cl5 cl5Var, y3j0 y3j0Var, gle0 gle0Var, cmt cmtVar2, j6m0 j6m0Var, zie0 zie0Var, xuz xuzVar, rl70 rl70Var, f4u f4uVar, s64 s64Var2, au0 au0Var, s9m0 s9m0Var, tsu tsuVar, iqt iqtVar, x1u x1uVar, bbw0 bbw0Var, sqx sqxVar, nr00 nr00Var, nv20 nv20Var, ubu ubuVar, zoi0 zoi0Var, nrt nrtVar, nou nouVar, ieu ieuVar2, jnk jnkVar, nyb nybVar, rkt0 rkt0Var, qho qhoVar, yk50 yk50Var, zyt zytVar, p4u p4uVar, czt cztVar, a6u a6uVar, bu90 bu90Var, sd60 sd60Var, zx10 zx10Var, gne0 gne0Var, rqt rqtVar, usd usdVar, iw20 iw20Var, hs00 hs00Var, rqt rqtVar2, String str, wpt wptVar, nhf0 nhf0Var, rek0 rek0Var, dyg0 dyg0Var, kwd kwdVar, im4 im4Var, tqx tqxVar, yzn0 yzn0Var, epc epcVar, evz evzVar, ubu ubuVar2, hfk0 hfk0Var, tqt tqtVar) {
        m1eVar.getClass();
        i1w0Var.getClass();
        ctf0Var.getClass();
        wguVar.getClass();
        axi0 axi0Var = new axi0(iqtVar, ubuVar2, ctf0Var, pruVar, bztVar, cztVar, lbuVar, sqxVar, ivnVar, zytVar, rqtVar, rqtVar2, yzn0Var, qhoVar, epcVar, tqtVar, (byte) 0);
        iv80 iv80Var = new iv80(ctf0Var, (byte) 29);
        vs10 vs10Var = mneVar.c;
        super(null, axi0Var, iv80Var, cvm0.p(vs10Var, mneVar.f22085a), null);
        this.o = rjoVar;
        this.p = ojjVar;
        this.q = mi70Var;
        this.r = s31Var;
        this.s = m1eVar;
        this.t = qgdVar;
        this.u = ahuVar;
        this.v = dztVar;
        this.w = v88Var;
        this.x = ih5Var;
        this.y = y3vVar;
        this.z = jh70Var;
        this.A = i1w0Var;
        this.B = jw20Var;
        this.C = cyhVar;
        this.D = z4w0Var;
        this.E = uuzVar;
        this.F = ctf0Var;
        this.G = yoxVar;
        this.H = mneVar;
        this.I = bzuVar;
        this.J = ieuVar;
        this.K = abuVar;
        this.L = rouVar;
        this.M = x4uVar;
        this.N = svs0Var;
        this.O = l7kVar;
        this.P = s64Var;
        this.Q = cmtVar;
        this.R = dujVar;
        this.S = ivnVar;
        this.T = gxuVar;
        this.U = wguVar;
        this.V = nh70Var;
        this.W = cl5Var;
        this.X = y3j0Var;
        this.Y = gle0Var;
        this.Z = cmtVar2;
        this.a0 = j6m0Var;
        this.b0 = zie0Var;
        this.c0 = xuzVar;
        this.d0 = rl70Var;
        this.e0 = f4uVar;
        this.f0 = s64Var2;
        this.g0 = au0Var;
        this.h0 = s9m0Var;
        this.i0 = tsuVar;
        this.j0 = iqtVar;
        this.k0 = x1uVar;
        this.l0 = bbw0Var;
        this.m0 = sqxVar;
        this.n0 = nr00Var;
        this.o0 = nv20Var;
        this.p0 = ubuVar;
        this.q0 = zoi0Var;
        this.r0 = nrtVar;
        this.s0 = nouVar;
        this.t0 = ieuVar2;
        this.u0 = nybVar;
        this.v0 = rkt0Var;
        this.w0 = yk50Var;
        this.x0 = zytVar;
        this.y0 = p4uVar;
        this.z0 = a6uVar;
        this.A0 = bu90Var;
        this.B0 = gne0Var;
        this.C0 = usdVar;
        this.D0 = iw20Var;
        this.E0 = hs00Var;
        this.F0 = nhf0Var;
        this.G0 = rek0Var;
        this.H0 = dyg0Var;
        this.I0 = kwdVar;
        this.J0 = im4Var;
        this.K0 = tqxVar;
        this.L0 = evzVar;
        this.M0 = hfk0Var;
        sff0 sff0VarA = pruVar.a();
        this.N0 = sff0VarA;
        this.O0 = sff0VarA.e0;
        this.P0 = lbuVar.j();
        yje yjeVar = null;
        i3t0.K(this, null, null, new hhb0(this, yjeVar, (byte) 11), 3);
        e3c.n(this.X0);
        this.X0 = sac.T(new fnq(new xp90(im4Var.b(), (byte) 4), new rxi0(this, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), vs10Var), foe.h);
    }

    public final void M(boolean z) {
        int i;
        if (((twi0) D()).R && 2 <= (i = ((twi0) D()).S) && i < 11 && z) {
            W();
            H(new kui0((byte) 5));
            return;
        }
        byte b = 0;
        yje yjeVar = null;
        if (((twi0) D()).R && ((twi0) D()).S >= 11 && z) {
            H(new kui0((byte) 15));
            sac.V(jiu0.a(this), ixi0.f15544a, null, this.H.c, new jxi0(this, yjeVar, b), 10);
            return;
        }
        this.F0.getClass();
        bby bbyVar = this.R0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.R0 = sac.i0(jiu0.a(this), "SettingsViewModel.checkUpdate", 3, 0L, null, null, new lxi0(this, z, yjeVar, b), null, null, new ij90((Object) this, z, (byte) 7), null, 732);
        } else if (z && ((twi0) D()).R) {
            H(new kui0((byte) 12));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object N(zje zjeVar) {
        nxi0 nxi0Var;
        Object objD;
        if (zjeVar instanceof nxi0) {
            nxi0Var = (nxi0) zjeVar;
            int i = nxi0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nxi0Var.k = i - Integer.MIN_VALUE;
            } else {
                nxi0Var = new nxi0(this, zjeVar);
            }
        } else {
            nxi0Var = new nxi0(this, zjeVar);
        }
        nxi0 nxi0Var2 = nxi0Var;
        Object obj = nxi0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = nxi0Var2.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            List listC = kotlin.collections.a.c(oqt0.class);
            uen uenVar = wen.b;
            long jW0 = ibc.w0(5L, bfn.SECONDS);
            lpp lppVar = new lpp((diu0) this, yjeVar, (byte) 5);
            nxi0Var2.k = 1;
            objD = j0x.D(3, jW0, nxi0Var2, "SettingsViewModel.getAuthorizedData", listC, lppVar);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objD = ((j0g0) obj).f15681a;
        }
        Throwable thA = j0g0.a(objD);
        if (thA != null) {
            this.R.b(thA, new kui0((byte) 11));
        }
        return Unit.f46060a;
    }

    public final void O(fn50 fn50Var) {
        ConfirmationNewPlaceScreenType smsCode;
        boolean z = fn50Var.d;
        String str = fn50Var.c;
        if (z) {
            this.u0.b(str);
        }
        String str2 = fn50Var.b;
        String str3 = fn50Var.f;
        if (z) {
            smsCode = new ConfirmationNewPlaceScreenType.Authenticator(str2, "REQUEST_CONFIRMATION_NEW_PLACE_KEY", str3, str);
        } else {
            smsCode = fn50Var.e ? new ConfirmationNewPlaceScreenType.SmsCode(str2, "REQUEST_CONFIRMATION_NEW_PLACE_KEY", str3, new SmsCodeExtras.FromAuthenticatorExtras("")) : new ConfirmationNewPlaceScreenType.Simple(str2, "REQUEST_CONFIRMATION_NEW_PLACE_KEY", str3, fn50Var.g);
        }
        i1w0 i1w0Var = this.A;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        this.I0.getClass();
        k0w0VarI.h(new ConfirmationNewPlaceScreen(smsCode));
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

    public final void P() {
        this.N.getClass();
        FragmentScreen twoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1 = new TwoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1();
        i1w0 i1w0Var = this.A;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        if (twoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1 instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) twoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(twoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1)));
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

    public final void Q(Throwable th, uu4 uu4Var) {
        if (th instanceof fn50) {
            O((fn50) th);
            return;
        }
        boolean z = th instanceof n64;
        a1j0 a1j0Var = a1j0.f73a;
        if (z) {
            G(a1j0Var);
            return;
        }
        if (th instanceof kj50) {
            P();
            return;
        }
        if (th instanceof k6a) {
            sac.V(jiu0.a(this), new huh0(this, uu4Var, (byte) 6), null, null, new qe5((Object) this, (Object) uu4Var, (yje) null, (byte) 14), 14);
            return;
        }
        if (!(th instanceof zhi0)) {
            this.p.c("Login error: " + th.getMessage(), th);
            G(a1j0Var);
            return;
        }
        zhi0 zhi0Var = (zhi0) th;
        int errorCode = zhi0Var.c.getErrorCode();
        String message = zhi0Var.getMessage();
        if (message == null) {
            message = "";
        }
        this.y.s(String.valueOf(errorCode));
        this.f0.h(errorCode);
        G(new j1j0(message));
    }

    public final void R() {
        bby bbyVar = this.V0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.V0 = sac.V(jiu0.a(this), new ywi0(this, (byte) 3), new zwi0(this, (byte) 0), null, new jxi0(this, null, (byte) 4), 12);
        }
    }

    public final void S(nqh0 nqh0Var) {
        this.r.i();
        s64 s64Var = this.P;
        b1j.v("acc_settings", s64Var.f31684a, 3246L);
        s64Var.e("safety_settings");
        this.A.d(new huh0(this, nqh0Var, (byte) 5));
    }

    public final void T(boolean z) {
        if (!z) {
            this.r.I();
            y1p y1pVar = y1p.MAIN;
            this.O.c("acc_settings");
        }
        sac.V(jiu0.a(this), new ywi0(this, (byte) 13), null, this.H.b, new lxi0(this, z, null, (byte) 1), 10);
    }

    public final void U(boolean z) {
        this.v0.g(z);
        this.q0.a(z);
        H(new cxi0((byte) 1, z));
    }

    public final void V() {
        i1w0 i1w0Var = this.A;
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

    public final void W() {
        bby bbyVar = this.T0;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.T0 = null;
        this.T0 = sac.f0(jiu0.a(this), 2L, TimeUnit.SECONDS, this.H.b, txi0.f34702a, new tmg0(this, yjeVar, (byte) 9), 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        final czi0 czi0Var = (czi0) obj;
        czi0Var.getClass();
        boolean z = czi0Var instanceof oyi0;
        byte b = 15;
        byte b2 = 8;
        qgd qgdVar = this.t;
        sff0 sff0Var = this.N0;
        s31 s31Var = this.r;
        s64 s64Var = this.P;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        i1w0 i1w0Var = this.A;
        mne mneVar = this.H;
        yje yjeVar = null;
        if (z) {
            hej0 hej0Var = ((oyi0) czi0Var).f26062a;
            if (hej0Var == null) {
                return;
            }
            if (hej0Var instanceof sgj0) {
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new f1w0(qgdVar.g0())), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                }
            } else if (hej0Var instanceof p7j0) {
                s31Var.x();
                s64Var.e("pin");
                i1w0Var.getClass();
                k0w0 k0w0Var = new k0w0(i1w0Var);
                this.A0.getClass();
                k0w0Var.h(new PinCodeScreensFactoryImpl$pinCodeSettingsScreen$1());
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            } else {
                if (hej0Var instanceof rgj0) {
                    i1w0Var.f("authenticatorChangedResultKey", new dxi0(this, (byte) 0));
                    s31Var.l();
                    s64Var.e("1xauth");
                    sac.V(jiu0.a(this), new ywi0(this, b2), null, mneVar.c, new jxi0(this, yjeVar, (byte) 6), 10);
                    return;
                }
                if (hej0Var instanceof vgj0) {
                    if (((twi0) D()).c) {
                        S(nqh0.f23960a);
                        return;
                    } else {
                        G(new f1j0(vvi0.f38101a));
                        return;
                    }
                }
                if (hej0Var instanceof qgj0) {
                    if (!((twi0) D()).c) {
                        G(new f1j0(vvi0.e));
                        return;
                    } else {
                        if (sff0Var.g.r == tsh0.GIFT) {
                            S(nqh0.b);
                            return;
                        }
                        s31Var.r();
                        s64Var.e("history");
                        i1w0Var.d(new ywi0(this, b));
                        return;
                    }
                }
                if (hej0Var instanceof q7j0) {
                    if (!((twi0) D()).c) {
                        G(new f1j0(vvi0.b));
                        return;
                    }
                    s31Var.D();
                    s64Var.e("transactions");
                    i1w0Var.d(new ywi0(this, objArr2 == true ? 1 : 0));
                    return;
                }
                if (hej0Var instanceof tgj0) {
                    if (((twi0) D()).c) {
                        i1w0Var.d(new ywi0(this, (byte) 2));
                        return;
                    } else {
                        G(new f1j0(vvi0.c));
                        return;
                    }
                }
                if (hej0Var instanceof vhj0) {
                    s31Var.n();
                    s64Var.e("coeff_type");
                    i1w0Var.getClass();
                    k0w0 k0w0Var2 = new k0w0(i1w0Var);
                    this.W.getClass();
                    k0w0Var2.h(new CoefTypeScreenFactoryImpl$getSettingsCoefTypeScreen$1());
                    ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0Var2.f17489a, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorO2;
                        if (!pawVar3.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar3.next());
                        }
                    }
                } else if (hej0Var instanceof s7j0) {
                    s31Var.A();
                    s64Var.e("push");
                    i1w0Var.getClass();
                    k0w0 k0w0Var3 = new k0w0(i1w0Var);
                    this.d0.getClass();
                    k0w0Var3.h(new PushNotificationSettingsScreens$PushNotificationSettingsFragmentScreen());
                    ListIterator listIteratorO3 = b1j.o(i1w0Var, k0w0Var3.f17489a, 0);
                    while (true) {
                        paw pawVar4 = (paw) listIteratorO3;
                        if (!pawVar4.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar4.next());
                        }
                    }
                } else {
                    if (hej0Var instanceof l7j0) {
                        if (!((twi0) D()).c) {
                            G(new f1j0(vvi0.d));
                            return;
                        }
                        s31Var.t();
                        s64Var.e("mailing");
                        i1w0Var.d(new ywi0(this, (byte) 16));
                        return;
                    }
                    if (hej0Var instanceof n7j0) {
                        s31Var.o();
                        s64Var.e("dark_theme");
                        i1w0Var.getClass();
                        k0w0 k0w0Var4 = new k0w0(i1w0Var);
                        this.a0.getClass();
                        k0w0Var4.h(new ThemeSettingsScreen$ThemeUiKitScreen());
                        ListIterator listIteratorO4 = b1j.o(i1w0Var, k0w0Var4.f17489a, 0);
                        while (true) {
                            paw pawVar5 = (paw) listIteratorO4;
                            if (!pawVar5.hasNext()) {
                                return;
                            } else {
                                i1w0Var.a((oe50) pawVar5.next());
                            }
                        }
                    } else if (hej0Var instanceof r7j0) {
                        s31Var.y();
                        s64Var.e("popular");
                        i1w0Var.getClass();
                        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                        PopularSettingsScreenFactoryImpl$getScreen$1 popularSettingsScreenFactoryImpl$getScreen$1S = qgdVar.S();
                        if (popularSettingsScreenFactoryImpl$getScreen$1S instanceof DialogScreen) {
                            copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) popularSettingsScreenFactoryImpl$getScreen$1S)));
                        } else {
                            copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(popularSettingsScreenFactoryImpl$getScreen$1S)));
                        }
                        ListIterator listIteratorO5 = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                        while (true) {
                            paw pawVar6 = (paw) listIteratorO5;
                            if (!pawVar6.hasNext()) {
                                return;
                            } else {
                                i1w0Var.a((oe50) pawVar6.next());
                            }
                        }
                    } else {
                        boolean z2 = hej0Var instanceof u7j0;
                        boolean z3 = this.P0;
                        if (z2) {
                            s31Var.q();
                            s64Var.e("gesture");
                            if (z3) {
                                return;
                            }
                            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                            this.b0.getClass();
                            k0w0VarI.h(new HandShakeSettingsFragmentScreen());
                            ListIterator listIteratorO6 = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                            while (true) {
                                paw pawVar7 = (paw) listIteratorO6;
                                if (!pawVar7.hasNext()) {
                                    return;
                                } else {
                                    i1w0Var.a((oe50) pawVar7.next());
                                }
                            }
                        } else if (hej0Var instanceof m7j0) {
                            k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
                            this.L0.getClass();
                            k0w0VarI2.h(new MarketsDisplaySettingsScreenFactoryImpl$getScreen$1());
                            ListIterator listIteratorO7 = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
                            while (true) {
                                paw pawVar8 = (paw) listIteratorO7;
                                if (!pawVar8.hasNext()) {
                                    return;
                                } else {
                                    i1w0Var.a((oe50) pawVar8.next());
                                }
                            }
                        } else if (hej0Var instanceof a8j0) {
                            s31Var.f31532a.c("widget_fastaccess_setup");
                            this.g0.f1455a.a(xun.f41520a, 3155L);
                            i1w0Var.getClass();
                            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                            this.B.getClass();
                            FragmentScreen$Companion$invoke$1 fragmentScreen$Companion$invoke$1S = ydx.S();
                            if (fragmentScreen$Companion$invoke$1S instanceof DialogScreen) {
                                copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen$Companion$invoke$1S)));
                            } else {
                                copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen$Companion$invoke$1S)));
                            }
                            ListIterator listIteratorO8 = b1j.o(i1w0Var, copyOnWriteArrayList2, 0);
                            while (true) {
                                paw pawVar9 = (paw) listIteratorO8;
                                if (!pawVar9.hasNext()) {
                                    return;
                                } else {
                                    i1w0Var.a((oe50) pawVar9.next());
                                }
                            }
                        } else if (hej0Var instanceof k7j0) {
                            s31Var.s();
                            s64Var.e("language");
                            i1w0Var.getClass();
                            k0w0 k0w0Var5 = new k0w0(i1w0Var);
                            k0w0.j(k0w0Var5, jgc.INSTANCE, new ywi0(this, (byte) 10));
                            ListIterator listIteratorO9 = b1j.o(i1w0Var, k0w0Var5.f17489a, 0);
                            while (true) {
                                paw pawVar10 = (paw) listIteratorO9;
                                if (!pawVar10.hasNext()) {
                                    return;
                                } else {
                                    i1w0Var.a((oe50) pawVar10.next());
                                }
                            }
                        } else {
                            if (hej0Var instanceof g7j0) {
                                s31Var.u();
                                s64Var.e("mirror");
                                G(new m1j0(sff0Var.O.length() > 0));
                                return;
                            }
                            if (hej0Var instanceof ugj0) {
                                s31Var.z();
                                s64Var.e("proxy");
                                i1w0Var.getClass();
                                CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
                                qgdVar.getClass();
                                ProxySettingsScreen proxySettingsScreen = new ProxySettingsScreen();
                                if (proxySettingsScreen instanceof DialogScreen) {
                                    copyOnWriteArrayList3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) proxySettingsScreen)));
                                } else {
                                    copyOnWriteArrayList3.add(new c8d(y7d.f42146a, new w0w0(proxySettingsScreen)));
                                }
                                ListIterator listIteratorO10 = b1j.o(i1w0Var, copyOnWriteArrayList3, 0);
                                while (true) {
                                    paw pawVar11 = (paw) listIteratorO10;
                                    if (!pawVar11.hasNext()) {
                                        return;
                                    } else {
                                        i1w0Var.a((oe50) pawVar11.next());
                                    }
                                }
                            } else if (hej0Var instanceof x7j0) {
                                s31Var.C();
                                s64Var.e("social_media");
                                i1w0Var.getClass();
                                k0w0 k0w0Var6 = new k0w0(i1w0Var);
                                this.B0.getClass();
                                k0w0Var6.h(new SocialScreenFactoryImpl$getSocialNetworksScreen$1());
                                ListIterator listIteratorO11 = b1j.o(i1w0Var, k0w0Var6.f17489a, 0);
                                while (true) {
                                    paw pawVar12 = (paw) listIteratorO11;
                                    if (!pawVar12.hasNext()) {
                                        return;
                                    } else {
                                        i1w0Var.a((oe50) pawVar12.next());
                                    }
                                }
                            } else {
                                if (hej0Var instanceof t7j0) {
                                    G(v0j0.f36583a);
                                    return;
                                }
                                if (hej0Var instanceof w7j0) {
                                    if (((twi0) D()).w) {
                                        H(new obg((byte) 29, false));
                                        s31Var.E();
                                        s64Var.e("share");
                                        byte b3 = 9;
                                        sac.V(jiu0.a(this), new ywi0(this, b3), new zwi0(this, (byte) 2), mneVar.c, new jxi0(this, yjeVar, b3), 8);
                                        return;
                                    }
                                    return;
                                }
                                if (hej0Var instanceof v7j0) {
                                    s31Var.F();
                                    s64Var.e("qr_share");
                                    i1w0Var.getClass();
                                    k0w0 k0w0Var7 = new k0w0(i1w0Var);
                                    this.Y.getClass();
                                    k0w0Var7.h(new ShareAppScreens$ShareAppQrFragmentScreen());
                                    ListIterator listIteratorO12 = b1j.o(i1w0Var, k0w0Var7.f17489a, 0);
                                    while (true) {
                                        paw pawVar13 = (paw) listIteratorO12;
                                        if (!pawVar13.hasNext()) {
                                            return;
                                        } else {
                                            i1w0Var.a((oe50) pawVar13.next());
                                        }
                                    }
                                } else if (hej0Var instanceof o7j0) {
                                    s31Var.v();
                                    s64Var.e("getting_started");
                                    if (z3) {
                                        return;
                                    }
                                    k0w0 k0w0VarI3 = cs0.i(i1w0Var, i1w0Var);
                                    this.c0.getClass();
                                    k0w0VarI3.h(new OnboardingScreens$OnboardingSectionsFragmentScreen());
                                    ListIterator listIteratorO13 = b1j.o(i1w0Var, k0w0VarI3.f17489a, 0);
                                    while (true) {
                                        paw pawVar14 = (paw) listIteratorO13;
                                        if (!pawVar14.hasNext()) {
                                            return;
                                        } else {
                                            i1w0Var.a((oe50) pawVar14.next());
                                        }
                                    }
                                } else if (hej0Var instanceof y7j0) {
                                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                                    this.h0.getClass();
                                    TestSectionScreen$TestSectionScreen testSectionScreen$TestSectionScreen = new TestSectionScreen$TestSectionScreen();
                                    if (testSectionScreen$TestSectionScreen instanceof DialogScreen) {
                                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) testSectionScreen$TestSectionScreen)));
                                    } else {
                                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(testSectionScreen$TestSectionScreen)));
                                    }
                                    ListIterator listIteratorO14 = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
                                    while (true) {
                                        paw pawVar15 = (paw) listIteratorO14;
                                        if (!pawVar15.hasNext()) {
                                            return;
                                        } else {
                                            i1w0Var.a((oe50) pawVar15.next());
                                        }
                                    }
                                } else {
                                    if (hej0Var instanceof nzi0) {
                                        M(true);
                                        return;
                                    }
                                    if (hej0Var instanceof h7j0) {
                                        G(new o0j0(true));
                                        return;
                                    }
                                    if (hej0Var instanceof mv00) {
                                        G(e1j0.f7038a);
                                        return;
                                    }
                                    if (hej0Var instanceof hzi0) {
                                        G(r0j0.f29633a);
                                        return;
                                    }
                                    if (!(hej0Var instanceof i7j0)) {
                                        if (hej0Var instanceof j7j0) {
                                            sac.V(jiu0.a(this), new uki0(1, this.o, rjo.class, "log", "log(Ljava/lang/Throwable;)V", 0, (byte) 5), null, null, new jxi0(this, yjeVar, (byte) 5), 14);
                                            return;
                                        } else if (hej0Var instanceof g4k) {
                                            G(y0j0.f41808a);
                                            return;
                                        } else {
                                            if (hej0Var instanceof z7j0) {
                                                G(t0j0.f33122a);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    k0w0 k0w0VarI4 = cs0.i(i1w0Var, i1w0Var);
                                    this.C0.getClass();
                                    k0w0VarI4.h(new DemoConfigScreenFactoryImpl$getScannerDemoConfigScreen$1());
                                    ListIterator listIteratorO15 = b1j.o(i1w0Var, k0w0VarI4.f17489a, 0);
                                    while (true) {
                                        paw pawVar16 = (paw) listIteratorO15;
                                        if (!pawVar16.hasNext()) {
                                            return;
                                        } else {
                                            i1w0Var.a((oe50) pawVar16.next());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (czi0Var instanceof wyi0) {
                T(true);
                return;
            }
            if (czi0Var instanceof vyi0) {
                T(false);
                return;
            }
            byte b4 = 12;
            if (czi0Var instanceof nyi0) {
                rvs0 rvs0Var = ((nyi0) czi0Var).f24332a;
                boolean z4 = rvs0Var instanceof mvs0;
                a1j0 a1j0Var = a1j0.f73a;
                if (z4) {
                    G(a1j0Var);
                    return;
                }
                if (rvs0Var instanceof ovs0) {
                    ovs0 ovs0Var = (ovs0) rvs0Var;
                    O(new fn50(ovs0Var.f25940a, ovs0Var.b, ovs0Var.c, ovs0Var.f, ovs0Var.d, ovs0Var.e, ovs0Var.g));
                    return;
                }
                if (rvs0Var instanceof pvs0) {
                    pvs0 pvs0Var = (pvs0) rvs0Var;
                    int i = pvs0Var.f27677a;
                    String str = pvs0Var.b;
                    this.y.s(String.valueOf(i));
                    this.f0.h(i);
                    G(new j1j0(str));
                    return;
                }
                if (!(rvs0Var instanceof nvs0)) {
                    if (rvs0Var instanceof qvs0) {
                        sac.V(jiu0.a(this), vxi0.f38200a, null, mneVar.b, new jxi0(this, yjeVar, b4), 10);
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                Class cls = ((nvs0) rvs0Var).f24202a;
                if (cls.equals(n64.class)) {
                    G(a1j0Var);
                    return;
                } else if (cls.equals(kj50.class)) {
                    P();
                    return;
                } else {
                    G(a1j0Var);
                    return;
                }
            }
            if (czi0Var instanceof xyi0) {
                String str2 = ((xyi0) czi0Var).f41707a;
                if (this.j0.f15225a.a()) {
                    sac.V(jiu0.a(this), new ywi0(this, (byte) 5), null, mneVar.b, new kxi0(this, str2, yjeVar, (byte) 2), 10);
                    return;
                }
                bby bbyVar = this.S0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.S0 = sac.V(jiu0.a(this), oxi0.f26014a, null, null, new kxi0(this, str2, yjeVar, (byte) 1), 14);
                return;
            }
            if (czi0Var instanceof ayi0) {
                sac.V(jiu0.a(this), new wvi0((byte) 5), null, mneVar.c, new kxi0(this, ((ayi0) czi0Var).f1671a, yjeVar, objArr == true ? 1 : 0), 10);
                return;
            }
            if (czi0Var instanceof byi0) {
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, new q0w0(null)), i1w0Var, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar17 = (paw) listIteratorP2;
                    if (!pawVar17.hasNext()) {
                        i1w0Var.d(new ywi0(this, (byte) 1));
                        return;
                    }
                    i1w0Var.a((oe50) pawVar17.next());
                }
            } else {
                byte b5 = 3;
                if (czi0Var instanceof eyi0) {
                    String str3 = sff0Var.O;
                    if (str3.length() == 0) {
                        sac.V(jiu0.a(this), new ywi0(this, (byte) 14), null, mneVar.c, new jxi0(this, yjeVar, b5), 10);
                        return;
                    } else {
                        G(new u0j0(nsm0.l(str3, this.U.a())));
                        return;
                    }
                }
                boolean z5 = czi0Var instanceof iyi0;
                ubu ubuVar = this.p0;
                if (z5) {
                    H(new obg((byte) 26, ubuVar.a()));
                    bby bbyVar2 = this.S0;
                    if (bbyVar2 != null) {
                        bbyVar2.cancel(null);
                        return;
                    }
                    return;
                }
                if (czi0Var instanceof jyi0) {
                    this.D.a(((jyi0) czi0Var).f17362a);
                    return;
                }
                if (czi0Var instanceof lyi0) {
                    G(new q0j0(((twi0) D()).d));
                    return;
                }
                if (czi0Var instanceof qyi0) {
                    V();
                    return;
                }
                byte b6 = 7;
                if (czi0Var instanceof ryi0) {
                    vdj0 vdj0Var = ((ryi0) czi0Var).f31317a;
                    if (vdj0Var != null) {
                        if (vdj0Var instanceof udj0) {
                            s31Var.B();
                            s64Var.e("QR_auth");
                            boolean z6 = !ubuVar.a();
                            H(new obg((byte) 26, z6));
                            sac.V(jiu0.a(this), new ywi0(this, b6), null, null, new hxi0(this, z6, null), 14);
                            return;
                        }
                        if (vdj0Var instanceof tdj0) {
                            boolean z7 = ((tdj0) vdj0Var).b;
                            s31Var.k(z7);
                            s64Var.g(z7);
                            this.K0.a(z7);
                            H(new obg((byte) 27, z7));
                            return;
                        }
                    }
                    t9f.b();
                    return;
                }
                if (czi0Var instanceof uyi0) {
                    sac.V(jiu0.a(this), new ywi0(this, (byte) 17), null, mneVar.b, new jxi0(this, yjeVar, b2), 10);
                    return;
                }
                if (czi0Var instanceof yyi0) {
                    V();
                    return;
                }
                boolean z8 = czi0Var instanceof zxi0;
                byte b7 = 4;
                ctf0 ctf0Var = this.F;
                if (z8) {
                    zxi0 zxi0Var = (zxi0) czi0Var;
                    double d = zxi0Var.f45160a;
                    boolean z9 = zxi0Var.b;
                    s31Var.m();
                    s64Var.e("cash_clear");
                    if (d < 0.1d) {
                        H(new s5h(b7, "0.0 ".concat(ctf0Var.b.a(R.string.mega_bytes_abbreviated, Arrays.copyOf(new Object[0], 0))), false));
                        return;
                    }
                    if (z9) {
                        G(p0j0.f26154a);
                        return;
                    }
                    H(new s5h(b7, d + Separators.SP + ctf0Var.b.a(R.string.mega_bytes_abbreviated, Arrays.copyOf(new Object[0], 0)), true));
                    return;
                }
                if (czi0Var instanceof fyi0) {
                    i1w0Var.d(new ywi0(this, b7));
                    return;
                }
                if (czi0Var instanceof syi0) {
                    int iOrdinal = ((syi0) czi0Var).f33025a.ordinal();
                    if (iOrdinal == 0) {
                        S(nqh0.f23960a);
                        return;
                    }
                    if (iOrdinal == 1) {
                        s31Var.D();
                        s64Var.e("transactions");
                        i1w0Var.d(new ywi0(this, (byte) 0));
                        return;
                    } else {
                        if (iOrdinal == 2) {
                            i1w0Var.d(new ywi0(this, (byte) 2));
                            return;
                        }
                        if (iOrdinal == 3) {
                            s31Var.t();
                            s64Var.e("mailing");
                            i1w0Var.d(new ywi0(this, (byte) 16));
                            return;
                        } else {
                            if (iOrdinal != 4) {
                                t9f.b();
                                return;
                            }
                            s31Var.r();
                            s64Var.e("history");
                            i1w0Var.d(new ywi0(this, (byte) 15));
                            return;
                        }
                    }
                }
                if (czi0Var instanceof cyi0) {
                    ConfirmationNewPlaceResultType confirmationNewPlaceResultType = ((cyi0) czi0Var).f5177a;
                    if (confirmationNewPlaceResultType instanceof ConfirmationNewPlaceResultType.Success) {
                        sac.V(jiu0.a(this), vxi0.f38200a, null, mneVar.b, new jxi0(this, yjeVar, (byte) 12), 10);
                        return;
                    } else if (confirmationNewPlaceResultType instanceof ConfirmationNewPlaceResultType.Error) {
                        G(new i1j0(ctf0Var.b.a(R.string.authorization_error, Arrays.copyOf(new Object[0], 0))));
                        return;
                    } else {
                        if (confirmationNewPlaceResultType instanceof ConfirmationNewPlaceResultType.Canceled) {
                            return;
                        }
                        t9f.b();
                        return;
                    }
                }
                if (czi0Var instanceof kyi0) {
                    sac.V(jiu0.a(this), sxi0.f32979a, null, mneVar.b, new jxi0(this, yjeVar, b6), 10);
                    return;
                }
                if (czi0Var instanceof bzi0) {
                    sac.V(jiu0.a(this), wxi0.f39933a, null, mneVar.b, new jxi0(this, yjeVar, (byte) 13), 10);
                    return;
                }
                if (czi0Var instanceof gyi0) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var);
                    ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ4, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ4, 0);
                    while (true) {
                        paw pawVar18 = (paw) listIteratorP3;
                        if (!pawVar18.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar18.next());
                        }
                    }
                } else if (czi0Var instanceof tyi0) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var);
                    PersonalScreen$PersonalDataScreen personalScreen$PersonalDataScreenJ = jh70.j(this.z, false);
                    if (personalScreen$PersonalDataScreenJ instanceof DialogScreen) {
                        copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) personalScreen$PersonalDataScreenJ)));
                    } else {
                        copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new w0w0(personalScreen$PersonalDataScreenJ)));
                    }
                    ListIterator listIteratorO16 = b1j.o(i1w0Var, copyOnWriteArrayListQ5, 0);
                    while (true) {
                        paw pawVar19 = (paw) listIteratorO16;
                        if (!pawVar19.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar19.next());
                        }
                    }
                } else {
                    if (!(czi0Var instanceof yxi0)) {
                        byte b8 = 11;
                        if (czi0Var instanceof zyi0) {
                            R();
                            c4m0 c4m0Var = this.W0;
                            if (c4m0Var == null || !c4m0Var.isActive()) {
                                this.W0 = sac.T(new fnq(this.s.b(), new jxi0(this, yjeVar, b8), (byte) 4), jiu0.a(this), uxi0.h);
                            }
                            c4m0 c4m0Var2 = this.U0;
                            if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                                this.U0 = sac.T(new fnq(this.E0.a(), new yg1((Object) this, yjeVar, (byte) 24), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new tri0(2, yjeVar, (byte) 1));
                                return;
                            }
                            return;
                        }
                        if (czi0Var instanceof myi0) {
                            s31Var.p();
                            s64Var.e("details");
                            sac.V(jiu0.a(this), new ywi0(this, b8), null, mneVar.f22085a, new jxi0(this, yjeVar, (byte) 10), 10);
                            return;
                        }
                        if (czi0Var instanceof azi0) {
                            bby bbyVar3 = this.V0;
                            if (bbyVar3 != null) {
                                bbyVar3.cancel(null);
                            }
                            c4m0 c4m0Var3 = this.W0;
                            if (c4m0Var3 != null) {
                                c4m0Var3.cancel(null);
                            }
                            c4m0 c4m0Var4 = this.U0;
                            if (c4m0Var4 != null) {
                                c4m0Var4.cancel(null);
                                return;
                            }
                            return;
                        }
                        if (!(czi0Var instanceof hyi0)) {
                            if (czi0Var instanceof dyi0) {
                                E();
                                return;
                            }
                            return;
                        }
                        final List list = ((twi0) D()).j;
                        if (list.contains(((hyi0) czi0Var).f13861a)) {
                            final byte b9 = 0;
                            H(new Function2() { // from class: a.xwi0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    byte b10 = b9;
                                    czi0 czi0Var2 = czi0Var;
                                    List list2 = list;
                                    switch (b10) {
                                        case 0:
                                            twi0 twi0Var = (twi0) obj3;
                                            ((oyg0) obj2).getClass();
                                            twi0Var.getClass();
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj4 : list2) {
                                                if (((g9) obj4) != ((hyi0) czi0Var2).f13861a) {
                                                    arrayList.add(obj4);
                                                }
                                            }
                                            return twi0.a(twi0Var, false, false, null, null, null, null, null, null, arrayList, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, false, 0, -513, 2097151);
                                        default:
                                            twi0 twi0Var2 = (twi0) obj3;
                                            ((oyg0) obj2).getClass();
                                            twi0Var2.getClass();
                                            return twi0.a(twi0Var2, false, false, null, null, null, null, null, null, CollectionsKt.r0(list2, ((hyi0) czi0Var2).f13861a), null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, false, 0, -513, 2097151);
                                    }
                                }
                            });
                            return;
                        } else {
                            final byte b10 = 1;
                            H(new Function2() { // from class: a.xwi0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    byte b11 = b10;
                                    czi0 czi0Var2 = czi0Var;
                                    List list2 = list;
                                    switch (b11) {
                                        case 0:
                                            twi0 twi0Var = (twi0) obj3;
                                            ((oyg0) obj2).getClass();
                                            twi0Var.getClass();
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj4 : list2) {
                                                if (((g9) obj4) != ((hyi0) czi0Var2).f13861a) {
                                                    arrayList.add(obj4);
                                                }
                                            }
                                            return twi0.a(twi0Var, false, false, null, null, null, null, null, null, arrayList, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, false, 0, -513, 2097151);
                                        default:
                                            twi0 twi0Var2 = (twi0) obj3;
                                            ((oyg0) obj2).getClass();
                                            twi0Var2.getClass();
                                            return twi0.a(twi0Var2, false, false, null, null, null, null, null, null, CollectionsKt.r0(list2, ((hyi0) czi0Var2).f13861a), null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, false, 0, -513, 2097151);
                                    }
                                }
                            });
                            return;
                        }
                    }
                    i1w0Var.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList4 = new CopyOnWriteArrayList();
                    qgdVar.getClass();
                    WalletsScreen$WalletsScreen walletsScreen$WalletsScreen = new WalletsScreen$WalletsScreen("");
                    if (walletsScreen$WalletsScreen instanceof DialogScreen) {
                        copyOnWriteArrayList4.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) walletsScreen$WalletsScreen)));
                    } else {
                        copyOnWriteArrayList4.add(new c8d(y7d.f42146a, new w0w0(walletsScreen$WalletsScreen)));
                    }
                    ListIterator listIteratorO17 = b1j.o(i1w0Var, copyOnWriteArrayList4, 0);
                    while (true) {
                        paw pawVar20 = (paw) listIteratorO17;
                        if (!pawVar20.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar20.next());
                        }
                    }
                }
            }
        }
    }
}
