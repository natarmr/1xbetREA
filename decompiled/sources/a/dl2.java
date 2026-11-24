package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class dl2 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ l7m0 k;
    public final /* synthetic */ Function1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dl2(byte b, yje yjeVar, l7m0 l7m0Var, Function1 function1) {
        super(2, yjeVar);
        this.i = b;
        this.k = l7m0Var;
        this.l = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Function1 function1 = this.l;
        l7m0 l7m0Var = this.k;
        switch (b) {
            case 0:
                return new dl2((byte) 0, yjeVar, l7m0Var, function1);
            case 1:
                return new dl2((byte) 1, yjeVar, l7m0Var, function1);
            case 2:
                return new dl2((byte) 2, yjeVar, l7m0Var, function1);
            case 3:
                return new dl2((byte) 3, yjeVar, l7m0Var, function1);
            case 4:
                return new dl2((byte) 4, yjeVar, l7m0Var, function1);
            case 5:
                return new dl2((byte) 5, yjeVar, l7m0Var, function1);
            default:
                return new dl2((byte) 6, yjeVar, l7m0Var, function1);
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
        return ((dl2) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Function1 function1 = this.l;
        l7m0 l7m0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(ydx.V(null, new jb(l7m0Var, (byte) 18)));
                    bt btVar = new bt(function1, (byte) 4);
                    this.j = true;
                    if (gmqVarW.c(btVar, this) == wneVar) {
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
                    gmq gmqVarW2 = i120.W(ydx.V(null, new jb(l7m0Var, (byte) 19)));
                    dn2 dn2Var = new dn2(function1, l7m0Var, (byte) 0);
                    this.j = true;
                    if (gmqVarW2.c(dn2Var, this) == wneVar2) {
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
                    gmq gmqVarW3 = i120.W(ydx.V(null, new kk7(l7m0Var, (byte) 25)));
                    bt btVar2 = new bt(function1, (byte) 7);
                    this.j = true;
                    if (gmqVarW3.c(btVar2, this) == wneVar3) {
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
                    gmq gmqVarW4 = i120.W(dtb.z(ydx.V(null, new x000(l7m0Var, (byte) 23)), 1));
                    dn2 dn2Var2 = new dn2(function1, l7m0Var, (byte) 7);
                    this.j = true;
                    if (gmqVarW4.c(dn2Var2, this) == wneVar4) {
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
                    gmq gmqVarW5 = i120.W(ydx.V(null, new x000(l7m0Var, (byte) 24)));
                    dn2 dn2Var3 = new dn2(function1, l7m0Var, (byte) 8);
                    this.j = true;
                    if (gmqVarW5.c(dn2Var3, this) == wneVar5) {
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
                    gmq gmqVarW6 = i120.W(ydx.V(null, new x000(l7m0Var, (byte) 25)));
                    x6h x6hVar = new x6h(function1, (byte) 10);
                    this.j = true;
                    if (gmqVarW6.c(x6hVar, this) == wneVar6) {
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
                    vsg0 vsg0VarV = ydx.V(null, new x000(l7m0Var, (byte) 29));
                    x6h x6hVar2 = new x6h(function1, (byte) 11);
                    this.j = true;
                    if (vsg0VarV.c(x6hVar2, this) == wneVar7) {
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
}
