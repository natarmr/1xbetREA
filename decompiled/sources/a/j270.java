package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class j270 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ n270 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j270(n270 n270Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = n270Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        n270 n270Var = this.j;
        switch (b) {
            case 0:
                return new j270(n270Var, yjeVar, (byte) 0);
            case 1:
                return new j270(n270Var, yjeVar, (byte) 1);
            default:
                return new j270(n270Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((j270) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((j270) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((j270) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        n270 n270Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                yje yjeVar = null;
                slb.U(new dnq(new fnq(n270Var.z.a(), new i270(n270Var, yjeVar, (byte) 2), (byte) 4), new pr60(3, yjeVar, (byte) 1), (byte) 1), d5c.S(jiu0.a(n270Var), n270Var.O.b));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (((c270) n270Var.D()).f == m170.f20993a && ((c270) n270Var.D()).h.isEmpty()) {
                    p7m0 p7m0Var = n270Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, c270.a((c270) value, null, null, null, false, true, null, null, null, 239)));
                }
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i = n270.Z;
                p7m0 p7m0Var2 = n270Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, c270.a((c270) value2, null, null, null, false, false, null, null, null, 239)));
                break;
        }
        return Unit.f46060a;
    }
}
