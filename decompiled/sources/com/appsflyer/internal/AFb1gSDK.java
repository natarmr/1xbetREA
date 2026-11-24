package com.appsflyer.internal;

import a.e0g0;
import a.g0g0;
import a.j0g0;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
final class AFb1gSDK implements Application.ActivityLifecycleCallbacks {
    private ScheduledFuture<?> AFKeystoreWrapper;
    final AFb1bSDK.AFa1zSDK AFLogger;
    private final AFa1qSDK d;
    private final ScheduledExecutorService registerClient;
    private volatile boolean unregisterClient;
    private final Runnable v;

    public AFb1gSDK(ScheduledExecutorService scheduledExecutorService, AFb1bSDK.AFa1zSDK aFa1zSDK, AFa1qSDK aFa1qSDK) {
        scheduledExecutorService.getClass();
        aFa1zSDK.getClass();
        aFa1qSDK.getClass();
        this.registerClient = scheduledExecutorService;
        this.AFLogger = aFa1zSDK;
        this.d = aFa1qSDK;
        this.v = new g(this, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i_(AFb1gSDK aFb1gSDK, Intent intent) {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            AFb1bSDK.AFa1zSDK aFa1zSDK = aFb1gSDK.AFLogger;
            intent.getClass();
            aFa1zSDK.m_(intent);
            g0g0Var = Unit.f46060a;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DDL, "onActivityCreatedWithDeeplink failed with a throwable", thA, false, false, false, false, 120, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j_(AFb1gSDK aFb1gSDK, Intent intent) {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            AFb1bSDK.AFa1zSDK aFa1zSDK = aFb1gSDK.AFLogger;
            intent.getClass();
            aFa1zSDK.n_(intent);
            g0g0Var = Unit.f46060a;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Listener threw an exception", thA, false, false, false, false, 120, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerClient(AFb1gSDK aFb1gSDK) {
        Object g0g0Var;
        aFb1gSDK.unregisterClient = false;
        try {
            e0g0 e0g0Var = j0g0.b;
            aFb1gSDK.AFLogger.registerClient();
            g0g0Var = Unit.f46060a;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Background task failed with a throwable", thA, false, false, false, false, 120, null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (this.unregisterClient) {
            return;
        }
        Intent intent = activity.getIntent();
        if (this.d.e_(intent)) {
            this.registerClient.execute(new h(this, intent, (byte) 0));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        if (this.unregisterClient) {
            ScheduledExecutorService scheduledExecutorService = this.registerClient;
            Runnable runnable = this.v;
            AFb1bSDK.Companion aFa1tSDK = AFb1bSDK.INSTANCE;
            this.AFKeystoreWrapper = scheduledExecutorService.schedule(runnable, AFb1bSDK.Companion.unregisterClient(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        byte b = 1;
        if (!this.unregisterClient) {
            this.unregisterClient = true;
            this.registerClient.execute(new h(this, activity.getIntent(), b));
        } else {
            ScheduledFuture<?> scheduledFuture = this.AFKeystoreWrapper;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
