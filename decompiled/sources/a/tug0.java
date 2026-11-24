package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tug0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34549a;
    public final /* synthetic */ avg0 b;

    public /* synthetic */ tug0(avg0 avg0Var, byte b) {
        this.f34549a = b;
        this.b = avg0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34549a;
        avg0 avg0Var = this.b;
        switch (b) {
            case 0:
                osi osiVar = avg0Var.K1;
                if (osiVar != null) {
                    return new q0h0(osiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                cge0 cge0Var = avg0.P1;
                avg0Var.H0().x(ktg0.f18864a);
                return Unit.f46060a;
        }
    }
}
