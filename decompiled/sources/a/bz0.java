package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class bz0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xcz k;
    public final /* synthetic */ pz40 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bz0(xcz xczVar, pz40 pz40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xczVar;
        this.l = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pz40 pz40Var = this.l;
        xcz xczVar = this.k;
        switch (b) {
            case 0:
                return new bz0(xczVar, pz40Var, yjeVar, (byte) 0);
            case 1:
                return new bz0(xczVar, pz40Var, yjeVar, (byte) 1);
            case 2:
                return new bz0(xczVar, pz40Var, yjeVar, (byte) 2);
            case 3:
                return new bz0(xczVar, pz40Var, yjeVar, (byte) 3);
            case 4:
                return new bz0(xczVar, pz40Var, yjeVar, (byte) 4);
            case 5:
                return new bz0(xczVar, pz40Var, yjeVar, (byte) 5);
            case 6:
                return new bz0(xczVar, pz40Var, yjeVar, (byte) 6);
            case 7:
                return new bz0(xczVar, pz40Var, yjeVar, (byte) 7);
            case 8:
                return new bz0(xczVar, pz40Var, yjeVar, (byte) 8);
            case 9:
                return new bz0(xczVar, pz40Var, yjeVar, (byte) 9);
            default:
                return new bz0(xczVar, pz40Var, yjeVar, (byte) 10);
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
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return ((bz0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 2;
        xcz xczVar = this.k;
        pz40 pz40Var = this.l;
        byte b3 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    lr lrVar = new lr(i120.W(ydx.V(null, new eb(xczVar, b3))), (byte) 7);
                    yy0 yy0Var = new yy0(pz40Var, (byte) 0);
                    this.j = true;
                    if (lrVar.c(yy0Var, this) == wneVar) {
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
                    lr lrVar2 = new lr(i120.W(ydx.V(null, new eb(xczVar, b2))), (byte) 10);
                    yy0 yy0Var2 = new yy0(pz40Var, (byte) 1);
                    this.j = true;
                    if (lrVar2.c(yy0Var2, this) == wneVar2) {
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
                    vsg0 vsg0VarV = ydx.V(null, new eb(xczVar, (byte) 6));
                    yy0 yy0Var3 = new yy0(pz40Var, (byte) 3);
                    this.j = true;
                    if (vsg0VarV.c(yy0Var3, this) == wneVar3) {
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
                    vsg0 vsg0VarV2 = ydx.V(null, new eb(xczVar, (byte) 20));
                    u6h u6hVar = new u6h(pz40Var, yjeVar, b3);
                    this.j = true;
                    if (slb.O(vsg0VarV2, u6hVar, this) == wneVar4) {
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
                    vsg0 vsg0VarV3 = ydx.V(null, new eb(xczVar, (byte) 21));
                    u6h u6hVar2 = new u6h(pz40Var, yjeVar, b2);
                    this.j = true;
                    if (slb.O(vsg0VarV3, u6hVar2, this) == wneVar5) {
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
                    va vaVar = new va(xczVar.g.f12108a, (byte) 18);
                    this.j = true;
                    if (ntb.K(vaVar, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    vsg0 vsg0VarV4 = ydx.V(null, new a7s(xczVar, (byte) 24));
                    fg90 fg90Var = new fg90(xczVar, pz40Var, (byte) 0);
                    this.j = true;
                    if (vsg0VarV4.c(fg90Var, this) == wneVar7) {
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
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    vsg0 vsg0VarV5 = ydx.V(null, new a7s(xczVar, (byte) 25));
                    fg90 fg90Var2 = new fg90(xczVar, pz40Var, (byte) 1);
                    this.j = true;
                    if (vsg0VarV5.c(fg90Var2, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    vsg0 vsg0VarV6 = ydx.V(null, new a7s(xczVar, (byte) 26));
                    fg90 fg90Var3 = new fg90(xczVar, pz40Var, (byte) 2);
                    this.j = true;
                    if (vsg0VarV6.c(fg90Var3, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    vsg0 vsg0VarV7 = ydx.V(null, new a7s(xczVar, (byte) 27));
                    fg90 fg90Var4 = new fg90(xczVar, pz40Var, (byte) 3);
                    this.j = true;
                    if (vsg0VarV7.c(fg90Var4, this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    if (((kfk0) pz40Var.getValue()) == kfk0.f18200a) {
                        this.j = true;
                        v0h0 v0h0Var = xcz.y;
                        if (xczVar.l(0, 0, this) == wneVar11) {
                            return wneVar11;
                        }
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
