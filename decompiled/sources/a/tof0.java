package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class tof0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ vof0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tof0(vof0 vof0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = vof0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        vof0 vof0Var = this.k;
        switch (b) {
            case 0:
                tof0 tof0Var = new tof0(vof0Var, yjeVar, (byte) 0);
                tof0Var.j = ((Boolean) obj).booleanValue();
                return tof0Var;
            default:
                tof0 tof0Var2 = new tof0(vof0Var, yjeVar, (byte) 1);
                tof0Var2.j = ((Boolean) obj).booleanValue();
                return tof0Var2;
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
        return ((tof0) create(bool, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        vof0 vof0Var = this.k;
        boolean z = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                iiy[] iiyVarArr = vof0.O1;
                vof0Var.H0().e.setClickable(z);
                vof0Var.H0().c.setClickable(z);
                vof0Var.H0().b.setClickable(z);
                vof0Var.H0().b.setEnabled(z);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                iiy[] iiyVarArr2 = vof0.O1;
                vof0Var.H0().c.d = z;
                vof0Var.H0().e.e = z;
                break;
        }
        return Unit.f46060a;
    }
}
