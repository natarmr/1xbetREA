package a;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class kyh extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Function2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyh(yje yjeVar, Function2 function2) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.l = function2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Function2 function2 = this.l;
        switch (b) {
            case 0:
                kyh kyhVar = new kyh(function2, yjeVar, (byte) 0);
                kyhVar.k = obj;
                return kyhVar;
            case 1:
                kyh kyhVar2 = new kyh(yjeVar, function2);
                kyhVar2.k = obj;
                return kyhVar2;
            case 2:
                kyh kyhVar3 = new kyh(function2, yjeVar, (byte) 2);
                kyhVar3.k = obj;
                return kyhVar3;
            case 3:
                kyh kyhVar4 = new kyh(function2, yjeVar, (byte) 3);
                kyhVar4.k = obj;
                return kyhVar4;
            case 4:
                kyh kyhVar5 = new kyh(function2, yjeVar, (byte) 4);
                kyhVar5.k = obj;
                return kyhVar5;
            default:
                kyh kyhVar6 = new kyh(function2, yjeVar, (byte) 5);
                kyhVar6.k = obj;
                return kyhVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((kyh) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((kyh) create((jz80) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((kyh) create((az40) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((kyh) create((az40) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((kyh) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((kyh) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 0;
        Function2 function2 = this.l;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (z) {
                    if (z) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                qpg0 qpg0Var = (qpg0) this.k;
                this.j = true;
                Object objInvoke = function2.invoke(qpg0Var, this);
                return objInvoke == wneVar ? wneVar : objInvoke;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                jz80 jz80Var = (jz80) this.k;
                jz80Var.getClass();
                kyh kyhVar = new kyh(function2, yjeVar, b2);
                this.j = true;
                Object objC = jz80Var.c(kyhVar, this);
                return objC == wneVar2 ? wneVar2 : objC;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    az40 az40Var = (az40) this.k;
                    this.j = true;
                    obj = function2.invoke(az40Var, this);
                    if (obj == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                az40 az40Var2 = (az40) obj;
                az40Var2.getClass();
                az40Var2.b.f41787a.set(true);
                return az40Var2;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    az40 az40Var3 = new az40(new LinkedHashMap(((az40) this.k).a()), false);
                    this.k = az40Var3;
                    this.j = true;
                    return function2.invoke(az40Var3, this) == wneVar4 ? wneVar4 : az40Var3;
                }
                if (!z4) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                az40 az40Var4 = (az40) this.k;
                z1x.P(obj);
                return az40Var4;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    vne vneVar = (vne) this.k;
                    this.j = true;
                    if (function2.invoke(vneVar, this) == wneVar5) {
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
            default:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    pnd0 pnd0Var = new pnd0((kmq) this.k, function2, yjeVar, (byte) 12);
                    this.j = true;
                    if (d5c.J(this, pnd0Var) == wneVar6) {
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kyh(Function2 function2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = function2;
    }
}
