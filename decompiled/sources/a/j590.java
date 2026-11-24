package a;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes5.dex */
public final class j590 extends tiq {
    public final /* synthetic */ l590 b;

    public j590(l590 l590Var) {
        this.b = l590Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        super.onPageCommitVisible(webView, str);
        webView.postVisualStateCallback(1L, new i590(this.b));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        nh70 nh70Var = l590.Y1;
        this.b.L0().x(x490.f40254a);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if ((webResourceResponse != null ? webResourceResponse.getStatusCode() : 0) == 401) {
            nh70 nh70Var = l590.Y1;
            this.b.L0().x(new w490());
        }
    }
}
