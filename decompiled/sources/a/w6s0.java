package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w6s0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38641a;
    public final /* synthetic */ z6s0 b;

    public /* synthetic */ w6s0(z6s0 z6s0Var, byte b) {
        this.f38641a = b;
        this.b = z6s0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38641a;
        z6s0 z6s0Var = this.b;
        switch (b) {
            case 0:
                m6m0 m6m0Var = z6s0.S1;
                fiu0 fiu0Var = z6s0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                m6m0 m6m0Var2 = z6s0.S1;
                z6s0Var.G0(null);
                return Unit.f46060a;
        }
    }
}
