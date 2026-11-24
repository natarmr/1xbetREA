package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eq50 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8220a;
    public final /* synthetic */ hq50 b;

    public /* synthetic */ eq50(hq50 hq50Var, byte b) {
        this.f8220a = b;
        this.b = hq50Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f8220a;
        hq50 hq50Var = this.b;
        switch (b) {
            case 0:
                xuz xuzVar = hq50.R1;
                fiu0 fiu0Var = hq50Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                xuz xuzVar2 = hq50.R1;
                ((k3t0) hq50Var.L1.getValue()).x(aq50.f1282a);
                return Unit.f46060a;
        }
    }
}
