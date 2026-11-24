package a;

import android.gov.nist.core.Separators;
import android.view.View;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ax0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebView f1599a;
    public final View b;

    public ax0(WebView webView, View view) {
        this.f1599a = webView;
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax0)) {
            return false;
        }
        ax0 ax0Var = (ax0) obj;
        return Intrinsics.d(this.f1599a, ax0Var.f1599a) && Intrinsics.d(this.b, ax0Var.b);
    }

    public final int hashCode() {
        WebView webView = this.f1599a;
        int iHashCode = (webView == null ? 0 : webView.hashCode()) * 31;
        View view = this.b;
        return iHashCode + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        return "AggregatorGameWebViewState(webView=" + this.f1599a + ", fullscreenView=" + this.b + Separators.RPAREN;
    }
}
