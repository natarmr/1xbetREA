package a;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class vhn0 extends tiq {
    public final /* synthetic */ whn0 b;

    public vhn0(whn0 whn0Var) {
        this.b = whn0Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        s2m0 s2m0Var = whn0.Y1;
        fin0 fin0VarJ0 = this.b.J0();
        fin0VarJ0.x(new cin0(fin0VarJ0, null, (byte) 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        s2m0 s2m0Var = whn0.Y1;
        fin0 fin0VarJ0 = this.b.J0();
        int statusCode = webResourceResponse != null ? webResourceResponse.getStatusCode() : 0;
        if (statusCode == 401) {
            fin0VarJ0.w(true);
        } else if (statusCode > 299) {
            fin0VarJ0.x(new cin0(fin0VarJ0, null, (byte) 2));
        }
    }
}
