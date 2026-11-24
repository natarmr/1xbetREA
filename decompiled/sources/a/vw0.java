package a;

import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class vw0 extends tiq {
    public final String b;
    public final Function0 c;
    public final Function0 d;

    public vw0(String str, Function0 function0, Function0 function1) {
        str.getClass();
        this.b = str;
        this.c = function0;
        this.d = function1;
    }

    public static final boolean d(vw0 vw0Var, WebView webView, String str) {
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public static final boolean e(vw0 vw0Var, WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final boolean c(Uri uri, Function0 function0) {
        String strValueOf = uri != null ? String.valueOf(uri != null ? uri.getHost() : null) : null;
        if (strValueOf == null) {
            return ((Boolean) function0.invoke()).booleanValue();
        }
        if (!StringsKt.O(this.b, strValueOf, false)) {
            return ((Boolean) function0.invoke()).booleanValue();
        }
        this.c.invoke();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r0.equals("net::ERR_INTERNET_DISCONNECTED") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r0.equals("net::ERR_PROXY_CONNECTION_FAILED") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r0.equals("net::ERR_UNKNOWN_URL_SCHEME") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r0.equals("net::ERR_CONNECTION_ABORTED") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        r3.d.invoke();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceivedError(android.webkit.WebView r4, android.webkit.WebResourceRequest r5, android.webkit.WebResourceError r6) {
        /*
            r3 = this;
            if (r6 == 0) goto Ld
            java.lang.CharSequence r0 = r6.getDescription()
            if (r0 == 0) goto Ld
            java.lang.String r0 = r0.toString()
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 != 0) goto L12
            java.lang.String r0 = ""
        L12:
            if (r5 == 0) goto L50
            boolean r1 = r5.isForMainFrame()
            r2 = 1
            if (r1 != r2) goto L50
            int r1 = r0.hashCode()
            switch(r1) {
                case -1303847323: goto L3e;
                case 1173532897: goto L35;
                case 1616331862: goto L2c;
                case 1751421954: goto L23;
                default: goto L22;
            }
        L22:
            goto L4c
        L23:
            java.lang.String r1 = "net::ERR_INTERNET_DISCONNECTED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L4c
        L2c:
            java.lang.String r1 = "net::ERR_PROXY_CONNECTION_FAILED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L4c
        L35:
            java.lang.String r1 = "net::ERR_UNKNOWN_URL_SCHEME"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L4c
        L3e:
            java.lang.String r1 = "net::ERR_CONNECTION_ABORTED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4c
        L46:
            kotlin.jvm.functions.Function0 r3 = r3.d
            r3.invoke()
            return
        L4c:
            super.onReceivedError(r4, r5, r6)
            return
        L50:
            super.onReceivedError(r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vw0.onReceivedError(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT >= 26 && renderProcessGoneDetail != null && renderProcessGoneDetail.didCrash()) {
            this.d.invoke();
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return c(webResourceRequest != null ? webResourceRequest.getUrl() : null, new kk0(this, webView, webResourceRequest, (byte) 3));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return c(str != null ? Uri.parse(str) : null, new kk0(this, webView, str, (byte) 2));
    }
}
