package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ow7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ pz40 k;
    public final /* synthetic */ vne l;
    public final /* synthetic */ t33 m;
    public final /* synthetic */ pz40 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ow7(pz40 pz40Var, vne vneVar, t33 t33Var, pz40 pz40Var2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = pz40Var;
        this.l = vneVar;
        this.m = t33Var;
        this.n = pz40Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new ow7(this.k, this.l, this.m, this.n, yjeVar, (byte) 0);
            case 1:
                return new ow7(this.k, this.l, this.m, this.n, yjeVar, (byte) 1);
            default:
                return new ow7(this.k, this.l, this.m, this.n, yjeVar, (byte) 2);
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
        return ((ow7) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pz40 pz40Var = this.n;
        t33 t33Var = this.m;
        vne vneVar = this.l;
        pz40 pz40Var2 = this.k;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new xx(pz40Var2, (byte) 14));
                    nw7 nw7Var = new nw7(vneVar, t33Var, pz40Var, (byte) 0);
                    this.j = true;
                    if (vsg0VarV.c(nw7Var, this) == wneVar) {
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
                    vsg0 vsg0VarV2 = ydx.V(null, new xx(pz40Var2, (byte) 15));
                    nw7 nw7Var2 = new nw7(vneVar, t33Var, pz40Var, b2);
                    this.j = true;
                    if (vsg0VarV2.c(nw7Var2, this) == wneVar2) {
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
                    vsg0 vsg0VarV3 = ydx.V(null, new rip(pz40Var2, (byte) 10));
                    nw7 nw7Var3 = new nw7(vneVar, t33Var, pz40Var, (byte) 2);
                    this.j = true;
                    if (vsg0VarV3.c(nw7Var3, this) == wneVar3) {
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
