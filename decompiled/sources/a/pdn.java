package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class pdn extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ sdn k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pdn(sdn sdnVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = sdnVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        sdn sdnVar = this.k;
        switch (b) {
            case 0:
                pdn pdnVar = new pdn(sdnVar, yjeVar, (byte) 0);
                pdnVar.j = obj;
                return pdnVar;
            default:
                pdn pdnVar2 = new pdn(sdnVar, yjeVar, (byte) 1);
                pdnVar2.j = obj;
                return pdnVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((pdn) create((aw20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((pdn) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        sdn sdnVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                aw20 aw20Var = (aw20) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = sdn.B;
                p7m0 p7m0Var = sdnVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, cdn.a((cdn) value, null, null, null, false, null, aw20Var, 191)));
                break;
            default:
                List list = (List) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = sdn.B;
                p7m0 p7m0Var2 = sdnVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, cdn.a((cdn) value2, list, null, null, false, null, null, 254)));
                break;
        }
        return Unit.f46060a;
    }
}
