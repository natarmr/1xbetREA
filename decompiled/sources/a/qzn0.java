package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class qzn0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ d9z k;
    public final /* synthetic */ d9z l;
    public final /* synthetic */ vne m;
    public final /* synthetic */ pz40 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qzn0(d9z d9zVar, d9z d9zVar2, vne vneVar, pz40 pz40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = d9zVar;
        this.l = d9zVar2;
        this.m = vneVar;
        this.n = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new qzn0(this.k, this.l, this.m, this.n, yjeVar, (byte) 0);
            case 1:
                return new qzn0(this.k, this.l, this.m, this.n, yjeVar, (byte) 1);
            case 2:
                return new qzn0(this.k, this.l, this.m, this.n, yjeVar, (byte) 2);
            default:
                return new qzn0(this.k, this.l, this.m, this.n, yjeVar, (byte) 3);
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
            case 2:
                break;
        }
        return ((qzn0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    d9z d9zVar = this.k;
                    vsg0 vsg0VarV = ydx.V(null, new md0(d9zVar, (byte) 17));
                    pzn0 pzn0Var = new pzn0(d9zVar, this.l, this.m, this.n, (byte) 0);
                    this.j = true;
                    if (vsg0VarV.c(pzn0Var, this) == wneVar) {
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
                    d9z d9zVar2 = this.k;
                    vsg0 vsg0VarV2 = ydx.V(null, new md0(d9zVar2, (byte) 18));
                    pzn0 pzn0Var2 = new pzn0(d9zVar2, this.l, this.m, this.n, (byte) 1);
                    this.j = true;
                    if (vsg0VarV2.c(pzn0Var2, this) == wneVar2) {
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
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    d9z d9zVar3 = this.k;
                    vsg0 vsg0VarV3 = ydx.V(null, new md0(d9zVar3, (byte) 19));
                    pzn0 pzn0Var3 = new pzn0(d9zVar3, this.l, this.m, this.n, (byte) 2);
                    this.j = true;
                    if (vsg0VarV3.c(pzn0Var3, this) == wneVar3) {
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
            default:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    d9z d9zVar4 = this.k;
                    vsg0 vsg0VarV4 = ydx.V(null, new md0(d9zVar4, (byte) 20));
                    pzn0 pzn0Var4 = new pzn0(d9zVar4, this.l, this.m, this.n, (byte) 3);
                    this.j = true;
                    if (vsg0VarV4.c(pzn0Var4, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
