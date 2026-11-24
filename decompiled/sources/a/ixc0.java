package a;

import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes5.dex */
public final class ixc0 extends tiq {
    public final /* synthetic */ kxc0 b;

    public ixc0(kxc0 kxc0Var) {
        this.b = kxc0Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        jh70 jh70Var = kxc0.Y1;
        kxc0 kxc0Var = this.b;
        Integer num = kxc0Var.S1;
        if (!kxc0Var.U1 || webView == null || num == null) {
            kxc0Var.U1 = false;
            kxc0Var.S1 = null;
            kxc0Var.L0();
            return;
        }
        kxc0Var.U1 = false;
        kxc0Var.S1 = null;
        if (!webView.isLaidOut() || webView.isLayoutRequested()) {
            webView.addOnLayoutChangeListener(new pva(webView, num, kxc0Var, (byte) 4));
        } else {
            webView.scrollTo(0, num.intValue());
            kxc0Var.L0();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Uri url;
        CharSequence description;
        String string = null;
        String string2 = (webResourceError == null || (description = webResourceError.getDescription()) == null) ? null : description.toString();
        if (string2 == null) {
            string2 = "";
        }
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            string = url.toString();
        }
        String str = string != null ? string : "";
        jh70 jh70Var = kxc0.Y1;
        int iHashCode = string2.hashCode();
        kxc0 kxc0Var = this.b;
        if (iHashCode != 1173532897) {
            if (iHashCode != 1616331862) {
                kxc0Var.J0().x(lvc0.f20709a);
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                return;
            } else {
                kxc0Var.J0().x(lvc0.f20709a);
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                return;
            }
        }
        if (string2.equals("net::ERR_UNKNOWN_URL_SCHEME")) {
            if (kotlin.text.c.x(str, "mailto:", false) || kotlin.text.c.x(str, "tel:", false)) {
                kxc0Var.J0().x(new uvc0(str));
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        boolean z = false;
        int statusCode = webResourceResponse != null ? webResourceResponse.getStatusCode() : 0;
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            z = true;
        }
        jh70 jh70Var = kxc0.Y1;
        if (z && statusCode == 401) {
            this.b.J0().x(nvc0.f24184a);
        } else {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }
}
