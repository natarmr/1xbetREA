package org.xplatform.feature.online_call.impl.service;

import a.af3;
import a.b1j;
import a.bt70;
import a.cad;
import a.cd60;
import a.daf;
import a.et70;
import a.fiu0;
import a.gii0;
import a.glz;
import a.gmq;
import a.gq50;
import a.gr70;
import a.i89;
import a.jf4;
import a.js70;
import a.knx;
import a.lkz;
import a.m1e;
import a.miu0;
import a.mlz;
import a.o5d0;
import a.ohs0;
import a.ol;
import a.omi;
import a.qjj;
import a.rt70;
import a.sre0;
import a.uq70;
import a.x0x;
import a.x1x;
import a.yje;
import a.ze3;
import a.zm70;
import a.zn00;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class OnlineCallService extends mlz {
    public static final String d = ohs0.n(sre0.f32672a.b(OnlineCallService.class).v(), ".STOP_CALL");
    public fiu0 b;
    public rt70 c;

    @Override // a.mlz, android.app.Service
    public final void onCreate() {
        ComponentCallbacks2 application = getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(et70.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof et70)) {
                ze3Var = null;
            }
            et70 et70Var = (et70) ze3Var;
            if (et70Var != null) {
                String str = d;
                str.getClass();
                cad cadVar = et70Var.d;
                gr70 gr70Var = et70Var.f8364a;
                uq70 uq70Var = et70Var.b;
                m1e m1eVar = et70Var.c;
                ol olVar = et70Var.e;
                js70 js70Var = et70Var.f;
                gii0 gii0Var = et70Var.g;
                gr70Var.getClass();
                m1eVar.getClass();
                uq70Var.getClass();
                olVar.getClass();
                js70Var.getClass();
                gii0Var.getClass();
                this.b = new fiu0(Collections.singletonMap(rt70.class, (omi) new daf(gr70Var, cadVar, str, m1eVar, uq70Var, olVar, js70Var, gii0Var).m));
                x1x.x(gr70Var.y());
                super.onCreate();
                fiu0 fiu0Var = this.b;
                if (fiu0Var == null) {
                    Intrinsics.h("viewModelFactory");
                    throw null;
                }
                rt70 rt70Var = (rt70) new zn00((mlz) this, (miu0) fiu0Var).h0(rt70.class);
                this.c = rt70Var;
                cd60 cd60Var = new cd60(this, (byte) 21);
                lkz lkzVar = lkz.f20223a;
                gmq gmqVarC = rt70Var.C();
                lkz lkzVar2 = lkz.f20223a;
                qjj.W(x0x.Q((glz) this.f22014a.f5196a), null, null, new zm70((i89) gmqVarC, this, new gq50(2, cd60Var, knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 21), (yje) null), 3);
                return;
            }
        }
        jf4.n(b1j.i(et70.class, "Cannot create dependency "));
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (Intrinsics.d(intent != null ? intent.getAction() : null, d)) {
            rt70 rt70Var = this.c;
            if (rt70Var == null) {
                Intrinsics.h("viewModel");
                throw null;
            }
            rt70Var.x(bt70.f3169a);
        }
        return super.onStartCommand(intent, i, i2);
    }
}
