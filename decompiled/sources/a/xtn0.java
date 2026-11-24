package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.swipex.impl.presentation.dialogs.change_bet_sum.SwipexChangeBetValueViewModel$BetValue;
import org.xplatform.swipex.impl.presentation.dialogs.change_bet_sum.SwipexChangeBetValueViewModel$UiState;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xtn0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41472a;
    public final /* synthetic */ bun0 b;

    public /* synthetic */ xtn0(bun0 bun0Var, byte b) {
        this.f41472a = b;
        this.b = bun0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41472a;
        yje yjeVar = null;
        bun0 bun0Var = this.b;
        switch (b) {
            case 0:
                tvi tviVar = bun0Var.d2;
                if (tviVar != null) {
                    return tviVar;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                s2m0 s2m0Var = bun0.g2;
                pun0 pun0VarR0 = bun0Var.R0();
                pun0VarR0.r.c("swipex");
                pun0VarR0.q.i("swipex");
                sac.V(jiu0.a(pun0VarR0), new ndn0(1, pun0VarR0.e, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, pun0VarR0.d.f22085a, new oun0(pun0VarR0, yjeVar, (byte) 2), 10);
                return Unit.f46060a;
            case 2:
                s2m0 s2m0Var2 = bun0.g2;
                pun0 pun0VarR1 = bun0Var.R0();
                pun0VarR1.i.e("SUM_STEPPER_FIRST_FOCUS_KEY", Boolean.FALSE);
                pun0VarR1.l.E();
                sac.V(jiu0.a(pun0VarR1), new dun0(pun0VarR1, (byte) 0), null, pun0VarR1.d.f22085a, new wk20(true, pun0VarR1, (yje) null), 10);
                return Unit.f46060a;
            case 3:
                s2m0 s2m0Var3 = bun0.g2;
                pun0 pun0VarR2 = bun0Var.R0();
                sac.V(jiu0.a(pun0VarR2), new dun0(pun0VarR2, (byte) 1), null, pun0VarR2.d.f22085a, new agn0((Object) pun0VarR2, yjeVar, (byte) 17), 10);
                return Unit.f46060a;
            case 4:
                s2m0 s2m0Var4 = bun0.g2;
                pun0 pun0VarR3 = bun0Var.R0();
                xae0 xae0Var = pun0VarR3.v;
                double d = ((SwipexChangeBetValueViewModel$UiState) xae0Var.f40549a.getValue()).f;
                n7m0 n7m0Var = xae0Var.f40549a;
                double d2 = ((SwipexChangeBetValueViewModel$UiState) n7m0Var.getValue()).b.b;
                if (d2 > d) {
                    double d3 = d2 - ((SwipexChangeBetValueViewModel$UiState) n7m0Var.getValue()).e;
                    if (d3 > d) {
                        d = d3;
                    }
                    pun0VarR3.w(new SwipexChangeBetValueViewModel$BetValue(String.valueOf(d)), false);
                }
                return Unit.f46060a;
            default:
                s2m0 s2m0Var5 = bun0.g2;
                pun0 pun0VarR4 = bun0Var.R0();
                xae0 xae0Var2 = pun0VarR4.v;
                double d4 = ((SwipexChangeBetValueViewModel$UiState) xae0Var2.f40549a.getValue()).b.b;
                n7m0 n7m0Var2 = xae0Var2.f40549a;
                double dMin = ((SwipexChangeBetValueViewModel$UiState) n7m0Var2.getValue()).l ? ((SwipexChangeBetValueViewModel$UiState) n7m0Var2.getValue()).d : ((SwipexChangeBetValueViewModel$UiState) n7m0Var2.getValue()).d + ((SwipexChangeBetValueViewModel$UiState) n7m0Var2.getValue()).e;
                if (d4 != 0.0d) {
                    dMin = Math.min(d4 + ((SwipexChangeBetValueViewModel$UiState) n7m0Var2.getValue()).e, 9.99999999999999E12d);
                }
                pun0VarR4.w(new SwipexChangeBetValueViewModel$BetValue(String.valueOf(dMin)), false);
                return Unit.f46060a;
        }
    }
}
