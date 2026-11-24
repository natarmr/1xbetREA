package ru.ok.android.sdk;

import a.a6;
import a.z5;
import android.os.Bundle;
import android.webkit.WebView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class OkAppInviteActivity extends a6 {
    @Override // a.a6, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.setWebViewClient(new z5(this, this, (byte) 0));
        webView.getSettings().setJavaScriptEnabled(true);
        ((WebView) findViewById(R.id.web_view)).loadUrl(d());
    }
}
