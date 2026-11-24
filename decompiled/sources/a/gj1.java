package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class gj1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ nj1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gj1(nj1 nj1Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = nj1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        nj1 nj1Var = this.k;
        switch (b) {
            case 0:
                gj1 gj1Var = new gj1(nj1Var, yjeVar, (byte) 0);
                gj1Var.j = obj;
                return gj1Var;
            case 1:
                gj1 gj1Var2 = new gj1(nj1Var, yjeVar, (byte) 1);
                gj1Var2.j = obj;
                return gj1Var2;
            default:
                gj1 gj1Var3 = new gj1(nj1Var, yjeVar, (byte) 2);
                gj1Var3.j = obj;
                return gj1Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((gj1) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((gj1) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((gj1) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        nj1 nj1Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                uaq0 uaq0Var = (uaq0) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = nj1.E;
                p7m0 p7m0Var = nj1Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    uaq0.f35345a.getClass();
                } while (!p7m0Var.m(value, bj1.a((bj1) value, null, null, null, null, false, null, null, s9m0.l(uaq0Var), 2047)));
                break;
            case 1:
                Throwable th = (Throwable) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = nj1.E;
                p7m0 p7m0Var2 = nj1Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, bj1.a((bj1) value2, jhe.f16522a, null, null, null, false, null, null, false, 4094)));
                nj1Var.u.b(th, new xg1((byte) 1));
                break;
            default:
                String str = (String) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                String str2 = StringsKt.u0(str).toString().length() >= 3 ? str : "";
                boolean zEquals = str2.equals(((bj1) nj1Var.D()).i);
                p7m0 p7m0Var3 = nj1Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    oyg0 oyg0Var = nj1Var.f;
                    q7x.F(oyg0Var, str, "SEARCH_QUERY_KEY");
                    q7x.F(oyg0Var, str2, "FILTER_QUERY_KEY");
                } while (!p7m0Var3.m(value3, bj1.a((bj1) value3, null, null, null, null, false, str, str2, false, 3711)));
                if (!zEquals) {
                    nj1Var.N();
                }
                break;
        }
        return Unit.f46060a;
    }
}
