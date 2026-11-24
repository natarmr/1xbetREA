package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oj5 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ dk5 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oj5(dk5 dk5Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dk5Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dk5 dk5Var = this.k;
        switch (b) {
            case 0:
                return new oj5(dk5Var, yjeVar, (byte) 0);
            case 1:
                return new oj5(dk5Var, yjeVar, (byte) 1);
            case 2:
                return new oj5(dk5Var, yjeVar, (byte) 2);
            case 3:
                return new oj5(dk5Var, yjeVar, (byte) 3);
            default:
                return new oj5(dk5Var, yjeVar, (byte) 4);
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
        return ((oj5) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        dk5 dk5Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (dk5Var.V != null) {
                        bzu bzuVar = dk5Var.x;
                        this.j = true;
                        obj = bzuVar.d(this);
                        if (obj == wneVar) {
                            return wneVar;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                if (!Intrinsics.d(obj, dk5Var.V)) {
                    dk5Var.z();
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    gmq gmqVarB = dk5Var.v.b();
                    nw4 nw4Var = new nw4(dk5Var, (byte) 23);
                    this.j = true;
                    if (gmqVarB.c(nw4Var, this) == wneVar2) {
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
                    i89 i89VarM = dk5Var.C.m();
                    vj5 vj5Var = new vj5(dk5Var, yjeVar, (byte) 2);
                    this.j = true;
                    if (slb.O(i89VarM, vj5Var, this) == wneVar3) {
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
                    ahu ahuVar = dk5Var.D;
                    this.j = true;
                    obj = ahuVar.b(bm5.f2822a, this);
                    if (obj == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ql5 ql5Var = (ql5) obj;
                ot otVar = dk5Var.G;
                bm5 bm5Var = bm5.g;
                otVar.a(bm5Var, ql5Var);
                jyg0 jyg0Var = dk5Var.F;
                long j = ql5Var.f28916a;
                jyg0Var.getClass();
                jyg0Var.f17359a.z(bm5Var, j);
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    hse0 hse0Var = dk5Var.L;
                    String strA = dk5Var.M.a();
                    this.j = true;
                    if (hse0.a(hse0Var, strA, false, this, 6) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                dk5Var.b0.f(new hj5());
                return Unit.f46060a;
        }
    }
}
