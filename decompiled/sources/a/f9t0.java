package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f9t0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9172a;
    public final /* synthetic */ g9t0 b;

    public /* synthetic */ f9t0(g9t0 g9t0Var, byte b) {
        this.f9172a = b;
        this.b = g9t0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9172a;
        g9t0 g9t0Var = this.b;
        switch (b) {
            case 0:
                svs0 svs0Var = g9t0.U1;
                fiu0 fiu0Var = g9t0Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                svs0 svs0Var2 = g9t0.U1;
                g9t0Var.G0().x(f8t0.f9124a);
                return Unit.f46060a;
            default:
                svs0 svs0Var3 = g9t0.U1;
                g9t0Var.G0().x(e8t0.f7390a);
                return Unit.f46060a;
        }
    }
}
