package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kld0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18480a;
    public final /* synthetic */ nld0 b;

    public /* synthetic */ kld0(nld0 nld0Var, byte b) {
        this.f18480a = b;
        this.b = nld0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f18480a;
        nld0 nld0Var = this.b;
        switch (b) {
            case 0:
                mi70 mi70Var = nld0.S1;
                i1w0 i1w0VarF = a4n0.f(nld0Var);
                uqi uqiVar = nld0Var.L1;
                if (uqiVar != null) {
                    return new ry3(i1w0VarF, uqiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                mi70 mi70Var2 = nld0.S1;
                return new jev0(new yn90(2, nld0Var.H0(), sld0.class, "onMovedItem", "onMovedItem(II)V", 0, (byte) 24), new b0c0(0, nld0Var.H0(), sld0.class, "onUpdatedPositionsFinished", "onUpdatedPositionsFinished()V", 0, (byte) 16));
            case 2:
                mi70 mi70Var3 = nld0.S1;
                nld0Var.H0().w();
                return Unit.f46060a;
            default:
                mi70 mi70Var4 = nld0.S1;
                nld0Var.H0().w();
                return Unit.f46060a;
        }
    }
}
