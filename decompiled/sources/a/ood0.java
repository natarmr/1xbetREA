package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ood0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ tod0 j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ood0(tod0 tod0Var, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = tod0Var;
        this.k = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        String str = this.k;
        tod0 tod0Var = this.j;
        switch (b) {
            case 0:
                return new ood0(tod0Var, str, yjeVar, (byte) 0);
            case 1:
                return new ood0(tod0Var, str, yjeVar, (byte) 1);
            case 2:
                return new ood0(tod0Var, str, yjeVar, (byte) 2);
            default:
                return new ood0(tod0Var, str, yjeVar, (byte) 3);
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
        }
        return ((ood0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        String str = this.k;
        tod0 tod0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                tod0Var.n.f(new hod0(str));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                tod0Var.n.f(new hod0(str));
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                bby bbyVar = tod0Var.o;
                if (bbyVar != null) {
                    v3c.N(bbyVar);
                }
                tod0Var.n.f(new hod0(str));
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                tod0Var.n.f(new hod0(str));
                break;
        }
        return Unit.f46060a;
    }
}
