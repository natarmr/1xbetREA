package a;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hxc0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13810a;
    public final /* synthetic */ kxc0 b;

    public /* synthetic */ hxc0(kxc0 kxc0Var, byte b) {
        this.f13810a = b;
        this.b = kxc0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        siq fixedWebView;
        byte b = this.f13810a;
        Integer numValueOf = null;
        kxc0 kxc0Var = this.b;
        switch (b) {
            case 0:
                jh70 jh70Var = kxc0.Y1;
                fiu0 fiu0Var = kxc0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                FixedWebView fixedWebView2 = kxc0Var.Q1;
                if (fixedWebView2 != null && (fixedWebView = fixedWebView2.getFixedWebView()) != null) {
                    numValueOf = Integer.valueOf(fixedWebView.getScrollY());
                }
                kxc0Var.S1 = numValueOf;
                return Unit.f46060a;
            case 2:
                jh70 jh70Var2 = kxc0.Y1;
                k3t0 k3t0VarJ0 = kxc0Var.J0();
                File filesDir = kxc0Var.o0().getFilesDir();
                filesDir.getClass();
                k3t0VarJ0.x(new vvc0(filesDir));
                return Unit.f46060a;
            case 3:
                jh70 jh70Var3 = kxc0.Y1;
                kxc0Var.J0().x(pvc0.f27657a);
                return Unit.f46060a;
            default:
                jh70 jh70Var4 = kxc0.Y1;
                kxc0Var.J0().x(qvc0.f29379a);
                return Unit.f46060a;
        }
    }
}
