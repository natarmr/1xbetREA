package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class t5m extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ e6m j;
    public final /* synthetic */ pz40 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5m(e6m e6mVar, pz40 pz40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = e6mVar;
        this.k = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pz40 pz40Var = this.k;
        e6m e6mVar = this.j;
        switch (b) {
            case 0:
                return new t5m(e6mVar, pz40Var, yjeVar, (byte) 0);
            default:
                return new t5m(e6mVar, pz40Var, yjeVar, (byte) 1);
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
        return ((t5m) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pz40 pz40Var = this.k;
        e6m e6mVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (e6mVar.b > 0) {
                    pz40Var.setValue(Boolean.TRUE);
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (e6mVar.b > 0) {
                    pz40Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.f46060a;
    }
}
