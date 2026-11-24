package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class i91 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ n91 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i91(n91 n91Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = n91Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        n91 n91Var = this.k;
        switch (b) {
            case 0:
                i91 i91Var = new i91(n91Var, yjeVar, (byte) 0);
                i91Var.j = obj;
                return i91Var;
            default:
                i91 i91Var2 = new i91(n91Var, yjeVar, (byte) 1);
                i91Var2.j = obj;
                return i91Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((i91) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((i91) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        switch (this.i) {
            case 0:
                sw00 sw00Var = (sw00) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = n91.f0;
                n91 n91Var = this.k;
                p7m0 p7m0Var = n91Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, u81.a((u81) value, null, false, false, false, null, null, 0L, false, sw00Var.f32897a, null, false, false, false, 0, null, 2095103)));
                n91Var.I(n91Var.q.b, new c21(1, n91Var, n91.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 7), new y81(n91Var, null, (byte) 4));
                n91Var.T();
                if (!sw00Var.b && sw00Var.f32897a) {
                    n91Var.N();
                }
                n91Var.O();
                break;
            default:
                ql5 ql5Var = (ql5) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = n91.f0;
                p7m0 p7m0Var2 = this.k.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, u81.a((u81) value2, null, false, false, false, null, null, 0L, false, false, ql5Var, false, false, false, 0, null, 2093055)));
                break;
        }
        return Unit.f46060a;
    }
}
