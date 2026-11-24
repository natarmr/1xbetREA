package a;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tmm implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34200a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ tmm(Function0 function0, pz40 pz40Var) {
        this.f34200a = (byte) 2;
        this.c = function0;
        this.b = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34200a;
        Function0 function0 = this.c;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                function0.invoke();
                break;
            case 1:
                WebView webView = (WebView) pz40Var.getValue();
                if (webView == null || !webView.canGoBack()) {
                    function0.invoke();
                } else {
                    WebView webView2 = (WebView) pz40Var.getValue();
                    if (webView2 != null) {
                        webView2.goBack();
                    }
                }
                break;
            case 2:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                function0.invoke();
                break;
            case 3:
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    function0.invoke();
                }
                break;
            default:
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    function0.invoke();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ tmm(byte b, pz40 pz40Var, Function0 function0) {
        this.f34200a = b;
        this.b = pz40Var;
        this.c = function0;
    }
}
