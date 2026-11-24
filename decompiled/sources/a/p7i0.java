package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p7i0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26507a;
    public final /* synthetic */ s7i0 b;

    public /* synthetic */ p7i0(s7i0 s7i0Var, byte b) {
        this.f26507a = b;
        this.b = s7i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26507a;
        s7i0 s7i0Var = this.b;
        switch (b) {
            case 0:
                gti gtiVar = s7i0Var.K1;
                if (gtiVar != null) {
                    return new q0h0(gtiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                gne0 gne0Var = s7i0.P1;
                s7i0Var.G0().x(l7i0.f19560a);
                return Unit.f46060a;
            default:
                gne0 gne0Var2 = s7i0.P1;
                s7i0Var.G0().x(i7i0.f14293a);
                return Unit.f46060a;
        }
    }
}
