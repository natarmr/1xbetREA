package a;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class t3v0 extends tiq {
    public final /* synthetic */ u3v0 b;

    public t3v0(u3v0 u3v0Var) {
        this.b = u3v0Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        CharSequence description;
        kys0 kys0Var = u3v0.P1;
        u3v0 u3v0Var = this.b;
        if (!u3v0Var.u1.i.a(lkz.e)) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            return;
        }
        String string = (webResourceError == null || (description = webResourceError.getDescription()) == null) ? null : description.toString();
        if (string == null) {
            string = "";
        }
        int iHashCode = string.hashCode();
        if (iHashCode == -921760497 ? string.equals("net::ERR_TIMED_OUT") : iHashCode == 1173532897 ? string.equals("net::ERR_UNKNOWN_URL_SCHEME") : iHashCode == 1751421954 && string.equals("net::ERR_INTERNET_DISCONNECTED")) {
            u3v0Var.H0().w();
        } else {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        kys0 kys0Var = u3v0.P1;
        u3v0 u3v0Var = this.b;
        if (u3v0Var.u1.i.a(lkz.e)) {
            int statusCode = webResourceResponse != null ? webResourceResponse.getStatusCode() : 0;
            if (webResourceRequest != null && webResourceRequest.isForMainFrame() && statusCode == 404) {
                if (webView != null) {
                    webView.stopLoading();
                }
                u3v0Var.H0().w();
            }
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        kys0 kys0Var = u3v0.P1;
        u3v0 u3v0Var = this.b;
        if (u3v0Var.u1.i.a(lkz.e)) {
            String str3 = str == null ? "" : str;
            int iHashCode = str3.hashCode();
            if (iHashCode == -921760497 ? !str3.equals("net::ERR_TIMED_OUT") : !(iHashCode == 1173532897 ? str3.equals("net::ERR_UNKNOWN_URL_SCHEME") : iHashCode == 1751421954 && str3.equals("net::ERR_INTERNET_DISCONNECTED"))) {
                super.onReceivedError(webView, i, str, str2);
                return;
            } else {
                u3v0Var.H0().w();
                return;
            }
        }
        super.onReceivedError(webView, i, str, str2);
    }
}
