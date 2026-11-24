package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class wt1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ cv1 k;
    public final /* synthetic */ xk80 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wt1(cv1 cv1Var, xk80 xk80Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = cv1Var;
        this.l = xk80Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new wt1(this.k, this.l, yjeVar, (byte) 0);
            case 1:
                return new wt1(this.k, this.l, yjeVar, (byte) 1);
            case 2:
                return new wt1(this.k, this.l, yjeVar, (byte) 2);
            default:
                return new wt1(this.k, this.l, yjeVar, (byte) 3);
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
        return ((wt1) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        cv1 cv1Var = this.k;
        xk80 xk80Var = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int iOrdinal = cv1Var.b.ordinal();
                    if (xk80Var.k() != iOrdinal) {
                        this.j = true;
                        if (xk80.g(xk80Var, iOrdinal, null, this, 6) == wneVar) {
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
                    int iOrdinal2 = cv1Var.b.ordinal();
                    if (xk80Var.k() != iOrdinal2) {
                        this.j = true;
                        if (xk80.g(xk80Var, iOrdinal2, null, this, 6) == wneVar2) {
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
                    int iOrdinal3 = cv1Var.b.ordinal();
                    if (xk80Var.k() != iOrdinal3) {
                        this.j = true;
                        if (xk80.g(xk80Var, iOrdinal3, null, this, 6) == wneVar3) {
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
                    int iOrdinal4 = cv1Var.b.ordinal();
                    if (xk80Var.k() != iOrdinal4) {
                        this.j = true;
                        if (xk80.g(xk80Var, iOrdinal4, null, this, 6) == wneVar4) {
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
