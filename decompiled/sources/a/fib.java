package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fib implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9578a;
    public final /* synthetic */ FixedWebView b;
    public final /* synthetic */ int c;

    public /* synthetic */ fib(FixedWebView fixedWebView, int i, byte b) {
        this.f9578a = b;
        this.b = fixedWebView;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f9578a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                qjj.k(this.b, fetVar, x8x.L(this.c | 1));
                break;
            case 1:
                m0x0.l(this.b, fetVar, x8x.L(this.c | 1));
                break;
            default:
                y0x0.j(this.b, fetVar, x8x.L(this.c | 1));
                break;
        }
        return Unit.f46060a;
    }
}
