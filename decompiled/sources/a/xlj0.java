package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class xlj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ bmj0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xlj0(bmj0 bmj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = bmj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bmj0 bmj0Var = this.j;
        switch (b) {
            case 0:
                return new xlj0(bmj0Var, yjeVar, (byte) 0);
            default:
                return new xlj0(bmj0Var, yjeVar, (byte) 1);
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
        return ((xlj0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        bmj0 bmj0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = bmj0.A;
                p7m0 p7m0Var = bmj0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, vlj0.a((vlj0) value, 0, null, null, true, false, 55)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                zvh0 zvh0Var = bmj0Var.w.a().g.x;
                p7m0 p7m0Var2 = bmj0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, vlj0.a((vlj0) value2, 0, zvh0Var, null, false, false, 61)));
                break;
        }
        return Unit.f46060a;
    }
}
