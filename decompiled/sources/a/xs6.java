package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class xs6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dt6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xs6(dt6 dt6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dt6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dt6 dt6Var = this.k;
        switch (b) {
            case 0:
                xs6 xs6Var = new xs6(dt6Var, yjeVar, (byte) 0);
                xs6Var.j = obj;
                return xs6Var;
            default:
                xs6 xs6Var2 = new xs6(dt6Var, yjeVar, (byte) 1);
                xs6Var2.j = obj;
                return xs6Var2;
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
        return ((xs6) create(th, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        dt6 dt6Var = this.k;
        Throwable th = (Throwable) this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                dt6Var.U.b(th, new os6((byte) 5));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                dt6Var.U.b(th, new os6((byte) 6));
                break;
        }
        return Unit.f46060a;
    }
}
