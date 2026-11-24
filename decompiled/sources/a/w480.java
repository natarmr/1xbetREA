package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class w480 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ k3t0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w480(k3t0 k3t0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = k3t0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new w480(this.j, yjeVar, (byte) 0);
            case 1:
                return new w480(this.j, yjeVar, (byte) 1);
            case 2:
                return new w480(this.j, yjeVar, (byte) 2);
            case 3:
                return new w480(this.j, yjeVar, (byte) 3);
            default:
                return new w480(this.j, yjeVar, (byte) 4);
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
            case 3:
                break;
        }
        return ((w480) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        k3t0 k3t0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                k3t0Var.x(t380.f33254a);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                k3t0Var.x(ndb0.f23332a);
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                k3t0Var.x(sdf0.f32033a);
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                k3t0Var.x(ixq0.f15556a);
                break;
            default:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                k3t0Var.x(apr0.f1267a);
                break;
        }
        return Unit.f46060a;
    }
}
