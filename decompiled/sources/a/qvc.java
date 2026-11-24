package a;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes5.dex */
public final class qvc extends tiq {
    public final /* synthetic */ tvc b;

    public qvc(tvc tvcVar) {
        this.b = tvcVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        gl5 gl5Var = tvc.R1;
        iwc iwcVar = (iwc) this.b.M1.getValue();
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        String string = url != null ? url.toString() : null;
        if (string == null) {
            string = "";
        }
        if (kotlin.text.c.x(string, "http", false) || kotlin.text.c.x(string, "mailto", false) || kotlin.text.c.x(string, "tel", false)) {
            iwcVar.l.f(new bwc(string));
            return true;
        }
        if (!kotlin.text.c.x(string, (String) iwcVar.k.getValue(), false)) {
            return true;
        }
        iwcVar.j.a(string);
        return true;
    }
}
