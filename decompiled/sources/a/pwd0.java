package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pwd0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27706a;
    public final /* synthetic */ rwd0 b;

    public /* synthetic */ pwd0(rwd0 rwd0Var, byte b) {
        this.f27706a = b;
        this.b = rwd0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f27706a;
        rwd0 rwd0Var = this.b;
        switch (b) {
            case 0:
                zqi zqiVar = rwd0Var.K1;
                if (zqiVar != null) {
                    return new q0h0(zqiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                rl70 rl70Var = rwd0.U1;
                ((uzg) ((hxd0) rwd0Var.O1.getValue()).d).a();
                return Unit.f46060a;
        }
    }
}
