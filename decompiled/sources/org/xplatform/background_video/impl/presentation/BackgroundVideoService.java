package org.xplatform.background_video.impl.presentation;

import a.bby;
import a.glz;
import a.gmq;
import a.jiu0;
import a.lkz;
import a.maz;
import a.me5;
import a.mlz;
import a.n0o0;
import a.p7m0;
import a.pe5;
import a.qe5;
import a.qjj;
import a.sac;
import a.sj3;
import a.v3c;
import a.vp3;
import a.x0x;
import a.yje;
import a.ze5;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams;
import org.xplatform.background_video.impl.presentation.BackgroundVideoService;

/* JADX INFO: loaded from: classes3.dex */
public final class BackgroundVideoService extends mlz {
    public static final /* synthetic */ int d = 0;
    public final n0o0 b;
    public final n0o0 c;

    public BackgroundVideoService() {
        final byte b = 0;
        this.b = maz.b(new Function0(this) { // from class: a.le5
            public final /* synthetic */ BackgroundVideoService b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                BackgroundVideoService backgroundVideoService = this.b;
                switch (b2) {
                    case 0:
                        int i = BackgroundVideoService.d;
                        ComponentCallbacks2 application = backgroundVideoService.getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(id5.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof id5)) {
                                ze3Var = null;
                            }
                            id5 id5Var = (id5) ze3Var;
                            if (id5Var != null) {
                                cad cadVar = id5Var.f14566a;
                                azj0 azj0Var = id5Var.b;
                                vwb0 vwb0Var = id5Var.c;
                                ie5 ie5Var = id5Var.d;
                                ie5 ie5Var2 = id5Var.e;
                                azj0Var.getClass();
                                vwb0Var.getClass();
                                ie5Var.getClass();
                                ie5Var2.getClass();
                                return new k9i(cadVar, azj0Var, ie5Var, ie5Var2);
                            }
                        }
                        jf4.n(b1j.i(id5.class, "Cannot create dependency "));
                        return null;
                    default:
                        k9i k9iVar = (k9i) backgroundVideoService.b.getValue();
                        b5v b5vVar = new b5v(k9iVar.a(), k9iVar.b());
                        nw20 nw20Var = new nw20(k9iVar.a(), k9iVar.b());
                        j910 j910Var = new j910(k9iVar.a(), k9iVar.b(), (byte) 21);
                        u8u u8uVar = new u8u(k9iVar.a(), k9iVar.b(), (byte) 10);
                        b5v b5vVar2 = new b5v(k9iVar.a(), k9iVar.b());
                        g090 g090Var = new g090(k9iVar.a(), k9iVar.b());
                        azj0 azj0Var2 = k9iVar.d;
                        vqc vqcVar = new vqc(azj0Var2);
                        nqd nqdVar = new nqd((byte) 11);
                        psc pscVar = (psc) k9iVar.f17917a.b;
                        mne mneVarH = pscVar.h();
                        x1x.x(mneVarH);
                        cad cadVar2 = new cad(new y3v(vqcVar, nqdVar, mneVarH, (byte) 29), (byte) 16);
                        lrc lrcVar = new lrc(azj0Var2);
                        nqd nqdVar2 = new nqd((byte) 10);
                        mne mneVarH2 = pscVar.h();
                        x1x.x(mneVarH2);
                        ocl oclVar = new ocl(new y3v(lrcVar, nqdVar2, mneVarH2, (byte) 3));
                        mne mneVarH3 = pscVar.h();
                        x1x.x(mneVarH3);
                        return new ze5(b5vVar, nw20Var, j910Var, u8uVar, b5vVar2, g090Var, cadVar2, oclVar, mneVarH3);
                }
            }
        });
        final byte b2 = 1;
        this.c = maz.b(new Function0(this) { // from class: a.le5
            public final /* synthetic */ BackgroundVideoService b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                BackgroundVideoService backgroundVideoService = this.b;
                switch (b3) {
                    case 0:
                        int i = BackgroundVideoService.d;
                        ComponentCallbacks2 application = backgroundVideoService.getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(id5.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof id5)) {
                                ze3Var = null;
                            }
                            id5 id5Var = (id5) ze3Var;
                            if (id5Var != null) {
                                cad cadVar = id5Var.f14566a;
                                azj0 azj0Var = id5Var.b;
                                vwb0 vwb0Var = id5Var.c;
                                ie5 ie5Var = id5Var.d;
                                ie5 ie5Var2 = id5Var.e;
                                azj0Var.getClass();
                                vwb0Var.getClass();
                                ie5Var.getClass();
                                ie5Var2.getClass();
                                return new k9i(cadVar, azj0Var, ie5Var, ie5Var2);
                            }
                        }
                        jf4.n(b1j.i(id5.class, "Cannot create dependency "));
                        return null;
                    default:
                        k9i k9iVar = (k9i) backgroundVideoService.b.getValue();
                        b5v b5vVar = new b5v(k9iVar.a(), k9iVar.b());
                        nw20 nw20Var = new nw20(k9iVar.a(), k9iVar.b());
                        j910 j910Var = new j910(k9iVar.a(), k9iVar.b(), (byte) 21);
                        u8u u8uVar = new u8u(k9iVar.a(), k9iVar.b(), (byte) 10);
                        b5v b5vVar2 = new b5v(k9iVar.a(), k9iVar.b());
                        g090 g090Var = new g090(k9iVar.a(), k9iVar.b());
                        azj0 azj0Var2 = k9iVar.d;
                        vqc vqcVar = new vqc(azj0Var2);
                        nqd nqdVar = new nqd((byte) 11);
                        psc pscVar = (psc) k9iVar.f17917a.b;
                        mne mneVarH = pscVar.h();
                        x1x.x(mneVarH);
                        cad cadVar2 = new cad(new y3v(vqcVar, nqdVar, mneVarH, (byte) 29), (byte) 16);
                        lrc lrcVar = new lrc(azj0Var2);
                        nqd nqdVar2 = new nqd((byte) 10);
                        mne mneVarH2 = pscVar.h();
                        x1x.x(mneVarH2);
                        ocl oclVar = new ocl(new y3v(lrcVar, nqdVar2, mneVarH2, (byte) 3));
                        mne mneVarH3 = pscVar.h();
                        x1x.x(mneVarH3);
                        return new ze5(b5vVar, nw20Var, j910Var, u8uVar, b5vVar2, g090Var, cadVar2, oclVar, mneVarH3);
                }
            }
        });
    }

    @Override // a.mlz, android.app.Service
    public final void onCreate() {
        super.onCreate();
        p7m0 p7m0Var = ((ze5) this.c.getValue()).l;
        lkz lkzVar = lkz.f20223a;
        qjj.W(x0x.Q((glz) this.f22014a.f5196a), null, null, new me5((gmq) p7m0Var, this, new vp3(2, this, BackgroundVideoService.class, "handleEvent", "handleEvent(Lorg/xplatform/background_video/impl/presentation/BackgroundVideoEvent;)V", 4, (byte) 11), (yje) null), 3);
    }

    @Override // a.mlz, android.app.Service
    public final void onDestroy() {
        Iterator it = ((ze5) this.c.getValue()).k.iterator();
        while (it.hasNext()) {
            v3c.N((bby) it.next());
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        BackgroundVideoDownloadServiceParams backgroundVideoDownloadServiceParams;
        if (intent == null || (backgroundVideoDownloadServiceParams = (BackgroundVideoDownloadServiceParams) intent.getParcelableExtra("KEY_DOWNLOAD_BACKGROUND_SERVICE_PARAMS")) == null) {
            return super.onStartCommand(intent, i, i2);
        }
        ze5 ze5Var = (ze5) this.c.getValue();
        long jZ = sj3.Z(this);
        ze5Var.getClass();
        sac.V(jiu0.a(ze5Var), pe5.f26834a, null, ze5Var.j.f22085a, new qe5((Object) backgroundVideoDownloadServiceParams, (Object) ze5Var, jZ, (yje) null, (byte) 0), 10);
        return super.onStartCommand(intent, i, i2);
    }
}
