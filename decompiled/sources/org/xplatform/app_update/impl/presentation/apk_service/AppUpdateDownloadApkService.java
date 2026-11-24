package org.xplatform.app_update.impl.presentation.apk_service;

import a.al3;
import a.bby;
import a.dcl;
import a.e9d0;
import a.gl3;
import a.glz;
import a.i8;
import a.krv0;
import a.lkz;
import a.lr;
import a.maz;
import a.mlz;
import a.n0o0;
import a.prc;
import a.qjj;
import a.sj3;
import a.tg3;
import a.v3c;
import a.x0x;
import a.yje;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.IBinder;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.functions.Function0;
import org.xplatform.app_update.impl.presentation.apk_service.AppUpdateDownloadApkService;

/* JADX INFO: loaded from: classes3.dex */
public final class AppUpdateDownloadApkService extends mlz {
    public static final /* synthetic */ int g = 0;
    public final n0o0 b;
    public Notification.Builder c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;

    public AppUpdateDownloadApkService() {
        final byte b = 0;
        this.b = maz.b(new Function0(this) { // from class: a.zk3
            public final /* synthetic */ AppUpdateDownloadApkService b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                AppUpdateDownloadApkService appUpdateDownloadApkService = this.b;
                switch (b2) {
                    case 0:
                        int i = AppUpdateDownloadApkService.g;
                        Object systemService = appUpdateDownloadApkService.getSystemService(RemoteMessageConst.NOTIFICATION);
                        systemService.getClass();
                        return (NotificationManager) systemService;
                    case 1:
                        int i2 = AppUpdateDownloadApkService.g;
                        ComponentCallbacks2 application = appUpdateDownloadApkService.getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(hl3.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof hl3)) {
                                ze3Var = null;
                            }
                            hl3 hl3Var = (hl3) ze3Var;
                            if (hl3Var != null) {
                                Application application2 = appUpdateDownloadApkService.getApplication();
                                application2.getClass();
                                esg0 esg0VarJ = y0x0.J(application2);
                                cad cadVar = hl3Var.f13237a;
                                vwb0 vwb0Var = hl3Var.b;
                                kl5 kl5Var = hl3Var.c;
                                q7d0 q7d0Var = hl3Var.d;
                                us3 us3Var = hl3Var.e;
                                vwb0Var.getClass();
                                q7d0Var.getClass();
                                us3Var.getClass();
                                return new o8i(cadVar, esg0VarJ, kl5Var, q7d0Var, us3Var);
                            }
                        }
                        jf4.n(b1j.i(hl3.class, "Cannot create dependency "));
                        return null;
                    case 2:
                        o8i o8iVar = (o8i) appUpdateDownloadApkService.d.getValue();
                        q7d0 q7d0Var2 = o8iVar.f24829a;
                        us3 us3Var2 = o8iVar.b;
                        b8u b8uVar = new b8u(new jm3(q7d0Var2, us3Var2, (byte) 0));
                        f4u f4uVar = new f4u(new jm3(o8iVar.f24829a, us3Var2, (byte) 0), (byte) 22);
                        kl5 kl5Var2 = o8iVar.c;
                        mne mneVarH = ((psc) o8iVar.d.b).h();
                        x1x.x(mneVarH);
                        esg0 esg0Var = o8iVar.e;
                        cl3 cl3Var = new cl3(esg0Var.Q());
                        dcl dclVar = (dcl) esg0Var.f8326a;
                        return new gl3(b8uVar, f4uVar, kl5Var2, mneVarH, cl3Var, new ani0(new prc(dclVar)), new a7u(esg0Var.Q()), new cl3(esg0Var.Q()), new wsf0((Object) new prc(dclVar), (byte) 25), new a7u(esg0Var.Q()), new zx10(esg0Var.Q()));
                    default:
                        int i3 = AppUpdateDownloadApkService.g;
                        return new al3(appUpdateDownloadApkService);
                }
            }
        });
        final byte b2 = 1;
        this.d = maz.b(new Function0(this) { // from class: a.zk3
            public final /* synthetic */ AppUpdateDownloadApkService b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                AppUpdateDownloadApkService appUpdateDownloadApkService = this.b;
                switch (b3) {
                    case 0:
                        int i = AppUpdateDownloadApkService.g;
                        Object systemService = appUpdateDownloadApkService.getSystemService(RemoteMessageConst.NOTIFICATION);
                        systemService.getClass();
                        return (NotificationManager) systemService;
                    case 1:
                        int i2 = AppUpdateDownloadApkService.g;
                        ComponentCallbacks2 application = appUpdateDownloadApkService.getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(hl3.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof hl3)) {
                                ze3Var = null;
                            }
                            hl3 hl3Var = (hl3) ze3Var;
                            if (hl3Var != null) {
                                Application application2 = appUpdateDownloadApkService.getApplication();
                                application2.getClass();
                                esg0 esg0VarJ = y0x0.J(application2);
                                cad cadVar = hl3Var.f13237a;
                                vwb0 vwb0Var = hl3Var.b;
                                kl5 kl5Var = hl3Var.c;
                                q7d0 q7d0Var = hl3Var.d;
                                us3 us3Var = hl3Var.e;
                                vwb0Var.getClass();
                                q7d0Var.getClass();
                                us3Var.getClass();
                                return new o8i(cadVar, esg0VarJ, kl5Var, q7d0Var, us3Var);
                            }
                        }
                        jf4.n(b1j.i(hl3.class, "Cannot create dependency "));
                        return null;
                    case 2:
                        o8i o8iVar = (o8i) appUpdateDownloadApkService.d.getValue();
                        q7d0 q7d0Var2 = o8iVar.f24829a;
                        us3 us3Var2 = o8iVar.b;
                        b8u b8uVar = new b8u(new jm3(q7d0Var2, us3Var2, (byte) 0));
                        f4u f4uVar = new f4u(new jm3(o8iVar.f24829a, us3Var2, (byte) 0), (byte) 22);
                        kl5 kl5Var2 = o8iVar.c;
                        mne mneVarH = ((psc) o8iVar.d.b).h();
                        x1x.x(mneVarH);
                        esg0 esg0Var = o8iVar.e;
                        cl3 cl3Var = new cl3(esg0Var.Q());
                        dcl dclVar = (dcl) esg0Var.f8326a;
                        return new gl3(b8uVar, f4uVar, kl5Var2, mneVarH, cl3Var, new ani0(new prc(dclVar)), new a7u(esg0Var.Q()), new cl3(esg0Var.Q()), new wsf0((Object) new prc(dclVar), (byte) 25), new a7u(esg0Var.Q()), new zx10(esg0Var.Q()));
                    default:
                        int i3 = AppUpdateDownloadApkService.g;
                        return new al3(appUpdateDownloadApkService);
                }
            }
        });
        final byte b3 = 2;
        this.e = maz.b(new Function0(this) { // from class: a.zk3
            public final /* synthetic */ AppUpdateDownloadApkService b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                AppUpdateDownloadApkService appUpdateDownloadApkService = this.b;
                switch (b4) {
                    case 0:
                        int i = AppUpdateDownloadApkService.g;
                        Object systemService = appUpdateDownloadApkService.getSystemService(RemoteMessageConst.NOTIFICATION);
                        systemService.getClass();
                        return (NotificationManager) systemService;
                    case 1:
                        int i2 = AppUpdateDownloadApkService.g;
                        ComponentCallbacks2 application = appUpdateDownloadApkService.getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(hl3.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof hl3)) {
                                ze3Var = null;
                            }
                            hl3 hl3Var = (hl3) ze3Var;
                            if (hl3Var != null) {
                                Application application2 = appUpdateDownloadApkService.getApplication();
                                application2.getClass();
                                esg0 esg0VarJ = y0x0.J(application2);
                                cad cadVar = hl3Var.f13237a;
                                vwb0 vwb0Var = hl3Var.b;
                                kl5 kl5Var = hl3Var.c;
                                q7d0 q7d0Var = hl3Var.d;
                                us3 us3Var = hl3Var.e;
                                vwb0Var.getClass();
                                q7d0Var.getClass();
                                us3Var.getClass();
                                return new o8i(cadVar, esg0VarJ, kl5Var, q7d0Var, us3Var);
                            }
                        }
                        jf4.n(b1j.i(hl3.class, "Cannot create dependency "));
                        return null;
                    case 2:
                        o8i o8iVar = (o8i) appUpdateDownloadApkService.d.getValue();
                        q7d0 q7d0Var2 = o8iVar.f24829a;
                        us3 us3Var2 = o8iVar.b;
                        b8u b8uVar = new b8u(new jm3(q7d0Var2, us3Var2, (byte) 0));
                        f4u f4uVar = new f4u(new jm3(o8iVar.f24829a, us3Var2, (byte) 0), (byte) 22);
                        kl5 kl5Var2 = o8iVar.c;
                        mne mneVarH = ((psc) o8iVar.d.b).h();
                        x1x.x(mneVarH);
                        esg0 esg0Var = o8iVar.e;
                        cl3 cl3Var = new cl3(esg0Var.Q());
                        dcl dclVar = (dcl) esg0Var.f8326a;
                        return new gl3(b8uVar, f4uVar, kl5Var2, mneVarH, cl3Var, new ani0(new prc(dclVar)), new a7u(esg0Var.Q()), new cl3(esg0Var.Q()), new wsf0((Object) new prc(dclVar), (byte) 25), new a7u(esg0Var.Q()), new zx10(esg0Var.Q()));
                    default:
                        int i3 = AppUpdateDownloadApkService.g;
                        return new al3(appUpdateDownloadApkService);
                }
            }
        });
        final byte b4 = 3;
        this.f = maz.b(new Function0(this) { // from class: a.zk3
            public final /* synthetic */ AppUpdateDownloadApkService b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                AppUpdateDownloadApkService appUpdateDownloadApkService = this.b;
                switch (b5) {
                    case 0:
                        int i = AppUpdateDownloadApkService.g;
                        Object systemService = appUpdateDownloadApkService.getSystemService(RemoteMessageConst.NOTIFICATION);
                        systemService.getClass();
                        return (NotificationManager) systemService;
                    case 1:
                        int i2 = AppUpdateDownloadApkService.g;
                        ComponentCallbacks2 application = appUpdateDownloadApkService.getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(hl3.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof hl3)) {
                                ze3Var = null;
                            }
                            hl3 hl3Var = (hl3) ze3Var;
                            if (hl3Var != null) {
                                Application application2 = appUpdateDownloadApkService.getApplication();
                                application2.getClass();
                                esg0 esg0VarJ = y0x0.J(application2);
                                cad cadVar = hl3Var.f13237a;
                                vwb0 vwb0Var = hl3Var.b;
                                kl5 kl5Var = hl3Var.c;
                                q7d0 q7d0Var = hl3Var.d;
                                us3 us3Var = hl3Var.e;
                                vwb0Var.getClass();
                                q7d0Var.getClass();
                                us3Var.getClass();
                                return new o8i(cadVar, esg0VarJ, kl5Var, q7d0Var, us3Var);
                            }
                        }
                        jf4.n(b1j.i(hl3.class, "Cannot create dependency "));
                        return null;
                    case 2:
                        o8i o8iVar = (o8i) appUpdateDownloadApkService.d.getValue();
                        q7d0 q7d0Var2 = o8iVar.f24829a;
                        us3 us3Var2 = o8iVar.b;
                        b8u b8uVar = new b8u(new jm3(q7d0Var2, us3Var2, (byte) 0));
                        f4u f4uVar = new f4u(new jm3(o8iVar.f24829a, us3Var2, (byte) 0), (byte) 22);
                        kl5 kl5Var2 = o8iVar.c;
                        mne mneVarH = ((psc) o8iVar.d.b).h();
                        x1x.x(mneVarH);
                        esg0 esg0Var = o8iVar.e;
                        cl3 cl3Var = new cl3(esg0Var.Q());
                        dcl dclVar = (dcl) esg0Var.f8326a;
                        return new gl3(b8uVar, f4uVar, kl5Var2, mneVarH, cl3Var, new ani0(new prc(dclVar)), new a7u(esg0Var.Q()), new cl3(esg0Var.Q()), new wsf0((Object) new prc(dclVar), (byte) 25), new a7u(esg0Var.Q()), new zx10(esg0Var.Q()));
                    default:
                        int i3 = AppUpdateDownloadApkService.g;
                        return new al3(appUpdateDownloadApkService);
                }
            }
        });
    }

    public final void a() {
        this.c = null;
        gl3 gl3Var = (gl3) this.e.getValue();
        bby bbyVar = gl3Var.l;
        if (bbyVar != null) {
            v3c.N(bbyVar);
        }
        ((krv0) gl3Var.h.f4536a.b).f18787a = true;
        ((dcl) ((prc) gl3Var.i.b).b).f5851a.n(null);
        stopSelf();
        stopForeground(true);
        ((NotificationManager) this.b.getValue()).cancel(1024);
    }

    @Override // a.mlz, android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        super.onBind(intent);
        String stringExtra = intent.getStringExtra("KEY_APP_UPDATE_APK_VERSION");
        if (stringExtra == null) {
            stringExtra = "0.0.0";
        }
        String stringExtra2 = intent.getStringExtra("KEY_APP_UPDATE_APK_URL");
        if (stringExtra2 != null) {
            ((gl3) this.e.getValue()).w(sj3.Y(this), stringExtra, stringExtra2);
            return (al3) this.f.getValue();
        }
        e9d0.o();
        return null;
    }

    @Override // a.mlz, android.app.Service
    public final void onCreate() {
        super.onCreate();
        lr lrVar = new lr(((gl3) this.e.getValue()).m, (byte) 15);
        lkz lkzVar = lkz.f20223a;
        qjj.W(x0x.Q((glz) this.f22014a.f5196a), null, null, new tg3(lrVar, this, new i8(2, this, AppUpdateDownloadApkService.class, "handleEvent", "handleEvent(Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkEvent;)V", 4, (byte) 25), (yje) null), 3);
    }

    @Override // a.mlz, android.app.Service
    public final void onDestroy() {
        a();
        super.onDestroy();
    }
}
