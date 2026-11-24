package a;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes5.dex */
public final class v590 extends tiq {
    public final /* synthetic */ w590 b;

    public v590(w590 w590Var) {
        this.b = w590Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (w590.Y1.contains(Integer.valueOf(webResourceResponse != null ? webResourceResponse.getStatusCode() : 0))) {
            s690 s690VarI0 = this.b.I0();
            bby bbyVar = s690VarI0.B;
            if (bbyVar == null || !bbyVar.isActive()) {
                s690VarI0.B = sac.V(jiu0.a(s690VarI0), new x590(s690VarI0, (byte) 2), null, s690VarI0.k.b, new q690(s690VarI0, null, (byte) 1), 10);
            }
        }
    }
}
