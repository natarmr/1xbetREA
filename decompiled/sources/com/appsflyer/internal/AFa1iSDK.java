package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class AFa1iSDK implements AFa1dSDK {
    private static AFa1iSDK afErrorLog;
    private final AFb1nSDK values = new AFb1nSDK();

    static {
        try {
            System.loadLibrary("sdk_bc_lib");
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Failed to load native library", th);
        }
    }

    private AFa1iSDK() {
    }

    public static synchronized AFa1iSDK afDebugLog() {
        AFa1iSDK aFa1iSDK;
        aFa1iSDK = afErrorLog;
        if (aFa1iSDK == null) {
            aFa1iSDK = new AFa1iSDK();
            afErrorLog = aFa1iSDK;
        }
        return aFa1iSDK;
    }

    @Override // com.appsflyer.internal.AFa1dSDK
    public void afRDLog(Map<String, Object> map, byte[] bArr, Map<String, Object> map2) {
        this.values.afRDLog(map, bArr, map2);
    }
}
