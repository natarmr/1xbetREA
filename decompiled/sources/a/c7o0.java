package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c7o0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3875a;
    public final /* synthetic */ d7o0 b;

    public /* synthetic */ c7o0(d7o0 d7o0Var, byte b) {
        this.f3875a = b;
        this.b = d7o0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3875a;
        d7o0 d7o0Var = this.b;
        switch (b) {
            case 0:
                zvi zviVar = d7o0Var.M1;
                if (zviVar != null) {
                    return new q0h0(zviVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                s9m0 s9m0Var = d7o0.R1;
                d7o0Var.G0().x(r6o0.f29943a);
                return Unit.f46060a;
            default:
                s9m0 s9m0Var2 = d7o0.R1;
                d7o0Var.G0().x(q6o0.f28209a);
                return Unit.f46060a;
        }
    }
}
