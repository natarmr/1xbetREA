package com.huawei.hms.push.task;

import a.fuo0;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes2.dex */
public class AttributionReportTask extends BaseVoidTask {
    public AttributionReportTask(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.push.task.BaseVoidTask, com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, fuo0 fuo0Var) {
        if (responseErrorCode.getErrorCode() == 0) {
            HMSLog.i("AnalysisReportTask", "analysis report task,Operate succeed");
            fuo0Var.b(null);
        } else {
            HMSLog.e("AnalysisReportTask", "analysis report task,Operate failed with ret=" + responseErrorCode.getErrorCode());
            ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
            if (errorEnumFromCode == ErrorEnum.ERROR_UNKNOWN) {
                fuo0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            } else if (errorEnumFromCode == ErrorEnum.ERROR_NOT_IN_SERVICE) {
                new PushPreferences(pushClient.getContext(), "hwpush_local_config").saveLong("analysis_last_failed_time", Long.valueOf(System.currentTimeMillis()));
                fuo0Var.a(errorEnumFromCode.toApiException());
            } else {
                fuo0Var.a(errorEnumFromCode.toApiException());
            }
        }
        PushBiUtil.reportExit(pushClient.getContext(), getUri(), responseErrorCode);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 4;
    }

    @Override // com.huawei.hms.push.task.BaseVoidTask, com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 60900100;
    }
}
