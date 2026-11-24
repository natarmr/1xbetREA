package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lw4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20745a;
    public final /* synthetic */ rw4 b;

    public /* synthetic */ lw4(rw4 rw4Var, byte b) {
        this.f20745a = b;
        this.b = rw4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f20745a;
        rw4 rw4Var = this.b;
        switch (b) {
            case 0:
                gfk0 gfk0Var = rw4.W1;
                rw4Var.I0().G(false);
                return Unit.f46060a;
            case 1:
                cli cliVar = rw4Var.L1;
                if (cliVar != null) {
                    return cliVar;
                }
                Intrinsics.h("autoBetViewModelFactory");
                throw null;
            default:
                gfk0 gfk0Var2 = rw4.W1;
                rw4Var.I0().G(true);
                return Unit.f46060a;
        }
    }
}
