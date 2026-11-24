package a;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class ce10 extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f4191a;

    public ce10(Function0 function0) {
        function0.getClass();
        this.f4191a = function0;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        this.f4191a.invoke();
        super.onCloseWindow(webView);
    }
}
