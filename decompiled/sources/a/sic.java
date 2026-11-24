package a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sic implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32256a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ sic(w03 w03Var, w03 w03Var2, w03 w03Var3, w03 w03Var4, w03 w03Var5, w03 w03Var6, boolean z, i9q i9qVar, g9q0 g9q0Var) {
        this.c = w03Var;
        this.d = w03Var2;
        this.e = w03Var3;
        this.f = w03Var4;
        this.g = w03Var5;
        this.h = w03Var6;
        this.b = z;
        this.i = i9qVar;
        this.j = g9q0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WebView webView;
        byte b = this.f32256a;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        switch (b) {
            case 0:
                w03 w03Var = (w03) obj9;
                w03 w03Var2 = (w03) obj8;
                w03 w03Var3 = (w03) obj6;
                w03 w03Var4 = (w03) obj5;
                w03 w03Var5 = (w03) obj4;
                i9q i9qVar = (i9q) obj3;
                g9q0 g9q0Var = (g9q0) obj2;
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                w03Var.i();
                w03Var2.i();
                ((w03) obj7).i();
                w03Var3.i();
                w03Var4.i();
                w03Var5.i();
                nr nrVarA0 = fhlVar.A0();
                long jP = nrVarA0.p();
                nrVarA0.i().l();
                try {
                    fvt0 fvt0Var = (fvt0) nrVarA0.b;
                    boolean z = this.b;
                    fvt0Var.z(z ? -1.0f : 1.0f, -1.0f, p7x.u(((nr) fvt0Var.f10231a).p()));
                    j120.N(fhlVar, i9qVar, w03Var, w03Var2, w03Var3, w03Var4, w03Var5, g9q0Var, z);
                    return Unit.f46060a;
                } finally {
                    defpackage.c.g(nrVarA0, jP);
                }
            default:
                boolean z2 = this.b;
                de10 de10Var = (de10) obj9;
                ce10 ce10Var = (ce10) obj8;
                Function0 function0 = (Function0) obj7;
                pz40 pz40Var = (pz40) obj6;
                vby vbyVar = (vby) obj5;
                String str = (String) obj4;
                Function0 function1 = (Function0) obj3;
                Function0 function2 = (Function0) obj2;
                Context context = (Context) obj;
                context.getClass();
                try {
                    webView = new WebView(context);
                    hmw0.c0(webView, z2);
                    webView.setWebViewClient(de10Var);
                    webView.setWebChromeClient(ce10Var);
                    break;
                } catch (Throwable th) {
                    th.printStackTrace();
                    function0.invoke();
                    webView = null;
                }
                if (webView == null) {
                    return new View(context);
                }
                pz40Var.setValue(webView);
                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                webView.addJavascriptInterface(new dd10(new r3w(function1, (byte) 3), new a2z(function2, (byte) 4), vbyVar), "MobileAppApi");
                webView.loadUrl(str);
                return webView;
        }
    }

    public /* synthetic */ sic(boolean z, de10 de10Var, ce10 ce10Var, Function0 function0, pz40 pz40Var, vby vbyVar, String str, Function0 function1, Function0 function2) {
        this.b = z;
        this.c = de10Var;
        this.d = ce10Var;
        this.e = function0;
        this.f = pz40Var;
        this.g = vbyVar;
        this.h = str;
        this.i = function1;
        this.j = function2;
    }
}
