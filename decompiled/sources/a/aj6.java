package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class aj6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xcz k;
    public final /* synthetic */ Function1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aj6(xcz xczVar, Function1 function1, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xczVar;
        this.l = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Function1 function1 = this.l;
        xcz xczVar = this.k;
        switch (b) {
            case 0:
                return new aj6(xczVar, function1, yjeVar, (byte) 0);
            case 1:
                return new aj6(xczVar, function1, yjeVar, (byte) 1);
            case 2:
                return new aj6(xczVar, function1, yjeVar, (byte) 2);
            case 3:
                return new aj6(xczVar, function1, yjeVar, (byte) 3);
            default:
                return new aj6(xczVar, function1, yjeVar, (byte) 4);
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
        }
        return ((aj6) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Function1 function1 = this.l;
        xcz xczVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new eb(xczVar, (byte) 3));
                    bt btVar = new bt(function1, (byte) 5);
                    this.j = true;
                    if (vsg0VarV.c(btVar, this) == wneVar) {
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
                    gmq gmqVarW = i120.W(new i89(ydx.V(null, new eb(xczVar, (byte) 15)), (byte) 22));
                    bt btVar2 = new bt(function1, (byte) 15);
                    this.j = true;
                    if (gmqVarW.c(btVar2, this) == wneVar2) {
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
                    vsg0 vsg0VarV2 = ydx.V(null, new eb(xczVar, (byte) 16));
                    bt btVar3 = new bt(function1, (byte) 24);
                    this.j = true;
                    if (vsg0VarV2.c(btVar3, this) == wneVar3) {
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
                    gmq gmqVarW2 = i120.W(new i89(ydx.V(null, new eb(xczVar, (byte) 29)), (byte) 22));
                    x6h x6hVar = new x6h(function1, (byte) 7);
                    this.j = true;
                    if (gmqVarW2.c(x6hVar, this) == wneVar4) {
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
            default:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    gmq gmqVarW3 = i120.W(ydx.V(null, new gg90(xczVar, (byte) 12)));
                    x6h x6hVar2 = new x6h(function1, (byte) 18);
                    this.j = true;
                    if (gmqVarW3.c(x6hVar2, this) == wneVar5) {
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
        }
    }
}
