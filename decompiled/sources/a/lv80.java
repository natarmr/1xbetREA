package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class lv80 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rv80 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lv80(rv80 rv80Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rv80Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rv80 rv80Var = this.k;
        switch (b) {
            case 0:
                lv80 lv80Var = new lv80(rv80Var, yjeVar, (byte) 0);
                lv80Var.j = obj;
                return lv80Var;
            case 1:
                lv80 lv80Var2 = new lv80(rv80Var, yjeVar, (byte) 1);
                lv80Var2.j = obj;
                return lv80Var2;
            case 2:
                lv80 lv80Var3 = new lv80(rv80Var, yjeVar, (byte) 2);
                lv80Var3.j = obj;
                return lv80Var3;
            default:
                lv80 lv80Var4 = new lv80(rv80Var, yjeVar, (byte) 3);
                lv80Var4.j = obj;
                return lv80Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((lv80) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((lv80) create((cm80) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((lv80) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((lv80) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        byte b2 = 3;
        rv80 rv80Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                kv80 kv80Var = new kv80((List) obj2, (byte) 0);
                int i = rv80.V;
                rv80Var.H(kv80Var);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                uj1 uj1Var = new uj1((cm80) obj2, b2);
                int i2 = rv80.V;
                rv80Var.H(uj1Var);
                break;
            case 2:
                sw00 sw00Var = (sw00) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i3 = rv80.V;
                p7m0 p7m0Var = rv80Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, yu80.a((yu80) value, false, false, false, sw00Var.f32897a, false, null, null, null, null, 131063)));
                rv80Var.Q();
                rv80Var.R();
                rv80Var.O();
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                rv80Var.B.b((Throwable) obj2, new ht80((byte) 3));
                break;
        }
        return Unit.f46060a;
    }
}
