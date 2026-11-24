package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import android.webkit.WebSettings;
import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/fwp0;", "La/wgk0;", "<init>", "()V", "a/g9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fwp0 extends wgk0 {
    public final phf0 e2 = new phf0("APP_GUID");
    public final phf0 f2 = new phf0("SNACKBAR_STYLE");
    public final zz2 g2 = new zz2("REF_ID");
    public static final /* synthetic */ iiy[] i2 = {new ez40(fwp0.class, "appGuid", "getAppGuid()Ljava/lang/String;", 0), new ez40(fwp0.class, "snackbarStyle", "getSnackbarStyle()Ljava/lang/String;", 0), new ez40(fwp0.class, "refId", "getRefId()I", 0)};
    public static final g9m0 h2 = new g9m0();

    @Override // a.wgk0, a.by5
    public final void K0() {
        WebSettings settings;
        WebSettings settings2;
        WebSettings settings3;
        super.K0();
        FixedWebView fixedWebView = I0().d;
        ProgressBar progressBar = I0().b;
        iiy[] iiyVarArr = i2;
        String str = "https://eoauthsns.com/user/oauth/?type=telegram&is_new_dis=1&partner=" + this.g2.n(this, iiyVarArr[2]).intValue() + "&AppGuid=" + this.e2.n(this, iiyVarArr[0]);
        siq fixedWebView2 = fixedWebView.getFixedWebView();
        if (fixedWebView2 != null && (settings3 = fixedWebView2.getSettings()) != null) {
            settings3.setJavaScriptEnabled(true);
        }
        siq fixedWebView3 = fixedWebView.getFixedWebView();
        if (fixedWebView3 != null && (settings2 = fixedWebView3.getSettings()) != null) {
            settings2.setSupportMultipleWindows(true);
        }
        siq fixedWebView4 = fixedWebView.getFixedWebView();
        if (fixedWebView4 != null && (settings = fixedWebView4.getSettings()) != null) {
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
        }
        siq fixedWebView5 = fixedWebView.getFixedWebView();
        if (fixedWebView5 != null) {
            fixedWebView5.setWebChromeClient(new gb90(this, progressBar, fixedWebView));
        }
        siq fixedWebView6 = fixedWebView.getFixedWebView();
        if (fixedWebView6 != null) {
            fixedWebView6.setFixedWebViewClient(new ewp0(this, progressBar));
        }
        fixedWebView.c(str);
        String strH = H(R.string.not_available_in_country);
        strH.getClass();
        F().t0(i120.V(new Pair("NOT_AVAILABLE", strH)), "NOT_AVAILABLE");
    }

    @Override // a.by5
    public final int N0() {
        return R.string.social_telegram;
    }

    public final boolean T0(String str) {
        if (!StringsKt.O(str, "oaud_", false) && !StringsKt.O(str, "example.com", false)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("user_info[hash]");
        if (queryParameter == null) {
            queryParameter = "";
        }
        String queryParameter2 = uri.getQueryParameter("user_info[first_name]");
        String str2 = queryParameter2 == null ? "" : queryParameter2;
        String queryParameter3 = uri.getQueryParameter("user_info[last_name]");
        String str3 = queryParameter3 == null ? "" : queryParameter3;
        String queryParameter4 = uri.getQueryParameter(ParameterNames.ID);
        String str4 = queryParameter4 == null ? "" : queryParameter4;
        String queryParameter5 = uri.getQueryParameter("user_info[data_check_string]");
        String str5 = queryParameter5 == null ? "" : queryParameter5;
        String queryParameter6 = uri.getQueryParameter("key");
        F().t0(i120.V(new Pair("SUCCESS_SOCIAL", new ghk0(17, queryParameter.length() == 0 ? queryParameter6 != null ? queryParameter6 : "" : queryParameter, str5, str4, str2, str3, null, null, 192))), "SUCCESS_SOCIAL");
        y0();
        return true;
    }

    public final boolean U0(String str) {
        if (!kotlin.text.c.x(str, "tg", false)) {
            return false;
        }
        kxq kxqVarB = B();
        if (kxqVarB == null) {
            return true;
        }
        wdk0 wdk0Var = new wdk0(new nxo0(this, (byte) 25));
        String strH = H(R.string.social_telegram);
        strH.getClass();
        n6x.i0(kxqVarB, wdk0Var, strH, "org.telegram.messenger", str);
        return true;
    }
}
