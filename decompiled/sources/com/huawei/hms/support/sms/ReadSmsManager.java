package com.huawei.hms.support.sms;

import a.duo0;
import android.app.Activity;
import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.hwid.ah;
import com.huawei.hms.hwid.aj;

/* JADX INFO: loaded from: classes2.dex */
public class ReadSmsManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Api<Api.ApiOptions.NoOptions> f46012a = new Api<>(HuaweiApiAvailability.HMS_API_NAME_ID);
    private static final ah b = new ah();

    public static duo0 start(Activity activity) {
        return new aj(activity, f46012a, (Api.ApiOptions.NoOptions) null, (AbstractClientBuilder) b).a();
    }

    public static duo0 startConsent(Activity activity, String str) {
        return new aj(activity, f46012a, (Api.ApiOptions.NoOptions) null, (AbstractClientBuilder) b).a(str);
    }

    public static duo0 start(Context context) {
        return new aj(context, f46012a, (Api.ApiOptions.NoOptions) null, b).a();
    }
}
