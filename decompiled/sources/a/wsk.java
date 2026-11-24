package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class wsk extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ atk k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wsk(atk atkVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = atkVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        atk atkVar = this.k;
        switch (b) {
            case 0:
                wsk wskVar = new wsk(atkVar, yjeVar, (byte) 0);
                wskVar.j = ((j0g0) obj).f15681a;
                return wskVar;
            case 1:
                wsk wskVar2 = new wsk(atkVar, yjeVar, (byte) 1);
                wskVar2.j = ((j0g0) obj).f15681a;
                return wskVar2;
            default:
                wsk wskVar3 = new wsk(atkVar, yjeVar, (byte) 2);
                wskVar3.j = obj;
                return wskVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                j0g0 j0g0Var = (j0g0) obj;
                Object obj3 = j0g0Var.f15681a;
                return ((wsk) create(j0g0Var, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                j0g0 j0g0Var2 = (j0g0) obj;
                Object obj4 = j0g0Var2.f15681a;
                return ((wsk) create(j0g0Var2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wsk) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        atk atkVar = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                Object obj2 = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = atk.J;
                p7m0 p7m0Var = atkVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ksk.a((ksk) value, null, new j0g0(obj2), null, Response.SERVICE_UNAVAILABLE)));
                break;
            case 1:
                Object obj3 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = atk.J;
                p7m0 p7m0Var2 = atkVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, ksk.a((ksk) value2, new j0g0(obj3), null, null, 507)));
                break;
            default:
                vne vneVar = (vne) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                qjj.W(vneVar, null, null, new ysk(atkVar, yjeVar, (byte) 0), 3);
                qjj.W(vneVar, null, null, new ysk(atkVar, yjeVar, (byte) 1), 3);
                break;
        }
        return Unit.f46060a;
    }
}
