package com.huawei.hms.aaid;

import a.duo0;
import a.kng0;
import a.u6w0;
import android.app.Activity;
import android.content.Context;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.opendevice.b;
import com.huawei.hms.opendevice.g;
import com.huawei.hms.opendevice.h;
import com.huawei.hms.support.log.HMSLog;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class HmsInstanceIdEx {
    public static final String TAG = "HmsInstanceIdEx";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f45692a;
    private PushPreferences b;
    private HuaweiApi<Api.ApiOptions.NoOptions> c;

    private HmsInstanceIdEx(Context context) {
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi;
        this.b = null;
        this.f45692a = context;
        this.b = new PushPreferences(context, "aaid");
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            huaweiApi = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
            this.c = huaweiApi;
        } else {
            huaweiApi = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
            this.c = huaweiApi;
        }
        huaweiApi.setKitSdkVersion(61300301);
    }

    private duo0 a(Exception exc) {
        u6w0 u6w0Var = new u6w0();
        synchronized (u6w0Var.f35157a) {
            try {
                if (!u6w0Var.b) {
                    u6w0Var.b = true;
                    u6w0Var.d = exc;
                    u6w0Var.f35157a.notifyAll();
                    u6w0Var.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u6w0Var;
    }

    public static HmsInstanceIdEx getInstance(Context context) {
        Preconditions.checkNotNull(context);
        return new HmsInstanceIdEx(context);
    }

    public void deleteAAID(String str) throws ApiException {
        if (str == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        try {
            if (this.b.containsKey(str)) {
                this.b.removeKey(str);
                this.b.removeKey(a(str));
            }
        } catch (RuntimeException unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        } catch (Exception unused2) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public String getAAId(String str) throws ApiException {
        if (str == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        try {
            if (this.b.containsKey(str)) {
                return this.b.getString(str);
            }
            String string = UUID.randomUUID().toString();
            this.b.saveString(str, string);
            this.b.saveLong(a(str), Long.valueOf(System.currentTimeMillis()));
            return string;
        } catch (RuntimeException unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        } catch (Exception unused2) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public long getCreationTime(String str) throws ApiException {
        if (str == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        try {
            if (!this.b.containsKey(a(str))) {
                getAAId(str);
            }
            return this.b.getLong(a(str));
        } catch (RuntimeException unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        } catch (Exception unused2) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public duo0 getToken() {
        if (ProxyCenter.getProxy() == null) {
            String strA = h.a(this.f45692a, "push.gettoken");
            try {
                TokenReq tokenReqB = b.b(this.f45692a, null, null);
                tokenReqB.setAaid(HmsInstanceId.getInstance(this.f45692a).getId());
                return this.c.doWrite(new g("push.gettoken", tokenReqB, this.f45692a, strA));
            } catch (RuntimeException unused) {
                Context context = this.f45692a;
                ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
                h.a(context, "push.gettoken", strA, errorEnum);
                return a(errorEnum.toApiException());
            } catch (Exception unused2) {
                Context context2 = this.f45692a;
                ErrorEnum errorEnum2 = ErrorEnum.ERROR_INTERNAL_ERROR;
                h.a(context2, "push.gettoken", strA, errorEnum2);
                return a(errorEnum2.toApiException());
            }
        }
        try {
            HMSLog.i(TAG, "use proxy get token, please check HmsMessageService.onNewToken receive result.");
            ProxyCenter.getProxy().getToken(this.f45692a, null, null);
            u6w0 u6w0Var = new u6w0();
            TokenResult tokenResult = new TokenResult();
            synchronized (u6w0Var.f35157a) {
                try {
                    if (!u6w0Var.b) {
                        u6w0Var.b = true;
                        u6w0Var.c = tokenResult;
                        u6w0Var.f35157a.notifyAll();
                        u6w0Var.f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return u6w0Var;
        } catch (ApiException e) {
            return a(e);
        } catch (Exception unused3) {
            return a(ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
        }
    }

    private String a(String str) {
        return kng0.k("creationTime", str);
    }
}
