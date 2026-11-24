package com.huawei.hms.push;

import a.duo0;
import a.fuo0;
import android.app.Activity;
import android.content.Context;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.task.ConsentTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.EnableConsentReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.utils.JsonUtil;

/* JADX INFO: loaded from: classes2.dex */
public class HmsConsent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HuaweiApi<Api.ApiOptions.NoOptions> f45923a;
    private Context b;

    private HmsConsent(Context context) {
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi;
        Preconditions.checkNotNull(context);
        this.b = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            huaweiApi = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
            this.f45923a = huaweiApi;
        } else {
            huaweiApi = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
            this.f45923a = huaweiApi;
        }
        huaweiApi.setKitSdkVersion(61300301);
    }

    private duo0 a(boolean z) {
        fuo0 fuo0Var;
        int externalCode;
        String strReportEntry = PushBiUtil.reportEntry(this.b, PushNaming.PUSH_CONSENT);
        try {
            if (!d.d(this.b)) {
                throw ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException();
            }
            EnableConsentReq enableConsentReq = new EnableConsentReq();
            enableConsentReq.setPackageName(this.b.getPackageName());
            enableConsentReq.setEnable(z);
            return this.f45923a.doWrite(new ConsentTask(PushNaming.PUSH_CONSENT, JsonUtil.createJsonString(enableConsentReq), strReportEntry));
        } catch (ApiException e) {
            fuo0 fuo0Var2 = new fuo0();
            fuo0Var2.a(e);
            externalCode = e.getStatusCode();
            fuo0Var = fuo0Var2;
            PushBiUtil.reportExit(this.b, PushNaming.PUSH_CONSENT, strReportEntry, externalCode);
            return fuo0Var.f10174a;
        } catch (Exception unused) {
            fuo0Var = new fuo0();
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            fuo0Var.a(errorEnum.toApiException());
            externalCode = errorEnum.getExternalCode();
            PushBiUtil.reportExit(this.b, PushNaming.PUSH_CONSENT, strReportEntry, externalCode);
            return fuo0Var.f10174a;
        }
    }

    public static HmsConsent getInstance(Context context) {
        return new HmsConsent(context);
    }

    public duo0 consentOff() {
        return a(false);
    }

    public duo0 consentOn() {
        return a(true);
    }
}
