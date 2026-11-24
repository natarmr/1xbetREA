package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1pSDK implements AFg1wSDK {
    private static IntentFilter unregisterClient = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    @Override // com.appsflyer.internal.AFg1wSDK
    public final AFg1wSDK.AFa1vSDK registerClient(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, unregisterClient);
            if (intentRegisterReceiver != null) {
                if (2 == intentRegisterReceiver.getIntExtra(CommonConstant.KEY_STATUS, -1)) {
                    int intExtra = intentRegisterReceiver.getIntExtra("plugged", -1);
                    if (intExtra == 1) {
                        str = "ac";
                    } else if (intExtra != 2) {
                        str = intExtra != 4 ? "other" : "wireless";
                    } else {
                        str = "usb";
                    }
                } else {
                    str = AuthorizationHeaderIms.NO;
                }
                int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(LogTag.DEVICE_DATA, "Failed to register receiver for battery status", th, false, false);
        }
        return new AFg1wSDK.AFa1vSDK(f, str);
    }
}
