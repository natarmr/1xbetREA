package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class pj6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ dk6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pj6(dk6 dk6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dk6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dk6 dk6Var = this.k;
        switch (b) {
            case 0:
                return new pj6(dk6Var, yjeVar, (byte) 0);
            case 1:
                pj6 pj6Var = new pj6(dk6Var, yjeVar, (byte) 1);
                pj6Var.j = ((Boolean) obj).booleanValue();
                return pj6Var;
            case 2:
                pj6 pj6Var2 = new pj6(dk6Var, yjeVar, (byte) 2);
                pj6Var2.j = ((Boolean) obj).booleanValue();
                return pj6Var2;
            case 3:
                pj6 pj6Var3 = new pj6(dk6Var, yjeVar, (byte) 3);
                pj6Var3.j = ((Boolean) obj).booleanValue();
                return pj6Var3;
            default:
                return new pj6(dk6Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((pj6) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((pj6) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((pj6) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((pj6) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((pj6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        dk6 dk6Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    clc clcVar = dk6Var.A;
                    this.j = true;
                    Unit unitA = ((bl6) clcVar.b).a();
                    if (unitA != wneVar) {
                        unitA = Unit.f46060a;
                    }
                    if (unitA == wneVar) {
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
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = dk6.K;
                p7m0 p7m0Var = dk6Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, hj6.a((hj6) value, false, null, null, null, null, null, z2, null, 8127)));
                return Unit.f46060a;
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = dk6.K;
                p7m0 p7m0Var2 = dk6Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, hj6.a((hj6) value2, false, null, null, null, null, null, false, null, 8189)));
                if (z3) {
                    boolean z4 = ((hj6) dk6Var.D()).f13145a;
                    Long l = ((hj6) dk6Var.D()).e;
                    if (l != null) {
                        dk6Var.M(z4, l.longValue());
                    }
                } else {
                    bby bbyVar = dk6Var.G;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    dk6Var.G = null;
                }
                return Unit.f46060a;
            case 3:
                boolean z5 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i3 = dk6.K;
                p7m0 p7m0Var3 = dk6Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, hj6.a((hj6) value3, z5, null, null, null, null, null, false, null, 8190)));
                Long l2 = ((hj6) dk6Var.D()).e;
                if (l2 != null) {
                    dk6Var.M(z5, l2.longValue());
                }
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    vkr0 vkr0Var = dk6Var.E;
                    this.j = true;
                    if (vkr0Var.t(this) == wneVar5) {
                        return wneVar5;
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
}
