package org.xplatform.feature.office.payment.impl.presentation.view;

import a.a5v0;
import a.d4v0;
import a.eb90;
import a.fb90;
import a.gb90;
import a.hb90;
import a.ib90;
import a.jb90;
import a.mbu0;
import a.q3d;
import a.rq8;
import a.siq;
import a.v4i0;
import a.xdr;
import a.z4v0;
import a.zlt0;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.javax.sip.message.Response;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Window;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.net.URISyntaxException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes4.dex */
public final class PaymentWebView extends FixedWebView {
    public static final List y = q3d.j(Integer.valueOf(Response.UNAUTHORIZED), 500, Integer.valueOf(Response.BAD_GATEWAY), Integer.valueOf(Response.SERVER_TIMEOUT));
    public boolean f;
    public boolean g;
    public boolean h;
    public String i;
    public boolean j;
    public final LinkedHashSet k;
    public int l;
    public Function1 m;
    public Function1 n;
    public Function1 o;
    public Function0 p;
    public Function0 q;
    public Function0 r;
    public xdr s;
    public Function0 t;
    public Function1 u;
    public Function1 v;
    public Function1 w;
    public Function1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentWebView(Context context, AttributeSet attributeSet) {
        zlt0 d4v0Var;
        super(context, attributeSet);
        context.getClass();
        this.i = "";
        this.k = new LinkedHashSet();
        siq fixedWebView = getFixedWebView();
        if (fixedWebView != null) {
            WebSettings settings = fixedWebView.getSettings();
            settings.setDomStorageEnabled(true);
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setAllowFileAccess(true);
            Object obj = null;
            if (z4v0.a("PAYMENT_REQUEST")) {
                WebSettings settings2 = fixedWebView.getSettings();
                if (!z4v0.d.b()) {
                    v4i0.p("This method is not supported by the current version of the framework and the current WebView APK");
                    throw null;
                }
                byte b = 5;
                try {
                    d4v0Var = new zlt0((WebSettingsBoundaryInterface) rq8.G(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) a5v0.f292a.f14992a).convertSettings(settings2)), b);
                } catch (ClassCastException e) {
                    if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(settings2.getClass().getCanonicalName())) {
                        throw e;
                    }
                    Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e);
                    d4v0Var = new d4v0(obj, b);
                }
                d4v0Var.o();
            }
            fixedWebView.setInitialScale(1);
            fixedWebView.setLayerType(2, null);
            fixedWebView.setWebChromeClient(new gb90(this));
            fixedWebView.setFixedWebViewClient(new hb90(this));
            fixedWebView.setOnKeyListener(new eb90(fixedWebView, (byte) 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Window getWindow() {
        Context context = getRootView().findViewById(R.id.content).getContext();
        context.getClass();
        Window window = ((Activity) context).getWindow();
        window.getClass();
        return window;
    }

    @Override // org.xplatform.ui_core.viewcomponents.webview.FixedWebView
    public final void d(String str, Map map) {
        str.getClass();
        map.getClass();
        String host = Uri.parse(str).getHost();
        if (host == null) {
            host = "";
        }
        this.i = host;
        this.k.clear();
        this.l = 0;
        if (!c.x(str, "http", false) && !c.x(str, "mailto", false) && !c.x(str, "tel", false)) {
            str = "http://".concat(str);
        }
        super.d(str, map);
    }

    @Override // org.xplatform.ui_core.viewcomponents.webview.FixedWebView
    public final void g() {
        super.g();
        this.j = true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public final void i(String str, String str2, Function0 function0) {
        Function1 function1;
        Function0 function2;
        int iHashCode = str.hashCode();
        if (iHashCode != 1173532897) {
            if (iHashCode != 1616331862) {
                function2 = this.t;
                if (function2 != null) {
                    function2.invoke();
                    return;
                }
                return;
            }
            function2 = this.t;
            if (function2 != null) {
                function2.invoke();
                return;
            }
            return;
        }
        if (str.equals("net::ERR_UNKNOWN_URL_SCHEME")) {
            if ((c.x(str2, "mailto", false) || c.x(str2, "tel", false)) && (function1 = this.w) != null) {
                function1.invoke(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str2)));
            }
            function0.invoke();
            return;
        }
        function0.invoke();
    }

    public final void j(jb90 jb90Var) {
        Function1 function1;
        ib90 ib90Var = jb90Var.f16228a;
        if (fb90.f9247a[ib90Var.ordinal()] != 1) {
            if (!this.k.add(ib90Var) || (function1 = this.x) == null) {
                return;
            }
            function1.invoke(jb90Var);
            return;
        }
        int i = this.l;
        if (i < 3) {
            this.l = i + 1;
            Function1 function2 = this.x;
            if (function2 != null) {
                function2.invoke(jb90Var);
            }
        }
    }

    public final void k(Function1 function1, Function0 function0, Function0 function2, Function0 function3, xdr xdrVar, Function0 function4, Function1 function5, Function1 function6, Function1 function7) {
        function6.getClass();
        function7.getClass();
        this.o = function1;
        this.p = function0;
        this.q = function2;
        this.r = function3;
        this.s = xdrVar;
        this.t = function4;
        this.u = function5;
        this.v = function6;
        this.w = function7;
    }

    public final boolean l(Uri uri) throws URISyntaxException {
        Function1 function1;
        String host = uri != null ? uri.getHost() : null;
        if (host == null) {
            host = "";
        }
        this.h = this.i.length() > 0 && host.length() > 0 && !Intrinsics.d(this.i, host);
        if (uri != null) {
            String string = uri.toString();
            string.getClass();
            if (StringsKt.O(string, "/office/verification", false)) {
                try {
                    String queryParameter = uri.getQueryParameter(Payload.TYPE);
                    if (queryParameter != null && (function1 = this.u) != null) {
                        mbu0.b.getClass();
                        function1.invoke(queryParameter.equals("sumsub") ? mbu0.SUM_SUB : mbu0.UNKNOWN);
                        return true;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    return true;
                }
            } else if (StringsKt.O(string, "sobflous://", false) || StringsKt.O(string, "sberpay://", false) || StringsKt.O(string, "https://kaspi.kz", false)) {
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent.setData(uri);
                Function1 function2 = this.v;
                if (function2 != null) {
                    function2.invoke(intent);
                }
            } else if (c.n(string, ".pdf", false)) {
                Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent2.setData(Uri.parse("https://docs.google.com/gview?embedded=true&url=" + uri));
                Function1 function3 = this.v;
                if (function3 != null) {
                    function3.invoke(intent2);
                    return true;
                }
            } else if (c.x(string, "mailto", false) || c.x(string, "tel", false)) {
                Function1 function4 = this.w;
                if (function4 != null) {
                    function4.invoke(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri));
                    return true;
                }
            } else if (StringsKt.O(string, "browserintent://", false)) {
                Intent intent3 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(c.r(string, "browserintent://", "", true)));
                Function1 function5 = this.v;
                if (function5 != null) {
                    function5.invoke(intent3);
                    return true;
                }
            } else if (StringsKt.O(string, "intent://", false)) {
                Intent uri2 = Intent.parseUri(string, 1);
                Function1 function6 = this.v;
                if (function6 != null) {
                    uri2.getClass();
                    function6.invoke(uri2);
                    return true;
                }
            } else {
                Function1 function7 = this.o;
                if (!(function7 != null ? ((Boolean) function7.invoke(string)).booleanValue() : false)) {
                    String string2 = uri.toString();
                    string2.getClass();
                    if (Intrinsics.d(uri.getScheme(), "tg") || StringsKt.O(string2, "https://telegram.dog", false) || StringsKt.O(string2, "https://t.me", false) || StringsKt.O(string2, "https://telegram.me", false) || StringsKt.O(string2, "tg://", false)) {
                        xdr xdrVar = this.s;
                        if (xdrVar != null) {
                            xdrVar.F(Integer.valueOf(org.xbet.client1.R.string.social_telegram), "org.telegram.messenger", string);
                            return true;
                        }
                    } else if (c.x(string, "viber://", false)) {
                        xdr xdrVar2 = this.s;
                        if (xdrVar2 != null) {
                            xdrVar2.F(Integer.valueOf(org.xbet.client1.R.string.social_viber), "com.viber.voip&hl", string);
                            return true;
                        }
                    } else if (!c.x(string, "http", false)) {
                        Intent intent4 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                        intent4.setData(uri);
                        Function1 function8 = this.v;
                        if (function8 != null) {
                            function8.invoke(intent4);
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void setDownloadListener$impl(DownloadListener downloadListener) {
        downloadListener.getClass();
        siq fixedWebView = getFixedWebView();
        if (fixedWebView != null) {
            fixedWebView.setDownloadListener(downloadListener);
        }
    }

    public final void setOnWebViewErrorListener$impl(Function1<? super jb90, Unit> function1) {
        function1.getClass();
        this.x = function1;
    }
}
