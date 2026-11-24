package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes.dex */
public final class nf20 extends bnn0 implements Function2 {
    public Object i;
    public q4f j;
    public double k;
    public byte l;
    public final /* synthetic */ qg20 m;
    public final /* synthetic */ StepInputUiModel n;
    public final /* synthetic */ q4f o;
    public final /* synthetic */ ozc p;
    public final /* synthetic */ boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf20(qg20 qg20Var, StepInputUiModel stepInputUiModel, q4f q4fVar, ozc ozcVar, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.m = qg20Var;
        this.n = stepInputUiModel;
        this.o = q4fVar;
        this.p = ozcVar;
        this.q = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new nf20(this.m, this.n, this.o, this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nf20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b1  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        kxu kxuVar;
        double d;
        q4f q4fVar;
        Object objG;
        Object objA;
        hxu hxuVar;
        StepInputUiModel stepInputUiModel;
        Object objW;
        hxu hxuVar2;
        boolean z;
        nf20 nf20Var = this;
        wne wneVar = wne.f39444a;
        byte b = nf20Var.l;
        StepInputUiModel stepInputUiModel2 = nf20Var.n;
        boolean z2 = true;
        qg20 qg20Var = nf20Var.m;
        if (b == 0) {
            z1x.P(obj);
            bby bbyVar = qg20Var.P0;
            if (bbyVar != null) {
                v3c.N(bbyVar);
            }
            qg20Var.P0 = sac.f0(jiu0.a(qg20Var), 500L, TimeUnit.MILLISECONDS, qg20Var.d.f22085a, ig20.f14716a, new re20(qg20Var, null, (byte) 1), 32);
            kxuVar = qg20Var.A;
            d = stepInputUiModel2.f46474a;
            nf20Var.i = kxuVar;
            q4fVar = nf20Var.o;
            nf20Var.j = q4fVar;
            nf20Var.k = d;
            nf20Var.l = (byte) 1;
            objG = qg20Var.G(nf20Var);
            if (objG != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            d = nf20Var.k;
            q4fVar = nf20Var.j;
            kxuVar = (kxu) nf20Var.i;
            z1x.P(obj);
            objG = obj;
        } else {
            if (b == 2) {
                z1x.P(obj);
                objA = obj;
                hxuVar = (hxu) objA;
                stepInputUiModel = stepInputUiModel2;
                double d2 = stepInputUiModel.f46474a;
                nf20Var.i = hxuVar;
                nf20Var.l = (byte) 3;
                objW = qg20Var.w(d2, nf20Var.o, hxuVar, nf20Var);
                if (objW != wneVar) {
                    hxuVar2 = hxuVar;
                }
                return wneVar;
            }
            if (b != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hxu hxuVar3 = (hxu) nf20Var.i;
            z1x.P(obj);
            objW = obj;
            hxuVar2 = hxuVar3;
            stepInputUiModel = stepInputUiModel2;
        }
        txu txuVar = (txu) objW;
        z = ((ovo0) qg20Var.a0.f27815a).f25934a;
        boolean zD = Intrinsics.d(qg20Var.e0.b(), duw.d);
        if (!z && zD) {
            z2 = false;
        }
        twn.A(z2, qg20Var.f1, null);
        p7m0 p7m0Var = qg20Var.g1;
        Boolean bool = Boolean.TRUE;
        p7m0Var.getClass();
        p7m0Var.o(null, bool);
        if (!Intrinsics.d(hxuVar2, hxu.h) && !z2) {
            ol60 ol60Var = qg20Var.c1;
            Unit unit = Unit.f46060a;
            ol60Var.f(unit);
            return unit;
        }
        qg20Var.f0(stepInputUiModel, txuVar, hxuVar2, nf20Var.q);
        qg20Var.A(hxuVar2, nf20Var.n, nf20Var.o, qg20Var.K(qg20Var.w.i()), nf20Var.p, txuVar);
        return Unit.f46060a;
        double d3 = d;
        q4f q4fVar2 = q4fVar;
        kxu kxuVar2 = kxuVar;
        long j = ((ql5) objG).e;
        nf20Var.i = null;
        nf20Var.j = null;
        nf20Var.l = (byte) 2;
        objA = kxuVar2.a(d3, q4fVar2, j, null, nf20Var.p, nf20Var);
        nf20Var = nf20Var;
        if (objA != wneVar) {
            hxuVar = (hxu) objA;
            stepInputUiModel = stepInputUiModel2;
            double d4 = stepInputUiModel.f46474a;
            nf20Var.i = hxuVar;
            nf20Var.l = (byte) 3;
            objW = qg20Var.w(d4, nf20Var.o, hxuVar, nf20Var);
            if (objW != wneVar) {
                hxuVar2 = hxuVar;
                txu txuVar2 = (txu) objW;
                z = ((ovo0) qg20Var.a0.f27815a).f25934a;
                boolean zD2 = Intrinsics.d(qg20Var.e0.b(), duw.d);
                if (!z) {
                    z2 = false;
                }
                twn.A(z2, qg20Var.f1, null);
                p7m0 p7m0Var2 = qg20Var.g1;
                Boolean bool2 = Boolean.TRUE;
                p7m0Var2.getClass();
                p7m0Var2.o(null, bool2);
                if (!Intrinsics.d(hxuVar2, hxu.h)) {
                }
                qg20Var.f0(stepInputUiModel, txuVar2, hxuVar2, nf20Var.q);
                qg20Var.A(hxuVar2, nf20Var.n, nf20Var.o, qg20Var.K(qg20Var.w.i()), nf20Var.p, txuVar2);
                return Unit.f46060a;
            }
        }
        return wneVar;
    }
}
