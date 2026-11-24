package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class bv2 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Function0 l;
    public final /* synthetic */ Function2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv2(Function2 function2, Function0 function0, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.m = function2;
        this.l = function0;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                bv2 bv2Var = new bv2(this.l, this.m, yjeVar, (byte) 0);
                bv2Var.k = obj;
                return bv2Var;
            case 1:
                bv2 bv2Var2 = new bv2(this.l, this.m, yjeVar, (byte) 1);
                bv2Var2.k = obj;
                return bv2Var2;
            default:
                bv2 bv2Var3 = new bv2(this.m, this.l, yjeVar);
                bv2Var3.k = obj;
                return bv2Var3;
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
        return ((bv2) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Function2 function2 = this.m;
        Function0 function0 = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    vne vneVar = (vne) this.k;
                    mie0 mie0Var = new mie0();
                    vsg0 vsg0VarV = ydx.V(null, function0);
                    av2 av2Var = new av2(mie0Var, vneVar, function2, (byte) 0);
                    this.j = true;
                    if (vsg0VarV.c(av2Var, this) == wneVar) {
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
                    vne vneVar2 = (vne) this.k;
                    mie0 mie0Var2 = new mie0();
                    vsg0 vsg0VarV2 = ydx.V(null, function0);
                    av2 av2Var2 = new av2(mie0Var2, vneVar2, function2, (byte) 1);
                    this.j = true;
                    if (vsg0VarV2.c(av2Var2, this) == wneVar2) {
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
                vne vneVar3 = (vne) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                try {
                    if (!z3) {
                        z1x.P(obj);
                        this.k = null;
                        this.j = true;
                        if (function2.invoke(vneVar3, this) == wneVar3) {
                            return wneVar3;
                        }
                    } else {
                        if (!z3) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    if (function0 != null) {
                        function0.invoke();
                    }
                    return Unit.f46060a;
                } catch (Throwable th) {
                    if (function0 != null) {
                        function0.invoke();
                    }
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bv2(Function0 function0, Function2 function2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = function0;
        this.m = function2;
    }
}
