package com.huawei.hms.hwid;

import a.fuo0;
import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.result.AccountAuthResult;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class m extends TaskApiCall<c, AuthAccount> {
    public m(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0108  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(c cVar, ResponseErrorCode responseErrorCode, String str, fuo0 fuo0Var) {
        AuthAccount account;
        if (responseErrorCode == null) {
            as.b("[AccountSDK]AccountSignInTaskApiCall", "response is null.", true);
            fuo0Var.a(new ApiException(new Status(CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, "response is null.")));
            return;
        }
        as.b("[AccountSDK]AccountSignInTaskApiCall", "ResponseErrorCode.status:" + responseErrorCode.getErrorCode(), true);
        int errorCode = responseErrorCode.getErrorCode();
        if (errorCode != 0 && CommonCode.Resolution.HAS_RESOLUTION.equals(responseErrorCode.getResolution())) {
            as.b("[AccountSDK]AccountSignInTaskApiCall", "apk version is low or is not exist.", true);
            Status status = new Status(errorCode, responseErrorCode.getErrorReason());
            ao.a(responseErrorCode, status);
            fuo0Var.a(new ResolvableApiException(status));
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            if ("{}".equals(str)) {
                as.b("[AccountSDK]AccountSignInTaskApiCall", "signIn complete, body is null", true);
                fuo0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
                return;
            }
            try {
                AccountAuthResult accountAuthResultFromJson = new AccountAuthResult().fromJson(str);
                errorCode = accountAuthResultFromJson.getStatus().getStatusCode();
                if (accountAuthResultFromJson.isSuccess()) {
                    as.b("[AccountSDK]AccountSignInTaskApiCall", "signIn success", true);
                    new e(cVar.getContext()).a();
                    account = accountAuthResultFromJson.getAccount();
                    try {
                        fuo0Var.b(accountAuthResultFromJson.getAccount());
                    } catch (JSONException unused) {
                        as.c("[AccountSDK]AccountSignInTaskApiCall", "signIn complete, but parser json exception", true);
                        fuo0Var.a(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
                    }
                } else {
                    as.b("[AccountSDK]AccountSignInTaskApiCall", "signIn failed", true);
                    fuo0Var.a(new ApiException(accountAuthResultFromJson.getStatus()));
                }
            } catch (JSONException unused2) {
                account = null;
            }
            g.a().a(account, (AccountAuthParams) null);
            if (cVar != null) {
                HiAnalyticsClient.reportExit(cVar.getContext(), getUri(), getTransactionId(), ar.a(errorCode), errorCode);
            }
        }
        as.b("[AccountSDK]AccountSignInTaskApiCall", "signIn complete, response is null, failed", true);
        fuo0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        account = null;
        g.a().a(account, (AccountAuthParams) null);
        if (cVar != null) {
            HiAnalyticsClient.reportExit(cVar.getContext(), getUri(), getTransactionId(), ar.a(errorCode), errorCode);
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }
}
