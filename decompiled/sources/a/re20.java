package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class re20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ qg20 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ re20(qg20 qg20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = qg20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qg20 qg20Var = this.j;
        switch (b) {
            case 0:
                return new re20(qg20Var, yjeVar, (byte) 0);
            default:
                return new re20(qg20Var, yjeVar, (byte) 1);
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
        return ((re20) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        qg20 qg20Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = qg20Var.Y0;
                p7m0Var.getClass();
                p7m0Var.o(null, n40.f22874a);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                qg20Var.g0(cwo0.f5091a);
                break;
        }
        return Unit.f46060a;
    }
}
