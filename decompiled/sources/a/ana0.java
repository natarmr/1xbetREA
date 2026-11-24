package a;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ana0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dna0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ana0(dna0 dna0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dna0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dna0 dna0Var = this.k;
        switch (b) {
            case 0:
                ana0 ana0Var = new ana0(dna0Var, yjeVar, (byte) 0);
                ana0Var.j = obj;
                return ana0Var;
            case 1:
                ana0 ana0Var2 = new ana0(dna0Var, yjeVar, (byte) 1);
                ana0Var2.j = obj;
                return ana0Var2;
            case 2:
                ana0 ana0Var3 = new ana0(dna0Var, yjeVar, (byte) 2);
                ana0Var3.j = obj;
                return ana0Var3;
            default:
                ana0 ana0Var4 = new ana0(dna0Var, yjeVar, (byte) 3);
                ana0Var4.j = obj;
                return ana0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ana0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ana0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ana0) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ana0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        dna0 dna0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                List list = (List) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = dna0.E;
                p7m0 p7m0Var = dna0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, pma0.a((pma0) value, null, null, null, list, 0, false, false, false, 495)));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = dna0.E;
                dna0Var.y.b((Throwable) obj2, new lma0(dna0Var, (byte) 1));
                break;
            case 2:
                hdm0 hdm0Var = (hdm0) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                boolean z = hdm0Var instanceof gdm0;
                if (z && !(((gdm0) hdm0Var).b.a() instanceof znm0) && dna0Var.D == null) {
                    dna0Var.D = sac.f0(jiu0.a(dna0Var), 30L, TimeUnit.SECONDS, null, null, new yma0(dna0Var, null, (byte) 3), 44);
                }
                if (z) {
                    boolean z2 = ((gdm0) hdm0Var).b.a() instanceof znm0;
                    nc5 nc5VarS = dna0Var.v.s(dna0Var.o, dna0Var.p, dna0Var.t.a(), 0L);
                    p7m0 p7m0Var2 = dna0Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, pma0.a((pma0) value2, (gdm0) hdm0Var, nc5VarS, null, null, 0, z2, false, false, 441)));
                }
                break;
            default:
                uaq0 uaq0Var = (uaq0) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                nc5 nc5VarS2 = dna0Var.v.s(dna0Var.o, dna0Var.p, uaq0Var, 0L);
                p7m0 p7m0Var3 = dna0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, pma0.a((pma0) value3, null, nc5VarS2, null, null, 0, false, false, false, 507)));
                break;
        }
        return Unit.f46060a;
    }
}
