package a;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class eir0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ fir0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eir0(fir0 fir0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = fir0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        fir0 fir0Var = this.k;
        switch (b) {
            case 0:
                eir0 eir0Var = new eir0(fir0Var, yjeVar, (byte) 0);
                eir0Var.j = obj;
                return eir0Var;
            case 1:
                eir0 eir0Var2 = new eir0(fir0Var, yjeVar, (byte) 1);
                eir0Var2.j = obj;
                return eir0Var2;
            default:
                eir0 eir0Var3 = new eir0(fir0Var, yjeVar, (byte) 2);
                eir0Var3.j = obj;
                return eir0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((eir0) create((Map) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((eir0) create((okr0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((eir0) create((lmr0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        gmq vsg0Var;
        Object value2;
        Object value3;
        byte b = this.i;
        fir0 fir0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                Map map = (Map) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = fir0.X;
                p7m0 p7m0Var = fir0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, yhr0.a((yhr0) value, null, null, map, false, false, 0L, 0L, null, 507)));
                break;
            case 1:
                okr0 okr0Var = (okr0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                c4m0 c4m0Var = fir0Var.W;
                yje yjeVar = null;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                long j = fir0Var.y.f3201a.m().d;
                int i2 = 3;
                if (j == 0) {
                    vsg0Var = dun.f6704a;
                } else {
                    vsg0Var = new vsg0(new wmq((Object) bkb.h0(1L, TimeUnit.SECONDS, new c4v(j, null)), (Object) new yau(i2, yjeVar), yjeVar, (byte) 1));
                }
                fir0Var.W = i3t0.L(fir0Var, new fnq(vsg0Var, new b6o0((Object) fir0Var, yjeVar, (byte) 2), (byte) 4), null, null, 3);
                p7m0 p7m0Var2 = fir0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    okr0Var.getClass();
                } while (!p7m0Var2.m(value2, yhr0.a((yhr0) value2, new hhr0(okr0Var), null, null, false, false, 0L, 0L, null, 510)));
                break;
            default:
                lmr0 lmr0Var = (lmr0) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                s9m0 s9m0Var = uaq0.f35345a;
                uaq0 uaq0VarA = fir0Var.O.a();
                s9m0Var.getClass();
                boolean zK = s9m0.k(uaq0VarA);
                p7m0 p7m0Var3 = fir0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, yhr0.a((yhr0) value3, null, lmr0Var, null, false, false, 0L, 0L, p7x.z(zK, hfm0.F(lmr0Var.c)), 253)));
                break;
        }
        return Unit.f46060a;
    }
}
