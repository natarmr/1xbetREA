package a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import org.xplatform.coupon.impl.make_bet.presentation.model.CoefStepInputUiModel;
import org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes.dex */
public final class f620 extends bnn0 implements aer {
    public /* synthetic */ Pair i;
    public /* synthetic */ boolean j;
    public /* synthetic */ q4f k;
    public /* synthetic */ boolean l;
    public final /* synthetic */ h620 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f620(h620 h620Var, yje yjeVar) {
        super(6, yjeVar);
        this.m = h620Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Pair pair = this.i;
        boolean z = this.j;
        q4f q4fVar = this.k;
        boolean z2 = this.l;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        CoefStepInputUiModel coefStepInputUiModel = (CoefStepInputUiModel) pair.f46059a;
        StepInputUiModel stepInputUiModel = (StepInputUiModel) pair.b;
        h620 h620Var = this.m;
        p7m0 p7m0Var = h620Var.k0;
        nwo0 nwo0Var = h620Var.e0;
        vzg0 vzg0Var = h620Var.G;
        vzg0Var.e("SAVED_STATE_COEF_KEY", CoefStepInputUiModel.a(coefStepInputUiModel, null, null, false, false, false, true, 255));
        vzg0Var.e("SAVED_STATE_BET_SUM_KEY", StepInputUiModel.a(stepInputUiModel, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, true, false, false, 229375));
        bby bbyVar = h620Var.X;
        if (bbyVar != null) {
            bbyVar.cancel(new CancellationException("New config"));
        }
        bby bbyVar2 = h620Var.Y;
        if (bbyVar2 != null) {
            bbyVar2.cancel(new CancellationException("New config"));
        }
        if (h620.C(stepInputUiModel, coefStepInputUiModel) && z && ((nwo0Var.f24244a || (nwo0Var.b && ((Boolean) p7m0Var.getValue()).booleanValue())) && z2)) {
            h620Var.X = sac.f0(jiu0.a(h620Var), 500L, TimeUnit.MILLISECONDS, h620Var.c.b, new p520(h620Var, (byte) 2), new c620(h620Var, stepInputUiModel, q4fVar, coefStepInputUiModel, null), 32);
            twn.A(((ovo0) h620Var.x.f27815a).f25934a, p7m0Var, null);
        } else if (h620.C(stepInputUiModel, coefStepInputUiModel)) {
            h620Var.x(stepInputUiModel, coefStepInputUiModel, hxu.h, q4fVar);
        } else {
            h620Var.E(nwo0Var.f24244a ? xvo0.f41571a : awo0.f1585a);
            h620Var.l0.n(hnb0.f13344a);
        }
        return Unit.f46060a;
    }

    @Override // a.aer
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        f620 f620Var = new f620(this.m, (yje) obj6);
        f620Var.i = (Pair) obj;
        f620Var.j = zBooleanValue;
        f620Var.k = (q4f) obj3;
        f620Var.l = zBooleanValue2;
        return f620Var.invokeSuspend(Unit.f46060a);
    }
}
