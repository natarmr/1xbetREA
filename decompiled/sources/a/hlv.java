package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class hlv extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pwi k;
    public final /* synthetic */ l9s l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hlv(pwi pwiVar, l9s l9sVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = pwiVar;
        this.l = l9sVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        l9s l9sVar = this.l;
        pwi pwiVar = this.k;
        switch (b) {
            case 0:
                hlv hlvVar = new hlv(pwiVar, l9sVar, yjeVar, (byte) 0);
                hlvVar.j = obj;
                return hlvVar;
            default:
                hlv hlvVar2 = new hlv(pwiVar, l9sVar, yjeVar, (byte) 1);
                hlvVar2.j = obj;
                return hlvVar2;
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
        return ((hlv) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        yje yjeVar = null;
        l9s l9sVar = this.l;
        pwi pwiVar = this.k;
        vne vneVar = (vne) this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return sac.V(vneVar, flv.f9757a, null, null, new glv(pwiVar, l9sVar, yjeVar, (byte) 0), 14);
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                return sac.V(vneVar, jlv.f16736a, null, null, new glv(pwiVar, l9sVar, yjeVar, (byte) 1), 14);
        }
    }
}
