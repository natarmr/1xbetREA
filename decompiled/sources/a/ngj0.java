package a;

import android.gov.nist.core.Separators;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.github.terrakok.cicerone.androidx.FragmentScreen$Companion$invoke$1;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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

/* JADX INFO: loaded from: classes5.dex */
public final class ngj0 extends i3t0 {
    public static final /* synthetic */ int Y0 = 0;
    public final jh70 A;
    public final bu90 A0;
    public final i1w0 B;
    public final gne0 B0;
    public final jw20 C;
    public final usd C0;
    public final cyh D;
    public final iw20 D0;
    public final z4w0 E;
    public final hs00 E0;
    public final uuz F;
    public final nhf0 F0;
    public final ctf0 G;
    public final rek0 G0;
    public final yox H;
    public final dyg0 H0;
    public final mne I;
    public final kwd I0;
    public final bzu J;
    public final tqx J0;
    public final ieu K;
    public final evz K0;
    public final abu L;
    public final hfk0 L0;
    public final rou M;
    public final im4 M0;
    public final x4u N;
    public final sff0 N0;
    public final svs0 O;
    public final boolean O0;
    public final l7k P;
    public final boolean P0;
    public final s64 Q;
    public wfj0 Q0;
    public final cmt R;
    public c4m0 R0;
    public final duj S;
    public bby S0;
    public final ivn T;
    public c4m0 T0;
    public final gxu U;
    public bby U0;
    public final wgu V;
    public bby V0;
    public final nh70 W;
    public bby W0;
    public final cl5 X;
    public final c4m0 X0;
    public final y3j0 Y;
    public final gle0 Z;
    public final cmt a0;
    public final j6m0 b0;
    public final zie0 c0;
    public final xuz d0;
    public final rl70 e0;
    public final f4u f0;
    public final s64 g0;
    public final au0 h0;
    public final s9m0 i0;
    public final phf0 j0;
    public final iqt k0;
    public final x1u l0;
    public final bbw0 m0;
    public final sqx n0;
    public final rjo o;
    public final nr00 o0;
    public final ojj p;
    public final nv20 p0;
    public final mi70 q;
    public final ubu q0;
    public final s31 r;
    public final zoi0 r0;
    public final m1e s;
    public final nrt s0;
    public final qgd t;
    public final nou t0;
    public final ahu u;
    public final nyb u0;
    public final v88 v;
    public final rkt0 v0;
    public final ieu w;
    public final yk50 w0;
    public final dzt x;
    public final zyt x0;
    public final ih5 y;
    public final p4u y0;
    public final y3v z;
    public final a6u z0;

