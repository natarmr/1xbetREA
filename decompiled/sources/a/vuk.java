package a;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes5.dex */
public final class vuk extends tiq {
    public final /* synthetic */ wuk b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ProgressBar d;

    public vuk(wuk wukVar, String str, ProgressBar progressBar) {
        this.b = wukVar;
        this.c = str;
        this.d = progressBar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        this.d.setVisibility(8);
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String string = (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString();
        if (string == null) {
            string = "";
        }
        nek nekVar = wuk.j2;
        return this.b.T0(string, this.c);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        nek nekVar = wuk.j2;
        return this.b.T0(str, this.c);
    }
}
