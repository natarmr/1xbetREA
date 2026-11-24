package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class mu6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ou6 l;
    public final /* synthetic */ pu6 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mu6(ou6 ou6Var, pu6 pu6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = ou6Var;
        this.m = pu6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pu6 pu6Var = this.m;
        ou6 ou6Var = this.l;
        switch (b) {
            case 0:
                mu6 mu6Var = new mu6(ou6Var, pu6Var, yjeVar, (byte) 0);
                mu6Var.k = obj;
                return mu6Var;
            default:
                mu6 mu6Var2 = new mu6(ou6Var, pu6Var, yjeVar, (byte) 1);
                mu6Var2.k = obj;
                return mu6Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        qpg0 qpg0Var = (qpg0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((mu6) create(qpg0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pu6 pu6Var = this.m;
        ou6 ou6Var = this.l;
        switch (b) {
            case 0:
                qpg0 qpg0Var = (qpg0) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    sj3 sj3Var = ou6Var.c;
                    this.k = null;
                    this.j = true;
                    obj = sj3Var.m0(qpg0Var, pu6Var, this);
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
                return new Long(((Number) obj).longValue());
            default:
                qpg0 qpg0Var2 = (qpg0) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    fu6 fu6Var = ou6Var.d;
                    this.k = null;
                    this.j = true;
                    if (fu6Var.Q(qpg0Var2, pu6Var) == wneVar2) {
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
        }
    }
}
