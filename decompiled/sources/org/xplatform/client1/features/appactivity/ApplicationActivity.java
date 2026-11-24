package org.xplatform.client1.features.appactivity;

import a.a8z;
import a.af3;
import a.ahb;
import a.ahk;
import a.aoq;
import a.b1j;
import a.ba50;
import a.bby;
import a.bcm0;
import a.blx;
import a.blz;
import a.bmd;
import a.by5;
import a.c00;
import a.c1d0;
import a.c9o0;
import a.coh;
import a.ct3;
import a.ctf0;
import a.cu3;
import a.d5c;
import a.da50;
import a.df1;
import a.dhg0;
import a.diu0;
import a.djv0;
import a.dnq;
import a.dy2;
import a.ejc;
import a.evv0;
import a.f8;
import a.fbc;
import a.fet;
import a.fnq;
import a.fu3;
import a.fwk;
import a.fwv0;
import a.g390;
import a.g860;
import a.gd3;
import a.gku0;
import a.glz;
import a.gmq;
import a.gne;
import a.gu3;
import a.h2r;
import a.hd3;
import a.hny;
import a.hs00;
import a.hsv0;
import a.hu3;
import a.i120;
import a.i1w0;
import a.i620;
import a.ib50;
import a.igu0;
import a.imt0;
import a.iqt;
import a.iyg0;
import a.j120;
import a.j5d;
import a.jf4;
import a.jgu0;
import a.jhg0;
import a.jie0;
import a.jiu0;
import a.jkf0;
import a.jlx;
import a.juy;
import a.kiu0;
import a.kr3;
import a.kt2;
import a.kuy;
import a.ldj;
import a.lkd;
import a.lkz;
import a.lmi0;
import a.lo3;
import a.lr3;
import a.lt3;
import a.m0x0;
import a.m1e;
import a.maz;
import a.mbl;
import a.md3;
import a.mjn;
import a.mne;
import a.mvv0;
import a.ndk0;
import a.nkb;
import a.nu3;
import a.o4u0;
import a.o5d0;
import a.oeg0;
import a.ofm0;
import a.ol60;
import a.or3;
import a.ou3;
import a.owp0;
import a.p7m0;
import a.pd;
import a.pek0;
import a.pkd;
import a.pru;
import a.pu3;
import a.pz40;
import a.q33;
import a.q7x0;
import a.qem0;
import a.qhv0;
import a.qjj;
import a.qu3;
import a.qz40;
import a.r58;
import a.rdj;
import a.rgu;
import a.rgu0;
import a.rn;
import a.rs3;
import a.ru3;
import a.rv00;
import a.rwj;
import a.rwq0;
import a.s6t0;
import a.s8i;
import a.s9m0;
import a.sac;
import a.shk;
import a.sik;
import a.sjs;
import a.slb;
import a.sly;
import a.sn;
import a.sqx;
import a.sr1;
import a.sr3;
import a.sre0;
import a.suy;
import a.t9f;
import a.taq0;
import a.tg3;
import a.tgk;
import a.tkz;
import a.tvj;
import a.tvk;
import a.u7x;
import a.uaq0;
import a.ugd;
import a.uiv0;
import a.ujk;
import a.ukd;
import a.ulb;
import a.ur3;
import a.v3c;
import a.vfx;
import a.vp3;
import a.w6k;
import a.wdk0;
import a.wen;
import a.wez;
import a.wfx;
import a.wjk;
import a.wn2;
import a.wpx;
import a.wr3;
import a.wt3;
import a.wuy;
import a.wyu;
import a.wz0;
import a.x0x;
import a.xae0;
import a.xdk0;
import a.xf0;
import a.xiv0;
import a.xr3;
import a.xrc;
import a.xs3;
import a.yc3;
import a.yfe0;
import a.yg1;
import a.yje;
import a.yk5;
import a.yr3;
import a.ys10;
import a.yu3;
import a.z7z;
import a.zcm0;
import a.ze3;
import a.zgk;
import a.zo1;
import a.zsr;
import a.zu3;
import android.app.Application;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;
import org.xplatform.client1.features.appactivity.ApplicationActivity;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplicationActivity extends yc3 implements jhg0, rn, da50, evv0, jkf0, wjk, wfx {
    public static final /* synthetic */ int F1 = 0;
    public ndk0 A1;
    public hsv0 B;
    public ndk0 B1;
    public ndk0 C1;
    public ndk0 D1;
    public Integer E1;
    public fwv0 Y;
    public ba50 Z;
    public vfx f1;
    public fwk g1;
    public z7z h1;
    public z7z i1;
    public z7z j1;
    public z7z k1;
    public z7z l1;
    public z7z m1;
    public z7z n1;
    public z7z o1;
    public z7z p1;
    public z7z q1;
    public z7z r1;
    public z7z s1;
    public z7z t1;
    public final a8z u1;
    public gku0 v1;
    public final kiu0 w1;
    public final a8z x1;
    public Integer y1;
    public md3 z1;

    static {
        gd3 gd3Var = hd3.f12850a;
        int i = o4u0.f24658a;
    }

    public ApplicationActivity() {
        wez wezVar = wez.b;
        byte b = 0;
        this.u1 = maz.a(wezVar, new xr3(this, b));
        this.w1 = new kiu0(sre0.f32672a.b(zu3.class), new xr3(this, (byte) 1), new kr3(this, (byte) 8), new xr3(this, (byte) 2));
        this.x1 = maz.a(wezVar, new kr3(this, b));
    }

    public static View D(Fragment fragment) {
        Dialog dialogA0;
        Window window;
        sik sikVar = fragment instanceof sik ? (sik) fragment : null;
        if (sikVar != null) {
            if (!(sikVar instanceof by5) && !(sikVar instanceof i620)) {
                sikVar = null;
            }
            if (sikVar != null && (dialogA0 = sikVar.A0()) != null && (window = dialogA0.getWindow()) != null) {
                return window.getDecorView();
            }
        }
        return null;
    }

    public static final void y(View view, jie0 jie0Var, ApplicationActivity applicationActivity) {
        WeakHashMap weakHashMap = rgu0.f30456a;
        xiv0 xiv0VarA = jgu0.a(view);
        if (xiv0VarA == null) {
            return;
        }
        uiv0 uiv0Var = xiv0VarA.f40966a;
        boolean zU = uiv0Var.u(8);
        float f = uiv0Var.i(8).d;
        if (zU && f > 0.0f) {
            jie0Var.f16571a = f;
        }
        z(view, jie0Var, applicationActivity, zU, f);
    }

    public static final void z(View view, jie0 jie0Var, ApplicationActivity applicationActivity, boolean z, float f) {
        Object value;
        sly slyVar = new sly(f, jie0Var.f16571a, z && view.hasWindowFocus());
        shk shkVar = applicationActivity.B().f10265a;
        shkVar.getClass();
        p7m0 p7m0Var = shkVar.f32216a;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, ahk.a((ahk) value, null, null, null, null, slyVar, 47)));
    }

    public final void A() {
        ndk0 ndk0Var = this.A1;
        if (ndk0Var != null) {
            ndk0Var.dismiss();
        }
        this.E1 = Integer.valueOf(getRequestedOrientation());
        Object obj = E().get();
        obj.getClass();
        pek0 pek0Var = pek0.f26859a;
        String string = getString(R.string.no_connection_title_with_hyphen);
        string.getClass();
        String string2 = getString(R.string.no_connection_description);
        string2.getClass();
        this.A1 = wdk0.j((wdk0) obj, new xdk0(pek0Var, string, string2, null, rv00.B, null, 104), this, null, null, false, false, null, 108);
    }

    public final fwk B() {
        fwk fwkVar = this.g1;
        if (fwkVar != null) {
            return fwkVar;
        }
        Intrinsics.h("displayStateTracker");
        throw null;
    }

    public final sn C() {
        return (sn) this.u1.getValue();
    }

    public final z7z E() {
        z7z z7zVar = this.k1;
        if (z7zVar != null) {
            return z7zVar;
        }
        Intrinsics.h("snackbarManager");
        throw null;
    }

    public final zu3 F() {
        return (zu3) this.w1.getValue();
    }

    public final hsv0 G() {
        hsv0 hsv0Var = this.B;
        if (hsv0Var != null) {
            return hsv0Var;
        }
        Intrinsics.h("xBottomSheetBackStack");
        throw null;
    }

    public final ndk0 H(ndk0 ndk0Var) {
        wdk0 wdk0Var = (wdk0) E().get();
        wdk0Var.getClass();
        ndk0Var.getClass();
        Function1 function1B = ndk0Var.b();
        if (function1B != null) {
            if (!ndk0Var.c().b()) {
                function1B = null;
            }
            if (function1B != null) {
                ndk0 ndk0Var2 = (ndk0) function1B.invoke(this);
                wdk0Var.e.add(ndk0Var.c());
                ndk0Var.dismiss();
                return ndk0Var2;
            }
        }
        return ndk0Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    public final void I(boolean z) {
        boolean z2;
        ndk0 ndk0Var = this.A1;
        boolean z3 = false;
        boolean z4 = ndk0Var != null && ndk0Var.c().b();
        zu3 zu3VarF = F();
        Integer num = this.E1;
        if (num != null) {
            if (!z && z4) {
                if (num.intValue() != getRequestedOrientation()) {
                    z2 = true;
                }
            }
            z2 = false;
        } else {
            z2 = true;
        }
        ol60 ol60Var = zu3VarF.h0;
        if (((pru) zu3VarF.J.get()).a().G1) {
            return;
        }
        if (z4 && !z) {
            z3 = true;
        }
        if (((m1e) zu3VarF.v.get()).c()) {
            ol60Var.f(ct3.f4916a);
        } else if (!z3 || z2) {
            ol60Var.f(lt3.f20610a);
        }
    }

    @Override // a.jhg0
    public final i1w0 getRouter() {
        ApplicationLoader applicationLoader = ApplicationLoader.v1;
        ejc ejcVar = xf0.N().z;
        if (ejcVar != null) {
            return ejcVar.f7902a;
        }
        Intrinsics.h("cicerone");
        throw null;
    }

    @Override // a.yc3, a.agd, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        Locale locale = getResources().getConfiguration().getLocales().get(0);
        super.onConfigurationChanged(configuration);
        getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
        B().a(configuration);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        locale.getClass();
        u7x.u(this, locale);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0183  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.kxq, a.agd, a.zfd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        Object[] objArr;
        taq0 taq0Var;
        Intent intent2 = getIntent();
        intent2.getClass();
        blx.d(intent2);
        AppsFlyerLib.getInstance().collectDataFromLauncherActivity(this);
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        bcm0.x(getWindow(), false);
        pz40 pz40Var = s6t0.f31722a;
        StaticColors staticColors = StaticColors.INSTANCE;
        c9o0 c9o0Var = new c9o0(fbc.U(staticColors.m121getTransparent0d7_KjU()), fbc.U(staticColors.m121getTransparent0d7_KjU()), new or3((byte) 0));
        mjn.a(this, c9o0Var, c9o0Var);
        Window window = getWindow();
        window.getClass();
        yje yjeVar = null;
        byte b = 1;
        ofm0.z(window, null, R.attr.uikitSplashBackground, R.attr.uikitSplashBackground, 1);
        Application application = getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(yr3.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof yr3)) {
                ze3Var = null;
            }
            yr3 yr3Var = (yr3) ze3Var;
            if (yr3Var != null) {
                ApplicationLoader applicationLoader = ApplicationLoader.v1;
                ejc ejcVar = xf0.N().z;
                if (ejcVar == null) {
                    Intrinsics.h("cicerone");
                    throw null;
                }
                s8i s8iVarA = yr3Var.a(ejcVar.f7902a);
                this.B = new hsv0(s8iVarA.f31801a, s8iVarA.b);
                this.Y = s8iVarA.c;
                this.Z = s8iVarA.d;
                this.f1 = s8iVarA.e;
                this.g1 = s8iVarA.f;
                this.h1 = mbl.a(s8iVarA.M0);
                this.i1 = mbl.a(s8iVarA.N0);
                this.j1 = mbl.a(s8iVarA.O0);
                this.k1 = mbl.a(s8iVarA.P0);
                this.l1 = mbl.a(s8iVarA.Q0);
                this.m1 = mbl.a(s8iVarA.R0);
                this.n1 = mbl.a(s8iVarA.S0);
                this.o1 = mbl.a(s8iVarA.T0);
                this.p1 = mbl.a(s8iVarA.U0);
                this.q1 = mbl.a(s8iVarA.V0);
                this.r1 = mbl.a(s8iVarA.W0);
                this.s1 = mbl.a(s8iVarA.X0);
                this.t1 = mbl.a(s8iVarA.Y0);
                zu3 zu3VarF = F();
                kuy kuyVar = (kuy) ((rgu) zu3VarF.V.get()).f30455a.f43005a;
                kuyVar.getClass();
                c00 c00Var = new c00(nkb.z(new juy(kuyVar, yjeVar, objArr6 == true ? 1 : 0)), zu3VarF, (byte) 12);
                lkz lkzVar = lkz.f20223a;
                wr3 wr3Var = new wr3(this, yjeVar, b);
                glz glzVar = this.f44297a;
                byte b2 = 3;
                qjj.W(x0x.Q(glzVar), null, null, new tg3(c00Var, this, wr3Var, (yje) null), 3);
                setTheme(qem0.p(this));
                Intent intent3 = getIntent();
                if ((intent3 == null || !intent3.hasCategory("android.intent.category.DEFAULT")) && ((intent = getIntent()) == null || !intent.hasCategory("android.intent.category.LAUNCHER"))) {
                    objArr = false;
                } else {
                    Intent intent4 = getIntent();
                    if (Intrinsics.d(intent4 != null ? intent4.getAction() : null, "android.intent.action.MAIN")) {
                        objArr = true;
                    } else {
                        objArr = false;
                    }
                }
                String str = Build.MANUFACTURER;
                str.getClass();
                Locale locale = Locale.ENGLISH;
                locale.getClass();
                String lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                Object[] objArr7 = objArr == true && StringsKt.O(lowerCase, Payload.SOURCE_SAMSUNG, false) && !ahb.f865a;
                if (objArr7 == true) {
                    super.onCreate(null);
                } else {
                    super.onCreate(bundle);
                }
                qhv0 qhv0VarL = t().l();
                byte b3 = 8;
                if (qhv0VarL != null) {
                    rwq0 rwq0Var = (rwq0) qhv0VarL.e;
                    rwq0Var.g = true;
                    Toolbar toolbar = rwq0Var.f31228a;
                    rwq0Var.h = "";
                    if ((rwq0Var.b & 8) != 0) {
                        toolbar.setTitle("");
                        if (rwq0Var.g) {
                            rgu0.p(toolbar.getRootView(), "");
                        }
                    }
                }
                ahb.f865a = true;
                String packageName = getPackageName();
                byte b4 = 2;
                if (!StringsKt.W("") && !Intrinsics.d(packageName, "")) {
                    try {
                        getPackageManager().getPackageInfo("", 0);
                        PackageManager packageManager = getPackageManager();
                        packageManager.setComponentEnabledSetting(new ComponentName(getPackageName(), "org.xplatform.client1.LauncherAliasColor"), 2, 1);
                        packageManager.setComponentEnabledSetting(new ComponentName(getPackageName(), "org.xplatform.client1.LauncherAliasLegacy"), 1, 1);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                this.z1 = new md3(new kr3(this, (byte) 7), b3, objArr5 == true ? 1 : 0);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addDataScheme("package");
                registerReceiver(this.z1, intentFilter);
                Intent intent5 = bundle == null ? getIntent() : new Intent();
                intent5.getClass();
                if (j120.f0(this, intent5)) {
                    return;
                }
                z7z z7zVar = this.i1;
                if (z7zVar == null) {
                    Intrinsics.h("getThemeUseCase");
                    throw null;
                }
                uaq0 uaq0VarA = ((wyu) z7zVar.get()).a();
                pz40 pz40Var2 = s6t0.f31722a;
                switch (uaq0VarA.ordinal()) {
                    case 0:
                        lkd.c.getClass();
                        taq0Var = yk5.a().b.f2320a;
                        break;
                    case 1:
                        lkd.c.getClass();
                        taq0Var = yk5.a().b.b;
                        if (taq0Var == null) {
                            taq0Var = yk5.a().b.f2320a;
                        }
                        break;
                    case 2:
                        lkd.c.getClass();
                        taq0Var = yk5.a().b.c;
                        if (taq0Var == null) {
                            taq0Var = yk5.a().b.f2320a;
                        }
                        break;
                    case 3:
                        lkd.c.getClass();
                        taq0Var = yk5.a().b.j;
                        if (taq0Var == null) {
                            taq0Var = yk5.a().b.f2320a;
                        }
                        break;
                    case 4:
                        lkd.c.getClass();
                        taq0Var = yk5.a().b.k;
                        if (taq0Var == null && (taq0Var = yk5.a().b.j) == null) {
                            taq0Var = yk5.a().b.f2320a;
                        }
                        break;
                    case 5:
                        lkd.c.getClass();
                        taq0Var = yk5.a().b.h;
                        if (taq0Var == null) {
                            taq0Var = yk5.a().b.f2320a;
                        }
                        break;
                    case 6:
                        lkd.c.getClass();
                        taq0Var = yk5.a().b.i;
                        if (taq0Var == null && (taq0Var = yk5.a().b.h) == null) {
                            taq0Var = yk5.a().b.f2320a;
                        }
                        break;
                    case 7:
                        lkd.c.getClass();
                        taq0Var = yk5.a().b.f;
                        if (taq0Var == null) {
                            taq0Var = yk5.a().b.f2320a;
                        }
                        break;
                    case 8:
                        lkd.c.getClass();
                        taq0Var = yk5.a().b.g;
                        if (taq0Var == null && (taq0Var = yk5.a().b.f) == null) {
                            taq0Var = yk5.a().b.f2320a;
                        }
                        break;
                    case 9:
                        lkd.c.getClass();
                        taq0Var = yk5.a().b.d;
                        if (taq0Var == null) {
                            taq0Var = yk5.a().b.f2320a;
                        }
                        break;
                    case 10:
                        lkd.c.getClass();
                        taq0Var = yk5.a().b.e;
                        if (taq0Var == null && (taq0Var = yk5.a().b.d) == null) {
                            taq0Var = yk5.a().b.f2320a;
                        }
                        break;
                    default:
                        t9f.b();
                        return;
                }
                uaq0.f35345a.getClass();
                s6t0.d(taq0Var, !s9m0.j(uaq0VarA));
                setContentView(C().c);
                hsv0 hsv0VarG = G();
                z7z z7zVar2 = this.s1;
                if (z7zVar2 == null) {
                    Intrinsics.h("navDestinations");
                    throw null;
                }
                Object obj = z7zVar2.get();
                obj.getClass();
                mvv0 mvv0Var = new mvv0(this, hsv0VarG.b);
                r().k0(mvv0Var, true);
                glzVar.a(mvv0Var);
                ComposeView composeView = new ComposeView(this, null, 6);
                pkd.h(composeView, new owp0(this), null, new ugd(1766159633, true, new sjs(hsv0VarG, (ib50) obj, (byte) 22)));
                addContentView(composeView, new ViewGroup.LayoutParams(-1, -1));
                Object[] objArr8 = bundle == null || objArr7 == true;
                byte b5 = 5;
                byte b6 = 4;
                if (objArr8 != false) {
                    Intent intent6 = getIntent();
                    if (intent6 != null) {
                        ((jlx) F().e.get()).a(intent6);
                    }
                    zu3 zu3VarF2 = F();
                    sac.V(jiu0.a(zu3VarF2), pu3.f27594a, new xs3(zu3VarF2, b), null, new qu3(zu3VarF2, yjeVar, objArr4 == true ? 1 : 0), 12);
                    sac.T(new fnq(aoq.c(((m1e) zu3VarF2.v.get()).b(), new zo1(yjeVar, zu3VarF2, b5)), new cu3(zu3VarF2, yjeVar, b6), b6), d5c.S(jiu0.a(zu3VarF2), zu3VarF2.g.f22085a), ru3.h);
                }
                zu3 zu3VarF3 = F();
                mne mneVar = zu3VarF3.g;
                if (((iqt) zu3VarF3.z.get()).f15225a.a()) {
                    zu3VarF3.A(0L);
                } else {
                    ((g860) zu3VarF3.k.get()).f10850a.f11847a.b(false);
                }
                sac.T(new fnq(((hs00) zu3VarF3.P.get()).a(), new yg1(zu3VarF3, yjeVar, b4), b6), d5c.S(jiu0.a(zu3VarF3), mneVar.b), new pd(b4, yjeVar, (byte) 17));
                slb.U(ulb.L(new dnq(new fnq(i120.X(((c1d0) zu3VarF3.f.get()).f().a(), new or3(b4), i120.g), new cu3(zu3VarF3, yjeVar, b2), b6), new lo3(b2, yjeVar, b), b), mneVar.b), jiu0.a(zu3VarF3));
                TypedValue typedValue = j5d.f15927a;
                this.y1 = Integer.valueOf(j5d.a(this, objArr8 != false ? R.attr.uikitSplashBackground : R.attr.uikitBackgroundContent, false));
                z7z z7zVar3 = this.j1;
                if (z7zVar3 == null) {
                    Intrinsics.h("dateChangeBroadcastReceiverDelegate");
                    throw null;
                }
                ldj ldjVar = (ldj) z7zVar3.get();
                ldjVar.getClass();
                blz blzVar = ldjVar.b;
                if (blzVar != null) {
                    glzVar.f(blzVar);
                }
                ldjVar.b = null;
                tvj tvjVar = new tvj(null, null, new coh(ldjVar, this, glzVar), 31);
                ldjVar.b = tvjVar;
                glzVar.a(tvjVar);
                q7x0 q7x0Var = new q7x0(b);
                if (Build.VERSION.SDK_INT >= 33) {
                    IntentFilter intentFilter2 = new IntentFilter();
                    intentFilter2.addAction("android.intent.action.TIME_SET");
                    intentFilter2.addAction("android.intent.action.DATE_CHANGED");
                    registerReceiver(q7x0Var, intentFilter2, 2);
                } else {
                    IntentFilter intentFilter3 = new IntentFilter();
                    intentFilter3.addAction("android.intent.action.TIME_SET");
                    intentFilter3.addAction("android.intent.action.DATE_CHANGED");
                    registerReceiver(q7x0Var, intentFilter3);
                }
                ldjVar.f19853a = q7x0Var;
                ol60 ol60Var = F().h0;
                Class<ApplicationActivity> cls = ApplicationActivity.class;
                vp3 vp3Var = new vp3(2, this, cls, "handleViewAction", "handleViewAction(Lorg/xplatform/client1/features/appactivity/ApplicationViewModel$ViewAction;)V", 4, (byte) 3);
                lkz lkzVar2 = lkz.f20223a;
                qjj.W(x0x.Q(glzVar), null, null, new tg3(ol60Var, this, vp3Var, (yje) null, 0), 3);
                gmq gmqVarB = ((m1e) F().v.get()).b();
                int i = 4;
                vp3 vp3Var2 = new vp3(2, this, cls, "showDisableNetworkView", "showDisableNetworkView(Z)V", i, (byte) 4);
                lkz lkzVar3 = lkz.f20223a;
                qjj.W(x0x.Q(glzVar), null, null, new tg3(gmqVarB, this, vp3Var2, (yje) null), 3);
                xae0 xae0Var = F().k0;
                lkz lkzVar4 = lkz.f20223a;
                qjj.W(x0x.Q(glzVar), null, null, new tg3((gmq) xae0Var, this, new vp3(2, this, cls, "initInternetEmulationButton", "initInternetEmulationButton(Z)V", i, (byte) 5), (yje) null, (byte) 0), 3);
                qjj.W(x0x.Q(glzVar), null, null, new tg3((gmq) F().l0, this, new vp3(2, this, cls, "initDebugConsoleView", "initDebugConsoleView(Lorg/xplatform/onexcore/domain/models/DebugConsoleState;)V", 4, (byte) 6), (yje) null, (char) 0), 3);
                tkz tkzVarQ = x0x.Q(glzVar);
                rwj rwjVar = tvk.f34603a;
                qjj.W(tkzVarQ, ys10.f43147a, null, new sr3(this, yjeVar, b), 2);
                r().q.add(new h2r() { // from class: a.nr3
                    @Override // a.h2r
                    public final void a(androidx.fragment.app.e eVar, Fragment fragment) {
                        int i2 = ApplicationActivity.F1;
                        eVar.getClass();
                        fragment.C().k0(new vr3(this.f23983a, (byte) 0), true);
                    }
                });
                ba50 ba50Var = this.Z;
                if (ba50Var == null) {
                    Intrinsics.h("navBarHolder");
                    throw null;
                }
                qjj.W(x0x.Q(glzVar), null, null, new tg3(ba50Var.f2242a, this, new wr3(this, yjeVar, objArr3 == true ? 1 : 0), (yje) null), 3);
                ArrayList arrayList = ujk.f35785a;
                f8 f8Var = new f8(0, this, ApplicationActivity.class, "recreateSnackbars", "recreateSnackbars()V", 0, (byte) 11);
                ujk.b.add(f8Var);
                glzVar.a(new r58(f8Var));
                r().k0(new ur3(this, objArr2 == true ? 1 : 0), true);
                FrameLayout frameLayout = C().b;
                gne gneVar = new gne(this, (byte) 10);
                WeakHashMap weakHashMap = rgu0.f30456a;
                igu0.c(frameLayout, gneVar);
                fwk fwkVarB = B();
                Configuration configuration = getResources().getConfiguration();
                configuration.getClass();
                fwkVarB.a(configuration);
                pkd.i(C().d, null, new ugd(-1453627964, true, new lr3(this, b5)));
                ComposeView composeView2 = C().e;
                pkd.i(composeView2, null, new ugd(-2015429918, true, new sr1(this, composeView2, (byte) 14)));
                return;
            }
        }
        jf4.n(b1j.i(yr3.class, "Cannot create dependency "));
    }

    @Override // a.yc3, a.kxq, android.app.Activity
    public final void onDestroy() {
        zu3 zu3VarF = F();
        if (!isChangingConfigurations() && ((suy) ((wpx) zu3VarF.E.get()).f39564a.f36323a.c.getValue()).f32841a == wuy.d) {
            ((iyg0) zu3VarF.D.get()).a();
        }
        z7z z7zVar = this.j1;
        if (z7zVar == null) {
            Intrinsics.h("dateChangeBroadcastReceiverDelegate");
            throw null;
        }
        ldj ldjVar = (ldj) z7zVar.get();
        q7x0 q7x0Var = ldjVar.f19853a;
        if (q7x0Var != null) {
            unregisterReceiver(q7x0Var);
        }
        ldjVar.f19853a = null;
        md3 md3Var = this.z1;
        if (md3Var != null) {
            unregisterReceiver(md3Var);
            this.z1 = null;
        }
        if (isFinishing()) {
            z7z z7zVar2 = this.m1;
            if (z7zVar2 == null) {
                Intrinsics.h("gameBroadcastingServiceFactory");
                throw null;
            }
            ((zsr) z7zVar2.get()).a();
        }
        super.onDestroy();
        this.v1 = null;
    }

    @Override // a.agd, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        if (j120.f0(this, intent)) {
            return;
        }
        blx.d(intent);
        ((jlx) F().e.get()).a(intent);
    }

    @Override // a.kxq, android.app.Activity
    public final void onPause() {
        zu3 zu3VarF = F();
        yje yjeVar = null;
        sac.V(jiu0.a(zu3VarF), nu3.f24129a, null, null, new wt3(zu3VarF, yjeVar, (byte) 2), 14);
        lmi0 lmi0Var = (lmi0) ((g390) zu3VarF.y.get()).f10601a.f27236a;
        lmi0Var.i = false;
        v3c.N(lmi0Var.g);
        lmi0Var.d = 0L;
        lmi0Var.b.g("SAVED_TIMER_VALUE_KEY", ((Number) ((p7m0) ((qz40) lmi0Var.c.getValue())).getValue()).longValue());
        bby bbyVar = zu3VarF.p0;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = zu3VarF.o0;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        bby bbyVar3 = zu3VarF.n0;
        if (bbyVar3 != null) {
            bbyVar3.cancel(null);
        }
        ApplicationLoader applicationLoader = ApplicationLoader.v1;
        ejc ejcVar = xf0.N().z;
        if (ejcVar == null) {
            Intrinsics.h("cicerone");
            throw null;
        }
        ejcVar.f7902a.f14021a.b = null;
        z7z z7zVar = this.l1;
        if (z7zVar == null) {
            Intrinsics.h("rootRouterHolder");
            throw null;
        }
        oeg0 oeg0Var = (oeg0) z7zVar.get();
        dhg0 dhg0Var = dhg0.f6089a;
        oeg0Var.getClass();
        oeg0Var.f25121a.remove(dhg0Var);
        super.onPause();
        zu3 zu3VarF2 = F();
        boolean zIsChangingConfigurations = isChangingConfigurations();
        boolean zIsFinishing = isFinishing();
        sac.V(jiu0.a(zu3VarF2), yu3.f43249a, null, zu3VarF2.g.b, new wz0(zIsChangingConfigurations, zu3VarF2, zIsFinishing, yjeVar, (byte) 1), 10);
    }

    @Override // a.kxq, android.app.Activity
    public final void onResume() {
        super.onResume();
        byte b = 0;
        I(false);
        z7z z7zVar = this.l1;
        yje yjeVar = null;
        if (z7zVar == null) {
            Intrinsics.h("rootRouterHolder");
            throw null;
        }
        oeg0 oeg0Var = (oeg0) z7zVar.get();
        ApplicationLoader applicationLoader = ApplicationLoader.v1;
        ejc ejcVar = xf0.N().z;
        if (ejcVar == null) {
            Intrinsics.h("cicerone");
            throw null;
        }
        oeg0Var.a(dhg0.f6089a, ejcVar.f7902a);
        ejc ejcVar2 = xf0.N().z;
        if (ejcVar2 == null) {
            Intrinsics.h("cicerone");
            throw null;
        }
        ejcVar2.f7902a.f14021a.q((rs3) this.x1.getValue());
        Integer num = this.y1;
        if (num != null) {
            int iIntValue = num.intValue();
            C().b.setBackground(new ColorDrawable(iIntValue));
            getWindow().setBackgroundDrawable(new ColorDrawable(iIntValue));
        }
        rdj rdjVar = rdj.f30294a;
        z7z z7zVar2 = this.t1;
        if (z7zVar2 == null) {
            Intrinsics.h("resourceManager");
            throw null;
        }
        rdj.l(((ctf0) z7zVar2.get()).h());
        zu3 zu3VarF = F();
        zgk zgkVar = (zgk) zu3VarF.i.get();
        kt2 kt2Var = zgkVar.f44348a;
        tgk tgkVar = zgkVar.b;
        tgkVar.getClass();
        Resources resources = tgkVar.f33916a.getResources();
        kt2Var.b("setting_font_size", String.valueOf(new Configuration(resources != null ? resources.getConfiguration() : null).fontScale));
        long jCurrentTimeMillis = System.currentTimeMillis() - zu3.r0;
        long j = zu3.q0;
        byte b2 = 3;
        if (jCurrentTimeMillis >= wen.e(j)) {
            zu3VarF.A(0L);
        } else {
            bby bbyVar = zu3VarF.o0;
            if (bbyVar == null || !bbyVar.isActive()) {
                zu3VarF.o0 = sac.f0(jiu0.a(zu3VarF), wen.e(j) - jCurrentTimeMillis, TimeUnit.MILLISECONDS, null, new or3(b2), new wt3(zu3VarF, yjeVar, b), 36);
            }
        }
        sac.V(jiu0.a(zu3VarF), ou3.f25857a, null, null, new wt3(zu3VarF, yjeVar, b2), 14);
        if (((iqt) zu3VarF.z.get()).f15225a.a()) {
            ((lmi0) ((imt0) zu3VarF.x.get()).f15042a.f27236a).c();
        } else {
            ((xrc) zu3VarF.w.get()).a();
        }
        ((sqx) zu3VarF.j.get()).a();
    }

    @Override // a.yc3, a.kxq, android.app.Activity
    public final void onStart() {
        super.onStart();
        zu3 zu3VarF = F();
        yje yjeVar = null;
        sac.V(jiu0.a(zu3VarF), gu3.f11911a, null, zu3VarF.g.b, new hu3((diu0) zu3VarF, yjeVar, (byte) 0), 10);
        zu3 zu3VarF2 = F();
        sac.V(jiu0.a(zu3VarF2), fu3.f10143a, null, zu3VarF2.g.b, new wt3(zu3VarF2, yjeVar, (byte) 1), 10);
    }

    @Override // a.yc3
    public final hd3 t() {
        gku0 gku0Var = this.v1;
        if (gku0Var != null) {
            return gku0Var;
        }
        hd3 hd3VarT = super.t();
        hd3VarT.getClass();
        gku0 gku0Var2 = new gku0(hd3VarT, this, new hny((byte) 7));
        this.v1 = gku0Var2;
        return gku0Var2;
    }

    public final void u(int i, fet fetVar) {
        fetVar.g0(994308763);
        int i2 = (fetVar.i(this) ? 4 : 2) | i;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(this);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new sr3(this, null, b);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, unit, (Function2) objP);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lr3(this, i, (byte) 3);
        }
    }

    public final void v(int i, fet fetVar) {
        ApplicationActivity applicationActivity;
        fetVar.g0(1376975482);
        int i2 = (fetVar.i(this) ? 4 : 2) | i;
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            WeakHashMap weakHashMap = djv0.w;
            q33 q33Var = zcm0.i(fetVar).f;
            q33 q33Var2 = zcm0.i(fetVar).e;
            q33 q33Var3 = zcm0.i(fetVar).b;
            boolean zG = fetVar.g(w6kVar) | fetVar.g(q33Var) | fetVar.g(q33Var2) | fetVar.g(q33Var3) | fetVar.i(this);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                applicationActivity = this;
                wn2 wn2Var = new wn2(w6kVar, q33Var, q33Var2, q33Var3, applicationActivity, null, (byte) 3);
                fetVar.o0(wn2Var);
                objP = wn2Var;
            } else {
                applicationActivity = this;
            }
            m0x0.t(fetVar, w6kVar, (Function2) objP);
        } else {
            applicationActivity = this;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lr3(applicationActivity, i, b);
        }
    }

    public final void w(int i, fet fetVar) {
        fetVar.g0(242682590);
        int i2 = (fetVar.i(this) ? 4 : 2) | i;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            View view = (View) fetVar.k(dy2.f);
            boolean zI = fetVar.i(view) | fetVar.i(this) | fetVar.e(8);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new df1(view, this, (byte) 29);
                fetVar.o0(objP);
            }
            m0x0.o(view, (Function1) objP, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lr3(this, i, b);
        }
    }
}
