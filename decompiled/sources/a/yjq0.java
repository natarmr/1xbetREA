package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yjq0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42753a;
    public final /* synthetic */ akq0 b;

    public /* synthetic */ yjq0(akq0 akq0Var, byte b) {
        this.f42753a = b;
        this.b = akq0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f42753a;
        akq0 akq0Var = this.b;
        switch (b) {
            case 0:
                hxi hxiVar = akq0Var.K1;
                if (hxiVar != null) {
                    return new q0h0(hxiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                s9m0 s9m0Var = akq0.P1;
                akq0Var.G0().x(rjq0.f30608a);
                return Unit.f46060a;
            case 2:
                s9m0 s9m0Var2 = akq0.P1;
                akq0Var.G0().x(sjq0.f32314a);
                return Unit.f46060a;
            default:
                s9m0 s9m0Var3 = akq0.P1;
                akq0Var.G0().x(qjq0.f28852a);
                return Unit.f46060a;
        }
    }
}
