package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class h5k0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ k5k0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h5k0(k5k0 k5k0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = k5k0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        k5k0 k5k0Var = this.k;
        switch (b) {
            case 0:
                h5k0 h5k0Var = new h5k0(k5k0Var, yjeVar, (byte) 0);
                h5k0Var.j = obj;
                return h5k0Var;
            case 1:
                h5k0 h5k0Var2 = new h5k0(k5k0Var, yjeVar, (byte) 1);
                h5k0Var2.j = obj;
                return h5k0Var2;
            default:
                h5k0 h5k0Var3 = new h5k0(k5k0Var, yjeVar, (byte) 2);
                h5k0Var3.j = obj;
                return h5k0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((h5k0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((h5k0) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((h5k0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        k5k0 k5k0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                k5k0Var.r.b((Throwable) obj2, new ogj0((byte) 29));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (((hdm0) obj2) instanceof gdm0) {
                    nc5 nc5VarS = k5k0Var.p.s(k5k0Var.C, k5k0Var.D, k5k0Var.q.a(), 0L);
                    p7m0 p7m0Var = k5k0Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, b5k0.a((b5k0) value, null, nc5VarS, null, false, false, false, 123)));
                }
                break;
            default:
                uaq0 uaq0Var = (uaq0) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                nc5 nc5VarS2 = k5k0Var.p.s(k5k0Var.C, k5k0Var.D, uaq0Var, 0L);
                p7m0 p7m0Var2 = k5k0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, b5k0.a((b5k0) value2, null, nc5VarS2, null, false, false, false, 123)));
                break;
        }
        return Unit.f46060a;
    }
}
