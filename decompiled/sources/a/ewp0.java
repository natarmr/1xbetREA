package a;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes5.dex */
public final class ewp0 extends tiq {
    public final /* synthetic */ fwp0 b;
    public final /* synthetic */ ProgressBar c;

    public ewp0(fwp0 fwp0Var, ProgressBar progressBar) {
        this.b = fwp0Var;
        this.c = progressBar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        this.c.setVisibility(8);
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        String string = webResourceRequest.getUrl().toString();
        string.getClass();
        g9m0 g9m0Var = fwp0.h2;
        return this.b.T0(string);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        g9m0 g9m0Var = fwp0.h2;
        return this.b.T0(str);
    }
}
