package ru.ok.android.sdk;

import a.a6;
import a.z5;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class OkPostingActivity extends a6 {
    @Override // a.a6
    public final int a() {
        return R.string.posting_canceled;
    }

    @Override // a.a6
    public final String c() {
        return "WidgetMediatopicPost";
    }

    @Override // a.a6
    public final void f(String str) {
        Intent intent = new Intent();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if ("error".equals(jSONObject.getString(Payload.TYPE))) {
                intent.putExtra("error", jSONObject.getString(CrashHianalyticsData.MESSAGE));
            } else {
                intent.putExtra("result", jSONObject.toString());
            }
        } catch (JSONException unused) {
            intent.putExtra("error", str);
        }
        setResult(-1, intent);
        finish();
    }

    @Override // a.a6, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.setWebViewClient(new z5(this, this, (byte) 0));
        webView.getSettings().setJavaScriptEnabled(true);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("attachment");
            if (string == null) {
                string = "{}";
            }
            HashMap map = this.d;
            map.put("st.attachment", string);
            map.put("st.utext", extras.getBoolean("utext", false) ? "on" : "off");
        }
        ((WebView) findViewById(R.id.web_view)).loadUrl(d());
    }
}
