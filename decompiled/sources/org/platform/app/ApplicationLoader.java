package org.platform.app;

import a.aac;
import a.aaf;
import a.af3;
import a.ak3;
import a.aot0;
import a.b1;
import a.bk2;
import a.clz;
import a.cpv0;
import a.ctf0;
import a.d5c;
import a.dnt0;
import a.ds3;
import a.dvj;
import a.e0g0;
import a.ebc;
import a.ejc;
import a.es00;
import a.es3;
import a.f33;
import a.f7u;
import a.g8i;
import a.gbe0;
import a.gyf;
import a.h5a;
import a.hl50;
import a.i1w0;
import a.is3;
import a.j0g0;
import a.j8f;
import a.jhg0;
import a.jvq;
import a.k5n0;
import a.kin0;
import a.kxq;
import a.l1e0;
import a.ls00;
import a.m1e;
import a.maz;
import a.mbl;
import a.n0o0;
import a.n5k0;
import a.ngd;
import a.o1w0;
import a.o2z;
import a.o4e;
import a.oa;
import a.pd;
import a.pkd;
import a.ppv0;
import a.pu50;
import a.q1e;
import a.qem0;
import a.qjj;
import a.r8x;
import a.rdj;
import a.rj3;
import a.rwj;
import a.s0d;
import a.sac;
import a.sje;
import a.sl50;
import a.sre0;
import a.std;
import a.sue;
import a.tfq;
import a.tvk;
import a.tx3;
import a.uaq0;
import a.ujn;
import a.uk50;
import a.uq70;
import a.vmv;
import a.vsd;
import a.wcf0;
import a.wyu;
import a.xgi0;
import a.xl60;
import a.xs00;
import a.yje;
import a.yl60;
import a.ys00;
import a.ys10;
import a.yw9;
import a.z7z;
import a.zko;
import a.zyk;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.webkit.WebSettings;
import com.appsflyer.sdk_base.referrer.Payload;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.client1.features.appactivity.ApplicationActivity;
import org.xplatform.coupon.impl.notify.CouponNotificationWorker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lorg/platform/app/ApplicationLoader;", "Landroid/app/Application;", "La/zyk;", "La/xs00;", "La/ak3;", "La/vmv;", "La/af3;", "La/vsd;", "", "La/jhg0;", "La/rj3;", "La/q1e;", "La/n5k0;", "<init>", "()V", "a/xf0", Payload.TYPE_APP}, k = 1, mv = {2, 4, 0}, xi = 48)
public class ApplicationLoader extends Application implements zyk, xs00, ak3, vmv, af3, vsd, jhg0, rj3, q1e, n5k0 {
    private static final int magic = 3;
    public static ApplicationLoader v1;
    public z7z A;
    public z7z B;
    public z7z Y;
    public final sje Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z7z f46267a;
    public z7z b;
    public z7z c;
    public z7z d;
    public z7z e;
    public z7z f;
    public final sje f1;
    public z7z g;
    public final sje g1;
    public z7z h;
    public final sje h1;
    public z7z i;
    public final n0o0 i1;
    public z7z j;
    public final n0o0 j1;
    public z7z k;
    public final n0o0 k1;
    public z7z l;
    public final n0o0 l1;
    public z7z m;
    public final n0o0 m1;
    public z7z n;
    public final n0o0 n1;
    public z7z o;
    public final n0o0 o1;
    public z7z p;
    public final n0o0 p1;
    public z7z q;
    public final n0o0 q1;
    public z7z r;
    public final n0o0 r1;
    public z7z s;
    public final n0o0 s1;
    public z7z t;
    public final n0o0 t1;
    public z7z u;
    public final n0o0 u1;
    public z7z v;
    public z7z w;
    public z7z x;
    public z7z y;
    public ejc z;

    public ApplicationLoader() {
        kin0 kin0VarE = qem0.e();
        rwj rwjVar = tvk.f34603a;
        dvj dvjVar = dvj.c;
        this.Z = d5c.a(e.c(kin0VarE, dvjVar));
        this.f1 = d5c.a(e.c(qem0.e(), dvjVar));
        this.g1 = d5c.a(e.c(qem0.e(), dvjVar));
        this.h1 = d5c.a(e.c(qem0.e(), ys10.f43147a));
        this.i1 = maz.b(new f33((byte) 26));
        this.j1 = maz.b(new f33((byte) 28));
        this.k1 = maz.b(new ds3(this, (byte) 10));
        this.l1 = maz.b(new ds3(this, (byte) 11));
        this.m1 = maz.b(new ds3(this, (byte) 12));
        v1 = this;
        this.n1 = maz.b(new ds3(this, (byte) 13));
        this.o1 = maz.b(new ds3(this, (byte) 14));
        this.p1 = maz.b(new ds3(this, (byte) 0));
        this.q1 = maz.b(new ds3(this, (byte) 1));
        this.r1 = maz.b(new ds3(this, (byte) 2));
        this.s1 = maz.b(new ds3(this, (byte) 8));
        this.t1 = maz.b(new ds3(this, (byte) 9));
        this.u1 = maz.b(new f33((byte) 27));
    }

