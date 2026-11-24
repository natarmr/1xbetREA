package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vi8 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37465a;
    public final /* synthetic */ wi8 b;

    public /* synthetic */ vi8(wi8 wi8Var, byte b) {
        this.f37465a = b;
        this.b = wi8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f37465a;
        wi8 wi8Var = this.b;
        switch (b) {
            case 0:
                int i = wi8.m2;
                ((k3t0) wi8Var.l2.getValue()).x(ti8.f33997a);
                return Unit.f46060a;
            default:
                int i2 = wi8.m2;
                fiu0 fiu0Var = wi8Var.k2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
