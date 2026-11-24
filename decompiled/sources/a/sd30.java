package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class sd30 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zd30 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sd30(zd30 zd30Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = zd30Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zd30 zd30Var = this.k;
        switch (b) {
            case 0:
                sd30 sd30Var = new sd30(zd30Var, yjeVar, (byte) 0);
                sd30Var.j = obj;
                return sd30Var;
            case 1:
                sd30 sd30Var2 = new sd30(zd30Var, yjeVar, (byte) 1);
                sd30Var2.j = obj;
                return sd30Var2;
            case 2:
                sd30 sd30Var3 = new sd30(zd30Var, yjeVar, (byte) 2);
                sd30Var3.j = obj;
                return sd30Var3;
            default:
                sd30 sd30Var4 = new sd30(zd30Var, yjeVar, (byte) 3);
                sd30Var4.j = obj;
                return sd30Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((sd30) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((sd30) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((sd30) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((sd30) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        byte b = this.i;
        zd30 zd30Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                List list = (List) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = zd30.H;
                oyg0 oyg0Var = zd30Var.f;
                ocj ocjVar = zd30Var.i;
                if (list.isEmpty()) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value, hd30.a((hd30) value, null, null, false, false, false, true, iun.f15405a, 0L, 663)));
                } else {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value2, hd30.a((hd30) value2, null, null, false, false, false, false, list, 0L, 663)));
                }
                if (!((hd30) zd30Var.D()).e) {
                    e3c.n(zd30Var.C);
                }
                break;
            case 1:
                List list2 = (List) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = zd30.H;
                oyg0 oyg0Var2 = zd30Var.f;
                ocj ocjVar2 = zd30Var.i;
                if (list2.isEmpty()) {
                    p7m0 p7m0Var3 = ocjVar2.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                        oyg0Var2.getClass();
                    } while (!p7m0Var3.m(value3, hd30.a((hd30) value3, null, null, false, false, false, true, iun.f15405a, 0L, 663)));
                } else {
                    p7m0 p7m0Var4 = ocjVar2.f25029a;
                    do {
                        value4 = p7m0Var4.getValue();
                        value4.getClass();
                        oyg0Var2.getClass();
                    } while (!p7m0Var4.m(value4, hd30.a((hd30) value4, null, null, false, false, false, false, list2, 0L, 663)));
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                zd30Var.s.b((Throwable) obj2, new ei20((byte) 19));
                break;
            default:
                uaq0 uaq0Var = (uaq0) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                nc5 nc5VarS = zd30Var.w.s(zd30Var.q, zd30Var.r, uaq0Var, 0L);
                p7m0 p7m0Var5 = zd30Var.i.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                } while (!p7m0Var5.m(value5, hd30.a((hd30) value5, null, nc5VarS, false, false, false, false, null, 0L, 1019)));
                break;
        }
        return Unit.f46060a;
    }
}
