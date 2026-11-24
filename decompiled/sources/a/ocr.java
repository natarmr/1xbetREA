package a;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class ocr extends tiq {
    public final pop b;

    public ocr(pop popVar) {
        this.b = popVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.b.invoke(lcr.f19813a);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.b.invoke(mcr.f21564a);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        CharSequence description;
        String string = (webResourceError == null || (description = webResourceError.getDescription()) == null) ? null : description.toString();
        if (string == null) {
            string = "";
        }
        if (string.equals("net::ERR_INTERNET_DISCONNECTED") || string.equals("net::ERR_PROXY_CONNECTION_FAILED")) {
            this.b.invoke(kcr.f18074a);
        } else {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int statusCode = webResourceResponse != null ? webResourceResponse.getStatusCode() : 0;
        if (webResourceRequest != null && webResourceRequest.isForMainFrame() && statusCode == 404) {
            if (webView != null) {
                webView.stopLoading();
            }
            this.b.invoke(kcr.f18074a);
        }
    }
}
