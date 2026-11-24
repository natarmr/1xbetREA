package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class gd2 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hd2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gd2(hd2 hd2Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hd2Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hd2 hd2Var = this.k;
        switch (b) {
            case 0:
                gd2 gd2Var = new gd2(hd2Var, yjeVar, (byte) 0);
                gd2Var.j = obj;
                return gd2Var;
            default:
                gd2 gd2Var2 = new gd2(hd2Var, yjeVar, (byte) 1);
                gd2Var2.j = obj;
                return gd2Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((gd2) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((gd2) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        hd2 hd2Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                List list = (List) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = hd2.z;
                p7m0 p7m0Var = hd2Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ad2.a((ad2) value, list, null, false, false, false, false, null, 4038)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                hd2Var.t.b((Throwable) obj2, new ma2((byte) 3));
                break;
        }
        return Unit.f46060a;
    }
}
