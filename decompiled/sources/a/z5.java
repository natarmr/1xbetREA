package a;

import android.app.Activity;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import ru.ok.android.sdk.OkAuthActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class z5 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f43795a;
    public boolean b = true;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Activity d;

    public z5(Activity activity, Activity activity2, byte b) {
        this.c = b;
        this.d = activity;
        this.f43795a = activity2;
    }

    public final String a(int i) {
        if (i == -11) {
            return c(R.string.error_failed_ssl_handshake);
        }
        if (i == -8) {
            return c(R.string.error_timeout);
        }
        if (i != -6) {
            return i != -2 ? c(R.string.error_unknown) : c(R.string.error_host_lookup);
        }
        return c(R.string.error_connect);
    }

    public final String b(SslError sslError) {
        int primaryError = sslError.getPrimaryError();
        if (primaryError == 0) {
            return c(R.string.error_ssl_not_yet_valid);
        }
        if (primaryError == 1) {
            return c(R.string.error_ssl_expired);
        }
        if (primaryError == 2) {
            return c(R.string.error_ssl_id_mismatch);
        }
        if (primaryError != 3) {
            return primaryError != 4 ? c(R.string.error_unknown) : c(R.string.error_ssl_date_invalid);
        }
        return c(R.string.error_ssl_untrusted);
    }

    public final String c(int i) {
        String string = this.f43795a.getString(i);
        string.getClass();
        return string;
    }

    public final void d(WebView webView, int i, String str, String str2) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        this.b = false;
        super.onReceivedError(webView, i, str, str2);
    }

    public final void e(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        webView.getClass();
        sslErrorHandler.getClass();
        sslError.getClass();
        this.b = false;
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public final boolean f(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        this.b = true;
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        super.onPageFinished(webView, str);
        webView.setVisibility(this.b ? 0 : 4);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        byte b = this.c;
        Activity activity = this.d;
        webView.getClass();
        str.getClass();
        str2.getClass();
        switch (b) {
            case 0:
                d(webView, i, str, str2);
                ((a6) activity).e(a(i));
                break;
            default:
                d(webView, i, str, str2);
                String strA = a(i);
                int i2 = OkAuthActivity.i;
                ((OkAuthActivity) activity).g(strA);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        byte b = this.c;
        Activity activity = this.d;
        webView.getClass();
        sslErrorHandler.getClass();
        sslError.getClass();
        switch (b) {
            case 0:
                e(webView, sslErrorHandler, sslError);
                ((a6) activity).e(b(sslError));
                break;
            default:
                e(webView, sslErrorHandler, sslError);
                String strB = b(sslError);
                int i = OkAuthActivity.i;
                ((OkAuthActivity) activity).g(strB);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Object obj;
        Object obj2;
        long j;
        String str2;
        String queryParameter;
        String string;
        Long lT0;
        byte b = this.c;
        Activity activity = this.d;
        switch (b) {
            case 0:
                webView.getClass();
                str.getClass();
                a6 a6Var = (a6) activity;
                if (!kotlin.text.c.x(str, a6Var.b(), false)) {
                    return f(webView, str);
                }
                Bundle bundle = new Bundle();
                String[] strArrSplit = str.split("\\?");
                if (strArrSplit.length > 1) {
                    for (String str3 : strArrSplit[1].split("[&#]")) {
                        String[] strArrSplit2 = str3.split("=");
                        bundle.putString(URLDecoder.decode(strArrSplit2[0]), strArrSplit2.length > 1 ? URLDecoder.decode(strArrSplit2[1]) : null);
                    }
                }
                a6Var.f(bundle.getString("result"));
                return true;
            default:
                OkAuthActivity okAuthActivity = (OkAuthActivity) activity;
                webView.getClass();
                str.getClass();
                if (!kotlin.text.c.x(str, "okauth://auth", false)) {
                    if (!StringsKt.O(str, "st.cmd=userMain", false)) {
                        return f(webView, str);
                    }
                    WebView webView2 = okAuthActivity.h;
                    if (webView2 != null) {
                        webView2.loadUrl(okAuthActivity.b());
                        return true;
                    }
                    Intrinsics.h("mWebView");
                    throw null;
                }
                Uri uri = Uri.parse(str);
                String fragment = uri.getFragment();
                long jLongValue = 0;
                if (fragment != null) {
                    List listSplit$default = StringsKt__StringsKt.split$default(fragment, new String[]{"&"}, false, 0, 6, null);
                    ArrayList<String> arrayList = new ArrayList();
                    for (Object obj3 : listSplit$default) {
                        if (StringsKt.P((String) obj3, '=')) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    for (String str4 : arrayList) {
                        arrayList2.add(new Pair(StringsKt.u0(StringsKt.q0(str4, '=')).toString(), StringsKt.u0(StringsKt.n0(str4, '=')).toString()));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : arrayList2) {
                        Pair pair = (Pair) obj4;
                        if (((CharSequence) pair.f46059a).length() > 0 && ((CharSequence) pair.b).length() > 0) {
                            arrayList3.add(obj4);
                        }
                    }
                    Map mapM = xp20.m(arrayList3);
                    obj = mapM.get("access_token");
                    String str5 = (String) mapM.get("session_secret_key");
                    if (str5 == null) {
                        str5 = (String) mapM.get("refresh_token");
                    }
                    obj2 = mapM.get("error");
                    String str6 = (String) mapM.get("expires_in");
                    if (str6 != null && (lT0 = StringsKt.t0(str6)) != null) {
                        jLongValue = lT0.longValue();
                    }
                    j = jLongValue;
                    str2 = str5;
                } else {
                    obj = null;
                    obj2 = null;
                    j = 0;
                    str2 = null;
                }
                String str7 = (!okAuthActivity.f || (queryParameter = uri.getQueryParameter("code")) == null || (string = StringsKt.u0(queryParameter).toString()) == null || string.length() <= 0) ? null : string;
                if (obj != null) {
                    OkAuthActivity.f(okAuthActivity, (String) obj, str2, j, null, 8);
                    return true;
                }
                if (str7 != null) {
                    OkAuthActivity.f(okAuthActivity, null, null, 0L, str7, 7);
                    return true;
                }
                okAuthActivity.d((String) obj2);
                return true;
        }
    }
}
