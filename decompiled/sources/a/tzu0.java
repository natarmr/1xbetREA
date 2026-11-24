package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tzu0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34821a;
    public final /* synthetic */ xzu0 b;

    public /* synthetic */ tzu0(xzu0 xzu0Var, byte b) {
        this.f34821a = b;
        this.b = xzu0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34821a;
        xzu0 xzu0Var = this.b;
        switch (b) {
            case 0:
                uxs0 uxs0Var = xzu0.S1;
                fiu0 fiu0Var = xzu0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                uxs0 uxs0Var2 = xzu0.S1;
                xzu0Var.G0().x(mzu0.f22670a);
                return Unit.f46060a;
        }
    }
}
