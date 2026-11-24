package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class qwj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ xxj0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qwj0(xxj0 xxj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = xxj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xxj0 xxj0Var = this.j;
        switch (b) {
            case 0:
                return new qwj0(xxj0Var, yjeVar, (byte) 0);
            default:
                return new qwj0(xxj0Var, yjeVar, (byte) 1);
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
        return ((qwj0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        xxj0 xxj0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = xxj0Var.x0;
                p7m0Var.getClass();
                p7m0Var.o(null, m40.f21142a);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                xxj0Var.Q(bwo0.f3335a);
                break;
        }
        return Unit.f46060a;
    }
}
