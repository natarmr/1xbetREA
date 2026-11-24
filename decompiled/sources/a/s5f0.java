package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class s5f0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ x5f0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s5f0(x5f0 x5f0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = x5f0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        x5f0 x5f0Var = this.k;
        switch (b) {
            case 0:
                s5f0 s5f0Var = new s5f0(x5f0Var, yjeVar, (byte) 0);
                s5f0Var.j = obj;
                return s5f0Var;
            default:
                s5f0 s5f0Var2 = new s5f0(x5f0Var, yjeVar, (byte) 1);
                s5f0Var2.j = obj;
                return s5f0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((s5f0) create((q7f0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((s5f0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        byte b2 = 4;
        byte b3 = 0;
        yje yjeVar = null;
        x5f0 x5f0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                q7f0 q7f0Var = (q7f0) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                g090 g090Var = x5f0Var.y0;
                g090Var.getClass();
                q7f0Var.getClass();
                ((y4f0) g090Var.b).invoke(new xwe0(q7f0Var, g090Var, (byte) 14));
                p7m0 p7m0Var = x5f0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    x5f0Var.f.getClass();
                } while (!p7m0Var.m(value, u4f0.a((u4f0) value, false, true, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, 1073741821)));
                sac.V(jiu0.a(x5f0Var), new y4f0(x5f0Var, b3), new tie0(x5f0Var, (byte) 13), x5f0Var.Z.f22085a, new zye0(x5f0Var, q7f0Var, yjeVar, b2), 8);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                slb.U(new fnq(i120.W(new i89(x5f0Var.x0, (byte) 22)), new s5f0(x5f0Var, yjeVar, b3), (byte) 4), (vne) obj2);
                break;
        }
        return Unit.f46060a;
    }
}
