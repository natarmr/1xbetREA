package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class d340 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ j340 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d340(j340 j340Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = j340Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        j340 j340Var = this.j;
        switch (b) {
            case 0:
                return new d340(j340Var, yjeVar, (byte) 0);
            case 1:
                return new d340(j340Var, yjeVar, (byte) 1);
            default:
                return new d340(j340Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((d340) create((ab50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((d340) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((d340) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        j340 j340Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = j340.i1;
                p7m0 p7m0Var = j340Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, d140.a((d140) value, false, false, false, null, null, null, null, null, null, false, true, null, false, null, null, null, null, null, null, 1073737727)));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                j340Var.L.t(cww.O(((d140) j340Var.D()).s));
                j340Var.G(x040.f40053a);
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (j340Var.V0.r(fk60.MENU_TAB_AGGREGATOR)) {
                    p7m0 p7m0Var2 = j340Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, d140.a((d140) value2, false, false, false, null, null, null, null, null, null, false, false, null, false, null, null, null, null, null, null, 536870911)));
                    j340Var.G(s040.f31396a);
                }
                j340Var.X0.i(false);
                break;
        }
        return Unit.f46060a;
    }
}
