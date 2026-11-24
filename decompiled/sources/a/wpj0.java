package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class wpj0 extends bnn0 implements ydr {
    public boolean i;
    public /* synthetic */ mv2 j;
    public /* synthetic */ no20 k;
    public /* synthetic */ ypj0 l;
    public final /* synthetic */ xpj0 m;
    public final /* synthetic */ float n;
    public final /* synthetic */ cfq o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpj0(xpj0 xpj0Var, float f, cfq cfqVar, yje yjeVar) {
        super(4, yjeVar);
        this.m = xpj0Var;
        this.n = f;
        this.o = cfqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        byte b = 1;
        if (!z) {
            z1x.P(obj);
            mv2 mv2Var = this.j;
            float fD = this.k.d(this.l);
            if (!Float.isNaN(fD)) {
                jie0 jie0Var = new jie0();
                xpj0 xpj0Var = this.m;
                float fL = Float.isNaN(((agk0) xpj0Var.e.l).l()) ? 0.0f : ((agk0) xpj0Var.e.l).l();
                jie0Var.f16571a = fL;
                su2 su2Var = new su2(mv2Var, jie0Var, b);
                this.j = null;
                this.k = null;
                this.i = true;
                if (hhm0.l(fL, fD, this.n, this.o, su2Var, this) == wneVar) {
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
        float f = this.n;
        cfq cfqVar = this.o;
        wpj0 wpj0Var = new wpj0(this.m, f, cfqVar, (yje) obj4);
        wpj0Var.j = (mv2) obj;
        wpj0Var.k = (no20) obj2;
        wpj0Var.l = (ypj0) obj3;
        return wpj0Var.invokeSuspend(Unit.f46060a);
    }
}
