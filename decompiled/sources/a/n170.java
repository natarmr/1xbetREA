package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n170 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22736a;
    public final /* synthetic */ p170 b;

    public /* synthetic */ n170(p170 p170Var, byte b) {
        this.f22736a = b;
        this.b = p170Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f22736a;
        p170 p170Var = this.b;
        switch (b) {
            case 0:
                xuz xuzVar = p170.Q1;
                return qxw.y(p170Var);
            case 1:
                rmi rmiVar = p170Var.L1;
                if (rmiVar != null) {
                    return new q0h0(rmiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                xuz xuzVar2 = p170.Q1;
                p170Var.G0().x(y070.f41793a);
                return Unit.f46060a;
            default:
                xuz xuzVar3 = p170.Q1;
                p170Var.G0().x(w070.f38337a);
                return Unit.f46060a;
        }
    }
}
