package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ho0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ qo0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ho0(qo0 qo0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = qo0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qo0 qo0Var = this.k;
        switch (b) {
            case 0:
                return new ho0(qo0Var, yjeVar, (byte) 0);
            case 1:
                return new ho0(qo0Var, yjeVar, (byte) 1);
            default:
                return new ho0(qo0Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((ho0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        qo0 qo0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kb0 kb0Var = qo0Var.y;
                    cb0 cb0Var = new cb0(qo0Var.o, "favor_aggregator");
                    this.j = true;
                    kb0Var.getClass();
                    if (kb0Var.o(cb0Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    kb0 kb0Var2 = qo0Var.y;
                    db0 db0Var = new db0(qo0Var.o, k7k.AggregatorFavorites, qo0Var.J.g());
                    this.j = true;
                    kb0Var2.getClass();
                    if (kb0Var2.o(db0Var, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    kd30 kd30Var = qo0Var.H;
                    this.j = true;
                    if (kd30Var.N() == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
