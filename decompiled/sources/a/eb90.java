package a;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import java.util.List;
import org.xplatform.feature.office.payment.impl.presentation.view.PaymentWebView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eb90 implements View.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7510a;
    public final /* synthetic */ WebView b;

    public /* synthetic */ eb90(WebView webView, byte b) {
        this.f7510a = b;
        this.b = webView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        byte b = this.f7510a;
        WebView webView = this.b;
        switch (b) {
            case 0:
                siq siqVar = (siq) webView;
                List list = PaymentWebView.y;
                if (i != 4 || !siqVar.canGoBack()) {
                    return false;
                }
                siqVar.goBack();
                return true;
            default:
                if (i != 4 || !webView.canGoBack()) {
                    return false;
                }
                webView.goBack();
                return true;
        }
    }
}
