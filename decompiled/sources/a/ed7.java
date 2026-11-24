package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ed7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ kd7 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ed7(kd7 kd7Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = kd7Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kd7 kd7Var = this.k;
        switch (b) {
            case 0:
                ed7 ed7Var = new ed7(kd7Var, yjeVar, (byte) 0);
                ed7Var.j = obj;
                return ed7Var;
            default:
                ed7 ed7Var2 = new ed7(kd7Var, yjeVar, (byte) 1);
                ed7Var2.j = obj;
                return ed7Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Throwable th = (Throwable) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((ed7) create(th, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        kd7 kd7Var = this.k;
        Throwable th = (Throwable) this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                List list = kd7.m0;
                kd7Var.N(th);
                p7m0 p7m0Var = kd7Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, rc7.a((rc7) value, p9x.f26629a, false, null, null, null, null, null, null, null, false, false, false, 0L, 0L, 268435454)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                kd7Var.f0.b(th, new zc7(kd7Var, (byte) 6));
                p7m0 p7m0Var2 = kd7Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, rc7.a((rc7) value2, null, false, null, null, null, null, null, null, null, false, false, false, 0L, 0L, 267911167)));
                break;
        }
        return Unit.f46060a;
    }
}
