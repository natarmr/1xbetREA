package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class el4 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ il4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el4(il4 il4Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = il4Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        il4 il4Var = this.k;
        switch (b) {
            case 0:
                el4 el4Var = new el4(il4Var, yjeVar, (byte) 0);
                el4Var.j = obj;
                return el4Var;
            default:
                el4 el4Var2 = new el4(il4Var, yjeVar, (byte) 1);
                el4Var2.j = obj;
                return el4Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((el4) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((el4) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        il4 il4Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                String str = (String) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = il4Var.g;
                do {
                    value = p7m0Var.getValue();
                    ((cl4) value).getClass();
                } while (!p7m0Var.m(value, new cl4(str)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (((sw00) obj2).f32897a) {
                    p7m0 p7m0Var2 = il4Var.h;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, xk4.f41013a);
                }
                break;
        }
        return Unit.f46060a;
    }
}
