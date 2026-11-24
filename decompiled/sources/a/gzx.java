package a;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes5.dex */
public final class gzx extends tiq {
    public final /* synthetic */ hzx b;
    public final /* synthetic */ ProgressBar c;

    public gzx(hzx hzxVar, ProgressBar progressBar) {
        this.b = hzxVar;
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
        Object value;
        webView.getClass();
        webResourceRequest.getClass();
        String string = webResourceRequest.getUrl().toString();
        string.getClass();
        p7m0 p7m0Var = this.b.i2;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, string));
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Object value;
        webView.getClass();
        str.getClass();
        p7m0 p7m0Var = this.b.i2;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, str));
        return false;
    }
}