    public ngj0(rjo rjoVar, ojj ojjVar, mi70 mi70Var, s31 s31Var, m1e m1eVar, qgd qgdVar, ahu ahuVar, final lbu lbuVar, v88 v88Var, ieu ieuVar, dzt dztVar, ih5 ih5Var, y3v y3vVar, jh70 jh70Var, i1w0 i1w0Var, jw20 jw20Var, final pru pruVar, final bzt bztVar, cyh cyhVar, z4w0 z4w0Var, uuz uuzVar, final ctf0 ctf0Var, yox yoxVar, mne mneVar, bzu bzuVar, ieu ieuVar2, abu abuVar, rou rouVar, x4u x4uVar, svs0 svs0Var, l7k l7kVar, s64 s64Var, cmt cmtVar, duj dujVar, final ivn ivnVar, gxu gxuVar, wgu wguVar, nh70 nh70Var, cl5 cl5Var, y3j0 y3j0Var, gle0 gle0Var, cmt cmtVar2, j6m0 j6m0Var, zie0 zie0Var, xuz xuzVar, rl70 rl70Var, f4u f4uVar, s64 s64Var2, au0 au0Var, s9m0 s9m0Var, phf0 phf0Var, final iqt iqtVar, x1u x1uVar, bbw0 bbw0Var, final sqx sqxVar, nr00 nr00Var, nv20 nv20Var, ubu ubuVar, zoi0 zoi0Var, nrt nrtVar, nou nouVar, jnk jnkVar, nyb nybVar, rkt0 rkt0Var, yk50 yk50Var, final zyt zytVar, p4u p4uVar, final czt cztVar, a6u a6uVar, bu90 bu90Var, sd60 sd60Var, zx10 zx10Var, gne0 gne0Var, final rqt rqtVar, usd usdVar, iw20 iw20Var, hs00 hs00Var, final rqt rqtVar2, String str, wpt wptVar, nhf0 nhf0Var, rek0 rek0Var, dyg0 dyg0Var, kwd kwdVar, tqx tqxVar, final yzn0 yzn0Var, final epc epcVar, evz evzVar, final ubu ubuVar2, hfk0 hfk0Var, im4 im4Var, final tqt tqtVar) {
        m1eVar.getClass();
        i1w0Var.getClass();
        ctf0Var.getClass();
        wguVar.getClass();
        Function0 function0 = new Function0(ubuVar2, ctf0Var, pruVar, bztVar, cztVar, lbuVar, sqxVar, ivnVar, zytVar, rqtVar, rqtVar2, yzn0Var, epcVar, tqtVar) { // from class: a.sfj0
            public final /* synthetic */ ubu b;
            public final /* synthetic */ ctf0 c;
            public final /* synthetic */ pru d;
            public final /* synthetic */ bzt e;
            public final /* synthetic */ czt f;
            public final /* synthetic */ lbu g;
            public final /* synthetic */ sqx h;
            public final /* synthetic */ ivn i;
            public final /* synthetic */ zyt j;
            public final /* synthetic */ yzn0 k;
            public final /* synthetic */ epc l;

            {
                this.k = yzn0Var;
                this.l = epcVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zA = this.f32121a.f15225a.a();
                boolean zA2 = this.b.a();
                String strA = this.c.b.a(R.string.settings, Arrays.copyOf(new Object[0], 0));
                sff0 sff0VarA = this.d.a();
                v8d v8dVarA = this.e.f3488a.a();
                k0j0 k0j0VarB = this.f.f5239a.b();
                boolean zJ = this.g.j();
                this.h.a();
                String strL = this.i.l();
                int iA = this.j.a();
                iun iunVar = iun.f15405a;
                boolean zM = this.k.m();
                boolean z = this.l.a().f13512a;
                v8dVarA.getClass();
                k0j0VarB.getClass();
                iunVar.getClass();
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return new pfj0(false, true, zA, "", strA, "", "", "", "", null, false, false, new jph0(0, 0, 0, lunVar, zrt0.d, "", false, ""), null, false, false, false, false, false, zA2, false, true, "", false, false, false, true, sff0VarA.e0, sff0VarA.g.r, sff0VarA.O, sff0VarA.N.i, sff0VarA.r0, sff0VarA, v8dVarA, k0j0VarB, zJ, strL, iA, iunVar, zM, false, false, 1, z);
            }
        };
        h0j0 h0j0Var = new h0j0(ctf0Var, (byte) 3);
        vs10 vs10Var = mneVar.c;
        super(null, function0, h0j0Var, cvm0.p(vs10Var, mneVar.f22085a), null);
        this.o = rjoVar;
        this.p = ojjVar;
        this.q = mi70Var;
        this.r = s31Var;
        this.s = m1eVar;
        this.t = qgdVar;
        this.u = ahuVar;
        this.v = v88Var;
        this.w = ieuVar;
        this.x = dztVar;
        this.y = ih5Var;
        this.z = y3vVar;
        this.A = jh70Var;
        this.B = i1w0Var;
        this.C = jw20Var;
        this.D = cyhVar;
        this.E = z4w0Var;
        this.F = uuzVar;
        this.G = ctf0Var;
        this.H = yoxVar;
        this.I = mneVar;
        this.J = bzuVar;
        this.K = ieuVar2;
        this.L = abuVar;
        this.M = rouVar;
        this.N = x4uVar;
        this.O = svs0Var;
        this.P = l7kVar;
        this.Q = s64Var;
        this.R = cmtVar;
        this.S = dujVar;
        this.T = ivnVar;
        this.U = gxuVar;
        this.V = wguVar;
        this.W = nh70Var;
        this.X = cl5Var;
        this.Y = y3j0Var;
        this.Z = gle0Var;
        this.a0 = cmtVar2;
        this.b0 = j6m0Var;
        this.c0 = zie0Var;
        this.d0 = xuzVar;
        this.e0 = rl70Var;
        this.f0 = f4uVar;
        this.g0 = s64Var2;
        this.h0 = au0Var;
        this.i0 = s9m0Var;
        this.j0 = phf0Var;
        this.k0 = iqtVar;
        this.l0 = x1uVar;
        this.m0 = bbw0Var;
        this.n0 = sqxVar;
        this.o0 = nr00Var;
        this.p0 = nv20Var;
        this.q0 = ubuVar;
        this.r0 = zoi0Var;
        this.s0 = nrtVar;
        this.t0 = nouVar;
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
        this.J0 = tqxVar;
        this.K0 = evzVar;
        this.L0 = hfk0Var;
        this.M0 = im4Var;
        sff0 sff0VarA = pruVar.a();
        this.N0 = sff0VarA;
        this.O0 = sff0VarA.e0;
        this.P0 = lbuVar.j();
        yje yjeVar = null;
        i3t0.K(this, null, null, new hhb0(this, yjeVar, (byte) 13), 3);
        e3c.n(this.X0);
        this.X0 = sac.T(new fnq(new xp90(im4Var.b(), (byte) 7), new hgj0(this, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), vs10Var), foe.h);
    }

