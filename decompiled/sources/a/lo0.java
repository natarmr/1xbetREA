package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class lo0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ qo0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lo0(qo0 qo0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = qo0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qo0 qo0Var = this.j;
        switch (b) {
            case 0:
                return new lo0(qo0Var, yjeVar, (byte) 0);
            default:
                return new lo0(qo0Var, yjeVar, (byte) 1);
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
        return ((lo0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        qo0 qo0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = qo0.V;
                qo0Var.G(hn0.f13328a);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                s91 s91Var = qo0Var.F;
                wgh0 wgh0Var = wgh0.FAVORITES;
                s91Var.c(new AggregatorScreenModel(null, null, 0L, vl1.f37601a, wgh0Var, 0L, 0L, null, false, Response.REQUEST_TERMINATED));
                qo0Var.D.g(wgh0Var);
                qo0Var.E.C("favor_aggregator");
                break;
        }
        return Unit.f46060a;
    }
}
