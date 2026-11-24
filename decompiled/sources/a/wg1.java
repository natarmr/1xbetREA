package a;

import android.javax.sip.message.Response;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class wg1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ mh1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg1(mh1 mh1Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = mh1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        mh1 mh1Var = this.j;
        switch (b) {
            case 0:
                return new wg1(mh1Var, yjeVar, (byte) 0);
            case 1:
                return new wg1(mh1Var, yjeVar, (byte) 1);
            case 2:
                return new wg1(mh1Var, yjeVar, (byte) 2);
            case 3:
                return new wg1(mh1Var, yjeVar, (byte) 3);
            default:
                return new wg1(mh1Var, yjeVar, (byte) 4);
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
            case 2:
                break;
            case 3:
                break;
        }
        return ((wg1) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        mh1 mh1Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                i8i.D("screen", "aggregator_promo", mh1Var.A.f37210a, "tournaments_open");
                b1j.v("aggregator_promo", mh1Var.G.f44833a, 3329L);
                mh1Var.C.c(new AggregatorScreenModel(null, null, 0L, new sm1(0L), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                String str = mh1.E0;
                mh1Var.G(jf1.f16402a);
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                String str2 = mh1.E0;
                s91 s91Var = mh1Var.C;
                wgh0 wgh0Var = wgh0.AGGREGATOR_PROMO;
                s91Var.c(new AggregatorScreenModel(null, null, 0L, vl1.f37601a, wgh0Var, 0L, 0L, null, false, Response.REQUEST_TERMINATED));
                mh1Var.c0.g(wgh0Var);
                mh1Var.d0.C("aggregator_promo");
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (mh1Var.z.r(fk60.AGGREGATOR_PROMO)) {
                    mh1Var.G(hf1.f12951a);
                }
                mh1Var.w.i(false);
                break;
            default:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                mh1Var.G(new mf1(mh1Var.N.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0))));
                break;
        }
        return Unit.f46060a;
    }
}
