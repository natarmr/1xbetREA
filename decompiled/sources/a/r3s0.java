package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r3s0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29803a;
    public final /* synthetic */ v3s0 b;

    public /* synthetic */ r3s0(v3s0 v3s0Var, byte b) {
        this.f29803a = b;
        this.b = v3s0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29803a;
        v3s0 v3s0Var = this.b;
        switch (b) {
            case 0:
                y2m0 y2m0Var = v3s0.S1;
                fiu0 fiu0Var = v3s0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                y2m0 y2m0Var2 = v3s0.S1;
                v3s0Var.G0(null);
                return Unit.f46060a;
        }
    }
}
