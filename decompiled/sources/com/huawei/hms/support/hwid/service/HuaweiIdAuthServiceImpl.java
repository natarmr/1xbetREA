package com.huawei.hms.support.hwid.service;

import a.duo0;
import a.u6w0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.hwid.ab;
import com.huawei.hms.hwid.ac;
import com.huawei.hms.hwid.ad;
import com.huawei.hms.hwid.as;
import com.huawei.hms.hwid.v;
import com.huawei.hms.hwid.x;
import com.huawei.hms.hwid.z;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.api.entity.hwid.HuaweiIdSignInRequest;
import com.huawei.hms.support.api.entity.hwid.SignOutReq;
import com.huawei.hms.support.api.hwid.HuaweiIdGetTokenOptions;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HuaweiIdAuthServiceImpl extends HuaweiApi<HuaweiIdAuthParams> implements HuaweiIdAuthService {
    private static final Api<HuaweiIdAuthParams> HUAWEI_ID_AUTH_API = new Api<>(HuaweiApiAvailability.HMS_API_NAME_ID);
    protected static final String TAG = "[HUAWEIIDSDK]HuaweiIdAuthService";
    private String mAccountName;
    private boolean mFromRequestToken;

    public HuaweiIdAuthServiceImpl(Context context, HuaweiIdAuthParams huaweiIdAuthParams, String str, int i) {
        super(context, HUAWEI_ID_AUTH_API, huaweiIdAuthParams, new v(), i);
        this.mAccountName = str;
        this.mFromRequestToken = true;
    }

    private HuaweiIdAuthParams setSignInParams(String str) {
        HuaweiIdAuthParams option = getOption();
        try {
            new JSONObject(str);
            try {
                HuaweiIdAuthParams huaweiIdAuthParamsM27clone = option.m27clone();
                huaweiIdAuthParamsM27clone.setSignInParams(str);
                return huaweiIdAuthParamsM27clone;
            } catch (CloneNotSupportedException unused) {
                as.d(TAG, "CloneNotSupportedException", true);
                return option;
            }
        } catch (JSONException unused2) {
            as.d(TAG, "JSONException", true);
            return option;
        }
    }

    @Override // com.huawei.hms.support.feature.service.AuthService
    public duo0 cancelAuthorization() {
        as.b(TAG, "cancelAuthorization", true);
        HuaweiIdSignInRequest huaweiIdSignInRequest = new HuaweiIdSignInRequest();
        huaweiIdSignInRequest.setHuaweiIdAuthParams(getOption());
        try {
            return doWrite(new z(CommonNaming.revokeAccess, huaweiIdSignInRequest.toJson(), HiAnalyticsClient.reportEntry(getContext(), CommonNaming.revokeAccess, 60900100)));
        } catch (JSONException unused) {
            as.d(TAG, "JSONException, errorcode is:2015", true);
            u6w0 u6w0Var = new u6w0();
            ApiException apiException = new ApiException(new Status(2015));
            synchronized (u6w0Var.f35157a) {
                try {
                    if (!u6w0Var.b) {
                        u6w0Var.b = true;
                        u6w0Var.d = apiException;
                        u6w0Var.f35157a.notifyAll();
                        u6w0Var.f();
                    }
                    return u6w0Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        return 1;
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAuthService
    public Intent getSignInIntent(String str) {
        as.b(TAG, "getSignInIntent", true);
        return x.a(getContext(), setSignInParams(str), getSubAppID());
    }

    @Override // com.huawei.hms.support.feature.service.AuthService
    public duo0 signOut() {
        as.b(TAG, "signOut", true);
        x.a();
        SignOutReq signOutReq = new SignOutReq();
        return doWrite(new ad(CommonNaming.signout, signOutReq.toJson(), HiAnalyticsClient.reportEntry(getContext(), CommonNaming.signout, 60900100)));
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAuthService
    public duo0 silentSignIn(String str) {
        as.b(TAG, "silentSignIn", true);
        HuaweiIdSignInRequest huaweiIdSignInRequest = new HuaweiIdSignInRequest();
        huaweiIdSignInRequest.setHuaweiIdAuthParams(setSignInParams(str));
        boolean z = this.mFromRequestToken;
        if (z) {
            huaweiIdSignInRequest.setHuaweiIdGetTokenOptions(new HuaweiIdGetTokenOptions(this.mAccountName, z));
        }
        try {
            String json = huaweiIdSignInRequest.toJson();
            String strReportEntry = HiAnalyticsClient.reportEntry(getContext(), CommonNaming.silentSignIn, 60900100);
            return this.mFromRequestToken ? doWrite(new ab(CommonNaming.silentSignIn, json, strReportEntry)) : doWrite(new ac(CommonNaming.silentSignIn, json, strReportEntry));
        } catch (JSONException unused) {
            as.d(TAG, "JSONException, errorcode is:2015", true);
            u6w0 u6w0Var = new u6w0();
            ApiException apiException = new ApiException(new Status(2015));
            synchronized (u6w0Var.f35157a) {
                try {
                    if (!u6w0Var.b) {
                        u6w0Var.b = true;
                        u6w0Var.d = apiException;
                        u6w0Var.f35157a.notifyAll();
                        u6w0Var.f();
                    }
                    return u6w0Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public HuaweiIdAuthServiceImpl(Context context, HuaweiIdAuthParams huaweiIdAuthParams, int i) {
        super(context, HUAWEI_ID_AUTH_API, huaweiIdAuthParams, new v(), i);
    }

    public HuaweiIdAuthServiceImpl(Activity activity, HuaweiIdAuthParams huaweiIdAuthParams, int i) {
        super(activity, HUAWEI_ID_AUTH_API, huaweiIdAuthParams, (AbstractClientBuilder) new v(), i);
    }

    public HuaweiIdAuthServiceImpl(Activity activity, HuaweiIdAuthParams huaweiIdAuthParams, String str, int i) {
        super(activity, HUAWEI_ID_AUTH_API, huaweiIdAuthParams, (AbstractClientBuilder) new v(), i);
        this.mAccountName = str;
        this.mFromRequestToken = true;
    }

    @Override // com.huawei.hms.support.feature.service.AuthService
    public Intent getSignInIntent() {
        return getSignInIntent("");
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAuthService
    public duo0 silentSignIn() {
        return silentSignIn("");
    }
}
