package com.huawei.agconnect.config;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.AGConnectOptions;
import com.huawei.agconnect.config.impl.AGConnectServicesConfigImpl;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class AGConnectServicesConfig implements AGConnectOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f45677a = new HashMap();
    public static final Object b = new Object();

    public static AGConnectServicesConfig c(Context context) {
        AGConnectServicesConfig aGConnectServicesConfigImpl;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        String packageName = context.getPackageName();
        synchronized (b) {
            try {
                HashMap map = f45677a;
                aGConnectServicesConfigImpl = (AGConnectServicesConfig) map.get(packageName);
                if (aGConnectServicesConfigImpl == null) {
                    aGConnectServicesConfigImpl = new AGConnectServicesConfigImpl(context, packageName);
                    map.put(packageName, aGConnectServicesConfigImpl);
                    Log.w("AGConnectServicesConfig", "config is null, create new config");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aGConnectServicesConfigImpl;
    }
}
