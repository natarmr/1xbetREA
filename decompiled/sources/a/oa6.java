package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class oa6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ hpa0 l;
    public final /* synthetic */ bxq0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa6(hpa0 hpa0Var, bxq0 bxq0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = hpa0Var;
        this.m = bxq0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                oa6 oa6Var = new oa6(this.l, this.m, yjeVar, (byte) 0);
                oa6Var.k = obj;
                return oa6Var;
            default:
                oa6 oa6Var2 = new oa6(this.l, this.m, yjeVar, (byte) 1);
                oa6Var2.k = obj;
                return oa6Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((oa6) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        bxq0 bxq0Var = this.m;
        hpa0 hpa0Var = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    na6 na6Var = new na6((vne) this.k, bxq0Var, null);
                    this.j = true;
                    if (ebc.Y(hpa0Var, na6Var, this) == wneVar) {
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
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    qa6 qa6Var = new qa6((vne) this.k, bxq0Var, null);
                    this.j = true;
                    if (((jnn0) hpa0Var).Z0(this, qa6Var) == wneVar2) {
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
