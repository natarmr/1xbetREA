package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bk7 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2736a;
    public final /* synthetic */ gk7 b;

    public /* synthetic */ bk7(gk7 gk7Var, byte b) {
        this.f2736a = b;
        this.b = gk7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f2736a;
        gk7 gk7Var = this.b;
        switch (b) {
            case 0:
                kl5 kl5Var = gk7.U1;
                fiu0 fiu0Var = gk7Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                kl5 kl5Var2 = gk7.U1;
                gk7Var.I0().x(hi7.f13100a);
                return Unit.f46060a;
            case 2:
                kl5 kl5Var3 = gk7.U1;
                gk7Var.I0().x(ni7.f23569a);
                return Unit.f46060a;
            case 3:
                kl5 kl5Var4 = gk7.U1;
                gk7Var.I0().x(bj7.f2691a);
                ywq ywqVar = gk7Var.S1;
                Unit unit = Unit.f46060a;
                ywqVar.a(unit);
                return unit;
            default:
                kl5 kl5Var5 = gk7.U1;
                gk7Var.I0().x(aj7.f960a);
                return Unit.f46060a;
        }
    }
}
