package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sc10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31965a;
    public final /* synthetic */ uc10 b;

    public /* synthetic */ sc10(uc10 uc10Var, byte b) {
        this.f31965a = b;
        this.b = uc10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31965a;
        uc10 uc10Var = this.b;
        switch (b) {
            case 0:
                wsz wszVar = uc10.R1;
                fiu0 fiu0Var = uc10Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                wsz wszVar2 = uc10.R1;
                uc10Var.G0().x(cc10.f4089a);
                return Unit.f46060a;
        }
    }
}
