package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class j91 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ n91 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j91(n91 n91Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = n91Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        n91 n91Var = this.j;
        switch (b) {
            case 0:
                return new j91(n91Var, yjeVar, (byte) 0);
            default:
                return new j91(n91Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((j91) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        n91 n91Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = n91.f0;
                n91Var.G(q81.f28277a);
                p7m0 p7m0Var = n91Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, u81.a((u81) value, null, false, false, false, null, null, 0L, false, false, null, true, false, false, 0, null, 2080767)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = n91.f0;
                p7m0 p7m0Var2 = n91Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, u81.a((u81) value2, null, false, true, false, null, null, 0L, false, false, null, false, false, false, 0, null, 2097135)));
                break;
        }
        return Unit.f46060a;
    }
}