    public final void M(boolean z) {
        int i;
        if (((pfj0) D()).P && 2 <= (i = ((pfj0) D()).Q) && i < 11 && z) {
            W();
            H(new mej0((byte) 16));
            return;
        }
        byte b = 0;
        yje yjeVar = null;
        if (((pfj0) D()).P && ((pfj0) D()).Q >= 11 && z) {
            H(new mej0((byte) 19));
            sac.V(jiu0.a(this), zfj0.f44304a, null, this.I.c, new agj0(this, yjeVar, b), 10);
            return;
        }
        this.F0.getClass();
        bby bbyVar = this.U0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.U0 = sac.i0(jiu0.a(this), "SettingsViewModel.checkUpdate", 3, 0L, null, null, new cgj0(this, z, yjeVar, b), null, null, new ij90((Object) this, z, (byte) 10), null, 732);
        } else if (z && ((pfj0) D()).P) {
            H(new mej0((byte) 20));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object N(zje zjeVar) {
        egj0 egj0Var;
        Object objD;
        if (zjeVar instanceof egj0) {
            egj0Var = (egj0) zjeVar;
            int i = egj0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                egj0Var.k = i - Integer.MIN_VALUE;
            } else {
                egj0Var = new egj0(this, zjeVar);
            }
        } else {
            egj0Var = new egj0(this, zjeVar);
        }
        egj0 egj0Var2 = egj0Var;
        Object obj = egj0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = egj0Var2.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            uen uenVar = wen.b;
            long jW0 = ibc.w0(5L, bfn.SECONDS);
            List listC = kotlin.collections.a.c(oqt0.class);
            kv kvVar = new kv(this, yjeVar, (byte) 20);
            egj0Var2.k = 1;
            objD = j0x.D(3, jW0, egj0Var2, "SettingsViewModel.getAuthorizedData", listC, kvVar);
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
            this.S.b(thA, new mej0((byte) 23));
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
        i1w0 i1w0Var = this.B;
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
        this.O.getClass();
        FragmentScreen twoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1 = new TwoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1();
        i1w0 i1w0Var = this.B;
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
            sac.V(jiu0.a(this), new huh0(this, uu4Var, (byte) 13), null, null, new qe5((Object) this, (Object) uu4Var, (yje) null, (byte) 17), 14);
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
        this.z.s(String.valueOf(errorCode));
        this.g0.h(errorCode);
        G(new j1j0(message));
    }

