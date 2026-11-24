package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vq6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37841a;
    public final /* synthetic */ yq6 b;

    public /* synthetic */ vq6(yq6 yq6Var, byte b) {
        this.f37841a = b;
        this.b = yq6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f37841a;
        yq6 yq6Var = this.b;
        switch (b) {
            case 0:
                gl5 gl5Var = yq6.R1;
                fiu0 fiu0Var = yq6Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                gl5 gl5Var2 = yq6.R1;
                yq6Var.G0().x(lq6.f20471a);
                return Unit.f46060a;
            default:
                gl5 gl5Var3 = yq6.R1;
                yq6Var.G0().x(mq6.f22207a);
                return Unit.f46060a;
        }
    }
}
