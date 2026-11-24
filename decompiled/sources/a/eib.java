package a;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eib implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7850a;
    public final /* synthetic */ FixedWebView b;

    public /* synthetic */ eib(FixedWebView fixedWebView, byte b) {
        this.f7850a = b;
        this.b = fixedWebView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        switch (this.f7850a) {
            case 0:
                context.getClass();
                break;
            case 1:
                context.getClass();
                break;
            case 2:
                context.getClass();
                break;
            default:
                context.getClass();
                break;
        }
        return this.b;
    }
}
