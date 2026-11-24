package com.huawei.hms.push.task;

import a.fuo0;
import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.push.SubscribeResult;
import com.huawei.hms.push.b;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.push.SubscribeNotificationReq;
import com.huawei.hms.support.api.entity.push.SubscribeNotificationResp;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* JADX INFO: loaded from: classes2.dex */
public class SubscribeNotificationTask extends TaskApiCall<PushClient, SubscribeResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f45949a;

    public SubscribeNotificationTask(Activity activity, String str, SubscribeNotificationReq subscribeNotificationReq, String str2) {
        super(str, JsonUtil.createJsonString(subscribeNotificationReq), str2);
        this.f45949a = activity;
    }

    private boolean a(PushClient pushClient, ResponseErrorCode responseErrorCode) {
        Parcelable parcelable = responseErrorCode.getParcelable();
        if (!(parcelable instanceof Intent)) {
            HMSLog.e("SubscribeNotificationTask", "not instance of intent");
            return false;
        }
        Intent intent = (Intent) parcelable;
        intent.putExtra("app_token", BaseUtils.getLocalToken(pushClient.getContext(), null));
        this.f45949a.startActivityForResult(intent, 1001);
        return true;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, fuo0 fuo0Var) {
        if (responseErrorCode.getErrorCode() != 0) {
            HMSLog.e("SubscribeNotificationTask", "Notification subscribe failed, error code: " + responseErrorCode.getErrorCode());
            a(responseErrorCode, fuo0Var);
        } else {
            SubscribeNotificationResp subscribeNotificationResp = (SubscribeNotificationResp) JsonUtil.jsonToEntity(str, new SubscribeNotificationResp());
            ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(subscribeNotificationResp.getRetCode());
            if (errorEnumFromCode != ErrorEnum.SUCCESS) {
                fuo0Var.a(errorEnumFromCode.toApiException());
                HMSLog.e("PushLogSC3004", "Notification Subscription failed, StatusCode:" + errorEnumFromCode.getExternalCode());
            } else if (!responseErrorCode.hasResolution()) {
                SubscribeResult subscribeResult = new SubscribeResult();
                subscribeResult.setSubscribedItems(b.a(subscribeNotificationResp.getSubscribeResults()));
                fuo0Var.b(subscribeResult);
            } else if (a(pushClient, responseErrorCode)) {
                fuo0Var.b(new SubscribeResult());
            } else {
                fuo0Var.a(ErrorEnum.ERROR_PUSH_INTERNAL_ERROR.toApiException());
            }
        }
        PushBiUtil.reportExit(pushClient.getContext(), getUri(), responseErrorCode);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 6;
    }

    private void a(ResponseErrorCode responseErrorCode, fuo0 fuo0Var) {
        ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
        if (errorEnumFromCode != ErrorEnum.ERROR_UNKNOWN) {
            fuo0Var.a(errorEnumFromCode.toApiException());
        } else {
            fuo0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }
}
