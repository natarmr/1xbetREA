package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class st9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32763a;
    public final /* synthetic */ ut9 b;

    public /* synthetic */ st9(ut9 ut9Var, byte b) {
        this.f32763a = b;
        this.b = ut9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32763a;
        ut9 ut9Var = this.b;
        switch (b) {
            case 0:
                bj5 bj5Var = ut9.s2;
                fiu0 fiu0Var = ut9Var.l2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                bj5 bj5Var2 = ut9.s2;
                return new tt9(ut9Var);
            case 2:
                bj5 bj5Var3 = ut9.s2;
                ut9Var.y0();
                return Unit.f46060a;
            case 3:
                bj5 bj5Var4 = ut9.s2;
                ut9Var.L0().L = true;
                ut9Var.P0().x(jt9.f17088a);
                return Unit.f46060a;
            default:
                vcc.f0(i120.U(), ut9Var, ut9Var.q2.n(ut9Var, ut9.t2[0]));
                ut9Var.y0();
                return Unit.f46060a;
        }
    }
}
