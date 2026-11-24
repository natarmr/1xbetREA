package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class czb extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ nhf0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ czb(nhf0 nhf0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = nhf0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        nhf0 nhf0Var = this.j;
        switch (b) {
            case 0:
                return new czb(nhf0Var, yjeVar, (byte) 0);
            case 1:
                return new czb(nhf0Var, yjeVar, (byte) 1);
            default:
                return new czb(nhf0Var, yjeVar, (byte) 2);
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
        }
        return ((czb) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        nhf0 nhf0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                q7d0 q7d0Var = (q7d0) nhf0Var.f23530a;
                q7d0Var.getClass();
                return Boolean.valueOf(q7d0Var.a().getBoolean("ALLOW_COUNTRY", true));
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                q7d0 q7d0Var2 = (q7d0) nhf0Var.f23530a;
                q7d0Var2.getClass();
                boolean z = q7d0Var2.a().getBoolean("ALLOW_COUNTRY", true);
                q7d0Var2.getClass();
                return new bzb(z, q7d0Var2.a().getBoolean("PARTNER_BLOCK", true));
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                q7d0 q7d0Var3 = (q7d0) nhf0Var.f23530a;
                q7d0Var3.getClass();
                boolean zContains = q7d0Var3.a().contains("ALLOW_COUNTRY");
                q7d0Var3.getClass();
                return Boolean.valueOf(zContains && q7d0Var3.a().contains("PARTNER_BLOCK"));
        }
    }
}
