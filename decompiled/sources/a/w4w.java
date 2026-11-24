package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class w4w extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ z4w j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w4w(z4w z4wVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = z4wVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        z4w z4wVar = this.j;
        switch (b) {
            case 0:
                return new w4w(z4wVar, yjeVar, (byte) 0);
            default:
                return new w4w(z4wVar, yjeVar, (byte) 1);
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
        return ((w4w) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        z4w z4wVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                z4wVar.C(false);
                z4wVar.u.f(g4w.f10688a);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ouu ouuVar = z4wVar.l;
                ((qe50) ouuVar.b).a(new xa50(), false);
                break;
        }
        return Unit.f46060a;
    }
}
