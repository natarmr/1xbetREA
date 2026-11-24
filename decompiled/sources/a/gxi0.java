package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class gxi0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xxi0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gxi0(xxi0 xxi0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xxi0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xxi0 xxi0Var = this.k;
        switch (b) {
            case 0:
                gxi0 gxi0Var = new gxi0(xxi0Var, yjeVar, (byte) 0);
                gxi0Var.j = obj;
                return gxi0Var;
            case 1:
                gxi0 gxi0Var2 = new gxi0(xxi0Var, yjeVar, (byte) 1);
                gxi0Var2.j = obj;
                return gxi0Var2;
            default:
                gxi0 gxi0Var3 = new gxi0(xxi0Var, yjeVar, (byte) 2);
                gxi0Var3.j = obj;
                return gxi0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((gxi0) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((gxi0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((gxi0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        xxi0 xxi0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                e7a e7aVar = (e7a) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (e7aVar instanceof d7a) {
                    c1j0 c1j0Var = new c1j0((d7a) e7aVar);
                    int i = xxi0.Y0;
                    xxi0Var.G(c1j0Var);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                return qjj.M((vne) obj2, null, new jxi0(xxi0Var, null, (byte) 1), 3);
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                return qjj.M((vne) obj2, null, new jxi0(xxi0Var, null, (byte) 2), 3);
        }
    }
}
