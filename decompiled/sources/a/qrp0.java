package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class qrp0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ urp0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qrp0(urp0 urp0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = urp0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        urp0 urp0Var = this.k;
        switch (b) {
            case 0:
                qrp0 qrp0Var = new qrp0(urp0Var, yjeVar, (byte) 0);
                qrp0Var.j = obj;
                return qrp0Var;
            default:
                qrp0 qrp0Var2 = new qrp0(urp0Var, yjeVar, (byte) 1);
                qrp0Var2.j = obj;
                return qrp0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qrp0) create((erp0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((qrp0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        urp0 urp0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                urp0Var.E((erp0) obj2);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = urp0Var.p;
                mrp0 mrp0Var = new mrp0((List) obj2);
                p7m0Var.getClass();
                p7m0Var.o(null, mrp0Var);
                break;
        }
        return Unit.f46060a;
    }
}
