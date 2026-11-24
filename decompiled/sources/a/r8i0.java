package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r8i0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30028a;
    public final /* synthetic */ t8i0 b;

    public /* synthetic */ r8i0(t8i0 t8i0Var, byte b) {
        this.f30028a = b;
        this.b = t8i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30028a;
        t8i0 t8i0Var = this.b;
        switch (b) {
            case 0:
                hti htiVar = t8i0Var.K1;
                if (htiVar != null) {
                    return new q0h0(htiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                cge0 cge0Var = t8i0.O1;
                t8i0Var.G0().x(m8i0.f21372a);
                return Unit.f46060a;
            case 2:
                cge0 cge0Var2 = t8i0.O1;
                t8i0Var.G0().x(l8i0.f19606a);
                return Unit.f46060a;
            default:
                cge0 cge0Var3 = t8i0.O1;
                t8i0Var.G0().x(k8i0.f17873a);
                return Unit.f46060a;
        }
    }
}
