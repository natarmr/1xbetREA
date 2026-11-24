package org.xplatform.game_broadcasting.impl.presentation.zone.window_screen;

import a.a8z;
import a.cyu;
import a.e0g0;
import a.fiu0;
import a.fnq;
import a.fns;
import a.glz;
import a.gmq;
import a.hxm0;
import a.j0g0;
import a.j0s;
import a.j1t;
import a.lkz;
import a.maz;
import a.miu0;
import a.mlz;
import a.n0o0;
import a.o0t;
import a.p7m0;
import a.pfl;
import a.qjj;
import a.vai;
import a.wcf0;
import a.wez;
import a.x0x;
import a.x1t;
import a.yje;
import a.yop;
import a.z1t;
import a.zn00;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneView;
import org.xplatform.game_broadcasting.impl.presentation.zone.window_screen.GameZoneWindowService;

/* JADX INFO: loaded from: classes4.dex */
public final class GameZoneWindowService extends mlz {
    public static final /* synthetic */ int g = 0;
    public final n0o0 b;
    public x1t c;
    public final a8z d;
    public final a8z e;
    public final a8z f;

    public GameZoneWindowService() {
        final byte b = 0;
        this.b = maz.b(new Function0(this) { // from class: a.y1t
            public final /* synthetic */ GameZoneWindowService b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                GameZoneWindowService gameZoneWindowService = this.b;
                switch (b2) {
                    case 0:
                        int i = GameZoneWindowService.g;
                        Application application = gameZoneWindowService.getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(q89.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof q89)) {
                                ze3Var = null;
                            }
                            q89 q89Var = (q89) ze3Var;
                            if (q89Var != null) {
                                us00 us00Var = q89Var.f28289a;
                                oeg0 oeg0Var = q89Var.b;
                                nhv0 nhv0Var = q89Var.c;
                                ysr ysrVar = q89Var.d;
                                m49 m49Var = q89Var.g;
                                n49 n49Var = q89Var.h;
                                m1e m1eVar = q89Var.j;
                                mne mneVar = q89Var.k;
                                gst0 gst0Var = q89Var.l;
                                btt0 btt0Var = q89Var.m;
                                yox yoxVar = q89Var.n;
                                atr atrVar = q89Var.e;
                                rsr rsrVar = q89Var.f;
                                meu0 meu0Var = q89Var.i;
                                mi70 mi70Var = q89Var.o;
                                r9u r9uVar = q89Var.p;
                                c49 c49Var = q89Var.q;
                                vd1 vd1Var = q89Var.r;
                                ik4 ik4Var = q89Var.s;
                                viu viuVar = q89Var.t;
                                oeg0Var.getClass();
                                nhv0Var.getClass();
                                ysrVar.getClass();
                                atrVar.getClass();
                                rsrVar.getClass();
                                m49Var.getClass();
                                n49Var.getClass();
                                meu0Var.getClass();
                                m1eVar.getClass();
                                gst0Var.getClass();
                                btt0Var.getClass();
                                r9uVar.getClass();
                                c49Var.getClass();
                                return new vai(us00Var, oeg0Var, nhv0Var, ysrVar, atrVar, rsrVar, m49Var, n49Var, m1eVar, mneVar, yoxVar, mi70Var, r9uVar, c49Var, vd1Var, ik4Var, viuVar);
                            }
                        }
                        jf4.n(b1j.i(q89.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        int i2 = GameZoneWindowService.g;
                        GameZoneView gameZoneView = new GameZoneView(gameZoneWindowService, null);
                        gameZoneView.setLayoutDirection(cy7.c() ? 1 : 0);
                        return gameZoneView;
                    case 2:
                        int i3 = GameZoneWindowService.g;
                        Object systemService = gameZoneWindowService.getSystemService("window");
                        systemService.getClass();
                        return (WindowManager) systemService;
                    default:
                        int i4 = GameZoneWindowService.g;
                        return new WindowManager.LayoutParams((int) gameZoneWindowService.getResources().getDimension(R.dimen.floating_video_width), (int) gameZoneWindowService.getResources().getDimension(R.dimen.floating_video_height), Build.VERSION.SDK_INT >= 26 ? 2038 : CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, 262152, -3);
                }
            }
        });
        final byte b2 = 1;
        Function0 function0 = new Function0(this) { // from class: a.y1t
            public final /* synthetic */ GameZoneWindowService b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                GameZoneWindowService gameZoneWindowService = this.b;
                switch (b3) {
                    case 0:
                        int i = GameZoneWindowService.g;
                        Application application = gameZoneWindowService.getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(q89.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof q89)) {
                                ze3Var = null;
                            }
                            q89 q89Var = (q89) ze3Var;
                            if (q89Var != null) {
                                us00 us00Var = q89Var.f28289a;
                                oeg0 oeg0Var = q89Var.b;
                                nhv0 nhv0Var = q89Var.c;
                                ysr ysrVar = q89Var.d;
                                m49 m49Var = q89Var.g;
                                n49 n49Var = q89Var.h;
                                m1e m1eVar = q89Var.j;
                                mne mneVar = q89Var.k;
                                gst0 gst0Var = q89Var.l;
                                btt0 btt0Var = q89Var.m;
                                yox yoxVar = q89Var.n;
                                atr atrVar = q89Var.e;
                                rsr rsrVar = q89Var.f;
                                meu0 meu0Var = q89Var.i;
                                mi70 mi70Var = q89Var.o;
                                r9u r9uVar = q89Var.p;
                                c49 c49Var = q89Var.q;
                                vd1 vd1Var = q89Var.r;
                                ik4 ik4Var = q89Var.s;
                                viu viuVar = q89Var.t;
                                oeg0Var.getClass();
                                nhv0Var.getClass();
                                ysrVar.getClass();
                                atrVar.getClass();
                                rsrVar.getClass();
                                m49Var.getClass();
                                n49Var.getClass();
                                meu0Var.getClass();
                                m1eVar.getClass();
                                gst0Var.getClass();
                                btt0Var.getClass();
                                r9uVar.getClass();
                                c49Var.getClass();
                                return new vai(us00Var, oeg0Var, nhv0Var, ysrVar, atrVar, rsrVar, m49Var, n49Var, m1eVar, mneVar, yoxVar, mi70Var, r9uVar, c49Var, vd1Var, ik4Var, viuVar);
                            }
                        }
                        jf4.n(b1j.i(q89.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        int i2 = GameZoneWindowService.g;
                        GameZoneView gameZoneView = new GameZoneView(gameZoneWindowService, null);
                        gameZoneView.setLayoutDirection(cy7.c() ? 1 : 0);
                        return gameZoneView;
                    case 2:
                        int i3 = GameZoneWindowService.g;
                        Object systemService = gameZoneWindowService.getSystemService("window");
                        systemService.getClass();
                        return (WindowManager) systemService;
                    default:
                        int i4 = GameZoneWindowService.g;
                        return new WindowManager.LayoutParams((int) gameZoneWindowService.getResources().getDimension(R.dimen.floating_video_width), (int) gameZoneWindowService.getResources().getDimension(R.dimen.floating_video_height), Build.VERSION.SDK_INT >= 26 ? 2038 : CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, 262152, -3);
                }
            }
        };
        wez wezVar = wez.b;
        this.d = maz.a(wezVar, function0);
        final byte b3 = 2;
        this.e = maz.a(wezVar, new Function0(this) { // from class: a.y1t
            public final /* synthetic */ GameZoneWindowService b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                GameZoneWindowService gameZoneWindowService = this.b;
                switch (b4) {
                    case 0:
                        int i = GameZoneWindowService.g;
                        Application application = gameZoneWindowService.getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(q89.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof q89)) {
                                ze3Var = null;
                            }
                            q89 q89Var = (q89) ze3Var;
                            if (q89Var != null) {
                                us00 us00Var = q89Var.f28289a;
                                oeg0 oeg0Var = q89Var.b;
                                nhv0 nhv0Var = q89Var.c;
                                ysr ysrVar = q89Var.d;
                                m49 m49Var = q89Var.g;
                                n49 n49Var = q89Var.h;
                                m1e m1eVar = q89Var.j;
                                mne mneVar = q89Var.k;
                                gst0 gst0Var = q89Var.l;
                                btt0 btt0Var = q89Var.m;
                                yox yoxVar = q89Var.n;
                                atr atrVar = q89Var.e;
                                rsr rsrVar = q89Var.f;
                                meu0 meu0Var = q89Var.i;
                                mi70 mi70Var = q89Var.o;
                                r9u r9uVar = q89Var.p;
                                c49 c49Var = q89Var.q;
                                vd1 vd1Var = q89Var.r;
                                ik4 ik4Var = q89Var.s;
                                viu viuVar = q89Var.t;
                                oeg0Var.getClass();
                                nhv0Var.getClass();
                                ysrVar.getClass();
                                atrVar.getClass();
                                rsrVar.getClass();
                                m49Var.getClass();
                                n49Var.getClass();
                                meu0Var.getClass();
                                m1eVar.getClass();
                                gst0Var.getClass();
                                btt0Var.getClass();
                                r9uVar.getClass();
                                c49Var.getClass();
                                return new vai(us00Var, oeg0Var, nhv0Var, ysrVar, atrVar, rsrVar, m49Var, n49Var, m1eVar, mneVar, yoxVar, mi70Var, r9uVar, c49Var, vd1Var, ik4Var, viuVar);
                            }
                        }
                        jf4.n(b1j.i(q89.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        int i2 = GameZoneWindowService.g;
                        GameZoneView gameZoneView = new GameZoneView(gameZoneWindowService, null);
                        gameZoneView.setLayoutDirection(cy7.c() ? 1 : 0);
                        return gameZoneView;
                    case 2:
                        int i3 = GameZoneWindowService.g;
                        Object systemService = gameZoneWindowService.getSystemService("window");
                        systemService.getClass();
                        return (WindowManager) systemService;
                    default:
                        int i4 = GameZoneWindowService.g;
                        return new WindowManager.LayoutParams((int) gameZoneWindowService.getResources().getDimension(R.dimen.floating_video_width), (int) gameZoneWindowService.getResources().getDimension(R.dimen.floating_video_height), Build.VERSION.SDK_INT >= 26 ? 2038 : CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, 262152, -3);
                }
            }
        });
        final byte b4 = 3;
        this.f = maz.a(wezVar, new Function0(this) { // from class: a.y1t
            public final /* synthetic */ GameZoneWindowService b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                GameZoneWindowService gameZoneWindowService = this.b;
                switch (b5) {
                    case 0:
                        int i = GameZoneWindowService.g;
                        Application application = gameZoneWindowService.getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(q89.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof q89)) {
                                ze3Var = null;
                            }
                            q89 q89Var = (q89) ze3Var;
                            if (q89Var != null) {
                                us00 us00Var = q89Var.f28289a;
                                oeg0 oeg0Var = q89Var.b;
                                nhv0 nhv0Var = q89Var.c;
                                ysr ysrVar = q89Var.d;
                                m49 m49Var = q89Var.g;
                                n49 n49Var = q89Var.h;
                                m1e m1eVar = q89Var.j;
                                mne mneVar = q89Var.k;
                                gst0 gst0Var = q89Var.l;
                                btt0 btt0Var = q89Var.m;
                                yox yoxVar = q89Var.n;
                                atr atrVar = q89Var.e;
                                rsr rsrVar = q89Var.f;
                                meu0 meu0Var = q89Var.i;
                                mi70 mi70Var = q89Var.o;
                                r9u r9uVar = q89Var.p;
                                c49 c49Var = q89Var.q;
                                vd1 vd1Var = q89Var.r;
                                ik4 ik4Var = q89Var.s;
                                viu viuVar = q89Var.t;
                                oeg0Var.getClass();
                                nhv0Var.getClass();
                                ysrVar.getClass();
                                atrVar.getClass();
                                rsrVar.getClass();
                                m49Var.getClass();
                                n49Var.getClass();
                                meu0Var.getClass();
                                m1eVar.getClass();
                                gst0Var.getClass();
                                btt0Var.getClass();
                                r9uVar.getClass();
                                c49Var.getClass();
                                return new vai(us00Var, oeg0Var, nhv0Var, ysrVar, atrVar, rsrVar, m49Var, n49Var, m1eVar, mneVar, yoxVar, mi70Var, r9uVar, c49Var, vd1Var, ik4Var, viuVar);
                            }
                        }
                        jf4.n(b1j.i(q89.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        int i2 = GameZoneWindowService.g;
                        GameZoneView gameZoneView = new GameZoneView(gameZoneWindowService, null);
                        gameZoneView.setLayoutDirection(cy7.c() ? 1 : 0);
                        return gameZoneView;
                    case 2:
                        int i3 = GameZoneWindowService.g;
                        Object systemService = gameZoneWindowService.getSystemService("window");
                        systemService.getClass();
                        return (WindowManager) systemService;
                    default:
                        int i4 = GameZoneWindowService.g;
                        return new WindowManager.LayoutParams((int) gameZoneWindowService.getResources().getDimension(R.dimen.floating_video_width), (int) gameZoneWindowService.getResources().getDimension(R.dimen.floating_video_height), Build.VERSION.SDK_INT >= 26 ? 2038 : CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, 262152, -3);
                }
            }
        });
    }

    public final GameZoneView a() {
        return (GameZoneView) this.d.getValue();
    }

    @Override // a.mlz, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.c = (x1t) new zn00((mlz) this, (miu0) new fiu0(wcf0.h(x1t.class, ((vai) this.b.getValue()).t))).h0(x1t.class);
    }

    @Override // a.mlz, android.app.Service
    public final void onDestroy() {
        try {
            e0g0 e0g0Var = j0g0.b;
            a().h();
            ((WindowManager) this.e.getValue()).removeView(a());
        } catch (Throwable unused) {
            e0g0 e0g0Var2 = j0g0.b;
        }
        super.onDestroy();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109  */
    /* JADX WARN: Code duplicated, block: B:42:0x0127  */
    /* JADX WARN: Code duplicated, block: B:44:0x013f  */
    /* JADX WARN: Code duplicated, block: B:46:0x017a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0198  */
    /* JADX WARN: Code duplicated, block: B:51:0x019c  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b0  */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        GameZoneView gameZoneViewA;
        x1t x1tVar;
        GameZoneView gameZoneViewA2;
        x1t x1tVar2;
        GameZoneView gameZoneViewA3;
        x1t x1tVar3;
        Class<x1t> cls;
        GameZoneView gameZoneViewA4;
        x1t x1tVar4;
        GameZoneView gameZoneViewA5;
        x1t x1tVar5;
        x1t x1tVar6;
        cyu cyuVar;
        x1t x1tVar7;
        Object value;
        yje yjeVar = null;
        String action = intent != null ? intent.getAction() : null;
        if (action == null) {
            GameZoneView gameZoneViewA6 = a();
            gameZoneViewA6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            hxm0.x(gameZoneViewA6, getResources().getDimensionPixelSize(R.dimen.space_12));
            a8z a8zVar = this.f;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) a8zVar.getValue();
            layoutParams.gravity = 17;
            layoutParams.x = 0;
            layoutParams.y = 0;
            ((WindowManager) this.e.getValue()).addView(gameZoneViewA6, (WindowManager.LayoutParams) a8zVar.getValue());
            gameZoneViewA6.getBroadcastingContainerView().setOnTouchListener(new z1t(this, gameZoneViewA6));
            gameZoneViewA = a();
            x1tVar = this.c;
            if (x1tVar == null) {
                Intrinsics.h("viewModel");
                throw null;
            }
            gameZoneViewA.setJavascriptInterface(x1tVar);
            gameZoneViewA2 = a();
            x1tVar2 = this.c;
            if (x1tVar2 == null) {
                Intrinsics.h("viewModel");
                throw null;
            }
            gameZoneViewA2.getClass();
            gameZoneViewA2.getBroadcastingControlPanelView().u(x1tVar2);
            gameZoneViewA3 = a();
            x1tVar3 = this.c;
            if (x1tVar3 == null) {
                Intrinsics.h("viewModel");
                throw null;
            }
            cls = x1t.class;
            gameZoneViewA3.setOnMediaFileReddyListener(new o0t(0, x1tVar3, cls, "onMediaFileReddy", "onMediaFileReddy()V", 0, (byte) 2));
            gameZoneViewA4 = a();
            x1tVar4 = this.c;
            if (x1tVar4 == null) {
                Intrinsics.h("viewModel");
                throw null;
            }
            gameZoneViewA4.setOnErrorListener(new o0t(0, x1tVar4, cls, "onBroadcastingError", "onBroadcastingError()V", 0, (byte) 3));
            gameZoneViewA5 = a();
            x1tVar5 = this.c;
            if (x1tVar5 == null) {
                Intrinsics.h("viewModel");
                throw null;
            }
            gameZoneViewA5.setOnContainerClickListener(new o0t(0, x1tVar5, cls, "onVideoContainerClick", "onVideoContainerClick()V", 0, (byte) 4));
            x1tVar6 = this.c;
            if (x1tVar6 == null) {
                Intrinsics.h("viewModel");
                throw null;
            }
            yop yopVar = new yop(new fnq(x1tVar6.m, new j0s(x1tVar6, yjeVar, (byte) 8)), (byte) 2);
            lkz lkzVar = lkz.f20223a;
            pfl pflVar = new pfl(2, this, GameZoneWindowService.class, "handleUiState", "handleUiState(Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowScreenUiState;)V", 4, (byte) 19);
            cyuVar = this.f22014a;
            qjj.W(x0x.Q((glz) cyuVar.f5196a), null, null, new fns(yopVar, this, pflVar, (yje) null), 3);
            x1tVar7 = this.c;
            if (x1tVar7 == null) {
                Intrinsics.h("viewModel");
                throw null;
            }
            qjj.W(x0x.Q((glz) cyuVar.f5196a), null, null, new fns((gmq) x1tVar7.n, this, new j0s(this, yjeVar, (byte) 9), (yje) null), 3);
        } else {
            int iHashCode = action.hashCode();
            if (iHashCode != -528730005) {
                if (iHashCode == 785908365 && action.equals("ACTION_PAUSE")) {
                    x1t x1tVar8 = this.c;
                    if (x1tVar8 == null) {
                        Intrinsics.h("viewModel");
                        throw null;
                    }
                    x1tVar8.x();
                    p7m0 p7m0Var = x1tVar8.m;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, j1t.a((j1t) value, 0L, 0L, 0, 0L, null, false, false, false, null, false, null, 24575)));
                    stopSelf();
                } else {
                    GameZoneView gameZoneViewA7 = a();
                    gameZoneViewA7.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    hxm0.x(gameZoneViewA7, getResources().getDimensionPixelSize(R.dimen.space_12));
                    a8z a8zVar2 = this.f;
                    WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) a8zVar2.getValue();
                    layoutParams2.gravity = 17;
                    layoutParams2.x = 0;
                    layoutParams2.y = 0;
                    ((WindowManager) this.e.getValue()).addView(gameZoneViewA7, (WindowManager.LayoutParams) a8zVar2.getValue());
                    gameZoneViewA7.getBroadcastingContainerView().setOnTouchListener(new z1t(this, gameZoneViewA7));
                    gameZoneViewA = a();
                    x1tVar = this.c;
                    if (x1tVar == null) {
                        Intrinsics.h("viewModel");
                        throw null;
                    }
                    gameZoneViewA.setJavascriptInterface(x1tVar);
                    gameZoneViewA2 = a();
                    x1tVar2 = this.c;
                    if (x1tVar2 == null) {
                        Intrinsics.h("viewModel");
                        throw null;
                    }
                    gameZoneViewA2.getClass();
                    gameZoneViewA2.getBroadcastingControlPanelView().u(x1tVar2);
                    gameZoneViewA3 = a();
                    x1tVar3 = this.c;
                    if (x1tVar3 == null) {
                        Intrinsics.h("viewModel");
                        throw null;
                    }
                    cls = x1t.class;
                    gameZoneViewA3.setOnMediaFileReddyListener(new o0t(0, x1tVar3, cls, "onMediaFileReddy", "onMediaFileReddy()V", 0, (byte) 2));
                    gameZoneViewA4 = a();
                    x1tVar4 = this.c;
                    if (x1tVar4 == null) {
                        Intrinsics.h("viewModel");
                        throw null;
                    }
                    gameZoneViewA4.setOnErrorListener(new o0t(0, x1tVar4, cls, "onBroadcastingError", "onBroadcastingError()V", 0, (byte) 3));
                    gameZoneViewA5 = a();
                    x1tVar5 = this.c;
                    if (x1tVar5 == null) {
                        Intrinsics.h("viewModel");
                        throw null;
                    }
                    gameZoneViewA5.setOnContainerClickListener(new o0t(0, x1tVar5, cls, "onVideoContainerClick", "onVideoContainerClick()V", 0, (byte) 4));
                    x1tVar6 = this.c;
                    if (x1tVar6 == null) {
                        Intrinsics.h("viewModel");
                        throw null;
                    }
                    yop yopVar2 = new yop(new fnq(x1tVar6.m, new j0s(x1tVar6, yjeVar, (byte) 8)), (byte) 2);
                    lkz lkzVar2 = lkz.f20223a;
                    pfl pflVar2 = new pfl(2, this, GameZoneWindowService.class, "handleUiState", "handleUiState(Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowScreenUiState;)V", 4, (byte) 19);
                    cyuVar = this.f22014a;
                    qjj.W(x0x.Q((glz) cyuVar.f5196a), null, null, new fns(yopVar2, this, pflVar2, (yje) null), 3);
                    x1tVar7 = this.c;
                    if (x1tVar7 == null) {
                        Intrinsics.h("viewModel");
                        throw null;
                    }
                    qjj.W(x0x.Q((glz) cyuVar.f5196a), null, null, new fns((gmq) x1tVar7.n, this, new j0s(this, yjeVar, (byte) 9), (yje) null), 3);
                }
            } else if (action.equals("ACTION_STOP")) {
                x1t x1tVar9 = this.c;
                if (x1tVar9 == null) {
                    Intrinsics.h("viewModel");
                    throw null;
                }
                x1tVar9.h.b(false);
                x1tVar9.c.v();
                stopSelf();
            } else {
                GameZoneView gameZoneViewA8 = a();
                gameZoneViewA8.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                hxm0.x(gameZoneViewA8, getResources().getDimensionPixelSize(R.dimen.space_12));
                a8z a8zVar3 = this.f;
                WindowManager.LayoutParams layoutParams3 = (WindowManager.LayoutParams) a8zVar3.getValue();
                layoutParams3.gravity = 17;
                layoutParams3.x = 0;
                layoutParams3.y = 0;
                ((WindowManager) this.e.getValue()).addView(gameZoneViewA8, (WindowManager.LayoutParams) a8zVar3.getValue());
                gameZoneViewA8.getBroadcastingContainerView().setOnTouchListener(new z1t(this, gameZoneViewA8));
                gameZoneViewA = a();
                x1tVar = this.c;
                if (x1tVar == null) {
                    Intrinsics.h("viewModel");
                    throw null;
                }
                gameZoneViewA.setJavascriptInterface(x1tVar);
                gameZoneViewA2 = a();
                x1tVar2 = this.c;
                if (x1tVar2 == null) {
                    Intrinsics.h("viewModel");
                    throw null;
                }
                gameZoneViewA2.getClass();
                gameZoneViewA2.getBroadcastingControlPanelView().u(x1tVar2);
                gameZoneViewA3 = a();
                x1tVar3 = this.c;
                if (x1tVar3 == null) {
                    Intrinsics.h("viewModel");
                    throw null;
                }
                cls = x1t.class;
                gameZoneViewA3.setOnMediaFileReddyListener(new o0t(0, x1tVar3, cls, "onMediaFileReddy", "onMediaFileReddy()V", 0, (byte) 2));
                gameZoneViewA4 = a();
                x1tVar4 = this.c;
                if (x1tVar4 == null) {
                    Intrinsics.h("viewModel");
                    throw null;
                }
                gameZoneViewA4.setOnErrorListener(new o0t(0, x1tVar4, cls, "onBroadcastingError", "onBroadcastingError()V", 0, (byte) 3));
                gameZoneViewA5 = a();
                x1tVar5 = this.c;
                if (x1tVar5 == null) {
                    Intrinsics.h("viewModel");
                    throw null;
                }
                gameZoneViewA5.setOnContainerClickListener(new o0t(0, x1tVar5, cls, "onVideoContainerClick", "onVideoContainerClick()V", 0, (byte) 4));
                x1tVar6 = this.c;
                if (x1tVar6 == null) {
                    Intrinsics.h("viewModel");
                    throw null;
                }
                yop yopVar3 = new yop(new fnq(x1tVar6.m, new j0s(x1tVar6, yjeVar, (byte) 8)), (byte) 2);
                lkz lkzVar3 = lkz.f20223a;
                pfl pflVar3 = new pfl(2, this, GameZoneWindowService.class, "handleUiState", "handleUiState(Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowScreenUiState;)V", 4, (byte) 19);
                cyuVar = this.f22014a;
                qjj.W(x0x.Q((glz) cyuVar.f5196a), null, null, new fns(yopVar3, this, pflVar3, (yje) null), 3);
                x1tVar7 = this.c;
                if (x1tVar7 == null) {
                    Intrinsics.h("viewModel");
                    throw null;
                }
                qjj.W(x0x.Q((glz) cyuVar.f5196a), null, null, new fns((gmq) x1tVar7.n, this, new j0s(this, yjeVar, (byte) 9), (yje) null), 3);
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
