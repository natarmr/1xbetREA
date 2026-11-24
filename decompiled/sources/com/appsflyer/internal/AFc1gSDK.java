package com.appsflyer.internal;

import a.a8z;
import a.kng0;
import a.maz;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1gSDK implements AFc1kSDK {
    private final AFc1dSDK<SharedPreferences> d;
    private final a8z registerClient;

    public AFc1gSDK(AFc1dSDK<SharedPreferences> aFc1dSDK) {
        aFc1dSDK.getClass();
        this.d = aFc1dSDK;
        this.registerClient = maz.b(new d(this, (byte) 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences q_(AFc1gSDK aFc1gSDK) {
        return (SharedPreferences) aFc1gSDK.d.AFKeystoreWrapper.invoke();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final boolean AFKeystoreWrapper(String str) {
        try {
            return ((SharedPreferences) this.registerClient.getValue()).getBoolean(str, false);
        } catch (ClassCastException e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PREFERENCES, kng0.k("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final int AFLogger(String str, int i) {
        try {
            return ((SharedPreferences) this.registerClient.getValue()).getInt(str, i);
        } catch (ClassCastException e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PREFERENCES, kng0.k("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return i;
        }
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final String d(String str) {
        try {
            return ((SharedPreferences) this.registerClient.getValue()).getString(str, null);
        } catch (ClassCastException e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PREFERENCES, kng0.k("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final SharedPreferences p_() {
        return (SharedPreferences) this.registerClient.getValue();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void registerClient(String str, boolean z) {
        ((SharedPreferences) this.registerClient.getValue()).edit().putBoolean(str, z).apply();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final long unregisterClient(String str, long j) {
        try {
            return ((SharedPreferences) this.registerClient.getValue()).getLong(str, j);
        } catch (ClassCastException e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PREFERENCES, kng0.k("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final boolean registerClient(String str) {
        return ((SharedPreferences) this.registerClient.getValue()).contains(str);
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void AFLogger(String str, long j) {
        ((SharedPreferences) this.registerClient.getValue()).edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void d(String str, String str2) {
        ((SharedPreferences) this.registerClient.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void AFLogger(String str) {
        ((SharedPreferences) this.registerClient.getValue()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void d(String str, int i) {
        ((SharedPreferences) this.registerClient.getValue()).edit().putInt(str, i).apply();
    }
}
