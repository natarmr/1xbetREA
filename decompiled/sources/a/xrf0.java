package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.resident.presentation.views.ResidentSmokeView;

/* JADX INFO: loaded from: classes5.dex */
public final class xrf0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public final /* synthetic */ long k;
    public final /* synthetic */ ResidentSmokeView l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrf0(long j, ResidentSmokeView residentSmokeView, yje yjeVar) {
        super(2, yjeVar);
        this.k = j;
        this.l = residentSmokeView;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ResidentSmokeView residentSmokeView = this.l;
        long j = this.k;
        switch (b) {
            case 0:
                return new xrf0(residentSmokeView, j, yjeVar);
            default:
                return new xrf0(j, residentSmokeView, yjeVar);
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
        return ((xrf0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ResidentSmokeView residentSmokeView = this.l;
        long j = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    residentSmokeView.e.invoke();
                    this.j = true;
                    if (qcc.O(j, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                residentSmokeView.setVisibility(8);
                residentSmokeView.d.invoke();
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(j, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                residentSmokeView.c.invoke();
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrf0(ResidentSmokeView residentSmokeView, long j, yje yjeVar) {
        super(2, yjeVar);
        this.l = residentSmokeView;
        this.k = j;
    }
}
