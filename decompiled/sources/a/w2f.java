package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class w2f extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ a3f j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w2f(a3f a3fVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = a3fVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        a3f a3fVar = this.j;
        switch (b) {
            case 0:
                return new w2f(a3fVar, yjeVar, (byte) 0);
            default:
                return new w2f(a3fVar, yjeVar, (byte) 1);
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
        return ((w2f) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        a3f a3fVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = a3f.H;
                p7m0 p7m0Var = a3fVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, l2f.a((l2f) value, null, true, false, null, 0, 1021)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = a3f.H;
                p7m0 p7m0Var2 = a3fVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, l2f.a((l2f) value2, null, true, false, null, 0, 1021)));
                break;
        }
        return Unit.f46060a;
    }
}
