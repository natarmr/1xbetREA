package com.huawei.hms.support.account.service;

import a.duo0;
import a.fuo0;
import a.u6w0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.hwid.ao;
import com.huawei.hms.hwid.as;
import com.huawei.hms.hwid.d;
import com.huawei.hms.hwid.f;
import com.huawei.hms.hwid.h;
import com.huawei.hms.hwid.i;
import com.huawei.hms.hwid.j;
import com.huawei.hms.hwid.l;
import com.huawei.hms.hwid.m;
import com.huawei.hms.hwid.n;
import com.huawei.hms.hwid.o;
import com.huawei.hms.hwid.p;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.result.AccountIcon;
import com.huawei.hms.support.api.account.AccountGetTokenOptions;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.account.AccountLogoutRequest;
import com.huawei.hms.support.api.entity.account.AccountNaming;
import com.huawei.hms.support.api.entity.account.AccountSignInRequest;
import com.huawei.hms.support.api.entity.account.AccountSignOutReq;
import com.huawei.hms.support.api.entity.account.AccountStartAssistLoginRequest;
import com.huawei.hms.support.api.entity.account.GetAssistTokenRequest;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AccountAuthServiceImpl extends HuaweiApi<AccountAuthParams> implements AccountAuthService {
    private static final Api<AccountAuthParams> ACCOUNT_AUTH_API = new Api<>("AuthAccount.API");
    private static final Long ONE_WEEK_MILLISECOND = 604800000L;
    protected static final String TAG = "[ACCOUNT]AccountAuthServiceImpl";
    private String mAccountName;
    private boolean mFromRequestToken;

    public AccountAuthServiceImpl(Context context, AccountAuthParams accountAuthParams, String str, int i) {
        super(context, ACCOUNT_AUTH_API, accountAuthParams, new d(), i);
        this.mAccountName = str;
        this.mFromRequestToken = true;
    }

    private boolean checkIdTokenSignAlg(AccountAuthParams accountAuthParams) {
        as.b(TAG, "checkIdTokenSignAlg", true);
        if (accountAuthParams == null) {
            as.d(TAG, "accountAuthParams is null", true);
            return false;
        }
        try {
            int i = new JSONObject(accountAuthParams.getSignInParams()).getInt(CommonConstant.RequestParams.KEY_ID_TOKEN_SIGN_ALG);
            return i == 1 || i == 2;
        } catch (JSONException e) {
            as.d(TAG, "JSONException:".concat(e.getClass().getSimpleName()), true);
            return false;
        }
    }

    private duo0 doWriteGetAssistToken(GetAssistTokenRequest getAssistTokenRequest) {
        try {
            return doWrite(new p(AccountNaming.getAssistToken, getAssistTokenRequest.toJson(), HiAnalyticsClient.reportEntry(getContext(), AccountNaming.getAssistToken, 60900100)));
        } catch (JSONException unused) {
            as.d(TAG, "JSONException， errorcode is:2015", true);
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

    private Bitmap stringToBitmap(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e) {
            as.d(TAG, "stringToBitmap Exception is ".concat(e.getClass().getSimpleName()), true);
            return null;
        } catch (OutOfMemoryError unused) {
            as.d(TAG, "out of memory error ", true);
            return null;
        }
    }

    @Override // com.huawei.hms.support.feature.service.AuthService
    public duo0 cancelAuthorization() {
        as.b(TAG, "cancelAuthorization", true);
        AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
        accountSignInRequest.setAccountAuthParams(getOption());
        try {
            return doWrite(new h(AccountNaming.revokeAccessAccount, accountSignInRequest.toJson(), HiAnalyticsClient.reportEntry(getContext(), AccountNaming.revokeAccessAccount, 60900100)));
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
        List<PermissionInfo> permissionInfos;
        AccountAuthParams option = getOption();
        if (option != null && (permissionInfos = option.getPermissionInfos()) != null && permissionInfos.size() != 0) {
            Iterator<PermissionInfo> it = permissionInfos.iterator();
            while (it.hasNext()) {
                String permission = it.next().getPermission();
                if (permission != null && permission.equals(CommonConstant.LocalPermission.CARRIER_ID)) {
                    as.b(TAG, "permissioninfos contain carrierId and silentSignIn setApiLevel is 13", true);
                    return 13;
                }
            }
        }
        return 1;
    }

    @Override // com.huawei.hms.support.account.service.AccountAuthService
    public duo0 getAssistToken(GetAssistTokenRequest getAssistTokenRequest) {
        as.b(TAG, "getAssistToken", true);
        return doWriteGetAssistToken(getAssistTokenRequest);
    }

    @Override // com.huawei.hms.support.account.service.AccountAuthService
    public duo0 getChannel() {
        as.b(TAG, "getChannel", true);
        AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
        accountSignInRequest.setAccountAuthParams(getOption());
        Context context = getContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences("ACCOUNT_CHANNEL_CACHE", 0);
        String string = sharedPreferences.getString("icon", "");
        String string2 = sharedPreferences.getString("desc", "");
        long j = sharedPreferences.getLong("cache_time", 0L);
        long jA = ao.a();
        if (j != 0 && !TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && jA - j < ONE_WEEK_MILLISECOND.longValue()) {
            AccountIcon accountIcon = new AccountIcon(string2, stringToBitmap(string));
            fuo0 fuo0Var = new fuo0();
            fuo0Var.b(accountIcon);
            fuo0Var.a(new ApiException(new Status(0)));
            return fuo0Var.f10174a;
        }
        try {
            return doWrite(new i(AccountNaming.getChannelAccount, accountSignInRequest.toJson(), HiAnalyticsClient.reportEntry(getContext(), AccountNaming.getChannelAccount, 60900100), context));
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

    @Override // com.huawei.hms.support.account.service.AccountAuthService
    public Intent getIndependentSignInIntent(String str) {
        as.b(TAG, "getIndependentSignInIntent", true);
        return f.a(getContext(), getOption(), getSubAppID(), str);
    }

    @Override // com.huawei.hms.support.feature.service.AuthService
    public Intent getSignInIntent() {
        as.b(TAG, "getSignInIntent", true);
        return f.a(getContext(), getOption(), getSubAppID());
    }

    @Override // com.huawei.hms.support.account.service.AccountAuthService
    public duo0 logout() {
        as.b(TAG, "logout", true);
        AccountLogoutRequest accountLogoutRequest = new AccountLogoutRequest();
        accountLogoutRequest.setAccountAuthParams(getOption());
        try {
            return doWrite(new j(AccountNaming.logout, accountLogoutRequest.toJson(), HiAnalyticsClient.reportEntry(getContext(), AccountNaming.logout, 60900100)));
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

    @Override // com.huawei.hms.support.feature.service.AuthService
    public duo0 signOut() {
        as.b(TAG, "signOut", true);
        f.a();
        AccountSignOutReq accountSignOutReq = new AccountSignOutReq();
        return doWrite(new n(AccountNaming.signoutAccount, accountSignOutReq.toJson(), HiAnalyticsClient.reportEntry(getContext(), CommonNaming.signout, 60900100)));
    }

    @Override // com.huawei.hms.support.account.service.AccountAuthService
    public duo0 silentSignIn() {
        as.b(TAG, "silentSignIn", true);
        AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
        AccountAuthParams option = getOption();
        accountSignInRequest.setAccountAuthParams(option);
        boolean z = this.mFromRequestToken;
        if (z) {
            accountSignInRequest.setAccountGetTokenOptions(new AccountGetTokenOptions(this.mAccountName, z));
        }
        if (!checkIdTokenSignAlg(option)) {
            as.d(TAG, "idTokenSignAlg is invalid", true);
            u6w0 u6w0Var = new u6w0();
            ApiException apiException = new ApiException(new Status(CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, "idTokenSignAlg is invalid"));
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
        try {
            String json = accountSignInRequest.toJson();
            String strReportEntry = HiAnalyticsClient.reportEntry(getContext(), AccountNaming.silentSignInAccount, 60900100);
            return this.mFromRequestToken ? doWrite(new l(AccountNaming.silentSignInAccount, json, strReportEntry)) : doWrite(new m(AccountNaming.silentSignInAccount, json, strReportEntry));
        } catch (JSONException unused) {
            as.d(TAG, "JSONException, errorcode is:2015", true);
            u6w0 u6w0Var2 = new u6w0();
            ApiException apiException2 = new ApiException(new Status(2015));
            synchronized (u6w0Var2.f35157a) {
                try {
                    if (!u6w0Var2.b) {
                        u6w0Var2.b = true;
                        u6w0Var2.d = apiException2;
                        u6w0Var2.f35157a.notifyAll();
                        u6w0Var2.f();
                    }
                    return u6w0Var2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.huawei.hms.support.account.service.AccountAuthService
    public duo0 startAssistLogin(String str) {
        as.b(TAG, "startAssistLogin", true);
        try {
            return doWrite(new o(AccountNaming.startAssistLogin, new AccountStartAssistLoginRequest(str).toJson(), HiAnalyticsClient.reportEntry(getContext(), AccountNaming.startAssistLogin, 60900100)));
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

    public AccountAuthServiceImpl(Context context, AccountAuthParams accountAuthParams, int i) {
        super(context, ACCOUNT_AUTH_API, accountAuthParams, new d(), i);
    }

    public AccountAuthServiceImpl(Activity activity, AccountAuthParams accountAuthParams, int i) {
        super(activity, ACCOUNT_AUTH_API, accountAuthParams, (AbstractClientBuilder) new d(), i);
    }

    public AccountAuthServiceImpl(Activity activity, AccountAuthParams accountAuthParams, String str, int i) {
        super(activity, ACCOUNT_AUTH_API, accountAuthParams, (AbstractClientBuilder) new d(), i);
        this.mAccountName = str;
        this.mFromRequestToken = true;
    }
}
