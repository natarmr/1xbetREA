package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class x51 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ b61 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x51(b61 b61Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = b61Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        b61 b61Var = this.k;
        switch (b) {
            case 0:
                x51 x51Var = new x51(b61Var, yjeVar, (byte) 0);
                x51Var.j = obj;
                return x51Var;
            default:
                x51 x51Var2 = new x51(b61Var, yjeVar, (byte) 1);
                x51Var2.j = obj;
                return x51Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((x51) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((x51) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        b61 b61Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                ql5 ql5Var = (ql5) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                long j = b61Var.w;
                if (j != 0) {
                    long j2 = ql5Var.f28916a;
                    if (j2 != j) {
                        b61Var.w = j2;
                        b61Var.y();
                    }
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (((sw00) obj2).f32897a) {
                    b61Var.u.z();
                }
                break;
        }
        return Unit.f46060a;
    }
}
