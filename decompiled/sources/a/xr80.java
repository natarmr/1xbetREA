package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xr80 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41357a;
    public final /* synthetic */ as80 b;

    public /* synthetic */ xr80(as80 as80Var, byte b) {
        this.f41357a = b;
        this.b = as80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41357a;
        as80 as80Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = as80Var.N1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                fl70 fl70Var = as80.Y1;
                as80Var.H0().x(yq80.f43064a);
                return Unit.f46060a;
        }
    }
}
