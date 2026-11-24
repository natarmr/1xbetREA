package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eg4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7743a;
    public final /* synthetic */ ig4 b;

    public /* synthetic */ eg4(ig4 ig4Var, byte b) {
        this.f7743a = b;
        this.b = ig4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7743a;
        ig4 ig4Var = this.b;
        switch (b) {
            case 0:
                rek0 rek0Var = ig4.O1;
                fiu0 fiu0Var = ig4Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                rek0 rek0Var2 = ig4.O1;
                ((k3t0) ig4Var.M1.getValue()).x(bg4.f2537a);
                return Unit.f46060a;
            default:
                rek0 rek0Var3 = ig4.O1;
                ((k3t0) ig4Var.M1.getValue()).x(ag4.f811a);
                return Unit.f46060a;
        }
    }
}