    public final void R() {
        bby bbyVar = this.S0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.S0 = sac.V(jiu0.a(this), new tfj0(this, (byte) 12), new ufj0(this, (byte) 2), null, new agj0(this, null, (byte) 3), 12);
        }
    }

    public final void S(nqh0 nqh0Var) {
        this.r.i();
        s64 s64Var = this.Q;
        b1j.v("acc_settings", s64Var.f31684a, 3246L);
        s64Var.e("safety_settings");
        this.B.d(new huh0(this, nqh0Var, (byte) 15));
    }

    public final void T(boolean z) {
        if (!z) {
            this.r.I();
            y1p y1pVar = y1p.MAIN;
            this.P.c("acc_settings");
        }
        sac.V(jiu0.a(this), new tfj0(this, (byte) 16), null, this.I.b, new cgj0(this, z, null, (byte) 1), 10);
    }

    public final void U(boolean z) {
        this.v0.g(z);
        this.r0.a(z);
        H(new cxi0((byte) 16, z));
    }

    public final void V() {
        i1w0 i1w0Var = this.B;
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
        bby bbyVar = this.W0;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.W0 = null;
        this.W0 = sac.f0(jiu0.a(this), 2L, TimeUnit.SECONDS, this.I.b, jgj0.f16483a, new tmg0(this, yjeVar, (byte) 11), 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        czi0 czi0Var = (czi0) obj;
        czi0Var.getClass();
        super.x(czi0Var);
        boolean z = czi0Var instanceof oyi0;
        byte b = 7;
        sff0 sff0Var = this.N0;
        byte b2 = 2;
        s31 s31Var = this.r;
        s64 s64Var = this.Q;
        i1w0 i1w0Var = this.B;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        mne mneVar = this.I;
        yje yjeVar = null;
        if (z) {
            hej0 hej0Var = ((oyi0) czi0Var).f26062a;
            if (hej0Var == null) {
                return;
            }
            boolean z2 = hej0Var instanceof sgj0;
            qgd qgdVar = this.t;
            if (z2) {
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
                if (hej0Var instanceof z7j0) {
                    G(t0j0.f33122a);
                    return;
                }
                if (hej0Var instanceof rgj0) {
                    i1w0Var.f("authenticatorChangedResultKey", new dxi0(this, (byte) 2));
                    s31Var.l();
                    s64Var.e("1xauth");
                    sac.V(jiu0.a(this), new tfj0(this, b), null, mneVar.c, new agj0(this, yjeVar, (byte) 5), 10);
                    return;
                }
                if (hej0Var instanceof vgj0) {
                    if (((pfj0) D()).c) {
                        S(nqh0.f23960a);
                        return;
                    } else {
                        G(new f1j0(vvi0.f38101a));
                        return;
                    }
                }
                if (hej0Var instanceof qgj0) {
                    if (!((pfj0) D()).c) {
                        G(new f1j0(vvi0.e));
                        return;
                    } else {
                        if (sff0Var.g.r == tsh0.GIFT) {
                            S(nqh0.b);
                            return;
                        }
                        s31Var.r();
                        s64Var.e("history");
                        i1w0Var.d(new tfj0(this, (byte) 1));
                        return;
                    }
                }
                if (hej0Var instanceof q7j0) {
                    if (!((pfj0) D()).c) {
                        G(new f1j0(vvi0.b));
                        return;
                    }
                    s31Var.D();
                    s64Var.e("transactions");
                    i1w0Var.d(new tfj0(this, (byte) 4));
                    return;
                }
                if (hej0Var instanceof tgj0) {
                    if (((pfj0) D()).c) {
                        i1w0Var.d(new tfj0(this, b2));
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
                    this.X.getClass();
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
                    this.e0.getClass();
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
                        if (!((pfj0) D()).c) {
                            G(new f1j0(vvi0.d));
                            return;
                        }
                        s31Var.t();
                        s64Var.e("mailing");
                        i1w0Var.d(new tfj0(this, (byte) 15));
                        return;
                    }
                    if (hej0Var instanceof n7j0) {
                        s31Var.o();
                        s64Var.e("dark_theme");
                        i1w0Var.getClass();
                        k0w0 k0w0Var4 = new k0w0(i1w0Var);
                        this.b0.getClass();
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
                        boolean z3 = hej0Var instanceof u7j0;
                        boolean z4 = this.P0;
                        if (z3) {
                            s31Var.q();
                            s64Var.e("gesture");
                            if (z4) {
                                return;
                            }
                            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                            this.c0.getClass();
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
                            this.K0.getClass();
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
                            this.h0.f1455a.a(xun.f41520a, 3155L);
                            i1w0Var.getClass();
                            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                            this.C.getClass();
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
                            k0w0.j(k0w0Var5, jgc.INSTANCE, new tfj0(this, (byte) 11));
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
                                    if (((pfj0) D()).v) {
                                        H(new cxi0((byte) 14, false));
                                        s31Var.E();
                                        s64Var.e("share");
                                        sac.V(jiu0.a(this), new tfj0(this, (byte) 6), new ufj0(this, (byte) 0), mneVar.c, new agj0(this, yjeVar, (byte) 8), 8);
                                        return;
                                    }
                                    return;
                                }
                                if (hej0Var instanceof v7j0) {
                                    s31Var.F();
                                    s64Var.e("qr_share");
                                    i1w0Var.getClass();
                                    k0w0 k0w0Var7 = new k0w0(i1w0Var);
                                    this.Z.getClass();
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
                                    s64Var.e("getting_started");
                                    if (z4) {
                                        return;
                                    }
                                    k0w0 k0w0VarI3 = cs0.i(i1w0Var, i1w0Var);
                                    this.d0.getClass();
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
                                    this.i0.getClass();
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
                                            sac.V(jiu0.a(this), new uki0(1, this.o, rjo.class, "log", "log(Ljava/lang/Throwable;)V", 0, (byte) 17), null, null, new agj0(this, yjeVar, (byte) 4), 14);
                                            return;
                                        } else {
                                            if (hej0Var instanceof g4k) {
                                                G(y0j0.f41808a);
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
            if (czi0Var instanceof nyi0) {
                rvs0 rvs0Var = ((nyi0) czi0Var).f24332a;
                boolean z5 = rvs0Var instanceof mvs0;
                a1j0 a1j0Var = a1j0.f73a;
                if (z5) {
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
                    this.z.s(String.valueOf(i));
                    this.g0.h(i);
                    G(new j1j0(str));
                    return;
                }
                if (!(rvs0Var instanceof nvs0)) {
                    if (rvs0Var instanceof qvs0) {
                        sac.V(jiu0.a(this), lgj0.f20011a, null, mneVar.b, new agj0(this, yjeVar, (byte) 11), 10);
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
            byte b3 = 3;
            if (czi0Var instanceof xyi0) {
                String str2 = ((xyi0) czi0Var).f41707a;
                if (this.k0.f15225a.a()) {
                    sac.V(jiu0.a(this), new tfj0(this, b3), null, mneVar.b, new bgj0(this, str2, yjeVar, (byte) 1), 10);
                    return;
                }
                bby bbyVar = this.V0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.V0 = i3t0.K(this, null, null, new gv60(this, str2, null, (byte) 13), 3);
                return;
            }
            if (czi0Var instanceof ayi0) {
                sac.V(jiu0.a(this), new wvi0((byte) 27), null, mneVar.c, new bgj0(this, ((ayi0) czi0Var).f1671a, yjeVar, objArr3 == true ? 1 : 0), 10);
                return;
            }
            byte b4 = 10;
            if (czi0Var instanceof byi0) {
                i1w0Var.d(new tfj0(this, b4));
                return;
            }
            if (czi0Var instanceof eyi0) {
                String str3 = sff0Var.O;
                if (str3.length() == 0) {
                    sac.V(jiu0.a(this), new tfj0(this, (byte) 14), null, mneVar.c, new agj0(this, yjeVar, b2), 10);
                    return;
                } else {
                    G(new u0j0(nsm0.l(str3, this.V.a())));
                    return;
                }
            }
            boolean z6 = czi0Var instanceof iyi0;
            ubu ubuVar = this.q0;
            if (z6) {
                H(new cxi0((byte) 11, ubuVar.a()));
                bby bbyVar2 = this.V0;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                    return;
                }
                return;
            }
            if (czi0Var instanceof jyi0) {
                this.E.a(((jyi0) czi0Var).f17362a);
                return;
            }
            if (czi0Var instanceof lyi0) {
                G(new q0j0(((pfj0) D()).d));
                return;
            }
            if (czi0Var instanceof qyi0) {
                V();
                return;
            }
            byte b5 = 9;
            if (czi0Var instanceof ryi0) {
                vdj0 vdj0Var = ((ryi0) czi0Var).f31317a;
                if (vdj0Var != null) {
                    if (vdj0Var instanceof udj0) {
                        s31Var.B();
                        s64Var.e("QR_auth");
                        boolean z7 = !ubuVar.a();
                        H(new cxi0((byte) 11, z7));
                        sac.V(jiu0.a(this), new tfj0(this, b5), null, null, new yfj0(this, z7, null), 14);
                        return;
                    }
                    if (vdj0Var instanceof tdj0) {
                        boolean z8 = !((tdj0) vdj0Var).b;
                        s31Var.k(z8);
                        s64Var.g(z8);
                        this.J0.a(z8);
                        H(new cxi0((byte) 13, z8));
                        return;
                    }
                }
                t9f.b();
                return;
            }
            if (czi0Var instanceof uyi0) {
                sac.V(jiu0.a(this), new tfj0(this, (byte) 5), null, mneVar.b, new agj0(this, yjeVar, (byte) 7), 10);
                return;
            }
            if (czi0Var instanceof yyi0) {
                V();
                return;
            }
            boolean z9 = czi0Var instanceof zxi0;
            ctf0 ctf0Var = this.G;
            if (z9) {
                zxi0 zxi0Var = (zxi0) czi0Var;
                double d = zxi0Var.f45160a;
                boolean z10 = zxi0Var.b;
                s31Var.m();
                s64Var.e("cash_clear");
                if (d < 0.1d) {
                    H(new s5h((byte) 6, "0.0 ".concat(ctf0Var.b.a(R.string.mega_bytes_abbreviated, Arrays.copyOf(new Object[0], 0))), (boolean) (objArr2 == true ? 1 : 0)));
                    return;
                }
                if (z10) {
                    G(p0j0.f26154a);
                    return;
                }
                H(new s5h((byte) 6, d + Separators.SP + ctf0Var.b.a(R.string.mega_bytes_abbreviated, Arrays.copyOf(new Object[0], 0)), true));
                return;
            }
            if (czi0Var instanceof pyi0) {
                if (((pfj0) D()).c) {
                    S(nqh0.f23960a);
                    return;
                } else {
                    G(new f1j0(vvi0.f38101a));
                    return;
                }
            }
            if (czi0Var instanceof fyi0) {
                i1w0Var.d(new tfj0(this, objArr == true ? 1 : 0));
                return;
            }
            if (czi0Var instanceof syi0) {
                int iOrdinal = ((syi0) czi0Var).f33025a.ordinal();
                if (iOrdinal == 0) {
                    S(nqh0.f23960a);
                    return;
                }
                byte b6 = 1;
                if (iOrdinal == 1) {
                    s31Var.D();
                    s64Var.e("transactions");
                    i1w0Var.d(new tfj0(this, (byte) 4));
                    return;
                } else {
                    if (iOrdinal == 2) {
                        i1w0Var.d(new tfj0(this, b2));
                        return;
                    }
                    if (iOrdinal == 3) {
                        s31Var.t();
                        s64Var.e("mailing");
                        i1w0Var.d(new tfj0(this, (byte) 15));
                        return;
                    } else {
                        if (iOrdinal != 4) {
                            t9f.b();
                            return;
                        }
                        s31Var.r();
                        s64Var.e("history");
                        i1w0Var.d(new tfj0(this, b6));
                        return;
                    }
                }
            }
            if (czi0Var instanceof cyi0) {
                ConfirmationNewPlaceResultType confirmationNewPlaceResultType = ((cyi0) czi0Var).f5177a;
                if (confirmationNewPlaceResultType instanceof ConfirmationNewPlaceResultType.Success) {
                    sac.V(jiu0.a(this), lgj0.f20011a, null, mneVar.b, new agj0(this, yjeVar, (byte) 11), 10);
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
            if (czi0Var instanceof zyi0) {
                R();
                c4m0 c4m0Var = this.T0;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.T0 = sac.T(new fnq(this.s.b(), new agj0(this, yjeVar, (byte) 10), (byte) 4), jiu0.a(this), kgj0.h);
                }
                c4m0 c4m0Var2 = this.R0;
                if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                    this.R0 = sac.T(new fnq(this.E0.a(), new yg1((Object) this, yjeVar, (byte) 27), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new tri0(b2, yjeVar, (byte) 4));
                    return;
                }
                return;
            }
            if (czi0Var instanceof azi0) {
                bby bbyVar3 = this.S0;
                if (bbyVar3 != null) {
                    bbyVar3.cancel(null);
                }
                c4m0 c4m0Var3 = this.T0;
                if (c4m0Var3 != null) {
                    c4m0Var3.cancel(null);
                }
                c4m0 c4m0Var4 = this.R0;
                if (c4m0Var4 != null) {
                    c4m0Var4.cancel(null);
                    return;
                }
                return;
            }
            if (czi0Var instanceof kyi0) {
                sac.V(jiu0.a(this), igj0.f14738a, null, mneVar.b, new agj0(this, yjeVar, (byte) 6), 10);
                return;
            }
            if (czi0Var instanceof bzi0) {
                sac.V(jiu0.a(this), mgj0.f21746a, null, mneVar.b, new agj0(this, yjeVar, (byte) 12), 10);
                return;
            }
            if (czi0Var instanceof gyi0) {
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar17 = (paw) listIteratorP2;
                    if (!pawVar17.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar17.next());
                    }
                }
            } else if (czi0Var instanceof myi0) {
                s31Var.p();
                s64Var.e("details");
                sac.V(jiu0.a(this), new tfj0(this, (byte) 17), null, mneVar.f22085a, new agj0(this, yjeVar, b5), 10);
            } else {
                if (!(czi0Var instanceof tyi0)) {
                    if (czi0Var instanceof dyi0) {
                        E();
                        return;
                    }
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var);
                PersonalScreen$PersonalDataScreen personalScreen$PersonalDataScreenJ = jh70.j(this.A, false);
                if (personalScreen$PersonalDataScreenJ instanceof DialogScreen) {
                    copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) personalScreen$PersonalDataScreenJ)));
                } else {
                    copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new w0w0(personalScreen$PersonalDataScreenJ)));
                }
                ListIterator listIteratorO16 = b1j.o(i1w0Var, copyOnWriteArrayListQ4, 0);
                while (true) {
                    paw pawVar18 = (paw) listIteratorO16;
                    if (!pawVar18.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar18.next());
                    }
                }
            }
        }
    }
}
