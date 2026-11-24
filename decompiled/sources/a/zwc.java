package a;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.core.widget.NestedScrollView;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class zwc extends tiq {
    public final /* synthetic */ uk5 b;
    public final /* synthetic */ axc c;

    public zwc(uk5 uk5Var, axc axcVar) {
        this.b = uk5Var;
        this.c = axcVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        uk5 uk5Var = this.b;
        ((ProgressBar) ((nq8) uk5Var.f).c).setVisibility(0);
        ((NestedScrollView) uk5Var.g).setVisibility(0);
        ((LoadableShapeableImageView) uk5Var.e).setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.c.x.invoke(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        return true;
    }
}
