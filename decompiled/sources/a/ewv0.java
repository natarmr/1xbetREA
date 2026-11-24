package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ewv0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ fwv0 j;
    public final /* synthetic */ jgc k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ewv0(fwv0 fwv0Var, jgc jgcVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = fwv0Var;
        this.k = jgcVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        jgc jgcVar = this.k;
        fwv0 fwv0Var = this.j;
        switch (b) {
            case 0:
                return new ewv0(fwv0Var, jgcVar, yjeVar, (byte) 0);
            default:
                return new ewv0(fwv0Var, jgcVar, yjeVar, (byte) 1);
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
        return ((ewv0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        jgc jgcVar = this.k;
        fwv0 fwv0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                gwv0 gwv0Var = (gwv0) fwv0Var.b.remove(jgcVar);
                if (gwv0Var != null) {
                    gwv0Var.c.compareAndSet(false, true);
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                Object objRemove = fwv0Var.b.remove(jgcVar);
                gwv0 gwv0Var2 = objRemove instanceof gwv0 ? (gwv0) objRemove : null;
                if (gwv0Var2 != null) {
                    if (gwv0Var2.c.compareAndSet(false, true)) {
                        gwv0Var2.b.invoke(igc.f14729a);
                    }
                }
                break;
        }
        return Unit.f46060a;
    }
}
