package a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes.dex */
public final class fg20 extends bnn0 implements zdr {
    public ozc i;
    public byte j;
    public /* synthetic */ StepInputUiModel k;
    public /* synthetic */ q4f l;
    public /* synthetic */ boolean m;
    public final /* synthetic */ qg20 n;
    public final /* synthetic */ mie0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg20(qg20 qg20Var, mie0 mie0Var, yje yjeVar) {
        super(5, yjeVar);
        this.n = qg20Var;
        this.o = mie0Var;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        fg20 fg20Var = new fg20(this.n, this.o, (yje) obj5);
        fg20Var.k = (StepInputUiModel) obj;
        fg20Var.l = (q4f) obj2;
        fg20Var.m = zBooleanValue;
        return fg20Var.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e7  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        StepInputUiModel stepInputUiModel;
        qg20 qg20Var;
        ozc ozcVar;
        boolean z;
        Object objK;
        boolean z2;
        StepInputUiModel stepInputUiModel2;
        ozc ozcVar2;
        qg20 qg20Var2;
        Object objW;
        txu txuVar;
        StepInputUiModel stepInputUiModel3;
        hxu hxuVar;
        StepInputUiModel stepInputUiModel4 = this.k;
        q4f q4fVar = this.l;
        boolean z3 = this.m;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        qg20 qg20Var3 = this.n;
        if (b != 0) {
            if (b == 1) {
                ozcVar = this.i;
                z1x.P(obj);
                objK = obj;
                stepInputUiModel = stepInputUiModel4;
                z = true;
                qg20Var = qg20Var3;
            } else {
                if (b != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ozc ozcVar3 = this.i;
                z1x.P(obj);
                z2 = z3;
                ozcVar2 = ozcVar3;
                stepInputUiModel2 = stepInputUiModel4;
                qg20Var2 = qg20Var3;
                objW = obj;
            }
            txuVar = (txu) objW;
            stepInputUiModel3 = stepInputUiModel2;
            hxuVar = hxu.h;
            qg20Var2.A(hxuVar, stepInputUiModel3, q4fVar, qg20Var2.K(qg20Var2.w.i()), ozcVar2, txuVar);
            if (txuVar.g.b > 0.0d) {
                qg20Var2.f0(stepInputUiModel3, txuVar, hxuVar, z2);
            } else {
                qg20Var2.N(z2);
            }
            return Unit.f46060a;
        }
        z1x.P(obj);
        stepInputUiModel = stepInputUiModel4;
        qg20Var = qg20Var3;
        qg20Var3.k0.e("SAVED_STATE_STEP_INPUT_KEY", StepInputUiModel.a(stepInputUiModel, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, true, false, false, 229375));
        bby bbyVar = qg20Var.L0;
        if (bbyVar != null) {
            bbyVar.cancel(new CancellationException("New config"));
        }
        bby bbyVar2 = qg20Var.O0;
        if (bbyVar2 != null) {
            bbyVar2.cancel(new CancellationException("New config"));
        }
        bby bbyVar3 = qg20Var.P0;
        if (bbyVar3 != null) {
            bbyVar3.cancel(null);
        }
        ozcVar = qg20Var.U.c().U;
        this.k = stepInputUiModel;
        this.l = q4fVar;
        this.i = ozcVar;
        this.m = z3;
        z = true;
        this.j = (byte) 1;
        objK = ntb.K(qg20Var.x.b(), this);
        if (objK == wneVar) {
            return wneVar;
        }
        if (((Boolean) objK).booleanValue() || !qg20Var.V(z3)) {
            boolean zD = Intrinsics.d(qg20Var.e0.b(), duw.d);
            boolean zT = qg20Var.T(stepInputUiModel);
            hnb0 hnb0Var = hnb0.f13344a;
            if (!zT || ((!qg20Var.V(z3) && zD) || !((Boolean) qg20Var.f1.getValue()).booleanValue())) {
                z2 = z3;
                stepInputUiModel2 = stepInputUiModel;
                ozcVar2 = ozcVar;
                if (qg20Var.T(stepInputUiModel2)) {
                    double d = stepInputUiModel2.f46474a;
                    hxu hxuVar2 = hxu.h;
                    this.k = stepInputUiModel2;
                    this.l = q4fVar;
                    this.i = ozcVar2;
                    this.m = z2;
                    this.j = (byte) 2;
                    qg20Var2 = qg20Var;
                    objW = qg20Var2.w(d, q4fVar, hxuVar2, this);
                    if (objW == wneVar) {
                        return wneVar;
                    }
                    txuVar = (txu) objW;
                    stepInputUiModel3 = stepInputUiModel2;
                    hxuVar = hxu.h;
                    qg20Var2.A(hxuVar, stepInputUiModel3, q4fVar, qg20Var2.K(qg20Var2.w.i()), ozcVar2, txuVar);
                    if (txuVar.g.b > 0.0d) {
                        qg20Var2.f0(stepInputUiModel3, txuVar, hxuVar, z2);
                    } else {
                        qg20Var2.N(z2);
                    }
                } else {
                    qg20 qg20Var4 = qg20Var;
                    qg20Var4.N(z2);
                    qg20Var4.e0(hnb0Var);
                }
            } else {
                nwo0 nwo0Var = qg20Var.T0;
                boolean z4 = nwo0Var.f24244a;
                mie0 mie0Var = this.o;
                if ((z4 || (nwo0Var.b && ((Boolean) qg20Var.g1.getValue()).booleanValue())) && q3d.j(q4f.f, q4f.g, q4f.j, q4f.k, q4f.h, q4f.m).contains(q4fVar)) {
                    qg20Var.g0(xvo0.f41571a);
                    qg20Var.e0(hnb0Var);
                } else {
                    if (mie0Var.f21842a == q4fVar) {
                        z = false;
                    }
                    qg20 qg20Var5 = qg20Var;
                    qg20Var5.L0 = sac.f0(jiu0.a(qg20Var), !z ? 500L : 0L, TimeUnit.MILLISECONDS, qg20Var.d.b, new yw10(1, qg20Var5, qg20.class, "handleLoadTaxContentThrowable", "handleLoadTaxContentThrowable(Ljava/lang/Throwable;)V", 0, (byte) 19), new nf20(qg20Var5, stepInputUiModel, q4fVar, ozcVar, z3, null), 32);
                }
                mie0Var.f21842a = q4fVar;
            }
        } else {
            qg20Var.g0(cwo0.f5091a);
            qg20Var.e0(qg20Var.z());
        }
        return Unit.f46060a;
    }
}
