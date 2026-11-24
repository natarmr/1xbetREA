package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class rf30 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xcz k;
    public final /* synthetic */ pz40 l;
    public final /* synthetic */ pz40 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rf30(xcz xczVar, pz40 pz40Var, pz40 pz40Var2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xczVar;
        this.l = pz40Var;
        this.m = pz40Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new rf30(this.k, this.l, this.m, yjeVar, (byte) 0);
            case 1:
                return new rf30(this.k, this.l, this.m, yjeVar, (byte) 1);
            case 2:
                return new rf30(this.k, this.l, this.m, yjeVar, (byte) 2);
            case 3:
                return new rf30(this.k, this.l, this.m, yjeVar, (byte) 3);
            case 4:
                return new rf30(this.k, this.l, this.m, yjeVar, (byte) 4);
            case 5:
                return new rf30(this.k, this.l, this.m, yjeVar, (byte) 5);
            case 6:
                return new rf30(this.k, this.l, this.m, yjeVar, (byte) 6);
            case 7:
                return new rf30(this.k, this.l, this.m, yjeVar, (byte) 7);
            case 8:
                return new rf30(this.k, this.l, this.m, yjeVar, (byte) 8);
            case 9:
                return new rf30(this.k, this.l, this.m, yjeVar, (byte) 9);
            default:
                return new rf30(this.k, this.l, this.m, yjeVar, (byte) 10);
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
        return ((rf30) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pz40 pz40Var = this.m;
        pz40 pz40Var2 = this.l;
        xcz xczVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new a7s(xczVar, (byte) 7));
                    qf30 qf30Var = new qf30(xczVar, pz40Var2, pz40Var, (byte) 0);
                    this.j = true;
                    if (vsg0VarV.c(qf30Var, this) == wneVar) {
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
                    vsg0 vsg0VarV2 = ydx.V(null, new a7s(xczVar, (byte) 11));
                    qf30 qf30Var2 = new qf30(xczVar, pz40Var2, pz40Var, (byte) 1);
                    this.j = true;
                    if (vsg0VarV2.c(qf30Var2, this) == wneVar2) {
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
                    vsg0 vsg0VarV3 = ydx.V(null, new a7s(xczVar, (byte) 12));
                    qf30 qf30Var3 = new qf30(xczVar, pz40Var2, pz40Var, (byte) 2);
                    this.j = true;
                    if (vsg0VarV3.c(qf30Var3, this) == wneVar3) {
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
                    vsg0 vsg0VarV4 = ydx.V(null, new a7s(xczVar, (byte) 13));
                    qf30 qf30Var4 = new qf30(xczVar, pz40Var2, pz40Var, (byte) 3);
                    this.j = true;
                    if (vsg0VarV4.c(qf30Var4, this) == wneVar4) {
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
                    xcz xczVar2 = this.k;
                    vsg0 vsg0VarV5 = ydx.V(null, new a7s(xczVar2, (byte) 17));
                    pz40 pz40Var3 = this.m;
                    lq40 lq40Var = new lq40(xczVar2, this.l, pz40Var3, null, (byte) 0);
                    this.j = true;
                    if (slb.O(vsg0VarV5, lq40Var, this) == wneVar5) {
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
                    xcz xczVar3 = this.k;
                    vsg0 vsg0VarV6 = ydx.V(null, new a7s(xczVar3, (byte) 18));
                    pz40 pz40Var4 = this.m;
                    lq40 lq40Var2 = new lq40(xczVar3, this.l, pz40Var4, null, (byte) 1);
                    this.j = true;
                    if (slb.O(vsg0VarV6, lq40Var2, this) == wneVar6) {
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
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    vsg0 vsg0VarV7 = ydx.V(null, new gg90(xczVar, (byte) 0));
                    hg90 hg90Var = new hg90(pz40Var2, pz40Var, (byte) 0);
                    this.j = true;
                    if (vsg0VarV7.c(hg90Var, this) == wneVar7) {
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
                    vsg0 vsg0VarV8 = ydx.V(null, new gg90(xczVar, (byte) 1));
                    hg90 hg90Var2 = new hg90(pz40Var2, pz40Var, (byte) 1);
                    this.j = true;
                    if (vsg0VarV8.c(hg90Var2, this) == wneVar8) {
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
                    vsg0 vsg0VarV9 = ydx.V(null, new gg90(xczVar, (byte) 2));
                    hg90 hg90Var3 = new hg90(pz40Var2, pz40Var, (byte) 2);
                    this.j = true;
                    if (vsg0VarV9.c(hg90Var3, this) == wneVar9) {
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
                    vsg0 vsg0VarV10 = ydx.V(null, new gg90(xczVar, (byte) 3));
                    hg90 hg90Var4 = new hg90(pz40Var2, pz40Var, (byte) 3);
                    this.j = true;
                    if (vsg0VarV10.c(hg90Var4, this) == wneVar10) {
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
                    vsg0 vsg0VarV11 = ydx.V(null, new gg90(xczVar, (byte) 5));
                    hg90 hg90Var5 = new hg90(pz40Var2, pz40Var, (byte) 4);
                    this.j = true;
                    if (vsg0VarV11.c(hg90Var5, this) == wneVar11) {
                        return wneVar11;
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
