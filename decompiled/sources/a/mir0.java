package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mir0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21859a;
    public final /* synthetic */ pir0 b;

    public /* synthetic */ mir0(pir0 pir0Var, byte b) {
        this.f21859a = b;
        this.b = pir0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21859a;
        pir0 pir0Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = pir0Var.N1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                j6m0 j6m0Var = pir0.W1;
                pir0Var.G0().w();
                return Unit.f46060a;
            case 2:
                j6m0 j6m0Var2 = pir0.W1;
                pir0Var.G0().B();
                return Unit.f46060a;
            default:
                j6m0 j6m0Var3 = pir0.W1;
                pir0Var.G0().w();
                return Unit.f46060a;
        }
    }
}
