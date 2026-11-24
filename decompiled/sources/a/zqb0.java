package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class zqb0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ crb0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zqb0(crb0 crb0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = crb0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        crb0 crb0Var = this.k;
        switch (b) {
            case 0:
                zqb0 zqb0Var = new zqb0(crb0Var, yjeVar, (byte) 0);
                zqb0Var.j = ((Boolean) obj).booleanValue();
                return zqb0Var;
            default:
                zqb0 zqb0Var2 = new zqb0(crb0Var, yjeVar, (byte) 1);
                zqb0Var2.j = ((Boolean) obj).booleanValue();
                return zqb0Var2;
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
        return ((zqb0) create(bool, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        crb0 crb0Var = this.k;
        boolean z = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                jh70 jh70Var = crb0.S1;
                crb0Var.G0().b.setEnabled(z);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                jh70 jh70Var2 = crb0.S1;
                if (z) {
                    gnm0.s(crb0Var.F());
                } else {
                    gnm0.i(crb0Var.F());
                }
                break;
        }
        return Unit.f46060a;
    }
}
