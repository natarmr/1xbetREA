package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class nwe0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ l7m0 k;
    public final /* synthetic */ cqq l;
    public final /* synthetic */ wpq m;
    public final /* synthetic */ pkk0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nwe0(l7m0 l7m0Var, cqq cqqVar, wpq wpqVar, pkk0 pkk0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = l7m0Var;
        this.l = cqqVar;
        this.m = wpqVar;
        this.n = pkk0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new nwe0(this.k, this.l, this.m, this.n, yjeVar, (byte) 0);
            case 1:
                return new nwe0(this.k, this.l, this.m, this.n, yjeVar, (byte) 1);
            default:
                return new nwe0(this.k, this.l, this.m, this.n, yjeVar, (byte) 2);
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
        return ((nwe0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pkk0 pkk0Var = this.n;
        wpq wpqVar = this.m;
        cqq cqqVar = this.l;
        l7m0 l7m0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    wk30 wk30Var = new wk30(i120.W(ydx.V(null, new wda0(l7m0Var, (byte) 20))), (byte) 26);
                    kwe0 kwe0Var = new kwe0(cqqVar, wpqVar, pkk0Var, (byte) 0);
                    this.j = true;
                    if (wk30Var.c(kwe0Var, this) == wneVar) {
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
                    wk30 wk30Var2 = new wk30(i120.W(ydx.V(null, new wda0(l7m0Var, (byte) 29))), (byte) 28);
                    kwe0 kwe0Var2 = new kwe0(cqqVar, wpqVar, pkk0Var, (byte) 1);
                    this.j = true;
                    if (wk30Var2.c(kwe0Var2, this) == wneVar2) {
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
                    wk30 wk30Var3 = new wk30(i120.W(ydx.V(null, new f7f0(l7m0Var, (byte) 2))), (byte) 29);
                    kwe0 kwe0Var3 = new kwe0(cqqVar, wpqVar, pkk0Var, (byte) 2);
                    this.j = true;
                    if (wk30Var3.c(kwe0Var3, this) == wneVar3) {
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
