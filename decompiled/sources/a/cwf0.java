package a;

import android.webkit.WebView;
import android.widget.ProgressBar;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes5.dex */
public final class cwf0 extends tiq {
    public final /* synthetic */ FixedWebView b;
    public final /* synthetic */ LottieView c;
    public final /* synthetic */ nq8 d;

    public cwf0(FixedWebView fixedWebView, LottieView lottieView, nq8 nq8Var) {
        this.b = fixedWebView;
        this.c = lottieView;
        this.d = nq8Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.b.setVisibility(this.c.getVisibility() == 0 ? 8 : 0);
        ((ProgressBar) this.d.b).setVisibility(8);
    }
}
