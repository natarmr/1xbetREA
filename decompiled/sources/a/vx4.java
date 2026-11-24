package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.make_bet.impl.presentation.model.CoefStepInputUiModel;
import org.xplatform.make_bet.impl.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class vx4 extends bnn0 implements Function2 {
    public final /* synthetic */ fy4 i;
    public final /* synthetic */ hxu j;
    public final /* synthetic */ StepInputUiModel k;
    public final /* synthetic */ CoefStepInputUiModel l;
    public final /* synthetic */ double m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx4(fy4 fy4Var, hxu hxuVar, StepInputUiModel stepInputUiModel, CoefStepInputUiModel coefStepInputUiModel, double d, yje yjeVar) {
        super(2, yjeVar);
        this.i = fy4Var;
        this.j = hxuVar;
        this.k = stepInputUiModel;
        this.l = coefStepInputUiModel;
        this.m = d;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new vx4(this.i, this.j, this.k, this.l, this.m, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vx4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        double dDoubleValue = this.l.f46771a.doubleValue();
        double d = this.m;
        StepInputUiModel stepInputUiModel = this.k;
        double d2 = stepInputUiModel.f46773a;
        fy4 fy4Var = this.i;
        pnb0 pnb0Var = new pnb0(ydx.D(fy4Var.x(d2, dDoubleValue, d), stepInputUiModel.f, this.j, null, fy4Var.l, fy4Var.W.f24244a, false));
        p7m0 p7m0Var = fy4Var.h0;
        p7m0Var.getClass();
        p7m0Var.o(null, pnb0Var);
        return Unit.f46060a;
    }
}
