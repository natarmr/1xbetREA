package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qg3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28663a;
    public final /* synthetic */ vg3 b;

    public /* synthetic */ qg3(vg3 vg3Var, byte b) {
        this.f28663a = b;
        this.b = vg3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f28663a;
        vg3 vg3Var = this.b;
        switch (b) {
            case 0:
                hfk0 hfk0Var = vg3.R1;
                p7m0 p7m0Var = vg3Var.H0().k0;
                p7m0Var.getClass();
                p7m0Var.o(null, rf50.f30370a);
                return Unit.f46060a;
            case 1:
                j8i j8iVar = vg3Var.L1;
                if (j8iVar != null) {
                    return new q0h0(j8iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                hfk0 hfk0Var2 = vg3.R1;
                p7m0 p7m0Var2 = vg3Var.H0().j0;
                do {
                    value = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value, jh3.a((jh3) value, null, null, null, null, null, null, null, null, true, false, 3071)));
                return Unit.f46060a;
        }
    }
}
