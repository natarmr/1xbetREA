package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ygz extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ l7m0 k;
    public final /* synthetic */ xcz l;
    public final /* synthetic */ Function1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ygz(l7m0 l7m0Var, xcz xczVar, Function1 function1, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = l7m0Var;
        this.l = xczVar;
        this.m = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new ygz(this.k, this.l, this.m, yjeVar, (byte) 0);
            case 1:
                return new ygz(this.k, this.l, this.m, yjeVar, (byte) 1);
            default:
                return new ygz(this.k, this.l, this.m, yjeVar, (byte) 2);
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
        return ((ygz) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Function1 function1 = this.m;
        xcz xczVar = this.l;
        l7m0 l7m0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (((yhz) l7m0Var.getValue()).c) {
                        this.j = true;
                        v0h0 v0h0Var = xcz.y;
                        if (xczVar.l(0, 0, this) == wneVar) {
                            return wneVar;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                function1.invoke(mfz.f21716a);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new x000(l7m0Var, (byte) 11));
                    clu cluVar = new clu(xczVar, function1, (byte) 9);
                    this.j = true;
                    if (vsg0VarV.c(cluVar, this) == wneVar2) {
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
                    if (((bls0) l7m0Var.getValue()).c) {
                        this.j = true;
                        v0h0 v0h0Var2 = xcz.y;
                        if (xczVar.l(0, 0, this) == wneVar3) {
                            return wneVar3;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                function1.invoke(kis0.f18352a);
                return Unit.f46060a;
        }
    }
}
