package a;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.net.URISyntaxException;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class xax extends tiq {
    public final /* synthetic */ yax b;

    public xax(yax yaxVar) {
        this.b = yaxVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        art artVar = yax.S1;
        ((ibx) this.b.O1.getValue()).x(new ebx(true));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) throws URISyntaxException {
        String string;
        if (webView == null) {
            return false;
        }
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        boolean zO = StringsKt.O(String.valueOf(url), "intent://", false);
        yax yaxVar = this.b;
        if (!zO) {
            if (url == null || (string = url.toString()) == null || kotlin.text.c.x(string, "http", false)) {
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.setData(url);
            art artVar = yax.S1;
            yaxVar.H0(intent);
            return true;
        }
        Intent uri = Intent.parseUri(String.valueOf(url), 1);
        String stringExtra = uri.getStringExtra("browser_fallback_url");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra.length() > 0) {
            art artVar2 = yax.S1;
            yaxVar.G0().g.c(stringExtra);
            return true;
        }
        art artVar3 = yax.S1;
        yaxVar.H0(uri);
        return true;
    }
}
