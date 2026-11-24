package a;

import android.content.Intent;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.vk.api.sdk.ui.VKWebViewAuthActivity;
import com.vk.dto.common.id.UserId;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class gwt0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12045a;
    public final /* synthetic */ VKWebViewAuthActivity b;

    public gwt0(VKWebViewAuthActivity vKWebViewAuthActivity) {
        this.b = vKWebViewAuthActivity;
    }

    public final boolean a(String str) {
        String stringExtra;
        dvt0 dvt0Var;
        Integer intOrNull;
        int i = 0;
        if (str != null) {
            dvt0 dvt0Var2 = VKWebViewAuthActivity.d;
            VKWebViewAuthActivity vKWebViewAuthActivity = this.b;
            if (vKWebViewAuthActivity.b()) {
                Uri uri = Uri.parse(kotlin.text.c.r(str, Separators.POUND, Separators.QUESTION, false));
                if (uri.getQueryParameter("success") != null) {
                    if (uri.getQueryParameter("access_token") != null) {
                        String queryParameter = uri.getQueryParameter("access_token");
                        String queryParameter2 = uri.getQueryParameter("secret");
                        String queryParameter3 = uri.getQueryParameter("user_id");
                        UserId userId = queryParameter3 != null ? new UserId(Long.parseLong(queryParameter3)) : null;
                        String queryParameter4 = uri.getQueryParameter("expires_in");
                        dvt0Var = new dvt0((queryParameter4 == null || (intOrNull = StringsKt.toIntOrNull(queryParameter4)) == null) ? 0 : intOrNull.intValue(), System.currentTimeMillis(), userId, queryParameter2, queryParameter);
                    } else {
                        dvt0Var = dvt0.g;
                    }
                    VKWebViewAuthActivity.d = dvt0Var;
                    fwt0.b();
                    vKWebViewAuthActivity.finish();
                    return false;
                }
                if (uri.getQueryParameter("cancel") != null) {
                    fwt0.b();
                    vKWebViewAuthActivity.finish();
                    return false;
                }
            } else {
                if (vKWebViewAuthActivity.b()) {
                    stringExtra = vKWebViewAuthActivity.getIntent().getStringExtra("vk_validation_url");
                } else {
                    zz2 zz2Var = vKWebViewAuthActivity.c;
                    if (zz2Var == null) {
                        Intrinsics.h("params");
                        throw null;
                    }
                    stringExtra = (String) zz2Var.b;
                }
                if (stringExtra == null || kotlin.text.c.x(str, stringExtra, false)) {
                    Intent intent = new Intent("com.vk.auth-token");
                    String strSubstring = str.substring(StringsKt.V(str, Separators.POUND, 0, false, 6) + 1);
                    intent.putExtra("extra-token-data", strSubstring);
                    HashMap mapK = ibm0.k(strSubstring);
                    if (mapK == null || (!mapK.containsKey("error") && !mapK.containsKey("cancel"))) {
                        i = -1;
                    }
                    vKWebViewAuthActivity.setResult(i, intent);
                    fwt0.b();
                    vKWebViewAuthActivity.finish();
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(int i) {
        this.f12045a = true;
        Intent intent = new Intent();
        intent.putExtra("vw_login_error", i);
        VKWebViewAuthActivity vKWebViewAuthActivity = this.b;
        vKWebViewAuthActivity.setResult(0, intent);
        vKWebViewAuthActivity.finish();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.f12045a) {
            return;
        }
        dvt0 dvt0Var = VKWebViewAuthActivity.d;
        VKWebViewAuthActivity vKWebViewAuthActivity = this.b;
        ProgressBar progressBar = vKWebViewAuthActivity.b;
        if (progressBar == null) {
            Intrinsics.h("progress");
            throw null;
        }
        progressBar.setVisibility(8);
        WebView webView2 = vKWebViewAuthActivity.f46052a;
        if (webView2 != null) {
            webView2.setVisibility(0);
        } else {
            Intrinsics.h("webView");
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        a(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String string;
        int errorCode;
        webView.getClass();
        webResourceRequest.getClass();
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String string2 = webResourceRequest.getUrl().toString();
        string2.getClass();
        if (webResourceError != null) {
            string = webResourceError.getDescription().toString();
            errorCode = webResourceError.getErrorCode();
        } else {
            string = "no_description";
            errorCode = -1;
        }
        Log.w("VKWebViewAuthActivity", errorCode + ':' + string + ':' + string2);
        WebView webView2 = this.b.f46052a;
        if (webView2 == null) {
            Intrinsics.h("webView");
            throw null;
        }
        if (Intrinsics.d(webView2.getUrl(), string2)) {
            b(errorCode);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        String url = sslError != null ? sslError.getUrl() : null;
        if (url == null) {
            url = "";
        }
        Log.w("VKWebViewAuthActivity", "-11:ssl_exception:".concat(url));
        WebView webView2 = this.b.f46052a;
        if (webView2 == null) {
            Intrinsics.h("webView");
            throw null;
        }
        if (Intrinsics.d(webView2.getUrl(), url)) {
            b(-11);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return a(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        Log.w("VKWebViewAuthActivity", i + ':' + str + ':' + str2);
        WebView webView2 = this.b.f46052a;
        if (webView2 != null) {
            if (Intrinsics.d(webView2.getUrl(), str2)) {
                b(i);
                return;
            }
            return;
        }
        Intrinsics.h("webView");
        throw null;
    }
}
