package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rck0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30244a;
    public final /* synthetic */ tck0 b;

    public /* synthetic */ rck0(tck0 tck0Var, byte b) {
        this.f30244a = b;
        this.b = tck0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30244a;
        tck0 tck0Var = this.b;
        switch (b) {
            case 0:
                bui buiVar = tck0Var.k2;
                if (buiVar != null) {
                    return new q0h0(buiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                eke0 eke0Var = tck0.t2;
                tck0Var.P0().x(kck0.f18064a);
                return Unit.f46060a;
        }
    }
}
