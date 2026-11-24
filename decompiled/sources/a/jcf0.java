package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class jcf0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ocf0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jcf0(ocf0 ocf0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ocf0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ocf0 ocf0Var = this.k;
        switch (b) {
            case 0:
                jcf0 jcf0Var = new jcf0(ocf0Var, yjeVar, (byte) 0);
                jcf0Var.j = obj;
                return jcf0Var;
            default:
                jcf0 jcf0Var2 = new jcf0(ocf0Var, yjeVar, (byte) 1);
                jcf0Var2.j = obj;
                return jcf0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((jcf0) create((q7f0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((jcf0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        yje yjeVar = null;
        ocf0 ocf0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                q7f0 q7f0Var = (q7f0) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                j910 j910Var = ocf0Var.y0;
                j910Var.getClass();
                q7f0Var.getClass();
                ((pbf0) j910Var.c).invoke(new xwe0(q7f0Var, j910Var, (byte) 27));
                p7m0 p7m0Var = ocf0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    ocf0Var.f.getClass();
                } while (!p7m0Var.m(value, mbf0.a((mbf0) value, false, true, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073741821)));
                sac.V(jiu0.a(ocf0Var), new pbf0(ocf0Var, (byte) 1), new tie0(ocf0Var, (byte) 14), ocf0Var.Z.f22085a, new zye0(ocf0Var, q7f0Var, yjeVar, (byte) 8), 8);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                slb.U(new fnq(i120.W(new i89(ocf0Var.x0, (byte) 22)), new jcf0(ocf0Var, yjeVar, (byte) 0), (byte) 4), (vne) obj2);
                break;
        }
        return Unit.f46060a;
    }
}
