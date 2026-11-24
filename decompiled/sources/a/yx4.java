package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class yx4 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ fy4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yx4(fy4 fy4Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = fy4Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        fy4 fy4Var = this.k;
        switch (b) {
            case 0:
                yx4 yx4Var = new yx4(fy4Var, yjeVar, (byte) 0);
                yx4Var.j = obj;
                return yx4Var;
            default:
                yx4 yx4Var2 = new yx4(fy4Var, yjeVar, (byte) 1);
                yx4Var2.j = obj;
                return yx4Var2;
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
        return ((yx4) create(th, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        fy4 fy4Var = this.k;
        Throwable th = (Throwable) this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                fy4Var.i.b(th, new tx4(fy4Var, (byte) 2));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                fy4Var.i.b(th, new o33((byte) 28));
                break;
        }
        return Unit.f46060a;
    }
}
