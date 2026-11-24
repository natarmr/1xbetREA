package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c2p extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ xcz l;
    public final /* synthetic */ Function1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2p(boolean z, xcz xczVar, Function1 function1, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = z;
        this.l = xczVar;
        this.m = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new c2p(this.k, this.l, this.m, yjeVar, (byte) 0);
            case 1:
                return new c2p(this.k, this.l, this.m, yjeVar, (byte) 1);
            case 2:
                return new c2p(this.k, this.l, this.m, yjeVar, (byte) 2);
            case 3:
                return new c2p(this.k, this.l, this.m, yjeVar, (byte) 3);
            case 4:
                return new c2p(this.k, this.l, this.m, yjeVar, (byte) 4);
            case 5:
                return new c2p(this.k, this.l, this.m, yjeVar, (byte) 5);
            default:
                return new c2p(this.k, this.l, this.m, yjeVar, (byte) 6);
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
        return ((c2p) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Function1 function1 = this.m;
        xcz xczVar = this.l;
        boolean z = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (z) {
                        this.j = true;
                        v0h0 v0h0Var = xcz.y;
                        if (xczVar.l(0, 0, this) == wneVar) {
                            return wneVar;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                function1.invoke(pa0.f26631a);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    if (z) {
                        this.j = true;
                        if (xczVar.l(0, 0, this) == wneVar2) {
                            return wneVar2;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                function1.invoke(pb80.f26693a);
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    if (z) {
                        this.j = true;
                        v0h0 v0h0Var2 = xcz.y;
                        if (xczVar.l(0, 0, this) == wneVar3) {
                            return wneVar3;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z4) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                function1.invoke(y110.f41834a);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    if (z) {
                        this.j = true;
                        v0h0 v0h0Var3 = xcz.y;
                        if (xczVar.l(0, 0, this) == wneVar4) {
                            return wneVar4;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z5) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                function1.invoke(iwd0.f15484a);
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    if (z) {
                        this.j = true;
                        v0h0 v0h0Var4 = xcz.y;
                        if (xczVar.l(0, 0, this) == wneVar5) {
                            return wneVar5;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z6) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                function1.invoke(ryt0.f31329a);
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    if (z) {
                        this.j = true;
                        if (xczVar.l(0, 0, this) == wneVar6) {
                            return wneVar6;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z7) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                function1.invoke(zdc.f44205a);
                return Unit.f46060a;
            default:
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    if (z) {
                        this.j = true;
                        v0h0 v0h0Var5 = xcz.y;
                        if (xczVar.l(0, 0, this) == wneVar7) {
                            return wneVar7;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z8) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                function1.invoke(a5t0.f289a);
                return Unit.f46060a;
        }
    }
}
