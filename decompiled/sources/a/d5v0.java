package a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.internal.WebViewLoginActivity;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d5v0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewLoginActivity f5526a;

    public d5v0(WebViewLoginActivity webViewLoginActivity) {
        this.f5526a = webViewLoginActivity;
    }

    public final boolean a(String str) {
        WebViewLoginActivity webViewLoginActivity = this.f5526a;
        if (webViewLoginActivity.f46057a == null) {
            Intrinsics.h("loginHandler");
            throw null;
        }
        YandexAuthOptions yandexAuthOptions = webViewLoginActivity.b;
        if (yandexAuthOptions == null) {
            Intrinsics.h("options");
            throw null;
        }
        str.getClass();
        if (!kotlin.text.c.x(str, String.format("https://yx%s.%s/auth/finish?platform=android", Arrays.copyOf(new Object[]{yandexAuthOptions.f46055a, yandexAuthOptions.c}, 2)), false)) {
            return false;
        }
        cgx0 cgx0Var = webViewLoginActivity.d;
        if (cgx0Var == null) {
            Intrinsics.h("sslErrorHandler");
            throw null;
        }
        cgx0Var.l();
        nr nrVar = webViewLoginActivity.f46057a;
        if (nrVar == null) {
            Intrinsics.h("loginHandler");
            throw null;
        }
        Uri uri = Uri.parse(str);
        uri.getClass();
        webViewLoginActivity.setResult(-1, nrVar.A(uri));
        webViewLoginActivity.finish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        str.getClass();
        if (a(str)) {
            webView.stopLoading();
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        webView.getClass();
        sslErrorHandler.getClass();
        sslError.getClass();
        cgx0 cgx0Var = this.f5526a.d;
        if (cgx0Var == null) {
            Intrinsics.h("sslErrorHandler");
            throw null;
        }
        avs0 avs0Var = (avs0) cgx0Var.c;
        LinkedHashSet linkedHashSet = (LinkedHashSet) cgx0Var.d;
        if (cgx0Var.b) {
            sslErrorHandler.cancel();
            return;
        }
        if (sslError.hasError(3)) {
            Iterable iterableO = l1e0.o(0, 6);
            if (!(iterableO instanceof Collection) || !((Collection) iterableO).isEmpty()) {
                Iterator it = iterableO.iterator();
                while (((kkx) it).c) {
                    int iNextInt = ((bkx) it).nextInt();
                    if (iNextInt == 3 || !sslError.hasError(iNextInt)) {
                    }
                }
            }
            linkedHashSet.add(sslErrorHandler);
            try {
                if (linkedHashSet.remove(sslErrorHandler)) {
                    sslErrorHandler.cancel();
                    avs0Var.invoke();
                    return;
                }
                return;
            } catch (RuntimeException unused) {
                if (linkedHashSet.remove(sslErrorHandler)) {
                    sslErrorHandler.cancel();
                    avs0Var.invoke();
                    return;
                }
                return;
            }
        }
        sslErrorHandler.cancel();
        avs0Var.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        if (!webResourceRequest.isForMainFrame()) {
            return false;
        }
        String string = webResourceRequest.getUrl().toString();
        string.getClass();
        return a(string);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        return a(str);
    }
}
