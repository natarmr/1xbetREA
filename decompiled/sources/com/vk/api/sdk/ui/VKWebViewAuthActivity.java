package com.vk.api.sdk.ui;

import a.dvt0;
import a.fwt0;
import a.gwt0;
import a.jf4;
import a.r3d;
import a.tut0;
import a.wut0;
import a.xp20;
import a.xun;
import a.xvt0;
import a.zz2;
import android.app.Activity;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class VKWebViewAuthActivity extends Activity {
    public static dvt0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebView f46052a;
    public ProgressBar b;
    public zz2 c;

    public final Map a() {
        zz2 zz2Var = this.c;
        if (zz2Var == null) {
            Intrinsics.h("params");
            throw null;
        }
        Pair pair = new Pair(CommonConstant.ReqAccessTokenParam.CLIENT_ID, String.valueOf(zz2Var.f45232a));
        zz2 zz2Var2 = this.c;
        if (zz2Var2 == null) {
            Intrinsics.h("params");
            throw null;
        }
        Pair pair2 = new Pair(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, CollectionsKt.b0((HashSet) zz2Var2.c, Separators.COMMA, null, null, null, 62));
        zz2 zz2Var3 = this.c;
        if (zz2Var3 == null) {
            Intrinsics.h("params");
            throw null;
        }
        Pair pair3 = new Pair(CommonConstant.ReqAccessTokenParam.REDIRECT_URI, (String) zz2Var3.b);
        Pair pair4 = new Pair(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, "token");
        Pair pair5 = new Pair(CommonConstant.ReqAccessTokenParam.DISPLAY_LABEL, "mobile");
        wut0 wut0Var = tut0.f34568a;
        if (wut0Var != null) {
            return xp20.f(pair, pair2, pair3, pair4, pair5, new Pair("v", wut0Var.e), new Pair("revoke", "1"));
        }
        Intrinsics.h("config");
        throw null;
    }

    public final boolean b() {
        return getIntent().getStringExtra("vk_validation_url") != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [a.xun] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        ?? arrayList;
        zz2 zz2Var;
        String string;
        super.onCreate(bundle);
        setContentView(R.layout.vk_webview_auth_dialog);
        View viewFindViewById = findViewById(R.id.webView);
        viewFindViewById.getClass();
        this.f46052a = (WebView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.progress);
        viewFindViewById2.getClass();
        this.b = (ProgressBar) viewFindViewById2;
        Bundle bundleExtra = getIntent().getBundleExtra("vk_auth_params");
        if (bundleExtra == null) {
            zz2Var = null;
        } else {
            int i = bundleExtra.getInt("vk_app_id");
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("vk_app_scope");
            if (stringArrayList != null) {
                arrayList = new ArrayList(r3d.q(stringArrayList, 10));
                for (String str : stringArrayList) {
                    str.getClass();
                    arrayList.add(xvt0.valueOf(str));
                }
            } else {
                arrayList = xun.f41520a;
            }
            String string2 = bundleExtra.getString("vk_app_redirect_url", "https://oauth.vk.com/blank.html");
            string2.getClass();
            string2.getClass();
            arrayList.getClass();
            zz2Var = new zz2();
            zz2Var.f45232a = i;
            zz2Var.b = string2;
            if (i == 0) {
                jf4.n("AppId is empty! Find out how to get your appId at https://vk.com/dev/access_token");
                throw null;
            }
            zz2Var.c = new HashSet((Collection) arrayList);
        }
        if (zz2Var != null) {
            this.c = zz2Var;
        } else if (!b()) {
            finish();
        }
        WebView webView = this.f46052a;
        if (webView == null) {
            Intrinsics.h("webView");
            throw null;
        }
        webView.setWebViewClient(new gwt0(this));
        webView.setVerticalScrollBarEnabled(false);
        webView.setVisibility(4);
        webView.setOverScrollMode(2);
        WebView webView2 = this.f46052a;
        if (webView2 == null) {
            Intrinsics.h("webView");
            throw null;
        }
        webView2.getSettings().setJavaScriptEnabled(true);
        try {
            if (b()) {
                string = getIntent().getStringExtra("vk_validation_url");
                if (string == null) {
                    throw new IllegalStateException("There is no vk_validation_url key inside");
                }
            } else {
                Uri.Builder builderBuildUpon = Uri.parse("https://api.vk.com/oauth/authorize").buildUpon();
                for (Map.Entry entry : a().entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                string = builderBuildUpon.build().toString();
                string.getClass();
            }
            WebView webView3 = this.f46052a;
            if (webView3 == null) {
                Intrinsics.h("webView");
                throw null;
            }
            webView3.loadUrl(string);
        } catch (Exception e) {
            e.printStackTrace();
            setResult(0);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        WebView webView = this.f46052a;
        if (webView == null) {
            Intrinsics.h("webView");
            throw null;
        }
        webView.destroy();
        fwt0.b();
        super.onDestroy();
    }
}
