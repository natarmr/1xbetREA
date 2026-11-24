package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class de0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ oe0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ de0(oe0 oe0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = oe0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        oe0 oe0Var = this.j;
        switch (b) {
            case 0:
                return new de0(oe0Var, yjeVar, (byte) 0);
            default:
                return new de0(oe0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((de0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((de0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        oe0 oe0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = oe0.I;
                p7m0 p7m0Var = oe0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, wd0.a((wd0) value, td0.f33741a, null, null, 14)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = oe0.I;
                oe0Var.M(false);
                break;
        }
        return Unit.f46060a;
    }
}
