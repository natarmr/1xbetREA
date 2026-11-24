package a;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes2.dex */
public final class siq extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public siq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        super.setWebViewClient(new tiq());
    }

    public final tiq getFixedWebViewClient() {
        WebViewClient webViewClient = getWebViewClient();
        webViewClient.getClass();
        return (tiq) webViewClient;
    }

    public final void setFixedWebViewClient(tiq tiqVar) {
        if (tiqVar == null) {
            return;
        }
        super.setWebViewClient(tiqVar);
    }

    @Override // android.webkit.WebView
    @lbk
    public void setWebViewClient(WebViewClient webViewClient) {
        webViewClient.getClass();
        throw new UnsupportedOperationException("This method is not allowed");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public siq(Context context) {
        super(context);
        context.getClass();
        super.setWebViewClient(new tiq());
    }
}
