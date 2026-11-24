package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class yla0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ cma0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yla0(cma0 cma0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = cma0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        cma0 cma0Var = this.j;
        switch (b) {
            case 0:
                return new yla0(cma0Var, yjeVar, (byte) 0);
            default:
                return new yla0(cma0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((yla0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((yla0) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        cma0 cma0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                bby bbyVar = cma0Var.I;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                cma0Var.I = null;
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                lla0 lla0VarA = lla0.a((lla0) cma0Var.D(), null, null, null, null, null, 0, cma0Var.x.q(), false, false, false, false, 3967);
                p7m0 p7m0Var = cma0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, lla0VarA));
                break;
        }
        return Unit.f46060a;
    }
}
