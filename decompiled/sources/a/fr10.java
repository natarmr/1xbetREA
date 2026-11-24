package a;

import android.webkit.WebView;
import android.widget.ProgressBar;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class fr10 extends tiq {
    public final /* synthetic */ gr10 b;
    public final /* synthetic */ ProgressBar c;

    public fr10(gr10 gr10Var, ProgressBar progressBar) {
        this.b = gr10Var;
        this.c = progressBar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        this.c.setVisibility(8);
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        xuz xuzVar = gr10.g2;
        gr10 gr10Var = this.b;
        if (kotlin.text.c.x(str, gr10Var.f2.n(gr10Var, gr10.h2[1]), false)) {
            gr10Var.F().t0(i120.V(new Pair("SUCCESS_SOCIAL", new ghk0(9, StringsKt.r0(StringsKt.m0(str, "access_token=", str), "&"), null, StringsKt.m0(str, "x_mailru_vid=", str), null, null, null, null, 244))), "SUCCESS_SOCIAL");
            gr10Var.y0();
        }
        return false;
    }
}
