package com.huawei.hms.hwid.internal.ui.activity;

import a.f140;
import a.kng0;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.activity.ForegroundIntentBuilder;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.hwid.ao;
import com.huawei.hms.hwid.ar;
import com.huawei.hms.hwid.as;
import com.huawei.hms.hwid.f;
import com.huawei.hms.hwid.q;
import com.huawei.hms.hwid.s;
import com.huawei.hms.hwid.y;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.api.entity.hwid.HuaweiIdSignInRequest;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.hwid.result.HuaweiIdAuthResult;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService;
import com.huawei.hms.ui.SafeIntent;
import com.huawei.hms.utils.HMSPackageManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HwIdSignInHubActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45905a = null;
    private boolean b = false;
    private HuaweiIdSignInRequest c = null;
    private HuaweiIdAuthResult d = null;
    private s e;

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        HwIdSignInHubActivity hwIdSignInHubActivity;
        int i2;
        s sVar;
        as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "onSignInAccountFailed: retCode：" + i, true);
        String str = this.f45905a;
        if (str == null || (sVar = this.e) == null) {
            hwIdSignInHubActivity = this;
            i2 = i;
        } else {
            hwIdSignInHubActivity = this;
            i2 = i;
            HiAnalyticsClient.reportExit(hwIdSignInHubActivity, CommonNaming.signinIntent, str, sVar.a(), ar.a(i), i2, (int) this.e.b());
            as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "report: api=hwid.signinintentversion=" + hwIdSignInHubActivity.e.b(), true);
        }
        Status status = new Status(i2);
        HuaweiIdAuthResult huaweiIdAuthResult = new HuaweiIdAuthResult();
        huaweiIdAuthResult.setStatus(status);
        Intent intent = new Intent();
        try {
            intent.putExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID, huaweiIdAuthResult.toJson());
        } catch (JSONException unused) {
            as.d("[HUAWEIIDSDK]HwIdSignInClientHub", "convert result to json failed", true);
        }
        hwIdSignInHubActivity.setResult(0, intent);
        hwIdSignInHubActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "startSignInActivity", true);
        try {
            startActivityForResult(c(), 16587);
        } catch (ActivityNotFoundException e) {
            this.b = true;
            as.d("[HUAWEIIDSDK]HwIdSignInClientHub", "Launch sign in Intent failed. hms is probably being updated：".concat(e.getClass().getSimpleName()), true);
            a(17);
        }
    }

    private Intent c() {
        as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "getJosSignInIntent", true);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("HUAWEIID_CP_CLIENTINFO");
        String stringExtra2 = intent.getStringExtra("HUAWEIID_SIGNIN_REQUEST");
        String stringExtra3 = intent.getStringExtra("exParams");
        as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "getJosSignInIntent. exParams is null " + TextUtils.isEmpty(stringExtra3), true);
        if (!TextUtils.isEmpty(stringExtra3)) {
            try {
                JSONObject jSONObject = new JSONObject(stringExtra2);
                jSONObject.put("exParams", stringExtra3);
                stringExtra2 = jSONObject.toString();
            } catch (JSONException e) {
                as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "getJosSignInIntent Exception ".concat(e.getClass().getSimpleName()), true);
            }
        }
        String action = intent.getAction();
        try {
            s sVarA = s.a(stringExtra);
            ForegroundIntentBuilder kitSdkVersion = new ForegroundIntentBuilder(this).setAction(action).setRequestBody(stringExtra2).setKitSdkVersion(60900100);
            if (sVarA.c() != null) {
                kitSdkVersion.setSubAppId(sVarA.c());
            }
            Intent intentBuild = kitSdkVersion.build();
            as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "get package name of hms is " + HMSPackageManager.getInstance(this).getHMSPackageName(), true);
            as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "Current package name is " + getPackageName(), true);
            intentBuild.setPackage(getPackageName());
            return intentBuild;
        } catch (Exception e2) {
            as.d("[HUAWEIIDSDK]HwIdSignInClientHub", "getSignInIntent failed because:".concat(e2.getClass().getSimpleName()), true);
            return new Intent();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        HwIdSignInHubActivity hwIdSignInHubActivity;
        s sVar;
        super.onActivityResult(i, i2, intent);
        as.b("[HUAWEIIDSDK]HwIdSignInClientHub", f140.j(i, "onActivityResult: requestCode：", i2, " , resultCode："), true);
        SafeIntent safeIntent = intent != null ? new SafeIntent(intent) : null;
        if (this.b || i != 16587) {
            return;
        }
        int statusCode = 8;
        if (safeIntent == null || (stringExtra = safeIntent.getStringExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID)) == null) {
            if (i2 <= 0) {
                i2 = 8;
            }
            a(i2);
            return;
        }
        try {
            this.d = new HuaweiIdAuthResult().fromJson(stringExtra);
            y.a().a(this.d.getHuaweiId(), this.c.getHuaweiIdAuthParams());
            statusCode = this.d.getStatus().getStatusCode();
        } catch (JSONException unused) {
            this.d = null;
            as.d("[HUAWEIIDSDK]HwIdSignInClientHub", "onActivityResult: JsonException", true);
        }
        int i3 = statusCode;
        String str = this.f45905a;
        if (str == null || (sVar = this.e) == null) {
            hwIdSignInHubActivity = this;
        } else {
            hwIdSignInHubActivity = this;
            HiAnalyticsClient.reportExit(hwIdSignInHubActivity, CommonNaming.signinIntent, str, sVar.a(), ar.a(i3), i3, (int) this.e.b());
            as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "report: api=hwid.signinintentversion=" + hwIdSignInHubActivity.e.b(), true);
        }
        hwIdSignInHubActivity.setResult(i2, safeIntent);
        hwIdSignInHubActivity.finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (a(intent)) {
            a(0, "invalid intent");
            return;
        }
        SafeIntent safeIntent = new SafeIntent(intent);
        boolean booleanExtra = safeIntent.getBooleanExtra("intent.extra.isfullscreen", false);
        as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "isActivityFullScreen is :" + booleanExtra, true);
        if (booleanExtra) {
            f.a(getWindow());
            getWindow().setFlags(1024, 1024);
        } else {
            f.a(this);
        }
        String action = safeIntent.getAction();
        if (!TextUtils.equals("com.huawei.hms.jos.signIn", action)) {
            a(0, action != null ? kng0.k("unknow Action:", action) : "unknow Action:");
            return;
        }
        String stringExtra = safeIntent.getStringExtra("HUAWEIID_CP_CLIENTINFO");
        try {
            this.c = HuaweiIdSignInRequest.fromJson(safeIntent.getStringExtra("HUAWEIID_SIGNIN_REQUEST"));
        } catch (JSONException unused) {
            this.c = null;
            as.d("[HUAWEIIDSDK]HwIdSignInClientHub", "onCreate: JsonException", true);
        }
        if (TextUtils.isEmpty(stringExtra)) {
            a(0, "Activity started with invalid cp client info");
            return;
        }
        try {
            this.e = s.a(stringExtra);
        } catch (JSONException unused2) {
            this.e = null;
            as.d("[HUAWEIIDSDK]HwIdSignInClientHub", "onCreate: JsonException", true);
        }
        if (this.c == null || this.e == null) {
            a(0, "Activity started with invalid sign in request info");
            return;
        }
        ao.a(this);
        if (bundle != null) {
            restoreInstanceState(bundle);
        } else {
            this.f45905a = HiAnalyticsClient.reportEntry(this, CommonNaming.signinIntent, 60900100);
            a();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.f45905a;
        if (str == null || bundle == null) {
            return;
        }
        bundle.putString("HiAnalyticsTransId", str);
    }

    public void restoreInstanceState(Bundle bundle) {
        if (bundle != null) {
            this.f45905a = bundle.getString("HiAnalyticsTransId");
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
        as.d("[HUAWEIIDSDK]HwIdSignInClientHub", str, true);
        setResult(0);
        finish();
    }

    private void a() {
        as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "checkMinVersion start.", true);
        q.a(this, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.hwid.internal.ui.activity.HwIdSignInHubActivity.1
            @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
            public void onComplete(int i) {
                if (i == 0) {
                    as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "version check ok", true);
                    HwIdSignInHubActivity.this.b();
                } else {
                    as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "version check failed", true);
                    HwIdSignInHubActivity.this.a(i);
                }
            }
        });
    }
}
