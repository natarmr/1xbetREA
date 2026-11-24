package a;

import android.content.Intent;
import android.webkit.WebView;
import com.yandex.authsdk.internal.WebViewLoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class avs0 extends rer implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1543a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ avs0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f1543a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1543a;
        byte b2 = 16;
        byte b3 = 6;
        e9u0 e9u0Var = e9u0.f7441a;
        yje yjeVar = null;
        switch (b) {
            case 0:
                ((dws0) this.receiver).j.f(new xvs0(mvs0.f22472a));
                return Unit.f46060a;
            case 1:
                ((g7u0) this.receiver).w();
                return Unit.f46060a;
            case 2:
                i9u0 i9u0Var = (i9u0) this.receiver;
                p7m0 p7m0Var = i9u0Var.g;
                p7m0Var.getClass();
                p7m0Var.o(null, e9u0Var);
                sac.V(jiu0.a(i9u0Var), new npt0(i9u0Var, b3), null, i9u0Var.f.f22085a, new k6s0(i9u0Var, yjeVar, b2), 10);
                return Unit.f46060a;
            case 3:
                i9u0 i9u0Var2 = (i9u0) this.receiver;
                p7m0 p7m0Var2 = i9u0Var2.g;
                p7m0Var2.getClass();
                p7m0Var2.o(null, e9u0Var);
                sac.V(jiu0.a(i9u0Var2), new npt0(i9u0Var2, b3), null, i9u0Var2.f.f22085a, new k6s0(i9u0Var2, yjeVar, b2), 10);
                return Unit.f46060a;
            case 4:
                ((abu0) this.receiver).A();
                return Unit.f46060a;
            case 5:
                ((abu0) this.receiver).B();
                return Unit.f46060a;
            case 6:
                return ((xru0) this.receiver).p0();
            case 7:
                ((uzg) ((esu0) this.receiver).d).a();
                return Unit.f46060a;
            case 8:
                return ((hsu0) this.receiver).p0();
            case 9:
                WebViewLoginActivity webViewLoginActivity = (WebViewLoginActivity) this.receiver;
                int i = WebViewLoginActivity.e;
                cgx0 cgx0Var = webViewLoginActivity.d;
                if (cgx0Var == null) {
                    Intrinsics.h("sslErrorHandler");
                    throw null;
                }
                cgx0Var.l();
                WebView webView = webViewLoginActivity.c;
                if (webView == null) {
                    Intrinsics.h("webView");
                    throw null;
                }
                webView.stopLoading();
                Intent intent = new Intent();
                intent.putExtra("com.yandex.authsdk.EXTRA_ERROR", new d2w0("security.error"));
                webViewLoginActivity.setResult(-1, intent);
                webViewLoginActivity.finish();
                return Unit.f46060a;
            case 10:
                ((d7v0) this.receiver).z(w6v0.f38645a);
                return Unit.f46060a;
            case 11:
                ((cgv0) this.receiver).getClass();
                return new dgv0("", iun.f15405a, true, false);
            case 12:
                ((ruv0) this.receiver).c();
                return Unit.f46060a;
            case 13:
                return ((cyv0) this.receiver).p0();
            default:
                return ((wzv0) this.receiver).p0();
        }
    }
}
