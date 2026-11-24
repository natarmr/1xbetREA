package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class pd0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ d9z k;
    public final /* synthetic */ Function1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pd0(d9z d9zVar, Function1 function1, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = d9zVar;
        this.l = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Function1 function1 = this.l;
        d9z d9zVar = this.k;
        switch (b) {
            case 0:
                return new pd0(d9zVar, function1, yjeVar, (byte) 0);
            case 1:
                return new pd0(d9zVar, function1, yjeVar, (byte) 1);
            case 2:
                return new pd0(d9zVar, function1, yjeVar, (byte) 2);
            default:
                return new pd0(d9zVar, function1, yjeVar, (byte) 3);
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
        return ((pd0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Function1 function1 = this.l;
        d9z d9zVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    lr lrVar = new lr(i120.W(ydx.V(null, new md0(d9zVar, (byte) 0))), (byte) 3);
                    bt btVar = new bt(function1, (byte) 1);
                    this.j = true;
                    if (lrVar.c(btVar, this) == wneVar) {
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
                    gmq gmqVarW = i120.W(ydx.V(null, new md0(d9zVar, (byte) 1)));
                    bt btVar2 = new bt(function1, (byte) 3);
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
                    gmq gmqVarW2 = i120.W(ydx.V(null, new md0(d9zVar, (byte) 14)));
                    x6h x6hVar = new x6h(function1, (byte) 25);
                    this.j = true;
                    if (gmqVarW2.c(x6hVar, this) == wneVar3) {
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
                    qaf0 qaf0Var = new qaf0(i120.W(ydx.V(null, new md0(d9zVar, (byte) 24))), (byte) 19);
                    f0p0 f0p0Var = new f0p0(function1, (byte) 6);
                    this.j = true;
                    if (qaf0Var.c(f0p0Var, this) == wneVar4) {
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
