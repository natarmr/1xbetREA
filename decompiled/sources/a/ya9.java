package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ya9 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ab9 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya9(ab9 ab9Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ab9Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ab9 ab9Var = this.k;
        switch (b) {
            case 0:
                ya9 ya9Var = new ya9(ab9Var, yjeVar, (byte) 0);
                ya9Var.j = obj;
                return ya9Var;
            default:
                ya9 ya9Var2 = new ya9(ab9Var, yjeVar, (byte) 1);
                ya9Var2.j = obj;
                return ya9Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        List list = (List) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((ya9) create(list, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        ab9 ab9Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                List list = (List) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = ab9.B;
                p7m0 p7m0Var = ab9Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, pa9.a((pa9) value, null, null, null, false, list, null, null, null, false, 495)));
                break;
            default:
                List list2 = (List) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = ab9.B;
                p7m0 p7m0Var2 = ab9Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, pa9.a((pa9) value2, null, null, null, false, null, list2, null, null, false, 479)));
                break;
        }
        return Unit.f46060a;
    }
}
