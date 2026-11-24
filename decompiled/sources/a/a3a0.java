package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class a3a0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ b3a0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3a0(b3a0 b3a0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = b3a0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        b3a0 b3a0Var = this.k;
        switch (b) {
            case 0:
                a3a0 a3a0Var = new a3a0(b3a0Var, yjeVar, (byte) 0);
                a3a0Var.j = ((Boolean) obj).booleanValue();
                return a3a0Var;
            default:
                a3a0 a3a0Var2 = new a3a0(b3a0Var, yjeVar, (byte) 1);
                a3a0Var2.j = ((Boolean) obj).booleanValue();
                return a3a0Var2;
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
        return ((a3a0) create(bool, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        b3a0 b3a0Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z) {
                    int i = b3a0.x;
                    b3a0Var.M();
                } else {
                    c4m0 c4m0Var = b3a0Var.v;
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                }
                break;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = b3a0.x;
                p7m0 p7m0Var = b3a0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, p2a0.a((p2a0) value, z2, null, null, false, 61)));
                break;
        }
        return Unit.f46060a;
    }
}
