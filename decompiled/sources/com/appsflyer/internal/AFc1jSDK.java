package com.appsflyer.internal;

import a.a8z;
import a.maz;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1jSDK {
    private static final a8z unregisterClient = maz.b(new com.appsflyer.c(3));

    public static final ScheduledExecutorService AFKeystoreWrapper() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        scheduledExecutorServiceNewScheduledThreadPool.getClass();
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static final ScheduledExecutorService AFLogger() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.getClass();
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    public static final ExecutorService d() {
        Object value = unregisterClient.getValue();
        value.getClass();
        return (ExecutorService) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExecutorService registerClient() {
        return Executors.newSingleThreadExecutor();
    }

    public static final ExecutorService unregisterClient() {
        AFc1oSDK aFc1oSDK = new AFc1oSDK(1, 4, 30L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
        aFc1oSDK.allowCoreThreadTimeOut(true);
        return aFc1oSDK;
    }
}
