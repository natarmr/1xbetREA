package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class fxj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xxj0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fxj0(xxj0 xxj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xxj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xxj0 xxj0Var = this.k;
        switch (b) {
            case 0:
                fxj0 fxj0Var = new fxj0(xxj0Var, yjeVar, (byte) 0);
                fxj0Var.j = obj;
                return fxj0Var;
            default:
                fxj0 fxj0Var2 = new fxj0(xxj0Var, yjeVar, (byte) 1);
                fxj0Var2.j = obj;
                return fxj0Var2;
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
        return ((fxj0) create(th, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        xxj0 xxj0Var = this.k;
        Throwable th = (Throwable) this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                xxj0Var.c.b(th, new jwj0(xxj0Var, (byte) 3));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                xxj0Var.c.b(th, new ogj0((byte) 21));
                break;
        }
        return Unit.f46060a;
    }
}
