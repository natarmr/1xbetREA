package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class xi1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ d9z k;
    public final /* synthetic */ Function0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi1(d9z d9zVar, Function0 function0, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = d9zVar;
        this.l = function0;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Function0 function0 = this.l;
        d9z d9zVar = this.k;
        switch (b) {
            case 0:
                return new xi1(d9zVar, function0, yjeVar, (byte) 0);
            case 1:
                return new xi1(d9zVar, function0, yjeVar, (byte) 1);
            case 2:
                return new xi1(d9zVar, function0, yjeVar, (byte) 2);
            case 3:
                return new xi1(d9zVar, function0, yjeVar, (byte) 3);
            default:
                return new xi1(d9zVar, function0, yjeVar, (byte) 4);
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
        return ((xi1) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.i;
        h660 h660Var = h660.f12515a;
        Function0 function0 = this.l;
        d9z d9zVar = this.k;
        byte b2 = 2;
        byte b3 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    vsg0 vsg0Var = new vsg0(new vi1(ydx.V(null, new ti1(d9zVar, (byte) 0)), yjeVar, d9zVar, (byte) 0));
                    wi1 wi1Var = new wi1(function0, null, (byte) 0);
                    this.j = true;
                    Object objC = vsg0Var.c(new vnq(h660Var, wi1Var, (byte) 2), this);
                    if (objC != wneVar) {
                        objC = Unit.f46060a;
                    }
                    if (objC != wneVar) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar) {
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
                    vsg0 vsg0Var2 = new vsg0(new vi1(ydx.V(null, new ti1(d9zVar, (byte) 1)), yjeVar, d9zVar, b3));
                    wi1 wi1Var2 = new wi1(function0, null, (byte) 1);
                    this.j = true;
                    Object objC2 = vsg0Var2.c(new vnq(h660Var, wi1Var2, (byte) 2), this);
                    if (objC2 != wneVar2) {
                        objC2 = Unit.f46060a;
                    }
                    if (objC2 != wneVar2) {
                        objC2 = Unit.f46060a;
                    }
                    if (objC2 == wneVar2) {
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
                    vsg0 vsg0Var3 = new vsg0(new vi1(ydx.V(null, new ti1(d9zVar, (byte) 2)), yjeVar, d9zVar, b2));
                    wi1 wi1Var3 = new wi1(function0, null, (byte) 2);
                    this.j = true;
                    Object objC3 = vsg0Var3.c(new vnq(h660Var, wi1Var3, (byte) 2), this);
                    if (objC3 != wneVar3) {
                        objC3 = Unit.f46060a;
                    }
                    if (objC3 != wneVar3) {
                        objC3 = Unit.f46060a;
                    }
                    if (objC3 == wneVar3) {
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
                    vsg0 vsg0Var4 = new vsg0(new vi1(ydx.V(null, new ti1(d9zVar, (byte) 3)), yjeVar, d9zVar, (byte) 3));
                    wi1 wi1Var4 = new wi1(function0, null, (byte) 3);
                    this.j = true;
                    Object objC4 = vsg0Var4.c(new vnq(h660Var, wi1Var4, (byte) 2), this);
                    if (objC4 != wneVar4) {
                        objC4 = Unit.f46060a;
                    }
                    if (objC4 != wneVar4) {
                        objC4 = Unit.f46060a;
                    }
                    if (objC4 == wneVar4) {
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
                    vsg0 vsg0Var5 = new vsg0(new vi1(ydx.V(null, new ti1(d9zVar, (byte) 4)), yjeVar, d9zVar, (byte) 4));
                    wi1 wi1Var5 = new wi1(function0, null, (byte) 5);
                    this.j = true;
                    Object objC5 = vsg0Var5.c(new vnq(h660Var, wi1Var5, (byte) 2), this);
                    if (objC5 != wneVar5) {
                        objC5 = Unit.f46060a;
                    }
                    if (objC5 != wneVar5) {
                        objC5 = Unit.f46060a;
                    }
                    if (objC5 == wneVar5) {
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
