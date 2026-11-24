package a;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.util.TypedValue;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class zw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f45083a;
    public final mne b;
    public final MutableContextWrapper c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public Function0 f;
    public xdr g;
    public Function0 h;
    public Function0 i;
    public Function0 j;
    public Function1 k;

    public zw0(us00 us00Var, mne mneVar) {
        this.f45083a = us00Var;
        this.b = mneVar;
        this.c = new MutableContextWrapper(us00Var);
    }

    public static void a(WebView webView, boolean z) {
        g5v0 g5v0Var;
        if (z4v0.a("MUTE_AUDIO")) {
            WeakHashMap weakHashMap = v4v0.f36801a;
            if (!z4v0.b.b()) {
                v4i0.p("This method is not supported by the current version of the framework and the current WebView APK");
                return;
            }
            if (z4v0.c.b()) {
                WeakHashMap weakHashMap2 = v4v0.f36801a;
                g5v0Var = (g5v0) weakHashMap2.get(webView);
                if (g5v0Var == null) {
                    g5v0Var = new g5v0(b5v0.f2025a.createWebView(webView));
                    weakHashMap2.put(webView, g5v0Var);
                }
            } else {
                g5v0Var = new g5v0(b5v0.f2025a.createWebView(webView));
            }
            g5v0Var.f10735a.setAudioMuted(z);
        }
    }

    public final void b() {
        ArrayList<ax0> arrayList = this.d;
        for (ax0 ax0Var : arrayList) {
            WebView webView = ax0Var.f1599a;
            if (webView != null) {
                webView.stopLoading();
            }
            WebView webView2 = ax0Var.f1599a;
            if (webView2 != null) {
                webView2.destroy();
            }
        }
        arrayList.clear();
        Function1 function1 = this.k;
        if (function1 != null) {
            function1.invoke(new ax0(null, null));
        }
    }

    public final WebView c(boolean z, vw0 vw0Var, uw0 uw0Var) {
        try {
            WebView webView = new WebView(this.c);
            h(webView, z);
            webView.setWebViewClient(vw0Var);
            webView.setWebChromeClient(uw0Var);
            webView.setDownloadListener(new ww0(this, (byte) 0));
            return webView;
        } catch (Throwable th) {
            th.printStackTrace();
            Function0 function0 = this.i;
            if (function0 == null) {
                return null;
            }
            function0.invoke();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(zje zjeVar, String str, String str2, boolean z) {
        xw0 xw0Var;
        if (zjeVar instanceof xw0) {
            xw0Var = (xw0) zjeVar;
            int i = xw0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xw0Var.k = i - Integer.MIN_VALUE;
            } else {
                xw0Var = new xw0(this, zjeVar);
            }
        } else {
            xw0Var = new xw0(this, zjeVar);
        }
        Object obj = xw0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = xw0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            vs10 vs10Var = this.b.c;
            kz kzVar = new kz(this, str2, z, str, (yje) null);
            xw0Var.k = 1;
            if (qjj.d0(vs10Var, kzVar, xw0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public final void e() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            WebView webView = ((ax0) it.next()).f1599a;
            if (webView != null) {
                a(webView, true);
            }
            if (webView != null) {
                webView.pauseTimers();
            }
            if (webView != null) {
                webView.onPause();
            }
        }
    }

    public final void f() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            WebView webView = ((ax0) it.next()).f1599a;
            if (webView != null) {
                webView.onResume();
            }
            if (webView != null) {
                webView.resumeTimers();
            }
            if (webView != null) {
                a(webView, false);
            }
        }
    }

    public final void g() {
        ax0 ax0Var;
        Function1 function1;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() || (ax0Var = (ax0) CollectionsKt.f0(arrayList)) == null) {
            return;
        }
        WebView webView = ax0Var.f1599a;
        if (webView != null) {
            webView.destroy();
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        if (!arrayList.isEmpty()) {
            ax0 ax0Var2 = (ax0) CollectionsKt.f0(arrayList);
            if (ax0Var2 == null || (function1 = this.k) == null) {
                return;
            }
            function1.invoke(ax0Var2);
            return;
        }
        Function1 function2 = this.k;
        if (function2 != null) {
            function2.invoke(new ax0(null, null));
        }
        Function0 function0 = this.h;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void h(WebView webView, boolean z) {
        WebSettings settings = webView.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSupportMultipleWindows(z);
        settings.setCacheMode(2);
        WebView.setWebContentsDebuggingEnabled(this.e);
        webView.setScrollbarFadingEnabled(false);
        Context context = webView.getContext();
        context.getClass();
        TypedValue typedValue = m5d.f21214a;
        webView.setBackgroundColor(context.getColor(R.color.static_black));
        webView.setLayerType(2, null);
    }

    public final void i(View view) {
        ArrayList arrayList = this.d;
        ax0 ax0Var = (ax0) CollectionsKt.f0(arrayList);
        if (ax0Var == null || Intrinsics.d(ax0Var.b, view)) {
            return;
        }
        ax0 ax0Var2 = new ax0(ax0Var.f1599a, view);
        arrayList.set(arrayList.indexOf(ax0Var), ax0Var2);
        Function1 function1 = this.k;
        if (function1 != null) {
            function1.invoke(ax0Var2);
        }
    }
}
