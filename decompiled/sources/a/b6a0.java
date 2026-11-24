package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b6a0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ d6a0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b6a0(d6a0 d6a0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = d6a0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        d6a0 d6a0Var = this.k;
        switch (b) {
            case 0:
                b6a0 b6a0Var = new b6a0(d6a0Var, yjeVar, (byte) 0);
                b6a0Var.j = obj;
                return b6a0Var;
            default:
                b6a0 b6a0Var2 = new b6a0(d6a0Var, yjeVar, (byte) 1);
                b6a0Var2.j = obj;
                return b6a0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((b6a0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((b6a0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        d6a0 d6a0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                d6a0Var.u.b((Throwable) obj2, new so90((byte) 23));
                break;
            default:
                uaq0 uaq0Var = (uaq0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                nc5 nc5VarS = d6a0Var.o.s(d6a0Var.q, d6a0Var.s, uaq0Var, 0L);
                p7m0 p7m0Var = d6a0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, v5a0.a((v5a0) value, nc5VarS, false, false, false, null, 62)));
                break;
        }
        return Unit.f46060a;
    }
}
