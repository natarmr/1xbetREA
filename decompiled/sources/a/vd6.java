package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vd6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ wd6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vd6(wd6 wd6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wd6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wd6 wd6Var = this.k;
        switch (b) {
            case 0:
                vd6 vd6Var = new vd6(wd6Var, yjeVar, (byte) 0);
                vd6Var.j = ((Boolean) obj).booleanValue();
                return vd6Var;
            default:
                vd6 vd6Var2 = new vd6(wd6Var, yjeVar, (byte) 1);
                vd6Var2.j = ((Boolean) obj).booleanValue();
                return vd6Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.i;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        yje yjeVar = (yje) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((vd6) create(bool, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        wd6 wd6Var = this.k;
        boolean z = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                wd6Var.V0().b.b.g(z);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                pe6 pe6Var = wd6Var.n2;
                if (pe6Var != null) {
                    pe6Var.f = z;
                }
                break;
        }
        return Unit.f46060a;
    }
}
