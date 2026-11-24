package a;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class wrw0 {
    public static volatile wrw0 h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f39667a;
    public final AppMeasurementSdk b;
    public final ArrayList c;
    public int d;
    public boolean e;
    public volatile yow0 f;
    public volatile long g;

    public wrw0(Context context, Bundle bundle) {
        eko ekoVar = new eko(this);
        byte b = 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), ekoVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f39667a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new AppMeasurementSdk(this);
        this.c = new ArrayList();
        try {
            if (o5n0.w(context, iym0.x(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, wrw0.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.e = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        c(new tqw0(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new cgp(this, b));
        }
    }

    public static wrw0 e(Context context, Bundle bundle) {
        s0x.H(context);
        if (h == null) {
            synchronized (wrw0.class) {
                try {
                    if (h == null) {
                        h = new wrw0(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public final Map a(String str, String str2, boolean z) {
        pow0 pow0Var = new pow0();
        c(new hqw0(this, str, str2, z, pow0Var));
        Bundle bundleC = pow0Var.C(5000L);
        if (bundleC == null || bundleC.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleC.size());
        for (String str3 : bundleC.keySet()) {
            Object obj = bundleC.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final int b(String str) {
        pow0 pow0Var = new pow0();
        c(new tqw0(this, str, pow0Var));
        Integer num = (Integer) pow0.D(pow0Var.C(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void c(orw0 orw0Var) {
        this.f39667a.execute(orw0Var);
    }

    public final void d(Exception exc, boolean z, boolean z2) {
        this.e |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            c(new oqw0(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final List f(String str, String str2) {
        pow0 pow0Var = new pow0();
        c(new kqw0(this, str, str2, pow0Var));
        List list = (List) pow0.D(pow0Var.C(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final long g() {
        pow0 pow0Var = new pow0();
        c(new xqw0(this, pow0Var, (byte) 2));
        Long l = (Long) pow0.D(pow0Var.C(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = this.d + 1;
        this.d = i;
        return jNextLong + ((long) i);
    }
}
