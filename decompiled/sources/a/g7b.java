package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class g7b extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ y7b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g7b(y7b y7bVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = y7bVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        y7b y7bVar = this.k;
        switch (b) {
            case 0:
                g7b g7bVar = new g7b(y7bVar, yjeVar, (byte) 0);
                g7bVar.j = ((Boolean) obj).booleanValue();
                return g7bVar;
            case 1:
                g7b g7bVar2 = new g7b(y7bVar, yjeVar, (byte) 1);
                g7bVar2.j = ((Boolean) obj).booleanValue();
                return g7bVar2;
            default:
                g7b g7bVar3 = new g7b(y7bVar, yjeVar, (byte) 2);
                g7bVar3.j = ((Boolean) obj).booleanValue();
                return g7bVar3;
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
            case 1:
                break;
        }
        return ((g7b) create(bool, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        lun lunVar;
        byte b = this.i;
        y7b y7bVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = y7b.K;
                p7m0 p7m0Var = y7bVar.i.f25029a;
                while (true) {
                    Object value2 = p7m0Var.getValue();
                    value2.getClass();
                    p7m0 p7m0Var2 = p7m0Var;
                    boolean z2 = z;
                    if (!p7m0Var2.m(value2, r6b.a((r6b) value2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, z2, 262143))) {
                        p7m0Var = p7m0Var2;
                        z = z2;
                    }
                    break;
                }
                break;
            case 1:
                boolean z3 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = y7b.K;
                p7m0 p7m0Var3 = y7bVar.i.f25029a;
                do {
                    value = p7m0Var3.getValue();
                    value.getClass();
                    lunVar = lun.f20680a;
                    lunVar.getClass();
                } while (!p7m0Var3.m(value, r6b.a((r6b) value, null, lunVar, null, lunVar, null, null, null, null, null, null, null, null, null, null, false, false, 507889)));
                if (z3) {
                    c4m0 c4m0Var = y7bVar.I;
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                } else {
                    y7bVar.M(((r6b) y7bVar.D()).i);
                }
                break;
            default:
                boolean z4 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i3 = y7b.K;
                p7m0 p7m0Var4 = y7bVar.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var4.getValue();
                    value3.getClass();
                    boolean z5 = z4;
                    if (!p7m0Var4.m(value3, r6b.a((r6b) value3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z5, false, 458751))) {
                        z4 = z5;
                    }
                    break;
                }
                break;
        }
        return Unit.f46060a;
    }
}
