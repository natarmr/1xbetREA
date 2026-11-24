package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class iw50 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ kw50 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iw50(kw50 kw50Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = kw50Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kw50 kw50Var = this.k;
        switch (b) {
            case 0:
                iw50 iw50Var = new iw50(kw50Var, yjeVar, (byte) 0);
                iw50Var.j = ((Boolean) obj).booleanValue();
                return iw50Var;
            case 1:
                return new iw50(kw50Var, yjeVar, (byte) 1);
            default:
                return new iw50(kw50Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((iw50) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((iw50) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((iw50) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object objA2;
        Object value2;
        byte b = this.i;
        kw50 kw50Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                kw50Var.M = z;
                if (z) {
                    kw50Var.S();
                } else if (!z && ((zv50) kw50Var.D()).f45041a.equals(kr5.B)) {
                    p7m0 p7m0Var = kw50Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, zv50.a((zv50) value, kr5.B, null, null, false, null, 0, false, false, false, false, 65530)));
                    kw50Var.T(mk80.b);
                } else if (!z && !((zv50) kw50Var.D()).f45041a.equals(kr5.B)) {
                    return Unit.f46060a;
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (kw50Var.v.f15225a.a()) {
                        rou rouVar = kw50Var.p;
                        this.j = true;
                        objA = rouVar.a(false, this);
                        if (objA == wneVar2) {
                            return wneVar2;
                        }
                    } else {
                        kw50Var.Q(u7x.C());
                    }
                    return Unit.f46060a;
                }
                if (!z2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA = obj;
                int i = kw50.N;
                kw50Var.Q((m2c0) objA);
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    int i2 = kw50.N;
                    if (kw50Var.v.f15225a.a()) {
                        rou rouVar2 = kw50Var.p;
                        this.j = true;
                        objA2 = rouVar2.a(true, this);
                        if (objA2 == wneVar3) {
                            return wneVar3;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA2 = obj;
                boolean z4 = ((m2c0) objA2).n0;
                int i3 = kw50.N;
                p7m0 p7m0Var2 = kw50Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, zv50.a((zv50) value2, null, null, null, false, null, 0, false, false, z4, false, 40959)));
                return Unit.f46060a;
        }
    }
}
