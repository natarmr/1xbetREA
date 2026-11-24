package a;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class lgv0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ mgv0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lgv0(mgv0 mgv0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = mgv0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        mgv0 mgv0Var = this.k;
        switch (b) {
            case 0:
                lgv0 lgv0Var = new lgv0(mgv0Var, yjeVar, (byte) 0);
                lgv0Var.j = obj;
                return lgv0Var;
            default:
                lgv0 lgv0Var2 = new lgv0(mgv0Var, yjeVar, (byte) 1);
                lgv0Var2.j = obj;
                return lgv0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((lgv0) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((lgv0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        mgv0 mgv0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                String str = (String) ((Pair) obj2).b;
                int i = mgv0.w;
                p7m0 p7m0Var = mgv0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, dgv0.a((dgv0) value, false, str, false, null, 13)));
                break;
            default:
                List list = (List) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = mgv0.w;
                p7m0 p7m0Var2 = mgv0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, dgv0.a((dgv0) value2, false, null, false, list, 6)));
                break;
        }
        return Unit.f46060a;
    }
}
