package com.huawei.hms.hwid;

import a.fuo0;
import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.hwid.StartAssistLoginResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class o extends TaskApiCall<c, Void> {
    public o(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(c cVar, ResponseErrorCode responseErrorCode, String str, fuo0 fuo0Var) {
        as.b("AccountStartAssistLoginTaskApiCall", "AccountStartAssistLoginTaskApiCall doExecute", true);
        if (responseErrorCode == null) {
            as.b("AccountStartAssistLoginTaskApiCall", "response is null.", true);
            fuo0Var.a(new ApiException(new Status(CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, "response is null.")));
            return;
        }
        int errorCode = responseErrorCode.getErrorCode();
        if (errorCode != 0 && CommonCode.Resolution.HAS_RESOLUTION.equals(responseErrorCode.getResolution())) {
            as.b("AccountStartAssistLoginTaskApiCall", "apk version is low or is not exist.", true);
            Status status = new Status(errorCode, responseErrorCode.getErrorReason());
            ao.a(responseErrorCode, status);
            fuo0Var.a(new ResolvableApiException(status));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            fuo0Var.a(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
        } else {
            if ("{}".equals(str)) {
                as.b("AccountStartAssistLoginTaskApiCall", "signIn complete, body is null", true);
                fuo0Var.a(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
                return;
            }
            try {
                StartAssistLoginResult startAssistLoginResultFromJson = new StartAssistLoginResult().fromJson(str);
                if (startAssistLoginResultFromJson.isSuccess()) {
                    fuo0Var.b(null);
                } else {
                    fuo0Var.a(new ApiException(startAssistLoginResultFromJson.getStatus()));
                }
            } catch (JSONException unused) {
                as.c("AccountStartAssistLoginTaskApiCall", "tartAssistLogin complete, but parser json exception", true);
                fuo0Var.a(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
            }
        }
        if (cVar != null) {
            HiAnalyticsClient.reportExit(cVar.getContext(), getUri(), getTransactionId(), ar.a(errorCode), errorCode);
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 14;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 60000000;
    }
}
