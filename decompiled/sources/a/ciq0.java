package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ciq0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4426a;
    public final /* synthetic */ diq0 b;

    public /* synthetic */ ciq0(diq0 diq0Var, byte b) {
        this.f4426a = b;
        this.b = diq0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f4426a;
        diq0 diq0Var = this.b;
        switch (b) {
            case 0:
                g9m0 g9m0Var = diq0.b2;
                fiu0 fiu0Var = diq0Var.Y1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                g9m0 g9m0Var2 = diq0.b2;
                ((k3t0) diq0Var.a2.getValue()).x(zhq0.f44407a);
                return Unit.f46060a;
        }
    }
}
