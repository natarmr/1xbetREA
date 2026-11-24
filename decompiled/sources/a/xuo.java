package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class xuo extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ pmi j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuo(pmi pmiVar, long j, long j2, long j3, yje yjeVar) {
        super(2, yjeVar);
        this.j = pmiVar;
        this.k = j;
        this.l = j2;
        this.m = j3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new xuo(this.j, this.k, this.l, this.m, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xuo) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        double dDoubleValue;
        pmi pmiVar = this.j;
        j5t j5tVar = (j5t) pmiVar.e;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            svu svuVar = (svu) pmiVar.d;
            String strA = ((btt0) pmiVar.b).a();
            avo avoVar = new avo(this.k, this.l, this.m);
            this.i = true;
            obj = ((luz) ((tpv) svuVar.f32888a).invoke()).a(strA, avoVar, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        q300 q300Var = (q300) ((q16) obj).a();
        Double d = q300Var.f28026a;
        Double d2 = q300Var.c;
        Double d3 = q300Var.b;
        if (d == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue2 = d.doubleValue();
        if (d3 == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue3 = d3.doubleValue();
        if (d2 != null && d2.doubleValue() >= d.doubleValue()) {
            dDoubleValue = d2.doubleValue() > d3.doubleValue() ? d3.doubleValue() : d2.doubleValue();
        } else {
            dDoubleValue = d.doubleValue();
        }
        dqr dqrVar = new dqr(dDoubleValue2, dDoubleValue3, dDoubleValue);
        j5tVar.k = dqrVar;
        j5t.a(dqrVar, "gameBetLimits");
        j5tVar.getClass();
        j5tVar.l.put(Long.valueOf(this.k), dqrVar);
        return dqrVar;
    }
}
