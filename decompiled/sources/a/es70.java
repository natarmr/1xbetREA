package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class es70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8316a;
    public final /* synthetic */ gs70 b;

    public /* synthetic */ es70(gs70 gs70Var, byte b) {
        this.f8316a = b;
        this.b = gs70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f8316a;
        gs70 gs70Var = this.b;
        switch (b) {
            case 0:
                nh70 nh70Var = gs70.r2;
                fiu0 fiu0Var = gs70Var.l2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                nh70 nh70Var2 = gs70.r2;
                return new fs70(gs70Var);
            case 2:
                nh70 nh70Var3 = gs70.r2;
                gs70Var.y0();
                return Unit.f46060a;
            case 3:
                nh70 nh70Var4 = gs70.r2;
                gs70Var.L0().L = true;
                gs70Var.P0().x(vr70.f37885a);
                return Unit.f46060a;
            default:
                nh70 nh70Var5 = gs70.r2;
                gs70Var.y0();
                return Unit.f46060a;
        }
    }
}
