package com.huawei.hms.hwid;

import a.fuo0;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.account.result.AccountIcon;
import com.huawei.hms.support.account.result.GetChannelResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.core.CommonCode;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class i extends TaskApiCall<c, AccountIcon> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f45904a;

    public i(String str, String str2, String str3, Context context) {
        super(str, str2, str3);
        this.f45904a = context;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(c cVar, ResponseErrorCode responseErrorCode, String str, fuo0 fuo0Var) {
        if (responseErrorCode == null) {
            as.b("[AccountSDK]AccountGetChannelTaskApiCall", "response is null.", true);
            fuo0Var.a(new ApiException(new Status(CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, "response is null.")));
            return;
        }
        int errorCode = responseErrorCode.getErrorCode();
        if (errorCode != 0 && CommonCode.Resolution.HAS_RESOLUTION.equals(responseErrorCode.getResolution())) {
            as.b("[AccountSDK]AccountGetChannelTaskApiCall", "apk version is low or is not exist.", true);
            Status status = new Status(errorCode, responseErrorCode.getErrorReason());
            ao.a(responseErrorCode, status);
            fuo0Var.a(new ResolvableApiException(status));
            return;
        }
        as.b("[AccountSDK]AccountGetChannelTaskApiCall", "ResponseErrorCode.status:" + responseErrorCode.getErrorCode(), true);
        AccountIcon accountIcon = new AccountIcon();
        if (TextUtils.isEmpty(str)) {
            as.b("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel complete, response is null, failed", true);
            fuo0Var.a(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
            return;
        }
        if ("{}".equals(str)) {
            as.b("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel complete, body is null", true);
            fuo0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            return;
        }
        try {
            GetChannelResult getChannelResultFromJson = new GetChannelResult().fromJson(str);
            if (!getChannelResultFromJson.isSuccess()) {
                as.b("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel failed", true);
                fuo0Var.a(new ApiException(getChannelResultFromJson.getStatus()));
                return;
            }
            as.b("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel success", true);
            accountIcon.setDescription(getChannelResultFromJson.getDescription());
            accountIcon.setIcon(a(getChannelResultFromJson.getIcon()));
            fuo0Var.b(accountIcon);
            long jA = ao.a();
            SharedPreferences.Editor editorEdit = this.f45904a.getSharedPreferences("ACCOUNT_CHANNEL_CACHE", 0).edit();
            editorEdit.putLong("cache_time", jA);
            editorEdit.putString("desc", getChannelResultFromJson.getDescription());
            editorEdit.putString("icon", getChannelResultFromJson.getIcon());
            editorEdit.apply();
        } catch (JSONException unused) {
            as.c("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel complete, but parser json exception", true);
            fuo0Var.a(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 10;
    }

    private Bitmap a(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e) {
            as.d("[AccountSDK]AccountGetChannelTaskApiCall", "stringToBitmap Exception is ".concat(e.getClass().getSimpleName()), true);
            return null;
        } catch (OutOfMemoryError unused) {
            as.d("[AccountSDK]AccountGetChannelTaskApiCall", "out of memory error ", true);
            return null;
        }
    }
}
