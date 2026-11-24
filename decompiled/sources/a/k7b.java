package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class k7b extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ y7b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7b(y7b y7bVar, yje yjeVar, byte b) {
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
                k7b k7bVar = new k7b(y7bVar, yjeVar, (byte) 0);
                k7bVar.j = obj;
                return k7bVar;
            case 1:
                k7b k7bVar2 = new k7b(y7bVar, yjeVar, (byte) 1);
                k7bVar2.j = obj;
                return k7bVar2;
            case 2:
                k7b k7bVar3 = new k7b(y7bVar, yjeVar, (byte) 2);
                k7bVar3.j = obj;
                return k7bVar3;
            case 3:
                k7b k7bVar4 = new k7b(y7bVar, yjeVar, (byte) 3);
                k7bVar4.j = obj;
                return k7bVar4;
            case 4:
                k7b k7bVar5 = new k7b(y7bVar, yjeVar, (byte) 4);
                k7bVar5.j = obj;
                return k7bVar5;
            case 5:
                k7b k7bVar6 = new k7b(y7bVar, yjeVar, (byte) 5);
                k7bVar6.j = obj;
                return k7bVar6;
            default:
                k7b k7bVar7 = new k7b(y7bVar, yjeVar, (byte) 6);
                k7bVar7.j = obj;
                return k7bVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((k7b) create((js20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((k7b) create((ycs) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((k7b) create((aw20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((k7b) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((k7b) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((k7b) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((k7b) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        r6b r6bVar;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        byte b = this.i;
        y7b y7bVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                js20 js20Var = (js20) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = y7b.K;
                y7bVar.G(p6b.f26446a);
                p7m0 p7m0Var = y7bVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    r6bVar = (r6b) value;
                } while (!p7m0Var.m(value, r6b.a(r6bVar, null, null, null, null, null, js20Var, r6bVar.f, null, null, null, null, null, null, null, false, false, 524191)));
                bby bbyVar = y7bVar.G;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                y7bVar.G = sac.V(jiu0.a(y7bVar), i7b.f14285a, null, y7bVar.o.f22085a, new fr9(y7bVar, js20Var, null, (byte) 5), 10);
                break;
            case 1:
                ycs ycsVar = (ycs) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = y7b.K;
                p7m0 p7m0Var2 = y7bVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, r6b.a((r6b) value2, null, null, null, null, null, null, null, null, null, null, null, null, ycsVar, null, false, false, 507903)));
                break;
            case 2:
                aw20 aw20Var = (aw20) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i3 = y7b.K;
                p7m0 p7m0Var3 = y7bVar.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, r6b.a((r6b) value3, null, null, null, null, null, null, null, null, null, null, null, aw20Var, null, null, false, false, 520191)));
                break;
            case 3:
                List list = (List) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i4 = y7b.K;
                p7m0 p7m0Var4 = y7bVar.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, r6b.a((r6b) value4, null, null, null, null, null, null, null, list, null, null, null, null, null, null, false, false, 524159)));
                break;
            case 4:
                List list2 = (List) obj2;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                int i5 = y7b.K;
                p7m0 p7m0Var5 = y7bVar.i.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                } while (!p7m0Var5.m(value5, r6b.a((r6b) value5, null, null, null, null, null, null, null, null, null, null, list2, null, null, null, false, false, 523263)));
                break;
            case 5:
                String str = (String) obj2;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                int i6 = y7b.K;
                p7m0 p7m0Var6 = y7bVar.i.f25029a;
                do {
                    value6 = p7m0Var6.getValue();
                    value6.getClass();
                } while (!p7m0Var6.m(value6, r6b.a((r6b) value6, null, null, null, null, null, null, null, null, null, null, null, null, null, str, false, false, 491519)));
                break;
            default:
                List list3 = (List) obj2;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                int i7 = y7b.K;
                p7m0 p7m0Var7 = y7bVar.i.f25029a;
                do {
                    value7 = p7m0Var7.getValue();
                    value7.getClass();
                } while (!p7m0Var7.m(value7, r6b.a((r6b) value7, list3, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 524286)));
                break;
        }
        return Unit.f46060a;
    }
}
