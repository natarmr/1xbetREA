package com.huawei.hms.hwid;

import a.fuo0;
import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.support.hwid.result.HuaweiIdAuthResult;
import com.huawei.hms.utils.Util;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class ac extends TaskApiCall<u, AuthHuaweiId> {
    public ac(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(u uVar, ResponseErrorCode responseErrorCode, String str, fuo0 fuo0Var) {
        AuthHuaweiId huaweiId;
        int i;
        if (responseErrorCode == null) {
            as.b("[HUAWEIIDSDK]SignInTaskApiCall", "response is null.", true);
            fuo0Var.a(new ApiException(new Status(CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, "response is null.")));
            return;
        }
        as.b("[HUAWEIIDSDK]SignInTaskApiCall", "ResponseErrorCode.status:" + responseErrorCode.getErrorCode(), true);
        int errorCode = responseErrorCode.getErrorCode();
        if (TextUtils.isEmpty(str)) {
            as.b("[HUAWEIIDSDK]SignInTaskApiCall", "signIn complete, response is null, failed", true);
            fuo0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            i = errorCode;
            huaweiId = null;
        } else {
            try {
                HuaweiIdAuthResult huaweiIdAuthResultFromJson = new HuaweiIdAuthResult().fromJson(str);
                errorCode = huaweiIdAuthResultFromJson.getStatus().getStatusCode();
                if (huaweiIdAuthResultFromJson.isSuccess()) {
                    as.b("[HUAWEIIDSDK]SignInTaskApiCall", "signIn success", true);
                    new w(uVar.getContext()).a();
                    huaweiId = huaweiIdAuthResultFromJson.getHuaweiId();
                    try {
                        fuo0Var.b(huaweiIdAuthResultFromJson.getHuaweiId());
                    } catch (JSONException unused) {
                        as.c("[HUAWEIIDSDK]SignInTaskApiCall", "signIn complete, but parser json exception", true);
                        fuo0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
                    }
                } else {
                    as.b("[HUAWEIIDSDK]SignInTaskApiCall", "signIn failed", true);
                    fuo0Var.a(new ApiException(huaweiIdAuthResultFromJson.getStatus()));
                    huaweiId = null;
                }
            } catch (JSONException unused2) {
                huaweiId = null;
            }
            i = errorCode;
        }
        y.a().a(huaweiId, (HuaweiIdAuthParams) null);
        if (uVar != null) {
            HiAnalyticsClient.reportExit(uVar.getContext(), CommonNaming.silentSignIn, getTransactionId(), Util.getAppId(uVar.getContext()), ar.a(i), i, 61300300);
        }
        as.b("[HUAWEIIDSDK]SignInTaskApiCall", "report: api=hwid.silentSignInversion=61300300", true);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }
}
