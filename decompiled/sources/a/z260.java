package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class z260 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ v360 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z260(v360 v360Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = v360Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        v360 v360Var = this.k;
        switch (b) {
            case 0:
                z260 z260Var = new z260(v360Var, yjeVar, (byte) 0);
                z260Var.j = obj;
                return z260Var;
            case 1:
                z260 z260Var2 = new z260(v360Var, yjeVar, (byte) 1);
                z260Var2.j = obj;
                return z260Var2;
            default:
                z260 z260Var3 = new z260(v360Var, yjeVar, (byte) 2);
                z260Var3.j = obj;
                return z260Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((z260) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((z260) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((z260) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        v360 v360Var = this.k;
        switch (b) {
            case 0:
                List list = (List) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                v360 v360Var2 = this.k;
                i3t0.A(v360Var2, v360Var2.o0, new did(list), null, null, 6);
                p7m0 p7m0Var = v360Var2.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, c260.a((c260) value, null, false, false, false, null, false, null, null, null, null, 261879)));
                break;
            case 1:
                List list2 = (List) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = v360.x0;
                p7m0 p7m0Var2 = v360Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, c260.a((c260) value2, null, false, false, false, null, false, list2, null, null, null, 261119)));
                break;
            default:
                sw00 sw00Var = (sw00) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = v360.x0;
                p7m0 p7m0Var3 = v360Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, c260.a((c260) value3, null, false, sw00Var.f32897a, false, null, false, null, null, null, null, 262111)));
                break;
        }
        return Unit.f46060a;
    }
}
