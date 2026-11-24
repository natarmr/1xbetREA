package ru.ok.android.sdk;

import a.b1j;
import a.gf60;
import a.kng0;
import a.tx3;
import a.x5;
import a.y5;
import a.z5;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.Serializable;
import java.net.URLEncoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class OkAuthActivity extends Activity {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f47322a;
    public String b;
    public String[] c;
    public gf60 d;
    public boolean e;
    public boolean f;
    public Integer g;
    public WebView h;

    public static /* synthetic */ void f(OkAuthActivity okAuthActivity, String str, String str2, long j, String str3, int i2) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            j = 0;
        }
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        okAuthActivity.e(j, str, str2, str3);
    }

    public final void a() {
        String str;
        String str2 = this.f47322a;
        if (str2 == null || StringsKt.W(str2) || (str = this.b) == null || StringsKt.W(str)) {
            d(getString(R.string.no_application_data));
            return;
        }
        gf60 gf60Var = this.d;
        if (gf60Var == gf60.f11194a || gf60Var == gf60.c) {
            Intent intent = new Intent();
            intent.setClassName("ru.ok.android", "ru.ok.android.external.LoginExternal");
            ResolveInfo resolveInfoResolveActivity = getPackageManager().resolveActivity(intent, 0);
            if (resolveInfoResolveActivity != null) {
                try {
                    PackageInfo packageInfo = getPackageManager().getPackageInfo(resolveInfoResolveActivity.activityInfo.packageName, 64);
                    if (packageInfo != null) {
                        if (packageInfo.versionCode < 120) {
                            packageInfo = null;
                        }
                        if (packageInfo != null && (!this.f || packageInfo.versionCode >= 638)) {
                            Signature[] signatureArr = packageInfo.signatures;
                            signatureArr.getClass();
                            for (Signature signature : signatureArr) {
                                if (Intrinsics.d(signature.toCharsString(), "3082025b308201c4a00302010202044f6760f9300d06092a864886f70d01010505003071310c300a06035504061303727573310c300a06035504081303737062310c300a0603550407130373706231163014060355040a130d4f646e6f6b6c6173736e696b6931143012060355040b130b6d6f62696c65207465616d311730150603550403130e416e647265792041736c616d6f763020170d3132303331393136333831375a180f32303636313232313136333831375a3071310c300a06035504061303727573310c300a06035504081303737062310c300a0603550407130373706231163014060355040a130d4f646e6f6b6c6173736e696b6931143012060355040b130b6d6f62696c65207465616d311730150603550403130e416e647265792041736c616d6f7630819f300d06092a864886f70d010101050003818d003081890281810080bea15bf578b898805dfd26346b2fbb662889cd6aba3f8e53b5b27c43a984eeec9a5d21f6f11667d987b77653f4a9651e20b94ff10594f76a93a6a36e6a42f4d851847cf1da8d61825ce020b7020cd1bc2eb435b0d416908be9393516ca1976ff736733c1d48ff17cd57f21ad49e05fc99384273efc5546e4e53c5e9f391c430203010001300d06092a864886f70d0101050500038181007d884df69a9748eabbdcfe55f07360433b23606d3b9d4bca03109c3ffb80fccb7809dfcbfd5a466347f1daf036fbbf1521754c2d1d999f9cbc66b884561e8201459aa414677e411e66360c3840ca4727da77f6f042f2c011464e99f34ba7df8b4bceb4fa8231f1d346f4063f7ba0e887918775879e619786728a8078c76647ed")) {
                                    intent.putExtra(CommonConstant.ReqAccessTokenParam.CLIENT_ID, this.f47322a);
                                    intent.putExtra("client_secret", "6C6B6397C2BCE5EDB7290039");
                                    if (this.f) {
                                        intent.putExtra("oauth_type", "code");
                                    }
                                    String[] strArr = this.c;
                                    if (strArr == null) {
                                        Intrinsics.h("mScopes");
                                        throw null;
                                    }
                                    if (strArr.length != 0) {
                                        intent.putExtra("scopes", strArr);
                                    }
                                    startActivityForResult(intent, 31337);
                                    this.e = true;
                                    return;
                                }
                            }
                        }
                    }
                } catch (ActivityNotFoundException | PackageManager.NameNotFoundException unused) {
                }
            }
            gf60Var = this.d;
            if (gf60Var == gf60.f11194a) {
                d(getString(R.string.no_ok_application_installed));
                return;
            }
        }
        if (gf60Var == gf60.b || gf60Var == gf60.c) {
            WebView webView = this.h;
            if (webView == null) {
                Intrinsics.h("mWebView");
                throw null;
            }
            webView.loadUrl(b());
        }
    }

    public final String b() {
        String strK = b1j.k("https://connect.ok.ru/oauth/authorize?client_id=", this.f47322a, "&response_type=", this.f ? "code" : "token", "&redirect_uri=okauth://auth&layout=m&platform=ANDROID");
        String[] strArr = this.c;
        if (strArr != null) {
            return strArr.length == 0 ? strK : kng0.l(strK, "&scope=", URLEncoder.encode(tx3.N(strArr, Separators.SEMICOLON, null, null, null, 62)));
        }
        Intrinsics.h("mScopes");
        throw null;
    }

    public final void c(String str) {
        Intent intent = new Intent();
        intent.putExtra("error", str);
        setResult(3, intent);
        finish();
    }

    public final void d(String str) {
        Intent intent = new Intent();
        intent.putExtra("error", str);
        setResult(2, intent);
        finish();
    }

    public final void e(long j, String str, String str2, String str3) {
        Intent intent = new Intent();
        if (str != null) {
            str2.getClass();
            SharedPreferences sharedPreferences = getSharedPreferences("oksdkprefs", 0);
            sharedPreferences.getClass();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("acctkn", str);
            editorEdit.putString("ssk", str2);
            editorEdit.apply();
            intent.putExtra("access_token", str);
            intent.putExtra("session_secret_key", str2);
            if (j > 0) {
                intent.putExtra("expires_in", j);
            }
        } else {
            intent.putExtra("code", str3);
        }
        setResult(-1, intent);
        finish();
    }

    public final void g(String str) {
        if (isFinishing()) {
            return;
        }
        try {
            Integer num = this.g;
            (num != null ? new AlertDialog.Builder(new ContextThemeWrapper(this, num.intValue())) : new AlertDialog.Builder(this)).setMessage(str).setPositiveButton(getString(R.string.retry), new x5(this, (byte) 3)).setNegativeButton(getString(R.string.cancel), new y5(this, str, (byte) 1)).show();
        } catch (RuntimeException unused) {
            c(str);
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        String stringExtra;
        OkAuthActivity okAuthActivity;
        if (i2 != 31337) {
            super.onActivityResult(i2, i3, intent);
            return;
        }
        this.e = false;
        if (intent == null || (stringExtra = intent.getStringExtra("error")) == null) {
            stringExtra = "";
        }
        if (i3 == -1) {
            String stringExtra2 = intent != null ? intent.getStringExtra("code") : null;
            String stringExtra3 = intent != null ? intent.getStringExtra("access_token") : null;
            String stringExtra4 = intent != null ? intent.getStringExtra("session_secret_key") : null;
            String stringExtra5 = intent != null ? intent.getStringExtra("refresh_token") : null;
            long longExtra = intent != null ? intent.getLongExtra("expires_in", 0L) : 0L;
            if (stringExtra3 == null && stringExtra2 == null) {
                d(stringExtra);
            } else {
                okAuthActivity = this;
                okAuthActivity.e(longExtra, stringExtra3, stringExtra4 == null ? stringExtra5 : stringExtra4, stringExtra2);
            }
            okAuthActivity.finish();
        }
        if (i3 == 0) {
            c(stringExtra);
        } else if (i3 == 2) {
            d(stringExtra);
        }
        okAuthActivity = this;
        okAuthActivity.finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        gf60 gf60Var;
        super.onCreate(bundle);
        setContentView(R.layout.oksdk_webview_activity);
        findViewById(R.id.web_view).setVisibility(4);
        View viewFindViewById = findViewById(R.id.web_view);
        viewFindViewById.getClass();
        WebView webView = (WebView) viewFindViewById;
        this.h = webView;
        webView.setWebViewClient(new z5(this, this, (byte) 1));
        WebView webView2 = this.h;
        if (webView2 == null) {
            Intrinsics.h("mWebView");
            throw null;
        }
        webView2.getSettings().setJavaScriptEnabled(true);
        if (bundle == null && (bundle = getIntent().getExtras()) == null) {
            bundle = new Bundle();
        }
        this.f47322a = bundle.getString(CommonConstant.ReqAccessTokenParam.CLIENT_ID);
        this.b = bundle.getString("application_key");
        String[] stringArray = bundle.getStringArray("scopes");
        if (stringArray == null) {
            stringArray = new String[0];
        }
        this.c = stringArray;
        if (bundle.getSerializable("auth_type") instanceof gf60) {
            Serializable serializable = bundle.getSerializable("auth_type");
            serializable.getClass();
            gf60Var = (gf60) serializable;
        } else {
            gf60Var = gf60.c;
        }
        this.d = gf60Var;
        this.e = bundle.getBoolean("ru.ok.android.sdk.SSO_STARTED", false);
        this.f = Intrinsics.d(bundle.getString("oauth_type"), "code");
        this.g = Integer.valueOf(bundle.getInt("alert_style"));
        if (this.e) {
            return;
        }
        a();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (4 != i2) {
            return false;
        }
        String string = getString(R.string.authorization_canceled);
        string.getClass();
        g(string);
        return true;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putString(CommonConstant.ReqAccessTokenParam.CLIENT_ID, this.f47322a);
        bundle.putString("application_key", this.b);
        String[] strArr = this.c;
        if (strArr == null) {
            Intrinsics.h("mScopes");
            throw null;
        }
        bundle.putStringArray("scopes", strArr);
        bundle.putSerializable("auth_type", this.d);
        bundle.putBoolean("ru.ok.android.sdk.SSO_STARTED", this.e);
        bundle.putString("oauth_type", this.f ? "code" : null);
    }
}
