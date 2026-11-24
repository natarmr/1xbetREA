package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jp50 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16885a;
    public final /* synthetic */ lp50 b;

    public /* synthetic */ jp50(lp50 lp50Var, byte b) {
        this.f16885a = b;
        this.b = lp50Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f16885a;
        lp50 lp50Var = this.b;
        switch (b) {
            case 0:
                uuz uuzVar = lp50.R1;
                fiu0 fiu0Var = lp50Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                uuz uuzVar2 = lp50.R1;
                ((k3t0) lp50Var.L1.getValue()).x(vt50.f37987a);
                return Unit.f46060a;
        }
    }
}
