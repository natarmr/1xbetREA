package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pcq0 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ qcq0 j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ short l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public pcq0(qcq0 qcq0Var, Function1 function1, long j, yje yjeVar) {
        super(2, yjeVar);
        this.j = qcq0Var;
        this.k = function1;
        this.l = (int) j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new pcq0(this.j, this.k, this.l, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pcq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        yje yjeVar = null;
        if (z) {
            if (z) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        qcq0 qcq0Var = this.j;
        kzj kzjVarM = qjj.M(qcq0Var.b, qcq0Var.f, new a2f(this.k, yjeVar, (byte) 8), 2);
        long j = this.l;
        z2n0 z2n0Var = new z2n0(kzjVarM, yjeVar, (byte) 15);
        this.i = true;
        Object objU = msm0.u(j, z2n0Var, this);
        return objU == wneVar ? wneVar : objU;
    }
}
