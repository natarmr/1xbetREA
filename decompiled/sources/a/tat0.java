package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tat0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33631a;
    public final /* synthetic */ uat0 b;

    public /* synthetic */ tat0(uat0 uat0Var, byte b) {
        this.f33631a = b;
        this.b = uat0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f33631a;
        uat0 uat0Var = this.b;
        switch (b) {
            case 0:
                uxs0 uxs0Var = uat0.Q1;
                fiu0 fiu0Var = uat0Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                uxs0 uxs0Var2 = uat0.Q1;
                ((k3t0) uat0Var.N1.getValue()).x(jat0.f16207a);
                return Unit.f46060a;
            default:
                uxs0 uxs0Var3 = uat0.Q1;
                ((k3t0) uat0Var.N1.getValue()).x(iat0.f14455a);
                return Unit.f46060a;
        }
    }
}
