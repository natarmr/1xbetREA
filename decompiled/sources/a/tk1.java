package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class tk1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wk1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tk1(wk1 wk1Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wk1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wk1 wk1Var = this.k;
        switch (b) {
            case 0:
                tk1 tk1Var = new tk1(wk1Var, yjeVar, (byte) 0);
                tk1Var.j = obj;
                return tk1Var;
            default:
                tk1 tk1Var2 = new tk1(wk1Var, yjeVar, (byte) 1);
                tk1Var2.j = obj;
                return tk1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((tk1) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((tk1) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        wk1 wk1Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = wk1.w;
                p7m0 p7m0Var = wk1Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ok1.a((ok1) value, null, false, true, false, 25)));
                wk1Var.p.b(th, new xg1((byte) 3));
                break;
            default:
                uaq0 uaq0Var = (uaq0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = wk1.w;
                p7m0 p7m0Var2 = wk1Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    uaq0.f35345a.getClass();
                } while (!p7m0Var2.m(value2, ok1.a((ok1) value2, null, false, false, s9m0.l(uaq0Var), 15)));
                break;
        }
        return Unit.f46060a;
    }
}
