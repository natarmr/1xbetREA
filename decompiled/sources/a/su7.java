package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class su7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ tu7 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ su7(tu7 tu7Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = tu7Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        tu7 tu7Var = this.k;
        switch (b) {
            case 0:
                su7 su7Var = new su7(tu7Var, yjeVar, (byte) 0);
                su7Var.j = obj;
                return su7Var;
            default:
                su7 su7Var2 = new su7(tu7Var, yjeVar, (byte) 1);
                su7Var2.j = obj;
                return su7Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((su7) create((a8h0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((su7) create((qqp0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        cu7 cu7Var;
        Object value2;
        Object value3;
        byte b = this.i;
        tu7 tu7Var = this.k;
        switch (b) {
            case 0:
                ocj ocjVar = tu7Var.i;
                a8h0 a8h0Var = (a8h0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if ((a8h0Var != null ? a8h0Var.b : null) != null) {
                    z7h0 z7h0Var = a8h0Var.b;
                    if (z7h0Var != null) {
                        if (z7h0Var instanceof y7h0) {
                            cu7Var = cu7.f4974a;
                        } else if (z7h0Var instanceof x7h0) {
                            cu7Var = cu7.b;
                        }
                        cu7 cu7Var2 = cu7Var;
                        int i = tu7.D;
                        p7m0 p7m0Var = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var.getValue();
                            value2.getClass();
                        } while (!p7m0Var.m(value2, pu7.a((pu7) value2, null, cu7Var2, 0L, null, 13)));
                    }
                    t9f.b();
                    return null;
                }
                int i2 = tu7.D;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                } while (!p7m0Var2.m(value, pu7.a((pu7) value, null, null, 0L, a8h0Var, 7)));
                return Unit.f46060a;
            default:
                qqp0 qqp0Var = (qqp0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i3 = tu7.D;
                p7m0 p7m0Var3 = tu7Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, pu7.a((pu7) value3, qqp0Var, null, 0L, null, 14)));
                return Unit.f46060a;
        }
    }
}
