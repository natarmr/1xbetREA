package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uq9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36108a;
    public final /* synthetic */ wq9 b;

    public /* synthetic */ uq9(wq9 wq9Var, byte b) {
        this.f36108a = b;
        this.b = wq9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f36108a;
        wq9 wq9Var = this.b;
        switch (b) {
            case 0:
                abi abiVar = wq9Var.L1;
                if (abiVar != null) {
                    return new q0h0(abiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                gl5 gl5Var = wq9.S1;
                wq9Var.G0().x(fq9.f9962a);
                return Unit.f46060a;
            case 2:
                gl5 gl5Var2 = wq9.S1;
                wq9Var.G0().x(eq9.f8226a);
                return Unit.f46060a;
            case 3:
                gl5 gl5Var3 = wq9.S1;
                wq9Var.G0().x(gq9.f11721a);
                return Unit.f46060a;
            default:
                gl5 gl5Var4 = wq9.S1;
                wq9Var.G0().x(hq9.f13473a);
                return Unit.f46060a;
        }
    }
}
