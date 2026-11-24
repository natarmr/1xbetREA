package com.appsflyer.internal;

import a.e0g0;
import a.g0g0;
import a.j0g0;
import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1oSDK implements AFj1tSDK {
    @Override // com.appsflyer.internal.AFj1tSDK
    public final String registerClient() {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            obj.getClass();
            g0g0Var = (String) obj;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = "";
        }
        return (String) g0g0Var;
    }
}
