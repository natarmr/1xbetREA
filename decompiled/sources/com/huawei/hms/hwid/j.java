package com.huawei.hms.hwid;

import a.fuo0;
import android.app.PendingIntent;
import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.account.AccountNaming;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;

/* JADX INFO: loaded from: classes2.dex */
public class j extends TaskApiCall<c, Void> {
    public j(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(c cVar, ResponseErrorCode responseErrorCode, String str, fuo0 fuo0Var) {
        as.b("AccountLogoutTaskApiCall", "AccountLogoutTaskApiCall doExecute", true);
        if (responseErrorCode == null) {
            as.b("AccountLogoutTaskApiCall", "response is null.", true);
            fuo0Var.a(new ApiException(new Status(CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, "response is null.")));
            return;
        }
        a(responseErrorCode);
        if (responseErrorCode.getErrorCode() == 0) {
            if (TextUtils.isEmpty(str)) {
                fuo0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
                a(cVar, responseErrorCode);
                return;
            } else {
                fuo0Var.b(null);
                a(cVar, responseErrorCode);
                return;
            }
        }
        if (CommonCode.Resolution.HAS_RESOLUTION.equals(responseErrorCode.getResolution())) {
            as.b("AccountLogoutTaskApiCall", "hms apk version is low or is not exist.", true);
            fuo0Var.a(new ResolvableApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason(), (PendingIntent) responseErrorCode.getParcelable())));
        } else {
            as.b("AccountLogoutTaskApiCall", "AccountLogoutTaskApiCall callback.", true);
            if (responseErrorCode.getErrorCode() != 2031) {
                fuo0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            }
        }
        fuo0Var.b(null);
        a(cVar, responseErrorCode);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 16;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 60000000;
    }

    private void a(c cVar, ResponseErrorCode responseErrorCode) {
        if (cVar == null || responseErrorCode == null) {
            return;
        }
        HiAnalyticsClient.reportExit(cVar.getContext(), AccountNaming.logout, getTransactionId(), ar.a(responseErrorCode.getErrorCode()), responseErrorCode.getErrorCode());
    }

    private void a(ResponseErrorCode responseErrorCode) {
        as.b("AccountLogoutTaskApiCall", "headerErrorCode:" + responseErrorCode.getErrorCode(), true);
    }
}
