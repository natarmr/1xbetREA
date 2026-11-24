package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class rua extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xcz k;
    public final /* synthetic */ pz40 l;
    public final /* synthetic */ l7m0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rua(pz40 pz40Var, l7m0 l7m0Var, xcz xczVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.l = pz40Var;
        this.m = l7m0Var;
        this.k = xczVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new rua(this.l, this.m, this.k, yjeVar);
            case 1:
                return new rua(this.k, this.l, this.m, yjeVar, (byte) 1);
            case 2:
                return new rua(this.k, this.l, this.m, yjeVar, (byte) 2);
            case 3:
                return new rua(this.k, this.l, this.m, yjeVar, (byte) 3);
            default:
                return new rua(this.k, this.l, this.m, yjeVar, (byte) 4);
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
        return ((rua) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        l7m0 l7m0Var = this.m;
        pz40 pz40Var = this.l;
        xcz xczVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (((Boolean) pz40Var.getValue()).booleanValue()) {
                        return Unit.f46060a;
                    }
                    Iterator it = ((unr) l7m0Var.getValue()).e.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                        } else if (((cja) it.next()).getType() != dja.PENALTY) {
                            i++;
                        }
                    }
                    if (i != -1) {
                        pz40Var.setValue(Boolean.TRUE);
                        this.j = true;
                        v0h0 v0h0Var = xcz.y;
                        if (xczVar.l(i, 0, this) == wneVar) {
                            return wneVar;
                        }
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
                    gmq gmqVarW = i120.W(ydx.V(null, new a7s(xczVar, (byte) 6)));
                    pf30 pf30Var = new pf30(pz40Var, l7m0Var, (byte) 0);
                    this.j = true;
                    if (gmqVarW.c(pf30Var, this) == wneVar2) {
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
                    gmq gmqVarW2 = i120.W(ydx.V(null, new a7s(xczVar, (byte) 8)));
                    pf30 pf30Var2 = new pf30(pz40Var, l7m0Var, (byte) 1);
                    this.j = true;
                    if (gmqVarW2.c(pf30Var2, this) == wneVar3) {
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
                    gmq gmqVarW3 = i120.W(ydx.V(null, new a7s(xczVar, (byte) 9)));
                    pf30 pf30Var3 = new pf30(pz40Var, l7m0Var, (byte) 2);
                    this.j = true;
                    if (gmqVarW3.c(pf30Var3, this) == wneVar4) {
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
                    gmq gmqVarW4 = i120.W(ydx.V(null, new a7s(xczVar, (byte) 10)));
                    pf30 pf30Var4 = new pf30(pz40Var, l7m0Var, (byte) 3);
                    this.j = true;
                    if (gmqVarW4.c(pf30Var4, this) == wneVar5) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rua(xcz xczVar, pz40 pz40Var, l7m0 l7m0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xczVar;
        this.l = pz40Var;
        this.m = l7m0Var;
    }
}
