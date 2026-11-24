package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class nv80 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ rv80 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv80(rv80 rv80Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        wgh0 wgh0Var = wgh0.MY_AGGREGATOR;
        this.j = rv80Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rv80 rv80Var = this.j;
        switch (b) {
            case 0:
                return new nv80(rv80Var, yjeVar, (byte) 0);
            case 1:
                return new nv80(rv80Var, yjeVar, (byte) 1);
            default:
                wgh0 wgh0Var = wgh0.MY_AGGREGATOR;
                return new nv80(rv80Var, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((nv80) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((nv80) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((nv80) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        rv80 rv80Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = rv80.V;
                p7m0 p7m0Var = rv80Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, yu80.a((yu80) value, false, true, false, false, false, null, null, null, null, 131068)));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = rv80.V;
                rv80Var.G(tu80.f34539a);
                break;
            default:
                wgh0 wgh0Var = wgh0.AGGREGATOR_LIVE;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i3 = rv80.V;
                rv80Var.F.c(new AggregatorScreenModel(null, null, 0L, vl1.f37601a, wgh0Var, 0L, 0L, null, false, Response.REQUEST_TERMINATED));
                wgh0 wgh0Var2 = wgh0.MY_AGGREGATOR;
                rv80Var.E.g(wgh0Var);
                rv80Var.H.C("aggregator_live");
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nv80(rv80 rv80Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = rv80Var;
    }
}
