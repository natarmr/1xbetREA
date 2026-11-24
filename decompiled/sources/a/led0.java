package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class led0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ned0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ led0(ned0 ned0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ned0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ned0 ned0Var = this.k;
        switch (b) {
            case 0:
                return new led0(ned0Var, yjeVar, (byte) 0);
            default:
                return new led0(ned0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((led0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        byte b = this.i;
        ned0 ned0Var = this.k;
        switch (b) {
            case 0:
                hru hruVar = ned0Var.u;
                lbu lbuVar = ned0Var.b;
                n4u n4uVar = ned0Var.t;
                k9u k9uVar = ned0Var.l;
                vpt vptVar = ned0Var.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (ned0Var.g.a().n0 && ned0Var.h.f15225a.a()) {
                        rou rouVar = ned0Var.f;
                        this.j = true;
                        objA = rouVar.a(true, this);
                        if (objA == wneVar) {
                            return wneVar;
                        }
                    } else {
                        ned0Var.x(new fed0(true, vptVar.a(), k9uVar.b(), n4uVar.f(), !lbuVar.j(), hruVar.i()));
                    }
                    return Unit.f46060a;
                }
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA = obj;
                boolean z2 = ((m2c0) objA).q0;
                ned0Var.x(new fed0(!z2, z2 ? false : vptVar.a(), k9uVar.b(), n4uVar.f(), !lbuVar.j(), hruVar.i()));
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    sd60 sd60Var = ned0Var.w;
                    this.j = true;
                    if (sd60Var.i("", this) == wneVar2) {
                        return wneVar2;
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
