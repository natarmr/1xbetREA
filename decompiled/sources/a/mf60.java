package a;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes5.dex */
public final class mf60 extends tiq {
    public final /* synthetic */ of60 b;

    public mf60(of60 of60Var) {
        this.b = of60Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        evz evzVar = of60.i2;
        this.b.I0().b.setVisibility(8);
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String string = (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString();
        if (string == null) {
            string = "";
        }
        evz evzVar = of60.i2;
        return this.b.T0(string);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        evz evzVar = of60.i2;
        return this.b.T0(str);
    }
}
