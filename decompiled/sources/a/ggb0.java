package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ggb0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ kgb0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ggb0(kgb0 kgb0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = kgb0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kgb0 kgb0Var = this.k;
        switch (b) {
            case 0:
                ggb0 ggb0Var = new ggb0(kgb0Var, yjeVar, (byte) 0);
                ggb0Var.j = obj;
                return ggb0Var;
            default:
                ggb0 ggb0Var2 = new ggb0(kgb0Var, yjeVar, (byte) 1);
                ggb0Var2.j = obj;
                return ggb0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ggb0) create((hfe) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ggb0) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        kgb0 kgb0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                hfe hfeVar = (hfe) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = kgb0.k0;
                p7m0 p7m0Var = kgb0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ufb0.a((ufb0) value, null, false, false, null, false, null, null, null, null, hfeVar, null, 3071)));
                break;
            default:
                Pair pair = (Pair) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean zBooleanValue = ((Boolean) pair.f46059a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) pair.b).booleanValue();
                ocj ocjVar = kgb0Var.i;
                if (((ufb0) kgb0Var.D()).c != zBooleanValue2) {
                    kgb0Var.R.y();
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                while (true) {
                    Object value3 = p7m0Var2.getValue();
                    value3.getClass();
                    ocj ocjVar2 = ocjVar;
                    if (!p7m0Var2.m(value3, ufb0.a((ufb0) value3, null, zBooleanValue, zBooleanValue2, null, false, null, null, null, null, null, null, 4089))) {
                        ocjVar = ocjVar2;
                    } else if (zBooleanValue) {
                        kgb0Var.O(false);
                    } else if (!zBooleanValue) {
                        ufb0 ufb0Var = (ufb0) kgb0Var.D();
                        if (!ufb0Var.i.a() || !ufb0Var.j.a() || !ufb0Var.k.a() || !ufb0Var.l.a()) {
                            p7m0 p7m0Var3 = ocjVar2.f25029a;
                            do {
                                value2 = p7m0Var3.getValue();
                                value2.getClass();
                            } while (!p7m0Var3.m(value2, ufb0.a((ufb0) value2, null, false, false, seb0.b, false, null, null, null, null, null, null, 4087)));
                        }
                    }
                    break;
                }
                break;
        }
        return Unit.f46060a;
    }
}
