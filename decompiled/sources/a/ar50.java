package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ar50 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1329a;
    public final /* synthetic */ cr50 b;

    public /* synthetic */ ar50(cr50 cr50Var, byte b) {
        this.f1329a = b;
        this.b = cr50Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1329a;
        cr50 cr50Var = this.b;
        switch (b) {
            case 0:
                evz evzVar = cr50.R1;
                fiu0 fiu0Var = cr50Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                evz evzVar2 = cr50.R1;
                ((k3t0) cr50Var.L1.getValue()).x(wq50.f39574a);
                return Unit.f46060a;
        }
    }
}
