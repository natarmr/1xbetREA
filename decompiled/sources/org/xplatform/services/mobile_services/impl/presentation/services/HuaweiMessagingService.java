package org.xplatform.services.mobile_services.impl.presentation.services;

import a.a8z;
import a.af3;
import a.auw;
import a.b1j;
import a.bdv;
import a.c1d0;
import a.h760;
import a.j1q0;
import a.jf4;
import a.kd30;
import a.kj5;
import a.l6a;
import a.lp4;
import a.lrc;
import a.maz;
import a.mne;
import a.myb;
import a.nr00;
import a.nv20;
import a.o5d0;
import a.q7d0;
import a.qde0;
import a.rer;
import a.rl40;
import a.rpt;
import a.sd60;
import a.tfq;
import a.ugf0;
import a.us00;
import a.v6j0;
import a.vby;
import a.vdd0;
import a.vwb0;
import a.w940;
import a.x1x;
import a.xr;
import a.ze3;
import a.zii;
import a.zlt0;
import a.ztw;
import a.zx10;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lorg/xplatform/services/mobile_services/impl/presentation/services/HuaweiMessagingService;", "Lcom/huawei/hms/push/HmsMessageService;", "Lorg/xplatform/services/mobile_services/impl/presentation/services/BaseMessagingService;", "<init>", "()V", "", "onCreate", "onDestroy", "Lcom/huawei/hms/push/RemoteMessage;", "remoteMessage", "onMessageReceived", "(Lcom/huawei/hms/push/RemoteMessage;)V", "", "token", "onNewToken", "(Ljava/lang/String;)V", "", "availableToCreate", "createService", "(Z)V", "La/w940;", "messagingServiceHandler", "La/w940;", "getMessagingServiceHandler", "()La/w940;", "setMessagingServiceHandler", "(La/w940;)V", "La/ztw;", "huaweiMessagingServiceComponent$delegate", "La/a8z;", "getHuaweiMessagingServiceComponent", "()La/ztw;", "huaweiMessagingServiceComponent", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class HuaweiMessagingService extends HmsMessageService implements BaseMessagingService {

    /* JADX INFO: renamed from: huaweiMessagingServiceComponent$delegate, reason: from kotlin metadata */
    private final a8z huaweiMessagingServiceComponent = maz.b(new bdv(this, 27));
    public w940 messagingServiceHandler;

    private final ztw getHuaweiMessagingServiceComponent() {
        return (ztw) this.huaweiMessagingServiceComponent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ztw huaweiMessagingServiceComponent_delegate$lambda$0(HuaweiMessagingService huaweiMessagingService) {
        ComponentCallbacks2 application = huaweiMessagingService.getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(auw.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof auw)) {
                ze3Var = null;
            }
            auw auwVar = (auw) ze3Var;
            if (auwVar != null) {
                us00 us00Var = auwVar.f1498a;
                v6j0 v6j0Var = auwVar.b;
                c1d0 c1d0Var = auwVar.d;
                lp4 lp4Var = auwVar.e;
                vby vbyVar = auwVar.f;
                vwb0 vwb0Var = auwVar.g;
                q7d0 q7d0Var = auwVar.h;
                nv20 nv20Var = auwVar.c;
                h760 h760Var = auwVar.i;
                mne mneVar = auwVar.j;
                kd30 kd30Var = auwVar.k;
                sd60 sd60Var = auwVar.l;
                rpt rptVar = auwVar.m;
                l6a l6aVar = auwVar.n;
                zlt0 zlt0Var = auwVar.o;
                j1q0 j1q0Var = auwVar.p;
                v6j0Var.getClass();
                c1d0Var.getClass();
                lp4Var.getClass();
                vbyVar.getClass();
                vwb0Var.getClass();
                q7d0Var.getClass();
                h760Var.getClass();
                l6aVar.getClass();
                j1q0Var.getClass();
                return new zii(lp4Var, mneVar, rptVar, us00Var, nv20Var, kd30Var, h760Var, sd60Var, c1d0Var, j1q0Var, zlt0Var);
            }
        }
        jf4.n(b1j.i(auw.class, "Cannot create dependency "));
        return null;
    }

    @Override // org.xplatform.services.mobile_services.impl.presentation.services.BaseMessagingService
    public void createService(boolean availableToCreate) {
        if (availableToCreate) {
            super.onCreate();
            getMessagingServiceHandler().b();
        } else {
            getPackageManager().setComponentEnabledSetting(new ComponentName(this, (Class<?>) HuaweiMessagingService.class), 2, 1);
            stopSelf();
        }
    }

    public final w940 getMessagingServiceHandler() {
        w940 w940Var = this.messagingServiceHandler;
        if (w940Var != null) {
            return w940Var;
        }
        Intrinsics.h("messagingServiceHandler");
        throw null;
    }

    @Override // android.app.Service
    public void onCreate() {
        zii ziiVar = (zii) getHuaweiMessagingServiceComponent();
        us00 us00Var = ziiVar.f44439a;
        myb mybVarI = ziiVar.b.i();
        x1x.x(mybVarI);
        kj5 kj5Var = new kj5();
        kd30 kd30Var = ziiVar.c;
        HuaweiMessagingService_MembersInjector.injectMessagingServiceHandler(this, new w940(us00Var, mybVarI, kj5Var, new qde0(kd30Var), new nv20(kd30Var), new qde0(kd30Var), new zx10((Context) ziiVar.f44439a), ziiVar.d, ziiVar.e, ziiVar.f, ziiVar.g, ziiVar.h, new ugf0(new nr00((vdd0) ((lrc) ziiVar.i.f24171a).b)), ziiVar.j, ziiVar.k));
        new AnonymousClass1(this).invoke(Boolean.valueOf(((xr) getMessagingServiceHandler().i.f30901a).i() == rl40.HMS));
    }

    @Override // com.huawei.hms.push.HmsMessageService, android.app.Service
    public void onDestroy() {
        getMessagingServiceHandler().c();
        super.onDestroy();
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Map<String, String> dataOfMap;
        if (remoteMessage != null) {
            try {
                dataOfMap = remoteMessage.getDataOfMap();
            } catch (Exception e) {
                tfq.a().c(e);
                return;
            }
        } else {
            dataOfMap = null;
        }
        getMessagingServiceHandler().f(dataOfMap);
        if (dataOfMap != null && !dataOfMap.isEmpty()) {
            getMessagingServiceHandler().d(dataOfMap);
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onNewToken(String token) {
        token.getClass();
        super.onNewToken(token);
        getMessagingServiceHandler().e(token);
    }

    public final void setMessagingServiceHandler(w940 w940Var) {
        w940Var.getClass();
        this.messagingServiceHandler = w940Var;
    }

    /* JADX INFO: renamed from: org.xplatform.services.mobile_services.impl.presentation.services.HuaweiMessagingService$onCreate$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 1328)
    public static final /* synthetic */ class AnonymousClass1 extends rer implements Function1<Boolean, Unit> {
        public AnonymousClass1(Object obj) {
            super(1, obj, HuaweiMessagingService.class, "createService", "createService(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.f46060a;
        }

        public final void invoke(boolean z) {
            ((HuaweiMessagingService) this.receiver).createService(z);
        }
    }
}
