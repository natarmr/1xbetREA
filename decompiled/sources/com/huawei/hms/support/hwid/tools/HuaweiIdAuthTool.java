package com.huawei.hms.support.hwid.tools;

import a.duo0;
import a.e6w0;
import a.fh60;
import a.muo0;
import a.nh60;
import a.u6w0;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.hwid.aa;
import com.huawei.hms.hwid.as;
import com.huawei.hms.hwid.r;
import com.huawei.hms.hwid.t;
import com.huawei.hms.hwid.x;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.hwid.common.HuaweiIdAuthException;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthService;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthServiceImpl;
import com.huawei.hms.utils.HMSPackageManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HuaweiIdAuthTool {
    protected static final String TAG = "[HUAWEIIDSDK]HuaweiIdAuthTool";

    private HuaweiIdAuthTool() {
    }

    private static t a(HuaweiIdAuthService huaweiIdAuthService, String str) throws HuaweiIdAuthException {
        as.b(TAG, "start countDownLatch innerSignIn:" + str, true);
        final t tVar = new t();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        duo0 duo0VarSilentSignIn = huaweiIdAuthService.silentSignIn();
        nh60 nh60Var = new nh60() { // from class: com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.3
            @Override // a.nh60
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(AuthHuaweiId authHuaweiId) {
                as.b(HuaweiIdAuthTool.TAG, "silentSignIn success", true);
                tVar.a(0);
                tVar.a(authHuaweiId.getAccessToken());
                tVar.b(authHuaweiId.getUnionId());
                countDownLatch.countDown();
            }
        };
        u6w0 u6w0Var = (u6w0) duo0VarSilentSignIn;
        u6w0Var.getClass();
        u6w0Var.e(new e6w0(muo0.c.b, nh60Var));
        duo0VarSilentSignIn.a(new fh60() { // from class: com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.4
            @Override // a.fh60
            public void onFailure(Exception exc) {
                as.b(HuaweiIdAuthTool.TAG, "silentSignIn fail", true);
                if (exc instanceof ApiException) {
                    tVar.a(((ApiException) exc).getStatusCode());
                }
                countDownLatch.countDown();
            }
        });
        boolean zAwait = false;
        try {
            zAwait = countDownLatch.await(10L, TimeUnit.SECONDS);
            if (!zAwait) {
                throw new HuaweiIdAuthException("connection timeout[907135004 ].");
            }
        } catch (InterruptedException unused) {
            as.d(TAG, "innerSignIn InterruptedException.", true);
            tVar.a(8);
        }
        as.b(TAG, str + " end countDownLatch awaitValue:" + zAwait, true);
        int iA = tVar.a();
        if (iA == 0) {
            return tVar;
        }
        as.d(TAG, str + " fail, error code is:" + iA, true);
        throw new HuaweiIdAuthException(str + " error[" + iA + "]");
    }

    private static Account b(Context context, String str) throws HuaweiIdAuthException {
        if (context == null) {
            as.b(TAG, "context is null", true);
            throw new HuaweiIdAuthException("context is null");
        }
        String hMSPackageName = HMSPackageManager.getInstance(context).getHMSPackageName();
        as.b(TAG, "get package name of hms is " + hMSPackageName, true);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(hMSPackageName)) {
            return null;
        }
        return new Account(str, hMSPackageName);
    }

    public static void deleteAuthInfo(Context context, String str) throws HuaweiIdAuthException {
        a(context, str);
    }

    @Deprecated
    public static String requestAccessToken(Context context, String str, List<Scope> list) {
        return requestAccessToken(context, b(context, str), list, new Bundle());
    }

    public static String requestUnionId(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Scope(CommonConstant.SCOPE.SCOPE_ACCOUNT_OPENID));
        return a(context, b(context, str), arrayList, new Bundle(), "requestUnionId").c();
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f46008a;

        private a() {
        }

        public void a(int i) {
            this.f46008a = i;
        }

        public int a() {
            return this.f46008a;
        }
    }

    public static void deleteAuthInfo(Activity activity, String str) throws HuaweiIdAuthException {
        a(activity, str);
    }

    @Deprecated
    public static String requestAccessToken(Activity activity, String str, List<Scope> list, Bundle bundle) {
        return requestAccessToken(activity, b(activity, str), list, bundle);
    }

    @Deprecated
    public static String requestAccessToken(Context context, String str, List<Scope> list, Bundle bundle) {
        return requestAccessToken(context, b(context, str), list, bundle);
    }

    @Deprecated
    public static String requestAccessToken(Activity activity, String str, List<Scope> list) {
        return requestAccessToken(activity, b(activity, str), list, new Bundle());
    }

    public static String requestAccessToken(Context context, Account account, List<Scope> list) {
        return requestAccessToken(context, account, list, new Bundle());
    }

    public static String requestAccessToken(Activity activity, Account account, List<Scope> list) {
        return requestAccessToken(activity, account, list, new Bundle());
    }

    public static String requestAccessToken(Context context, Account account, List<Scope> list, Bundle bundle) {
        return a(context, account, list, bundle, "requestAccessToken").b();
    }

    public static String requestAccessToken(Activity activity, Account account, List<Scope> list, Bundle bundle) {
        return a(activity, account, list, bundle, "requestAccessToken").b();
    }

    public static String requestUnionId(Activity activity, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Scope(CommonConstant.SCOPE.SCOPE_ACCOUNT_OPENID));
        return a(activity, b(activity, str), arrayList, new Bundle(), "requestUnionId").c();
    }

    private static void a(Context context, String str) throws HuaweiIdAuthException {
        boolean z;
        r.a();
        x.a();
        if (context != null) {
            if (context instanceof Activity) {
                z = true;
            } else {
                a(context);
                z = false;
            }
            if (TextUtils.isEmpty(str)) {
                as.b(TAG, "accessToken is null or empty.", true);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(com.huawei.hms.support.feature.result.CommonConstant.KEY_ACCESS_TOKEN, str);
                HuaweiIdAuthServiceImpl huaweiIdAuthServiceImpl = new HuaweiIdAuthServiceImpl(context, (HuaweiIdAuthParams) null, 60900100);
                if (z) {
                    huaweiIdAuthServiceImpl = new HuaweiIdAuthServiceImpl((Activity) context, (HuaweiIdAuthParams) null, 60900100);
                }
                a(huaweiIdAuthServiceImpl.doWrite(new aa(CommonNaming.signout, jSONObject.toString(), HiAnalyticsClient.reportEntry(context, CommonNaming.signout, 60900100))));
                return;
            } catch (JSONException unused) {
                throw new HuaweiIdAuthException("json error.");
            }
        }
        throw new HuaweiIdAuthException("Context or Activity is null.");
    }

    private static t a(Context context, Account account, List<Scope> list, Bundle bundle, String str) throws HuaweiIdAuthException {
        boolean z;
        HuaweiIdAuthServiceImpl huaweiIdAuthServiceImpl;
        r.a();
        if (context != null) {
            if (context instanceof Activity) {
                z = true;
            } else {
                a(context);
                z = false;
            }
            a(context, account, list, bundle);
            HuaweiIdAuthParams huaweiIdAuthParamsCreateParams = new HuaweiIdAuthParamsHelper().setAccessToken().setScopeList(list).createParams();
            String str2 = account == null ? "" : account.name;
            if (z) {
                huaweiIdAuthServiceImpl = new HuaweiIdAuthServiceImpl((Activity) context, huaweiIdAuthParamsCreateParams, str2, 60900100);
            } else {
                huaweiIdAuthServiceImpl = new HuaweiIdAuthServiceImpl(context, huaweiIdAuthParamsCreateParams, str2, 60900100);
            }
            return a(huaweiIdAuthServiceImpl, str);
        }
        throw new HuaweiIdAuthException("Context or Activity is null.");
    }

    private static void a(Context context) throws HuaweiIdAuthException {
        int iIsHuaweiMobileServicesAvailable = new AvailableAdapter(40000300).isHuaweiMobileServicesAvailable(context);
        as.b(TAG, "checkDependentHMSVersion result is: " + iIsHuaweiMobileServicesAvailable, true);
        if (1 == iIsHuaweiMobileServicesAvailable) {
            throw new HuaweiIdAuthException("hms apk is not exist[2013]");
        }
        if (2 == iIsHuaweiMobileServicesAvailable) {
            throw new HuaweiIdAuthException("hms apk version is low[2013]");
        }
    }

    private static void a(Context context, Account account, List<Scope> list, Bundle bundle) throws HuaweiIdAuthException {
        String hMSPackageName = HMSPackageManager.getInstance(context).getHMSPackageName();
        as.b(TAG, "get package name of hms is " + hMSPackageName, true);
        String str = (account == null || hMSPackageName.equals(account.type)) ? null : "Account type is not supported.";
        if (!TextUtils.isEmpty(str)) {
            throw new HuaweiIdAuthException(str);
        }
    }

    private static void a(final duo0 duo0Var) throws HuaweiIdAuthException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final a aVar = new a();
        nh60 nh60Var = new nh60() { // from class: com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.2
            @Override // a.nh60
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r3) {
                as.b(HuaweiIdAuthTool.TAG, "deleteAuthInfo Success.", true);
                countDownLatch.countDown();
                aVar.a(0);
            }
        };
        u6w0 u6w0Var = (u6w0) duo0Var;
        u6w0Var.getClass();
        u6w0Var.e(new e6w0(muo0.c.b, nh60Var));
        duo0Var.a(new fh60() { // from class: com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.1
            @Override // a.fh60
            public void onFailure(Exception exc) {
                int statusCode = ((ApiException) duo0Var.b()).getStatusCode();
                as.b(HuaweiIdAuthTool.TAG, "deleteAuthInfo fail: " + statusCode, true);
                countDownLatch.countDown();
                aVar.a(statusCode);
            }
        });
        try {
            if (!countDownLatch.await(10L, TimeUnit.SECONDS)) {
                throw new HuaweiIdAuthException("connection timeout[907135004 ].");
            }
        } catch (InterruptedException unused) {
            aVar.a(8);
        }
        if (aVar.a() != 0) {
            if (aVar.a() != 8) {
                if (aVar.a() == 2010) {
                    as.c(TAG, "invalid arguments[907135000].", true);
                }
            } else {
                throw new HuaweiIdAuthException("unknown interruption[8].");
            }
        }
        as.b(TAG, "deleteAuthInfo return[success]", true);
    }
}
