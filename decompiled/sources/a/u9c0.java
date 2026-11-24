package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class u9c0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ org.xplatform.feature.promo_aggregator.impl.presentation.compose.b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9c0(org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = bVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar = this.k;
        switch (b) {
            case 0:
                u9c0 u9c0Var = new u9c0(bVar, yjeVar, (byte) 0);
                u9c0Var.j = obj;
                return u9c0Var;
            default:
                u9c0 u9c0Var2 = new u9c0(bVar, yjeVar, (byte) 1);
                u9c0Var2.j = obj;
                return u9c0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((u9c0) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((u9c0) create((x1j) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object[] objArr = 0;
        switch (this.i) {
            case 0:
                sw00 sw00Var = (sw00) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = org.xplatform.feature.promo_aggregator.impl.presentation.compose.b.Q;
                org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar = this.k;
                ocj ocjVar = bVar.i;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, iac0.a((iac0) value, null, false, null, null, null, null, false, sw00Var.f32897a, false, 7935)));
                if (!sw00Var.b && sw00Var.f32897a) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, iac0.a((iac0) value2, null, false, null, null, null, null, true, false, false, 8063)));
                    bby bbyVar = bVar.J;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    bby bbyVar2 = bVar.P;
                    if (bbyVar2 != null) {
                        bbyVar2.cancel(null);
                    }
                    bVar.P = sac.f0(jiu0.a(bVar), 10L, TimeUnit.SECONDS, bVar.r.b, new l8c0(1, bVar, org.xplatform.feature.promo_aggregator.impl.presentation.compose.b.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 7), new t9c0(bVar, objArr == true ? 1 : 0, (byte) 0), 32);
                }
                break;
            default:
                x1j x1jVar = (x1j) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                v1j v1jVar = x1jVar instanceof v1j ? (v1j) x1jVar : null;
                if (v1jVar != null && v1jVar.f36633a) {
                    int i2 = org.xplatform.feature.promo_aggregator.impl.presentation.compose.b.Q;
                    org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar2 = this.k;
                    bVar2.G(dac0.f5740a);
                    usd usdVar = a4j.c;
                    String str = ((iac0) bVar2.D()).g;
                    usdVar.getClass();
                    String strA = usd.a(str);
                    bVar2.y.k(strA);
                    bVar2.z.k(strA);
                }
                break;
        }
        return Unit.f46060a;
    }
}
