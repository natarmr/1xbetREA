package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1iSDK {
    public static boolean registerClient(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return context.getPackageManager().isInstantApp();
        }
        try {
            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            return true;
        } catch (ClassNotFoundException e) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "InstantAppsRuntime not found", e, false, false, false);
            return false;
        }
    }
}
