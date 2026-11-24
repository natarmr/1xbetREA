package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dau0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5769a;
    public final /* synthetic */ gau0 b;

    public /* synthetic */ dau0(gau0 gau0Var, byte b) {
        this.f5769a = b;
        this.b = gau0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5769a;
        gau0 gau0Var = this.b;
        switch (b) {
            case 0:
                kys0 kys0Var = gau0.P1;
                gau0Var.G0().x(t9u0.f33586a);
                return Unit.f46060a;
            case 1:
                kys0 kys0Var2 = gau0.P1;
                gau0Var.G0().x(s9u0.f31865a);
                return Unit.f46060a;
            default:
                zyi zyiVar = gau0Var.L1;
                if (zyiVar != null) {
                    return new q0h0(zyiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
