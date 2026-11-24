package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hyp0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13869a;
    public final /* synthetic */ kyp0 b;

    public /* synthetic */ hyp0(kyp0 kyp0Var, byte b) {
        this.f13869a = b;
        this.b = kyp0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13869a;
        kyp0 kyp0Var = this.b;
        switch (b) {
            case 0:
                vwi vwiVar = kyp0Var.K1;
                if (vwiVar != null) {
                    return new q0h0(vwiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                y2m0 y2m0Var = kyp0.Q1;
                kyp0Var.G0().x(byp0.f3430a);
                return Unit.f46060a;
        }
    }
}
