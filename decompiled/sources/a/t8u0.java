package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t8u0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33530a;
    public final /* synthetic */ v8u0 b;

    public /* synthetic */ t8u0(v8u0 v8u0Var, byte b) {
        this.f33530a = b;
        this.b = v8u0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f33530a;
        v8u0 v8u0Var = this.b;
        switch (b) {
            case 0:
                wyi wyiVar = v8u0Var.N1;
                if (wyiVar != null) {
                    return new q0h0(wyiVar);
                }
                Intrinsics.h("verificationOptionsViewModelFactory");
                throw null;
            default:
                sxs0 sxs0Var = v8u0.P1;
                ((k3t0) v8u0Var.O1.getValue()).x(new h8u0(true));
                return Unit.f46060a;
        }
    }
}
