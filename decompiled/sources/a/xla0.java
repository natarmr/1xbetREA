package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class xla0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ cma0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xla0(cma0 cma0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = cma0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        cma0 cma0Var = this.k;
        switch (b) {
            case 0:
                xla0 xla0Var = new xla0(cma0Var, yjeVar, (byte) 0);
                xla0Var.j = obj;
                return xla0Var;
            case 1:
                xla0 xla0Var2 = new xla0(cma0Var, yjeVar, (byte) 1);
                xla0Var2.j = obj;
                return xla0Var2;
            default:
                xla0 xla0Var3 = new xla0(cma0Var, yjeVar, (byte) 2);
                xla0Var3.j = obj;
                return xla0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xla0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((xla0) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xla0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        cma0 cma0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = cma0.M;
                cma0Var.G.b((Throwable) obj2, new cz90(cma0Var, (byte) 27));
                break;
            case 1:
                hdm0 hdm0Var = (hdm0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z = hdm0Var instanceof gdm0;
                if (z && !(((gdm0) hdm0Var).b.a() instanceof znm0) && cma0Var.L == null) {
                    cma0Var.L = sac.f0(jiu0.a(cma0Var), 30L, TimeUnit.SECONDS, null, null, new yla0(cma0Var, null, (byte) 0), 44);
                }
                if (z) {
                    boolean z2 = ((gdm0) hdm0Var).b.a() instanceof znm0;
                    nc5 nc5VarS = cma0Var.E.s(cma0Var.o, cma0Var.p, cma0Var.C.a(), 0L);
                    p7m0 p7m0Var = cma0Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, lla0.a((lla0) value, (gdm0) hdm0Var, nc5VarS, null, null, null, 0, null, false, z2, false, false, 3577)));
                }
                break;
            default:
                uaq0 uaq0Var = (uaq0) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                nc5 nc5VarS2 = cma0Var.E.s(cma0Var.o, cma0Var.p, uaq0Var, 0L);
                p7m0 p7m0Var2 = cma0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, lla0.a((lla0) value2, null, nc5VarS2, null, null, null, 0, null, false, false, false, false, 4091)));
                break;
        }
        return Unit.f46060a;
    }
}
