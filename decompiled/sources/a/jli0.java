package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jli0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16720a;
    public final /* synthetic */ lli0 b;

    public /* synthetic */ jli0(lli0 lli0Var, byte b) {
        this.f16720a = b;
        this.b = lli0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f16720a;
        lli0 lli0Var = this.b;
        switch (b) {
            case 0:
                oti otiVar = lli0Var.K1;
                if (otiVar != null) {
                    return new q0h0(otiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                cge0 cge0Var = lli0.P1;
                lli0Var.G0().x(cli0.f4562a);
                return Unit.f46060a;
            case 2:
                cge0 cge0Var2 = lli0.P1;
                lli0Var.G0().x(dli0.f6283a);
                return Unit.f46060a;
            default:
                cge0 cge0Var3 = lli0.P1;
                lli0Var.G0().x(bli0.f2797a);
                return Unit.f46060a;
        }
    }
}
