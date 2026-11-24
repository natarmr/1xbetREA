package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class w51 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ b61 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w51(b61 b61Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = b61Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        b61 b61Var = this.k;
        switch (b) {
            case 0:
                w51 w51Var = new w51(b61Var, yjeVar, (byte) 0);
                w51Var.j = ((Boolean) obj).booleanValue();
                return w51Var;
            case 1:
                return new w51(b61Var, yjeVar, (byte) 1);
            case 2:
                return new w51(b61Var, yjeVar, (byte) 2);
            default:
                w51 w51Var2 = new w51(b61Var, yjeVar, (byte) 3);
                w51Var2.j = ((Boolean) obj).booleanValue();
                return w51Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((w51) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((w51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((w51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((w51) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        b61 b61Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = b61Var.C;
                do {
                    value = p7m0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p7m0Var.m(value, Boolean.valueOf(z)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    kd30 kd30Var = b61Var.t;
                    this.j = true;
                    if (kd30Var.N() == wneVar2) {
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
                    i89 i89VarA = b61Var.p.a(bm5.e);
                    x51 x51Var = new x51(b61Var, null, (byte) 0);
                    this.j = true;
                    if (slb.O(i89VarA, x51Var, this) == wneVar3) {
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
            default:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                boolean z5 = b61Var.x;
                b61Var.x = z4;
                if (!z5 && z4) {
                    b61Var.y();
                }
                return Unit.f46060a;
        }
    }
}
