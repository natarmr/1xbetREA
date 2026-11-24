package org.xplatform.services.mobile_services.impl.presentation.services;

import a.a8z;
import a.af3;
import a.b1j;
import a.c1d0;
import a.cpv0;
import a.gmo;
import a.gst0;
import a.h760;
import a.hl50;
import a.j1q0;
import a.jcs;
import a.jf4;
import a.jii;
import a.kd30;
import a.kj5;
import a.l6a;
import a.lp4;
import a.lrc;
import a.maj;
import a.maz;
import a.mne;
import a.myb;
import a.nkb;
import a.nr00;
import a.nv20;
import a.o4e;
import a.o5d0;
import a.ppv0;
import a.q7d0;
import a.qde0;
import a.rer;
import a.rl40;
import a.rpt;
import a.sd60;
import a.sl50;
import a.tfq;
import a.u940;
import a.ugf0;
import a.us00;
import a.v6j0;
import a.vby;
import a.vdd0;
import a.vwb0;
import a.w940;
import a.x1x;
import a.xav;
import a.xl60;
import a.xr;
import a.yav;
import a.yl60;
import a.ze3;
import a.zko;
import a.zlt0;
import a.zx10;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.services.mobile_services.impl.workers.CustomerIONewTokenWorker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "Lorg/xplatform/services/mobile_services/impl/presentation/services/BaseMessagingService;", "<init>", "()V", "", "onCreate", "onDestroy", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "onMessageReceived", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "", "token", "onNewToken", "(Ljava/lang/String;)V", "", "availableToCreate", "createService", "(Z)V", "La/w940;", "messagingServiceHandler", "La/w940;", "getMessagingServiceHandler", "()La/w940;", "setMessagingServiceHandler", "(La/w940;)V", "La/u940;", "messagingServiceCustomerIOHandler", "La/u940;", "getMessagingServiceCustomerIOHandler", "()La/u940;", "setMessagingServiceCustomerIOHandler", "(La/u940;)V", "La/xav;", "googleMessagingServiceComponent$delegate", "La/a8z;", "getGoogleMessagingServiceComponent", "()La/xav;", "googleMessagingServiceComponent", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class GoogleMessagingService extends FirebaseMessagingService implements BaseMessagingService {

    /* JADX INFO: renamed from: googleMessagingServiceComponent$delegate, reason: from kotlin metadata */
    private final a8z googleMessagingServiceComponent = maz.b(new jcs(this, 28));
    public u940 messagingServiceCustomerIOHandler;
    public w940 messagingServiceHandler;

    private final xav getGoogleMessagingServiceComponent() {
        return (xav) this.googleMessagingServiceComponent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xav googleMessagingServiceComponent_delegate$lambda$0(GoogleMessagingService googleMessagingService) {
        ComponentCallbacks2 application = googleMessagingService.getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(yav.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof yav)) {
                ze3Var = null;
            }
            yav yavVar = (yav) ze3Var;
            if (yavVar != null) {
                us00 us00Var = yavVar.f42316a;
                nv20 nv20Var = yavVar.b;
                lp4 lp4Var = yavVar.c;
                v6j0 v6j0Var = yavVar.d;
                c1d0 c1d0Var = yavVar.e;
                vby vbyVar = yavVar.f;
                vwb0 vwb0Var = yavVar.g;
                q7d0 q7d0Var = yavVar.h;
                gst0 gst0Var = yavVar.l;
                mne mneVar = yavVar.k;
                h760 h760Var = yavVar.i;
                kd30 kd30Var = yavVar.j;
                sd60 sd60Var = yavVar.m;
                rpt rptVar = yavVar.n;
                zlt0 zlt0Var = yavVar.o;
                l6a l6aVar = yavVar.p;
                j1q0 j1q0Var = yavVar.q;
                lp4Var.getClass();
                v6j0Var.getClass();
                c1d0Var.getClass();
                vbyVar.getClass();
                vwb0Var.getClass();
                q7d0Var.getClass();
                gst0Var.getClass();
                h760Var.getClass();
                l6aVar.getClass();
                j1q0Var.getClass();
                return new jii(lp4Var, mneVar, rptVar, us00Var, nv20Var, kd30Var, h760Var, sd60Var, c1d0Var, j1q0Var, zlt0Var);
            }
        }
        jf4.n(b1j.i(yav.class, "Cannot create dependency "));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMessageReceived$lambda$0(GoogleMessagingService googleMessagingService, Map map) {
        googleMessagingService.getMessagingServiceHandler().d(map);
        return Unit.f46060a;
    }

    @Override // org.xplatform.services.mobile_services.impl.presentation.services.BaseMessagingService
    public void createService(boolean availableToCreate) {
        if (availableToCreate) {
            super.onCreate();
            getMessagingServiceHandler().b();
        } else {
            getPackageManager().setComponentEnabledSetting(new ComponentName(this, (Class<?>) GoogleMessagingService.class), 2, 1);
            stopSelf();
        }
    }

    public final u940 getMessagingServiceCustomerIOHandler() {
        u940 u940Var = this.messagingServiceCustomerIOHandler;
        if (u940Var != null) {
            return u940Var;
        }
        Intrinsics.h("messagingServiceCustomerIOHandler");
        throw null;
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
        jii jiiVar = (jii) getGoogleMessagingServiceComponent();
        us00 us00Var = jiiVar.f16576a;
        myb mybVarI = jiiVar.b.i();
        x1x.x(mybVarI);
        kj5 kj5Var = new kj5();
        kd30 kd30Var = jiiVar.c;
        qde0 qde0Var = new qde0(kd30Var);
        nv20 nv20Var = new nv20(kd30Var);
        qde0 qde0Var2 = new qde0(kd30Var);
        us00 us00Var2 = jiiVar.f16576a;
        GoogleMessagingService_MembersInjector.injectMessagingServiceHandler(this, new w940(us00Var, mybVarI, kj5Var, qde0Var, nv20Var, qde0Var2, new zx10((Context) us00Var2), jiiVar.d, jiiVar.e, jiiVar.f, jiiVar.g, jiiVar.h, new ugf0(new nr00((vdd0) ((lrc) jiiVar.i.f24171a).b)), jiiVar.j, jiiVar.k));
        GoogleMessagingService_MembersInjector.injectMessagingServiceCustomerIOHandler(this, new u940(us00Var2));
        new AnonymousClass1(this).invoke(Boolean.valueOf(((xr) getMessagingServiceHandler().i.f30901a).i() == rl40.GMS));
    }

    @Override // a.vyn, android.app.Service
    public void onDestroy() {
        getMessagingServiceHandler().c();
        super.onDestroy();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        remoteMessage.getClass();
        try {
            HashMap mapM = remoteMessage.m();
            getMessagingServiceHandler().f(mapM);
            if (mapM.isEmpty()) {
                return;
            }
            getMessagingServiceCustomerIOHandler().a(remoteMessage, new gmo(this, mapM, (byte) 28));
        } catch (Exception e) {
            tfq.a().c(e);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String token) {
        token.getClass();
        u940 messagingServiceCustomerIOHandler = getMessagingServiceCustomerIOHandler();
        messagingServiceCustomerIOHandler.getClass();
        us00 us00Var = messagingServiceCustomerIOHandler.f35265a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("KEY_TOKEN", token);
        maj majVar = new maj(linkedHashMap);
        nkb.I(majVar);
        sl50 sl50Var = sl50.f32381a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        o4e o4eVar = new o4e(new hl50(null), sl50.b, false, false, false, false, -1L, -1L, CollectionsKt.P0(linkedHashSet));
        xl60 xl60Var = new xl60(CustomerIONewTokenWorker.class);
        ((ppv0) xl60Var.c).j = o4eVar;
        ((ppv0) xl60Var.c).e = majVar;
        yl60 yl60Var = (yl60) xl60Var.k();
        cpv0 cpv0VarD = cpv0.d(us00Var);
        cpv0VarD.getClass();
        cpv0VarD.c("CustomerIONewTokenWorker", zko.f44542a, yl60Var);
        getMessagingServiceHandler().e(token);
    }

    public final void setMessagingServiceCustomerIOHandler(u940 u940Var) {
        u940Var.getClass();
        this.messagingServiceCustomerIOHandler = u940Var;
    }

    public final void setMessagingServiceHandler(w940 w940Var) {
        w940Var.getClass();
        this.messagingServiceHandler = w940Var;
    }

    /* JADX INFO: renamed from: org.xplatform.services.mobile_services.impl.presentation.services.GoogleMessagingService$onCreate$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 1328)
    public static final /* synthetic */ class AnonymousClass1 extends rer implements Function1<Boolean, Unit> {
        public AnonymousClass1(Object obj) {
            super(1, obj, GoogleMessagingService.class, "createService", "createService(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.f46060a;
        }

        public final void invoke(boolean z) {
            ((GoogleMessagingService) this.receiver).createService(z);
        }
    }
}
