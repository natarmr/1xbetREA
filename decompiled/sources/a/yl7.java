package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yl7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ fm7 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yl7(fm7 fm7Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = fm7Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        fm7 fm7Var = this.k;
        switch (b) {
            case 0:
                yl7 yl7Var = new yl7(fm7Var, yjeVar, (byte) 0);
                yl7Var.j = obj;
                return yl7Var;
            case 1:
                yl7 yl7Var2 = new yl7(fm7Var, yjeVar, (byte) 1);
                yl7Var2.j = obj;
                return yl7Var2;
            default:
                yl7 yl7Var3 = new yl7(fm7Var, yjeVar, (byte) 2);
                yl7Var3.j = obj;
                return yl7Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((yl7) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((yl7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((yl7) create((qkt0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        Object[] objArr = 0;
        fm7 fm7Var = this.k;
        switch (b) {
            case 0:
                ocj ocjVar = fm7Var.i;
                ql5 ql5Var = (ql5) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (!ql5Var.i.a()) {
                    ql5 ql5Var2 = ((jk7) fm7Var.D()).f;
                    if (ql5Var2 == null || ql5Var.f28916a != ql5Var2.f28916a) {
                        p7m0 p7m0Var = ocjVar.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                        } while (!p7m0Var.m(value, jk7.a((jk7) value, true, false, 0L, false, ql5Var, false, false, null, null, false, null, false, false, null, null, true, null, false, null, false, 33030110)));
                        e3c.n(fm7Var.l0);
                        fm7Var.O();
                    } else {
                        double d = ql5Var.b;
                        ql5 ql5Var3 = ((jk7) fm7Var.D()).f;
                        if (!Intrinsics.a(d, ql5Var3 != null ? new Double(ql5Var3.b) : null)) {
                            p7m0 p7m0Var2 = ocjVar.f25029a;
                            do {
                                value2 = p7m0Var2.getValue();
                                value2.getClass();
                            } while (!p7m0Var2.m(value2, jk7.a((jk7) value2, false, false, 0L, false, ql5Var, false, false, null, null, false, null, false, false, null, null, false, null, false, null, false, 33554399)));
                        }
                    }
                }
                break;
            case 1:
                vne vneVar = (vne) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                sac.T(new fnq(fm7Var.y.a(bm5.c), new yl7(fm7Var, objArr == true ? 1 : 0, (byte) 0), (byte) 4), vneVar, foe.h);
                break;
            default:
                qkt0 qkt0Var = (qkt0) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i = fm7.p0;
                String str = qkt0Var.f28903a;
                if (str != null) {
                    fm7Var.Z(str, true);
                } else {
                    bby bbyVar = fm7Var.m0;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    fm7Var.U();
                }
                break;
        }
        return Unit.f46060a;
    }
}
