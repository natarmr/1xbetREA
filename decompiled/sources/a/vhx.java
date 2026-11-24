package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.sportgame.markets.base.api.navigation.MarketsParams;

/* JADX INFO: loaded from: classes6.dex */
public final class vhx extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ dix j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhx(dix dixVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = dixVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new vhx(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vhx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            dix dixVar = this.j;
            aqp aqpVar = dixVar.p;
            MarketsParams.InsightsSubGame insightsSubGame = dixVar.s;
            long j = insightsSubGame.f47007a;
            long j2 = insightsSubGame.b;
            this.i = true;
            if (aqpVar.a(j, j2, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
