package com.huawei.hms.opendevice;

import a.duo0;
import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.support.api.entity.opendevice.HuaweiOpendeviceNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.utils.JsonUtil;

/* JADX INFO: loaded from: classes2.dex */
public class OpenDeviceClientImpl extends HuaweiApi<OpenDeviceOptions> implements OpenDeviceClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final OpenDeviceHmsClientBuilder f45909a = new OpenDeviceHmsClientBuilder();
    private static final Api<OpenDeviceOptions> b = new Api<>(HuaweiApiAvailability.HMS_API_NAME_OD);
    private static OpenDeviceOptions c = new OpenDeviceOptions();

    public OpenDeviceClientImpl(Context context) {
        super(context, b, c, f45909a);
        super.setKitSdkVersion(61300301);
    }

    @Override // com.huawei.hms.opendevice.OpenDeviceClient
    public duo0 getOdid() {
        return doWrite(new OpenDeviceTaskApiCall(HuaweiOpendeviceNaming.GET_ODID, JsonUtil.createJsonString(null), HiAnalyticsClient.reportEntry(getContext(), HuaweiOpendeviceNaming.GET_ODID, 61300301)));
    }
}
