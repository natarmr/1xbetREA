package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bm10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2819a;
    public final /* synthetic */ fm10 b;

    public /* synthetic */ bm10(fm10 fm10Var, byte b) {
        this.f2819a = b;
        this.b = fm10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f2819a;
        yje yjeVar = null;
        fm10 fm10Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = fm10.S1;
                i1w0 i1w0VarF = a4n0.f(fm10Var);
                nki nkiVar = fm10Var.L1;
                if (nkiVar != null) {
                    return new ry3(i1w0VarF, nkiVar);
                }
                Intrinsics.h("hotDiceModelFactory");
                throw null;
            case 1:
                iiy[] iiyVarArr2 = fm10.S1;
                return new dyb0(new pf10(1, fm10Var.H0(), bo10.class, "onPrizeClicked", "onPrizeClicked(Lorg/xplatform/lucky_wheel/presentation/game/prizes/PrizeListItem$Prize;)V", 0, (byte) 8));
            case 2:
                iiy[] iiyVarArr3 = fm10.S1;
                bo10 bo10VarH0 = fm10Var.H0();
                p7m0 p7m0Var = bo10VarH0.D;
                Boolean bool = Boolean.TRUE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                p7m0 p7m0Var2 = bo10VarH0.E;
                p7m0Var2.getClass();
                p7m0Var2.o(null, bool);
                x9v0 x9v0Var = bo10VarH0.H;
                if (x9v0Var != null) {
                    sac.V(jiu0.a(bo10VarH0), new pf10(1, bo10VarH0, bo10.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, bo10VarH0.d.b, new gd7(x9v0Var, bo10VarH0, yjeVar, (byte) 2), 10);
                }
                return Unit.f46060a;
            default:
                iiy[] iiyVarArr4 = fm10.S1;
                bo10 bo10VarH1 = fm10Var.H0();
                p7m0 p7m0Var3 = bo10VarH1.D;
                Boolean bool2 = Boolean.TRUE;
                p7m0Var3.getClass();
                p7m0Var3.o(null, bool2);
                p7m0 p7m0Var4 = bo10VarH1.E;
                p7m0Var4.getClass();
                p7m0Var4.o(null, bool2);
                sxk0 sxk0Var = bo10VarH1.I;
                if (sxk0Var != null) {
                    sac.V(jiu0.a(bo10VarH1), new pf10(1, bo10VarH1, bo10.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, bo10VarH1.d.b, new d21(sxk0Var, (diu0) bo10VarH1, yjeVar, (byte) 8), 10);
                }
                return Unit.f46060a;
        }
    }
}
