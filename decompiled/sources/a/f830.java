package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class f830 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ l830 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f830(l830 l830Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = l830Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        l830 l830Var = this.k;
        switch (b) {
            case 0:
                f830 f830Var = new f830(l830Var, yjeVar, (byte) 0);
                f830Var.j = obj;
                return f830Var;
            case 1:
                f830 f830Var2 = new f830(l830Var, yjeVar, (byte) 1);
                f830Var2.j = obj;
                return f830Var2;
            default:
                f830 f830Var3 = new f830(l830Var, yjeVar, (byte) 2);
                f830Var3.j = obj;
                return f830Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((f830) create((ycs) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((f830) create((aw20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((f830) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        l830 l830Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                ycs ycsVar = (ycs) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = l830.A;
                p7m0 p7m0Var = l830Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, m730.a((m730) value, null, null, null, 0L, null, ycsVar, 191)));
                break;
            case 1:
                aw20 aw20Var = (aw20) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = l830.A;
                p7m0 p7m0Var2 = l830Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, m730.a((m730) value2, null, null, null, 0L, aw20Var, null, 239)));
                break;
            default:
                List list = (List) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i3 = l830.A;
                p7m0 p7m0Var3 = l830Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, m730.a((m730) value3, list, null, null, 0L, null, null, 254)));
                break;
        }
        return Unit.f46060a;
    }
}
