package com.appsflyer;

import com.appsflyer.internal.AFc1aSDK;
import com.appsflyer.internal.AFc1jSDK;
import com.appsflyer.internal.AFg1oSDK;
import com.appsflyer.internal.AFj1eSDK;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45426a;

    public /* synthetic */ c(byte b) {
        this.f45426a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f45426a) {
            case 0:
                return AFLogger.d();
            case 1:
                return AFLogger.AFKeystoreWrapper();
            case 2:
                return AFc1aSDK.setResolveDeepLinkURLs();
            case 3:
                return AFc1jSDK.registerClient();
            case 4:
                return AFg1oSDK.AFLoggerLogLevel();
            default:
                return AFj1eSDK.AFKeystoreWrapper();
        }
    }
}
