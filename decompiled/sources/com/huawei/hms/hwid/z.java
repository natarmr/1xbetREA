package com.huawei.hms.hwid;

import a.fuo0;
import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.hwid.RevokeAccessResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class z extends TaskApiCall<u, Void> {
    public z(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(u uVar, ResponseErrorCode responseErrorCode, String str, fuo0 fuo0Var) {
        as.b("HuaweiIdCancelAuthorizationTaskApiCall", "HuaweiIdCancelAuthorizationTaskApiCall doExecute", true);
        x.a();
        if (responseErrorCode == null) {
            as.b("HuaweiIdCancelAuthorizationTaskApiCall", "response is null.", true);
            fuo0Var.a(new ApiException(new Status(CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, "response is null.")));
            return;
        }
        int errorCode = responseErrorCode.getErrorCode();
        if (errorCode != 0 && CommonCode.Resolution.HAS_RESOLUTION.equals(responseErrorCode.getResolution())) {
            as.b("HuaweiIdCancelAuthorizationTaskApiCall", "apk version is low or is not exist.", true);
            Status status = new Status(errorCode, responseErrorCode.getErrorReason());
            ao.a(responseErrorCode, status);
            fuo0Var.a(new ResolvableApiException(status));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            fuo0Var.a(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
        } else {
            if ("{}".equals(str)) {
                as.b("HuaweiIdCancelAuthorizationTaskApiCall", "CancelAuthorization complete, body is null", true);
                fuo0Var.a(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
                return;
            }
            try {
                RevokeAccessResult revokeAccessResultFromJson = new RevokeAccessResult().fromJson(str);
                if (revokeAccessResultFromJson.isSuccess()) {
                    fuo0Var.b(null);
                } else {
                    Status status2 = revokeAccessResultFromJson.getStatus();
                    fuo0Var.a(new ApiException(new Status(status2.getStatusCode(), status2.getStatusMessage())));
                }
            } catch (JSONException e) {
                as.b("HuaweiIdCancelAuthorizationTaskApiCall", "JSONException:".concat(e.getClass().getSimpleName()), true);
                fuo0Var.a(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
            }
        }
        if (uVar != null) {
            HiAnalyticsClient.reportExit(uVar.getContext(), CommonNaming.revokeAccess, getTransactionId(), ar.a(errorCode), errorCode);
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }
}
