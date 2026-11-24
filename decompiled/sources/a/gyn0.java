package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class gyn0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ zyn0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gyn0(zyn0 zyn0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = zyn0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zyn0 zyn0Var = this.j;
        switch (b) {
            case 0:
                return new gyn0(zyn0Var, yjeVar, (byte) 0);
            case 1:
                return new gyn0(zyn0Var, yjeVar, (byte) 1);
            default:
                return new gyn0(zyn0Var, yjeVar, (byte) 2);
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
        return ((gyn0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        zyn0 zyn0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = zyn0.u0;
                he heVar = ((sff0) zyn0Var.i0.getValue()).g.i;
                p7m0 p7m0Var = zyn0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, vxn0.a((vxn0) value, null, null, false, false, false, false, false, false, null, null, null, null, heVar, false, false, false, null, 126975)));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                zyn0Var.G(new fxn0(((jsn0) zyn0Var.h0.getValue()).f17062a));
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (((vxn0) zyn0Var.D()).q != null) {
                    zyn0Var.G(gxn0.f12085a);
                }
                break;
        }
        return Unit.f46060a;
    }
}
