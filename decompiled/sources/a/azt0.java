package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class azt0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1738a;
    public final /* synthetic */ czt0 b;

    public /* synthetic */ azt0(czt0 czt0Var, byte b) {
        this.f1738a = b;
        this.b = czt0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1738a;
        czt0 czt0Var = this.b;
        switch (b) {
            case 0:
                ryi ryiVar = czt0Var.K1;
                if (ryiVar != null) {
                    return new q0h0(ryiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                wxs0 wxs0Var = czt0.U1;
                ((uzg) ((tzt0) czt0Var.O1.getValue()).d).a();
                return Unit.f46060a;
        }
    }
}
