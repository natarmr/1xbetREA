package com.huawei.hms.push;

import a.duo0;
import a.o050;
import a.u6w0;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.agconnect.config.impl.AGConnectServicesConfigImpl;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.task.ProfileTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.ProfileReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* JADX INFO: loaded from: classes2.dex */
public class HmsProfile {
    public static final int CUSTOM_PROFILE = 2;
    public static final int HUAWEI_PROFILE = 1;
    private static final String c = "HmsProfile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f45928a;
    private HuaweiApi<Api.ApiOptions.NoOptions> b;

    private HmsProfile(Context context) {
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi;
        this.f45928a = null;
        Preconditions.checkNotNull(context);
        this.f45928a = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            huaweiApi = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
            this.b = huaweiApi;
        } else {
            huaweiApi = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
            this.b = huaweiApi;
        }
        huaweiApi.setKitSdkVersion(61300301);
    }

    private duo0 a(int i, String str, int i2, String str2) {
        if (!isSupportProfile()) {
            u6w0 u6w0Var = new u6w0();
            ApiException apiException = ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException();
            synchronized (u6w0Var.f35157a) {
                try {
                    if (!u6w0Var.b) {
                        u6w0Var.b = true;
                        u6w0Var.d = apiException;
                        u6w0Var.f35157a.notifyAll();
                        u6w0Var.f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return u6w0Var;
        }
        if (!TextUtils.isEmpty(str)) {
            String strA = a(this.f45928a);
            if (TextUtils.isEmpty(strA)) {
                HMSLog.i(c, "agc connect services config missing project id.");
                u6w0 u6w0Var2 = new u6w0();
                ApiException apiException2 = ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException();
                synchronized (u6w0Var2.f35157a) {
                    try {
                        if (!u6w0Var2.b) {
                            u6w0Var2.b = true;
                            u6w0Var2.d = apiException2;
                            u6w0Var2.f35157a.notifyAll();
                            u6w0Var2.f();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return u6w0Var2;
            }
            if (str.equals(strA)) {
                str = "";
            }
        }
        ProfileReq profileReq = new ProfileReq();
        if (i == 0) {
            profileReq.setOperation(0);
            profileReq.setType(i2);
        } else {
            profileReq.setOperation(1);
        }
        String strReportEntry = PushBiUtil.reportEntry(this.f45928a, PushNaming.PUSH_PROFILE);
        try {
            profileReq.setSubjectId(str);
            profileReq.setProfileId(o050.V(str2));
            profileReq.setPkgName(this.f45928a.getPackageName());
            return this.b.doWrite(new ProfileTask(PushNaming.PUSH_PROFILE, JsonUtil.createJsonString(profileReq), strReportEntry));
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                u6w0 u6w0Var3 = new u6w0();
                ApiException apiException3 = (ApiException) e.getCause();
                synchronized (u6w0Var3.f35157a) {
                    try {
                        if (!u6w0Var3.b) {
                            u6w0Var3.b = true;
                            u6w0Var3.d = apiException3;
                            u6w0Var3.f35157a.notifyAll();
                            u6w0Var3.f();
                        }
                        PushBiUtil.reportExit(this.f45928a, PushNaming.PUSH_PROFILE, strReportEntry, apiException3.getStatusCode());
                        return u6w0Var3;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            u6w0 u6w0Var4 = new u6w0();
            Context context = this.f45928a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            PushBiUtil.reportExit(context, PushNaming.PUSH_PROFILE, strReportEntry, errorEnum);
            ApiException apiException4 = errorEnum.toApiException();
            synchronized (u6w0Var4.f35157a) {
                try {
                    if (!u6w0Var4.b) {
                        u6w0Var4.b = true;
                        u6w0Var4.d = apiException4;
                        u6w0Var4.f35157a.notifyAll();
                        u6w0Var4.f();
                    }
                    return u6w0Var4;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    private boolean b(Context context) {
        return d.b(context) >= 110001400;
    }

    public static HmsProfile getInstance(Context context) {
        return new HmsProfile(context);
    }

    public duo0 addProfile(String str, int i, String str2) {
        if (i != 1 && i != 2) {
            HMSLog.i(c, "add profile type undefined.");
            u6w0 u6w0Var = new u6w0();
            ApiException apiException = ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException();
            synchronized (u6w0Var.f35157a) {
                try {
                    if (!u6w0Var.b) {
                        u6w0Var.b = true;
                        u6w0Var.d = apiException;
                        u6w0Var.f35157a.notifyAll();
                        u6w0Var.f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return u6w0Var;
        }
        if (!TextUtils.isEmpty(str2)) {
            return a(0, str, i, str2);
        }
        HMSLog.i(c, "add profile params is empty.");
        u6w0 u6w0Var2 = new u6w0();
        ApiException apiException2 = ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException();
        synchronized (u6w0Var2.f35157a) {
            try {
                if (!u6w0Var2.b) {
                    u6w0Var2.b = true;
                    u6w0Var2.d = apiException2;
                    u6w0Var2.f35157a.notifyAll();
                    u6w0Var2.f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u6w0Var2;
    }

    public duo0 deleteProfile(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return a(1, str, -1, str2);
        }
        HMSLog.e(c, "del profile params is empty.");
        u6w0 u6w0Var = new u6w0();
        ApiException apiException = ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException();
        synchronized (u6w0Var.f35157a) {
            try {
                if (!u6w0Var.b) {
                    u6w0Var.b = true;
                    u6w0Var.d = apiException;
                    u6w0Var.f35157a.notifyAll();
                    u6w0Var.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u6w0Var;
    }

    public boolean isSupportProfile() {
        if (!d.d(this.f45928a)) {
            return true;
        }
        if (d.c()) {
            HMSLog.i(c, "current EMUI version below 9.1, not support profile operation.");
            return false;
        }
        if (b(this.f45928a)) {
            return true;
        }
        HMSLog.i(c, "current HwPushService.apk version below 11.0.1.400,please upgrade your HwPushService.apk version.");
        return false;
    }

    public duo0 deleteProfile(String str) {
        return deleteProfile("", str);
    }

    public duo0 addProfile(int i, String str) {
        return addProfile("", i, str);
    }

    private static String a(Context context) {
        return ((AGConnectServicesConfigImpl) AGConnectServicesConfig.c(context)).getString("client/project_id");
    }
}
