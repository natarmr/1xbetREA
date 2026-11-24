package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class uu70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ bv70 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uu70(bv70 bv70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = bv70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bv70 bv70Var = this.j;
        switch (b) {
            case 0:
                return new uu70(bv70Var, yjeVar, (byte) 0);
            case 1:
                return new uu70(bv70Var, yjeVar, (byte) 1);
            default:
                return new uu70(bv70Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((uu70) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((uu70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((uu70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        bv70 bv70Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = bv70.g0;
                bv70Var.G(xt70.f41451a);
                p7m0 p7m0Var = bv70Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, hu70.a((hu70) value, 0, 0, false, false, false, false, false, false, false, false, null, false, false, false, null, false, iun.f15405a, null, false, 1949695)));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = bv70.g0;
                p7m0 p7m0Var2 = bv70Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, hu70.a((hu70) value2, 0, 0, false, false, true, false, false, false, false, false, null, false, false, false, null, false, null, null, false, 2097135)));
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (!((hu70) bv70Var.D()).r.isEmpty()) {
                    p7m0 p7m0Var3 = bv70Var.i.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                    } while (!p7m0Var3.m(value3, hu70.a((hu70) value3, 0, 0, false, false, true, false, false, false, false, false, null, false, false, false, null, false, null, null, false, 2097135)));
                }
                break;
        }
        return Unit.f46060a;
    }
}
