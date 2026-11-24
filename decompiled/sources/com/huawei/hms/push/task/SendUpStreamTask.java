package com.huawei.hms.push.task;

import a.fuo0;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.r;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes2.dex */
public class SendUpStreamTask extends TaskApiCall<PushClient, BaseVoidTask> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45948a;
    private String b;

    public SendUpStreamTask(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3);
        this.f45948a = str4;
        this.b = str5;
    }

    private void a(PushClient pushClient, ResponseErrorCode responseErrorCode) {
        HMSLog.i("SendUpStreamTask", "receive upstream, msgId :" + this.b + " , packageName = " + this.f45948a + " , errorCode = " + responseErrorCode.getErrorCode());
        Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
        intent.setPackage(this.f45948a);
        Bundle bundle = new Bundle();
        bundle.putString("message_id", this.b);
        bundle.putInt("error", responseErrorCode.getErrorCode());
        if (ErrorEnum.SUCCESS.getInternalCode() == responseErrorCode.getErrorCode()) {
            bundle.putString(RemoteMessageConst.MSGTYPE, "sent_message");
        } else {
            bundle.putString(RemoteMessageConst.MSGTYPE, "send_error");
        }
        if (new r().a(pushClient.getContext(), bundle, intent)) {
            HMSLog.i("SendUpStreamTask", "receive upstream, start service success");
            PushBiUtil.reportExit(pushClient.getContext(), getUri(), responseErrorCode);
        } else {
            HMSLog.w("SendUpStreamTask", "receive upstream, start service failed");
            PushBiUtil.reportExit(pushClient.getContext(), getUri(), responseErrorCode.getTransactionId(), ErrorEnum.ERROR_BIND_SERVICE_SELF_MAPPING);
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, fuo0 fuo0Var) {
        if (responseErrorCode.getErrorCode() == 0) {
            HMSLog.i("SendUpStreamTask", "send up stream task,Operate succeed");
            fuo0Var.b(null);
        } else {
            HMSLog.e("SendUpStreamTask", "send up stream task,Operate failed with ret=" + responseErrorCode.getErrorCode());
            ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
            if (errorEnumFromCode != ErrorEnum.ERROR_UNKNOWN) {
                fuo0Var.a(errorEnumFromCode.toApiException());
            } else {
                fuo0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            }
        }
        a(pushClient, responseErrorCode);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 40003000;
    }
}
