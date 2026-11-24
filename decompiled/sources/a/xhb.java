package a;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.WeakHashMap;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes5.dex */
public final class xhb extends tiq {
    public final /* synthetic */ bib b;

    public xhb(bib bibVar) {
        this.b = bibVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        bib bibVar = this.b;
        if (bibVar.V1) {
            return;
        }
        Integer num = bibVar.Q1;
        if (!bibVar.R1 || webView == null || num == null) {
            bibVar.R1 = false;
            bibVar.Q1 = null;
            bibVar.L0();
            return;
        }
        bibVar.R1 = false;
        bibVar.Q1 = null;
        WeakHashMap weakHashMap = rgu0.f30456a;
        if (!webView.isLaidOut() || webView.isLayoutRequested()) {
            webView.addOnLayoutChangeListener(new pva(webView, num, bibVar, (byte) 1));
        } else {
            webView.scrollTo(0, num.intValue());
            bibVar.L0();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        CharSequence description;
        bib bibVar = this.b;
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            bibVar.V1 = true;
        }
        String string = (webResourceError == null || (description = webResourceError.getDescription()) == null) ? null : description.toString();
        if (string == null) {
            string = "";
        }
        bj5 bj5Var = bib.X1;
        if (!string.equals("net::ERR_INTERNET_DISCONNECTED") && !string.equals("net::ERR_PROXY_CONNECTION_FAILED")) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        } else {
            bibVar.J0().x(ghb.f11289a);
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        boolean z = false;
        int statusCode = webResourceResponse != null ? webResourceResponse.getStatusCode() : 0;
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            z = true;
        }
        bj5 bj5Var = bib.X1;
        if (!z) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            return;
        }
        IntRange intRange = bib.Z1;
        int i = intRange.f46068a;
        int i2 = intRange.b;
        bib bibVar = this.b;
        if (statusCode <= i2 && i <= statusCode) {
            bibVar.V1 = true;
            bibVar.J0().x(ihb.f14771a);
            return;
        }
        IntRange intRange2 = bib.a2;
        int i3 = intRange2.f46068a;
        if (statusCode > intRange2.b || i3 > statusCode) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else {
            bibVar.V1 = true;
            bibVar.J0().x(jhb.f16518a);
        }
    }
}
