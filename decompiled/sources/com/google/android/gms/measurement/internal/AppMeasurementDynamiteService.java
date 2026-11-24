package com.google.android.gms.measurement.internal;

import a.aa60;
import a.azw0;
import a.b1x0;
import a.bkw0;
import a.btw0;
import a.c2x0;
import a.cgp;
import a.cvw0;
import a.dqw0;
import a.dy3;
import a.eqw0;
import a.f7x0;
import a.fxw0;
import a.gpw0;
import a.gvw;
import a.gx3;
import a.hcp0;
import a.jf4;
import a.k1x0;
import a.kxw0;
import a.lfr;
import a.mfr;
import a.mpw0;
import a.mzw0;
import a.nzw0;
import a.p1x0;
import a.pb90;
import a.pzw0;
import a.quw0;
import a.r1x0;
import a.rpw0;
import a.s0x;
import a.svs0;
import a.szw0;
import a.uuw0;
import a.vtw0;
import a.wow0;
import a.x4w0;
import a.x6x0;
import a.zzw0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends wow0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kxw0 f45539a;
    public final gx3 b;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f45539a = null;
        this.b = new gx3(0);
    }

    public final void C() {
        if (this.f45539a != null) {
            return;
        }
        jf4.n("Attempting to perform action before initialize.");
    }

    public final void D(String str, gpw0 gpw0Var) {
        C();
        x6x0 x6x0Var = this.f45539a.i;
        kxw0.e(x6x0Var);
        x6x0Var.Z1(str, gpw0Var);
    }

    @Override // a.yow0
    public void beginAdUnitExposure(String str, long j) {
        C();
        dqw0 dqw0Var = this.f45539a.n;
        kxw0.d(dqw0Var);
        dqw0Var.n1(j, str);
    }

    @Override // a.yow0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        b1x0Var.z1(bundle, str, str2);
    }

    @Override // a.yow0
    public void clearMeasurementEnabled(long j) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        b1x0Var.n1();
        fxw0 fxw0Var = ((kxw0) b1x0Var.b).g;
        kxw0.g(fxw0Var);
        Object obj = null;
        fxw0Var.v1(new mfr(b1x0Var, obj, false, (byte) 24));
    }

    @Override // a.yow0
    public void endAdUnitExposure(String str, long j) {
        C();
        dqw0 dqw0Var = this.f45539a.n;
        kxw0.d(dqw0Var);
        dqw0Var.o1(j, str);
    }

    @Override // a.yow0
    public void generateEventId(gpw0 gpw0Var) {
        C();
        x6x0 x6x0Var = this.f45539a.i;
        kxw0.e(x6x0Var);
        long jK2 = x6x0Var.k2();
        C();
        x6x0 x6x0Var2 = this.f45539a.i;
        kxw0.e(x6x0Var2);
        x6x0Var2.a2(gpw0Var, jK2);
    }

    @Override // a.yow0
    public void getAppInstanceId(gpw0 gpw0Var) {
        C();
        fxw0 fxw0Var = this.f45539a.g;
        kxw0.g(fxw0Var);
        fxw0Var.v1(new lfr(this, gpw0Var, false, (byte) 24));
    }

    @Override // a.yow0
    public void getCachedAppInstanceId(gpw0 gpw0Var) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        D((String) b1x0Var.h.get(), gpw0Var);
    }

    @Override // a.yow0
    public void getConditionalUserProperties(String str, String str2, gpw0 gpw0Var) {
        C();
        fxw0 fxw0Var = this.f45539a.g;
        kxw0.g(fxw0Var);
        fxw0Var.v1(new pb90((Object) this, (Object) gpw0Var, (Object) str, (Object) str2, false, (byte) 12));
    }

    @Override // a.yow0
    public void getCurrentScreenClass(gpw0 gpw0Var) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        c2x0 c2x0Var = ((kxw0) b1x0Var.b).l;
        kxw0.f(c2x0Var);
        r1x0 r1x0Var = c2x0Var.d;
        D(r1x0Var != null ? r1x0Var.b : null, gpw0Var);
    }

    @Override // a.yow0
    public void getCurrentScreenName(gpw0 gpw0Var) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        c2x0 c2x0Var = ((kxw0) b1x0Var.b).l;
        kxw0.f(c2x0Var);
        r1x0 r1x0Var = c2x0Var.d;
        D(r1x0Var != null ? r1x0Var.f29705a : null, gpw0Var);
    }

    @Override // a.yow0
    public void getGmpAppId(gpw0 gpw0Var) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        D(b1x0Var.A1(), gpw0Var);
    }

    @Override // a.yow0
    public void getMaxUserProperties(String str, gpw0 gpw0Var) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        s0x.E(str);
        bkw0 bkw0Var = ((kxw0) b1x0Var.b).d;
        C();
        x6x0 x6x0Var = this.f45539a.i;
        kxw0.e(x6x0Var);
        x6x0Var.b2(gpw0Var, 25);
    }

    @Override // a.yow0
    public void getSessionId(gpw0 gpw0Var) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        fxw0 fxw0Var = ((kxw0) b1x0Var.b).g;
        kxw0.g(fxw0Var);
        fxw0Var.v1(new lfr(b1x0Var, gpw0Var));
    }

    @Override // a.yow0
    public void getTestFlag(gpw0 gpw0Var, int i) {
        C();
        if (i == 0) {
            x6x0 x6x0Var = this.f45539a.i;
            kxw0.e(x6x0Var);
            b1x0 b1x0Var = this.f45539a.m;
            kxw0.f(b1x0Var);
            AtomicReference atomicReference = new AtomicReference();
            fxw0 fxw0Var = ((kxw0) b1x0Var.b).g;
            kxw0.g(fxw0Var);
            x6x0Var.Z1((String) fxw0Var.w1(atomicReference, 15000L, "String test flag value", new pzw0(b1x0Var, atomicReference, (byte) 1)), gpw0Var);
            return;
        }
        if (i == 1) {
            x6x0 x6x0Var2 = this.f45539a.i;
            kxw0.e(x6x0Var2);
            b1x0 b1x0Var2 = this.f45539a.m;
            kxw0.f(b1x0Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            fxw0 fxw0Var2 = ((kxw0) b1x0Var2.b).g;
            kxw0.g(fxw0Var2);
            x6x0Var2.a2(gpw0Var, ((Long) fxw0Var2.w1(atomicReference2, 15000L, "long test flag value", new zzw0(b1x0Var2, atomicReference2, (byte) 0))).longValue());
            return;
        }
        if (i == 2) {
            x6x0 x6x0Var3 = this.f45539a.i;
            kxw0.e(x6x0Var3);
            b1x0 b1x0Var3 = this.f45539a.m;
            kxw0.f(b1x0Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            fxw0 fxw0Var3 = ((kxw0) b1x0Var3.b).g;
            kxw0.g(fxw0Var3);
            double dDoubleValue = ((Double) fxw0Var3.w1(atomicReference3, 15000L, "double test flag value", new zzw0(b1x0Var3, atomicReference3, (byte) 1))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                gpw0Var.u(bundle);
                return;
            } catch (RemoteException e) {
                uuw0 uuw0Var = ((kxw0) x6x0Var3.b).f;
                kxw0.g(uuw0Var);
                uuw0Var.j.b(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            x6x0 x6x0Var4 = this.f45539a.i;
            kxw0.e(x6x0Var4);
            b1x0 b1x0Var4 = this.f45539a.m;
            kxw0.f(b1x0Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            fxw0 fxw0Var4 = ((kxw0) b1x0Var4.b).g;
            kxw0.g(fxw0Var4);
            x6x0Var4.b2(gpw0Var, ((Integer) fxw0Var4.w1(atomicReference4, 15000L, "int test flag value", new pzw0(b1x0Var4, atomicReference4, (byte) 2))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        x6x0 x6x0Var5 = this.f45539a.i;
        kxw0.e(x6x0Var5);
        b1x0 b1x0Var5 = this.f45539a.m;
        kxw0.f(b1x0Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        fxw0 fxw0Var5 = ((kxw0) b1x0Var5.b).g;
        kxw0.g(fxw0Var5);
        x6x0Var5.d2(gpw0Var, ((Boolean) fxw0Var5.w1(atomicReference5, 15000L, "boolean test flag value", new pzw0(b1x0Var5, atomicReference5, (byte) 0))).booleanValue());
    }

    @Override // a.yow0
    public void getUserProperties(String str, String str2, boolean z, gpw0 gpw0Var) {
        C();
        fxw0 fxw0Var = this.f45539a.g;
        kxw0.g(fxw0Var);
        fxw0Var.v1(new mzw0(this, gpw0Var, str, str2, z));
    }

    @Override // a.yow0
    public void initForTests(Map map) {
        C();
    }

    @Override // a.yow0
    public void initialize(gvw gvwVar, zzdb zzdbVar, long j) {
        kxw0 kxw0Var = this.f45539a;
        if (kxw0Var == null) {
            Context context = (Context) aa60.H(gvwVar);
            s0x.H(context);
            this.f45539a = kxw0.l(context, zzdbVar, Long.valueOf(j), null);
        } else {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.j.a("Attempting to initialize multiple times");
        }
    }

    @Override // a.yow0
    public void initializeWithElapsedTime(gvw gvwVar, zzdb zzdbVar, long j, long j2) {
        kxw0 kxw0Var = this.f45539a;
        if (kxw0Var == null) {
            Context context = (Context) aa60.H(gvwVar);
            s0x.H(context);
            this.f45539a = kxw0.l(context, zzdbVar, Long.valueOf(j), Long.valueOf(j2));
        } else {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.j.a("Attempting to initialize multiple times");
        }
    }

    @Override // a.yow0
    public void isDataCollectionEnabled(gpw0 gpw0Var) {
        C();
        fxw0 fxw0Var = this.f45539a.g;
        kxw0.g(fxw0Var);
        fxw0Var.v1(new mfr(this, gpw0Var, false, (byte) 28));
    }

    @Override // a.yow0
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        b1x0Var.q1(str, str2, bundle, z, z2, j, 0L);
    }

    @Override // a.yow0
    public void logEventAndBundle(String str, String str2, Bundle bundle, gpw0 gpw0Var, long j) {
        C();
        s0x.E(str2);
        String str3 = true != this.f45539a.d.x1(null, btw0.f1) ? Payload.TYPE_APP : "auto";
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        zzbh zzbhVar = new zzbh(str2, new zzbf(bundle), str3, j, 0L);
        fxw0 fxw0Var = this.f45539a.g;
        kxw0.g(fxw0Var);
        fxw0Var.v1(new pb90((Object) this, (Object) gpw0Var, (Object) zzbhVar, (Object) str, false, (byte) 7));
    }

    @Override // a.yow0
    public void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        b1x0Var.q1(str, str2, bundle, z, z2, j, j2);
    }

    @Override // a.yow0
    public void logHealthData(int i, String str, gvw gvwVar, gvw gvwVar2, gvw gvwVar3) {
        C();
        Object objH = gvwVar == null ? null : aa60.H(gvwVar);
        Object objH2 = gvwVar2 == null ? null : aa60.H(gvwVar2);
        Object objH3 = gvwVar3 != null ? aa60.H(gvwVar3) : null;
        uuw0 uuw0Var = this.f45539a.f;
        kxw0.g(uuw0Var);
        uuw0Var.r1(i, true, false, str, objH, objH2, objH3);
    }

    @Override // a.yow0
    public void onActivityCreated(gvw gvwVar, Bundle bundle, long j) {
        C();
        Activity activity = (Activity) aa60.H(gvwVar);
        s0x.H(activity);
        onActivityCreatedByScionActivityInfo(zzdd.m(activity), bundle, j);
    }

    @Override // a.yow0
    public void onActivityCreatedByScionActivityInfo(zzdd zzddVar, Bundle bundle, long j) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        cgp cgpVar = b1x0Var.d;
        if (cgpVar != null) {
            b1x0 b1x0Var2 = this.f45539a.m;
            kxw0.f(b1x0Var2);
            b1x0Var2.E1();
            cgpVar.j(zzddVar, bundle);
        }
    }

    @Override // a.yow0
    public void onActivityDestroyed(gvw gvwVar, long j) {
        C();
        Activity activity = (Activity) aa60.H(gvwVar);
        s0x.H(activity);
        onActivityDestroyedByScionActivityInfo(zzdd.m(activity), j);
    }

    @Override // a.yow0
    public void onActivityDestroyedByScionActivityInfo(zzdd zzddVar, long j) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        cgp cgpVar = b1x0Var.d;
        if (cgpVar != null) {
            b1x0 b1x0Var2 = this.f45539a.m;
            kxw0.f(b1x0Var2);
            b1x0Var2.E1();
            cgpVar.k(zzddVar);
        }
    }

    @Override // a.yow0
    public void onActivityPaused(gvw gvwVar, long j) {
        C();
        Activity activity = (Activity) aa60.H(gvwVar);
        s0x.H(activity);
        onActivityPausedByScionActivityInfo(zzdd.m(activity), j);
    }

    @Override // a.yow0
    public void onActivityPausedByScionActivityInfo(zzdd zzddVar, long j) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        cgp cgpVar = b1x0Var.d;
        if (cgpVar != null) {
            b1x0 b1x0Var2 = this.f45539a.m;
            kxw0.f(b1x0Var2);
            b1x0Var2.E1();
            cgpVar.l(zzddVar);
        }
    }

    @Override // a.yow0
    public void onActivityResumed(gvw gvwVar, long j) {
        C();
        Activity activity = (Activity) aa60.H(gvwVar);
        s0x.H(activity);
        onActivityResumedByScionActivityInfo(zzdd.m(activity), j);
    }

    @Override // a.yow0
    public void onActivityResumedByScionActivityInfo(zzdd zzddVar, long j) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        cgp cgpVar = b1x0Var.d;
        if (cgpVar != null) {
            b1x0 b1x0Var2 = this.f45539a.m;
            kxw0.f(b1x0Var2);
            b1x0Var2.E1();
            cgpVar.m(zzddVar);
        }
    }

    @Override // a.yow0
    public void onActivitySaveInstanceState(gvw gvwVar, gpw0 gpw0Var, long j) {
        C();
        Activity activity = (Activity) aa60.H(gvwVar);
        s0x.H(activity);
        onActivitySaveInstanceStateByScionActivityInfo(zzdd.m(activity), gpw0Var, j);
    }

    @Override // a.yow0
    public void onActivitySaveInstanceStateByScionActivityInfo(zzdd zzddVar, gpw0 gpw0Var, long j) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        cgp cgpVar = b1x0Var.d;
        Bundle bundle = new Bundle();
        if (cgpVar != null) {
            b1x0 b1x0Var2 = this.f45539a.m;
            kxw0.f(b1x0Var2);
            b1x0Var2.E1();
            cgpVar.n(zzddVar, bundle);
        }
        try {
            gpw0Var.u(bundle);
        } catch (RemoteException e) {
            uuw0 uuw0Var = this.f45539a.f;
            kxw0.g(uuw0Var);
            uuw0Var.j.b(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // a.yow0
    public void onActivityStarted(gvw gvwVar, long j) {
        C();
        Activity activity = (Activity) aa60.H(gvwVar);
        s0x.H(activity);
        onActivityStartedByScionActivityInfo(zzdd.m(activity), j);
    }

    @Override // a.yow0
    public void onActivityStartedByScionActivityInfo(zzdd zzddVar, long j) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        if (b1x0Var.d != null) {
            b1x0 b1x0Var2 = this.f45539a.m;
            kxw0.f(b1x0Var2);
            b1x0Var2.E1();
        }
    }

    @Override // a.yow0
    public void onActivityStopped(gvw gvwVar, long j) {
        C();
        Activity activity = (Activity) aa60.H(gvwVar);
        s0x.H(activity);
        onActivityStoppedByScionActivityInfo(zzdd.m(activity), j);
    }

    @Override // a.yow0
    public void onActivityStoppedByScionActivityInfo(zzdd zzddVar, long j) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        if (b1x0Var.d != null) {
            b1x0 b1x0Var2 = this.f45539a.m;
            kxw0.f(b1x0Var2);
            b1x0Var2.E1();
        }
    }

    @Override // a.yow0
    public void performAction(Bundle bundle, gpw0 gpw0Var, long j) {
        C();
        gpw0Var.u(null);
    }

    @Override // a.yow0
    public void registerOnMeasurementEventListener(rpw0 rpw0Var) {
        Object f7x0Var;
        C();
        gx3 gx3Var = this.b;
        synchronized (gx3Var) {
            try {
                f7x0Var = (azw0) gx3Var.get(Integer.valueOf(rpw0Var.zzf()));
                if (f7x0Var == null) {
                    f7x0Var = new f7x0(this, rpw0Var);
                    gx3Var.put(Integer.valueOf(rpw0Var.zzf()), f7x0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        b1x0Var.n1();
        if (b1x0Var.f.add(f7x0Var)) {
            return;
        }
        uuw0 uuw0Var = ((kxw0) b1x0Var.b).f;
        kxw0.g(uuw0Var);
        uuw0Var.j.a("OnEventListener already registered");
    }

    @Override // a.yow0
    @Deprecated
    public void resetAnalyticsData(long j) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        b1x0Var.h.set(null);
        fxw0 fxw0Var = ((kxw0) b1x0Var.b).g;
        kxw0.g(fxw0Var);
        fxw0Var.v1(new nzw0(b1x0Var, j, (byte) 1));
    }

    @Override // a.yow0
    public void resetAnalyticsDataWithElapsedTime(long j, long j2) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        b1x0Var.h.set(null);
        fxw0 fxw0Var = ((kxw0) b1x0Var.b).g;
        kxw0.g(fxw0Var);
        fxw0Var.v1(new nzw0(b1x0Var, j, (byte) 1));
    }

    @Override // a.yow0
    public void retrieveAndUploadBatches(mpw0 mpw0Var) {
        p1x0 p1x0Var;
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        b1x0Var.n1();
        kxw0 kxw0Var = (kxw0) b1x0Var.b;
        fxw0 fxw0Var = kxw0Var.g;
        kxw0.g(fxw0Var);
        if (fxw0Var.s1()) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.g.a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        fxw0 fxw0Var2 = kxw0Var.g;
        kxw0.g(fxw0Var2);
        if (Thread.currentThread() == fxw0Var2.e) {
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.g.a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean zE = svs0.e();
        uuw0 uuw0Var3 = kxw0Var.f;
        if (zE) {
            kxw0.g(uuw0Var3);
            uuw0Var3.g.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        kxw0.g(uuw0Var3);
        uuw0Var3.o.a("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        boolean z2 = false;
        int size = 0;
        int i = 0;
        while (!z2) {
            uuw0 uuw0Var4 = kxw0Var.f;
            kxw0.g(uuw0Var4);
            uuw0Var4.o.a("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            fxw0 fxw0Var3 = kxw0Var.g;
            kxw0.g(fxw0Var3);
            fxw0Var3.w1(atomicReference, 10000L, "[sgtm] Getting upload batches", new zzw0(b1x0Var, atomicReference, (byte) 3, z));
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.f45548a;
            if (list.isEmpty()) {
                break;
            }
            uuw0 uuw0Var5 = kxw0Var.f;
            kxw0.g(uuw0Var5);
            uuw0Var5.o.b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                zzom zzomVar = (zzom) it.next();
                try {
                    URL url = new URI(zzomVar.c).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    vtw0 vtw0VarK = ((kxw0) b1x0Var.b).k();
                    vtw0VarK.n1();
                    s0x.H(vtw0VarK.h);
                    String str = vtw0VarK.h;
                    kxw0 kxw0Var2 = (kxw0) b1x0Var.b;
                    uuw0 uuw0Var6 = kxw0Var2.f;
                    kxw0.g(uuw0Var6);
                    quw0 quw0Var = uuw0Var6.o;
                    Long lValueOf = Long.valueOf(zzomVar.f45546a);
                    quw0Var.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzomVar.c, Integer.valueOf(zzomVar.b.length));
                    if (!TextUtils.isEmpty(zzomVar.g)) {
                        uuw0 uuw0Var7 = kxw0Var2.f;
                        kxw0.g(uuw0Var7);
                        uuw0Var7.o.c(lValueOf, zzomVar.g, "[sgtm] Uploading data from app. row_id");
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = zzomVar.d;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    k1x0 k1x0Var = kxw0Var2.o;
                    kxw0.g(k1x0Var);
                    byte[] bArr = zzomVar.b;
                    x4w0 x4w0Var = new x4w0(b1x0Var, atomicReference2, zzomVar);
                    k1x0Var.o1();
                    s0x.H(url);
                    s0x.H(bArr);
                    fxw0 fxw0Var4 = ((kxw0) k1x0Var.b).g;
                    kxw0.g(fxw0Var4);
                    fxw0Var4.y1(new cvw0(k1x0Var, str, url, bArr, map, x4w0Var));
                    try {
                        x6x0 x6x0Var = kxw0Var2.i;
                        kxw0.e(x6x0Var);
                        kxw0 kxw0Var3 = (kxw0) x6x0Var.b;
                        kxw0Var3.k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    kxw0Var3.k.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        uuw0 uuw0Var8 = ((kxw0) b1x0Var.b).f;
                        kxw0.g(uuw0Var8);
                        uuw0Var8.j.a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    p1x0Var = atomicReference2.get() == null ? p1x0.UNKNOWN : (p1x0) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    uuw0 uuw0Var9 = ((kxw0) b1x0Var.b).f;
                    kxw0.g(uuw0Var9);
                    uuw0Var9.g.d("[sgtm] Bad upload url for row_id", zzomVar.c, Long.valueOf(zzomVar.f45546a), e);
                    p1x0Var = p1x0.FAILURE;
                }
                if (p1x0Var != p1x0.SUCCESS) {
                    if (p1x0Var == p1x0.BACKOFF) {
                        z2 = true;
                        break;
                    }
                } else {
                    i++;
                }
            }
            z = false;
        }
        uuw0 uuw0Var10 = kxw0Var.f;
        kxw0.g(uuw0Var10);
        uuw0Var10.o.c(Integer.valueOf(size), Integer.valueOf(i), "[sgtm] Completed client-side batch upload work. total, success");
        try {
            mpw0Var.zze();
        } catch (RemoteException e2) {
            kxw0 kxw0Var4 = this.f45539a;
            s0x.H(kxw0Var4);
            uuw0 uuw0Var11 = kxw0Var4.f;
            kxw0.g(uuw0Var11);
            uuw0Var11.j.b(e2, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // a.yow0
    public void setConditionalUserProperty(Bundle bundle, long j) {
        C();
        kxw0 kxw0Var = this.f45539a;
        if (bundle == null) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.g.a("Conditional user property must not be null");
        } else {
            b1x0 b1x0Var = kxw0Var.m;
            kxw0.f(b1x0Var);
            b1x0Var.y1(bundle, j);
        }
    }

    @Override // a.yow0
    public void setConsent(Bundle bundle, long j) {
    }

    @Override // a.yow0
    public void setConsentThirdParty(Bundle bundle, long j) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        b1x0Var.F1(bundle, -20, j);
    }

    @Override // a.yow0
    public void setCurrentScreen(gvw gvwVar, String str, String str2, long j) {
        C();
        Activity activity = (Activity) aa60.H(gvwVar);
        s0x.H(activity);
        setCurrentScreenByScionActivityInfo(zzdd.m(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r2 > 500) goto L27;
     */
    @Override // a.yow0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd r5, java.lang.String r6, java.lang.String r7, long r8) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdd, java.lang.String, java.lang.String, long):void");
    }

    @Override // a.yow0
    public void setDataCollectionEnabled(boolean z) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        b1x0Var.n1();
        fxw0 fxw0Var = ((kxw0) b1x0Var.b).g;
        kxw0.g(fxw0Var);
        fxw0Var.v1(new dy3(b1x0Var, z));
    }

    @Override // a.yow0
    public void setDefaultEventParameters(Bundle bundle) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        fxw0 fxw0Var = ((kxw0) b1x0Var.b).g;
        kxw0.g(fxw0Var);
        fxw0Var.v1(new szw0(b1x0Var, bundle2, (byte) 1));
    }

    @Override // a.yow0
    public void setEventInterceptor(rpw0 rpw0Var) {
        C();
        boolean z = false;
        hcp0 hcp0Var = new hcp0(this, rpw0Var, z, (byte) 22);
        fxw0 fxw0Var = this.f45539a.g;
        kxw0.g(fxw0Var);
        boolean zS1 = fxw0Var.s1();
        kxw0 kxw0Var = this.f45539a;
        if (!zS1) {
            fxw0 fxw0Var2 = kxw0Var.g;
            kxw0.g(fxw0Var2);
            fxw0Var2.v1(new mfr(this, hcp0Var, z, (byte) 25));
            return;
        }
        b1x0 b1x0Var = kxw0Var.m;
        kxw0.f(b1x0Var);
        b1x0Var.m1();
        b1x0Var.n1();
        hcp0 hcp0Var2 = b1x0Var.e;
        if (hcp0Var != hcp0Var2) {
            s0x.J("EventInterceptor already set.", hcp0Var2 == null);
        }
        b1x0Var.e = hcp0Var;
    }

    @Override // a.yow0
    public void setInstanceIdProvider(eqw0 eqw0Var) {
        C();
    }

    @Override // a.yow0
    public void setMeasurementEnabled(boolean z, long j) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        Boolean boolValueOf = Boolean.valueOf(z);
        b1x0Var.n1();
        fxw0 fxw0Var = ((kxw0) b1x0Var.b).g;
        kxw0.g(fxw0Var);
        fxw0Var.v1(new mfr(b1x0Var, boolValueOf, false, (byte) 24));
    }

    @Override // a.yow0
    public void setMinimumSessionDuration(long j) {
        C();
    }

    @Override // a.yow0
    public void setSessionTimeoutDuration(long j) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        fxw0 fxw0Var = ((kxw0) b1x0Var.b).g;
        kxw0.g(fxw0Var);
        fxw0Var.v1(new nzw0(b1x0Var, j, (byte) 0));
    }

    @Override // a.yow0
    public void setSgtmDebugInfo(Intent intent) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        kxw0 kxw0Var = (kxw0) b1x0Var.b;
        Uri data = intent.getData();
        if (data == null) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.m.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.m.a("[sgtm] Preview Mode was not enabled.");
            kxw0Var.d.d = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        uuw0 uuw0Var3 = kxw0Var.f;
        kxw0.g(uuw0Var3);
        uuw0Var3.m.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        kxw0Var.d.d = queryParameter2;
    }

    @Override // a.yow0
    public void setUserId(String str, long j) {
        C();
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        kxw0 kxw0Var = (kxw0) b1x0Var.b;
        if (str != null && TextUtils.isEmpty(str)) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.j.a("User ID must be non-empty or null");
        } else {
            fxw0 fxw0Var = kxw0Var.g;
            kxw0.g(fxw0Var);
            fxw0Var.v1(new mfr((Object) b1x0Var, (Object) str, (byte) 27));
            b1x0Var.v1(null, "_id", str, true, j);
        }
    }

    @Override // a.yow0
    public void setUserProperty(String str, String str2, gvw gvwVar, boolean z, long j) {
        C();
        Object objH = aa60.H(gvwVar);
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        b1x0Var.v1(str, str2, objH, z, j);
    }

    @Override // a.yow0
    public void unregisterOnMeasurementEventListener(rpw0 rpw0Var) {
        Object f7x0Var;
        C();
        gx3 gx3Var = this.b;
        synchronized (gx3Var) {
            f7x0Var = (azw0) gx3Var.remove(Integer.valueOf(rpw0Var.zzf()));
        }
        if (f7x0Var == null) {
            f7x0Var = new f7x0(this, rpw0Var);
        }
        b1x0 b1x0Var = this.f45539a.m;
        kxw0.f(b1x0Var);
        b1x0Var.n1();
        if (b1x0Var.f.remove(f7x0Var)) {
            return;
        }
        uuw0 uuw0Var = ((kxw0) b1x0Var.b).f;
        kxw0.g(uuw0Var);
        uuw0Var.j.a("OnEventListener had not been registered");
    }
}
