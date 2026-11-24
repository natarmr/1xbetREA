package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s020 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31392a;
    public final /* synthetic */ u020 b;

    public /* synthetic */ s020(u020 u020Var, byte b) {
        this.f31392a = b;
        this.b = u020Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31392a;
        u020 u020Var = this.b;
        switch (b) {
            case 0:
                atz atzVar = u020.S1;
                fiu0 fiu0Var = u020Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                atz atzVar2 = u020.S1;
                ((k3t0) u020Var.N1.getValue()).x(bu30.f3212a);
                return Unit.f46060a;
        }
    }
}
