package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class a4q0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ d4q0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4q0(d4q0 d4q0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = d4q0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        d4q0 d4q0Var = this.k;
        switch (b) {
            case 0:
                a4q0 a4q0Var = new a4q0(d4q0Var, yjeVar, (byte) 0);
                a4q0Var.j = obj;
                return a4q0Var;
            default:
                a4q0 a4q0Var2 = new a4q0(d4q0Var, yjeVar, (byte) 1);
                a4q0Var2.j = obj;
                return a4q0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((a4q0) create((r3q0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((a4q0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        d4q0 d4q0Var = this.k;
        switch (b) {
            case 0:
                oyg0 oyg0Var = d4q0Var.f;
                ocj ocjVar = d4q0Var.i;
                r3q0 r3q0Var = (r3q0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (r3q0Var != null) {
                    if (r3q0Var instanceof q3q0) {
                        q3q0 q3q0Var = (q3q0) r3q0Var;
                        int i = d4q0.A;
                        p7m0 p7m0Var = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var.getValue();
                            value2.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var.m(value2, s3q0.a((s3q0) value2, false, false, false, 0, q3q0Var.f28064a, null, null, 105)));
                    } else if (r3q0Var instanceof p3q0) {
                        int i2 = d4q0.A;
                        p7m0 p7m0Var2 = ocjVar.f25029a;
                        do {
                            value = p7m0Var2.getValue();
                            value.getClass();
                        } while (!p7m0Var2.m(value, s3q0.a((s3q0) value, false, false, true, 0, null, null, null, 121)));
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                uaq0 uaq0Var = (uaq0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                nc5 nc5VarS = d4q0Var.x.s(d4q0Var.o, d4q0Var.p, uaq0Var, 0L);
                p7m0 p7m0Var3 = d4q0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, s3q0.a((s3q0) value3, false, false, false, 0, null, null, nc5VarS, 63)));
                return Unit.f46060a;
        }
    }
}
