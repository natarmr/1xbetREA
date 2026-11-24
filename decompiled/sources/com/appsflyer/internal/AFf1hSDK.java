package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1hSDK implements AFe1vSDK {
    private final AFf1nSDK AFKeystoreWrapper;
    private final AFf1fSDK AFLogger;
    private AFf1pSDK afWarnLog;
    private final AFc1iSDK d;
    private final AFd1sSDK e;
    private final AFe1wSDK force;
    private final AFc1eSDK i;
    private final Object registerClient = new Object();
    public final AFf1jSDK unregisterClient;
    private final AFf1kSDK v;
    private AFh1bSDK w;

    public AFf1hSDK(AFf1nSDK aFf1nSDK, AFc1iSDK aFc1iSDK, AFf1fSDK aFf1fSDK, AFf1jSDK aFf1jSDK, AFd1sSDK aFd1sSDK, AFf1kSDK aFf1kSDK, AFc1eSDK aFc1eSDK, AFe1wSDK aFe1wSDK) {
        this.AFKeystoreWrapper = aFf1nSDK;
        this.d = aFc1iSDK;
        this.AFLogger = aFf1fSDK;
        this.unregisterClient = aFf1jSDK;
        this.e = aFd1sSDK;
        this.v = aFf1kSDK;
        this.i = aFc1eSDK;
        this.force = aFe1wSDK;
        aFe1wSDK.unregisterClient.add(this);
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void AFKeystoreWrapper(AFe1ySDK<?> aFe1ySDK, AFd1cSDK aFd1cSDK) {
        if (aFe1ySDK instanceof AFf1oSDK) {
            AFf1oSDK aFf1oSDK = (AFf1oSDK) aFe1ySDK;
            AFf1pSDK aFf1pSDK = aFf1oSDK.i;
            if (aFf1pSDK == null) {
                AFLogger.INSTANCE.w(LogTag.REMOTE_CONTROL, "update RC returned null result, something went wrong!");
                aFf1pSDK = AFf1pSDK.FAILURE;
            }
            if (aFf1pSDK != AFf1pSDK.USE_CACHED) {
                AFh1bSDK aFh1bSDK = aFf1oSDK.e;
                synchronized (this.registerClient) {
                    this.w = aFh1bSDK;
                }
            }
            AFKeystoreWrapper(aFf1pSDK, aFf1oSDK.force);
        }
    }

    public final AFh1bSDK d() {
        AFh1bSDK aFh1bSDK;
        synchronized (this.registerClient) {
            aFh1bSDK = this.w;
            this.w = null;
        }
        return aFh1bSDK;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void registerClient(AFe1ySDK<?> aFe1ySDK) {
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void unregisterClient(AFe1ySDK<?> aFe1ySDK) {
        if (aFe1ySDK instanceof AFf1oSDK) {
            AFf1oSDK aFf1oSDK = (AFf1oSDK) aFe1ySDK;
            synchronized (this.registerClient) {
                this.w = null;
            }
            AFKeystoreWrapper(AFf1pSDK.FAILURE, aFf1oSDK.force);
        }
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void d(AFe1ySDK<?> aFe1ySDK) {
    }

    private void AFKeystoreWrapper(AFf1pSDK aFf1pSDK, AFf1mSDK aFf1mSDK) {
        synchronized (this.registerClient) {
            this.afWarnLog = aFf1pSDK;
        }
        if (aFf1mSDK != null) {
            aFf1mSDK.onRemoteConfigUpdateFinished(aFf1pSDK);
        }
    }

    public final void AFKeystoreWrapper(AFf1mSDK aFf1mSDK) {
        this.force.d(new AFf1oSDK(this.AFKeystoreWrapper, this.d, this.AFLogger, this.unregisterClient, this.e, this.v, this.i, "v1", aFf1mSDK));
    }
}
