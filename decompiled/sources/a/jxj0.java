package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.make_bet.impl.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class jxj0 extends bnn0 implements Function2 {
    public duw i;
    public hru j;
    public qvo0 k;
    public double l;
    public double m;
    public double n;
    public long o;
    public int p;
    public byte q;
    public final /* synthetic */ xxj0 r;
    public final /* synthetic */ StepInputUiModel s;
    public final /* synthetic */ double t;
    public final /* synthetic */ double u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxj0(xxj0 xxj0Var, StepInputUiModel stepInputUiModel, double d, double d2, yje yjeVar) {
        super(2, yjeVar);
        this.r = xxj0Var;
        this.s = stepInputUiModel;
        this.t = d;
        this.u = d2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new jxj0(this.r, this.s, this.t, this.u, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jxj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x016e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0195  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e1  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        double d;
        Object objG;
        hru hruVar;
        double d2;
        duw duwVar;
        double d3;
        qvo0 qvo0Var;
        jxj0 jxj0Var;
        Object objX;
        long j;
        duw duwVar2;
        double d4;
        hru hruVar2;
        double d5;
        double d6;
        long j2;
        int iIntValue;
        Object objA;
        qvo0 qvo0Var2;
        double d7;
        int i;
        double d8;
        long j3;
        duw duwVar3;
        Object objC;
        duw duwVar4;
        hxu hxuVar;
        txu txuVarH0;
        StepInputUiModel stepInputUiModel;
        jxj0 jxj0Var2 = this;
        wne wneVar = wne.f39444a;
        byte b = jxj0Var2.q;
        StepInputUiModel stepInputUiModel2 = jxj0Var2.s;
        xxj0 xxj0Var = jxj0Var2.r;
        if (b == 0) {
            z1x.P(obj);
            bby bbyVar = xxj0Var.k0;
            if (bbyVar != null) {
                v3c.N(bbyVar);
            }
            xxj0Var.k0 = sac.f0(jiu0.a(xxj0Var), 500L, TimeUnit.MILLISECONDS, xxj0Var.d.f22085a, wxj0.f39935a, new qwj0(xxj0Var, null, (byte) 1), 32);
            duw duwVarB = xxj0Var.u.b();
            yk5 yk5Var = xxj0Var.v;
            double dW = xxj0Var.w(stepInputUiModel2.f46773a, jxj0Var2.t, jxj0Var2.u);
            int i2 = duwVarB.f6716a;
            double d9 = duwVarB.b;
            double d10 = duwVarB.c;
            yk5Var.getClass();
            double dI = yk5.i(dW, i2, d9, d10);
            hru hruVar3 = xxj0Var.x;
            d = stepInputUiModel2.f46773a * (stepInputUiModel2.q ? 2.0d : 1.0d);
            boolean z = ((StepInputUiModel) xxj0Var.C0.getValue()).q;
            double d11 = jxj0Var2.t;
            if (z) {
                d11 /= 2.0d;
            }
            khf0 khf0Var = xxj0Var.f;
            bm5 bm5Var = bm5.b;
            jxj0Var2.i = duwVarB;
            jxj0Var2.j = hruVar3;
            jxj0Var2.l = dI;
            jxj0Var2.m = d;
            jxj0Var2.n = d11;
            jxj0Var2.q = (byte) 1;
            objG = khf0.G(khf0Var, bm5Var, jxj0Var2);
            if (objG != wneVar) {
                hruVar = hruVar3;
                d2 = dI;
                duwVar = duwVarB;
                d3 = d11;
            }
            return wneVar;
        }
        if (b == 1) {
            d3 = jxj0Var2.n;
            double d12 = jxj0Var2.m;
            double d13 = jxj0Var2.l;
            hru hruVar4 = jxj0Var2.j;
            duw duwVar5 = jxj0Var2.i;
            z1x.P(obj);
            d2 = d13;
            duwVar = duwVar5;
            d = d12;
            hruVar = hruVar4;
            objG = obj;
        } else {
            if (b == 2) {
                long j4 = jxj0Var2.o;
                double d14 = jxj0Var2.n;
                double d15 = jxj0Var2.m;
                double d16 = jxj0Var2.l;
                qvo0 qvo0Var3 = jxj0Var2.k;
                hru hruVar5 = jxj0Var2.j;
                duw duwVar6 = jxj0Var2.i;
                z1x.P(obj);
                j = j4;
                objX = obj;
                hruVar2 = hruVar5;
                jxj0Var = jxj0Var2;
                duwVar2 = duwVar6;
                d4 = d16;
                d5 = d15;
                d6 = d14;
                qvo0Var = qvo0Var3;
                j2 = j;
                iIntValue = ((Number) objX).intValue();
                rou rouVar = xxj0Var.b0;
                jxj0Var.i = duwVar2;
                jxj0Var.j = hruVar2;
                jxj0Var.k = qvo0Var;
                jxj0Var.l = d4;
                jxj0Var.m = d5;
                jxj0Var.n = d6;
                jxj0Var.o = j2;
                jxj0Var.p = iIntValue;
                jxj0Var.q = (byte) 3;
                objA = rouVar.a(false, jxj0Var);
                if (objA != wneVar) {
                    qvo0Var2 = qvo0Var;
                    d7 = d6;
                    i = iIntValue;
                    d8 = d5;
                    j3 = j2;
                    duwVar3 = duwVar2;
                    int i3 = ((m2c0) objA).F;
                    jxj0Var.i = duwVar3;
                    jxj0Var.j = null;
                    jxj0Var.k = null;
                    jxj0Var.l = d4;
                    jxj0Var.q = (byte) 4;
                    jxj0Var2 = jxj0Var;
                    objC = hruVar2.c(d8, d7, i, i3, j3, jxj0Var2, qvo0Var2);
                    if (objC != wneVar) {
                        duwVar4 = duwVar3;
                    }
                }
                return wneVar;
            }
            if (b == 3) {
                int i4 = jxj0Var2.p;
                long j5 = jxj0Var2.o;
                double d17 = jxj0Var2.n;
                double d18 = jxj0Var2.m;
                d4 = jxj0Var2.l;
                qvo0 qvo0Var4 = jxj0Var2.k;
                hruVar2 = jxj0Var2.j;
                duw duwVar7 = jxj0Var2.i;
                z1x.P(obj);
                d8 = d18;
                j3 = j5;
                duwVar3 = duwVar7;
                d7 = d17;
                qvo0Var2 = qvo0Var4;
                i = i4;
                jxj0Var = jxj0Var2;
                objA = obj;
                int i5 = ((m2c0) objA).F;
                jxj0Var.i = duwVar3;
                jxj0Var.j = null;
                jxj0Var.k = null;
                jxj0Var.l = d4;
                jxj0Var.q = (byte) 4;
                jxj0Var2 = jxj0Var;
                objC = hruVar2.c(d8, d7, i, i5, j3, jxj0Var2, qvo0Var2);
                if (objC != wneVar) {
                    duwVar4 = duwVar3;
                }
                return wneVar;
            }
            if (b != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d19 = jxj0Var2.l;
            duwVar4 = jxj0Var2.i;
            z1x.P(obj);
            d4 = d19;
            stepInputUiModel2 = stepInputUiModel2;
            objC = obj;
        }
        hxuVar = (hxu) objC;
        txuVarH0 = ozb.h0(hxuVar, d4, duwVar4.f6716a);
        if (txuVarH0.g.b > 0.0d) {
            StepInputUiModel stepInputUiModel3 = stepInputUiModel2;
            xxj0Var.Q(new dwo0(xxj0.A(txuVarH0, stepInputUiModel3), rsm0.r(txuVarH0, stepInputUiModel3.f, xxj0Var.m)));
        } else {
            stepInputUiModel = stepInputUiModel2;
            if (txuVarH0.d.b <= 0.0d || txuVarH0.f34720a.b > 0.0d) {
                xxj0Var.Q(new dwo0(xxj0.A(txuVarH0, stepInputUiModel), rsm0.q(hxuVar, stepInputUiModel.f)));
            } else {
                xxj0Var.Q(xxj0Var.o0.f24244a ? wvo0.f39847a : zvo0.f45068a);
            }
        }
        xxj0Var.y(hxuVar, jxj0Var2.s, jxj0Var2.t, txuVarH0, jxj0Var2.u);
        return Unit.f46060a;
        long j6 = ((ql5) objG).e;
        qvo0Var = qvo0.b;
        pmi pmiVar = xxj0Var.R;
        jxj0Var = this;
        jxj0Var.i = duwVar;
        jxj0Var.j = hruVar;
        jxj0Var.k = qvo0Var;
        jxj0Var.l = d2;
        jxj0Var.m = d;
        jxj0Var.n = d3;
        jxj0Var.o = j6;
        double d20 = d3;
        jxj0Var.q = (byte) 2;
        objX = pmiVar.x(jxj0Var);
        if (objX != wneVar) {
            j = j6;
            duwVar2 = duwVar;
            d4 = d2;
            hruVar2 = hruVar;
            d5 = d;
            d6 = d20;
            j2 = j;
            iIntValue = ((Number) objX).intValue();
            rou rouVar2 = xxj0Var.b0;
            jxj0Var.i = duwVar2;
            jxj0Var.j = hruVar2;
            jxj0Var.k = qvo0Var;
            jxj0Var.l = d4;
            jxj0Var.m = d5;
            jxj0Var.n = d6;
            jxj0Var.o = j2;
            jxj0Var.p = iIntValue;
            jxj0Var.q = (byte) 3;
            objA = rouVar2.a(false, jxj0Var);
            if (objA != wneVar) {
                qvo0Var2 = qvo0Var;
                d7 = d6;
                i = iIntValue;
                d8 = d5;
                j3 = j2;
                duwVar3 = duwVar2;
                int i6 = ((m2c0) objA).F;
                jxj0Var.i = duwVar3;
                jxj0Var.j = null;
                jxj0Var.k = null;
                jxj0Var.l = d4;
                jxj0Var.q = (byte) 4;
                jxj0Var2 = jxj0Var;
                objC = hruVar2.c(d8, d7, i, i6, j3, jxj0Var2, qvo0Var2);
                if (objC != wneVar) {
                    duwVar4 = duwVar3;
                    hxuVar = (hxu) objC;
                    txuVarH0 = ozb.h0(hxuVar, d4, duwVar4.f6716a);
                    if (txuVarH0.g.b > 0.0d) {
                        StepInputUiModel stepInputUiModel4 = stepInputUiModel2;
                        xxj0Var.Q(new dwo0(xxj0.A(txuVarH0, stepInputUiModel4), rsm0.r(txuVarH0, stepInputUiModel4.f, xxj0Var.m)));
                    } else {
                        stepInputUiModel = stepInputUiModel2;
                        if (txuVarH0.d.b <= 0.0d) {
                            xxj0Var.Q(new dwo0(xxj0.A(txuVarH0, stepInputUiModel), rsm0.q(hxuVar, stepInputUiModel.f)));
                        } else {
                            xxj0Var.Q(new dwo0(xxj0.A(txuVarH0, stepInputUiModel), rsm0.q(hxuVar, stepInputUiModel.f)));
                        }
                    }
                    xxj0Var.y(hxuVar, jxj0Var2.s, jxj0Var2.t, txuVarH0, jxj0Var2.u);
                    return Unit.f46060a;
                }
            }
        }
        return wneVar;
    }
}
