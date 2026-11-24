package a;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nwc0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24228a;
    public final /* synthetic */ qwc0 b;

    public /* synthetic */ nwc0(qwc0 qwc0Var, byte b) {
        this.f24228a = b;
        this.b = qwc0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        siq fixedWebView;
        byte b = this.f24228a;
        Integer numValueOf = null;
        qwc0 qwc0Var = this.b;
        switch (b) {
            case 0:
                rl70 rl70Var = qwc0.Z1;
                fiu0 fiu0Var = qwc0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                rl70 rl70Var2 = qwc0.Z1;
                k3t0 k3t0VarJ0 = qwc0Var.J0();
                File filesDir = qwc0Var.o0().getFilesDir();
                filesDir.getClass();
                k3t0VarJ0.x(new jwc0(filesDir));
                return Unit.f46060a;
            case 2:
                rl70 rl70Var3 = qwc0.Z1;
                qwc0Var.J0().x(dwc0.f6792a);
                return Unit.f46060a;
            case 3:
                FixedWebView fixedWebView2 = qwc0Var.Q1;
                if (fixedWebView2 != null && (fixedWebView = fixedWebView2.getFixedWebView()) != null) {
                    numValueOf = Integer.valueOf(fixedWebView.getScrollY());
                }
                qwc0Var.S1 = numValueOf;
                return Unit.f46060a;
            default:
                rl70 rl70Var4 = qwc0.Z1;
                qwc0Var.J0().x(ewc0.f8517a);
                return Unit.f46060a;
        }
    }
}
