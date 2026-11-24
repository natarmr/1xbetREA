package com.huawei.hms.hwid;

import a.fuo0;
import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.api.hwid.SignOutResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class ad extends TaskApiCall<u, Void> {
    public ad(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(u uVar, ResponseErrorCode responseErrorCode, String str, fuo0 fuo0Var) {
        if (responseErrorCode == null) {
            as.b("[HUAWEIIDSDK]HuaweiIdSignOutTaskApiCall", "response is null.", true);
            fuo0Var.a(new ApiException(new Status(CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, "response is null.")));
            return;
        }
        a(responseErrorCode, str);
        int errorCode = responseErrorCode.getErrorCode();
        if (TextUtils.isEmpty(str)) {
            fuo0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        } else {
            try {
                SignOutResult signOutResultFromJson = new SignOutResult().fromJson(str);
                errorCode = signOutResultFromJson.getStatus().getStatusCode();
                if (signOutResultFromJson.isSuccess()) {
                    fuo0Var.b(null);
                } else {
                    fuo0Var.a(new ApiException(signOutResultFromJson.getStatus()));
                }
            } catch (JSONException unused) {
                fuo0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            }
        }
        if (uVar != null) {
            HiAnalyticsClient.reportExit(uVar.getContext(), CommonNaming.signout, getTransactionId(), ar.a(errorCode), errorCode);
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    private void a(ResponseErrorCode responseErrorCode, String str) {
        as.b("[HUAWEIIDSDK]HuaweiIdSignOutTaskApiCall", "headerErrorCode:" + responseErrorCode.getErrorCode(), true);
    }
}
