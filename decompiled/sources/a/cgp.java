package a;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.zzdd;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayDeque;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class cgp implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4324a;
    public final Object b;

    public cgp() {
        this.f4324a = (byte) 0;
        this.b = new ArrayDeque(10);
    }

    public void a(Intent intent) {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    vp2 vp2Var = (vp2) nfq.d().b(vp2.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (vp2Var != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        wp2 wp2Var = (wp2) vp2Var;
                        if (tnw0.a("fcm") && tnw0.c("fcm", "_ln")) {
                            wrw0 wrw0Var = wp2Var.f39524a.f45538a;
                            wrw0Var.c(new hqw0(wrw0Var, "fcm", "_ln", (Object) string2, true));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(Payload.SOURCE, "Firebase");
                        bundle2.putString("medium", RemoteMessageConst.NOTIFICATION);
                        bundle2.putString("campaign", string2);
                        wp2Var.a("fcm", "_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            x0x.Y(bundle, "_no");
        }
    }

    public void j(zzdd zzddVar, Bundle bundle) {
        Uri uri;
        kxw0 kxw0Var = (kxw0) ((b1x0) this.b).b;
        try {
            try {
                uuw0 uuw0Var = kxw0Var.f;
                kxw0.g(uuw0Var);
                uuw0Var.o.a("onActivityCreated");
                Intent intent = zzddVar.c;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                        uri = null;
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        kxw0.e(kxw0Var.i);
                        String str = x6x0.o2(intent) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter(Payload.RFR);
                        boolean z = bundle == null;
                        fxw0 fxw0Var = kxw0Var.g;
                        kxw0.g(fxw0Var);
                        fxw0Var.v1(new mzw0(this, z, uri, str, queryParameter));
                    }
                }
            } catch (RuntimeException e) {
                uuw0 uuw0Var2 = kxw0Var.f;
                kxw0.g(uuw0Var2);
                uuw0Var2.g.b(e, "Throwable caught in onActivityCreated");
            }
        } finally {
            c2x0 c2x0Var = kxw0Var.l;
            kxw0.f(c2x0Var);
            c2x0Var.s1(zzddVar, bundle);
        }
    }

    public void k(zzdd zzddVar) {
        c2x0 c2x0Var = ((kxw0) ((b1x0) this.b).b).l;
        kxw0.f(c2x0Var);
        synchronized (c2x0Var.m) {
            try {
                if (Objects.equals(c2x0Var.h, zzddVar)) {
                    c2x0Var.h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((kxw0) c2x0Var.b).d.B1()) {
            c2x0Var.g.remove(Integer.valueOf(zzddVar.f45526a));
        }
    }

    public void l(zzdd zzddVar) {
        kxw0 kxw0Var = (kxw0) ((b1x0) this.b).b;
        c2x0 c2x0Var = kxw0Var.l;
        kxw0.f(c2x0Var);
        synchronized (c2x0Var.m) {
            c2x0Var.l = false;
            c2x0Var.i = true;
        }
        kxw0 kxw0Var2 = (kxw0) c2x0Var.b;
        kxw0Var2.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (kxw0Var2.d.B1()) {
            r1x0 r1x0VarV1 = c2x0Var.v1(zzddVar);
            c2x0Var.e = c2x0Var.d;
            c2x0Var.d = null;
            fxw0 fxw0Var = kxw0Var2.g;
            kxw0.g(fxw0Var);
            fxw0Var.v1(new y1x0(c2x0Var, r1x0VarV1, jElapsedRealtime));
        } else {
            c2x0Var.d = null;
            fxw0 fxw0Var2 = kxw0Var2.g;
            kxw0.g(fxw0Var2);
            fxw0Var2.v1(new rnw0(c2x0Var, jElapsedRealtime));
        }
        w4x0 w4x0Var = kxw0Var.h;
        kxw0.f(w4x0Var);
        kxw0 kxw0Var3 = (kxw0) w4x0Var.b;
        kxw0Var3.k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        fxw0 fxw0Var3 = kxw0Var3.g;
        kxw0.g(fxw0Var3);
        fxw0Var3.v1(new k4x0(w4x0Var, jElapsedRealtime2, (byte) 1));
    }

    public void m(zzdd zzddVar) {
        kxw0 kxw0Var = (kxw0) ((b1x0) this.b).b;
        w4x0 w4x0Var = kxw0Var.h;
        kxw0.f(w4x0Var);
        kxw0 kxw0Var2 = (kxw0) w4x0Var.b;
        kxw0Var2.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        fxw0 fxw0Var = kxw0Var2.g;
        kxw0.g(fxw0Var);
        fxw0Var.v1(new k4x0(w4x0Var, jElapsedRealtime, (byte) 0));
        c2x0 c2x0Var = kxw0Var.l;
        kxw0.f(c2x0Var);
        Object obj = c2x0Var.m;
        synchronized (obj) {
            try {
                c2x0Var.l = true;
                if (!Objects.equals(zzddVar, c2x0Var.h)) {
                    synchronized (obj) {
                        c2x0Var.h = zzddVar;
                        c2x0Var.i = false;
                        kxw0 kxw0Var3 = (kxw0) c2x0Var.b;
                        if (kxw0Var3.d.B1()) {
                            c2x0Var.j = null;
                            fxw0 fxw0Var2 = kxw0Var3.g;
                            kxw0.g(fxw0Var2);
                            fxw0Var2.v1(new w1x0(c2x0Var, (byte) 1));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        kxw0 kxw0Var4 = (kxw0) c2x0Var.b;
        if (!kxw0Var4.d.B1()) {
            c2x0Var.d = c2x0Var.j;
            fxw0 fxw0Var3 = kxw0Var4.g;
            kxw0.g(fxw0Var3);
            fxw0Var3.v1(new w1x0(c2x0Var, (byte) 0));
            return;
        }
        c2x0Var.t1(zzddVar.b, c2x0Var.v1(zzddVar), false);
        dqw0 dqw0Var = ((kxw0) c2x0Var.b).n;
        kxw0.d(dqw0Var);
        kxw0 kxw0Var5 = (kxw0) dqw0Var.b;
        kxw0Var5.k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        fxw0 fxw0Var4 = kxw0Var5.g;
        kxw0.g(fxw0Var4);
        fxw0Var4.v1(new rnw0(dqw0Var, jElapsedRealtime2));
    }

    public void n(zzdd zzddVar, Bundle bundle) {
        r1x0 r1x0Var;
        c2x0 c2x0Var = ((kxw0) ((b1x0) this.b).b).l;
        kxw0.f(c2x0Var);
        if (!((kxw0) c2x0Var.b).d.B1() || bundle == null || (r1x0Var = (r1x0) c2x0Var.g.get(Integer.valueOf(zzddVar.f45526a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(ParameterNames.ID, r1x0Var.c);
        bundle2.putString("name", r1x0Var.f29705a);
        bundle2.putString("referrer_name", r1x0Var.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f4324a) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT > 25) {
                        a(intent);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new llo(this, intent, (byte) 1));
                    }
                    break;
                }
                break;
            case 1:
                ((wrw0) this.b).c(new tqw0(this, bundle, activity));
                break;
            default:
                j(zzdd.m(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f4324a) {
            case 0:
                break;
            case 1:
                ((wrw0) this.b).c(new rrw0(this, activity, (byte) 4));
                break;
            default:
                k(zzdd.m(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f4324a) {
            case 0:
                break;
            case 1:
                ((wrw0) this.b).c(new rrw0(this, activity, (byte) 2));
                break;
            default:
                l(zzdd.m(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f4324a) {
            case 0:
                break;
            case 1:
                ((wrw0) this.b).c(new rrw0(this, activity, (byte) 1));
                break;
            default:
                m(zzdd.m(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f4324a) {
            case 0:
                break;
            case 1:
                pow0 pow0Var = new pow0();
                ((wrw0) this.b).c(new tqw0(this, activity, pow0Var));
                Bundle bundleC = pow0Var.C(50L);
                if (bundleC != null) {
                    bundle.putAll(bundleC);
                }
                break;
            default:
                n(zzdd.m(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f4324a) {
            case 1:
                ((wrw0) this.b).c(new rrw0(this, activity, (byte) 0));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f4324a) {
            case 1:
                ((wrw0) this.b).c(new rrw0(this, activity, (byte) 3));
                break;
        }
    }

    public /* synthetic */ cgp(Object obj, byte b) {
        this.f4324a = b;
        this.b = obj;
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }
}
