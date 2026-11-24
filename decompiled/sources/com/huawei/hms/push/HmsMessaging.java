package com.huawei.hms.push;

import a.duo0;
import a.jf4;
import a.u6w0;
import a.v4i0;
import a.yqm0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.encrypt.PushEncrypter;
import com.huawei.hms.aaid.init.AutoInitHelper;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.task.BaseVoidTask;
import com.huawei.hms.push.task.IntentCallable;
import com.huawei.hms.push.task.SendUpStreamTask;
import com.huawei.hms.push.task.SubscribeTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.EnableNotifyReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.api.entity.push.SubscribeReq;
import com.huawei.hms.support.api.entity.push.UpSendMsgReq;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.NetWorkUtil;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class HmsMessaging {
    public static final String DEFAULT_TOKEN_SCOPE = "HCM";
    private static final Pattern c = Pattern.compile("[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f45927a;
    private HuaweiApi<Api.ApiOptions.NoOptions> b;

    private HmsMessaging(Context context) {
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi;
        Preconditions.checkNotNull(context);
        this.f45927a = context;
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

    private duo0 a(boolean z) {
        String strReportEntry = PushBiUtil.reportEntry(this.f45927a, PushNaming.SET_NOTIFY_FLAG);
        if (!d.d(this.f45927a) || d.b()) {
            HMSLog.i("HmsMessaging", "turn on/off with AIDL");
            EnableNotifyReq enableNotifyReq = new EnableNotifyReq();
            enableNotifyReq.setPackageName(this.f45927a.getPackageName());
            enableNotifyReq.setEnable(z);
            return this.b.doWrite(new BaseVoidTask(PushNaming.SET_NOTIFY_FLAG, JsonUtil.createJsonString(enableNotifyReq), strReportEntry));
        }
        if (HwBuildEx.VERSION.EMUI_SDK_INT < 12) {
            HMSLog.e("HmsMessaging", "operation not available on Huawei device with EMUI lower than 5.1");
            u6w0 u6w0Var = new u6w0();
            ErrorEnum errorEnum = ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED;
            ApiException apiException = errorEnum.toApiException();
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
            PushBiUtil.reportExit(this.f45927a, PushNaming.SET_NOTIFY_FLAG, strReportEntry, errorEnum);
            return u6w0Var;
        }
        if (d.b(this.f45927a) < 90101310) {
            HMSLog.i("HmsMessaging", "turn on/off with broadcast v1");
            Intent intentPutExtra = new Intent("com.huawei.intent.action.SELF_SHOW_FLAG").putExtra("enalbeFlag", PushEncrypter.encrypterOld(this.f45927a, this.f45927a.getPackageName() + Separators.POUND + z));
            intentPutExtra.setPackage("android");
            return yqm0.k(new IntentCallable(this.f45927a, intentPutExtra, strReportEntry));
        }
        if (d.b(this.f45927a) < 110118300) {
            HMSLog.i("HmsMessaging", "turn on/off with broadcast v2");
            new PushPreferences(this.f45927a, "push_notify_flag").saveBoolean("notify_msg_enable", !z);
            Uri uri = Uri.parse("content://" + this.f45927a.getPackageName() + ".huawei.push.provider/push_notify_flag.xml");
            Intent intent = new Intent("com.huawei.android.push.intent.SDK_COMMAND");
            intent.putExtra(Payload.TYPE, "enalbeFlag");
            intent.putExtra("pkgName", this.f45927a.getPackageName());
            intent.putExtra(RemoteMessageConst.Notification.URL, uri);
            intent.setPackage("android");
            return yqm0.k(new IntentCallable(this.f45927a, intent, strReportEntry));
        }
        HMSLog.i("HmsMessaging", "turn on/off with broadcast v3");
        if (!TextUtils.isEmpty(BaseUtils.getLocalToken(this.f45927a, null))) {
            new PushPreferences(this.f45927a, "push_notify_flag").saveBoolean("notify_msg_enable", !z);
            Intent intent2 = new Intent("com.huawei.intent.action.SELF_SHOW_FLAG");
            intent2.putExtra("enalbeFlag", z);
            intent2.putExtra(RemoteMessageConst.DEVICE_TOKEN, BaseUtils.getLocalToken(this.f45927a, null));
            intent2.putExtra("pkgName", this.f45927a.getPackageName());
            intent2.putExtra(CommonConstant.KEY_UID, this.f45927a.getApplicationInfo().uid);
            intent2.setPackage("android");
            return yqm0.k(new IntentCallable(this.f45927a, intent2, strReportEntry));
        }
        u6w0 u6w0Var2 = new u6w0();
        ApiException apiException2 = ErrorEnum.ERROR_NO_TOKEN.toApiException();
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

    public static synchronized HmsMessaging getInstance(Context context) {
        return new HmsMessaging(context);
    }

    public boolean isAutoInitEnabled() {
        return AutoInitHelper.isAutoInitEnabled(this.f45927a);
    }

    public void send(RemoteMessage remoteMessage) {
        if (ProxyCenter.getProxy() == null) {
            HMSLog.i("HmsMessaging", "send upstream message");
            a(remoteMessage);
        } else {
            HMSLog.e("HmsMessaging", "Operation(send) unsupported");
            v4i0.p("Operation(send) unsupported");
        }
    }

    public void setAutoInitEnabled(boolean z) {
        AutoInitHelper.setAutoInitEnabled(this.f45927a, z);
    }

    public duo0 subscribe(String str) {
        HMSLog.i("HmsMessaging", "invoke subscribe");
        return a(str, "Sub");
    }

    public duo0 turnOffPush() {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "turn off for proxy");
            return ProxyCenter.getProxy().turnOff(this.f45927a, null);
        }
        HMSLog.i("HmsMessaging", "invoke turnOffPush");
        return a(false);
    }

    public duo0 turnOnPush() {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "turn on for proxy");
            return ProxyCenter.getProxy().turnOn(this.f45927a, null);
        }
        HMSLog.i("HmsMessaging", "invoke turnOnPush");
        return a(true);
    }

    public duo0 unsubscribe(String str) {
        HMSLog.i("HmsMessaging", "invoke unsubscribe");
        return a(str, "UnSub");
    }

    private void a(RemoteMessage remoteMessage) {
        String strReportEntry = PushBiUtil.reportEntry(this.f45927a, PushNaming.UPSEND_MSG);
        ErrorEnum errorEnumA = v.a(this.f45927a);
        if (errorEnumA == ErrorEnum.SUCCESS) {
            if (!TextUtils.isEmpty(remoteMessage.getTo())) {
                if (!TextUtils.isEmpty(remoteMessage.getMessageId())) {
                    if (!TextUtils.isEmpty(remoteMessage.getData())) {
                        UpSendMsgReq upSendMsgReq = new UpSendMsgReq();
                        upSendMsgReq.setPackageName(this.f45927a.getPackageName());
                        upSendMsgReq.setMessageId(remoteMessage.getMessageId());
                        upSendMsgReq.setTo(remoteMessage.getTo());
                        upSendMsgReq.setData(remoteMessage.getData());
                        upSendMsgReq.setMessageType(remoteMessage.getMessageType());
                        upSendMsgReq.setTtl(remoteMessage.getTtl());
                        upSendMsgReq.setCollapseKey(remoteMessage.getCollapseKey());
                        upSendMsgReq.setSendMode(remoteMessage.getSendMode());
                        upSendMsgReq.setReceiptMode(remoteMessage.getReceiptMode());
                        if (d.b()) {
                            this.b.doWrite(new BaseVoidTask(PushNaming.UPSEND_MSG, JsonUtil.createJsonString(upSendMsgReq), strReportEntry));
                            return;
                        } else {
                            a(upSendMsgReq, strReportEntry);
                            return;
                        }
                    }
                    HMSLog.e("HmsMessaging", "Mandatory parameter 'data' missing");
                    PushBiUtil.reportExit(this.f45927a, PushNaming.UPSEND_MSG, strReportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
                    jf4.o("Mandatory parameter 'data' missing");
                    return;
                }
                HMSLog.e("HmsMessaging", "Mandatory parameter 'message_id' missing");
                PushBiUtil.reportExit(this.f45927a, PushNaming.UPSEND_MSG, strReportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
                jf4.o("Mandatory parameter 'message_id' missing");
                return;
            }
            HMSLog.e("HmsMessaging", "Mandatory parameter 'to' missing");
            PushBiUtil.reportExit(this.f45927a, PushNaming.UPSEND_MSG, strReportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            jf4.o("Mandatory parameter 'to' missing");
            return;
        }
        HMSLog.e("HmsMessaging", "Message sent failed:" + errorEnumA.getExternalCode() + ':' + errorEnumA.getMessage());
        PushBiUtil.reportExit(this.f45927a, PushNaming.UPSEND_MSG, strReportEntry, errorEnumA);
        v4i0.p(errorEnumA.getMessage());
    }

    private duo0 a(String str, String str2) {
        String strReportEntry = PushBiUtil.reportEntry(this.f45927a, PushNaming.SUBSCRIBE);
        if (str != null && c.matcher(str).matches()) {
            if (ProxyCenter.getProxy() != null) {
                HMSLog.i("HmsMessaging", "use proxy subscribe.");
                return TextUtils.equals(str2, "Sub") ? ProxyCenter.getProxy().subscribe(this.f45927a, str, strReportEntry) : ProxyCenter.getProxy().unsubscribe(this.f45927a, str, strReportEntry);
            }
            try {
                ErrorEnum errorEnumA = v.a(this.f45927a);
                if (errorEnumA == ErrorEnum.SUCCESS) {
                    if (NetWorkUtil.getNetworkType(this.f45927a) != 0) {
                        SubscribeReq subscribeReq = new SubscribeReq(this.f45927a, str2, str);
                        subscribeReq.setToken(BaseUtils.getLocalToken(this.f45927a, null));
                        boolean zB = d.b();
                        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi = this.b;
                        if (zB) {
                            return huaweiApi.doWrite(new BaseVoidTask(PushNaming.SUBSCRIBE, JsonUtil.createJsonString(subscribeReq), strReportEntry));
                        }
                        return huaweiApi.doWrite(new SubscribeTask(PushNaming.SUBSCRIBE, JsonUtil.createJsonString(subscribeReq), strReportEntry));
                    }
                    HMSLog.e("HmsMessaging", "no network");
                    throw ErrorEnum.ERROR_NO_NETWORK.toApiException();
                }
                throw errorEnumA.toApiException();
            } catch (ApiException e) {
                u6w0 u6w0Var = new u6w0();
                synchronized (u6w0Var.f35157a) {
                    try {
                        if (!u6w0Var.b) {
                            u6w0Var.b = true;
                            u6w0Var.d = e;
                            u6w0Var.f35157a.notifyAll();
                            u6w0Var.f();
                        }
                        PushBiUtil.reportExit(this.f45927a, PushNaming.SUBSCRIBE, strReportEntry, e.getStatusCode());
                        return u6w0Var;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception unused) {
                u6w0 u6w0Var2 = new u6w0();
                ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
                ApiException apiException = errorEnum.toApiException();
                synchronized (u6w0Var2.f35157a) {
                    try {
                        if (!u6w0Var2.b) {
                            u6w0Var2.b = true;
                            u6w0Var2.d = apiException;
                            u6w0Var2.f35157a.notifyAll();
                            u6w0Var2.f();
                        }
                        PushBiUtil.reportExit(this.f45927a, PushNaming.SUBSCRIBE, strReportEntry, errorEnum);
                        return u6w0Var2;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        PushBiUtil.reportExit(this.f45927a, PushNaming.SUBSCRIBE, strReportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
        HMSLog.e("HmsMessaging", "Invalid topic: topic should match the format:[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
        jf4.o("Invalid topic: topic should match the format:[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
        return null;
    }

    private void a(UpSendMsgReq upSendMsgReq, String str) {
        String str2;
        upSendMsgReq.setToken(BaseUtils.getLocalToken(this.f45927a, null));
        try {
            str2 = str;
            try {
                this.b.doWrite(new SendUpStreamTask(PushNaming.UPSEND_MSG, JsonUtil.createJsonString(upSendMsgReq), str2, upSendMsgReq.getPackageName(), upSendMsgReq.getMessageId()));
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                if (exc.getCause() instanceof ApiException) {
                    PushBiUtil.reportExit(this.f45927a, PushNaming.UPSEND_MSG, str2, ((ApiException) exc.getCause()).getStatusCode());
                } else {
                    PushBiUtil.reportExit(this.f45927a, PushNaming.UPSEND_MSG, str2, ErrorEnum.ERROR_INTERNAL_ERROR);
                }
            }
        } catch (Exception e2) {
            e = e2;
            str2 = str;
        }
    }
}
