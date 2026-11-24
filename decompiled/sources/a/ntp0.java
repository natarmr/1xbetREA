package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ntp0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rtp0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ntp0(rtp0 rtp0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rtp0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rtp0 rtp0Var = this.k;
        switch (b) {
            case 0:
                ntp0 ntp0Var = new ntp0(rtp0Var, yjeVar, (byte) 0);
                ntp0Var.j = obj;
                return ntp0Var;
            default:
                ntp0 ntp0Var2 = new ntp0(rtp0Var, yjeVar, (byte) 1);
                ntp0Var2.j = obj;
                return ntp0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ntp0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ntp0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        rtp0 rtp0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                rtp0Var.t.b((Throwable) obj2, new zgp0((byte) 16));
                break;
            default:
                uaq0 uaq0Var = (uaq0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                nc5 nc5VarS = rtp0Var.q.s(rtp0Var.E, rtp0Var.F, uaq0Var, 0L);
                p7m0 p7m0Var = rtp0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, gsp0.a((gsp0) value, null, null, nc5VarS, null, false, false, false, false, 251)));
                break;
        }
        return Unit.f46060a;
    }
}
