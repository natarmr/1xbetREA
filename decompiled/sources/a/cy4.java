package a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.xplatform.make_bet.impl.presentation.model.CoefStepInputUiModel;
import org.xplatform.make_bet.impl.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class cy4 extends bnn0 implements zdr {
    public boolean i;
    public /* synthetic */ CoefStepInputUiModel j;
    public /* synthetic */ StepInputUiModel k;
    public /* synthetic */ cit0 l;
    public /* synthetic */ boolean m;
    public final /* synthetic */ fy4 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy4(fy4 fy4Var, yje yjeVar) {
        super(5, yjeVar);
        this.n = fy4Var;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        cy4 cy4Var = new cy4(this.n, (yje) obj5);
        cy4Var.j = (CoefStepInputUiModel) obj;
        cy4Var.k = (StepInputUiModel) obj2;
        cy4Var.l = (cit0) obj3;
        cy4Var.m = zBooleanValue;
        return cy4Var.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean z;
        byte b;
        StepInputUiModel stepInputUiModel;
        Object objK;
        fy4 fy4Var = this.n;
        p7m0 p7m0Var = fy4Var.g0;
        p7m0 p7m0Var2 = fy4Var.h0;
        nwo0 nwo0Var = fy4Var.W;
        vzg0 vzg0Var = fy4Var.z;
        CoefStepInputUiModel coefStepInputUiModel = this.j;
        StepInputUiModel stepInputUiModel2 = this.k;
        cit0 cit0Var = this.l;
        boolean z2 = this.m;
        wne wneVar = wne.f39444a;
        boolean z3 = this.i;
        if (!z3) {
            z1x.P(obj);
            z = z2;
            b = 1;
            vzg0Var.e("SAVED_STATE_COEF_KEY", CoefStepInputUiModel.a(coefStepInputUiModel, null, null, false, false, false, true, 255));
            stepInputUiModel = stepInputUiModel2;
            vzg0Var.e("SAVED_STATE_BET_SUM_KEY", StepInputUiModel.a(stepInputUiModel, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, true, false, false, 114687));
            bby bbyVar = fy4Var.S;
            if (bbyVar != null) {
                bbyVar.cancel(new CancellationException("New config"));
            }
            gmq gmqVarB = fy4Var.r.b();
            this.j = coefStepInputUiModel;
            this.k = stepInputUiModel;
            this.l = cit0Var;
            this.m = z;
            this.i = true;
            objK = ntb.K(gmqVarB, this);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (!z3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            stepInputUiModel = stepInputUiModel2;
            z = z2;
            objK = obj;
            b = 1;
        }
        if (!((Boolean) objK).booleanValue() && nwo0Var.f24244a) {
            fy4Var.H(bwo0.f3335a);
            qnb0 qnb0VarY = fy4Var.y();
            p7m0Var2.getClass();
            p7m0Var2.o(null, qnb0VarY);
        } else if (fy4.B(stepInputUiModel, coefStepInputUiModel) && ((nwo0Var.f24244a || (nwo0Var.b && ((Boolean) p7m0Var.getValue()).booleanValue())) && z)) {
            fy4Var.S = sac.f0(jiu0.a(fy4Var), 500L, TimeUnit.MILLISECONDS, fy4Var.g.b, new sx4(fy4Var, (byte) 2), new ay4(fy4Var, coefStepInputUiModel, stepInputUiModel, cit0Var.N, null), 32);
            twn.A(((ovo0) fy4Var.x.f27815a).f25934a, p7m0Var, null);
        } else if (fy4.B(stepInputUiModel, coefStepInputUiModel)) {
            sac.V(jiu0.a(fy4Var), new sx4(fy4Var, b), null, fy4Var.g.b, new vx4(fy4Var, hxu.h, stepInputUiModel, coefStepInputUiModel, cit0Var.N, null), 10);
        } else {
            fy4Var.H(fy4Var.W.f24244a ? wvo0.f39847a : zvo0.f45068a);
            p7m0Var2.getClass();
            p7m0Var2.o(null, onb0.f25539a);
        }
        return Unit.f46060a;
    }
}
