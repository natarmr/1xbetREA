package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class vz80 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ xz80 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vz80(xz80 xz80Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xz80Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xz80 xz80Var = this.k;
        switch (b) {
            case 0:
                vz80 vz80Var = new vz80(xz80Var, yjeVar, (byte) 0);
                vz80Var.j = ((Boolean) obj).booleanValue();
                return vz80Var;
            default:
                vz80 vz80Var2 = new vz80(xz80Var, yjeVar, (byte) 1);
                vz80Var2.j = ((Boolean) obj).booleanValue();
                return vz80Var2;
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
        return ((vz80) create(bool, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        xz80 xz80Var = this.k;
        boolean z = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                xi70 xi70Var = xz80.U1;
                xz80Var.G0().c.setFirstButtonEnabled(z);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                xi70 xi70Var2 = xz80.U1;
                xz80Var.G0().e.setVisibility(z ? 0 : 8);
                break;
        }
        return Unit.f46060a;
    }
}
