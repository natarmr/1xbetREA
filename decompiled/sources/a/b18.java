package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class b18 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ a4x k;
    public final /* synthetic */ xcz l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b18(a4x a4xVar, xcz xczVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = a4xVar;
        this.l = xczVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xcz xczVar = this.l;
        a4x a4xVar = this.k;
        switch (b) {
            case 0:
                return new b18(a4xVar, xczVar, yjeVar, (byte) 0);
            case 1:
                return new b18(a4xVar, xczVar, yjeVar, (byte) 1);
            case 2:
                return new b18(a4xVar, xczVar, yjeVar, (byte) 2);
            default:
                return new b18(a4xVar, xczVar, yjeVar, (byte) 3);
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
        return ((b18) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        xcz xczVar = this.l;
        a4x a4xVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (!a4xVar.isEmpty()) {
                        int size = a4xVar.size() - 1;
                        this.j = true;
                        v0h0 v0h0Var = xcz.y;
                        if (xczVar.l(size, 0, this) == wneVar) {
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
                    if (!a4xVar.isEmpty()) {
                        int size2 = a4xVar.size() - 1;
                        this.j = true;
                        v0h0 v0h0Var2 = xcz.y;
                        if (xczVar.l(size2, 0, this) == wneVar2) {
                            return wneVar2;
                        }
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
                    if (!a4xVar.isEmpty()) {
                        int size3 = a4xVar.size() - 1;
                        this.j = true;
                        v0h0 v0h0Var3 = xcz.y;
                        if (xczVar.f(size3, 0, this) == wneVar3) {
                            return wneVar3;
                        }
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
                    if (!a4xVar.isEmpty()) {
                        int size4 = a4xVar.size() - 1;
                        this.j = true;
                        v0h0 v0h0Var4 = xcz.y;
                        if (xczVar.l(size4, 0, this) == wneVar4) {
                            return wneVar4;
                        }
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
