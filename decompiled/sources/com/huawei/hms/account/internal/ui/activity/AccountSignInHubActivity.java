package com.huawei.hms.account.internal.ui.activity;

import a.f140;
import a.kng0;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.activity.ForegroundIntentBuilder;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.hwid.a;
import com.huawei.hms.hwid.ao;
import com.huawei.hms.hwid.ap;
import com.huawei.hms.hwid.ar;
import com.huawei.hms.hwid.as;
import com.huawei.hms.hwid.b;
import com.huawei.hms.hwid.f;
import com.huawei.hms.hwid.g;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.result.AccountAuthResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.account.AccountSignInRequest;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService;
import com.huawei.hms.ui.SafeIntent;
import com.huawei.hms.utils.HMSPackageManager;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AccountSignInHubActivity extends Activity {
    private b e;
    private int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45697a = null;
    private boolean b = false;
    private AccountSignInRequest c = null;
    private AccountAuthResult d = null;
    private String g = CommonNaming.signinIntent;

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        AccountSignInHubActivity accountSignInHubActivity;
        int i2;
        b bVar;
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "onSignInAccountFailed: retCode：" + i, true);
        String str = this.f45697a;
        if (str == null || (bVar = this.e) == null) {
            accountSignInHubActivity = this;
            i2 = i;
        } else {
            accountSignInHubActivity = this;
            i2 = i;
            HiAnalyticsClient.reportExit(accountSignInHubActivity, this.g, str, bVar.a(), ar.a(i), i2, (int) this.e.b());
        }
        Status status = new Status(i2);
        AccountAuthResult accountAuthResult = new AccountAuthResult();
        accountAuthResult.setStatus(status);
        Intent intent = new Intent();
        try {
            intent.putExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID, accountAuthResult.toJson());
        } catch (JSONException unused) {
            as.d("[ACCOUNTSDK]AccountSignInHubActivity", "convert result to json failed", true);
        }
        accountSignInHubActivity.setResult(0, intent);
        accountSignInHubActivity.finish();
    }

    private void b() {
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "checkMinVersion start.", true);
        a.a(this, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.account.internal.ui.activity.AccountSignInHubActivity.1
            @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
            public void onComplete(int i) {
                if (i == 0) {
                    as.b("[ACCOUNTSDK]AccountSignInHubActivity", "version check ok", true);
                    AccountSignInHubActivity.this.c();
                } else {
                    as.b("[ACCOUNTSDK]AccountSignInHubActivity", "version check failed", true);
                    AccountSignInHubActivity.this.a(i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "startSignInActivity", true);
        try {
            startActivityForResult(d(), this.f == 1 ? 16588 : 16587);
        } catch (ActivityNotFoundException e) {
            this.b = true;
            as.d("[ACCOUNTSDK]AccountSignInHubActivity", "Launch sign in Intent failed. hms is probably being updated：".concat(e.getClass().getSimpleName()), true);
            a(17);
        }
    }

    private Intent d() {
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "getJosSignInIntent", true);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("HUAWEIID_CP_CLIENTINFO");
        String stringExtra2 = intent.getStringExtra("HUAWEIID_SIGNIN_REQUEST");
        String stringExtra3 = intent.getStringExtra("exParams");
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "getJosSignInIntent. exParams is null " + TextUtils.isEmpty(stringExtra3), true);
        if (!TextUtils.isEmpty(stringExtra3)) {
            try {
                JSONObject jSONObject = new JSONObject(stringExtra2);
                jSONObject.put("exParams", stringExtra3);
                stringExtra2 = jSONObject.toString();
            } catch (JSONException e) {
                as.b("[ACCOUNTSDK]AccountSignInHubActivity", "getJosSignInIntent Exception ".concat(e.getClass().getSimpleName()), true);
            }
        }
        String action = intent.getAction();
        try {
            b bVarA = b.a(stringExtra);
            ForegroundIntentBuilder kitSdkVersion = new ForegroundIntentBuilder(this).setAction(action).setRequestBody(stringExtra2).setKitSdkVersion(60900100);
            if (bVarA.c() != null) {
                kitSdkVersion.setSubAppId(bVarA.c());
            }
            if (this.f == 1) {
                as.b("[ACCOUNTSDK]AccountSignInHubActivity", "setApiLevel is 11", true);
                kitSdkVersion.setApiLevel(11);
            }
            if (e().booleanValue()) {
                as.b("[ACCOUNTSDK]AccountSignInHubActivity", "setApiLevel is 13", true);
                kitSdkVersion.setApiLevel(13);
            }
            if (f()) {
                as.b("[ACCOUNTSDK]AccountSignInHubActivity", "setApiLevel is 22", true);
                kitSdkVersion.setApiLevel(22);
            }
            Intent intentBuild = kitSdkVersion.build();
            as.b("[ACCOUNTSDK]AccountSignInHubActivity", "get package name of hms is " + HMSPackageManager.getInstance(this).getHMSPackageName(), true);
            as.b("[ACCOUNTSDK]AccountSignInHubActivity", "current package name is " + getPackageName(), true);
            intentBuild.setPackage(getPackageName());
            return intentBuild;
        } catch (Exception e2) {
            as.d("[ACCOUNTSDK]AccountSignInHubActivity", "getSignInIntent failed because:".concat(e2.getClass().getSimpleName()), true);
            return new Intent();
        }
    }

    private Boolean e() {
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "checkCarrierIdPermission begin", true);
        AccountAuthParams accountAuthParams = this.c.getAccountAuthParams();
        if (accountAuthParams == null) {
            return Boolean.FALSE;
        }
        List<PermissionInfo> permissionInfos = accountAuthParams.getPermissionInfos();
        if (ap.b(permissionInfos).booleanValue()) {
            Iterator<PermissionInfo> it = permissionInfos.iterator();
            while (it.hasNext()) {
                String permission = it.next().getPermission();
                if (permission != null && permission.equals(CommonConstant.LocalPermission.CARRIER_ID)) {
                    as.b("[ACCOUNTSDK]AccountSignInHubActivity", "permissioninfos contain carrierId", true);
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }

    private boolean f() {
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "checkNeedConsent begin", true);
        AccountAuthParams accountAuthParams = this.c.getAccountAuthParams();
        if (accountAuthParams == null) {
            return false;
        }
        try {
            return new JSONObject(accountAuthParams.getSignInParams()).optBoolean(CommonConstant.RequestParams.KEY_ID_NEED_CONSENT, false);
        } catch (JSONException e) {
            as.d("[ACCOUNTSDK]AccountSignInHubActivity", "JSONException:".concat(e.getClass().getSimpleName()), true);
            return false;
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        AccountSignInHubActivity accountSignInHubActivity;
        b bVar;
        super.onActivityResult(i, i2, intent);
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", f140.j(i, "onActivityResult: requestCode：", i2, " , resultCode："), true);
        SafeIntent safeIntent = intent != null ? new SafeIntent(intent) : null;
        if (this.b) {
            return;
        }
        if (i == 16587 || i == 16588) {
            int statusCode = 8;
            if (safeIntent == null || (stringExtra = safeIntent.getStringExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID)) == null) {
                if (i2 <= 0) {
                    i2 = 8;
                }
                a(i2);
                return;
            }
            try {
                this.d = new AccountAuthResult().fromJson(stringExtra);
                if (i == 16587) {
                    g.a().a(this.d.getAccount(), this.c.getAccountAuthParams());
                }
                statusCode = this.d.getStatus().getStatusCode();
            } catch (JSONException unused) {
                this.d = null;
                as.d("[ACCOUNTSDK]AccountSignInHubActivity", "onActivityResult: JsonException", true);
            }
            int i3 = statusCode;
            String str = this.f45697a;
            if (str == null || (bVar = this.e) == null) {
                accountSignInHubActivity = this;
            } else {
                accountSignInHubActivity = this;
                HiAnalyticsClient.reportExit(accountSignInHubActivity, this.g, str, bVar.a(), ar.a(i3), i3, (int) this.e.b());
            }
            accountSignInHubActivity.setResult(i2, safeIntent);
            accountSignInHubActivity.finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (a(intent)) {
            a(0, "invalid intent");
            return;
        }
        SafeIntent safeIntent = new SafeIntent(intent);
        a(safeIntent.getBooleanExtra("intent.extra.isfullscreen", false));
        String action = safeIntent.getAction();
        if (!TextUtils.equals("com.huawei.hms.jos.signIn", action) && !TextUtils.equals("com.huawei.hms.account.signIn", action) && !TextUtils.equals("com.huawei.hms.account.picker.signIn", action)) {
            a(0, action != null ? kng0.k("unknow Action:", action) : "unknow Action:");
            return;
        }
        String stringExtra = safeIntent.getStringExtra("HUAWEIID_CP_CLIENTINFO");
        try {
            this.c = AccountSignInRequest.fromJson(safeIntent.getStringExtra("HUAWEIID_SIGNIN_REQUEST"));
        } catch (JSONException unused) {
            this.c = null;
            as.d("[ACCOUNTSDK]AccountSignInHubActivity", "onCreate: JsonException", true);
        }
        if (TextUtils.isEmpty(stringExtra)) {
            a(0, "Activity started with invalid cp client info");
            return;
        }
        try {
            this.e = b.a(stringExtra);
        } catch (JSONException unused2) {
            this.e = null;
            as.d("[ACCOUNTSDK]AccountSignInHubActivity", "onCreate: JsonException", true);
        }
        if (this.c == null || this.e == null) {
            a(0, "Activity started with invalid sign in request info");
            return;
        }
        if (!a()) {
            a(CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR);
            return;
        }
        int intExtra = safeIntent.getIntExtra("INDEPENDENT_SIGN_IN_FLAG", 0);
        this.f = intExtra;
        if (intExtra == 1 && !a(safeIntent).booleanValue()) {
            a(CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR);
            return;
        }
        ao.a(this);
        if (bundle != null) {
            restoreInstanceState(bundle);
        } else {
            this.f45697a = HiAnalyticsClient.reportEntry(this, this.g, 60900100);
            b();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "onSaveInstanceState start", true);
        String str = this.f45697a;
        if (str == null || bundle == null) {
            return;
        }
        bundle.putString("HiAnalyticsTransId", str);
    }

    public void restoreInstanceState(Bundle bundle) {
        if (bundle != null) {
            this.f45697a = bundle.getString("HiAnalyticsTransId");
        }
    }

    private boolean a() {
        AccountAuthParams accountAuthParams = this.c.getAccountAuthParams();
        if (accountAuthParams == null) {
            return false;
        }
        try {
            int iOptInt = new JSONObject(accountAuthParams.getSignInParams()).optInt(CommonConstant.RequestParams.KEY_ID_TOKEN_SIGN_ALG, 2);
            return iOptInt == 1 || iOptInt == 2;
        } catch (JSONException e) {
            as.d("[ACCOUNTSDK]AccountSignInHubActivity", "JSONException:".concat(e.getClass().getSimpleName()), true);
            return false;
        }
    }

    private boolean a(Intent intent) {
        if (intent == null) {
            return true;
        }
        try {
            intent.getStringExtra("ANYTHING");
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    private void a(int i, String str) {
        as.d("[ACCOUNTSDK]AccountSignInHubActivity", "errMessage is: " + str, true);
        setResult(0);
        finish();
    }

    private Boolean a(SafeIntent safeIntent) {
        String stringExtra = safeIntent.getStringExtra("ACCESS_TOKEN");
        AccountAuthParams accountAuthParams = this.c.getAccountAuthParams();
        if (accountAuthParams == null) {
            a("accountAuthParams is null");
            return Boolean.FALSE;
        }
        List<Scope> requestScopeList = accountAuthParams.getRequestScopeList();
        if (!TextUtils.isEmpty(stringExtra) && !ap.a(requestScopeList).booleanValue() && requestScopeList.size() == 1) {
            this.g = CommonNaming.independentsigninIntent;
            return Boolean.TRUE;
        }
        a("independent sign in params error");
        return Boolean.FALSE;
    }

    private void a(String str) {
        as.d("[ACCOUNTSDK]AccountSignInHubActivity", "onIndependentSignInFailed errMessage:" + str, true);
        Status status = new Status(CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, str);
        AccountAuthResult accountAuthResult = new AccountAuthResult();
        accountAuthResult.setStatus(status);
        Intent intent = new Intent();
        try {
            intent.putExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID, accountAuthResult.toJson());
        } catch (JSONException unused) {
            as.d("[ACCOUNTSDK]AccountSignInHubActivity", "convert result to json failed", true);
        }
        setResult(0, intent);
        finish();
    }

    private void a(boolean z) {
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "isActivityFullScreen is :" + z, true);
        if (z) {
            f.a(getWindow());
            getWindow().setFlags(1024, 1024);
        } else {
            f.a(this);
        }
    }
}
