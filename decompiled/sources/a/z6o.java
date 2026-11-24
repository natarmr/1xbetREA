package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class z6o extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ b7o k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6o(b7o b7oVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = b7oVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        b7o b7oVar = this.k;
        switch (b) {
            case 0:
                z6o z6oVar = new z6o(b7oVar, yjeVar, (byte) 0);
                z6oVar.j = obj;
                return z6oVar;
            case 1:
                z6o z6oVar2 = new z6o(b7oVar, yjeVar, (byte) 1);
                z6oVar2.j = obj;
                return z6oVar2;
            default:
                z6o z6oVar3 = new z6o(b7oVar, yjeVar, (byte) 2);
                z6oVar3.j = obj;
                return z6oVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((z6o) create((xsr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((z6o) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((z6o) create((bqr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        b7o b7oVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = ((xsr) obj2) instanceof usr;
                b7oVar.o.e("auto_start_stream_enabled_key", Boolean.valueOf(z));
                p7m0 p7m0Var = b7oVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, l6o.a((l6o) value, null, null, null, null, null, null, false, null, false, z, null, null, 0L, false, 66584575)));
                break;
            case 1:
                List list = (List) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = b7o.X;
                p7m0 p7m0Var2 = b7oVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, l6o.a((l6o) value2, null, null, null, null, null, null, false, list, false, false, null, null, 0L, false, 67104767)));
                break;
            default:
                bqr bqrVar = (bqr) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = b7o.X;
                p7m0 p7m0Var3 = b7oVar.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, l6o.a((l6o) value3, null, null, null, null, bqrVar, null, false, null, false, false, null, null, 0L, false, 67108831)));
                break;
        }
        return Unit.f46060a;
    }
}
