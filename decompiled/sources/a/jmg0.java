package a;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes5.dex */
public final class jmg0 extends tiq {
    public final /* synthetic */ lmg0 b;
    public final /* synthetic */ nq8 c;
    public final /* synthetic */ siq d;
    public final /* synthetic */ LottieView e;
    public final /* synthetic */ FixedWebView f;
    public final /* synthetic */ TextView g;
    public final /* synthetic */ ConstraintLayout h;

    public jmg0(lmg0 lmg0Var, nq8 nq8Var, siq siqVar, LottieView lottieView, FixedWebView fixedWebView, TextView textView, ConstraintLayout constraintLayout) {
        this.b = lmg0Var;
        this.c = nq8Var;
        this.d = siqVar;
        this.e = lottieView;
        this.f = fixedWebView;
        this.g = textView;
        this.h = constraintLayout;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        lmg0 lmg0Var = this.b;
        if (lmg0Var.V1) {
            int i = 8;
            ((ProgressBar) this.c.b).setVisibility(8);
            if (!lmg0Var.W1 && this.e.getVisibility() != 0) {
                i = 0;
            }
            this.d.setVisibility(i);
            lmg0Var.V1 = false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.b.V1 = true;
        super.onPageStarted(webView, str, bitmap);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        siq fixedWebView;
        Uri url;
        CharSequence description;
        String string = (webResourceError == null || (description = webResourceError.getDescription()) == null) ? null : description.toString();
        if (string == null) {
            string = "";
        }
        String string2 = (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString();
        String str = string2 != null ? string2 : "";
        eke0 eke0Var = lmg0.Y1;
        int iHashCode = string.hashCode();
        lmg0 lmg0Var = this.b;
        if (iHashCode != 1173532897) {
            if (iHashCode != 1616331862) {
                ra10 ra10Var = (ra10) lmg0Var.X1.getValue();
                LottieView lottieView = this.e;
                lottieView.v(ra10Var);
                lottieView.setVisibility(0);
                lmg0Var.W1 = true;
                fixedWebView = this.f.getFixedWebView();
                if (fixedWebView != null) {
                    fixedWebView.setVisibility(8);
                    return;
                }
                return;
            }
            ra10 ra10Var2 = (ra10) lmg0Var.X1.getValue();
            LottieView lottieView2 = this.e;
            lottieView2.v(ra10Var2);
            lottieView2.setVisibility(0);
            lmg0Var.W1 = true;
            fixedWebView = this.f.getFixedWebView();
            if (fixedWebView != null) {
                fixedWebView.setVisibility(8);
                return;
            }
            return;
        }
        if (string.equals("net::ERR_UNKNOWN_URL_SCHEME")) {
            if (kotlin.text.c.x(str, "mailto", false) || kotlin.text.c.x(str, "tel", false)) {
                try {
                    lmg0Var.w0(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str)));
                } catch (Exception unused) {
                    wdk0 wdk0Var = lmg0Var.N1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    rek0 rek0Var = rek0.b;
                    String strH = lmg0Var.H(R.string.intent_app_not_installed);
                    strH.getClass();
                    wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), lmg0Var, null, null, false, null, 1020);
                }
                lmg0Var.I0();
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int statusCode = webResourceResponse != null ? webResourceResponse.getStatusCode() : 0;
        if (webResourceRequest != null && webResourceRequest.isForMainFrame() && statusCode == 404) {
            if (webView != null) {
                webView.stopLoading();
            }
            ((ProgressBar) this.c.b).setVisibility(8);
            this.g.setText(this.b.H(R.string.data_retrieval_error));
            this.h.setVisibility(0);
            this.d.setVisibility(8);
        }
    }
}
