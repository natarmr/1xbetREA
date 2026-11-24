package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ud70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xd70 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ud70(xd70 xd70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xd70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xd70 xd70Var = this.k;
        switch (b) {
            case 0:
                ud70 ud70Var = new ud70(xd70Var, yjeVar, (byte) 0);
                ud70Var.j = obj;
                return ud70Var;
            default:
                ud70 ud70Var2 = new ud70(xd70Var, yjeVar, (byte) 1);
                ud70Var2.j = obj;
                return ud70Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ud70) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ud70) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        ajr ajrVar;
        byte b = this.i;
        xd70 xd70Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                xd70Var.G(new sb70(((xb70) xd70Var.D()).c, (String) obj2));
                break;
            default:
                uaq0 uaq0Var = (uaq0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (uaq0Var != ((xb70) xd70Var.D()).f40588a) {
                    p7m0 p7m0Var = xd70Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, xb70.a((xb70) value, uaq0Var, null, null, false, false, false, false, false, null, false, false, 0, false, null, null, null, null, 131070)));
                    ajr.Companion.getClass();
                    uaq0Var.getClass();
                    uaq0.f35345a.getClass();
                    if (s9m0.i(uaq0Var)) {
                        ajrVar = ajr.b;
                    } else {
                        ajrVar = s9m0.j(uaq0Var) ? ajr.c : ajr.d;
                    }
                    lir lirVar = new lir(ajrVar);
                    Object obj3 = xd70Var.j0.get();
                    obj3.getClass();
                    xd70Var.m0(lirVar.a((vby) obj3));
                }
                break;
        }
        return Unit.f46060a;
    }
}
