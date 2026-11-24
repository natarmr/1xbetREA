package a;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class h890 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ j890 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h890(j890 j890Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = j890Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        j890 j890Var = this.j;
        switch (b) {
            case 0:
                return new h890(j890Var, yjeVar, (byte) 0);
            default:
                return new h890(j890Var, yjeVar, (byte) 1);
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
        return ((h890) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object g0g0Var;
        Map map;
        Object value;
        d890 d890Var;
        byte b = this.i;
        j890 j890Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = j890.x;
                int i2 = j890Var.o.f46908a;
                if (i2 >= 0) {
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        g0g0Var = j890Var.p.b(i2);
                    } catch (Throwable th) {
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                    }
                    Object obj2 = lun.f20680a;
                    obj2.getClass();
                    if (g0g0Var instanceof g0g0) {
                        g0g0Var = obj2;
                    }
                    map = (Map) g0g0Var;
                } else {
                    map = lun.f20680a;
                    map.getClass();
                }
                Map map2 = map;
                p7m0 p7m0Var = j890Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    d890Var = (d890) value;
                } while (!p7m0Var.m(value, d890.a(d890Var, map2, d890Var.d + 1, c890.f3903a, false, 35)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                j890Var.G(new y790(j890Var.r.f15748a.b()));
                break;
        }
        return Unit.f46060a;
    }
}
