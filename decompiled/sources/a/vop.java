package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class vop extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ fpp k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vop(fpp fppVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = fppVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        fpp fppVar = this.k;
        switch (b) {
            case 0:
                vop vopVar = new vop(fppVar, yjeVar, (byte) 0);
                vopVar.j = obj;
                return vopVar;
            case 1:
                vop vopVar2 = new vop(fppVar, yjeVar, (byte) 1);
                vopVar2.j = obj;
                return vopVar2;
            default:
                vop vopVar3 = new vop(fppVar, yjeVar, (byte) 2);
                vopVar3.j = obj;
                return vopVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((vop) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((vop) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((vop) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.i;
        fpp fppVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                List list = (List) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = fpp.P;
                fppVar.M(list);
                p7m0 p7m0Var = fppVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ngl0.a((ngl0) value, null, list, null, null, null, false, false, false, false, 6461)));
                break;
            case 1:
                List list2 = (List) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = fpp.P;
                p7m0 p7m0Var2 = fppVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, ngl0.a((ngl0) value2, list2, null, null, null, null, false, false, false, false, 8190)));
                break;
            default:
                String str = (String) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                oyg0 oyg0Var = fppVar.f;
                int i3 = fpp.P;
                String str2 = ((ngl0) fppVar.D()).c;
                ocj ocjVar = fppVar.i;
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value3, ngl0.a((ngl0) value3, null, null, str, null, null, false, false, false, false, 8187)));
                if (str2.length() > 0 && str.length() == 0) {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var4.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var4.m(value4, ngl0.a((ngl0) value4, null, null, null, null, null, false, true, false, false, 7935)));
                }
                break;
        }
        return Unit.f46060a;
    }
}
