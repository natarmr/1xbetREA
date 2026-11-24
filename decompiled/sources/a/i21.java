package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class i21 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ n21 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i21(n21 n21Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = n21Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        n21 n21Var = this.j;
        switch (b) {
            case 0:
                return new i21(n21Var, yjeVar, (byte) 0);
            case 1:
                return new i21(n21Var, yjeVar, (byte) 1);
            default:
                return new i21(n21Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((i21) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                n21 n21Var = this.j;
                i3t0.A(n21Var, n21Var.B, new cb0(n21.a0, "aggregator_gifts"), null, null, 6);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                n21 n21Var2 = this.j;
                n21Var2.A.f40143a.a(xun.f41520a, 3294L);
                n21Var2.v.f42966a.c("promo_games_rules_call");
                n21Var2.w.c(new AggregatorScreenModel(null, null, 0L, new mm1(), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                n21 n21Var3 = this.j;
                i3t0.A(n21Var3, n21Var3.B, new db0(n21.a0, k7k.AggregatorGifts, n21Var3.H.g()), n21Var3.o.b, null, 4);
                break;
        }
        return Unit.f46060a;
    }
}
