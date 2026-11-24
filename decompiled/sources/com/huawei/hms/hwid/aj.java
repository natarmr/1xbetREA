package com.huawei.hms.hwid;

import a.duo0;
import a.u6w0;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class aj extends HuaweiApi<Api.ApiOptions.NoOptions> {
    public aj(Activity activity, Api<Api.ApiOptions.NoOptions> api, Api.ApiOptions.NoOptions noOptions, AbstractClientBuilder abstractClientBuilder) {
        super(activity, api, noOptions, abstractClientBuilder);
    }

    private af b() {
        return new af(getContext().getPackageName());
    }

    public duo0 a(String str) {
        as.b("ReadSmsService", "startConsent enter", true);
        if (str != null && str.length() > 120) {
            u6w0 u6w0Var = new u6w0();
            ApiException apiException = new ApiException(new Status(CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED, CommonConstant.RETCODE.SMS_PARAM_ERROR));
            synchronized (u6w0Var.f35157a) {
                try {
                    if (!u6w0Var.b) {
                        u6w0Var.b = true;
                        u6w0Var.d = apiException;
                        u6w0Var.f35157a.notifyAll();
                        u6w0Var.f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return u6w0Var;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, getContext().getPackageName());
            jSONObject.put("phoneNumber", str);
        } catch (JSONException unused) {
            as.d("ReadSmsService", "toJson failed", true);
        }
        if (!TextUtils.isEmpty(jSONObject.toString())) {
            return doWrite(new al(CommonNaming.startConsent, jSONObject.toString(), HiAnalyticsClient.reportEntry(getContext(), CommonNaming.startConsent, 60900100)));
        }
        u6w0 u6w0Var2 = new u6w0();
        ApiException apiException2 = new ApiException(new Status(CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED, CommonConstant.RETCODE.SMS_PARAM_ERROR));
        synchronized (u6w0Var2.f35157a) {
            try {
                if (!u6w0Var2.b) {
                    u6w0Var2.b = true;
                    u6w0Var2.d = apiException2;
                    u6w0Var2.f35157a.notifyAll();
                    u6w0Var2.f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u6w0Var2;
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        return 1;
    }

    public aj(Context context, Api<Api.ApiOptions.NoOptions> api, Api.ApiOptions.NoOptions noOptions, AbstractClientBuilder abstractClientBuilder) {
        super(context, api, noOptions, abstractClientBuilder);
    }

    public duo0 a() {
        String strA = b().a();
        if (TextUtils.isEmpty(strA)) {
            u6w0 u6w0Var = new u6w0();
            ApiException apiException = new ApiException(new Status(CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED, CommonConstant.RETCODE.SMS_PARAM_ERROR));
            synchronized (u6w0Var.f35157a) {
                try {
                    if (!u6w0Var.b) {
                        u6w0Var.b = true;
                        u6w0Var.d = apiException;
                        u6w0Var.f35157a.notifyAll();
                        u6w0Var.f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return u6w0Var;
        }
        return doWrite(new ak(CommonNaming.startSmsRetriever, strA, HiAnalyticsClient.reportEntry(getContext(), CommonNaming.startSmsRetriever, 60900100)));
    }
}
