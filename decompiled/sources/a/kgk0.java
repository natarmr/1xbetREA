package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class kgk0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ pz40 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kgk0(Function2 function2, pz40 pz40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = function2;
        this.m = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                kgk0 kgk0Var = new kgk0(this.l, this.m, yjeVar, (byte) 0);
                kgk0Var.k = obj;
                return kgk0Var;
            case 1:
                kgk0 kgk0Var2 = new kgk0(this.l, this.m, yjeVar, (byte) 1);
                kgk0Var2.k = obj;
                return kgk0Var2;
            default:
                kgk0 kgk0Var3 = new kgk0(this.l, this.m, yjeVar, (byte) 2);
                kgk0Var3.k = obj;
                return kgk0Var3;
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
        return ((kgk0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pz40 pz40Var = this.m;
        Function2 function2 = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gzb0 gzb0Var = new gzb0(pz40Var, ((vne) this.k).getCoroutineContext());
                    this.j = true;
                    if (function2.invoke(gzb0Var, this) == wneVar) {
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
                    gzb0 gzb0Var2 = new gzb0(pz40Var, ((vne) this.k).getCoroutineContext());
                    this.j = true;
                    if (function2.invoke(gzb0Var2, this) == wneVar2) {
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
                    gzb0 gzb0Var3 = new gzb0(pz40Var, ((vne) this.k).getCoroutineContext());
                    this.j = true;
                    if (function2.invoke(gzb0Var3, this) == wneVar3) {
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
        }
    }
}
