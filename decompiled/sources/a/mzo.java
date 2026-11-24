package a;

import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class mzo extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22664a;
    public final /* synthetic */ yx5 b;

    public /* synthetic */ mzo(yx5 yx5Var, byte b) {
        this.f22664a = b;
        this.b = yx5Var;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        String[] resources;
        switch (this.f22664a) {
            case 3:
                whn0 whn0Var = (whn0) this.b;
                if (permissionRequest != null && (resources = permissionRequest.getResources()) != null && tx3.u("android.webkit.resource.VIDEO_CAPTURE", resources)) {
                    c8c c8cVar = whn0Var.M1;
                    if (c8cVar == null) {
                        Intrinsics.h("checkSystemPermissionAccessProvider");
                        throw null;
                    }
                    if (c8cVar.f3906a.checkSelfPermission("android.permission.CAMERA") == 0) {
                        permissionRequest.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
                        return;
                    }
                }
                if (permissionRequest != null) {
                    s2m0 s2m0Var = whn0.Y1;
                    qog0 qog0Var = (qog0) whn0Var.S1.getValue();
                    if (qog0Var != null) {
                        qog0Var.f29072a.add(new p790(qog0Var, permissionRequest, whn0Var, (byte) 2));
                        qog0Var.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onPermissionRequest(permissionRequest);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        boolean z;
        byte b = this.f22664a;
        yx5 yx5Var = this.b;
        switch (b) {
            case 2:
                super.onProgressChanged(webView, i);
                if (i == 100) {
                    mi70 mi70Var = w590.W1;
                    p7m0 p7m0Var = ((w590) yx5Var).I0().v;
                    j690 j690Var = new j690(false);
                    p7m0Var.getClass();
                    p7m0Var.o(null, j690Var);
                }
                break;
            case 3:
            default:
                super.onProgressChanged(webView, i);
                break;
            case 4:
                u3v0 u3v0Var = (u3v0) yx5Var;
                kys0 kys0Var = u3v0.P1;
                if (u3v0Var.u1.i.a(lkz.e)) {
                    if (i != 100) {
                        z = false;
                    } else {
                        String url = webView != null ? webView.getUrl() : null;
                        if (url == null) {
                            url = "";
                        }
                        if (url.length() <= 0 || url.equals("about:blank")) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    if (z) {
                        u3v0Var.G0().e.setVisibility(z ? 8 : 0);
                    }
                }
                super.onProgressChanged(webView, i);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        switch (this.f22664a) {
            case 0:
                nzo nzoVar = (nzo) this.b;
                if (nzoVar.u1.i.compareTo(lkz.e) >= 0) {
                    if (str == null) {
                        nzoVar.G0().e.setText(nzoVar.H(R.string.fast_games_title));
                        break;
                    } else if (!StringsKt.O(str, "http", false)) {
                        if (nzoVar.O1.length() == 0) {
                            nzoVar.O1 = str;
                        }
                        if (!Intrinsics.d(nzoVar.O1, str)) {
                            nzoVar.G0().b.setVisibility(8);
                        }
                        nzoVar.G0().e.setText(str);
                    }
                }
                super.onReceivedTitle(webView, str);
                break;
            default:
                super.onReceivedTitle(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        byte b = this.f22664a;
        yx5 yx5Var = this.b;
        switch (b) {
            case 1:
                webView.getClass();
                valueCallback.getClass();
                fileChooserParams.getClass();
                l590 l590Var = (l590) yx5Var;
                nh70 nh70Var = l590.Y1;
                ValueCallback valueCallback2 = l590Var.Q1;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(null);
                }
                l590Var.Q1 = valueCallback;
                l590Var.I0();
                return true;
            case 2:
                webView.getClass();
                valueCallback.getClass();
                fileChooserParams.getClass();
                w590 w590Var = (w590) yx5Var;
                mi70 mi70Var = w590.W1;
                ValueCallback valueCallback3 = w590Var.U1;
                if (valueCallback3 != null) {
                    valueCallback3.onReceiveValue(null);
                }
                w590Var.U1 = valueCallback;
                w590Var.G0();
                return true;
            case 3:
                valueCallback.getClass();
                whn0 whn0Var = (whn0) yx5Var;
                ValueCallback valueCallback4 = whn0Var.Q1;
                if (valueCallback4 != null) {
                    valueCallback4.onReceiveValue(null);
                }
                whn0Var.Q1 = valueCallback;
                whn0Var.G0();
                return true;
            default:
                return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
    }
}
