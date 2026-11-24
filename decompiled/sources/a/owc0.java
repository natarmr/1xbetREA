package a;

import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes5.dex */
public final class owc0 extends tiq {
    public final /* synthetic */ qwc0 b;

    public owc0(qwc0 qwc0Var) {
        this.b = qwc0Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        qwc0 qwc0Var = this.b;
        if (qwc0Var.X1) {
            return;
        }
        if (webView != null) {
            webView.loadUrl("javascript:(function() {window.parent.addEventListener ('message', function(event) { Android.receiveMessage(JSON.stringify(event.data));});})()");
        }
        Integer num = qwc0Var.S1;
        if (!qwc0Var.U1 || webView == null || num == null) {
            qwc0Var.U1 = false;
            qwc0Var.S1 = null;
            qwc0Var.L0();
            return;
        }
        qwc0Var.U1 = false;
        qwc0Var.S1 = null;
        if (!webView.isLaidOut() || webView.isLayoutRequested()) {
            webView.addOnLayoutChangeListener(new pva(webView, num, qwc0Var, (byte) 3));
        } else {
            webView.scrollTo(0, num.intValue());
            qwc0Var.L0();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Uri url;
        CharSequence description;
        qwc0 qwc0Var = this.b;
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            qwc0Var.X1 = true;
        }
        String string = null;
        String string2 = (webResourceError == null || (description = webResourceError.getDescription()) == null) ? null : description.toString();
        if (string2 == null) {
            string2 = "";
        }
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            string = url.toString();
        }
        String str = string != null ? string : "";
        rl70 rl70Var = qwc0.Z1;
        int iHashCode = string2.hashCode();
        if (iHashCode != 1173532897) {
            if (iHashCode != 1616331862) {
                qwc0Var.J0().x(zvc0.f45048a);
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                return;
            } else {
                qwc0Var.J0().x(zvc0.f45048a);
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                return;
            }
        }
        if (string2.equals("net::ERR_UNKNOWN_URL_SCHEME")) {
            if (kotlin.text.c.x(str, "mailto:", false) || kotlin.text.c.x(str, "tel:", false)) {
                qwc0Var.J0().x(new iwc0(str));
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
        rl70 rl70Var = qwc0.Z1;
        if (z && statusCode == 401) {
            this.b.J0().x(bwc0.f3317a);
        } else {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }
}
