package a;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class wp2 implements vp2 {
    public static volatile wp2 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f39524a;
    public final ConcurrentHashMap b;

    public wp2(AppMeasurementSdk appMeasurementSdk) {
        s0x.H(appMeasurementSdk);
        this.f39524a = appMeasurementSdk;
        this.b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (tnw0.a(str) && tnw0.b(bundle, str2) && tnw0.d(bundle, str, str2)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f39524a.logEvent(str, str2, bundle);
        }
    }

    public final pek0 b(String str, yzn0 yzn0Var) {
        Object fuj0Var;
        if (tnw0.a(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                AppMeasurementSdk appMeasurementSdk = this.f39524a;
                if (zEquals) {
                    fuj0Var = new fuj0(appMeasurementSdk, yzn0Var);
                } else if ("clx".equals(str)) {
                    nmt0 nmt0Var = new nmt0();
                    nmt0Var.f23789a = yzn0Var;
                    appMeasurementSdk.a(new vpw0(nmt0Var, (byte) 1));
                    fuj0Var = nmt0Var;
                } else {
                    fuj0Var = null;
                }
                if (fuj0Var != null) {
                    concurrentHashMap.put(str, fuj0Var);
                    return new pek0();
                }
            }
        }
        return null;
    }
}