    @Override // a.n5k0
    public final gbe0 a(Context context) {
        context.getClass();
        f7u f7uVar = new f7u(context);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList4.add(new yw9(new uk50(new pu50(new ds3(this, (byte) 3), (byte) 11)), sre0.f32672a.b(aot0.class), (byte) 17));
        arrayList.add(new s0d());
        f7uVar.d = new ngd(aac.e0(arrayList), aac.e0(arrayList2), aac.e0(arrayList3), aac.e0(arrayList4), aac.e0(arrayList5));
        return f7uVar.b();
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Resources resources;
        Configuration configuration = new Configuration((context == null || (resources = context.getResources()) == null) ? null : resources.getConfiguration());
        configuration.fontScale = l1e0.c(configuration.fontScale, 0.8f, 1.5f);
        super.attachBaseContext(context != null ? context.createConfigurationContext(configuration) : null);
    }

    public final void b(uaq0 uaq0Var) {
        z7z z7zVar = this.d;
        if (z7zVar == null) {
            Intrinsics.h("getThemeUseCase");
            throw null;
        }
        if (((wyu) z7zVar.get()).a() != uaq0Var) {
            n0o0 n0o0Var = this.m1;
            WeakReference weakReference = ((jvq) n0o0Var.getValue()).c;
            ApplicationActivity applicationActivity = weakReference != null ? (ApplicationActivity) weakReference.get() : null;
            WeakReference weakReference2 = ((jvq) n0o0Var.getValue()).b;
            kxq kxqVar = weakReference2 != null ? (kxq) weakReference2.get() : null;
            if (applicationActivity != null) {
                applicationActivity.recreate();
            }
            if (!Intrinsics.d(applicationActivity, kxqVar) && kxqVar != null) {
                kxqVar.recreate();
            }
        }
        z7z z7zVar2 = this.f;
        if (z7zVar2 != null) {
            ((dnt0) z7zVar2.get()).a();
        } else {
            Intrinsics.h("updateThemeWorkersScenario");
            throw null;
        }
    }

    public final g8i c() {
        return (g8i) this.s1.getValue();
    }

    @Override // a.af3
    public final wcf0 d() {
        return c().h7();
    }

    public final void e() {
        boolean z = !Intrinsics.d(ujn.h, "https://mob-experience.space");
        z7z z7zVar = this.t;
        if (z7zVar == null) {
            Intrinsics.h("lastTimeUpdatedUseCase");
            throw null;
        }
        if (((es00) ((o2z) z7zVar.get()).f24555a.c).f8306a != 0) {
            g(z);
        }
    }

    public final void f(Throwable th) {
        n0o0 n0o0Var = this.i1;
        j8f j8fVar = ((tfq) n0o0Var.getValue()).f33879a;
        String str = "START_EXCEPTION";
        ((aaf) j8fVar.o.b).a(new b1(j8fVar, str, Boolean.toString(true), (byte) 8));
        ((tfq) n0o0Var.getValue()).c(th);
    }

    public final void g(boolean z) {
        z7z z7zVar = this.s;
        if (z) {
            if (z7zVar != null) {
                ((ls00) z7zVar.get()).a();
                return;
            } else {
                Intrinsics.h("localTimeDiffWorkerProvider");
                throw null;
            }
        }
        if (z7zVar == null) {
            Intrinsics.h("localTimeDiffWorkerProvider");
            throw null;
        }
        ls00 ls00Var = (ls00) z7zVar.get();
        sje sjeVar = ls00Var.c;
        if (sjeVar != null) {
            d5c.G(sjeVar, null);
        }
        ls00Var.c = null;
        cpv0 cpv0VarD = cpv0.d(ls00Var.f20556a);
        cpv0VarD.getClass();
        std stdVar = cpv0VarD.b.f;
        xgi0 xgi0Var = cpv0VarD.d.f9946a;
        xgi0Var.getClass();
        r8x.T(stdVar, "CancelWorkByName_LocalTimeDiffWorker", xgi0Var, new h5a("LocalTimeDiffWorker", cpv0VarD));
    }

    @Override // a.jhg0
    public final i1w0 getRouter() {
        ejc ejcVar = this.z;
        if (ejcVar != null) {
            return ejcVar.f7902a;
        }
        Intrinsics.h("cicerone");
        throw null;
    }

