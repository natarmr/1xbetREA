package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ixm0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15548a;
    public final /* synthetic */ kxm0 b;

    public /* synthetic */ ixm0(kxm0 kxm0Var, byte b) {
        this.f15548a = b;
        this.b = kxm0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f15548a;
        kxm0 kxm0Var = this.b;
        switch (b) {
            case 0:
                m6m0 m6m0Var = kxm0.n2;
                fiu0 fiu0Var = kxm0Var.k2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                m6m0 m6m0Var2 = kxm0.n2;
                kxm0Var.Q0().x(bxm0.f3381a);
                return Unit.f46060a;
            case 2:
                m6m0 m6m0Var3 = kxm0.n2;
                kxm0Var.Q0().x(axm0.f1630a);
                return Unit.f46060a;
            default:
                m6m0 m6m0Var4 = kxm0.n2;
                j120.Y(kxm0Var);
                return Unit.f46060a;
        }
    }
}
