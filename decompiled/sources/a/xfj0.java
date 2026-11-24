package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class xfj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ngj0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xfj0(ngj0 ngj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ngj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ngj0 ngj0Var = this.k;
        switch (b) {
            case 0:
                xfj0 xfj0Var = new xfj0(ngj0Var, yjeVar, (byte) 0);
                xfj0Var.j = obj;
                return xfj0Var;
            default:
                xfj0 xfj0Var2 = new xfj0(ngj0Var, yjeVar, (byte) 1);
                xfj0Var2.j = obj;
                return xfj0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xfj0) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xfj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ngj0 ngj0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                e7a e7aVar = (e7a) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (e7aVar instanceof d7a) {
                    c1j0 c1j0Var = new c1j0((d7a) e7aVar);
                    int i = ngj0.Y0;
                    ngj0Var.G(c1j0Var);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                return qjj.M((vne) obj2, null, new agj0(ngj0Var, null, (byte) 1), 3);
        }
    }
}
