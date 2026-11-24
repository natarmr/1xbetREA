package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class cgb0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ kgb0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cgb0(kgb0 kgb0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = kgb0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kgb0 kgb0Var = this.j;
        switch (b) {
            case 0:
                return new cgb0(kgb0Var, yjeVar, (byte) 0);
            default:
                return new cgb0(kgb0Var, yjeVar, (byte) 1);
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
        return ((cgb0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        kgb0 kgb0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (((ufb0) kgb0Var.D()).d == seb0.d) {
                    kgb0Var.r.q(new bb50(false), true);
                } else {
                    kgb0Var.O(true);
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                Object obj2 = kgb0Var.H.f2175a;
                List listG = tqt.g();
                p7m0 p7m0Var = kgb0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ufb0.a((ufb0) value, null, false, false, null, false, null, listG, null, null, null, null, 4031)));
                break;
        }
        return Unit.f46060a;
    }
}
