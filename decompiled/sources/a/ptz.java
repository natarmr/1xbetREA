package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class ptz extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xk80 k;
    public final /* synthetic */ l7m0 l;
    public final /* synthetic */ Function1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptz(l7m0 l7m0Var, xk80 xk80Var, Function1 function1, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        this.l = l7m0Var;
        this.k = xk80Var;
        this.m = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new ptz(this.k, this.l, this.m, yjeVar, (byte) 0);
            case 1:
                return new ptz(this.k, this.l, this.m, yjeVar, (byte) 1);
            case 2:
                return new ptz(this.k, this.l, this.m, yjeVar, (byte) 2);
            case 3:
                return new ptz(this.k, this.l, this.m, yjeVar, (byte) 3);
            case 4:
                return new ptz(this.k, this.l, this.m, yjeVar, (byte) 4);
            case 5:
                return new ptz(this.k, this.l, this.m, yjeVar, (byte) 5);
            default:
                return new ptz(this.l, this.k, this.m, yjeVar);
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
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((ptz) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Function1 function1 = this.m;
        xk80 xk80Var = this.k;
        l7m0 l7m0Var = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(ydx.V(null, new s39(xk80Var, (byte) 13)));
                    dn2 dn2Var = new dn2(l7m0Var, function1, (byte) 1);
                    this.j = true;
                    if (gmqVarW.c(dn2Var, this) == wneVar) {
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
                    gmq gmqVarW2 = i120.W(ydx.V(null, new s39(xk80Var, (byte) 14)));
                    dn2 dn2Var2 = new dn2(l7m0Var, function1, (byte) 2);
                    this.j = true;
                    if (gmqVarW2.c(dn2Var2, this) == wneVar2) {
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
                    gmq gmqVarW3 = i120.W(ydx.V(null, new s39(xk80Var, (byte) 15)));
                    dn2 dn2Var3 = new dn2(l7m0Var, function1, (byte) 3);
                    this.j = true;
                    if (gmqVarW3.c(dn2Var3, this) == wneVar3) {
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
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    gmq gmqVarW4 = i120.W(ydx.V(null, new s39(xk80Var, (byte) 16)));
                    dn2 dn2Var4 = new dn2(l7m0Var, function1, (byte) 4);
                    this.j = true;
                    if (gmqVarW4.c(dn2Var4, this) == wneVar4) {
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
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    gmq gmqVarW5 = i120.W(ydx.V(null, new s39(xk80Var, (byte) 17)));
                    dn2 dn2Var5 = new dn2(l7m0Var, function1, (byte) 5);
                    this.j = true;
                    if (gmqVarW5.c(dn2Var5, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    gmq gmqVarW6 = i120.W(ydx.V(null, new s39(xk80Var, (byte) 18)));
                    dn2 dn2Var6 = new dn2(l7m0Var, function1, (byte) 6);
                    this.j = true;
                    if (gmqVarW6.c(dn2Var6, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    gmq gmqVarW7 = i120.W(ydx.V(null, new x000(l7m0Var, (byte) 21)));
                    clu cluVar = new clu(xk80Var, function1, (byte) 22);
                    this.j = true;
                    if (gmqVarW7.c(cluVar, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ptz(xk80 xk80Var, l7m0 l7m0Var, Function1 function1, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xk80Var;
        this.l = l7m0Var;
        this.m = function1;
    }
}
