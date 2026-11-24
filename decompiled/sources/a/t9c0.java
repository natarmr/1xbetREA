package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class t9c0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ org.xplatform.feature.promo_aggregator.impl.presentation.compose.b j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t9c0(org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = bVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar = this.j;
        switch (b) {
            case 0:
                return new t9c0(bVar, yjeVar, (byte) 0);
            default:
                return new t9c0(bVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((t9c0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((t9c0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = org.xplatform.feature.promo_aggregator.impl.presentation.compose.b.Q;
                org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar = this.j;
                p7m0 p7m0Var = bVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, iac0.a((iac0) value, null, false, null, null, null, null, false, false, false, 8063)));
                if (((iac0) bVar.D()).i) {
                    bVar.O();
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = org.xplatform.feature.promo_aggregator.impl.presentation.compose.b.Q;
                org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar2 = this.j;
                c4m0 c4m0Var = bVar2.K;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    bVar2.K = sac.T(dub.f0(bVar2.A.a(), bVar2.B.a(), ((o0j) bVar2.D.f10686a.c).f, new fl9(bVar2, null, (byte) 11)), jiu0.a(bVar2), new p6b0(2, bVar2, org.xplatform.feature.promo_aggregator.impl.presentation.compose.b.class, "onError", "onError(Ljava/lang/Throwable;)V", 4, (byte) 27));
                }
                break;
        }
        return Unit.f46060a;
    }
}
