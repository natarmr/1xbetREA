package com.appsflyer.internal;

import a.kng0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1nSDK extends AFe1kSDK<String> {
    private final AFc1iSDK afWarnLog;
    private final AFj1bSDK force;
    private final String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1nSDK(AFc1bSDK aFc1bSDK, String str, AFj1bSDK aFj1bSDK) {
        super(AFd1bSDK.IMPRESSIONS, new AFe1zSDK[]{AFd1bSDK.RC_CDN, AFd1bSDK.FETCH_ADVERTISING_ID}, aFc1bSDK, str);
        aFc1bSDK.getClass();
        str.getClass();
        this.v = str;
        this.force = aFj1bSDK;
        AFc1iSDK aFc1iSDKAFLogger = aFc1bSDK.AFLogger();
        aFc1iSDKAFLogger.getClass();
        this.afWarnLog = aFc1iSDKAFLogger;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final AFd1pSDK<String> AFLogger(String str) {
        String string;
        str.getClass();
        AFd1sSDK d = getD();
        String strAFLogger = this.afWarnLog.AFLogger();
        if (strAFLogger == null || strAFLogger.length() == 0) {
            string = this.v;
        } else {
            string = Uri.parse(this.v).buildUpon().appendQueryParameter("advertising_id", strAFLogger).build().toString();
            string.getClass();
        }
        AFd1pSDK<String> aFd1pSDKD = d.d(string);
        aFd1pSDKD.getClass();
        return aFd1pSDKD;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final AppsFlyerRequestListener afWarnLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean e() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final void force() {
        AFj1bSDK aFj1bSDK;
        super.force();
        AFd1fSDK<Result> aFd1fSDK = ((AFe1kSDK) this).v;
        if (aFd1fSDK == 0) {
            return;
        }
        int statusCode = aFd1fSDK.getStatusCode();
        if (statusCode == 200) {
            AFLogger.INSTANCE.i(LogTag.CROSS_PROMOTION, kng0.k("Cross promotion impressions success: ", this.v), false);
            return;
        }
        if (statusCode != 301 && statusCode != 302) {
            AFLogger.INSTANCE.i(LogTag.CROSS_PROMOTION, "call to " + this.v + " failed: " + aFd1fSDK.getStatusCode(), true);
            return;
        }
        AFLogger.INSTANCE.i(LogTag.CROSS_PROMOTION, kng0.k("Cross promotion redirection success: ", this.v), false);
        String strAFKeystoreWrapper = aFd1fSDK.AFKeystoreWrapper("Location");
        if (strAFKeystoreWrapper == null || (aFj1bSDK = this.force) == null) {
            return;
        }
        aFj1bSDK.unregisterClient = strAFKeystoreWrapper;
        Context context = aFj1bSDK.AFKeystoreWrapper.get();
        if (context != null) {
            try {
                if (aFj1bSDK.unregisterClient != null) {
                    context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(aFj1bSDK.unregisterClient)).setFlags(268435456));
                }
            } catch (Exception e) {
                AFLogger.INSTANCE.e(LogTag.CROSS_PROMOTION, "Failed to open cross promotion URL; is a browser app installed?", e);
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        return false;
    }
}
