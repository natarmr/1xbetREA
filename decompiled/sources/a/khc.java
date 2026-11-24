package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class khc implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18284a;
    public final /* synthetic */ nhc b;

    public /* synthetic */ khc(nhc nhcVar, byte b) {
        this.f18284a = b;
        this.b = nhcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f18284a;
        nhc nhcVar = this.b;
        switch (b) {
            case 0:
                bj5 bj5Var = nhc.P1;
                nhcVar.G0().x(chc.f4352a);
                return Unit.f46060a;
            case 1:
                bj5 bj5Var2 = nhc.P1;
                nhcVar.G0().x(ehc.f7800a);
                return Unit.f46060a;
            default:
                bj5 bj5Var3 = nhc.P1;
                fiu0 fiu0Var = nhcVar.N1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
