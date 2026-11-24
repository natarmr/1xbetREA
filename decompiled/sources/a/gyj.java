package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class gyj extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xk80 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ l7m0 m;
    public final /* synthetic */ Function1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gyj(xk80 xk80Var, int i, l7m0 l7m0Var, Function1 function1, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xk80Var;
        this.l = i;
        this.m = l7m0Var;
        this.n = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new gyj(this.k, this.l, this.m, this.n, yjeVar, (byte) 0);
            case 1:
                return new gyj(this.k, this.l, this.m, this.n, yjeVar, (byte) 1);
            default:
                return new gyj(this.k, this.l, this.m, this.n, yjeVar, (byte) 2);
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
        return ((gyj) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        a4x a4xVar;
        ekw ekwVar;
        a4x a4xVar2;
        ekw ekwVar2;
        a4x a4xVar3;
        ekw ekwVar3;
        byte b = this.i;
        Function1 function1 = this.n;
        l7m0 l7m0Var = this.m;
        xk80 xk80Var = this.k;
        int i = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    uts0 uts0VarB = e3c.B();
                    this.j = true;
                    if (xk80.g(xk80Var, i, uts0VarB, this, 2) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                gkw gkwVar = (gkw) l7m0Var.getValue();
                if (gkwVar != null && (a4xVar = gkwVar.b) != null && (ekwVar = (ekw) a4xVar.get(i)) != null) {
                    function1.invoke(new mhw(ekwVar));
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    uts0 uts0VarB2 = e3c.B();
                    this.j = true;
                    if (xk80.g(xk80Var, i, uts0VarB2, this, 2) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                gkw gkwVar2 = (gkw) l7m0Var.getValue();
                if (gkwVar2 != null && (a4xVar2 = gkwVar2.b) != null && (ekwVar2 = (ekw) a4xVar2.get(i)) != null) {
                    function1.invoke(new mhw(ekwVar2));
                }
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    uts0 uts0VarB3 = e3c.B();
                    this.j = true;
                    if (xk80.g(xk80Var, i, uts0VarB3, this, 2) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                gkw gkwVar3 = (gkw) l7m0Var.getValue();
                if (gkwVar3 != null && (a4xVar3 = gkwVar3.b) != null && (ekwVar3 = (ekw) a4xVar3.get(i)) != null) {
                    function1.invoke(new mhw(ekwVar3));
                }
                return Unit.f46060a;
        }
    }
}
