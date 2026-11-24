package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class wop0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zop0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wop0(zop0 zop0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = zop0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zop0 zop0Var = this.k;
        switch (b) {
            case 0:
                wop0 wop0Var = new wop0(zop0Var, yjeVar, (byte) 0);
                wop0Var.j = obj;
                return wop0Var;
            default:
                wop0 wop0Var2 = new wop0(zop0Var, yjeVar, (byte) 1);
                wop0Var2.j = obj;
                return wop0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wop0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wop0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        zop0 zop0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                zop0Var.r.b((Throwable) obj2, new zgp0((byte) 10));
                break;
            default:
                uaq0 uaq0Var = (uaq0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                nc5 nc5VarS = zop0Var.x.s(zop0Var.o, zop0Var.p, uaq0Var, 0L);
                p7m0 p7m0Var = zop0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, oop0.a((oop0) value, null, null, nc5VarS, false, false, false, null, 123)));
                break;
        }
        return Unit.f46060a;
    }
}
