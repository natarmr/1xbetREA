package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class ec1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ kc1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec1(kc1 kc1Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = kc1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kc1 kc1Var = this.j;
        switch (b) {
            case 0:
                return new ec1(kc1Var, yjeVar, (byte) 0);
            default:
                return new ec1(kc1Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((ec1) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        kc1 kc1Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                List list = kc1.P;
                p7m0 p7m0Var = kc1Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, xb1.a((xb1) value, null, null, false, 0L, 0L, 0L, true, 1919)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ((xb1) kc1Var.D()).j.add(ju0.d);
                kc1Var.G(new tb1(((xb1) kc1Var.D()).g, ((xb1) kc1Var.D()).f));
                break;
        }
        return Unit.f46060a;
    }
}
