package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vyl0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38254a;
    public final /* synthetic */ xyl0 b;

    public /* synthetic */ vyl0(xyl0 xyl0Var, byte b) {
        this.f38254a = b;
        this.b = xyl0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38254a;
        xyl0 xyl0Var = this.b;
        switch (b) {
            case 0:
                gle0 gle0Var = xyl0.n2;
                fiu0 fiu0Var = xyl0Var.l2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                gle0 gle0Var2 = xyl0.n2;
                ((k3t0) xyl0Var.m2.getValue()).x(uyl0.f36495a);
                return Unit.f46060a;
        }
    }
}
