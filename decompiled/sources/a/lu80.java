package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lu80 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20662a;
    public final /* synthetic */ ou80 b;

    public /* synthetic */ lu80(ou80 ou80Var, byte b) {
        this.f20662a = b;
        this.b = ou80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f20662a;
        ou80 ou80Var = this.b;
        switch (b) {
            case 0:
                rl70 rl70Var = ou80.V1;
                fiu0 fiu0Var = ou80Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                rl70 rl70Var2 = ou80.V1;
                ou80Var.G0().x(rt80.f31066a);
                return Unit.f46060a;
        }
    }
}
