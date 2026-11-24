package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nhr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23548a;
    public final /* synthetic */ phr0 b;

    public /* synthetic */ nhr0(phr0 phr0Var, byte b) {
        this.f23548a = b;
        this.b = phr0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23548a;
        phr0 phr0Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = phr0Var.N1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                y2m0 y2m0Var = phr0.W1;
                phr0Var.G0().x(ugr0.f35638a);
                return Unit.f46060a;
            case 2:
                y2m0 y2m0Var2 = phr0.W1;
                phr0Var.G0().x(sgr0.f32176a);
                return Unit.f46060a;
            default:
                y2m0 y2m0Var3 = phr0.W1;
                phr0Var.G0().x(xgr0.f40853a);
                return Unit.f46060a;
        }
    }
}
