package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ny70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ gz70 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ny70(byte b, yje yjeVar, gz70 gz70Var) {
        super(2, yjeVar);
        this.i = b;
        this.k = gz70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                ny70 ny70Var = new ny70((byte) 0, yjeVar, this.k);
                ny70Var.j = obj;
                return ny70Var;
            default:
                ny70 ny70Var2 = new ny70((byte) 1, yjeVar, this.k);
                ny70Var2.j = obj;
                return ny70Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ny70) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ny70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        gz70 gz70Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                th.printStackTrace();
                if (!(th instanceof dy70)) {
                    gz70Var.A.b(th);
                }
                break;
            default:
                vne vneVar = (vne) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                sac.i0(vneVar, "InitWSConnectionScenario", 0, 0L, q3d.j(zhi0.class, j7t0.class, dxb.class, wae.class), null, new iy70((byte) 1, null, gz70Var), null, null, null, null, 982);
                break;
        }
        return Unit.f46060a;
    }
}
