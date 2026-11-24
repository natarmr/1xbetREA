package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x9t0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40525a;
    public final /* synthetic */ y9t0 b;

    public /* synthetic */ x9t0(y9t0 y9t0Var, byte b) {
        this.f40525a = b;
        this.b = y9t0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40525a;
        y9t0 y9t0Var = this.b;
        switch (b) {
            case 0:
                sxs0 sxs0Var = y9t0.Q1;
                fiu0 fiu0Var = y9t0Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                sxs0 sxs0Var2 = y9t0.Q1;
                ((k3t0) y9t0Var.N1.getValue()).x(n9t0.f23157a);
                return Unit.f46060a;
            default:
                sxs0 sxs0Var3 = y9t0.Q1;
                ((k3t0) y9t0Var.N1.getValue()).x(m9t0.f21428a);
                return Unit.f46060a;
        }
    }
}
