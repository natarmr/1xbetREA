package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ulg0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35870a;
    public final /* synthetic */ wlg0 b;

    public /* synthetic */ ulg0(wlg0 wlg0Var, byte b) {
        this.f35870a = b;
        this.b = wlg0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f35870a;
        wlg0 wlg0Var = this.b;
        switch (b) {
            case 0:
                cge0 cge0Var = wlg0.X1;
                fiu0 fiu0Var = wlg0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("rulesViewModelFactory");
                throw null;
            case 1:
                cge0 cge0Var2 = wlg0.X1;
                wlg0Var.G0().x(ilg0.f14978a);
                return Unit.f46060a;
            default:
                cge0 cge0Var3 = wlg0.X1;
                wlg0Var.G0().x(hlg0.f13260a);
                return Unit.f46060a;
        }
    }
}
