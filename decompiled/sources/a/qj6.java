package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class qj6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dk6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qj6(dk6 dk6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dk6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dk6 dk6Var = this.k;
        switch (b) {
            case 0:
                qj6 qj6Var = new qj6(dk6Var, yjeVar, (byte) 0);
                qj6Var.j = obj;
                return qj6Var;
            case 1:
                qj6 qj6Var2 = new qj6(dk6Var, yjeVar, (byte) 1);
                qj6Var2.j = obj;
                return qj6Var2;
            case 2:
                qj6 qj6Var3 = new qj6(dk6Var, yjeVar, (byte) 2);
                qj6Var3.j = obj;
                return qj6Var3;
            case 3:
                qj6 qj6Var4 = new qj6(dk6Var, yjeVar, (byte) 3);
                qj6Var4.j = obj;
                return qj6Var4;
            default:
                qj6 qj6Var5 = new qj6(dk6Var, yjeVar, (byte) 4);
                qj6Var5.j = obj;
                return qj6Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qj6) create((ji6) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((qj6) create((l9s) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((qj6) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((qj6) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((qj6) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
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
        dk6 dk6Var = this.k;
        switch (b) {
            case 0:
                ikt0 ikt0Var = dk6Var.x;
                ji6 ji6Var = (ji6) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if ((ji6Var instanceof hi6) || (ji6Var instanceof gi6)) {
                    ikt0Var.b(ox7.f25998a);
                } else {
                    dk6Var.w.g(idf0.f14583a);
                    ikt0Var.b(lx7.f20801a);
                }
                int i = dk6.K;
                p7m0 p7m0Var = dk6Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, hj6.a((hj6) value, false, ji6Var, null, null, null, null, false, null, 8189)));
                break;
            case 1:
                l9s l9sVar = (l9s) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = dk6.K;
                p7m0 p7m0Var2 = dk6Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, hj6.a((hj6) value2, false, null, l9sVar, null, null, null, false, null, 8187)));
                break;
            case 2:
                List list = (List) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i3 = dk6.K;
                p7m0 p7m0Var3 = dk6Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, hj6.a((hj6) value3, false, null, null, list, null, null, false, null, 8183)));
                break;
            case 3:
                String str = (String) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i4 = dk6.K;
                p7m0 p7m0Var4 = dk6Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, hj6.a((hj6) value4, false, null, null, null, null, str, false, null, 8159)));
                break;
            default:
                List list2 = (List) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                int i5 = dk6.K;
                p7m0 p7m0Var5 = dk6Var.i.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                } while (!p7m0Var5.m(value5, hj6.a((hj6) value5, false, null, null, null, null, null, false, list2, 7679)));
                break;
        }
        return Unit.f46060a;
    }
}
