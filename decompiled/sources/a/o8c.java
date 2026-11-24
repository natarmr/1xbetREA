package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class o8c extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ywq0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o8c(byte b, yje yjeVar, ywq0 ywq0Var) {
        super(2, yjeVar);
        this.i = b;
        this.k = ywq0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                o8c o8cVar = new o8c((byte) 0, yjeVar, this.k);
                o8cVar.j = obj;
                return o8cVar;
            default:
                o8c o8cVar2 = new o8c((byte) 1, yjeVar, this.k);
                o8cVar2.j = obj;
                return o8cVar2;
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
        return ((o8c) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        yje yjeVar = null;
        ywq0 ywq0Var = this.k;
        vne vneVar = (vne) this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return sac.d0(vneVar, "CheckTimeLimitsScenarioNeImpl_getLimits", 300L, 0L, ((mne) ywq0Var.c).b, 300L, kotlin.collections.a.c(oqt0.class), new e6c((byte) 2), new igb(ywq0Var, (yje) null, (byte) 5), 20);
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                return sac.d0(vneVar, "CheckTimeLimitFinSecurityV2ScenarioImpl_sendPing", 30L, 0L, ((mne) ywq0Var.c).b, 30L, kotlin.collections.a.c(oqt0.class), new e6c((byte) 3), new ya(ywq0Var, yjeVar, (byte) 15), 20);
        }
    }
}
