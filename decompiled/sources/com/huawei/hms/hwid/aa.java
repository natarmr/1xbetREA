package com.huawei.hms.hwid;

import a.fuo0;
import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes2.dex */
public class aa extends TaskApiCall<u, Void> {
    public aa(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(u uVar, ResponseErrorCode responseErrorCode, String str, fuo0 fuo0Var) {
        if (responseErrorCode == null) {
            as.b("[HUAWEIIDSDK]HuaweiIdDeleteAuthInfoTaskApiCall", "response is null.", true);
            fuo0Var.a(new ApiException(new Status(CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, "response is null.")));
            return;
        }
        a(responseErrorCode, str);
        if (TextUtils.isEmpty(str)) {
            fuo0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        } else if (responseErrorCode.getErrorCode() == 0) {
            fuo0Var.b(null);
        } else {
            fuo0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode())));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 40000300;
    }

    private void a(ResponseErrorCode responseErrorCode, String str) {
        as.b("[HUAWEIIDSDK]HuaweiIdDeleteAuthInfoTaskApiCall", "headerErrorCode:" + responseErrorCode.getErrorCode(), true);
    }
}