    public final void h() {
        z7z z7zVar = this.n;
        if (z7zVar == null) {
            Intrinsics.h("couponFeature");
            throw null;
        }
        if (((sue) z7zVar.get()).t().f28087a.f36880a.a().getBoolean("COUPON_CAN_START_NOTIFY_WORKER", false)) {
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            cpv0 cpv0VarD = cpv0.d(applicationContext);
            cpv0VarD.getClass();
            sl50 sl50Var = sl50.f32381a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            o4e o4eVar = new o4e(new hl50(null), sl50.f32381a, false, false, false, false, -1L, -1L, CollectionsKt.P0(linkedHashSet));
            zko zkoVar = zko.f44542a;
            xl60 xl60Var = (xl60) ((xl60) new xl60(CouponNotificationWorker.class).g("CouponNotificationWorker")).x(1200L, TimeUnit.SECONDS);
            ((ppv0) xl60Var.c).j = o4eVar;
            cpv0VarD.c("CouponNotificationWorker", zkoVar, (yl60) xl60Var.k());
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        getApplicationContext().getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
    }

    @Override // android.app.Application
    public final void onCreate() {
        ebc.f7512a = false;
        super.onCreate();
        try {
            e0g0 e0g0Var = j0g0.b;
            WebSettings.getDefaultUserAgent(this);
        } catch (Throwable unused) {
            e0g0 e0g0Var2 = j0g0.b;
        }
        float f = pkd.f27129a;
        sje sjeVar = this.Z;
        sjeVar.getClass();
        yje yjeVar = null;
        qjj.W(sjeVar, tvk.f34603a, null, new pd(2, yjeVar, (byte) 27), 2);
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(new gyf(defaultUncaughtExceptionHandler, this));
        }
        g8i g8iVarC = c();
        this.f46267a = mbl.a(g8iVarC.v);
        this.b = mbl.a(g8iVarC.R4);
        this.c = mbl.a(g8iVarC.b2);
        this.d = mbl.a(g8iVarC.H2);
        this.e = mbl.a(g8iVarC.Jk);
        this.f = mbl.a(g8iVarC.Kk);
        this.g = mbl.a(g8iVarC.Lk);
        this.h = mbl.a(g8iVarC.O3);
        this.i = mbl.a(g8iVarC.Z3);
        this.j = mbl.a(g8iVarC.k1);
        this.k = mbl.a(g8iVarC.p5);
        this.l = mbl.a(g8iVarC.Mk);
        this.m = mbl.a(g8iVarC.P2);
        this.n = mbl.a(g8iVarC.l3);
        this.o = mbl.a(g8iVarC.Nk);
        this.p = mbl.a(g8iVarC.q);
        this.q = mbl.a(g8iVarC.zi);
        this.r = mbl.a(g8iVarC.l5);
        mbl.a(g8iVarC.T2);
        this.s = mbl.a(g8iVarC.U4);
        this.t = mbl.a(g8iVarC.T4);
        this.u = mbl.a(g8iVarC.Ok);
        this.v = mbl.a(g8iVarC.J1);
        this.w = mbl.a(g8iVarC.c5);
        this.x = mbl.a(g8iVarC.B2);
        this.y = mbl.a(g8iVarC.S3);
        o1w0 o1w0Var = (o1w0) g8iVarC.S3.get();
        o1w0Var.getClass();
        i1w0 i1w0Var = new i1w0();
        o1w0Var.a(i1w0Var);
        this.z = new ejc(i1w0Var);
        this.A = mbl.a(g8iVarC.w3);
        this.B = mbl.a(g8iVarC.i1);
        this.Y = mbl.a(g8iVarC.I2);
        Class<ApplicationLoader> cls = ApplicationLoader.class;
        sac.V(sjeVar, new bk2(1, this, cls, "logNonFatalError", "logNonFatalError(Ljava/lang/Throwable;)V", 0, (byte) 22), null, dvj.c, new is3(this, yjeVar, (byte) 3), 10);
        rdj rdjVar = rdj.f30294a;
        z7z z7zVar = this.Y;
        if (z7zVar == null) {
            Intrinsics.h("resourceManager");
            throw null;
        }
        rdj.l(((ctf0) z7zVar.get()).h());
        registerActivityLifecycleCallbacks((jvq) this.m1.getValue());
        k5n0.f17729a = tx3.g0(new ys00[]{new ys00()});
        ((clz) this.j1.getValue()).x().a((es3) this.k1.getValue());
        sac.V(sjeVar, new bk2(1, this, cls, "logNonFatalError", "logNonFatalError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, null, new oa(this, this, yjeVar, (byte) 20), 14);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onLowMemory() {
        z7z z7zVar = this.q;
        if (z7zVar != null) {
            if (z7zVar == null) {
                Intrinsics.h("onlineCallEngine");
                throw null;
            }
            ((uq70) z7zVar.get()).close();
        }
        super.onLowMemory();
    }

    @Override // android.app.Application
    public final void onTerminate() {
        d5c.G(this.Z, null);
        d5c.G(this.f1, null);
        d5c.G(this.g1, null);
        h();
        g(false);
        ((clz) this.j1.getValue()).x().f((es3) this.k1.getValue());
        z7z z7zVar = this.v;
        if (z7zVar == null) {
            Intrinsics.h("connectionObserver");
            throw null;
        }
        ((m1e) z7zVar.get()).d();
        super.onTerminate();
    }
}
