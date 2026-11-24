package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i0n0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13956a;
    public final /* synthetic */ l0n0 b;

    public /* synthetic */ i0n0(l0n0 l0n0Var, byte b) {
        this.f13956a = b;
        this.b = l0n0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13956a;
        l0n0 l0n0Var = this.b;
        switch (b) {
            case 0:
                avi aviVar = l0n0Var.K1;
                if (aviVar != null) {
                    return new q0h0(aviVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                s2m0 s2m0Var = l0n0.P1;
                l0n0Var.G0().x(uzm0.f36543a);
                return Unit.f46060a;
            default:
                s2m0 s2m0Var2 = l0n0.P1;
                l0n0Var.G0().x(vzm0.f38307a);
                return Unit.f46060a;
        }
    }
}
