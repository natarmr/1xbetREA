package a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.rules.impl.util.ContactsWebView;

/* JADX INFO: loaded from: classes2.dex */
public final class qce extends tiq {
    public final /* synthetic */ ContactsWebView b;

    public qce(ContactsWebView contactsWebView) {
        this.b = contactsWebView;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (webView != null) {
            webView.setVisibility(0);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Object g0g0Var;
        Context context;
        webResourceRequest.getClass();
        Uri url = webResourceRequest.getUrl();
        ContactsWebView contactsWebView = this.b;
        Function1<Uri, Unit> onHyperlinkClick = contactsWebView.getOnHyperlinkClick();
        url.getClass();
        onHyperlinkClick.invoke(url);
        String string = url.toString();
        string.getClass();
        if (string.length() <= 0) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            if (webView == null || (context = webView.getContext()) == null) {
                g0g0Var = null;
            } else {
                context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, url));
                g0g0Var = Unit.f46060a;
            }
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) == null) {
            return true;
        }
        contactsWebView.getOnHyperlinkOpenFailed().invoke();
        return true;
    }
}
