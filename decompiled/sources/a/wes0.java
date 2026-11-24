package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wes0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39033a;
    public final /* synthetic */ afs0 b;

    public /* synthetic */ wes0(afs0 afs0Var, byte b) {
        this.f39033a = b;
        this.b = afs0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39033a;
        afs0 afs0Var = this.b;
        switch (b) {
            case 0:
                fyi fyiVar = afs0Var.M1;
                if (fyiVar != null) {
                    return new q0h0(fyiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                g9m0 g9m0Var = afs0.P1;
                ((k3t0) afs0Var.N1.getValue()).x(fes0.f9420a);
                return Unit.f46060a;
        }
    }
}
