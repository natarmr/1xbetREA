package a;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public final class lzo extends tiq {
    public final /* synthetic */ nzo b;
    public final /* synthetic */ ProgressBar c;

    public lzo(nzo nzoVar, ProgressBar progressBar) {
        this.b = nzoVar;
        this.c = progressBar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (this.b.u1.i.compareTo(lkz.e) >= 0) {
            this.c.setVisibility(8);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        CharSequence description;
        nzo nzoVar = this.b;
        if (nzoVar.u1.i.compareTo(lkz.e) < 0) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            return;
        }
        String string = (webResourceError == null || (description = webResourceError.getDescription()) == null) ? null : description.toString();
        if (string == null) {
            string = "";
        }
        if (string.equals("net::ERR_INTERNET_DISCONNECTED")) {
            nzoVar.H0();
        } else if (string.equals("net::ERR_UNKNOWN_URL_SCHEME")) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        } else {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        nzo nzoVar = this.b;
        if (nzoVar.u1.i.compareTo(lkz.e) >= 0) {
            String str3 = str == null ? "" : str;
            if (str3.equals("net::ERR_INTERNET_DISCONNECTED")) {
                nzoVar.H0();
                return;
            } else if (str3.equals("net::ERR_UNKNOWN_URL_SCHEME")) {
                super.onReceivedError(webView, i, str, str2);
                return;
            } else {
                super.onReceivedError(webView, i, str, str2);
                return;
            }
        }
        super.onReceivedError(webView, i, str, str2);
    }
}
