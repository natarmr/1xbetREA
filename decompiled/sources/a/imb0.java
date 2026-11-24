package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class imb0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ pmb0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ imb0(pmb0 pmb0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = pmb0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pmb0 pmb0Var = this.j;
        switch (b) {
            case 0:
                return new imb0(pmb0Var, yjeVar, (byte) 0);
            case 1:
                return new imb0(pmb0Var, yjeVar, (byte) 1);
            case 2:
                return new imb0(pmb0Var, yjeVar, (byte) 2);
            default:
                return new imb0(pmb0Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((imb0) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((imb0) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((imb0) create((bb50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((imb0) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        olb0 olb0Var;
        Object value3;
        Object value4;
        Object value5;
        byte b = this.i;
        pmb0 pmb0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                oyg0 oyg0Var = pmb0Var.f;
                long j = ((olb0) pmb0Var.D()).g + 1;
                ocj ocjVar = pmb0Var.i;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    q7x.F(oyg0Var, Long.valueOf(j), "KEY_AUTH_OFFER_TIMER");
                } while (!p7m0Var.m(value, olb0.a((olb0) value, null, null, null, false, false, null, j, 0L, false, null, null, null, 8127)));
                if (((olb0) pmb0Var.D()).g >= ((olb0) pmb0Var.D()).k.k) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        olb0Var = (olb0) value2;
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value2, olb0.a(olb0Var, null, null, null, false, false, null, 0L, 0L, false, c9x.J(olb0Var.j, bdb0.f2391a, true), null, null, 7679)));
                    e3c.n(pmb0Var.u0);
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = pmb0.D0;
                pmb0Var.G(ajb0.f966a);
                ((qp) ((bbw0) pmb0Var.L.f3330a).b).f29092a.n(null);
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = pmb0.D0;
                pmb0Var.G(ijb0.f14866a);
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                Object objD = pmb0Var.D();
                oyg0 oyg0Var2 = pmb0Var.f;
                long j2 = ((olb0) objD).h + 1;
                ocj ocjVar2 = pmb0Var.i;
                p7m0 p7m0Var3 = ocjVar2.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    q7x.F(oyg0Var2, Long.valueOf(j2), "KEY_2FA_ALERT_TIMER");
                } while (!p7m0Var3.m(value3, olb0.a((olb0) value3, null, null, null, false, false, null, 0L, j2, false, null, null, null, 8063)));
                if (((olb0) pmb0Var.D()).h == 2) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    vwb0 vwb0Var = (vwb0) pmb0Var.c0.f2853a.f44650a;
                    vwb0Var.getClass();
                    if (jCurrentTimeMillis - vwb0Var.b().getLong("ALERT_2FA_TIME_SHOWED_KEY", 0L) > 86400000) {
                        pmb0Var.G(zib0.f44432a);
                        p7m0 p7m0Var4 = ocjVar2.f25029a;
                        do {
                            value5 = p7m0Var4.getValue();
                            value5.getClass();
                            q7x.F(oyg0Var2, 0L, "KEY_2FA_ALERT_TIMER");
                        } while (!p7m0Var4.m(value5, olb0.a((olb0) value5, null, null, null, false, false, null, 0L, 0L, false, null, null, null, 8063)));
                        ymi0 ymi0Var = pmb0Var.b0;
                        ((vwb0) ymi0Var.f42890a.f44650a).g("ALERT_2FA_TIME_SHOWED_KEY", System.currentTimeMillis());
                        e3c.n(pmb0Var.v0);
                    }
                }
                if (((olb0) pmb0Var.D()).h > 2) {
                    p7m0 p7m0Var5 = ocjVar2.f25029a;
                    do {
                        value4 = p7m0Var5.getValue();
                        value4.getClass();
                        q7x.F(oyg0Var2, 0L, "KEY_2FA_ALERT_TIMER");
                    } while (!p7m0Var5.m(value4, olb0.a((olb0) value4, null, null, null, false, false, null, 0L, 0L, false, null, null, null, 8063)));
                    e3c.n(pmb0Var.v0);
                }
                break;
        }
        return Unit.f46060a;
    }
}
