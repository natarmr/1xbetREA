package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class nv5 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ d650 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nv5(d650 d650Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = d650Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new nv5(this.k, yjeVar, (byte) 0);
            case 1:
                return new nv5(this.k, yjeVar, (byte) 1);
            default:
                return new nv5(this.k, yjeVar, (byte) 2);
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
        return ((nv5) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        d650 d650Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ahu ahuVar = d650Var.k;
                    bm5 bm5Var = d650Var.u;
                    this.j = true;
                    obj = ahuVar.b(bm5Var, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ql5 ql5Var = (ql5) obj;
                d650Var.j.l(d650Var.u, ql5Var);
                d650Var.t = ql5Var.f28916a;
                String strX = d650Var.x(ql5Var);
                p7m0 p7m0Var = d650Var.v;
                lv5 lv5Var = new lv5(ql5Var, strX);
                p7m0Var.getClass();
                p7m0Var.o(null, lv5Var);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    khf0 khf0Var = d650Var.l;
                    bm5 bm5Var2 = bm5.e;
                    this.j = true;
                    obj = khf0.G(khf0Var, bm5Var2, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ql5 ql5Var2 = (ql5) obj;
                d650Var.j.l(bm5.e, ql5Var2);
                d650Var.t = ql5Var2.f28916a;
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    kd30 kd30Var = d650Var.r;
                    this.j = true;
                    if (kd30Var.N() == wneVar3) {
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
