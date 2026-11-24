package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class tfq0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ wfq0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tfq0(wfq0 wfq0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wfq0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wfq0 wfq0Var = this.k;
        switch (b) {
            case 0:
                return new tfq0(wfq0Var, yjeVar, (byte) 0);
            case 1:
                return new tfq0(wfq0Var, yjeVar, (byte) 1);
            case 2:
                return new tfq0(wfq0Var, yjeVar, (byte) 2);
            case 3:
                return new tfq0(wfq0Var, yjeVar, (byte) 3);
            default:
                return new tfq0(wfq0Var, yjeVar, (byte) 4);
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
        return ((tfq0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        wfq0 wfq0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    jtj jtjVar = wfq0Var.l;
                    this.j = true;
                    if (jtjVar.m(this) == wneVar) {
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
                    uii uiiVar = wfq0Var.d;
                    s470 s470Var = wfq0Var.r.f42064a;
                    this.j = true;
                    if (uiiVar.C(s470Var, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                wfq0Var.x();
                xeq0 xeq0Var = ((kgq0) wfq0Var.i.f32888a).c.f2464a.b;
                p7m0 p7m0Var = wfq0Var.y;
                nfq0 nfq0Var = new nfq0(xeq0Var.f40755a);
                p7m0Var.getClass();
                p7m0Var.o(null, nfq0Var);
                wfq0Var.w(xeq0Var.b);
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    s7t0 s7t0Var = wfq0Var.c;
                    this.j = true;
                    if (s7t0Var.a(true, this) == wneVar3) {
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
                    i5m0 i5m0Var = wfq0Var.f;
                    this.j = true;
                    if (i5m0Var.b(this) == wneVar4) {
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
                    pzu pzuVar = wfq0Var.g;
                    s470 s470Var2 = wfq0Var.r.f42064a;
                    this.j = true;
                    if (pzuVar.i0(s470Var2, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                wfq0Var.y();
                return Unit.f46060a;
        }
    }
}
