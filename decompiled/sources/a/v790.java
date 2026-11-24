package a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class v790 extends tiq {
    public final /* synthetic */ hie0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;

    public v790(hie0 hie0Var, Function0 function0, Function0 function1, Function1 function2, Function0 function3, Function0 function4) {
        this.b = hie0Var;
        this.c = function0;
        this.d = function1;
        this.e = function2;
        this.f = function3;
        this.g = function4;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        hie0 hie0Var = this.b;
        if (hie0Var.f13108a) {
            hie0Var.f13108a = false;
            this.c.invoke();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.b.f13108a = true;
        super.onPageStarted(webView, str, bitmap);
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
        int iHashCode = string2.hashCode();
        if (iHashCode != 1173532897) {
            if (iHashCode != 1616331862) {
                this.d.invoke();
                return;
            } else {
                this.d.invoke();
                return;
            }
        }
        if (string2.equals("net::ERR_UNKNOWN_URL_SCHEME")) {
            if (kotlin.text.c.x(str, "mailto", false) || kotlin.text.c.x(str, "tel", false)) {
                this.e.invoke(str);
                return;
            } else {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                return;
            }
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int statusCode = webResourceResponse != null ? webResourceResponse.getStatusCode() : 0;
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        if (webView != null) {
            webView.stopLoading();
        }
        if (400 > statusCode || statusCode >= 500) {
            this.g.invoke();
        } else {
            this.f.invoke();
        }
    }
}
