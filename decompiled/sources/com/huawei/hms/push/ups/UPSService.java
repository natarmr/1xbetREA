package com.huawei.hms.push.ups;

import a.duo0;
import a.e6w0;
import a.muo0;
import a.u6w0;
import a.yg60;
import android.content.Context;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.HmsMessaging;
import com.huawei.hms.push.d;
import com.huawei.hms.push.ups.entity.CodeResult;
import com.huawei.hms.push.ups.entity.TokenResult;
import com.huawei.hms.push.ups.entity.UPSRegisterCallBack;
import com.huawei.hms.push.ups.entity.UPSTurnCallBack;
import com.huawei.hms.push.ups.entity.UPSUnRegisterCallBack;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes2.dex */
public final class UPSService {
    private UPSService() {
    }

    public static void registerToken(Context context, String str, String str2, String str3, UPSRegisterCallBack uPSRegisterCallBack) {
        HMSLog.i("UPSService", "invoke registerToken");
        Preconditions.checkNotNull(uPSRegisterCallBack);
        if (!d.b()) {
            uPSRegisterCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
            return;
        }
        try {
            uPSRegisterCallBack.onResult(new TokenResult(HmsInstanceId.getInstance(context).getToken(str, null)));
        } catch (ApiException e) {
            uPSRegisterCallBack.onResult(new TokenResult(e.getStatusCode(), e.getMessage()));
        }
    }

    public static void turnOffPush(Context context, final UPSTurnCallBack uPSTurnCallBack) {
        HMSLog.i("UPSService", "invoke turnOffPush");
        Preconditions.checkNotNull(uPSTurnCallBack);
        if (!d.b()) {
            uPSTurnCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
            return;
        }
        duo0 duo0VarTurnOffPush = HmsMessaging.getInstance(context).turnOffPush();
        yg60 yg60Var = new yg60() { // from class: com.huawei.hms.push.ups.UPSService.2
            @Override // a.yg60
            public void onComplete(duo0 duo0Var) {
                if (duo0Var.d()) {
                    uPSTurnCallBack.onResult(new CodeResult());
                } else {
                    ApiException apiException = (ApiException) duo0Var.b();
                    uPSTurnCallBack.onResult(new CodeResult(apiException.getStatusCode(), apiException.getMessage()));
                }
            }
        };
        u6w0 u6w0Var = (u6w0) duo0VarTurnOffPush;
        u6w0Var.getClass();
        u6w0Var.e(new e6w0(muo0.c.b, yg60Var));
    }

    public static void turnOnPush(Context context, final UPSTurnCallBack uPSTurnCallBack) {
        HMSLog.i("UPSService", "invoke turnOnPush");
        Preconditions.checkNotNull(uPSTurnCallBack);
        if (!d.b()) {
            uPSTurnCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
            return;
        }
        duo0 duo0VarTurnOnPush = HmsMessaging.getInstance(context).turnOnPush();
        yg60 yg60Var = new yg60() { // from class: com.huawei.hms.push.ups.UPSService.1
            @Override // a.yg60
            public void onComplete(duo0 duo0Var) {
                if (duo0Var.d()) {
                    uPSTurnCallBack.onResult(new CodeResult());
                } else {
                    ApiException apiException = (ApiException) duo0Var.b();
                    uPSTurnCallBack.onResult(new CodeResult(apiException.getStatusCode(), apiException.getMessage()));
                }
            }
        };
        u6w0 u6w0Var = (u6w0) duo0VarTurnOnPush;
        u6w0Var.getClass();
        u6w0Var.e(new e6w0(muo0.c.b, yg60Var));
    }

    public static void unRegisterToken(Context context, UPSUnRegisterCallBack uPSUnRegisterCallBack) {
        HMSLog.i("UPSService", "invoke unRegisterToken");
        Preconditions.checkNotNull(uPSUnRegisterCallBack);
        if (!d.b()) {
            uPSUnRegisterCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
            return;
        }
        try {
            HmsInstanceId.getInstance(context).deleteToken(null, null);
            uPSUnRegisterCallBack.onResult(new TokenResult());
        } catch (ApiException e) {
            uPSUnRegisterCallBack.onResult(new TokenResult(e.getStatusCode(), e.getMessage()));
        }
    }
}
