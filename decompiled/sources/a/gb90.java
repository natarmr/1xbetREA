package a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.xplatform.feature.office.payment.impl.presentation.view.PaymentWebView;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes4.dex */
public final class gb90 extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11007a = 1;
    public Object b;
    public Object c;
    public final /* synthetic */ FixedWebView d;

    public gb90(fwp0 fwp0Var, ProgressBar progressBar, FixedWebView fixedWebView) {
        this.b = fwp0Var;
        this.c = progressBar;
        this.d = fixedWebView;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        switch (this.f11007a) {
            case 0:
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.getClass();
                return bitmapCreateBitmap;
            default:
                return super.getDefaultVideoPoster();
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        switch (this.f11007a) {
            case 1:
                this.d.removeView(webView);
                break;
            default:
                super.onCloseWindow(webView);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        switch (this.f11007a) {
            case 0:
                if ((consoleMessage != null ? consoleMessage.messageLevel() : null) == ConsoleMessage.MessageLevel.ERROR) {
                    PaymentWebView paymentWebView = (PaymentWebView) this.d;
                    ib90 ib90Var = ib90.JS;
                    String strSourceId = consoleMessage.sourceId();
                    if (strSourceId == null) {
                        strSourceId = "";
                    }
                    String strMessage = consoleMessage.message();
                    if (strMessage == null) {
                        strMessage = "";
                    }
                    jb90 jb90Var = new jb90(ib90Var, strSourceId, 0, strMessage, false, 20);
                    List list = PaymentWebView.y;
                    paymentWebView.j(jb90Var);
                }
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        switch (this.f11007a) {
            case 1:
                webView.getClass();
                Context context = webView.getContext();
                context.getClass();
                siq fixedWebView = new FixedWebView(context).getFixedWebView();
                if (fixedWebView == null) {
                    return false;
                }
                fwp0 fwp0Var = (fwp0) this.b;
                ProgressBar progressBar = (ProgressBar) this.c;
                fixedWebView.getSettings().setJavaScriptEnabled(true);
                fixedWebView.setWebChromeClient(this);
                fixedWebView.setFixedWebViewClient(new dwp0(fwp0Var, progressBar));
                fixedWebView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                webView.addView(fixedWebView);
                Object obj = message != null ? message.obj : null;
                obj.getClass();
                ((WebView.WebViewTransport) obj).setWebView(fixedWebView);
                message.sendToTarget();
                return true;
            default:
                return super.onCreateWindow(webView, z, z2, message);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        ycm0 ziv0Var;
        switch (this.f11007a) {
            case 0:
                PaymentWebView paymentWebView = (PaymentWebView) this.d;
                View view = (View) this.b;
                if (view != null) {
                    View decorView = paymentWebView.getWindow().getDecorView();
                    decorView.getClass();
                    ((FrameLayout) decorView).removeView(view);
                    Window window = paymentWebView.getWindow();
                    ani0 ani0Var = new ani0(view);
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 35) {
                        ziv0Var = new bjv0(window, ani0Var);
                    } else if (i >= 30) {
                        ziv0Var = new ajv0(window, ani0Var);
                    } else {
                        ziv0Var = i >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
                    }
                    ziv0Var.y(2);
                    ziv0Var.y(519);
                    this.b = null;
                }
                WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) this.c;
                if (customViewCallback != null) {
                    customViewCallback.onCustomViewHidden();
                }
                this.c = null;
                break;
            default:
                super.onHideCustomView();
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        switch (this.f11007a) {
            case 0:
                permissionRequest.getClass();
                Function1 function1 = ((PaymentWebView) this.d).n;
                if (function1 != null) {
                    function1.invoke(permissionRequest);
                }
                break;
            default:
                super.onPermissionRequest(permissionRequest);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f11007a) {
            case 0:
                view.getClass();
                customViewCallback.getClass();
                if (((View) this.b) == null) {
                    view.setPadding(0, 0, 0, 0);
                    this.b = view;
                    this.c = customViewCallback;
                    View decorView = ((PaymentWebView) this.d).getWindow().getDecorView();
                    decorView.getClass();
                    FrameLayout frameLayout = (FrameLayout) decorView;
                    frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
                    frameLayout.post(new oh60(this, view, (byte) 3));
                } else {
                    onHideCustomView();
                }
                break;
            default:
                super.onShowCustomView(view, customViewCallback);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        switch (this.f11007a) {
            case 0:
                webView.getClass();
                valueCallback.getClass();
                fileChooserParams.getClass();
                Function1 function1 = ((PaymentWebView) this.d).m;
                if (function1 == null) {
                    return true;
                }
                function1.invoke(valueCallback);
                return true;
            default:
                return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
    }

    public gb90(PaymentWebView paymentWebView) {
        this.d = paymentWebView;
    }
}
