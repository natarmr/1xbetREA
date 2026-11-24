package com.yandex.authsdk.internal;

import a.avs0;
import a.cgx0;
import a.d5v0;
import a.i5v0;
import a.nr;
import a.pv00;
import a.svs0;
import a.x2x;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.yandex.authsdk.YandexAuthOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class WebViewLoginActivity extends Activity {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nr f46057a;
    public YandexAuthOptions b;
    public WebView c;
    public cgx0 d;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        i5v0 i5v0Var;
        super.onCreate(bundle);
        YandexAuthOptions yandexAuthOptions = (YandexAuthOptions) x2x.U(getIntent(), "com.yandex.authsdk.EXTRA_OPTIONS", YandexAuthOptions.class);
        if (yandexAuthOptions == null) {
            finish();
            return;
        }
        this.b = yandexAuthOptions;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        try {
            Object objNewInstance = Class.forName("com.yandex.authsdk.internal.domesticroots.webview.WebViewSslErrorHandlerImpl").getConstructor(Context.class).newInstance(applicationContext.getApplicationContext());
            objNewInstance.getClass();
            i5v0Var = (i5v0) objNewInstance;
        } catch (ClassCastException | LinkageError | ReflectiveOperationException unused) {
            i5v0Var = i5v0.f14213a;
        }
        this.d = new cgx0(i5v0Var, new avs0(0, this, WebViewLoginActivity.class, "finishWithSecurityError", "finishWithSecurityError()V", 0, (byte) 9));
        String stringExtra = getIntent().getStringExtra("com.yandex.authsdk.EXTRA_STATE");
        stringExtra.getClass();
        this.f46057a = new nr(new pv00((Activity) this), stringExtra, new svs0((byte) 4), yandexAuthOptions.f46055a);
        if (bundle == null) {
            CookieManager.getInstance().removeAllCookies(null);
            CookieManager.getInstance().flush();
        }
        WebView webView = new WebView(this);
        webView.setWebViewClient(new d5v0(this));
        webView.getSettings().setJavaScriptEnabled(true);
        nr nrVar = this.f46057a;
        if (nrVar == null) {
            Intrinsics.h("loginHandler");
            throw null;
        }
        Intent intent = getIntent();
        intent.getClass();
        webView.loadUrl(nrVar.q(intent, "yandex_auth_sdk_android_wv"));
        this.c = webView;
        setContentView(webView);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        cgx0 cgx0Var = this.d;
        if (cgx0Var != null) {
            if (cgx0Var == null) {
                Intrinsics.h("sslErrorHandler");
                throw null;
            }
            cgx0Var.l();
        }
        WebView webView = this.c;
        if (webView != null) {
            if (webView == null) {
                Intrinsics.h("webView");
                throw null;
            }
            webView.destroy();
        }
        super.onDestroy();
    }
}
