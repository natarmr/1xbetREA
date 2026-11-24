package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q620 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28180a;
    public final /* synthetic */ a720 b;

    public /* synthetic */ q620(a720 a720Var, byte b) {
        this.f28180a = b;
        this.b = a720Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f28180a;
        yje yjeVar = null;
        a720 a720Var = this.b;
        switch (b) {
            case 0:
                xuz xuzVar = a720.x2;
                mn20 mn20VarY0 = a720Var.Y0();
                sac.V(jiu0.a(mn20VarY0), new r520((byte) 15), null, mn20VarY0.i.b, new il20(mn20VarY0, yjeVar, (byte) 3), 10);
                return Unit.f46060a;
            case 1:
                xki xkiVar = a720Var.g2;
                if (xkiVar != null) {
                    return xkiVar;
                }
                Intrinsics.h("makeBetViewModelFactory");
                throw null;
            case 2:
                fiu0 fiu0Var = a720Var.h2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 3:
                a720Var.y0();
                return Unit.f46060a;
            case 4:
                xuz xuzVar2 = a720.x2;
                mn20 mn20VarY1 = a720Var.Y0();
                if (!ua80.x((vwb0) mn20VarY1.D.f6390a.f13293a.b, "HELP_COUPON_SNACKBAR_SHOWN", false)) {
                    mn20VarY1.Q.f(Unit.f46060a);
                    ((vwb0) mn20VarY1.E.f38265a.f13293a.b).e("HELP_COUPON_SNACKBAR_SHOWN", true);
                }
                return Unit.f46060a;
            default:
                a720Var.y0();
                return Unit.f46060a;
        }
    }
}
