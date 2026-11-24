package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sc8 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31974a;
    public final /* synthetic */ uc8 b;

    public /* synthetic */ sc8(uc8 uc8Var, byte b) {
        this.f31974a = b;
        this.b = uc8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31974a;
        uc8 uc8Var = this.b;
        switch (b) {
            case 0:
                yk5 yk5Var = uc8.P1;
                fiu0 fiu0Var = uc8Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                yk5 yk5Var2 = uc8.P1;
                uc8Var.G0().x(kc8.f18046a);
                return Unit.f46060a;
        }
    }
}
