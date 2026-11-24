package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class tu2 extends bnn0 implements ydr {
    public boolean i;
    public /* synthetic */ mv2 j;
    public /* synthetic */ no20 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ qv2 m;
    public final /* synthetic */ float n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu2(qv2 qv2Var, float f, yje yjeVar) {
        super(4, yjeVar);
        this.m = qv2Var;
        this.n = f;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            mv2 mv2Var = this.j;
            float fD = this.k.d(this.l);
            if (!Float.isNaN(fD)) {
                jie0 jie0Var = new jie0();
                qv2 qv2Var = this.m;
                float fL = Float.isNaN(((agk0) qv2Var.l).l()) ? 0.0f : ((agk0) qv2Var.l).l();
                jie0Var.f16571a = fL;
                cfq cfqVar = ((xpj0) ((goi0) qv2Var.d).b).d;
                su2 su2Var = new su2(mv2Var, jie0Var, (byte) 0);
                this.j = null;
                this.k = null;
                this.i = true;
                if (hhm0.l(fL, fD, this.n, cfqVar, su2Var, this) == wneVar) {
                    return wneVar;
                }
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        tu2 tu2Var = new tu2(this.m, this.n, (yje) obj4);
        tu2Var.j = (mv2) obj;
        tu2Var.k = (no20) obj2;
        tu2Var.l = obj3;
        return tu2Var.invokeSuspend(Unit.f46060a);
    }
}
