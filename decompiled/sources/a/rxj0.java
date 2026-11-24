package a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.xplatform.make_bet.impl.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class rxj0 extends bnn0 implements aer {
    public double i;
    public boolean j;
    public /* synthetic */ StepInputUiModel k;
    public /* synthetic */ double l;
    public /* synthetic */ cit0 m;
    public /* synthetic */ boolean n;
    public final /* synthetic */ xxj0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxj0(xxj0 xxj0Var, yje yjeVar) {
        super(6, yjeVar);
        this.o = xxj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x009c  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        double d;
        Object objK;
        double d2;
        nwo0 nwo0Var;
        xxj0 xxj0Var = this.o;
        p7m0 p7m0Var = xxj0Var.A0;
        nwo0 nwo0Var2 = xxj0Var.o0;
        StepInputUiModel stepInputUiModel = this.k;
        double d3 = this.l;
        cit0 cit0Var = this.m;
        boolean z = this.n;
        wne wneVar = wne.f39444a;
        boolean z2 = this.j;
        if (!z2) {
            z1x.P(obj);
            xxj0Var.M.e("SAVED_STATE_STEP_INPUT_KEY", StepInputUiModel.a(stepInputUiModel, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, true, false, false, 114687));
            bby bbyVar = xxj0Var.j0;
            if (bbyVar != null) {
                bbyVar.cancel(new CancellationException("New config"));
            }
            if (stepInputUiModel.q) {
                d = xxj0Var.K.g().e0;
                if (d == 0.0d) {
                    d = d3;
                }
            } else {
                d = d3;
            }
            gmq gmqVarB = xxj0Var.t.b();
            this.k = stepInputUiModel;
            this.m = cit0Var;
            this.l = d3;
            this.n = z;
            this.i = d;
            this.j = true;
            objK = ntb.K(gmqVarB, this);
            if (objK == wneVar) {
                return wneVar;
            }
            d2 = d;
        } else {
            if (!z2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d2 = this.i;
            z1x.P(obj);
            objK = obj;
        }
        boolean zBooleanValue = ((Boolean) objK).booleanValue();
        qnb0 qnb0VarZ = onb0.f25539a;
        if (!zBooleanValue) {
            nwo0Var = nwo0Var2;
            if (nwo0Var.f24244a) {
                xxj0Var.Q(bwo0.f3335a);
                xxj0Var.P(qnb0VarZ);
            }
            return Unit.f46060a;
        }
        nwo0Var = nwo0Var2;
        if (xxj0.G(stepInputUiModel) && ((nwo0Var.f24244a || (nwo0Var.b && ((Boolean) p7m0Var.getValue()).booleanValue())) && z)) {
            if (xxj0Var.B0.getValue() instanceof onb0) {
                boolean z3 = nwo0Var.f24244a;
                fl70 fl70Var = xxj0Var.P;
                double d4 = stepInputUiModel.f46773a;
                double d5 = stepInputUiModel.d;
                double dB = stepInputUiModel.b();
                boolean z4 = stepInputUiModel.g;
                boolean z5 = stepInputUiModel.n;
                double d6 = d2;
                double d7 = stepInputUiModel.b;
                fl70Var.getClass();
                d2 = d6;
                if (fl70.c(d6, d4, d5, dB, z4, z5, d7)) {
                    bst bstVar = xxj0Var.Q;
                    q4f q4fVar = q4f.c;
                    bstVar.getClass();
                    if (bst.g(q4fVar)) {
                        qnb0VarZ = xxj0Var.z(z3);
                    }
                }
                xxj0Var.P(qnb0VarZ);
            }
            xxj0Var.j0 = sac.f0(jiu0.a(xxj0Var), 500L, TimeUnit.MILLISECONDS, xxj0Var.d.b, new iwj0(xxj0Var, (byte) 1), new jxj0(xxj0Var, stepInputUiModel, d2, cit0Var.N, null), 32);
            twn.A(((ovo0) xxj0Var.y.f27815a).f25934a, p7m0Var, null);
        } else if (xxj0.G(stepInputUiModel)) {
            xxj0Var.y(hxu.h, stepInputUiModel, d2, null, cit0Var.N);
        } else {
            xxj0Var.Q(xxj0Var.o0.f24244a ? wvo0.f39847a : zvo0.f45068a);
            xxj0Var.P(qnb0VarZ);
        }
        return Unit.f46060a;
    }

    @Override // a.aer
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        double dDoubleValue = ((Number) obj2).doubleValue();
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        rxj0 rxj0Var = new rxj0(this.o, (yje) obj6);
        rxj0Var.k = (StepInputUiModel) obj;
        rxj0Var.l = dDoubleValue;
        rxj0Var.m = (cit0) obj3;
        rxj0Var.n = zBooleanValue;
        return rxj0Var.invokeSuspend(Unit.f46060a);
    }
}
