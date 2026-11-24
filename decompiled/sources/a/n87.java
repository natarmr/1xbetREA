package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class n87 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ f97 j;
    public final /* synthetic */ am80 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n87(f97 f97Var, am80 am80Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = f97Var;
        this.k = am80Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        am80 am80Var = this.k;
        f97 f97Var = this.j;
        switch (b) {
            case 0:
                return new n87(f97Var, am80Var, yjeVar, (byte) 0);
            default:
                return new n87(f97Var, am80Var, yjeVar, (byte) 1);
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
        return ((n87) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        am80 am80Var = this.k;
        f97 f97Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                List list = ((ul80) am80Var).f35860a;
                int i = f97.R0;
                return f97Var.Y(list);
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                List list2 = ((ul80) am80Var).f35860a;
                int i2 = f97.R0;
                return f97Var.Z(list2);
        }
    }
}
