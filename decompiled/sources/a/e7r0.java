package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class e7r0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ g7r0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7r0(g7r0 g7r0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = g7r0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        g7r0 g7r0Var = this.k;
        switch (b) {
            case 0:
                e7r0 e7r0Var = new e7r0(g7r0Var, yjeVar, (byte) 0);
                e7r0Var.j = ((Boolean) obj).booleanValue();
                return e7r0Var;
            default:
                e7r0 e7r0Var2 = new e7r0(g7r0Var, yjeVar, (byte) 1);
                e7r0Var2.j = ((Boolean) obj).booleanValue();
                return e7r0Var2;
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
        return ((e7r0) create(bool, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        g7r0 g7r0Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                g7r0Var.o.e("SAVED_VIDEO_FILTER_KEY", Boolean.valueOf(z));
                p7m0 p7m0Var = g7r0Var.i.f25029a;
                while (true) {
                    Object value2 = p7m0Var.getValue();
                    value2.getClass();
                    p7m0 p7m0Var2 = p7m0Var;
                    w6r0 w6r0Var = (w6r0) value2;
                    boolean z2 = z;
                    if (!p7m0Var2.m(value2, w6r0.a(w6r0Var, z2, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, false, false, 8388605))) {
                        p7m0Var = p7m0Var2;
                        z = z2;
                    }
                    break;
                }
                break;
            default:
                boolean z3 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = g7r0.L;
                p7m0 p7m0Var3 = g7r0Var.i.f25029a;
                do {
                    value = p7m0Var3.getValue();
                    value.getClass();
                } while (!p7m0Var3.m(value, w6r0.a((w6r0) value, false, false, null, null, null, null, null, null, null, null, null, z3, false, null, null, null, false, false, false, 8380415)));
                if (z3) {
                    g7r0Var.M(false);
                }
                break;
        }
        return Unit.f46060a;
    }
}
