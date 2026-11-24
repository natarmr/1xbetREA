package a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.feature.office.payment.impl.presentation.view.PaymentWebView;

/* JADX INFO: loaded from: classes4.dex */
public final class hb90 extends tiq {
    public final /* synthetic */ PaymentWebView b;

    public hb90(PaymentWebView paymentWebView) {
        this.b = paymentWebView;
    }

    public static final Unit c(hb90 hb90Var, WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        return Unit.f46060a;
    }

    public static final Unit d(hb90 hb90Var, WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        return Unit.f46060a;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        PaymentWebView paymentWebView = this.b;
        if (paymentWebView.j && !paymentWebView.g) {
            if (webView != null) {
                webView.setVisibility(0);
            }
            paymentWebView.j = false;
        }
        super.onPageFinished(webView, str);
        if (paymentWebView.f) {
            Function0 function0 = paymentWebView.q;
            if (function0 != null) {
                function0.invoke();
            }
            paymentWebView.f = false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        PaymentWebView paymentWebView = this.b;
        paymentWebView.g = false;
        paymentWebView.f = true;
        paymentWebView.k.clear();
        paymentWebView.l = 0;
        Function1 function1 = paymentWebView.o;
        if (function1 != null) {
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        CharSequence description;
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        if (webView != null) {
            webView.stopLoading();
        }
        PaymentWebView paymentWebView = this.b;
        paymentWebView.g = true;
        String string = (webResourceError == null || (description = webResourceError.getDescription()) == null) ? null : description.toString();
        String str = string == null ? "" : string;
        Uri url = webResourceRequest.getUrl();
        String string2 = url != null ? url.toString() : null;
        String str2 = string2 == null ? "" : string2;
        paymentWebView.j(new jb90(ib90.MAIN_FRAME, str2, 0, str, false, 20));
        paymentWebView.i(str, str2, new mr0(this, webView, webResourceRequest, webResourceError, (byte) 23));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Function0 function0;
        Uri url;
        boolean z = false;
        int statusCode = webResourceResponse != null ? webResourceResponse.getStatusCode() : 0;
        String host = (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.getHost();
        if (host == null) {
            host = "";
        }
        List list = PaymentWebView.y;
        PaymentWebView paymentWebView = this.b;
        if (paymentWebView.i.length() > 0 && host.length() > 0 && !Intrinsics.d(paymentWebView.i, host)) {
            z = true;
        }
        paymentWebView.h = z;
        if (webResourceRequest != null && webResourceRequest.isForMainFrame() && statusCode >= i2o.BadRequest.getErrorCode()) {
            ib90 ib90Var = paymentWebView.h ? ib90.REDIRECT : ib90.HTTP;
            String string = webResourceRequest.getUrl().toString();
            string.getClass();
            paymentWebView.j(new jb90(ib90Var, string, statusCode, null, false, 24));
        }
        if (!paymentWebView.h || statusCode < i2o.BadRequest.getErrorCode()) {
            if (PaymentWebView.y.contains(Integer.valueOf(statusCode)) && (function0 = paymentWebView.p) != null) {
                function0.invoke();
            }
            if (webResourceRequest != null && webResourceRequest.isForMainFrame() && statusCode == i2o.NotFound.getErrorCode()) {
                if (webView != null) {
                    webView.stopLoading();
                }
                Function0 function1 = paymentWebView.r;
                if (function1 != null) {
                    function1.invoke();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    @Override // a.tiq, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        boolean z;
        Object g0g0Var;
        if (sslError == null || sslError.getPrimaryError() != 3 || webView == null) {
            z = false;
        } else {
            try {
                e0g0 e0g0Var = j0g0.b;
                SslCertificate certificate = sslError.getCertificate();
                certificate.getClass();
                Context context = webView.getContext();
                context.getClass();
                g0g0Var = Boolean.valueOf(tiq.b(certificate, context));
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            Object obj = Boolean.FALSE;
            if (g0g0Var instanceof g0g0) {
                g0g0Var = obj;
            }
            if (((Boolean) g0g0Var).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
        }
        boolean z2 = z;
        ib90 ib90Var = ib90.SSL;
        String url = sslError != null ? sslError.getUrl() : null;
        if (url == null) {
            url = "";
        }
        jb90 jb90Var = new jb90(ib90Var, url, 0, "primaryError=" + (sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null), z2, 4);
        List list = PaymentWebView.y;
        this.b.j(jb90Var);
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        List list = PaymentWebView.y;
        return this.b.l(url);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri = Uri.parse(str);
        List list = PaymentWebView.y;
        return this.b.l(uri);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (webView != null) {
            webView.stopLoading();
        }
        String str3 = str == null ? "" : str;
        String str4 = str2 != null ? str2 : "";
        lc0 lc0Var = new lc0((byte) 2, i, this, webView, str, str2);
        List list = PaymentWebView.y;
        this.b.i(str3, str4, lc0Var);
    }
}
